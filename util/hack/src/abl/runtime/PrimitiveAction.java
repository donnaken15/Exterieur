/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ public abstract class PrimitiveAction
/*    */ {
/*    */   public static final int NOT_COMPLETE = 0;
/*    */   
/*    */   public static final int SUCCESS = 1;
/*    */   
/*    */   public static final int FAILURE = 2;
/*    */   
/*    */   protected int completionStatus;
/*    */   
/*    */   public PrimitiveAction()
/*    */   {
/* 16 */     jdMethod_this();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private final void jdMethod_this()
/*    */   {
/* 24 */     this.completionStatus = 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getCompletionStatus()
/*    */   {
/* 32 */     return this.completionStatus;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized void completionCallback(boolean paramBoolean)
/*    */   {
/* 44 */     if (paramBoolean) {
/* 45 */       this.completionStatus = 1;
/*    */     } else {
/* 47 */       this.completionStatus = 2;
/*    */     }
/*    */   }
/*    */   
/*    */   public void abort() {}
/*    */   
/*    */   public abstract void execute(Object[] paramArrayOfObject);
/*    */   
/*    */   public void decisionCycleCallback() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\PrimitiveAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */