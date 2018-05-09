/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ 
/*    */ public class BeatArgumentWME extends wm.WME
/*    */ {
/*    */   private int txnInType;
/*    */   private int txnOutType;
/*    */   private int txnOutDARxnType;
/*    */   private boolean bPositiveSpin;
/*    */   private int miscBeatArgument;
/*    */   
/*    */   public BeatArgumentWME(int paramInt)
/*    */   {
/* 15 */     this.txnInType = paramInt;
/* 16 */     this.txnOutType = -1;
/* 17 */     this.txnOutDARxnType = -1;
/* 18 */     this.bPositiveSpin = false;
/* 19 */     this.miscBeatArgument = -1;
/*    */   }
/*    */   
/*    */   public BeatArgumentWME(int paramInt1, int paramInt2) {
/* 23 */     this.txnInType = paramInt1;
/* 24 */     this.txnOutType = paramInt2;
/* 25 */     this.txnOutDARxnType = -1;
/* 26 */     this.bPositiveSpin = false;
/* 27 */     this.miscBeatArgument = -1;
/*    */   }
/*    */   
/*    */   public BeatArgumentWME() {
/* 31 */     this.txnInType = -1;
/* 32 */     this.txnOutType = -1;
/* 33 */     this.txnOutDARxnType = -1;
/* 34 */     this.bPositiveSpin = false;
/* 35 */     this.miscBeatArgument = -1;
/*    */   }
/*    */   
/*    */ 
/*    */   public BeatArgumentWME(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*    */   {
/* 41 */     this.txnInType = paramInt1;
/* 42 */     this.txnOutType = paramInt2;
/* 43 */     this.txnOutDARxnType = paramInt3;
/* 44 */     this.bPositiveSpin = paramBoolean;
/* 45 */     this.miscBeatArgument = paramInt4;
/*    */   }
/*    */   
/*    */ 
/* 49 */   public String formatTxnInType() { return PrintUtilities.beatArgument_txn_EnumToString(getTxnInType()); }
/* 50 */   public String formatTxnOutType() { return PrintUtilities.beatArgument_txn_EnumToString(getTxnOutType()); }
/*    */   
/*    */ 
/* 53 */   public synchronized int getTxnInType() { return this.txnInType; }
/* 54 */   public synchronized int getTxnOutType() { return this.txnOutType; }
/* 55 */   public synchronized int getTxnOutDARxnType() { return this.txnOutDARxnType; }
/* 56 */   public synchronized boolean getBPositiveSpin() { return this.bPositiveSpin; }
/* 57 */   public synchronized int getMiscBeatArgument() { return this.miscBeatArgument; }
/*    */   
/* 59 */   public synchronized void setTxnInType(int paramInt) { this.txnInType = paramInt; }
/* 60 */   public synchronized void setTxnOutType(int paramInt) { this.txnOutType = paramInt; }
/* 61 */   public synchronized void setTxnOutDARxnType(int paramInt) { this.txnOutDARxnType = paramInt; }
/* 62 */   public synchronized void setBPositiveSpin(boolean paramBoolean) { this.bPositiveSpin = paramBoolean; }
/* 63 */   public synchronized void setMiscBeatArgument(int paramInt) { this.miscBeatArgument = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatArgumentWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */