/*     */ package abl.runtime;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ public class GoalStep extends ExecutableStep {
/*     */   public static final short SUBGOAL = 0;
/*     */   public static final short SPAWNGOAL_DEFAULT = 1;
/*     */   public static final short SPAWNGOAL_AT_NODE = 2;
/*     */   protected Behavior child;
/*     */   private String signature;
/*     */   private short goalExecutionType;
/*     */   protected java.util.HashSet failedBehaviors;
/*     */   
/*  14 */   private final void jdMethod_this() { this.child = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  26 */     this.goalExecutionType = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  34 */     this.failedBehaviors = new java.util.HashSet();
/*     */     
/*  36 */     this.changes = new java.beans.PropertyChangeSupport(this);
/*     */     
/*  38 */     this.succeeding = false;
/*     */     
/*  40 */     this.currentNegotiationThread = null;
/*     */     
/*     */ 
/*     */ 
/*  44 */     this.rerootParent = null;
/*     */     
/*     */ 
/*     */ 
/*  48 */     this.rerooted = false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GoalStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString)
/*     */   {
/*  57 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, (short)1, paramArrayOfString);jdMethod_this();
/*     */     
/*     */ 
/*  60 */     this.signature = paramString2;
/*  61 */     this.name = this.signature.substring(0, this.signature.indexOf("("));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GoalStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString, short paramShort3)
/*     */   {
/*  72 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, (short)1, paramArrayOfString);jdMethod_this();
/*     */     
/*     */ 
/*  75 */     this.signature = paramString2;
/*  76 */     this.name = this.signature.substring(0, this.signature.indexOf("("));
/*  77 */     this.goalExecutionType = paramShort3;
/*     */   }
/*     */   
/*     */   String getSignature() {
/*  81 */     return this.signature;
/*     */   }
/*     */   
/*  84 */   short getGoalExecutionType() { return this.goalExecutionType; }
/*     */   
/*     */   boolean getRerooted() {
/*  87 */     return this.rerooted;
/*     */   }
/*     */   
/*  90 */   boolean isJointGoal() { return false; }
/*     */   
/*     */   protected void addFailedBehavior(Behavior paramBehavior) {
/*  93 */     this.failedBehaviors.add(new Integer(paramBehavior.getID()));
/*     */   }
/*     */   
/*     */   private static final String formatAction(int paramInt) {
/*  97 */     switch (paramInt) {
/*  98 */     case 1:  return "SUCCEED";
/*  99 */     case 2:  return "FAIL";
/* 100 */     case 3:  return "RESET"; }
/* 101 */     return "INVALID_ACTION";
/*     */   }
/*     */   
/*     */   private class NegotiateSubtreeRemovalThread extends JointGoalNegotiationThread { static final int INVALID_ACTION = 0;
/*     */     static final int SUCCEED = 1;
/*     */     static final int FAIL = 2;
/*     */     static final int RESET = 3;
/*     */     private java.util.List jointGoals;
/*     */     private int actionOnCommit;
/*     */     private static final boolean $noassert = Class.forName("[Labl.runtime.GoalStep;").getComponentType().desiredAssertionStatus() ^ true;
/*     */     
/* 112 */     private final void jdMethod_this() { this.jointGoals = new java.util.Vector(0);
/* 113 */       this.actionOnCommit = 0;
/*     */     }
/*     */     
/*     */     NegotiateSubtreeRemovalThread(java.util.List paramList, int paramInt) {
/* 117 */       super(GoalStep.this + " NegotiateSubtreeRemovalThread(" + GoalStep.formatAction(paramInt) + ')');jdMethod_this();
/* 118 */       if ((!$noassert) && ((paramInt <= 0) || (paramInt > 3))) { throw new AssertionError();
/*     */       }
/* 120 */       this.jointGoals = paramList;
/* 121 */       this.actionOnCommit = paramInt;
/*     */     }
/*     */     
/* 124 */     int getActionOnCommit() { return this.actionOnCommit; }
/*     */     
/*     */     public void run()
/*     */     {
/* 128 */       java.util.Iterator localIterator = this.jointGoals.iterator();
/* 129 */       while (localIterator.hasNext()) {
/* 130 */         JointGoalStep localJointGoalStep = (JointGoalStep)localIterator.next();
/* 131 */         if ((localJointGoalStep.negotiator != null) && (localJointGoalStep.negotiator.getState() != 7) && (localJointGoalStep.negotiator.getState() != 9) && (localJointGoalStep.negotiator.getState() != 16))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 136 */           ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 143 */       switch (this.actionOnCommit) {
/*     */       case 1: 
/* 145 */         GoalStep.this.succeedStepSuper();
/* 146 */         break;
/*     */       case 2: 
/* 148 */         GoalStep.this.failStepSuper();
/* 149 */         break;
/*     */       case 3: 
/* 151 */         GoalStep.this.resetStepBody();
/* 152 */         break;
/*     */       default: 
/* 154 */         throw new AblRuntimeError("Unexpected action type " + this.actionOnCommit);
/*     */       }
/*     */       
/*     */     }
/*     */   }
/*     */   
/* 160 */   private final void succeedStepSuper() { super.succeedStep(); }
/* 161 */   private final void failStepSuper() { super.failStep(); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void succeedStep()
/*     */   {
/* 168 */     this.succeeding = true;
/*     */     
/* 170 */     if (!isJointGoal())
/*     */     {
/*     */ 
/* 173 */       java.util.List localList = freezeSubtreeAndNegotiateRemoval();
/* 174 */       if (!localList.isEmpty())
/*     */       {
/*     */ 
/* 177 */         if ((this.currentNegotiationThread == null) || (this.currentNegotiationThread.getActionOnCommit() != 1))
/*     */         {
/*     */ 
/*     */ 
/* 181 */           NegotiateSubtreeRemovalThread localNegotiateSubtreeRemovalThread = new NegotiateSubtreeRemovalThread(localList, 1);
/*     */           
/* 183 */           if (this.currentNegotiationThread != null)
/* 184 */             BehavingEntity.getBehavingEntity().unregisterNegotiationThread(this.currentNegotiationThread);
/* 185 */           BehavingEntity.getBehavingEntity().registerNegotiationThread(localNegotiateSubtreeRemovalThread);
/* 186 */           this.currentNegotiationThread = localNegotiateSubtreeRemovalThread;
/*     */         }
/*     */         
/*     */       }
/*     */       else {
/* 191 */         super.succeedStep();
/*     */       }
/*     */     }
/*     */     else {
/* 195 */       if (this.child != null)
/*     */       {
/*     */ 
/* 198 */         this.child.removeChildren();
/*     */       }
/* 200 */       super.succeedStep();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void failStep()
/*     */   {
/* 208 */     if (!isJointGoal())
/*     */     {
/*     */ 
/* 211 */       java.util.List localList = freezeSubtreeAndNegotiateRemoval();
/* 212 */       if (!localList.isEmpty())
/*     */       {
/*     */ 
/* 215 */         if ((this.currentNegotiationThread == null) || (this.currentNegotiationThread.getActionOnCommit() != 2))
/*     */         {
/*     */ 
/*     */ 
/* 219 */           NegotiateSubtreeRemovalThread localNegotiateSubtreeRemovalThread = new NegotiateSubtreeRemovalThread(localList, 2);
/*     */           
/* 221 */           if (this.currentNegotiationThread != null)
/* 222 */             BehavingEntity.getBehavingEntity().unregisterNegotiationThread(this.currentNegotiationThread);
/* 223 */           BehavingEntity.getBehavingEntity().registerNegotiationThread(localNegotiateSubtreeRemovalThread);
/* 224 */           this.currentNegotiationThread = localNegotiateSubtreeRemovalThread;
/*     */         }
/*     */         
/*     */       }
/*     */       else {
/* 229 */         super.failStep();
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/* 234 */       super.failStep();
/*     */     }
/*     */   }
/*     */   
/*     */   void resetStep() {
/* 239 */     if (!isJointGoal())
/*     */     {
/*     */ 
/* 242 */       java.util.List localList = freezeSubtreeAndNegotiateRemoval();
/* 243 */       if (!localList.isEmpty())
/*     */       {
/*     */ 
/* 246 */         if ((this.currentNegotiationThread == null) || (this.currentNegotiationThread.getActionOnCommit() != 3))
/*     */         {
/*     */ 
/*     */ 
/* 250 */           NegotiateSubtreeRemovalThread localNegotiateSubtreeRemovalThread = new NegotiateSubtreeRemovalThread(localList, 3);
/*     */           
/* 252 */           if (this.currentNegotiationThread != null)
/* 253 */             BehavingEntity.getBehavingEntity().unregisterNegotiationThread(this.currentNegotiationThread);
/* 254 */           BehavingEntity.getBehavingEntity().registerNegotiationThread(localNegotiateSubtreeRemovalThread);
/* 255 */           this.currentNegotiationThread = localNegotiateSubtreeRemovalThread;
/*     */         }
/*     */         
/*     */ 
/*     */       }
/*     */       else {
/* 261 */         resetStepBody();
/*     */       }
/*     */     }
/*     */     else {
/* 265 */       resetStepBody();
/*     */     }
/*     */   }
/*     */   
/*     */   private final void resetStepBody()
/*     */   {
/* 271 */     removeChild(true);
/* 272 */     this.failedBehaviors.clear();
/* 273 */     BehavingEntity.getBehavingEntity().resetStep(this);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void addChild(Behavior paramBehavior)
/*     */   {
/* 280 */     if (paramBehavior == null)
/* 281 */       throw new AblRuntimeError("Null ABTNode passed to addChild().");
/* 282 */     if (this.child != null)
/* 283 */       throw new AblRuntimeError("addChild() called on a GoalStep with non-null child.");
/* 284 */     this.child = paramBehavior;
/* 285 */     BehavingEntity.getBehavingEntity().addBehavior(this.child);
/* 286 */     this.changes.firePropertyChange("child", null, paramBehavior);
/* 287 */     this.child.addChildren();
/*     */   }
/*     */   
/*     */   void removeGoal()
/*     */   {
/* 292 */     removeChild(true);
/*     */   }
/*     */   
/*     */   void removeChild(boolean paramBoolean)
/*     */   {
/* 297 */     if (this.child != null) {
/* 298 */       if (paramBoolean)
/*     */       {
/*     */ 
/* 301 */         this.child.removeBehavior();
/*     */       }
/*     */       
/* 304 */       this.changes.firePropertyChange("child", this.child, null);
/* 305 */       this.child = null;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   boolean isExecuting()
/*     */   {
/* 313 */     if ((isExpanded()) && (!isSuspended())) {
/* 314 */       return true;
/*     */     }
/* 316 */     return false;
/*     */   }
/*     */   
/*     */   boolean isExpanded()
/*     */   {
/* 321 */     if (this.child != null) {
/* 322 */       return true;
/*     */     }
/* 324 */     return false;
/*     */   }
/*     */   
/*     */   protected final void executeBookkeeping()
/*     */   {
/* 329 */     int i = this.parent.getBehaviorType();
/* 330 */     if ((i == 1) || (i == 2)) {
/* 331 */       ((MultiStepBehavior)this.parent).pursueGoal(this);
/*     */     }
/* 333 */     super.executeBookkeeping();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final void rerootGoal(MultiStepBehaviorWME paramMultiStepBehaviorWME)
/*     */   {
/* 340 */     succeedStep();
/*     */     
/*     */ 
/* 343 */     if (paramMultiStepBehaviorWME == null)
/*     */     {
/* 345 */       this.parent = BehavingEntity.getBehavingEntity().getRootCollectionBehavior();
/*     */     }
/*     */     else {
/* 348 */       Behavior localBehavior = paramMultiStepBehaviorWME.getBehavior();
/* 349 */       if (localBehavior == null)
/*     */       {
/* 351 */         System.err.println("WARNING: unexected NULL behavior when attempting to reroot goal " + this + " at behavior " + paramMultiStepBehaviorWME + ". Failing the step");
/* 352 */         failStep();
/* 353 */         return;
/*     */       }
/*     */       
/* 356 */       this.parent = localBehavior;
/*     */     }
/* 358 */     ((MultiStepBehavior)this.parent).addChild(this);
/*     */   }
/*     */   
/*     */   private java.beans.PropertyChangeSupport changes;
/*     */   private boolean succeeding;
/*     */   private NegotiateSubtreeRemovalThread currentNegotiationThread;
/*     */   private Object[] args;
/*     */   private MultiStepBehaviorWME rerootParent;
/*     */   private boolean rerooted;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.GoalStep;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   void chooseBehavior(Object[] paramArrayOfObject)
/*     */   {
/* 370 */     Behavior localBehavior = BehavingEntity.getBehavingEntity().chooseIndividualBehavior(paramArrayOfObject, this.failedBehaviors, this);
/*     */     
/* 372 */     if (localBehavior != null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 378 */       if ((!$noassert) && (localBehavior.isJointBehavior())) { throw new AssertionError();
/*     */       }
/* 380 */       addChild(localBehavior);
/* 381 */       executeBookkeeping();
/*     */     }
/*     */     else
/*     */     {
/* 385 */       failStep();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   boolean currentLineOfExpansion(GoalStep paramGoalStep)
/*     */   {
/* 396 */     return this.parent.currentLineOfExpansion(this);
/*     */   }
/*     */   
/*     */ 
/*     */   void suspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 402 */     suspend(paramExecutableStep, true);
/*     */   }
/*     */   
/*     */   void suspend(ExecutableStep paramExecutableStep, boolean paramBoolean)
/*     */   {
/* 407 */     if (!isSuspended())
/*     */     {
/* 409 */       BehavingEntity.getBehavingEntity().suspendStep(this); }
/* 410 */     super.suspend(paramExecutableStep);
/* 411 */     if ((paramBoolean) && 
/* 412 */       (this.child != null)) {
/* 413 */       this.child.suspend(paramExecutableStep);
/*     */     }
/*     */   }
/*     */   
/*     */   void suspendSkipJointGoals(ExecutableStep paramExecutableStep)
/*     */   {
/* 419 */     if (!isSuspended())
/*     */     {
/* 421 */       BehavingEntity.getBehavingEntity().suspendStep(this); }
/* 422 */     super.suspend(paramExecutableStep);
/* 423 */     if (this.child != null) {
/* 424 */       this.child.suspendSkipJointGoals(paramExecutableStep);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void metaSuspend()
/*     */   {
/* 431 */     metaSuspend(true);
/*     */   }
/*     */   
/*     */   void metaSuspend(boolean paramBoolean)
/*     */   {
/* 436 */     if (!isSuspended())
/* 437 */       BehavingEntity.getBehavingEntity().suspendStep(this);
/* 438 */     super.metaSuspend();
/* 439 */     if ((paramBoolean) && 
/* 440 */       (this.child != null)) {
/* 441 */       this.child.metaSuspend();
/*     */     }
/*     */   }
/*     */   
/*     */   void metaSuspendSkipJointGoals() {
/* 446 */     if (!isSuspended())
/* 447 */       BehavingEntity.getBehavingEntity().suspendStep(this);
/* 448 */     super.metaSuspend();
/* 449 */     if (this.child != null) {
/* 450 */       this.child.metaSuspendSkipJointGoals();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void jointSuspend()
/*     */   {
/* 457 */     if (!isSuspended())
/* 458 */       BehavingEntity.getBehavingEntity().suspendStep(this);
/* 459 */     super.jointSuspend();
/*     */   }
/*     */   
/*     */ 
/*     */   void unsuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 465 */     super.unsuspend(paramExecutableStep);
/* 466 */     if (!isSuspended()) {
/* 467 */       BehavingEntity.getBehavingEntity().unsuspendStep(this);
/*     */     }
/*     */   }
/*     */   
/*     */   void metaUnsuspend()
/*     */   {
/* 473 */     super.metaUnsuspend();
/* 474 */     if (!isSuspended())
/* 475 */       BehavingEntity.getBehavingEntity().unsuspendStep(this);
/* 476 */     if (this.child != null) {
/* 477 */       this.child.metaUnsuspend();
/*     */     }
/*     */   }
/*     */   
/*     */   void jointUnsuspend() {
/* 482 */     super.jointUnsuspend();
/* 483 */     if (!isSuspended())
/* 484 */       BehavingEntity.getBehavingEntity().unsuspendStep(this);
/* 485 */     if (this.child != null)
/* 486 */       this.child.jointUnsuspend();
/*     */   }
/*     */   
/* 489 */   void addChildChangeListener(java.beans.PropertyChangeListener paramPropertyChangeListener) { this.changes.addPropertyChangeListener("child", paramPropertyChangeListener); }
/*     */   
/* 491 */   void removeChildChangeListener(java.beans.PropertyChangeListener paramPropertyChangeListener) { this.changes.removePropertyChangeListener("child", paramPropertyChangeListener); }
/*     */   
/*     */ 
/*     */   java.util.List freezeSubtreeAndNegotiateRemoval()
/*     */   {
/* 496 */     BehavingEntity.getBehavingEntity().removeSuccessTest(this);
/* 497 */     if (this.child != null) {
/* 498 */       return this.child.freezeSubtreeAndNegotiateRemoval();
/*     */     }
/* 500 */     return new java.util.Vector(0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   java.util.List negotiateSuspensionOfSubtree()
/*     */   {
/* 507 */     jointSuspend();
/* 508 */     if (this.child != null) {
/* 509 */       return this.child.negotiateSuspensionOfSubtree();
/*     */     }
/* 511 */     return new java.util.Vector(0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   java.util.List negotiateSuspensionOfSubtree(ExecutableStep paramExecutableStep)
/*     */   {
/* 518 */     if (paramExecutableStep != null) {
/* 519 */       suspend(paramExecutableStep, false);
/*     */     } else
/* 521 */       metaSuspend(false);
/* 522 */     if (this.child != null) {
/* 523 */       return this.child.negotiateSuspensionOfSubtree(paramExecutableStep);
/*     */     }
/* 525 */     return new java.util.Vector(0);
/*     */   }
/*     */   
/*     */   void processStepRemoval()
/*     */   {
/* 530 */     if (this.succeeding) {
/* 531 */       if ((this.goalExecutionType == 0) || (this.rerooted)) {
/* 532 */         super.processStepRemoval();
/*     */       }
/*     */       else {
/* 535 */         this.rerooted = true;
/* 536 */         this.succeeding = false;
/*     */       }
/*     */     }
/*     */     else {
/* 540 */       super.processStepRemoval();
/*     */     }
/*     */   }
/*     */   
/*     */   private final void bindArgs() {
/* 545 */     if (this.execute != null)
/*     */     {
/* 547 */       Object[] arrayOfObject1 = { new Integer(this.stepID), this.parent.getBehaviorVariableFrame(), BehavingEntity.getBehavingEntity() };
/*     */       try
/*     */       {
/* 550 */         Object[] arrayOfObject2 = (Object[])this.execute.invoke(null, arrayOfObject1);
/* 551 */         if (this.goalExecutionType != 2) {
/* 552 */           this.args = arrayOfObject2;
/*     */         }
/*     */         else
/*     */         {
/* 556 */           int i = arrayOfObject2.length - 1;
/* 557 */           this.args = new Object[i];
/* 558 */           for (int j = 0; j < i; j++) {
/* 559 */             this.args[j] = arrayOfObject2[(j + 1)];
/*     */           }
/* 561 */           this.rerootParent = ((MultiStepBehaviorWME)arrayOfObject2[0]);
/*     */         }
/* 563 */       } catch (Exception localException) { throw new AblRuntimeError("Error invoking execute", localException);
/*     */       }
/*     */     } else {
/* 566 */       this.args = null;
/*     */     }
/*     */   }
/*     */   
/*     */   void execute() {
/* 571 */     checkForConflictsOnExecution();
/* 572 */     if (!isSuspended()) {
/* 573 */       if (this.goalExecutionType != 0) {
/* 574 */         if (!this.rerooted) {
/* 575 */           bindArgs();
/*     */           
/*     */ 
/*     */ 
/* 579 */           rerootGoal(this.rerootParent);
/*     */         }
/*     */         else
/*     */         {
/* 583 */           chooseBehavior(this.args);
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 588 */         bindArgs();
/* 589 */         chooseBehavior(this.args);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\GoalStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */