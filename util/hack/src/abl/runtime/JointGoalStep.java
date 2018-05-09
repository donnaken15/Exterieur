/*     */ package abl.runtime;
/*     */ 
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class JointGoalStep extends GoalStep {
/*     */   JointGoalNegotiator negotiator;
/*     */   private boolean isNegotiating;
/*     */   protected boolean teamNeededForSuccess;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.JointGoalStep;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*  11 */   private final void jdMethod_this() { this.negotiator = null;
/*     */     
/*     */ 
/*  14 */     this.isNegotiating = false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JointGoalStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, java.lang.reflect.Method paramMethod1, java.lang.reflect.Method paramMethod2, java.lang.reflect.Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString, boolean paramBoolean8)
/*     */   {
/*  27 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramString2, paramArrayOfString);jdMethod_this();
/*     */     
/*     */ 
/*     */ 
/*  31 */     this.teamNeededForSuccess = paramBoolean8;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JointGoalStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, java.lang.reflect.Method paramMethod1, java.lang.reflect.Method paramMethod2, java.lang.reflect.Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString, short paramShort3, boolean paramBoolean8)
/*     */   {
/*  42 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramString2, paramArrayOfString, paramShort3);jdMethod_this();
/*     */     
/*     */ 
/*     */ 
/*  46 */     this.teamNeededForSuccess = paramBoolean8;
/*     */   }
/*     */   
/*     */   protected JointGoalNegotiator getNewJointGoalNegotiator(java.util.Hashtable paramHashtable)
/*     */   {
/*  51 */     return new JointGoalNegotiator(paramHashtable);
/*     */   }
/*     */   
/*     */   protected JointGoalNegotiator getNewJointGoalNegotiator(java.util.Set paramSet)
/*     */   {
/*  56 */     return new JointGoalNegotiator(paramSet, this);
/*     */   }
/*     */   
/*     */   protected JointGoalNegotiator getNewJointGoalNegotiator(java.util.Hashtable paramHashtable, int paramInt)
/*     */   {
/*  61 */     return new JointGoalNegotiator(paramHashtable, paramInt);
/*     */   }
/*     */   
/*     */   protected JointGoalNegotiator getNewJointGoalNegotiator(java.util.Set paramSet, boolean paramBoolean)
/*     */   {
/*  66 */     return new JointGoalNegotiator(paramSet, paramBoolean, this);
/*     */   }
/*     */   
/*     */   boolean isJointGoal() {
/*  70 */     return true;
/*     */   }
/*     */   
/*     */   java.util.Set getTeamMembers()
/*     */   {
/*  75 */     if (this.negotiator == null) {
/*  76 */       return null;
/*     */     }
/*  78 */     return this.negotiator.getTeamMembers();
/*     */   }
/*     */   
/*  81 */   synchronized boolean getIsNegotiating() { return this.isNegotiating; }
/*  82 */   synchronized void setIsNegotiating(boolean paramBoolean) { this.isNegotiating = paramBoolean; }
/*     */   
/*  84 */   boolean getTeamNeededForSuccess() { return this.teamNeededForSuccess; }
/*     */   
/*     */   void resetNegotiator(java.util.Hashtable paramHashtable, int paramInt)
/*     */   {
/*  88 */     this.negotiator = getNewJointGoalNegotiator(paramHashtable, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   void chooseBehavior(Object[] paramArrayOfObject)
/*     */   {
/*  94 */     Behavior localBehavior = BehavingEntity.getBehavingEntity().chooseJointBehavior(paramArrayOfObject, this.failedBehaviors, this);
/*  95 */     JointGoalStep.1 local1 = new JointGoalStep.1(this, this.negotiator, this + " negotiateEntryThread", localBehavior, paramArrayOfObject);
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
/* 118 */     JointGoalStep.2 local2 = new JointGoalStep.2(this, this.negotiator, this + " negotiateFailureOfOtherGoalsThread", local1);
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
/*     */ 
/*     */ 
/* 143 */     if ((!$noassert) && (getIsNegotiating())) throw new AssertionError();
/* 144 */     if (localBehavior != null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       if (this.negotiator == null)
/*     */       {
/*     */ 
/* 153 */         setIsNegotiating(true);
/* 154 */         BehavingEntity.getBehavingEntity().registerNegotiationThread(local1);
/*     */       }
/* 156 */       else if (!this.negotiator.getTeamMembers().equals(localBehavior.getTeamMembers()))
/*     */       {
/*     */ 
/*     */ 
/* 160 */         setIsNegotiating(true);
/* 161 */         BehavingEntity.getBehavingEntity().registerNegotiationThread(local2);
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 166 */         addChild(localBehavior);
/* 167 */         executeBookkeeping();
/*     */       }
/*     */       
/*     */     }
/*     */     else {
/* 172 */       failStep();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   static void blockOnSubtreeNegotiation(java.util.List paramList)
/*     */   {
/* 179 */     if ((!$noassert) && (Thread.currentThread() == BehavingEntity.getBehavingEntity().getDecisionCycleThread())) { throw new AssertionError();
/*     */     }
/* 181 */     java.util.Iterator localIterator = paramList.iterator();
/* 182 */     while (localIterator.hasNext()) {
/* 183 */       JointGoalStep localJointGoalStep = (JointGoalStep)localIterator.next();
/* 184 */       if ((localJointGoalStep.negotiator != null) && (localJointGoalStep.negotiator.getState() != 7) && (localJointGoalStep.negotiator.getState() != 9) && (localJointGoalStep.negotiator.getState() != 16) && (localJointGoalStep.negotiator.getState() != 11))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void succeedStep()
/*     */   {
/* 201 */     if (this.negotiator == null)
/*     */     {
/* 203 */       super.succeedStep();
/* 204 */     } else if (this.negotiator.getState() == 7)
/*     */     {
/* 206 */       super.succeedStep();
/*     */     }
/*     */     else
/*     */     {
/* 210 */       java.util.List localList = freezeSubtreeAndNegotiateRemovalEntry();
/*     */       
/* 212 */       JointGoalStep.3 local3 = new JointGoalStep.3(this, this.negotiator, this + " negotiateSuccessThread", localList);
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
/*     */ 
/*     */ 
/*     */ 
/* 238 */       BehavingEntity.getBehavingEntity().registerNegotiationThread(local3);
/*     */     }
/*     */   }
/*     */   
/*     */   void failStep() {
/* 243 */     debug.Trace.ablTrace("(JointGoalStep)" + getSignature() + "failStep()");
/*     */     
/* 245 */     if (this.negotiator == null)
/*     */     {
/* 247 */       super.failStep();
/* 248 */     } else if (this.negotiator.getState() == 9)
/*     */     {
/* 250 */       super.failStep();
/*     */     }
/*     */     else {
/* 253 */       java.util.List localList = freezeSubtreeAndNegotiateRemovalEntry();
/*     */       
/* 255 */       JointGoalStep.4 local4 = new JointGoalStep.4(this, this.negotiator, this + " negotiateFailureThread", localList);
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
/*     */ 
/* 279 */       BehavingEntity.getBehavingEntity().registerNegotiationThread(local4);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void negotiateSuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 285 */     java.util.List localList = negotiateSuspensionOfSubtreeEntry(paramExecutableStep);
/*     */     
/* 287 */     JointGoalStep.5 local5 = new JointGoalStep.5(this, this.negotiator, this + " negotiateSuspensionThread", localList, paramExecutableStep);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */     BehavingEntity.getBehavingEntity().registerNegotiationThread(local5);
/*     */   }
/*     */   
/*     */ 
/*     */   void suspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 321 */     if (this.negotiator == null)
/*     */     {
/* 323 */       super.suspend(paramExecutableStep);
/*     */     }
/*     */     else {
/* 326 */       negotiateSuspend(paramExecutableStep);
/*     */     }
/*     */   }
/*     */   
/*     */   void metaSuspend()
/*     */   {
/* 332 */     if (this.negotiator == null)
/*     */     {
/* 334 */       super.metaSuspend();
/*     */     }
/*     */     else {
/* 337 */       negotiateSuspend(null);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private final void negotiateUnsuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 344 */     JointGoalStep.6 local6 = new JointGoalStep.6(this, this.negotiator, this + " negotiateUnsuspensionThread", paramExecutableStep);
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
/*     */ 
/*     */ 
/* 369 */     BehavingEntity.getBehavingEntity().registerNegotiationThread(local6);
/*     */   }
/*     */   
/*     */ 
/* 373 */   private final void unsuspendSuper(ExecutableStep paramExecutableStep) { super.unsuspend(paramExecutableStep); }
/* 374 */   private final void metaUnsuspendSuper() { super.metaUnsuspend(); }
/* 375 */   private final void jointUnsuspendSuper() { super.jointUnsuspend(); }
/* 376 */   private final void suspendSuper(ExecutableStep paramExecutableStep, boolean paramBoolean) { super.suspend(paramExecutableStep, paramBoolean); }
/* 377 */   private final void metaSuspendSuper(boolean paramBoolean) { super.metaSuspend(paramBoolean); }
/* 378 */   private final void jointSuspendSuper() { super.jointSuspend(); }
/* 379 */   private final void failStepSuper() { super.failStep(); }
/* 380 */   private final void succeedStepSuper() { super.succeedStep(); }
/*     */   
/*     */ 
/*     */   void unsuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 385 */     if (this.negotiator != null)
/*     */     {
/* 387 */       negotiateUnsuspend(paramExecutableStep);
/*     */     }
/*     */     else {
/* 390 */       super.unsuspend(paramExecutableStep);
/*     */     }
/*     */   }
/*     */   
/*     */   void metaUnsuspend()
/*     */   {
/* 396 */     if (this.negotiator != null) {
/* 397 */       negotiateUnsuspend(null);
/*     */     } else
/* 399 */       super.metaUnsuspend();
/*     */   }
/*     */   
/*     */   void jointUnsuspendEntry() {
/* 403 */     super.jointUnsuspend();
/*     */   }
/*     */   
/*     */   void jointUnsuspend()
/*     */   {
/* 408 */     JointGoalStep.7 local7 = new JointGoalStep.7(this, this.negotiator, this + " jointUnsuspendThread");
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
/* 430 */     if (this.negotiator != null) {
/* 431 */       BehavingEntity.getBehavingEntity().registerNegotiationThread(local7);
/*     */     }
/*     */     else {
/* 434 */       super.jointUnsuspend();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void resetStep()
/*     */   {
/* 441 */     super.resetStep();
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void cleanupParentIfRoot()
/*     */   {
/* 460 */     if (this.parent.isRootBehavior()) {
/* 461 */       this.parent.removeChild(this, true);
/*     */     }
/*     */   }
/*     */   
/*     */   java.util.List freezeSubtreeAndNegotiateRemovalEntry()
/*     */   {
/* 467 */     return super.freezeSubtreeAndNegotiateRemoval();
/*     */   }
/*     */   
/*     */ 
/*     */   java.util.List freezeSubtreeAndNegotiateRemoval()
/*     */   {
/* 473 */     JointGoalStep.8 local8 = new JointGoalStep.8(this, this.negotiator, this + " negotiateRemovalThread");
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
/*     */ 
/*     */ 
/* 498 */     if ((!$noassert) && (this.child != null) && (this.negotiator == null)) { throw new AssertionError("step = " + this + " negotiator = " + this.negotiator + ", child = " + this.child);
/*     */     }
/* 500 */     if (this.negotiator != null)
/*     */     {
/* 502 */       BehavingEntity.getBehavingEntity().registerNegotiationThread(local8);
/*     */       
/*     */ 
/* 505 */       Vector localVector = new Vector(super.freezeSubtreeAndNegotiateRemoval());
/* 506 */       localVector.add(this);
/* 507 */       return localVector;
/*     */     }
/*     */     
/* 510 */     return new Vector(0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   java.util.List negotiateSuspensionOfSubtreeEntry()
/*     */   {
/* 517 */     if (this.child != null) {
/* 518 */       return this.child.negotiateSuspensionOfSubtree();
/*     */     }
/* 520 */     return new Vector(0);
/*     */   }
/*     */   
/*     */ 
/*     */   java.util.List negotiateSuspensionOfSubtree()
/*     */   {
/* 526 */     JointGoalStep.9 local9 = new JointGoalStep.9(this, this.negotiator, this + " negotiateSuspendThread");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 543 */     BehavingEntity.getBehavingEntity().registerNegotiationThread(local9);
/*     */     
/*     */ 
/* 546 */     Vector localVector = new Vector(negotiateSuspensionOfSubtreeEntry());
/* 547 */     localVector.add(this);
/* 548 */     return localVector;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   java.util.List negotiateSuspensionOfSubtreeEntry(ExecutableStep paramExecutableStep)
/*     */   {
/* 555 */     if (this.child != null) {
/* 556 */       return this.child.negotiateSuspensionOfSubtree(paramExecutableStep);
/*     */     }
/* 558 */     return new Vector(0);
/*     */   }
/*     */   
/*     */ 
/*     */   java.util.List negotiateSuspensionOfSubtree(ExecutableStep paramExecutableStep)
/*     */   {
/* 564 */     JointGoalStep.10 local10 = new JointGoalStep.10(this, this.negotiator, this + " negotiateSuspendThread", paramExecutableStep);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 585 */     BehavingEntity.getBehavingEntity().registerNegotiationThread(local10);
/*     */     
/*     */ 
/* 588 */     Vector localVector = new Vector(negotiateSuspensionOfSubtreeEntry(paramExecutableStep));
/* 589 */     localVector.add(this);
/* 590 */     return localVector;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */