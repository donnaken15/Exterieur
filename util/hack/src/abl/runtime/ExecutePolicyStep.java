/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ExecutePolicyStep
/*    */   extends Step
/*    */ {
/*    */   private static final int EXECUTE_POLICY_STEP_ID = -100;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   ExecutePolicyStep(Behavior paramBehavior)
/*    */   {
/* 23 */     super(-100, paramBehavior, false, false, false, false, false, false, (short)0, (short)0, false, null, null, null, null, null, (short)6);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   void execute()
/*    */   {
/* 35 */     this.parent.removeChild(this, true);
/*    */     
/*    */ 
/* 38 */     ((AdaptiveBehavior)this.parent).executePolicy();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   void resetStep()
/*    */   {
/* 49 */     BehavingEntity.getBehavingEntity().resetStep(this);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\ExecutePolicyStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */