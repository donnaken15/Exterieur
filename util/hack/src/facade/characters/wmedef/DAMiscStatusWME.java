/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DAMiscStatusWME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private boolean bHandlersActive;
/*    */   private long lastDAHandlersActiveCheck;
/*    */   private long lastDACommitCheck;
/*    */   private long lastReferToObjByActivation;
/*    */   
/*    */   public DAMiscStatusWME()
/*    */   {
/* 20 */     this.bHandlersActive = false;
/* 21 */     this.lastDAHandlersActiveCheck = 0L;
/* 22 */     this.lastDACommitCheck = 0L;
/* 23 */     this.lastReferToObjByActivation = 0L;
/*    */   }
/*    */   
/*    */ 
/* 27 */   public synchronized boolean getBHandlersActive() { return this.bHandlersActive; }
/* 28 */   public synchronized long getLastDAHandlersActiveCheck() { return this.lastDAHandlersActiveCheck; }
/* 29 */   public synchronized long getLastDACommitCheck() { return this.lastDACommitCheck; }
/* 30 */   public synchronized long getLastReferToObjByActivation() { return this.lastReferToObjByActivation; }
/*    */   
/*    */ 
/* 33 */   public synchronized void setBHandlersActive(boolean paramBoolean) { this.bHandlersActive = paramBoolean; }
/* 34 */   public synchronized void setLastDAHandlersActiveCheck(long paramLong) { this.lastDAHandlersActiveCheck = paramLong; }
/* 35 */   public synchronized void setLastDACommitCheck(long paramLong) { this.lastDACommitCheck = paramLong; }
/* 36 */   public synchronized void setLastReferToObjByActivation(long paramLong) { this.lastReferToObjByActivation = paramLong; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\DAMiscStatusWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */