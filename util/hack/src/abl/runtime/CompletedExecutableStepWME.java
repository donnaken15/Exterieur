/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class CompletedExecutableStepWME
/*    */   extends CompletedStepWME
/*    */ {
/*    */   public static final int SUCCESS = 0;
/*    */   
/*    */ 
/*    */   public static final int FAILURE = 1;
/*    */   
/*    */   private String signature;
/*    */   
/*    */   private int completionStatus;
/*    */   
/*    */ 
/*    */   public CompletedExecutableStepWME(String paramString1, int paramInt, String paramString2, String paramString3, long paramLong)
/*    */   {
/* 20 */     super(paramString2, paramString3, paramLong);
/* 21 */     this.signature = paramString1;
/* 22 */     this.completionStatus = paramInt;
/*    */   }
/*    */   
/*    */   public CompletedExecutableStepWME(String paramString1, int paramInt, String paramString2, String paramString3)
/*    */   {
/* 27 */     super(paramString2, paramString3);
/* 28 */     this.signature = paramString1;
/* 29 */     this.completionStatus = paramInt;
/*    */   }
/*    */   
/* 32 */   public synchronized String getSignature() { return this.signature; }
/* 33 */   public synchronized void setSignature(String paramString) { this.signature = paramString; }
/*    */   
/* 35 */   public synchronized int getCompletionStatus() { return this.completionStatus; }
/* 36 */   public synchronized void setCompletionStatus(int paramInt) { this.completionStatus = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\CompletedExecutableStepWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */