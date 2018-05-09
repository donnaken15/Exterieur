/*     */ package abl.runtime;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ 
/*     */ public abstract class MultiStepBehavior extends Behavior {
/*     */   protected java.util.HashSet children;
/*     */   private int numberNeededForSuccess;
/*     */   private int numberOfCompletedSteps;
/*     */   private GoalStep lastPursuedGoal;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.MultiStepBehavior;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*  12 */   private final void jdMethod_this() { this.children = new java.util.HashSet();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  18 */     this.numberNeededForSuccess = -1;
/*     */     
/*     */ 
/*  21 */     this.numberOfCompletedSteps = 0;
/*     */     
/*     */ 
/*  24 */     this.lastPursuedGoal = null;
/*     */   }
/*     */   
/*     */   public MultiStepBehavior(GoalStep paramGoalStep, java.lang.reflect.Method paramMethod1, java.lang.reflect.Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt1, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, int paramInt2) {
/*  28 */     super(paramGoalStep, paramMethod1, paramMethod2, null, null, paramBoolean, paramString, paramShort, paramInt1, paramArrayOfObject, paramArrayOf__StepDesc);jdMethod_this();
/*     */     
/*     */ 
/*  31 */     if (paramInt2 == -1)
/*     */     {
/*     */ 
/*  34 */       if (getBehaviorType() != 3) {
/*  35 */         this.numberNeededForSuccess = 0;
/*  36 */         Step[] arrayOfStep = getAllSteps();
/*  37 */         for (int i = 0; i < arrayOfStep.length; i++)
/*  38 */           if (!arrayOfStep[i].getEffectOnlyOrTeamEffectOnly())
/*  39 */             this.numberNeededForSuccess += 1;
/*     */       }
/*     */     } else {
/*  42 */       this.numberNeededForSuccess = paramInt2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public MultiStepBehavior(GoalStep paramGoalStep, java.lang.reflect.Method paramMethod1, java.lang.reflect.Method paramMethod2, java.lang.reflect.Method paramMethod3, java.lang.reflect.Method paramMethod4, boolean paramBoolean, String paramString, short paramShort, int paramInt1, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, int paramInt2)
/*     */   {
/*  61 */     super(paramGoalStep, paramMethod1, paramMethod2, paramMethod3, paramMethod4, paramBoolean, paramString, paramShort, paramInt1, paramArrayOfObject, paramArrayOf__StepDesc);jdMethod_this();
/*     */     
/*     */ 
/*  64 */     if (paramInt2 == -1)
/*     */     {
/*     */ 
/*  67 */       if (getBehaviorType() != 3) {
/*  68 */         this.numberNeededForSuccess = 0;
/*  69 */         Step[] arrayOfStep = getAllSteps();
/*  70 */         for (int i = 0; i < arrayOfStep.length; i++)
/*  71 */           if (!arrayOfStep[i].getEffectOnlyOrTeamEffectOnly())
/*  72 */             this.numberNeededForSuccess += 1;
/*     */       }
/*     */     } else {
/*  75 */       this.numberNeededForSuccess = paramInt2;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public MultiStepBehavior(GoalStep paramGoalStep, java.lang.reflect.Method paramMethod1, java.lang.reflect.Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt1, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, int paramInt2, BehavingEntity[] paramArrayOfBehavingEntity)
/*     */   {
/*  82 */     super(paramGoalStep, paramMethod1, paramMethod2, null, null, paramBoolean, paramString, paramShort, paramInt1, paramArrayOfObject, paramArrayOf__StepDesc, paramArrayOfBehavingEntity);jdMethod_this();
/*     */     
/*     */ 
/*  85 */     if (paramInt2 == -1)
/*     */     {
/*     */ 
/*  88 */       Step[] arrayOfStep = getAllSteps();
/*  89 */       this.numberNeededForSuccess = 0;
/*  90 */       for (int i = 0; i < arrayOfStep.length; i++)
/*  91 */         if (!arrayOfStep[i].getEffectOnlyOrTeamEffectOnly())
/*  92 */           this.numberNeededForSuccess += 1;
/*     */     } else {
/*  94 */       this.numberNeededForSuccess = paramInt2;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   int getNumberNeededForSuccess()
/*     */   {
/* 101 */     return this.numberNeededForSuccess;
/*     */   }
/*     */   
/*     */   final int getNumberOfCompletedSteps() {
/* 105 */     return this.numberOfCompletedSteps;
/*     */   }
/*     */   
/*     */   final GoalStep getLastPursuedGoal() {
/* 109 */     return this.lastPursuedGoal;
/*     */   }
/*     */   
/*     */   final int getNumberOfSteps() {
/* 113 */     return this.stepDescs.length;
/*     */   }
/*     */   
/*     */   final Step[] getChildren() {
/* 117 */     return (Step[])this.children.toArray(new Step[this.children.size()]);
/*     */   }
/*     */   
/*     */   final void pursueGoal(GoalStep paramGoalStep) {
/* 121 */     this.lastPursuedGoal = paramGoalStep;
/*     */   }
/*     */   
/*     */   final void clearLastPursuedGoal() {
/* 125 */     this.lastPursuedGoal = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void removeChildren()
/*     */   {
/* 133 */     Step[] arrayOfStep = (Step[])this.children.toArray(new Step[this.children.size()]);
/* 134 */     for (int i = 0; i < arrayOfStep.length; i++)
/*     */     {
/* 136 */       removeChild(arrayOfStep[i], false);
/*     */     }
/*     */   }
/*     */   
/*     */   void addChild(Step paramStep)
/*     */   {
/* 142 */     if ((this.parent != null) && 
/* 143 */       (this.parent.isSuspended())) {
/* 144 */       java.util.List localList = this.parent.getStepsSuspendingMe();
/* 145 */       int i = this.parent.getMetaSuspenderCount();
/* 146 */       if ((!$noassert) && (localList.size() == 0) && (i <= 0)) throw new AssertionError();
/* 147 */       if (localList.size() != 0) {
/* 148 */         Iterator localIterator = localList.iterator();
/* 149 */         while (localIterator.hasNext())
/* 150 */           paramStep.suspend((ExecutableStep)localIterator.next());
/*     */       }
/* 152 */       if (i > 0) {
/* 153 */         for (int j = 0; j < i; j++) {
/* 154 */           paramStep.metaSuspend();
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 159 */     this.children.add(paramStep);
/* 160 */     if (!paramStep.getEffectOnlyOrTeamEffectOnly())
/* 161 */       this.numberNeededForSuccess += 1;
/* 162 */     BehavingEntity.getBehavingEntity().addStep(paramStep);
/* 163 */     this.changes.firePropertyChange("child", null, paramStep);
/*     */   }
/*     */   
/*     */   void addChildren()
/*     */   {
/* 168 */     Step[] arrayOfStep = getAllSteps();
/* 169 */     for (int i = 0; i < arrayOfStep.length; i++) {
/* 170 */       this.children.add(arrayOfStep[i]);
/* 171 */       BehavingEntity.getBehavingEntity().addStep(arrayOfStep[i]);
/* 172 */       this.changes.firePropertyChange("child", null, arrayOfStep[i]);
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
/*     */   protected void removeChild(Step paramStep, boolean paramBoolean)
/*     */   {
/* 185 */     if ((!$noassert) && (!this.children.contains(paramStep))) { throw new AssertionError("child == " + paramStep + " current children == " + this.children);
/*     */     }
/* 187 */     super.removeChild(paramStep, paramBoolean);
/* 188 */     this.children.remove(paramStep);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */     this.lastPursuedGoal = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 200 */     if ((this.numberNeededForSuccess != -1) && (!paramStep.getEffectOnlyOrTeamEffectOnly())) {
/* 201 */       this.numberOfCompletedSteps += 1;
/*     */     }
/*     */   }
/*     */   
/*     */   protected Step[] getAllSteps() {
/* 206 */     Step[] arrayOfStep = new Step[this.stepDescs.length];
/* 207 */     for (int i = 0; i < arrayOfStep.length; i++) {
/*     */       try {
/* 209 */         Object[] arrayOfObject = { new Integer(this.stepDescs[i].stepID), this, getBehaviorVariableFrame() };
/* 210 */         arrayOfStep[i] = ((Step)this.stepDescs[i].factory.invoke(null, arrayOfObject));
/*     */       } catch (Exception localException) {
/* 212 */         throw new AblRuntimeError("Error invoking step factory", localException);
/*     */       }
/*     */     }
/* 215 */     return arrayOfStep;
/*     */   }
/*     */   
/*     */ 
/*     */   boolean isSuccessful()
/*     */   {
/* 221 */     if ((!$noassert) && (this.numberNeededForSuccess == -1)) throw new AssertionError();
/* 222 */     if (this.numberOfCompletedSteps >= this.numberNeededForSuccess) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */   boolean currentLineOfExpansion(GoalStep paramGoalStep)
/*     */   {
/* 228 */     if (this.parent != null)
/*     */     {
/*     */ 
/* 231 */       if ((paramGoalStep == null) || (this.lastPursuedGoal == null) || (paramGoalStep == this.lastPursuedGoal)) {
/* 232 */         return this.parent.currentLineOfExpansion(paramGoalStep);
/*     */       }
/* 234 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 238 */     if ((paramGoalStep == null) || (this.lastPursuedGoal == null) || (paramGoalStep == this.lastPursuedGoal)) {
/* 239 */       return true;
/*     */     }
/* 241 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   final void suspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 247 */     Iterator localIterator = this.children.iterator();
/*     */     
/* 249 */     while (localIterator.hasNext()) {
/* 250 */       Step localStep = (Step)localIterator.next();
/* 251 */       localStep.suspend(paramExecutableStep);
/*     */     }
/*     */   }
/*     */   
/*     */   final void metaSuspend()
/*     */   {
/* 257 */     Iterator localIterator = this.children.iterator();
/*     */     
/* 259 */     while (localIterator.hasNext()) {
/* 260 */       Step localStep = (Step)localIterator.next();
/* 261 */       localStep.metaSuspend();
/*     */     }
/*     */   }
/*     */   
/*     */   final void unsuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 267 */     Iterator localIterator = this.children.iterator();
/*     */     
/* 269 */     while (localIterator.hasNext()) {
/* 270 */       Step localStep = (Step)localIterator.next();
/* 271 */       localStep.unsuspend(paramExecutableStep);
/*     */     }
/*     */   }
/*     */   
/*     */   final void metaUnsuspend()
/*     */   {
/* 277 */     Iterator localIterator = this.children.iterator();
/*     */     
/* 279 */     while (localIterator.hasNext()) {
/* 280 */       Step localStep = (Step)localIterator.next();
/* 281 */       localStep.metaUnsuspend();
/*     */     }
/*     */   }
/*     */   
/*     */   final void jointUnsuspend()
/*     */   {
/* 287 */     Iterator localIterator = this.children.iterator();
/* 288 */     while (localIterator.hasNext())
/* 289 */       ((Step)localIterator.next()).jointUnsuspend();
/*     */   }
/*     */   
/*     */   final void suspendSkipJointGoals(ExecutableStep paramExecutableStep) {
/* 293 */     Iterator localIterator = this.children.iterator();
/* 294 */     while (localIterator.hasNext()) {
/* 295 */       Step localStep = (Step)localIterator.next();
/* 296 */       if ((localStep.getStepType() != 1) || (!((GoalStep)localStep).isJointGoal())) {
/* 297 */         if (localStep.getStepType() == 1) {
/* 298 */           ((GoalStep)localStep).suspendSkipJointGoals(paramExecutableStep);
/*     */         } else
/* 300 */           localStep.suspend(paramExecutableStep);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   final void metaSuspendSkipJointGoals() {
/* 306 */     Iterator localIterator = this.children.iterator();
/* 307 */     while (localIterator.hasNext()) {
/* 308 */       Step localStep = (Step)localIterator.next();
/* 309 */       if ((localStep.getStepType() != 1) || (!((GoalStep)localStep).isJointGoal())) {
/* 310 */         if (localStep.getStepType() == 1) {
/* 311 */           ((GoalStep)localStep).metaSuspendSkipJointGoals();
/*     */         } else
/* 313 */           localStep.metaSuspend();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   final java.util.List freezeSubtreeAndNegotiateRemoval() {
/* 319 */     if (hasTeamEffectOnlySteps()) {
/* 320 */       return freezeNonTeamEffectOnlySubtreeAndNegotiateRemoval();
/*     */     }
/* 322 */     BehavingEntity.getBehavingEntity().removeBehavior(this);
/* 323 */     Iterator localIterator = this.children.iterator();
/* 324 */     java.util.Vector localVector = new java.util.Vector();
/* 325 */     while (localIterator.hasNext())
/* 326 */       localVector.addAll(freezeChild((Step)localIterator.next()));
/* 327 */     return localVector;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected final java.util.List freezeNonTeamEffectOnlySubtreeAndNegotiateRemoval()
/*     */   {
/* 334 */     BehavingEntity.getBehavingEntity().removeBehavior(this);
/* 335 */     Iterator localIterator = this.children.iterator();
/* 336 */     java.util.Vector localVector = new java.util.Vector();
/* 337 */     while (localIterator.hasNext()) {
/* 338 */       Step localStep = (Step)localIterator.next();
/*     */       
/* 340 */       if (!localStep.getTeamEffectOnly()) {
/* 341 */         localVector.addAll(freezeChild(localStep));
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 346 */     return localVector;
/*     */   }
/*     */   
/*     */   protected final boolean hasTeamEffectOnlySteps()
/*     */   {
/* 351 */     Iterator localIterator = this.children.iterator();
/* 352 */     while (localIterator.hasNext()) {
/* 353 */       if (((Step)localIterator.next()).getTeamEffectOnly())
/* 354 */         return true;
/*     */     }
/* 356 */     return false;
/*     */   }
/*     */   
/*     */   final java.util.List negotiateSuspensionOfSubtree() {
/* 360 */     Iterator localIterator = this.children.iterator();
/* 361 */     java.util.Vector localVector = new java.util.Vector();
/* 362 */     while (localIterator.hasNext()) {
/* 363 */       localVector.addAll(negotiateSuspensionOfChild((Step)localIterator.next()));
/*     */     }
/* 365 */     return localVector;
/*     */   }
/*     */   
/*     */   final java.util.List negotiateSuspensionOfSubtree(ExecutableStep paramExecutableStep) {
/* 369 */     Iterator localIterator = this.children.iterator();
/* 370 */     java.util.Vector localVector = new java.util.Vector();
/* 371 */     while (localIterator.hasNext()) {
/* 372 */       localVector.addAll(negotiateSuspensionOfChild((Step)localIterator.next(), paramExecutableStep));
/*     */     }
/* 374 */     return localVector;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\MultiStepBehavior.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */