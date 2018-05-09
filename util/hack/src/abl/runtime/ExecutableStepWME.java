/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExecutableStepWME
/*    */   extends StepWME
/*    */ {
/* 11 */   public ExecutableStepWME(Step paramStep, BehaviorWME paramBehaviorWME) { super(paramStep, paramBehaviorWME); }
/*    */   
/* 13 */   public synchronized String[] getConflicts() { return ((ExecutableStep)this.s).getConflicts(); }
/* 14 */   public synchronized boolean getIsExecuting() { return ((ExecutableStep)this.s).isExecuting(); }
/* 15 */   public synchronized boolean getIsSuspended() { return ((ExecutableStep)this.s).isSuspended(); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized void suspend()
/*    */   {
/* 22 */     if (this.s != null) {
/* 23 */       ((ExecutableStep)this.s).metaSuspend();
/*    */     }
/*    */   }
/*    */   
/*    */   public synchronized void unsuspend()
/*    */   {
/* 29 */     if (this.s != null) {
/* 30 */       ((ExecutableStep)this.s).metaUnsuspend();
/*    */     }
/*    */   }
/*    */   
/*    */   public synchronized void resetStep()
/*    */   {
/* 36 */     if (this.s != null) {
/* 37 */       ((ExecutableStep)this.s).resetStep();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\ExecutableStepWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */