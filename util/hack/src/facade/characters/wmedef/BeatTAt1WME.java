/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatTAt1WME extends TimeStampedWME
/*    */ {
/*    */   private boolean bVal;
/*    */   private int numLures;
/*    */   private float fVal;
/*    */   private String sVal;
/*    */   private long tempMillis;
/*    */   
/*    */   public BeatTAt1WME()
/*    */   {
/* 15 */     this.bVal = false;
/* 16 */     this.numLures = 0;
/* 17 */     this.fVal = 0.0F;
/* 18 */     this.sVal = "";
/* 19 */     this.tempMillis = 0L;
/*    */   }
/*    */   
/* 22 */   public synchronized boolean getBVal() { return this.bVal; }
/* 23 */   public synchronized int getNumLures() { return this.numLures; }
/* 24 */   public synchronized float getFVal() { return this.fVal; }
/* 25 */   public synchronized String getSVal() { return this.sVal; }
/* 26 */   public synchronized long getTempMillis() { return this.tempMillis; }
/*    */   
/* 28 */   public synchronized void setBVal(boolean paramBoolean) { this.bVal = paramBoolean; }
/* 29 */   public synchronized void setNumLures(int paramInt) { this.numLures = paramInt; }
/* 30 */   public synchronized void setFVal(float paramFloat) { this.fVal = paramFloat; }
/* 31 */   public synchronized void setSVal(String paramString) { this.sVal = paramString; }
/* 32 */   public synchronized void setTempMillis(long paramLong) { this.tempMillis = paramLong; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatTAt1WME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */