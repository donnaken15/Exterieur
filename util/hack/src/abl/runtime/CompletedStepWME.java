/*    */ package abl.runtime;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ 
/*    */ public abstract class CompletedStepWME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private String behaviorSignature;
/*    */   private String agent;
/*    */   
/*    */   public CompletedStepWME(String paramString1, String paramString2, long paramLong)
/*    */   {
/* 14 */     super(paramLong);
/* 15 */     this.behaviorSignature = paramString1;
/* 16 */     this.agent = paramString2;
/*    */   }
/*    */   
/*    */   public CompletedStepWME(String paramString1, String paramString2)
/*    */   {
/* 21 */     this.behaviorSignature = paramString1;
/* 22 */     this.agent = paramString2;
/*    */   }
/*    */   
/* 25 */   public synchronized String getBehaviorSignature() { return this.behaviorSignature; }
/* 26 */   public synchronized void setBehaviorSignature(String paramString) { this.behaviorSignature = paramString; }
/*    */   
/* 28 */   public synchronized String getAgent() { return this.agent; }
/* 29 */   public synchronized void setAgent(String paramString) { this.agent = paramString; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\CompletedStepWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */