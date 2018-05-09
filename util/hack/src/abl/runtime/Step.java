/*     */ package abl.runtime;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ public abstract class Step implements ABTNode
/*     */ {
/*     */   public static final short PRIMITIVE = 0;
/*     */   public static final short GOAL = 1;
/*     */   public static final short MENTAL = 2;
/*     */   public static final short WAIT = 3;
/*     */   public static final short FAIL = 4;
/*     */   public static final short SUCCEED = 5;
/*     */   public static final short EXECUTE_POLICY = 6;
/*     */   protected Behavior parent;
/*     */   private boolean persistent;
/*     */   private boolean persistentWhenSucceeds;
/*     */   private boolean persistentWhenFails;
/*     */   private boolean ignoreFailure;
/*     */   private boolean effectOnly;
/*     */   private boolean teamEffectOnly;
/*     */   private short priority;
/*     */   
/*     */   private final void jdMethod_this() {
/*  24 */     this.persistent = false;
/*  25 */     this.persistentWhenSucceeds = false;
/*  26 */     this.persistentWhenFails = false;
/*  27 */     this.ignoreFailure = false;
/*  28 */     this.effectOnly = false;
/*  29 */     this.teamEffectOnly = false;
/*  30 */     this.priority = Short.MIN_VALUE;
/*  31 */     this.priorityModifier = 0;
/*  32 */     this.isAtomic = false;
/*  33 */     this.post = false;
/*  34 */     this.postMemory = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  44 */     this.stepsSuspendingMe = new java.util.LinkedList();
/*     */     
/*     */ 
/*  47 */     this.stepsIHaveSuspended = new java.util.LinkedList();
/*     */     
/*     */ 
/*  50 */     this.metaSuspenderCount = 0;
/*     */     
/*     */ 
/*  53 */     this.jointSuspenderCount = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */     this.stepWME = null;
/*     */   }
/*     */   
/*     */   private short priorityModifier;
/*     */   private boolean isAtomic;
/*     */   private boolean post;
/*     */   private String postMemory;
/*     */   protected final Method execute;
/*     */   private final Method successTest;
/*     */   private final Method successTestSensorFactory;
/*     */   private final short stepType;
/*     */   protected final int stepID;
/*     */   protected java.util.List stepsSuspendingMe;
/*     */   protected java.util.List stepsIHaveSuspended;
/*     */   private int metaSuspenderCount;
/*     */   private int jointSuspenderCount;
/*     */   final AblNamedPropertySupport propertyTable;
/*     */   private StepWME stepWME;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.Step;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   public Step(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, short paramShort3) {
/*  79 */     jdMethod_this();
/*  80 */     this.stepID = paramInt;
/*  81 */     this.parent = paramBehavior;
/*  82 */     this.isAtomic = this.parent.isAtomic;
/*  83 */     this.persistent = paramBoolean1;
/*  84 */     this.persistentWhenSucceeds = paramBoolean2;
/*  85 */     this.persistentWhenFails = paramBoolean3;
/*  86 */     this.ignoreFailure = paramBoolean4;
/*  87 */     this.effectOnly = paramBoolean5;
/*  88 */     this.teamEffectOnly = paramBoolean6;
/*  89 */     this.priority = paramShort1;
/*  90 */     this.priorityModifier = paramShort2;
/*  91 */     this.post = paramBoolean7;
/*  92 */     this.postMemory = paramString;
/*  93 */     this.execute = paramMethod1;
/*  94 */     this.successTest = paramMethod2;
/*  95 */     this.successTestSensorFactory = paramMethod3;
/*  96 */     if (paramAblNamedPropertySupport != null) {
/*  97 */       this.propertyTable = paramAblNamedPropertySupport;
/*     */     } else {
/*  99 */       this.propertyTable = new AblNamedPropertySupport();
/*     */     }
/* 101 */     this.stepType = paramShort3;
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/*     */     String str;
/* 107 */     switch (getStepType()) {
/*     */     case 1: 
/* 109 */       if ((((GoalStep)this).getGoalExecutionType() != 0) && (!((GoalStep)this).getRerooted())) {
/* 110 */         str = "spawngoal " + ((GoalStep)this).getSignature();
/*     */       } else
/* 112 */         str = "subgoal " + ((GoalStep)this).getSignature();
/* 113 */       if (((GoalStep)this).isJointGoal())
/* 114 */         str = "joint " + str;
/* 115 */       break;
/*     */     case 0: 
/* 117 */       str = "act " + ((PrimitiveStep)this).name;
/* 118 */       break;
/*     */     case 3: 
/* 120 */       str = "wait";
/* 121 */       break;
/*     */     case 2: 
/* 123 */       str = "mental";
/* 124 */       break;
/*     */     case 4: 
/* 126 */       str = "fail_step";
/* 127 */       break;
/*     */     case 5: 
/* 129 */       str = "succeed_step";
/* 130 */       break;
/*     */     case 6: 
/* 132 */       str = "execute_policy";
/* 133 */       break;
/*     */     default: 
/* 135 */       return "UNEXPECTED STEP TYPE";
/*     */     }
/*     */     
/* 138 */     return str;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   final short getStepType()
/*     */   {
/* 147 */     return this.stepType;
/*     */   }
/*     */   
/* 150 */   final boolean getPersistent() { return this.persistent; }
/*     */   
/*     */   final boolean getPersistentWhenSucceeds() {
/* 153 */     return this.persistentWhenSucceeds;
/*     */   }
/*     */   
/* 156 */   final boolean getPersistentWhenFails() { return this.persistentWhenFails; }
/*     */   
/*     */ 
/* 159 */   final boolean getIgnoreFailure() { return this.ignoreFailure; }
/*     */   
/*     */   final boolean getHasSuccessTest() {
/* 162 */     if (this.successTest != null) {
/* 163 */       return true;
/*     */     }
/* 165 */     return false;
/*     */   }
/*     */   
/* 168 */   final boolean getEffectOnly() { return this.effectOnly; }
/*     */   
/*     */ 
/* 171 */   final boolean getTeamEffectOnly() { return this.teamEffectOnly; }
/*     */   
/*     */   final boolean getEffectOnlyOrTeamEffectOnly() {
/* 174 */     if ((this.effectOnly) || (this.teamEffectOnly)) 0; return true;
/*     */   }
/*     */   
/* 177 */   final short getPriority() { if (this.priority == Short.MIN_VALUE)
/*     */     {
/* 179 */       this.priority = ((short)(this.parent.getPriority() + this.priorityModifier));
/* 180 */       return this.priority;
/*     */     }
/*     */     
/* 183 */     return this.priority;
/*     */   }
/*     */   
/*     */   final short getPriorityModifier() {
/* 187 */     return this.priorityModifier;
/*     */   }
/*     */   
/* 190 */   final boolean getIsAtomic() { return this.isAtomic; }
/*     */   
/*     */   final java.util.List getStepsSuspendingMe() {
/* 193 */     return new java.util.Vector(this.stepsSuspendingMe);
/*     */   }
/*     */   
/* 196 */   final java.util.List getStepsIHaveSuspended() { return new java.util.Vector(this.stepsIHaveSuspended); }
/*     */   
/*     */   final Behavior getParent() {
/* 199 */     return this.parent;
/*     */   }
/*     */   
/* 202 */   final int getMetaSuspenderCount() { return this.metaSuspenderCount; }
/*     */   
/*     */ 
/*     */ 
/*     */   final void setPersistent(boolean paramBoolean)
/*     */   {
/* 208 */     this.persistent = paramBoolean;
/*     */   }
/*     */   
/* 211 */   final void setPersistentWhenSucceeds(boolean paramBoolean) { this.persistentWhenSucceeds = paramBoolean; }
/*     */   
/*     */   final void setPersistentWhenFails(boolean paramBoolean) {
/* 214 */     this.persistentWhenFails = paramBoolean;
/*     */   }
/*     */   
/* 217 */   final void setIgnoreFailure(boolean paramBoolean) { this.ignoreFailure = paramBoolean; }
/*     */   
/*     */   final void setEffectOnly(boolean paramBoolean) {
/* 220 */     this.effectOnly = paramBoolean;
/*     */   }
/*     */   
/* 223 */   final void setTeamEffectOnly(boolean paramBoolean) { this.teamEffectOnly = paramBoolean; }
/*     */   
/*     */   final void setPriority(short paramShort) {
/* 226 */     this.priority = paramShort;
/*     */   }
/*     */   
/* 229 */   final void setPriorityModifier(short paramShort) { this.priority = paramShort; }
/*     */   
/*     */ 
/*     */   boolean successTest()
/*     */   {
/* 234 */     if (this.successTest == null)
/*     */     {
/* 236 */       return false;
/*     */     }
/* 238 */     Object[] arrayOfObject = { new Integer(this.stepID), this.parent.getBehaviorVariableFrame(), BehavingEntity.getBehavingEntity() };
/*     */     try {
/* 240 */       Boolean localBoolean = (Boolean)this.successTest.invoke(null, arrayOfObject);
/* 241 */       return localBoolean.booleanValue();
/*     */     } catch (Exception localException) {
/* 243 */       throw new AblRuntimeError("Error invoking success test", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   final SensorActivation[] getSuccessTestSensorActivations()
/*     */   {
/* 256 */     if (this.successTestSensorFactory == null) {
/* 257 */       return null;
/*     */     }
/* 259 */     Object[] arrayOfObject = { new Integer(this.stepID) };
/*     */     try {
/* 261 */       return (SensorActivation[])this.successTestSensorFactory.invoke(null, arrayOfObject);
/*     */     } catch (Exception localException) {
/* 263 */       throw new AblRuntimeError("Error invoking success test sensor factory", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void executeBookkeeping()
/*     */   {
/* 275 */     BehavingEntity.getBehavingEntity().executeStep(this);
/*     */   }
/*     */   
/*     */   private final void postCompletionWME(int paramInt, String paramString) {
/* 279 */     if ((paramString != null) && 
/* 280 */       (!$noassert) && (wm.WorkingMemory.lookupRegisteredMemory(paramString) == null)) { throw new AssertionError("memory " + paramString + " does not exist.");
/*     */     }
/*     */     Object localObject;
/* 283 */     switch (getStepType()) {
/*     */     case 0: 
/* 285 */       localObject = new CompletedActWME(((PrimitiveStep)this).name, paramInt, this.parent.getSignature(), BehavingEntity.getBehavingEntity().getBehavingEntityShortName());
/* 286 */       break;
/*     */     case 1: 
/* 288 */       localObject = new CompletedGoalWME(((GoalStep)this).getSignature(), paramInt, this.parent.getSignature(), BehavingEntity.getBehavingEntity().getBehavingEntityShortName());
/* 289 */       break;
/*     */     case 2: 
/* 291 */       localObject = new CompletedMentalActWME(this.parent.getSignature(), BehavingEntity.getBehavingEntity().getBehavingEntityShortName());
/* 292 */       break;
/*     */     case 3: 
/* 294 */       localObject = new CompletedWaitWME(this.parent.getSignature(), BehavingEntity.getBehavingEntity().getBehavingEntityShortName());
/* 295 */       break;
/*     */     default: 
/* 297 */       throw new AblRuntimeError("Unexpected step type " + getStepType());
/*     */     }
/*     */     
/*     */     wm.WorkingMemory localWorkingMemory;
/* 301 */     if (paramString == null) {
/* 302 */       localWorkingMemory = BehavingEntity.getBehavingEntity().getWorkingMemory();
/*     */     } else {
/* 304 */       localWorkingMemory = wm.WorkingMemory.lookupRegisteredMemory(paramString);
/*     */     }
/* 306 */     localWorkingMemory.addWME((wm.WME)localObject);
/*     */   }
/*     */   
/*     */   void succeedStep()
/*     */   {
/* 311 */     if (this.post)
/*     */     {
/* 313 */       postCompletionWME(0, null); }
/* 314 */     if (this.postMemory != null)
/*     */     {
/* 316 */       postCompletionWME(0, this.postMemory);
/*     */     }
/* 318 */     if ((getPersistent()) || (getPersistentWhenSucceeds())) {
/* 319 */       resetStep();
/*     */     }
/*     */     else {
/* 322 */       this.parent.removeChild(this, true);
/* 323 */       Object localObject; if (this.parent.getBehaviorType() == 0) {
/* 324 */         localObject = ((SequentialBehavior)this.parent).getNextStep();
/* 325 */         if (localObject == null) {
/* 326 */           this.parent.succeedBehavior();
/*     */         }
/*     */         else
/* 329 */           ((SequentialBehavior)this.parent).addChild((Step)localObject);
/* 330 */       } else if (this.parent.getBehaviorType() == 3)
/*     */       {
/* 332 */         localObject = (AdaptiveBehavior)this.parent;
/* 333 */         ((AdaptiveBehavior)localObject).updatePolicy();
/* 334 */         ((AdaptiveBehavior)localObject).addChildren();
/* 335 */       } else if (((MultiStepBehavior)this.parent).isSuccessful())
/*     */       {
/*     */ 
/*     */ 
/* 339 */         this.parent.succeedBehavior();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void failStep()
/*     */   {
/* 346 */     if (this.post)
/*     */     {
/* 348 */       postCompletionWME(1, null); }
/* 349 */     if (this.postMemory != null)
/*     */     {
/* 351 */       postCompletionWME(1, this.postMemory);
/*     */     }
/* 353 */     if (getIgnoreFailure()) {
/* 354 */       succeedStep();
/* 355 */     } else if ((getPersistent()) || (getPersistentWhenFails())) {
/* 356 */       resetStep();
/*     */     } else {
/* 358 */       this.parent.removeChild(this, true);
/* 359 */       if (this.parent.getBehaviorType() == 2) {
/* 360 */         if (((MultiStepBehavior)this.parent).isSuccessful())
/* 361 */           this.parent.succeedBehavior();
/* 362 */       } else if (this.parent.getBehaviorType() == 3)
/*     */       {
/* 364 */         AdaptiveBehavior localAdaptiveBehavior = (AdaptiveBehavior)this.parent;
/* 365 */         localAdaptiveBehavior.updatePolicy();
/* 366 */         localAdaptiveBehavior.addChildren();
/* 367 */       } else if ((!getEffectOnly()) && (!getTeamEffectOnly())) {
/* 368 */         this.parent.failBehavior();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   boolean currentLineOfExpansion(GoalStep paramGoalStep)
/*     */   {
/* 382 */     return this.parent.currentLineOfExpansion(paramGoalStep);
/*     */   }
/*     */   
/*     */   void suspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 387 */     this.stepsSuspendingMe.add(paramExecutableStep);
/* 388 */     paramExecutableStep.suspenderFor(this);
/*     */   }
/*     */   
/*     */   void unsuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 393 */     this.stepsSuspendingMe.remove(paramExecutableStep);
/* 394 */     paramExecutableStep.unsuspenderFor(this);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void metaSuspend()
/*     */   {
/* 401 */     if ((!$noassert) && (this.metaSuspenderCount < 0)) throw new AssertionError();
/* 402 */     this.metaSuspenderCount += 1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void metaUnsuspend()
/*     */   {
/* 409 */     if ((!$noassert) && (this.metaSuspenderCount < 0)) { throw new AssertionError();
/*     */     }
/* 411 */     if (this.metaSuspenderCount > 0) {
/* 412 */       this.metaSuspenderCount -= 1;
/*     */     }
/*     */   }
/*     */   
/*     */   void jointSuspend() {
/* 417 */     if ((!$noassert) && (this.jointSuspenderCount < 0)) throw new AssertionError();
/* 418 */     this.jointSuspenderCount += 1;
/*     */   }
/*     */   
/*     */   void jointUnsuspend()
/*     */   {
/* 423 */     if ((!$noassert) && (this.jointSuspenderCount <= 0)) throw new AssertionError();
/* 424 */     this.jointSuspenderCount -= 1;
/*     */   }
/*     */   
/*     */   boolean isSuspended()
/*     */   {
/* 429 */     if ((!this.stepsSuspendingMe.isEmpty()) || (this.metaSuspenderCount > 0) || (this.jointSuspenderCount > 0)) {
/* 430 */       return true;
/*     */     }
/* 432 */     return false;
/*     */   }
/*     */   
/*     */   void updateStepsSuspendingMe()
/*     */   {
/* 437 */     ExecutableStep[] arrayOfExecutableStep = (ExecutableStep[])this.stepsSuspendingMe.toArray(new ExecutableStep[this.stepsSuspendingMe.size()]);
/* 438 */     for (int i = 0; i < arrayOfExecutableStep.length; i++) {
/* 439 */       arrayOfExecutableStep[i].unsuspenderFor(this);
/*     */     }
/*     */   }
/*     */   
/*     */   void setReflectionWME(StepWME paramStepWME)
/*     */   {
/* 445 */     if ((!$noassert) && (paramStepWME == null)) throw new AssertionError();
/* 446 */     this.stepWME = paramStepWME;
/*     */   }
/*     */   
/*     */   public StepWME getReflectionWME()
/*     */   {
/* 451 */     if ((BehavingEntity.getBehavingEntity().reflectionEnabled()) && (this.stepWME == null)) {
/* 452 */       System.err.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ UNEXPECTED NULL REFLECTION WME in " + BehavingEntity.getBehavingEntity());
/* 453 */       BehavingEntity.printABTBranchUpwards(this);
/* 454 */       throw new AblRuntimeError("Unexpected NULL Reflection WME in " + BehavingEntity.getBehavingEntity());
/*     */     }
/*     */     
/*     */ 
/* 458 */     return this.stepWME;
/*     */   }
/*     */   
/*     */   abstract void execute();
/*     */   
/*     */   abstract void resetStep();
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\Step.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */