/*    */ package abl.runtime;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class UnexpectedStateError extends JointGoalNegotiationError {
/*  6 */   private final void jdMethod_this() { this.s = null; }
/*    */   
/*  8 */   public UnexpectedStateError(int paramInt) { super("Unexpected state " + stateName(paramInt));jdMethod_this(); }
/*  9 */   public UnexpectedStateError(int paramInt, BehavingEntity paramBehavingEntity) { super(paramBehavingEntity + ": Unexpected state " + stateName(paramInt));jdMethod_this(); }
/*    */   
/*    */   private JointGoalStep s;
/* 12 */   public UnexpectedStateError(int paramInt, JointGoalStep paramJointGoalStep) { super("Unexpected state " + stateName(paramInt) + "in goal " + paramJointGoalStep);jdMethod_this();
/* 13 */     this.s = paramJointGoalStep;
/*    */   }
/*    */   
/*    */   public UnexpectedStateError(int paramInt, BehavingEntity paramBehavingEntity, JointGoalStep paramJointGoalStep)
/*    */   {
/* 18 */     super(paramBehavingEntity + ": Unexpected state " + stateName(paramInt) + "in goal " + paramJointGoalStep);jdMethod_this();
/* 19 */     this.s = paramJointGoalStep;
/*    */   }
/*    */   
/*    */   public String getMessage() {
/* 23 */     if ((this.s != null) && (this.s.negotiator.getClass().getName().equals("abl.runtime.JointGoalNegotiatorDebug"))) {
/* 24 */       System.err.println("UnexpectedStateError");
/* 25 */       this.s.negotiator.printNegotiationHistory();
/* 26 */       return super.getMessage();
/*    */     }
/*    */     
/* 29 */     return super.getMessage();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\UnexpectedStateError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */