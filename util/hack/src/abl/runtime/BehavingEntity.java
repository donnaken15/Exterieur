/*      */ package abl.runtime;
/*      */ 
/*      */ import java.io.PrintStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.HashSet;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedList;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.Vector;
/*      */ import wm.WME;
/*      */ import wm.WorkingMemory;
/*      */ 
/*      */ public abstract class BehavingEntity implements abl.compiler.AblDebuggerConstants
/*      */ {
/*      */   protected class BehaviorLibrary
/*      */   {
/*      */     Hashtable behaviorNames;
/*      */     Hashtable behaviors;
/*      */     
/*      */     public BehaviorLibrary(int paramInt)
/*      */     {
/*   27 */       this.behaviors = new Hashtable(paramInt);
/*      */     }
/*      */     
/*      */     public synchronized void registerBehavior(__BehaviorDesc param__BehaviorDesc) {
/*   31 */       Object localObject = (List)this.behaviors.get(param__BehaviorDesc.signature);
/*      */       
/*   33 */       if (localObject == null)
/*      */       {
/*      */ 
/*      */ 
/*   37 */         localObject = new Vector();
/*   38 */         ((List)localObject).add(param__BehaviorDesc);
/*   39 */         if (BehavingEntity.this.debugLevel == 2) {
/*   40 */           param__BehaviorDesc.uniqueName = (param__BehaviorDesc.signature.substring(0, param__BehaviorDesc.signature.indexOf('(')) + "_1");
/*      */         }
/*      */         
/*   43 */         this.behaviors.put(param__BehaviorDesc.signature, localObject);
/*      */       }
/*      */       else {
/*   46 */         ((List)localObject).add(param__BehaviorDesc);
/*   47 */         if (BehavingEntity.this.debugLevel == 2) {
/*   48 */           param__BehaviorDesc.uniqueName = (param__BehaviorDesc.signature.substring(0, param__BehaviorDesc.signature.indexOf('(')) + '_' + ((List)localObject).size());
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */     public synchronized List lookupBehavior(String paramString) {
/*   54 */       List localList = (List)this.behaviors.get(paramString);
/*   55 */       if (localList == null)
/*      */       {
/*   57 */         return new Vector(0);
/*      */       }
/*   59 */       return new ArrayList(localList);
/*      */     }
/*      */     
/*      */     private final synchronized Set getRegisteredBehaviors()
/*      */     {
/*   64 */       return new HashSet(this.behaviors.keySet());
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  124 */   protected static final InheritableThreadLocal entity = new InheritableThreadLocal(); private static final boolean $noassert = Class.forName("[Labl.runtime.BehavingEntity;").getComponentType().desiredAssertionStatus() ^ true;
/*      */   
/*      */ 
/*  127 */   private static BehaviorSpecificityComparator behComparator = new BehaviorSpecificityComparator();
/*      */   
/*      */ 
/*  130 */   private static StepPriorityComparator stepPriorityComparator = new StepPriorityComparator();
/*      */   
/*      */ 
/*  133 */   private static StepExpansionComparator stepExpansionComparator = new StepExpansionComparator();
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  139 */   static Object[] tempObjArray = new Object[1];
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  160 */   private static Hashtable entityTable = new Hashtable();
/*      */   
/*      */   public static final int suspendOnInstantiate = 0;
/*      */   public static final int suspendOnExecute = 1;
/*      */   protected final WorkingMemory workingMemory;
/*      */   protected CollectionBehavior ABT;
/*      */   protected Set leafSteps;
/*      */   protected HashSet atomicSteps;
/*      */   protected HashSet executingPrimitiveSteps;
/*      */   protected HashSet successTestStepsNoSensing;
/*      */   protected HashSet contextConditionBehaviorsNoSensing;
/*      */   protected final HashSet successConditionBehaviorsNoSensing;
/*      */   protected HashSet successTestStepsSensing;
/*      */   protected HashSet contextConditionBehaviorsSensing;
/*      */   protected final HashSet successConditionBehaviorsSensing;
/*      */   protected Hashtable executingSteps;
/*      */   protected BehaviorLibrary individualBehaviorLibrary;
/*      */   protected BehaviorLibrary jointBehaviorLibrary;
/*      */   
/*      */   private class SensedConditionMonitor
/*      */   {
/*  181 */     private SensedConditionMonitor() { jdMethod_this(); } SensedConditionMonitor(BehavingEntity.1 param1) { this(); }
/*  182 */     private final void jdMethod_this() { this.ready = false; }
/*      */     
/*      */     private boolean ready;
/*  185 */     synchronized boolean sensedConditionsReadyToRun() { boolean bool = this.ready;
/*  186 */       this.ready = false;
/*  187 */       return bool;
/*      */     }
/*      */     
/*      */     synchronized void setSensedConditionsReadyToRun(boolean paramBoolean) {
/*  191 */       this.ready = paramBoolean;
/*      */     }
/*      */   }
/*      */   
/*      */   private class ActiveContinuousSensors {
/*      */     private LinkedList activeSensors;
/*      */     
/*  198 */     private ActiveContinuousSensors() { jdMethod_this(); } ActiveContinuousSensors(BehavingEntity.1 param1) { this(); }
/*      */     
/*      */     private final void jdMethod_this() {
/*  201 */       this.activeSensors = new LinkedList();
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     synchronized void activateSensor(SensorActivation paramSensorActivation)
/*      */     {
/*  211 */       ListIterator localListIterator = this.activeSensors.listIterator();
/*      */       
/*  213 */       while (localListIterator.hasNext()) {
/*  214 */         SensorActivation localSensorActivation = (SensorActivation)localListIterator.next();
/*      */         
/*  216 */         if (paramSensorActivation.equals(localSensorActivation))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  222 */           localSensorActivation.referenceCount += 1;
/*  223 */           return;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  231 */       this.activeSensors.add(paramSensorActivation);
/*  232 */       paramSensorActivation.activeSensor.initializeContinuous(paramSensorActivation.arguments);
/*  233 */       notify();
/*      */     }
/*      */     
/*      */     synchronized void activateSensors(SensorActivation[] paramArrayOfSensorActivation) {
/*  237 */       if (paramArrayOfSensorActivation != null) {
/*  238 */         for (int i = 0; i < paramArrayOfSensorActivation.length; i++) {
/*  239 */           activateSensor(paramArrayOfSensorActivation[i]);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     synchronized void deactivateSensor(SensorActivation paramSensorActivation)
/*      */     {
/*  251 */       ListIterator localListIterator = this.activeSensors.listIterator();
/*      */       
/*  253 */       while (localListIterator.hasNext()) {
/*  254 */         SensorActivation localSensorActivation = (SensorActivation)localListIterator.next();
/*  255 */         if (paramSensorActivation.equals(localSensorActivation))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  260 */           if (localSensorActivation.referenceCount == 1) {
/*  261 */             localListIterator.remove();
/*      */           } else {
/*  263 */             localSensorActivation.referenceCount -= 1;
/*      */           }
/*  265 */           return;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */     synchronized void deactivateSensors(SensorActivation[] paramArrayOfSensorActivation)
/*      */     {
/*  274 */       if (paramArrayOfSensorActivation != null)
/*  275 */         for (int i = 0; i < paramArrayOfSensorActivation.length; i++)
/*  276 */           deactivateSensor(paramArrayOfSensorActivation[i]);
/*      */     }
/*      */     
/*      */     synchronized void sense() {
/*  280 */       if (!this.activeSensors.isEmpty()) {
/*  281 */         BehavingEntity.this.runSensors(this.activeSensors, true);
/*  282 */         BehavingEntity.this.senseMonitor.setSensedConditionsReadyToRun(true);
/*      */       } else {
/*      */         try {
/*  285 */           wait();
/*      */         }
/*      */         catch (InterruptedException localInterruptedException) {
/*  288 */           throw new RuntimeError("Sense cycle interrupted");
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public BehavingEntity()
/*      */   {
/*  297 */     jdMethod_this();
/*  298 */     entity.set(this);
/*  299 */     String str = getClass().getName();
/*      */     
/*  301 */     this.workingMemory = new WorkingMemory(str.substring(str.lastIndexOf('.') + 1) + "Memory");
/*      */   }
/*      */   
/*      */   public String getBehavingEntityShortName() {
/*  305 */     String str = getClass().getName();
/*  306 */     return str.substring(str.lastIndexOf('.') + 1);
/*      */   }
/*      */   
/*      */   public String toString() {
/*  310 */     return getBehavingEntityShortName();
/*      */   }
/*      */   
/*      */   CollectionBehavior getRootCollectionBehavior()
/*      */   {
/*  315 */     return this.ABT;
/*      */   }
/*      */   
/*      */   public static BehavingEntity getBehavingEntity()
/*      */   {
/*  320 */     return (BehavingEntity)entity.get();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   Thread getDecisionCycleThread()
/*      */   {
/*  345 */     return this.decisionCycleThread;
/*      */   }
/*      */   
/*      */   class ShutdownHook extends Thread
/*      */   {
/*      */     public String shutdownMessage;
/*      */     
/*      */     public void run()
/*      */     {
/*  354 */       System.err.println(this.shutdownMessage);
/*  355 */       BehavingEntity.this.printNegotiationThreads();
/*  356 */       System.err.flush();
/*      */     }
/*      */     
/*      */     ShutdownHook() {}
/*      */   }
/*      */   
/*      */   public void startBehaving() {
/*  363 */     this.decisionCycleThread = Thread.currentThread();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  374 */     if (this.asynchronousSenseCycle) {
/*  375 */       new BehavingEntity.2SenseCycleThread(this).start();
/*      */     }
/*  377 */     this.shutdownHook = new ShutdownHook();
/*      */     
/*  379 */     Runtime.getRuntime().addShutdownHook(this.shutdownHook);
/*      */     for (;;)
/*      */     {
/*  382 */       Thread.currentThread().setName("DecisionCycleThread");
/*  383 */       behave();
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void behave()
/*      */   {
/*  406 */     this.shutdownHook.shutdownMessage = (getBehavingEntityShortName() + " was running negotiation threads");
/*  407 */     runNegotiationThreads();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  423 */     if (this.bDecisionCycleSMCall) {
/*  424 */       this.shutdownHook.shutdownMessage = (getBehavingEntityShortName() + " was in the decision cycle SM call");
/*  425 */       decisionCycleSMCall();
/*      */     }
/*      */     
/*  428 */     this.workingMemory.deleteMarkedTransientWMEs();
/*      */     
/*      */ 
/*  431 */     this.shutdownHook.shutdownMessage = (getBehavingEntityShortName() + " was checking for completed primitive actions");
/*  432 */     Iterator localIterator = this.executingPrimitiveSteps.iterator();
/*      */     
/*  434 */     while (localIterator.hasNext()) {
/*  435 */       PrimitiveStep localPrimitiveStep = (PrimitiveStep)localIterator.next();
/*      */       
/*  437 */       if (localPrimitiveStep.getCompletionStatus() == 1) {
/*  438 */         localPrimitiveStep.succeedStep();
/*  439 */         return; }
/*  440 */       if (localPrimitiveStep.getCompletionStatus() == 2) {
/*  441 */         localPrimitiveStep.failStep();
/*  442 */         return;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  449 */     this.shutdownHook.shutdownMessage = (getBehavingEntityShortName() + " was checking continuously monitored conditions");
/*  450 */     if (this.atomicSteps.isEmpty())
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  457 */       if (!this.asynchronousSenseCycle) {
/*  458 */         this.activeSensors.sense();
/*  459 */         runSuccessTests(true);
/*  460 */         runContextConditions(true);
/*  461 */         runSuccessConditions(true);
/*  462 */         this.workingMemory.markTransientWMEs();
/*      */       }
/*      */       
/*  465 */       long l = System.currentTimeMillis();
/*      */       
/*  467 */       runSuccessTests(false);
/*  468 */       runContextConditions(false);
/*  469 */       runSuccessConditions(false);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  474 */       this.continuousConditionTime = (System.currentTimeMillis() - l);
/*      */       
/*  476 */       if ((this.asynchronousSenseCycle) && (this.senseMonitor.sensedConditionsReadyToRun())) {
/*  477 */         runSuccessTests(true);
/*  478 */         runContextConditions(true);
/*  479 */         runSuccessConditions(true);
/*  480 */         this.workingMemory.markTransientWMEs();
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  501 */     this.shutdownHook.shutdownMessage = (getBehavingEntityShortName() + " was selecting a step");
/*      */     
/*  503 */     Step localStep = chooseStep();
/*      */     
/*      */ 
/*  506 */     if (this.debugLevel == 2) {
/*  507 */       this.debuggerGUI.debug(this.continuousConditionTime);
/*      */     }
/*      */     
/*  510 */     if (localStep != null)
/*      */     {
/*  512 */       this.shutdownHook.shutdownMessage = (getBehavingEntityShortName() + " was executing step " + localStep + " of behavior " + localStep.getParent());
/*      */       
/*  514 */       localStep.execute();
/*      */     }
/*      */     else {
/*      */       try {
/*  518 */         this.shutdownHook.shutdownMessage = (getBehavingEntityShortName() + " was waiting because there was no step to execute");
/*  519 */         Thread.currentThread();Thread.sleep(17L);
/*      */       } catch (InterruptedException localInterruptedException) {
/*  521 */         throw new RuntimeError("Unexpected interruption");
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private final void jdMethod_this()
/*      */   {
/*   84 */     this.leafSteps = java.util.Collections.synchronizedSet(new HashSet());
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*   89 */     this.atomicSteps = new HashSet();
/*      */     
/*      */ 
/*   92 */     this.executingPrimitiveSteps = new HashSet();
/*      */     
/*      */ 
/*   95 */     this.successTestStepsNoSensing = new HashSet();
/*      */     
/*      */ 
/*   98 */     this.contextConditionBehaviorsNoSensing = new HashSet();
/*      */     
/*      */ 
/*  101 */     this.successConditionBehaviorsNoSensing = new HashSet();
/*      */     
/*      */ 
/*  104 */     this.successTestStepsSensing = new HashSet();
/*      */     
/*      */ 
/*  107 */     this.contextConditionBehaviorsSensing = new HashSet();
/*      */     
/*      */ 
/*  110 */     this.successConditionBehaviorsSensing = new HashSet();
/*      */     
/*      */ 
/*  113 */     this.executingSteps = new Hashtable();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  136 */     this.randomGen = new Random();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  145 */     this.bCurrentLineOfExpansion = true;
/*      */     
/*      */ 
/*  148 */     this.bStepConflicts = true;
/*      */     
/*      */ 
/*  151 */     this.debugLevel = 0;
/*      */     
/*      */ 
/*  154 */     this.debuggerGUI = null;
/*      */     
/*  156 */     this.bDecisionCycleSMCall = false;
/*      */     
/*  158 */     this.asynchronousSenseCycle = true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  163 */     this.currentEntryNegotiators = new Hashtable();
/*      */     
/*      */ 
/*  166 */     this.activeNegotiationThreads = java.util.Collections.synchronizedList(new LinkedList());
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  171 */     this.decisionCycleThread = null;
/*      */     
/*  173 */     this.negotiatorCommittedDuringNegotiation = false;
/*      */     
/*  175 */     this.continuousConditionTime = 0L;
/*      */     
/*      */ 
/*      */ 
/*  179 */     this.rootCollectionBehaviorWME = null;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  195 */     this.senseMonitor = new SensedConditionMonitor(null);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  294 */     this.activeSensors = new ActiveContinuousSensors(null);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  538 */     this.timeCheckThreads = new ThreadGroup("TimeCheckThreads");
/*      */   }
/*      */   
/*  541 */   private final void runNegotiationThreads() { this.negotiatorCommittedDuringNegotiation = false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  562 */     JointGoalNegotiationThread[] arrayOfJointGoalNegotiationThread = (JointGoalNegotiationThread[])this.activeNegotiationThreads.toArray(new JointGoalNegotiationThread[this.activeNegotiationThreads.size()]);
/*  563 */     for (int i = 0; i < arrayOfJointGoalNegotiationThread.length; i++) { BehavingEntity.3TimeCheckThread local3TimeCheckThread;
/*  564 */       if (!arrayOfJointGoalNegotiationThread[i].getIsStarted())
/*      */       {
/*  566 */         local3TimeCheckThread = new BehavingEntity.3TimeCheckThread(this, arrayOfJointGoalNegotiationThread[i]);
/*  567 */         local3TimeCheckThread.start();
/*  568 */         arrayOfJointGoalNegotiationThread[i].start();
/*  569 */         local3TimeCheckThread.interrupt();
/*  570 */       } else if (!arrayOfJointGoalNegotiationThread[i].isAlive())
/*      */       {
/*  572 */         this.activeNegotiationThreads.remove(arrayOfJointGoalNegotiationThread[i]);
/*      */       } else {
/*  574 */         local3TimeCheckThread = new BehavingEntity.3TimeCheckThread(this, arrayOfJointGoalNegotiationThread[i]);
/*  575 */         local3TimeCheckThread.start();
/*  576 */         arrayOfJointGoalNegotiationThread[i].continueNegotiation();
/*  577 */         local3TimeCheckThread.interrupt();
/*      */       }
/*      */     }
/*      */     
/*  581 */     if (this.negotiatorCommittedDuringNegotiation) {
/*  582 */       runNegotiationThreads();
/*      */     }
/*      */   }
/*      */   
/*      */   void jointGoalNegotiatorCommitted()
/*      */   {
/*      */     try {
/*  589 */       JointGoalNegotiationThread localJointGoalNegotiationThread = (JointGoalNegotiationThread)Thread.currentThread();
/*      */     } catch (ClassCastException localClassCastException) {
/*  591 */       throw new AblRuntimeError("Non-negotiation thread " + Thread.currentThread() + " attempted jointGoalNegotiatorCommitted.");
/*      */     }
/*      */     
/*  594 */     this.negotiatorCommittedDuringNegotiation = true;
/*      */   }
/*      */   
/*      */   public WorkingMemory getWorkingMemory()
/*      */   {
/*  599 */     return this.workingMemory;
/*      */   }
/*      */   
/*      */   public void addWME(WME paramWME)
/*      */   {
/*  604 */     this.workingMemory.addWME(paramWME);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void deleteWME(WME paramWME)
/*      */   {
/*  621 */     this.workingMemory.deleteWME(paramWME);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void deleteAllWMEClass(String paramString)
/*      */   {
/*  628 */     this.workingMemory.deleteAllWMEClass(paramString);
/*      */   }
/*      */   
/*      */   public LinkedList lookupWME(String paramString)
/*      */   {
/*  633 */     return this.workingMemory.lookupWME(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */   public List lookupReflectionWMEBySignature(String paramString1, String paramString2)
/*      */   {
/*  639 */     return this.workingMemory.lookupReflectionWMEBySignature(paramString1, paramString2);
/*      */   }
/*      */   
/*      */   public List lookupReflectionWMEByUserProperty(String paramString1, String paramString2)
/*      */   {
/*  644 */     return this.workingMemory.lookupReflectionWMEByUserProperty(paramString1, paramString2);
/*      */   }
/*      */   
/*      */   public wm.WorkingMemoryDebugger getWMDebugger()
/*      */   {
/*  649 */     return new wm.WorkingMemoryDebugger(this.workingMemory);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   void resetStep(Step paramStep)
/*      */   {
/*  659 */     this.executingPrimitiveSteps.remove(paramStep);
/*      */     
/*      */ 
/*  662 */     removeExecutingStep(paramStep);
/*      */     
/*      */ 
/*  665 */     if (paramStep.getStepType() != 3) {
/*  666 */       if (paramStep.getIsAtomic()) {
/*  667 */         this.atomicSteps.add(paramStep);
/*      */       } else {
/*  669 */         this.leafSteps.add(paramStep);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   void abortStep(PrimitiveStep paramPrimitiveStep)
/*      */   {
/*  676 */     this.executingPrimitiveSteps.remove(paramPrimitiveStep);
/*      */     
/*      */ 
/*  679 */     removeExecutingStep(paramPrimitiveStep);
/*      */   }
/*      */   
/*      */   void suspendStep(ExecutableStep paramExecutableStep)
/*      */   {
/*      */     boolean bool;
/*  685 */     if (paramExecutableStep.getStepType() == 1) {
/*  686 */       bool = ((GoalStep)paramExecutableStep).isExpanded() ^ true;
/*      */     } else {
/*  688 */       bool = paramExecutableStep.isExecuting() ^ true;
/*      */     }
/*  690 */     if (!bool)
/*      */     {
/*  692 */       removeExecutingStep(paramExecutableStep);
/*  693 */       if (paramExecutableStep.getStepType() == 0) {
/*  694 */         this.executingPrimitiveSteps.remove(paramExecutableStep);
/*      */       }
/*      */     }
/*  697 */     else if (paramExecutableStep.getIsAtomic()) {
/*  698 */       this.atomicSteps.remove(paramExecutableStep);
/*      */     } else {
/*  700 */       this.leafSteps.remove(paramExecutableStep);
/*      */     }
/*      */   }
/*      */   
/*      */   void unsuspendStep(ExecutableStep paramExecutableStep)
/*      */   {
/*  706 */     if ((paramExecutableStep.getStepType() == 1) && (((GoalStep)paramExecutableStep).isExpanded()))
/*      */     {
/*  708 */       HashSet localHashSet = (HashSet)this.executingSteps.get(paramExecutableStep.getName());
/*  709 */       if (localHashSet != null) {
/*  710 */         localHashSet.add(paramExecutableStep);
/*      */       } else {
/*  712 */         localHashSet = new HashSet();
/*  713 */         localHashSet.add(paramExecutableStep);
/*  714 */         this.executingSteps.put(paramExecutableStep.getName(), localHashSet);
/*      */       }
/*      */       
/*      */     }
/*  718 */     else if (paramExecutableStep.getIsAtomic()) {
/*  719 */       this.atomicSteps.add(paramExecutableStep);
/*      */     } else {
/*  721 */       this.leafSteps.add(paramExecutableStep);
/*      */     }
/*      */   }
/*      */   
/*      */   javax.swing.tree.DefaultTreeModel getABTTreeModel()
/*      */   {
/*  727 */     return new javax.swing.tree.DefaultTreeModel(((DebuggableBehavior)this.ABT).getTree());
/*      */   }
/*      */   
/*      */   void removeSuccessTest(Step paramStep)
/*      */   {
/*  732 */     if ((paramStep.getHasSuccessTest()) && ((this.successTestStepsSensing.contains(paramStep)) || (this.successTestStepsNoSensing.contains(paramStep))))
/*      */     {
/*  734 */       SensorActivation[] arrayOfSensorActivation = paramStep.getSuccessTestSensorActivations();
/*  735 */       if (arrayOfSensorActivation != null) {
/*  736 */         this.successTestStepsSensing.remove(paramStep);
/*      */       } else {
/*  738 */         this.successTestStepsNoSensing.remove(paramStep);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  743 */       if (arrayOfSensorActivation != null) {
/*  744 */         this.activeSensors.deactivateSensors(arrayOfSensorActivation);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   void removeStep(Step paramStep)
/*      */   {
/*  764 */     removeSuccessTest(paramStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  769 */     this.executingPrimitiveSteps.remove(paramStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  774 */     if (paramStep.getIsAtomic()) {
/*  775 */       this.atomicSteps.remove(paramStep);
/*      */     } else {
/*  777 */       this.leafSteps.remove(paramStep);
/*      */     }
/*      */     
/*  780 */     removeExecutingStep(paramStep);
/*      */   }
/*      */   
/*      */ 
/*      */   void addStep(Step paramStep)
/*      */   {
/*  786 */     if (paramStep.getStepType() != 3)
/*      */     {
/*  788 */       if (paramStep.getIsAtomic()) {
/*  789 */         this.atomicSteps.add(paramStep);
/*      */       } else {
/*  791 */         this.leafSteps.add(paramStep);
/*      */       }
/*      */     }
/*  794 */     if (paramStep.getHasSuccessTest())
/*      */     {
/*  796 */       SensorActivation[] arrayOfSensorActivation = paramStep.getSuccessTestSensorActivations();
/*  797 */       if (arrayOfSensorActivation != null) {
/*  798 */         this.successTestStepsSensing.add(paramStep);
/*      */       } else {
/*  800 */         this.successTestStepsNoSensing.add(paramStep);
/*      */       }
/*      */       
/*      */ 
/*  804 */       if (arrayOfSensorActivation != null) {
/*  805 */         this.activeSensors.activateSensors(arrayOfSensorActivation);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   void removeExecutingStep(Step paramStep)
/*      */   {
/*  821 */     if ((paramStep.getStepType() == 0) || (paramStep.getStepType() == 1)) {
/*  822 */       HashSet localHashSet = (HashSet)this.executingSteps.get(((ExecutableStep)paramStep).getName());
/*  823 */       if (localHashSet != null) {
/*  824 */         localHashSet.remove(paramStep);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   void executeStep(Step paramStep)
/*      */   {
/*  833 */     if (paramStep.getIsAtomic()) {
/*  834 */       this.atomicSteps.remove(paramStep);
/*      */     } else {
/*  836 */       this.leafSteps.remove(paramStep);
/*      */     }
/*      */     
/*  839 */     int i = paramStep.getStepType();
/*  840 */     if (i == 0)
/*      */     {
/*  842 */       this.executingPrimitiveSteps.add(paramStep);
/*      */     }
/*      */     
/*  845 */     if ((i == 0) || (i == 1)) {
/*  846 */       HashSet localHashSet = (HashSet)this.executingSteps.get(((ExecutableStep)paramStep).getName());
/*  847 */       if (localHashSet != null) {
/*  848 */         localHashSet.add(paramStep);
/*      */       } else {
/*  850 */         localHashSet = new HashSet();
/*  851 */         localHashSet.add(paramStep);
/*  852 */         this.executingSteps.put(((ExecutableStep)paramStep).getName(), localHashSet);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   void addBehavior(Behavior paramBehavior) {
/*      */     SensorActivation[] arrayOfSensorActivation;
/*  859 */     if (paramBehavior.getHasContextCondition())
/*      */     {
/*  861 */       arrayOfSensorActivation = paramBehavior.getContextConditionSensorActivations();
/*  862 */       if (arrayOfSensorActivation != null) {
/*  863 */         this.contextConditionBehaviorsSensing.add(paramBehavior);
/*      */       } else {
/*  865 */         this.contextConditionBehaviorsNoSensing.add(paramBehavior);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  870 */       if (arrayOfSensorActivation != null) {
/*  871 */         this.activeSensors.activateSensors(arrayOfSensorActivation);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  880 */     if (paramBehavior.getHasSuccessCondition())
/*      */     {
/*  882 */       arrayOfSensorActivation = paramBehavior.getSuccessConditionSensorActivations();
/*  883 */       if (arrayOfSensorActivation != null) {
/*  884 */         this.successConditionBehaviorsSensing.add(paramBehavior);
/*      */       } else {
/*  886 */         this.successConditionBehaviorsNoSensing.add(paramBehavior);
/*      */       }
/*      */       
/*      */ 
/*  890 */       if (arrayOfSensorActivation != null) {
/*  891 */         this.activeSensors.activateSensors(arrayOfSensorActivation);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   void removeBehavior(Behavior paramBehavior)
/*      */   {
/*  901 */     if (((paramBehavior.getHasContextCondition()) || (paramBehavior.getHasSuccessCondition())) && (!paramBehavior.getBehaviorRemoved()))
/*      */     {
/*      */ 
/*  904 */       SensorActivation[] arrayOfSensorActivation1 = paramBehavior.getContextConditionSensorActivations();
/*  905 */       if (arrayOfSensorActivation1 != null) {
/*  906 */         this.contextConditionBehaviorsSensing.remove(paramBehavior);
/*      */       } else {
/*  908 */         this.contextConditionBehaviorsNoSensing.remove(paramBehavior);
/*      */       }
/*  910 */       SensorActivation[] arrayOfSensorActivation2 = paramBehavior.getSuccessConditionSensorActivations();
/*  911 */       if (arrayOfSensorActivation2 != null) {
/*  912 */         this.successConditionBehaviorsSensing.remove(paramBehavior);
/*      */       } else {
/*  914 */         this.successConditionBehaviorsNoSensing.remove(paramBehavior);
/*      */       }
/*  916 */       paramBehavior.setBehaviorRemoved();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  921 */       if (arrayOfSensorActivation1 != null) {
/*  922 */         this.activeSensors.deactivateSensors(arrayOfSensorActivation1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  931 */       if (arrayOfSensorActivation2 != null) {
/*  932 */         this.activeSensors.deactivateSensors(arrayOfSensorActivation2);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private final boolean runContextConditions(boolean paramBoolean)
/*      */   {
/*      */     Iterator localIterator;
/*      */     
/*      */ 
/*  944 */     if (paramBoolean) {
/*  945 */       localIterator = this.contextConditionBehaviorsSensing.iterator();
/*      */     } else {
/*  947 */       localIterator = this.contextConditionBehaviorsNoSensing.iterator();
/*      */     }
/*  949 */     while (localIterator.hasNext()) {
/*  950 */       Behavior localBehavior = (Behavior)localIterator.next();
/*  951 */       if (!localBehavior.contextCondition()) {
/*  952 */         localBehavior.failBehavior();
/*  953 */         runContextConditions(paramBoolean);
/*  954 */         return true;
/*      */       }
/*      */     }
/*  957 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */   private final boolean runSuccessConditions(boolean paramBoolean)
/*      */   {
/*      */     Iterator localIterator;
/*      */     
/*  965 */     if (paramBoolean) {
/*  966 */       localIterator = this.successConditionBehaviorsSensing.iterator();
/*      */     } else
/*  968 */       localIterator = this.successConditionBehaviorsNoSensing.iterator();
/*  969 */     while (localIterator.hasNext()) {
/*  970 */       Behavior localBehavior = (Behavior)localIterator.next();
/*  971 */       if (localBehavior.successCondition()) {
/*  972 */         localBehavior.succeedBehavior();
/*  973 */         runSuccessConditions(paramBoolean);
/*  974 */         return true;
/*      */       }
/*      */     }
/*  977 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */   private final boolean runSuccessTests(boolean paramBoolean)
/*      */   {
/*      */     Iterator localIterator;
/*      */     
/*  985 */     if (paramBoolean) {
/*  986 */       localIterator = this.successTestStepsSensing.iterator();
/*      */     } else {
/*  988 */       localIterator = this.successTestStepsNoSensing.iterator();
/*      */     }
/*      */     
/*  991 */     while (localIterator.hasNext()) {
/*  992 */       Step localStep = (Step)localIterator.next();
/*  993 */       if (localStep.successTest())
/*      */       {
/*      */ 
/*  996 */         localStep.succeedStep();
/*  997 */         runSuccessTests(paramBoolean);
/*  998 */         return true;
/*      */       }
/*      */     }
/* 1001 */     return false;
/*      */   }
/*      */   
/*      */   Behavior chooseIndividualBehavior(Object[] paramArrayOfObject, HashSet paramHashSet, GoalStep paramGoalStep)
/*      */   {
/* 1006 */     return chooseBehavior(paramArrayOfObject, paramHashSet, paramGoalStep, false, null);
/*      */   }
/*      */   
/*      */   Behavior chooseJointBehavior(Object[] paramArrayOfObject, Set paramSet, GoalStep paramGoalStep)
/*      */   {
/* 1011 */     return chooseBehavior(paramArrayOfObject, paramSet, paramGoalStep, true, null);
/*      */   }
/*      */   
/*      */   Behavior chooseJointBehavior(Object[] paramArrayOfObject, Set paramSet1, GoalStep paramGoalStep, Set paramSet2)
/*      */   {
/* 1016 */     return chooseBehavior(paramArrayOfObject, paramSet1, paramGoalStep, true, paramSet2);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final Behavior chooseBehavior(Object[] paramArrayOfObject, Set paramSet1, GoalStep paramGoalStep, boolean paramBoolean, Set paramSet2)
/*      */   {
/* 1027 */     if ((!$noassert) && ((paramBoolean) || (paramSet2 != null)) && (!paramBoolean)) { throw new AssertionError();
/*      */     }
/*      */     
/* 1030 */     String str = paramGoalStep.getSignature();
/*      */     
/*      */     List localList;
/* 1033 */     if (paramBoolean)
/*      */     {
/* 1035 */       localList = this.jointBehaviorLibrary.lookupBehavior(str);
/* 1036 */       if (localList.isEmpty())
/*      */       {
/* 1038 */         return null; }
/* 1039 */       if (paramSet2 != null)
/*      */       {
/* 1041 */         localIterator = localList.iterator();
/* 1042 */         while (localIterator.hasNext()) {
/* 1043 */           localObject1 = (__BehaviorDesc)localIterator.next();
/* 1044 */           localHashSet = new HashSet(((__BehaviorDesc)localObject1).teamMembers.length * 2);
/* 1045 */           for (int i = 0; i < ((__BehaviorDesc)localObject1).teamMembers.length; i++)
/* 1046 */             localHashSet.add(getBehavingEntity(localObject1.teamMembers[i]));
/* 1047 */           if (!localHashSet.equals(paramSet2)) {
/* 1048 */             localIterator.remove();
/*      */           }
/*      */         }
/*      */       }
/*      */     } else {
/* 1053 */       localList = this.individualBehaviorLibrary.lookupBehavior(str);
/* 1054 */       if (localList == null)
/*      */       {
/* 1056 */         return null;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/* 1061 */     Iterator localIterator = localList.iterator();
/* 1062 */     while (localIterator.hasNext()) {
/* 1063 */       localObject1 = (__BehaviorDesc)localIterator.next();
/* 1064 */       if (paramSet1.contains(new Integer(((__BehaviorDesc)localObject1).behaviorID))) {
/* 1065 */         localIterator.remove();
/*      */       }
/*      */     }
/*      */     
/*      */ 
/* 1070 */     if (localList.isEmpty()) {
/* 1071 */       return null;
/*      */     }
/*      */     
/* 1074 */     Object localObject1 = new Vector(100);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1080 */     localIterator = localList.iterator();
/* 1081 */     HashSet localHashSet = new HashSet();
/*      */     Object localObject3;
/* 1083 */     Object localObject4; try { while (localIterator.hasNext()) {
/* 1084 */         __BehaviorDesc local__BehaviorDesc1 = (__BehaviorDesc)localIterator.next();
/* 1085 */         if (local__BehaviorDesc1.preconditionSensorFactory != null)
/*      */         {
/*      */ 
/* 1088 */           localObject3 = new Object[] { new Integer(local__BehaviorDesc1.behaviorID) };
/* 1089 */           localObject4 = (SensorActivation[])local__BehaviorDesc1.preconditionSensorFactory.invoke(null, (Object[])localObject3);
/* 1090 */           for (int k = 0; k < localObject4.length; k++)
/* 1091 */             localHashSet.add(localObject4[k]);
/*      */         }
/*      */       }
/*      */     } catch (Exception localException1) {
/* 1095 */       throw new AblRuntimeError("Reflection error", localException1);
/*      */     }
/*      */     
/*      */ 
/* 1099 */     if (!localHashSet.isEmpty()) {
/* 1100 */       runSensors(new Vector(localHashSet), false);
/*      */     }
/*      */     
/* 1103 */     localIterator = localList.iterator();
/*      */     try {
/*      */       Object localObject2;
/* 1106 */       while (localIterator.hasNext()) {
/* 1107 */         localObject2 = (__BehaviorDesc)localIterator.next();
/* 1108 */         if (((__BehaviorDesc)localObject2).precondition != null)
/*      */         {
/* 1110 */           localObject3 = new Object[] { new Integer(((__BehaviorDesc)localObject2).behaviorID), paramArrayOfObject, new Hashtable(), this };
/*      */           
/* 1112 */           localObject4 = (Boolean)((__BehaviorDesc)localObject2).precondition.invoke(null, (Object[])localObject3);
/* 1113 */           if (this.debugLevel == 2) {
/* 1114 */             this.debuggerGUI.traceAblExecutionEvent(1, (__BehaviorDesc)localObject2, localObject4, ((DebuggableStep)paramGoalStep).getNestLevel() + 1, ((__BehaviorDesc)localObject2).behaviorID);
/*      */           }
/* 1116 */           if (((Boolean)localObject4).booleanValue())
/*      */           {
/*      */ 
/* 1119 */             ((List)localObject1).add(new SatisfiedBehavior((__BehaviorDesc)localObject2, (Hashtable)localObject3[2]));
/*      */           }
/*      */         }
/*      */         else {
/* 1123 */           if (this.debugLevel == 2) {
/* 1124 */             this.debuggerGUI.traceAblExecutionEvent(1, (__BehaviorDesc)localObject2, new Boolean(true), ((DebuggableStep)paramGoalStep).getNestLevel() + 1, ((__BehaviorDesc)localObject2).behaviorID);
/*      */           }
/* 1126 */           ((List)localObject1).add(new SatisfiedBehavior((__BehaviorDesc)localObject2, null));
/*      */         }
/*      */       }
/*      */       
/* 1130 */       if (!((List)localObject1).isEmpty())
/*      */       {
/*      */ 
/*      */ 
/* 1134 */         localObject2 = (SatisfiedBehavior[])((List)localObject1).toArray(new SatisfiedBehavior[((List)localObject1).size()]);
/* 1135 */         Arrays.sort((Object[])localObject2, behComparator);
/*      */         
/*      */ 
/* 1138 */         localObject3 = new ArrayList(((List)localObject1).size());
/* 1139 */         ((List)localObject3).add(localObject2[0]);
/* 1140 */         for (int j = 1; j < localObject2.length; j++) {
/* 1141 */           if (behComparator.compare(localObject2[0], localObject2[j]) == 0) {
/* 1142 */             ((List)localObject3).add(localObject2[j]);
/*      */           }
/*      */         }
/*      */         __BehaviorDesc local__BehaviorDesc2;
/*      */         Hashtable localHashtable;
/* 1147 */         if (((List)localObject3).size() == 1) {
/* 1148 */           local__BehaviorDesc2 = ((SatisfiedBehavior)((List)localObject3).get(0)).behDesc;
/* 1149 */           localHashtable = ((SatisfiedBehavior)((List)localObject3).get(0)).preconditionBoundVariables;
/* 1150 */         } else if (((List)localObject3).size() > 1) {
/* 1151 */           int m = this.randomGen.nextInt(((List)localObject3).size());
/* 1152 */           local__BehaviorDesc2 = ((SatisfiedBehavior)((List)localObject3).get(m)).behDesc;
/* 1153 */           localHashtable = ((SatisfiedBehavior)((List)localObject3).get(m)).preconditionBoundVariables;
/*      */         } else {
/* 1155 */           throw new RuntimeError("Expected mostSpecificBeh >= 1, instead < 1");
/*      */         }
/*      */         
/*      */         Object[] arrayOfObject;
/* 1159 */         if (this.debugLevel == 2) {
/* 1160 */           arrayOfObject = new Object[] { new Integer(local__BehaviorDesc2.behaviorID), paramArrayOfObject, localHashtable, paramGoalStep, local__BehaviorDesc2.signature, local__BehaviorDesc2 };
/*      */         } else {
/* 1162 */           arrayOfObject = new Object[] { new Integer(local__BehaviorDesc2.behaviorID), paramArrayOfObject, localHashtable, paramGoalStep, local__BehaviorDesc2.signature };
/*      */         }
/* 1164 */         return (Behavior)local__BehaviorDesc2.factory.invoke(null, arrayOfObject);
/*      */       }
/* 1166 */       return null;
/*      */     } catch (Exception localException2) {
/* 1168 */       localException2.printStackTrace();
/* 1169 */       throw new RuntimeError("Reflection error in chooseBehavior()");
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final Step chooseStep()
/*      */   {
/* 1184 */     if ((!this.leafSteps.isEmpty()) || (!this.atomicSteps.isEmpty()))
/*      */     {
/*      */       ArrayList localArrayList;
/* 1187 */       if (!this.atomicSteps.isEmpty()) {
/* 1188 */         localArrayList = new ArrayList(this.atomicSteps);
/*      */       } else {
/* 1190 */         localArrayList = new ArrayList(this.leafSteps);
/*      */       }
/*      */       
/* 1193 */       if (this.bStepConflicts) {
/* 1194 */         localListIterator = localArrayList.listIterator();
/* 1195 */         while (localListIterator.hasNext()) {
/* 1196 */           if (((Step)localListIterator.next()).isSuspended()) {
/* 1197 */             localListIterator.remove();
/*      */           }
/*      */         }
/*      */       }
/* 1201 */       ListIterator localListIterator = localArrayList.listIterator();
/* 1202 */       Object localObject; while (localListIterator.hasNext()) {
/* 1203 */         localObject = (Step)localListIterator.next();
/* 1204 */         if ((((Step)localObject).getStepType() == 1) && (((GoalStep)localObject).isJointGoal()) && (((JointGoalStep)localObject).getIsNegotiating())) {
/* 1205 */           localListIterator.remove();
/*      */         }
/*      */       }
/*      */       
/* 1209 */       if (localArrayList.size() > 0)
/*      */       {
/*      */ 
/*      */ 
/* 1213 */         localObject = (Step[])localArrayList.toArray(new Step[localArrayList.size()]);
/*      */         
/*      */ 
/* 1216 */         Arrays.sort((Object[])localObject, stepPriorityComparator);
/*      */         
/* 1218 */         localArrayList.clear();
/* 1219 */         localArrayList.add(localObject[0]);
/* 1220 */         for (int i = 1; i < localObject.length; i++) {
/* 1221 */           if (stepPriorityComparator.compare(localObject[0], localObject[i]) == 0) {
/* 1222 */             localArrayList.add(localObject[i]);
/*      */           } else {
/*      */             break;
/*      */           }
/*      */         }
/* 1227 */         if ((this.bCurrentLineOfExpansion) && (localArrayList.size() > 1))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1233 */           localObject = (Step[])localArrayList.toArray(new Step[localArrayList.size()]);
/* 1234 */           Arrays.sort((Object[])localObject, stepExpansionComparator);
/*      */           
/*      */ 
/* 1237 */           localArrayList.clear();
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1242 */           localArrayList.add(localObject[0]);
/* 1243 */           for (i = 1; i < localObject.length; i++) {
/* 1244 */             if (stepExpansionComparator.compare(localObject[0], localObject[i]) == 0) {
/* 1245 */               localArrayList.add(localObject[i]);
/*      */             } else {
/*      */               break;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/* 1252 */         if ((!$noassert) && (localArrayList.size() < 1)) throw new AssertionError();
/* 1253 */         if (localArrayList.size() > 1) {
/* 1254 */           return (Step)localArrayList.get(this.randomGen.nextInt(localArrayList.size()));
/*      */         }
/* 1256 */         return (Step)localArrayList.get(0);
/*      */       }
/* 1258 */       return null;
/*      */     }
/* 1260 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   void findConflictsWithCurrentlyExecutingSteps(ExecutableStep paramExecutableStep, int paramInt)
/*      */   {
/* 1267 */     if ((!$noassert) && (paramInt != 0) && (paramInt != 1)) throw new AssertionError();
/* 1268 */     String[] arrayOfString = paramExecutableStep.getConflicts();
/*      */     
/* 1270 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 1271 */       HashSet localHashSet = (HashSet)this.executingSteps.get(arrayOfString[i]);
/* 1272 */       if (localHashSet != null) {
/* 1273 */         Iterator localIterator = localHashSet.iterator();
/* 1274 */         while (localIterator.hasNext())
/*      */         {
/* 1276 */           ExecutableStep localExecutableStep = (ExecutableStep)localIterator.next();
/* 1277 */           switch (paramInt)
/*      */           {
/*      */           case 0: 
/* 1280 */             if (localExecutableStep.getPriority() >= paramExecutableStep.getPriority())
/* 1281 */               paramExecutableStep.suspend(localExecutableStep);
/* 1282 */             break;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           case 1: 
/* 1290 */             if (localExecutableStep.getPriority() < paramExecutableStep.getPriority()) {
/* 1291 */               localExecutableStep.suspend(paramExecutableStep);
/*      */             } else
/* 1293 */               paramExecutableStep.suspend(localExecutableStep);
/*      */             break;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   void runSensors(List paramList, boolean paramBoolean) {
/* 1302 */     Iterator localIterator = paramList.iterator();
/*      */     
/*      */ 
/*      */ 
/* 1306 */     LinkedList localLinkedList = new LinkedList();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     Object localObject;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1328 */     while (localIterator.hasNext()) {
/* 1329 */       SensorActivation localSensorActivation = (SensorActivation)localIterator.next();
/* 1330 */       Sensor localSensor = localSensorActivation.activeSensor;
/* 1331 */       Object[] arrayOfObject = localSensorActivation.arguments;
/* 1332 */       if (localSensor.canBeParallel())
/*      */       {
/* 1334 */         localObject = new BehavingEntity.4SensorThread(this, localSensor, arrayOfObject, paramBoolean);
/* 1335 */         ((BehavingEntity.4SensorThread)localObject).setPriority(5);
/* 1336 */         localLinkedList.add(localObject);
/* 1337 */         ((BehavingEntity.4SensorThread)localObject).start();
/*      */ 
/*      */       }
/* 1340 */       else if (paramBoolean) {
/* 1341 */         localSensor.senseContinuous(arrayOfObject);
/*      */       } else {
/* 1343 */         localSensor.senseOneShot(arrayOfObject);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1349 */     if (localLinkedList.size() != 0) {
/* 1350 */       localObject = localLinkedList.listIterator();
/* 1351 */       while (((ListIterator)localObject).hasNext()) {
/*      */         try {
/* 1353 */           ((BehavingEntity.4SensorThread)((ListIterator)localObject).next()).join();
/*      */         } catch (InterruptedException localInterruptedException) {
/* 1355 */           throw new AblRuntimeError("Sensor thread interrupted");
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void breakNextDecisionCycle()
/*      */   {
/* 1365 */     if (this.debugLevel == 2) {
/* 1366 */       this.debuggerGUI.breakNextDecisionCycle();
/*      */     }
/*      */   }
/*      */   
/*      */   public void breakNow()
/*      */   {
/* 1372 */     if (this.debugLevel == 2) {
/* 1373 */       this.debuggerGUI.breakNextDecisionCycle();
/* 1374 */       this.debuggerGUI.debug(0L);
/*      */     }
/*      */   }
/*      */   
/*      */   public void setTraceToScreen(boolean paramBoolean)
/*      */   {
/* 1380 */     if (this.debugLevel == 2) {
/* 1381 */       this.debuggerGUI.setTraceToScreen(paramBoolean);
/*      */     }
/*      */   }
/*      */   
/*      */   public void setTraceToBuffer(boolean paramBoolean) {
/* 1386 */     if (this.debugLevel == 2) {
/* 1387 */       this.debuggerGUI.setTraceToBuffer(paramBoolean);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void startWMEReflection(CollectionBehavior paramCollectionBehavior)
/*      */   {
/* 1393 */     CollectionBehaviorWME localCollectionBehaviorWME = new CollectionBehaviorWME(paramCollectionBehavior, null);
/* 1394 */     addWME(localCollectionBehaviorWME);
/* 1395 */     this.rootCollectionBehaviorWME = localCollectionBehaviorWME;
/*      */   }
/*      */   
/*      */   boolean reflectionEnabled()
/*      */   {
/* 1400 */     if (this.rootCollectionBehaviorWME != null) {
/* 1401 */       return true;
/*      */     }
/* 1403 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */   public static boolean constantTrue(int paramInt)
/*      */   {
/* 1409 */     return true;
/*      */   }
/*      */   
/* 1412 */   public static boolean constantTrue(float paramFloat) { return true; }
/*      */   
/*      */   public static boolean constantTrue(double paramDouble) {
/* 1415 */     return true;
/*      */   }
/*      */   
/* 1418 */   public static boolean constantTrue(short paramShort) { return true; }
/*      */   
/*      */   public static boolean constantTrue(long paramLong) {
/* 1421 */     return true;
/*      */   }
/*      */   
/* 1424 */   public static boolean constantTrue(char paramChar) { return true; }
/*      */   
/*      */   public static boolean constantTrue(byte paramByte) {
/* 1427 */     return true;
/*      */   }
/*      */   
/* 1430 */   public static boolean constantTrue(boolean paramBoolean) { return true; }
/*      */   
/*      */   public static boolean constantTrue(Object paramObject) {
/* 1433 */     return true;
/*      */   }
/*      */   
/*      */   public static boolean truePrintln(String paramString)
/*      */   {
/* 1438 */     System.out.println(paramString);
/* 1439 */     return true;
/*      */   }
/*      */   
/*      */   Set getRegisteredIndividualBehaviors()
/*      */   {
/* 1444 */     return this.individualBehaviorLibrary.getRegisteredBehaviors();
/*      */   }
/*      */   
/*      */   Set getRegisteredJointBehaviors()
/*      */   {
/* 1449 */     return this.jointBehaviorLibrary.getRegisteredBehaviors();
/*      */   }
/*      */   
/*      */   Set getRegisteredBehaviors() {
/* 1453 */     HashSet localHashSet = new HashSet(this.individualBehaviorLibrary.getRegisteredBehaviors());
/* 1454 */     localHashSet.addAll(this.jointBehaviorLibrary.getRegisteredBehaviors());
/* 1455 */     return localHashSet;
/*      */   }
/*      */   
/*      */ 
/*      */   void traceBehaviorSignature(String paramString)
/*      */   {
/* 1461 */     List localList = this.individualBehaviorLibrary.lookupBehavior(paramString);
/* 1462 */     localList.addAll(this.jointBehaviorLibrary.lookupBehavior(paramString));
/*      */     
/* 1464 */     Iterator localIterator = localList.iterator();
/* 1465 */     while (localIterator.hasNext()) {
/* 1466 */       __BehaviorDesc local__BehaviorDesc = (__BehaviorDesc)localIterator.next();
/* 1467 */       this.debuggerGUI.traceBehavior(local__BehaviorDesc.behaviorID);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   void untraceBehaviorSignature(String paramString)
/*      */   {
/* 1474 */     List localList = this.individualBehaviorLibrary.lookupBehavior(paramString);
/* 1475 */     localList.addAll(this.jointBehaviorLibrary.lookupBehavior(paramString));
/*      */     
/* 1477 */     Iterator localIterator = localList.iterator();
/* 1478 */     while (localIterator.hasNext()) {
/* 1479 */       __BehaviorDesc local__BehaviorDesc = (__BehaviorDesc)localIterator.next();
/* 1480 */       this.debuggerGUI.untraceBehavior(local__BehaviorDesc.behaviorID);
/*      */     }
/*      */   }
/*      */   
/*      */   void registerNegotiationThread(JointGoalNegotiationThread paramJointGoalNegotiationThread)
/*      */   {
/* 1486 */     if ((!$noassert) && (paramJointGoalNegotiationThread == null)) throw new AssertionError();
/* 1487 */     this.activeNegotiationThreads.add(paramJointGoalNegotiationThread);
/*      */   }
/*      */   
/*      */   void unregisterNegotiationThread(JointGoalNegotiationThread paramJointGoalNegotiationThread)
/*      */   {
/* 1492 */     if ((!$noassert) && (paramJointGoalNegotiationThread == null)) throw new AssertionError();
/* 1493 */     this.activeNegotiationThreads.remove(paramJointGoalNegotiationThread);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   Random randomGen;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean bCurrentLineOfExpansion;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean bStepConflicts;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected byte debugLevel;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected Debugger debuggerGUI;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean bDecisionCycleSMCall;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean asynchronousSenseCycle;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private Hashtable currentEntryNegotiators;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private List activeNegotiationThreads;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private Thread decisionCycleThread;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private boolean negotiatorCommittedDuringNegotiation;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private long continuousConditionTime;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private ShutdownHook shutdownHook;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private CollectionBehaviorWME rootCollectionBehaviorWME;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   SensedConditionMonitor senseMonitor;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   ActiveContinuousSensors activeSensors;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final ThreadGroup timeCheckThreads;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void queueIntentionToExit(BehavingEntity paramBehavingEntity, JointGoalStep paramJointGoalStep, int paramInt)
/*      */   {
/* 1605 */     registerNegotiationThread(new BehavingEntity.7(this, paramJointGoalStep.negotiator, paramJointGoalStep + " queueIntentionToExit(" + JointGoalNegotiator.formatIntention(paramInt) + ')', paramJointGoalStep, paramInt, paramBehavingEntity));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final InitiatedJointGoalStep getInitiatedJointGoalStep(CollectionBehavior paramCollectionBehavior, String paramString, Set paramSet, Object[] paramArrayOfObject, boolean paramBoolean)
/*      */   {
/* 1634 */     return new InitiatedJointGoalStep(paramCollectionBehavior, paramString, paramSet, paramArrayOfObject, paramBoolean);
/*      */   }
/*      */   
/*      */   private final InitiatedJointGoalStep getInitiatedJointGoalStepDebug(CollectionBehavior paramCollectionBehavior, String paramString, Set paramSet, Object[] paramArrayOfObject, boolean paramBoolean)
/*      */   {
/* 1639 */     return new InitiatedJointGoalStepDebug(paramCollectionBehavior, paramString, paramSet, paramArrayOfObject, paramBoolean, this.debugLevel);
/*      */   }
/*      */   
/*      */   void traceAblExecutionEvent(int paramInt1, Step paramStep, Object paramObject, int paramInt2, int paramInt3) {
/* 1643 */     this.debuggerGUI.traceAblExecutionEvent(paramInt1, paramStep, paramObject, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   void traceAblExecutionEvent(int paramInt1, __BehaviorDesc param__BehaviorDesc, Object paramObject, int paramInt2, int paramInt3) {
/* 1647 */     this.debuggerGUI.traceAblExecutionEvent(paramInt1, param__BehaviorDesc, paramObject, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   void printLeafSteps() {
/* 1651 */     Iterator localIterator = this.leafSteps.iterator();
/* 1652 */     System.err.println("Leaf steps for " + getBehavingEntityShortName());
/* 1653 */     while (localIterator.hasNext())
/* 1654 */       System.err.println("    " + localIterator.next());
/*      */   }
/*      */   
/*      */   void printExecutingSteps() {
/* 1658 */     Iterator localIterator = this.executingSteps.keySet().iterator();
/* 1659 */     System.err.println("Executing steps for " + getBehavingEntityShortName());
/* 1660 */     while (localIterator.hasNext())
/* 1661 */       System.err.println("    " + localIterator.next());
/*      */   }
/*      */   
/*      */   void printAtomicSteps() {
/* 1665 */     Iterator localIterator = this.atomicSteps.iterator();
/* 1666 */     System.err.println("Atomic steps for " + getBehavingEntityShortName());
/* 1667 */     while (localIterator.hasNext()) {
/* 1668 */       System.err.println("    " + localIterator.next());
/*      */     }
/*      */   }
/*      */   
/*      */   static final void printABTBranchUpwards(Step paramStep) {
/* 1673 */     while (paramStep != null) {
/* 1674 */       System.err.println(paramStep);
/* 1675 */       Behavior localBehavior = paramStep.getParent();
/* 1676 */       System.err.println(localBehavior);
/* 1677 */       paramStep = localBehavior.getParent();
/*      */     }
/*      */   }
/*      */   
/*      */   static final void printABTBranchUpwards(Behavior paramBehavior)
/*      */   {
/* 1683 */     if (paramBehavior != null) {
/* 1684 */       System.err.println(paramBehavior);
/* 1685 */       GoalStep localGoalStep = paramBehavior.getParent();
/* 1686 */       while (localGoalStep != null) {
/* 1687 */         System.err.println(localGoalStep);
/* 1688 */         paramBehavior = localGoalStep.getParent();
/* 1689 */         System.err.println(paramBehavior);
/* 1690 */         localGoalStep = paramBehavior.getParent();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   protected static void registerEntity(String paramString, BehavingEntity paramBehavingEntity)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_2
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: getstatic 118	abl/runtime/BehavingEntity:entityTable	Ljava/util/Hashtable;
/*      */     //   9: dup
/*      */     //   10: astore_2
/*      */     //   11: monitorenter
/*      */     //   12: getstatic 118	abl/runtime/BehavingEntity:entityTable	Ljava/util/Hashtable;
/*      */     //   15: aload_0
/*      */     //   16: aload_1
/*      */     //   17: invokevirtual 122	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   20: pop
/*      */     //   21: aload_2
/*      */     //   22: monitorexit
/*      */     //   23: return
/*      */     // Line number table:
/*      */     //   Java source line #326	-> byte code offset #0
/*      */     //   Java source line #327	-> byte code offset #12
/*      */     //   Java source line #329	-> byte code offset #23
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	24	0	paramString	String
/*      */     //   0	24	1	paramBehavingEntity	BehavingEntity
/*      */     //   3	19	2	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   12	23	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public static BehavingEntity getBehavingEntity(String paramString)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_1
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: getstatic 118	abl/runtime/BehavingEntity:entityTable	Ljava/util/Hashtable;
/*      */     //   9: dup
/*      */     //   10: astore_1
/*      */     //   11: monitorenter
/*      */     //   12: getstatic 118	abl/runtime/BehavingEntity:entityTable	Ljava/util/Hashtable;
/*      */     //   15: aload_0
/*      */     //   16: invokevirtual 128	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   19: checkcast 1	abl/runtime/BehavingEntity
/*      */     //   22: astore 4
/*      */     //   24: aload 4
/*      */     //   26: ifnonnull +27 -> 53
/*      */     //   29: new 129	abl/runtime/AblRuntimeError
/*      */     //   32: dup
/*      */     //   33: new 131	java/lang/StringBuffer
/*      */     //   36: dup
/*      */     //   37: ldc -123
/*      */     //   39: invokespecial 138	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
/*      */     //   42: aload_0
/*      */     //   43: invokevirtual 142	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*      */     //   46: invokevirtual 144	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*      */     //   49: invokespecial 145	abl/runtime/AblRuntimeError:<init>	(Ljava/lang/String;)V
/*      */     //   52: athrow
/*      */     //   53: aload 4
/*      */     //   55: aload_1
/*      */     //   56: monitorexit
/*      */     //   57: areturn
/*      */     // Line number table:
/*      */     //   Java source line #335	-> byte code offset #0
/*      */     //   Java source line #336	-> byte code offset #12
/*      */     //   Java source line #337	-> byte code offset #24
/*      */     //   Java source line #338	-> byte code offset #29
/*      */     //   Java source line #340	-> byte code offset #53
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	58	0	paramString	String
/*      */     //   3	53	1	Ljava/lang/Object;	Object
/*      */     //   22	32	4	localBehavingEntity	BehavingEntity
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   12	57	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   void printNegotiationThreads()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_1
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 336	abl/runtime/BehavingEntity:activeNegotiationThreads	Ljava/util/List;
/*      */     //   10: dup
/*      */     //   11: astore_1
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 336	abl/runtime/BehavingEntity:activeNegotiationThreads	Ljava/util/List;
/*      */     //   17: invokeinterface 337 1 0
/*      */     //   22: astore_3
/*      */     //   23: aload_3
/*      */     //   24: invokeinterface 245 1 0
/*      */     //   29: ifne +29 -> 58
/*      */     //   32: getstatic 343	java/lang/System:err	Ljava/io/PrintStream;
/*      */     //   35: new 131	java/lang/StringBuffer
/*      */     //   38: dup
/*      */     //   39: ldc_w 344
/*      */     //   42: invokespecial 138	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
/*      */     //   45: aload_0
/*      */     //   46: invokevirtual 100	abl/runtime/BehavingEntity:getBehavingEntityShortName	()Ljava/lang/String;
/*      */     //   49: invokevirtual 142	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*      */     //   52: invokevirtual 144	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*      */     //   55: invokevirtual 348	java/io/PrintStream:println	(Ljava/lang/String;)V
/*      */     //   58: goto +15 -> 73
/*      */     //   61: getstatic 343	java/lang/System:err	Ljava/io/PrintStream;
/*      */     //   64: aload_3
/*      */     //   65: invokeinterface 227 1 0
/*      */     //   70: invokevirtual 353	java/io/PrintStream:println	(Ljava/lang/Object;)V
/*      */     //   73: aload_3
/*      */     //   74: invokeinterface 245 1 0
/*      */     //   79: ifne -18 -> 61
/*      */     //   82: aload_1
/*      */     //   83: monitorexit
/*      */     //   84: return
/*      */     // Line number table:
/*      */     //   Java source line #529	-> byte code offset #0
/*      */     //   Java source line #530	-> byte code offset #13
/*      */     //   Java source line #531	-> byte code offset #23
/*      */     //   Java source line #532	-> byte code offset #32
/*      */     //   Java source line #533	-> byte code offset #58
/*      */     //   Java source line #534	-> byte code offset #61
/*      */     //   Java source line #533	-> byte code offset #73
/*      */     //   Java source line #536	-> byte code offset #84
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	85	0	this	BehavingEntity
/*      */     //   3	80	1	Ljava/lang/Object;	Object
/*      */     //   22	52	3	localIterator	Iterator
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	84	3	finally
/*      */   }
/*      */   
/*      */   protected void decisionCycleSMCall() {}
/*      */   
/*      */   /* Error */
/*      */   Hashtable negotiateEntry(JointGoalStep paramJointGoalStep, Object[] paramArrayOfObject)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: invokestatic 154	java/lang/Thread:currentThread	()Ljava/lang/Thread;
/*      */     //   3: checkcast 359	abl/runtime/JointGoalNegotiationThread
/*      */     //   6: astore_3
/*      */     //   7: goto +7 -> 14
/*      */     //   10: aload 5
/*      */     //   12: monitorexit
/*      */     //   13: athrow
/*      */     //   14: aload_0
/*      */     //   15: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   18: dup
/*      */     //   19: astore 5
/*      */     //   21: monitorenter
/*      */     //   22: aload_1
/*      */     //   23: getfield 877	abl/runtime/JointGoalStep:negotiator	Labl/runtime/JointGoalNegotiator;
/*      */     //   26: invokevirtual 881	abl/runtime/JointGoalNegotiator:getUniqueEntryNegotiationID	()Ljava/lang/Long;
/*      */     //   29: astore 4
/*      */     //   31: aload_0
/*      */     //   32: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   35: aload 4
/*      */     //   37: aload_1
/*      */     //   38: invokevirtual 122	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   41: pop
/*      */     //   42: aload 5
/*      */     //   44: monitorexit
/*      */     //   45: aload_1
/*      */     //   46: getfield 877	abl/runtime/JointGoalStep:negotiator	Labl/runtime/JointGoalNegotiator;
/*      */     //   49: aload_2
/*      */     //   50: aload_1
/*      */     //   51: invokevirtual 886	abl/runtime/JointGoalNegotiator:negotiateEntry	([Ljava/lang/Object;Labl/runtime/JointGoalStep;)Ljava/util/Hashtable;
/*      */     //   54: astore 8
/*      */     //   56: goto +7 -> 63
/*      */     //   59: aload 5
/*      */     //   61: monitorexit
/*      */     //   62: athrow
/*      */     //   63: aload_0
/*      */     //   64: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   67: dup
/*      */     //   68: astore 5
/*      */     //   70: monitorenter
/*      */     //   71: aload_0
/*      */     //   72: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   75: aload 4
/*      */     //   77: invokevirtual 888	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   80: pop
/*      */     //   81: aload 5
/*      */     //   83: monitorexit
/*      */     //   84: aload 8
/*      */     //   86: areturn
/*      */     // Line number table:
/*      */     //   Java source line #1503	-> byte code offset #0
/*      */     //   Java source line #1505	-> byte code offset #7
/*      */     //   Java source line #1506	-> byte code offset #7
/*      */     //   Java source line #1507	-> byte code offset #22
/*      */     //   Java source line #1508	-> byte code offset #31
/*      */     //   Java source line #1511	-> byte code offset #45
/*      */     //   Java source line #1512	-> byte code offset #56
/*      */     //   Java source line #1513	-> byte code offset #71
/*      */     //   Java source line #1515	-> byte code offset #84
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	87	0	this	BehavingEntity
/*      */     //   0	87	1	paramJointGoalStep	JointGoalStep
/*      */     //   0	87	2	paramArrayOfObject	Object[]
/*      */     //   6	1	3	localJointGoalNegotiationThread	JointGoalNegotiationThread
/*      */     //   29	47	4	localLong	Long
/*      */     //   10	1	5	localObject1	Object
/*      */     //   19	63	5	Ljava/lang/Object;	Object
/*      */     //   54	31	8	localHashtable	Hashtable
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   10	13	10	finally
/*      */     //   22	45	10	finally
/*      */     //   59	62	59	finally
/*      */     //   71	84	59	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public void queueIntentionToEnter(Long paramLong, BehavingEntity paramBehavingEntity, Object[] paramArrayOfObject, boolean paramBoolean, Set paramSet, JointGoalStep paramJointGoalStep)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +7 -> 7
/*      */     //   3: aload 8
/*      */     //   5: monitorexit
/*      */     //   6: athrow
/*      */     //   7: aload_0
/*      */     //   8: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   11: dup
/*      */     //   12: astore 8
/*      */     //   14: monitorenter
/*      */     //   15: aload_0
/*      */     //   16: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   19: aload_1
/*      */     //   20: invokevirtual 128	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   23: checkcast 732	abl/runtime/JointGoalStep
/*      */     //   26: astore 7
/*      */     //   28: aload 7
/*      */     //   30: ifnonnull +64 -> 94
/*      */     //   33: aload_0
/*      */     //   34: getfield 295	abl/runtime/BehavingEntity:debugLevel	B
/*      */     //   37: ifne +26 -> 63
/*      */     //   40: aload_0
/*      */     //   41: aload_0
/*      */     //   42: invokevirtual 892	abl/runtime/BehavingEntity:getRootCollectionBehavior	()Labl/runtime/CollectionBehavior;
/*      */     //   45: aload 6
/*      */     //   47: invokevirtual 893	abl/runtime/JointGoalStep:getSignature	()Ljava/lang/String;
/*      */     //   50: aload 5
/*      */     //   52: aload_3
/*      */     //   53: iload 4
/*      */     //   55: invokespecial 897	abl/runtime/BehavingEntity:getInitiatedJointGoalStep	(Labl/runtime/CollectionBehavior;Ljava/lang/String;Ljava/util/Set;[Ljava/lang/Object;Z)Labl/runtime/InitiatedJointGoalStep;
/*      */     //   58: astore 7
/*      */     //   60: goto +23 -> 83
/*      */     //   63: aload_0
/*      */     //   64: aload_0
/*      */     //   65: invokevirtual 892	abl/runtime/BehavingEntity:getRootCollectionBehavior	()Labl/runtime/CollectionBehavior;
/*      */     //   68: aload 6
/*      */     //   70: invokevirtual 893	abl/runtime/JointGoalStep:getSignature	()Ljava/lang/String;
/*      */     //   73: aload 5
/*      */     //   75: aload_3
/*      */     //   76: iload 4
/*      */     //   78: invokespecial 900	abl/runtime/BehavingEntity:getInitiatedJointGoalStepDebug	(Labl/runtime/CollectionBehavior;Ljava/lang/String;Ljava/util/Set;[Ljava/lang/Object;Z)Labl/runtime/InitiatedJointGoalStep;
/*      */     //   81: astore 7
/*      */     //   83: aload_0
/*      */     //   84: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   87: aload_1
/*      */     //   88: aload 7
/*      */     //   90: invokevirtual 122	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   93: pop
/*      */     //   94: aload 8
/*      */     //   96: monitorexit
/*      */     //   97: aload 7
/*      */     //   99: astore 10
/*      */     //   101: new 901	abl/runtime/BehavingEntity$5
/*      */     //   104: dup
/*      */     //   105: aload_0
/*      */     //   106: aload 10
/*      */     //   108: getfield 877	abl/runtime/JointGoalStep:negotiator	Labl/runtime/JointGoalNegotiator;
/*      */     //   111: new 131	java/lang/StringBuffer
/*      */     //   114: dup
/*      */     //   115: invokespecial 191	java/lang/StringBuffer:<init>	()V
/*      */     //   118: aload 10
/*      */     //   120: invokevirtual 308	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
/*      */     //   123: ldc_w 903
/*      */     //   126: invokevirtual 142	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*      */     //   129: invokevirtual 144	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*      */     //   132: aload_1
/*      */     //   133: aload_2
/*      */     //   134: aload_3
/*      */     //   135: iload 4
/*      */     //   137: aload 5
/*      */     //   139: aload 6
/*      */     //   141: aload 10
/*      */     //   143: invokespecial 907	abl/runtime/BehavingEntity$5:<init>	(Labl/runtime/BehavingEntity;Labl/runtime/JointGoalNegotiator;Ljava/lang/String;Ljava/lang/Long;Labl/runtime/BehavingEntity;[Ljava/lang/Object;ZLjava/util/Set;Labl/runtime/JointGoalStep;Labl/runtime/JointGoalStep;)V
/*      */     //   146: astore 11
/*      */     //   148: aload_0
/*      */     //   149: aload 11
/*      */     //   151: invokevirtual 909	abl/runtime/BehavingEntity:registerNegotiationThread	(Labl/runtime/JointGoalNegotiationThread;)V
/*      */     //   154: return
/*      */     // Line number table:
/*      */     //   Java source line #1525	-> byte code offset #0
/*      */     //   Java source line #1526	-> byte code offset #0
/*      */     //   Java source line #1527	-> byte code offset #15
/*      */     //   Java source line #1528	-> byte code offset #28
/*      */     //   Java source line #1532	-> byte code offset #33
/*      */     //   Java source line #1533	-> byte code offset #40
/*      */     //   Java source line #1535	-> byte code offset #63
/*      */     //   Java source line #1536	-> byte code offset #83
/*      */     //   Java source line #1539	-> byte code offset #97
/*      */     //   Java source line #1545	-> byte code offset #101
/*      */     //   Java source line #1552	-> byte code offset #148
/*      */     //   Java source line #1553	-> byte code offset #154
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	155	0	this	BehavingEntity
/*      */     //   0	155	1	paramLong	Long
/*      */     //   0	155	2	paramBehavingEntity	BehavingEntity
/*      */     //   0	155	3	paramArrayOfObject	Object[]
/*      */     //   0	155	4	paramBoolean	boolean
/*      */     //   0	155	5	paramSet	Set
/*      */     //   0	155	6	paramJointGoalStep	JointGoalStep
/*      */     //   26	72	7	localObject1	Object
/*      */     //   3	92	8	Ljava/lang/Object;	Object
/*      */     //   99	43	10	localObject2	Object
/*      */     //   146	4	11	local5	BehavingEntity.5
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	6	3	finally
/*      */     //   15	97	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public void queueIntentionToRefuseEntry(Long paramLong, BehavingEntity paramBehavingEntity, Set paramSet)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +7 -> 7
/*      */     //   3: aload 5
/*      */     //   5: monitorexit
/*      */     //   6: athrow
/*      */     //   7: aload_0
/*      */     //   8: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   11: dup
/*      */     //   12: astore 5
/*      */     //   14: monitorenter
/*      */     //   15: aload_0
/*      */     //   16: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   19: aload_1
/*      */     //   20: invokevirtual 128	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   23: checkcast 732	abl/runtime/JointGoalStep
/*      */     //   26: astore 4
/*      */     //   28: aload 4
/*      */     //   30: ifnonnull +56 -> 86
/*      */     //   33: aload_0
/*      */     //   34: getfield 295	abl/runtime/BehavingEntity:debugLevel	B
/*      */     //   37: ifne +22 -> 59
/*      */     //   40: aload_0
/*      */     //   41: aload_0
/*      */     //   42: invokevirtual 892	abl/runtime/BehavingEntity:getRootCollectionBehavior	()Labl/runtime/CollectionBehavior;
/*      */     //   45: ldc_w 912
/*      */     //   48: aload_3
/*      */     //   49: aconst_null
/*      */     //   50: iconst_0
/*      */     //   51: invokespecial 897	abl/runtime/BehavingEntity:getInitiatedJointGoalStep	(Labl/runtime/CollectionBehavior;Ljava/lang/String;Ljava/util/Set;[Ljava/lang/Object;Z)Labl/runtime/InitiatedJointGoalStep;
/*      */     //   54: astore 4
/*      */     //   56: goto +19 -> 75
/*      */     //   59: aload_0
/*      */     //   60: aload_0
/*      */     //   61: invokevirtual 892	abl/runtime/BehavingEntity:getRootCollectionBehavior	()Labl/runtime/CollectionBehavior;
/*      */     //   64: ldc_w 912
/*      */     //   67: aload_3
/*      */     //   68: aconst_null
/*      */     //   69: iconst_0
/*      */     //   70: invokespecial 900	abl/runtime/BehavingEntity:getInitiatedJointGoalStepDebug	(Labl/runtime/CollectionBehavior;Ljava/lang/String;Ljava/util/Set;[Ljava/lang/Object;Z)Labl/runtime/InitiatedJointGoalStep;
/*      */     //   73: astore 4
/*      */     //   75: aload_0
/*      */     //   76: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   79: aload_1
/*      */     //   80: aload 4
/*      */     //   82: invokevirtual 122	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   85: pop
/*      */     //   86: aload 5
/*      */     //   88: monitorexit
/*      */     //   89: aload 4
/*      */     //   91: astore 7
/*      */     //   93: new 914	abl/runtime/BehavingEntity$6
/*      */     //   96: dup
/*      */     //   97: aload_0
/*      */     //   98: aload 7
/*      */     //   100: getfield 877	abl/runtime/JointGoalStep:negotiator	Labl/runtime/JointGoalNegotiator;
/*      */     //   103: new 131	java/lang/StringBuffer
/*      */     //   106: dup
/*      */     //   107: invokespecial 191	java/lang/StringBuffer:<init>	()V
/*      */     //   110: aload 7
/*      */     //   112: invokevirtual 308	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
/*      */     //   115: ldc_w 916
/*      */     //   118: invokevirtual 142	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*      */     //   121: invokevirtual 144	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*      */     //   124: aload_1
/*      */     //   125: aload_2
/*      */     //   126: aload 7
/*      */     //   128: invokespecial 920	abl/runtime/BehavingEntity$6:<init>	(Labl/runtime/BehavingEntity;Labl/runtime/JointGoalNegotiator;Ljava/lang/String;Ljava/lang/Long;Labl/runtime/BehavingEntity;Labl/runtime/JointGoalStep;)V
/*      */     //   131: astore 8
/*      */     //   133: aload_0
/*      */     //   134: aload 8
/*      */     //   136: invokevirtual 909	abl/runtime/BehavingEntity:registerNegotiationThread	(Labl/runtime/JointGoalNegotiationThread;)V
/*      */     //   139: return
/*      */     // Line number table:
/*      */     //   Java source line #1560	-> byte code offset #0
/*      */     //   Java source line #1561	-> byte code offset #0
/*      */     //   Java source line #1562	-> byte code offset #15
/*      */     //   Java source line #1563	-> byte code offset #28
/*      */     //   Java source line #1568	-> byte code offset #33
/*      */     //   Java source line #1569	-> byte code offset #40
/*      */     //   Java source line #1571	-> byte code offset #59
/*      */     //   Java source line #1572	-> byte code offset #75
/*      */     //   Java source line #1575	-> byte code offset #89
/*      */     //   Java source line #1580	-> byte code offset #93
/*      */     //   Java source line #1587	-> byte code offset #133
/*      */     //   Java source line #1588	-> byte code offset #139
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	140	0	this	BehavingEntity
/*      */     //   0	140	1	paramLong	Long
/*      */     //   0	140	2	paramBehavingEntity	BehavingEntity
/*      */     //   0	140	3	paramSet	Set
/*      */     //   26	64	4	localObject1	Object
/*      */     //   3	84	5	Ljava/lang/Object;	Object
/*      */     //   91	36	7	localObject2	Object
/*      */     //   131	4	8	local6	BehavingEntity.6
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	6	3	finally
/*      */     //   15	89	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public void terminateEntryNegotiation(Long paramLong)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_2
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   10: dup
/*      */     //   11: astore_2
/*      */     //   12: monitorenter
/*      */     //   13: getstatic 567	abl/runtime/BehavingEntity:$noassert	Z
/*      */     //   16: ifne +22 -> 38
/*      */     //   19: aload_0
/*      */     //   20: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   23: aload_1
/*      */     //   24: invokevirtual 128	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   27: ifnonnull +11 -> 38
/*      */     //   30: new 568	java/lang/AssertionError
/*      */     //   33: dup
/*      */     //   34: invokespecial 570	java/lang/AssertionError:<init>	()V
/*      */     //   37: athrow
/*      */     //   38: aload_0
/*      */     //   39: getfield 873	abl/runtime/BehavingEntity:currentEntryNegotiators	Ljava/util/Hashtable;
/*      */     //   42: aload_1
/*      */     //   43: invokevirtual 888	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   46: pop
/*      */     //   47: aload_2
/*      */     //   48: monitorexit
/*      */     //   49: return
/*      */     // Line number table:
/*      */     //   Java source line #1592	-> byte code offset #0
/*      */     //   Java source line #1593	-> byte code offset #13
/*      */     //   Java source line #1594	-> byte code offset #38
/*      */     //   Java source line #1596	-> byte code offset #49
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	50	0	this	BehavingEntity
/*      */     //   0	50	1	paramLong	Long
/*      */     //   3	45	2	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	49	3	finally
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\BehavingEntity.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */