/*     */ package abl.runtime;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.List;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class SequentialBehavior extends Behavior
/*     */ {
/*     */   private final void jdMethod_this()
/*     */   {
/*  11 */     this.stepCounter = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  17 */   private static final boolean $noassert = Class.forName("[Labl.runtime.SequentialBehavior;").getComponentType().desiredAssertionStatus() ^ true; private Step child; private int stepCounter; protected static short behaviorType = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public SequentialBehavior(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc)
/*     */   {
/*  24 */     super(paramGoalStep, paramMethod1, paramMethod2, null, null, paramBoolean, paramString, paramShort, paramInt, paramArrayOfObject, paramArrayOf__StepDesc);jdMethod_this();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SequentialBehavior(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, BehavingEntity[] paramArrayOfBehavingEntity)
/*     */   {
/*  33 */     super(paramGoalStep, paramMethod1, paramMethod2, null, null, paramBoolean, paramString, paramShort, paramInt, paramArrayOfObject, paramArrayOf__StepDesc, paramArrayOfBehavingEntity);jdMethod_this();
/*     */   }
/*     */   
/*     */   final short getBehaviorType()
/*     */   {
/*  38 */     return behaviorType;
/*     */   }
/*     */   
/*  41 */   final Step getChild() { return this.child; }
/*     */   
/*     */ 
/*     */   final Step getNextStep()
/*     */   {
/*  46 */     if (this.stepCounter == this.stepDescs.length) {
/*  47 */       return null;
/*     */     }
/*     */     try {
/*  50 */       Object[] arrayOfObject = { new Integer(this.stepDescs[this.stepCounter].stepID), this, getBehaviorVariableFrame() };
/*  51 */       return (Step)this.stepDescs[(this.stepCounter++)].factory.invoke(null, arrayOfObject);
/*  52 */     } catch (Exception localException) { throw new AblRuntimeError("Error invoking step factory", localException);
/*     */     }
/*     */   }
/*     */   
/*     */   void addChildren() {
/*  57 */     if ((!$noassert) && (this.stepCounter != 0)) throw new AssertionError();
/*  58 */     this.child = getNextStep();
/*  59 */     BehavingEntity.getBehavingEntity().addStep(this.child);
/*  60 */     this.changes.firePropertyChange("child", null, this.child);
/*     */   }
/*     */   
/*     */   final void addChild(Step paramStep)
/*     */   {
/*  65 */     if ((!$noassert) && (this.child != null)) throw new AssertionError();
/*  66 */     this.child = paramStep;
/*  67 */     BehavingEntity.getBehavingEntity().addStep(paramStep);
/*  68 */     this.changes.firePropertyChange("child", null, this.child);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected final void removeChildren()
/*     */   {
/*  75 */     if (this.child != null)
/*     */     {
/*  77 */       removeChild(this.child, false);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected final void removeChild(Step paramStep, boolean paramBoolean)
/*     */   {
/*  87 */     if ((!$noassert) && (paramStep != this.child)) { throw new AssertionError("childToRemove == " + paramStep + ": current child == " + this.child + " behavior: " + getSignature());
/*     */     }
/*     */     
/*     */ 
/*  91 */     if ((!$noassert) && (paramStep == null)) { throw new AssertionError("Attempt to remove a null child from a sequential behavior.");
/*     */     }
/*     */     
/*  94 */     super.removeChild(paramStep, paramBoolean);
/*  95 */     this.child = null;
/*     */   }
/*     */   
/*     */ 
/*     */   final boolean currentLineOfExpansion(GoalStep paramGoalStep)
/*     */   {
/* 101 */     return this.parent.currentLineOfExpansion(paramGoalStep);
/*     */   }
/*     */   
/*     */ 
/*     */   final void suspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 107 */     this.child.suspend(paramExecutableStep);
/*     */   }
/*     */   
/* 110 */   final void jointUnsuspend() { this.child.jointUnsuspend(); }
/*     */   
/*     */   final void metaSuspend() {
/* 113 */     this.child.metaSuspend();
/*     */   }
/*     */   
/*     */   final void unsuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 118 */     this.child.unsuspend(paramExecutableStep);
/*     */   }
/*     */   
/*     */   final void metaUnsuspend() {
/* 122 */     this.child.metaUnsuspend();
/*     */   }
/*     */   
/*     */   final void suspendSkipJointGoals(ExecutableStep paramExecutableStep) {
/* 126 */     if ((this.child != null) && ((this.child.getStepType() != 1) || (!((GoalStep)this.child).isJointGoal())))
/*     */     {
/*     */ 
/*     */ 
/* 130 */       if (this.child.getStepType() == 1) {
/* 131 */         ((GoalStep)this.child).suspendSkipJointGoals(paramExecutableStep);
/*     */       } else {
/* 133 */         this.child.suspend(paramExecutableStep);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   final void metaSuspendSkipJointGoals() {
/* 139 */     if ((this.child != null) && ((this.child.getStepType() != 1) || (!((GoalStep)this.child).isJointGoal())))
/*     */     {
/*     */ 
/*     */ 
/* 143 */       if (this.child.getStepType() == 1) {
/* 144 */         ((GoalStep)this.child).metaSuspendSkipJointGoals();
/*     */       } else {
/* 146 */         this.child.metaSuspend();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   final List freezeSubtreeAndNegotiateRemoval() {
/* 152 */     if (hasTeamEffectOnlySteps()) {
/* 153 */       return freezeNonTeamEffectOnlySubtreeAndNegotiateRemoval();
/*     */     }
/* 155 */     BehavingEntity.getBehavingEntity().removeBehavior(this);
/* 156 */     if (this.child != null) {
/* 157 */       return freezeChild(this.child);
/*     */     }
/* 159 */     return new Vector(0);
/*     */   }
/*     */   
/*     */ 
/*     */   protected final List freezeNonTeamEffectOnlySubtreeAndNegotiateRemoval()
/*     */   {
/* 165 */     BehavingEntity.getBehavingEntity().removeBehavior(this);
/* 166 */     if ((this.child != null) && (!this.child.getTeamEffectOnly())) {
/* 167 */       return freezeChild(this.child);
/*     */     }
/* 169 */     return new Vector(0);
/*     */   }
/*     */   
/*     */   protected final boolean hasTeamEffectOnlySteps()
/*     */   {
/* 174 */     if (this.child != null) {
/* 175 */       return this.child.getTeamEffectOnly();
/*     */     }
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   final List negotiateSuspensionOfSubtree(ExecutableStep paramExecutableStep)
/*     */   {
/* 182 */     if (this.child != null) {
/* 183 */       return negotiateSuspensionOfChild(this.child, paramExecutableStep);
/*     */     }
/* 185 */     return new Vector(0);
/*     */   }
/*     */   
/*     */   final List negotiateSuspensionOfSubtree()
/*     */   {
/* 190 */     if (this.child != null) {
/* 191 */       return negotiateSuspensionOfChild(this.child);
/*     */     }
/* 193 */     return new Vector(0);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SequentialBehavior.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */