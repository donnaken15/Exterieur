/*     */ package abl.runtime;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Vector;
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
/*     */ class GoalStep$NegotiateSubtreeRemovalThread
/*     */   extends JointGoalNegotiationThread
/*     */ {
/*     */   static final int INVALID_ACTION = 0;
/*     */   static final int SUCCEED = 1;
/*     */   static final int FAIL = 2;
/*     */   static final int RESET = 3;
/*     */   private List jointGoals;
/*     */   private int actionOnCommit;
/*     */   final GoalStep this$0;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.GoalStep;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/* 112 */     this.jointGoals = new Vector(0);
/* 113 */     this.actionOnCommit = 0;
/*     */   }
/*     */   
/*     */   GoalStep$NegotiateSubtreeRemovalThread(GoalStep paramGoalStep, List paramList, int paramInt) {
/* 117 */     super(null, paramGoalStep + " NegotiateSubtreeRemovalThread(" + GoalStep.access$0(paramInt) + ')');jdMethod_this();
/* 118 */     if ((!$noassert) && ((paramInt <= 0) || (paramInt > 3))) { throw new AssertionError();
/*     */     }
/* 120 */     this.jointGoals = paramList;
/* 121 */     this.actionOnCommit = paramInt;
/*     */   }
/*     */   
/* 124 */   int getActionOnCommit() { return this.actionOnCommit; }
/*     */   
/*     */   public void run()
/*     */   {
/* 128 */     Iterator localIterator = this.jointGoals.iterator();
/* 129 */     while (localIterator.hasNext()) {
/* 130 */       JointGoalStep localJointGoalStep = (JointGoalStep)localIterator.next();
/* 131 */       if ((localJointGoalStep.negotiator != null) && (localJointGoalStep.negotiator.getState() != 7) && (localJointGoalStep.negotiator.getState() != 9) && (localJointGoalStep.negotiator.getState() != 16))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 136 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 143 */     switch (this.actionOnCommit) {
/*     */     case 1: 
/* 145 */       GoalStep.access$1(this.this$0);
/* 146 */       break;
/*     */     case 2: 
/* 148 */       GoalStep.access$2(this.this$0);
/* 149 */       break;
/*     */     case 3: 
/* 151 */       GoalStep.access$3(this.this$0);
/* 152 */       break;
/*     */     default: 
/* 154 */       throw new AblRuntimeError("Unexpected action type " + this.actionOnCommit);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\GoalStep$NegotiateSubtreeRemovalThread.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */