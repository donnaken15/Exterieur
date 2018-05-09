/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatFlagWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bVal;
/*    */   private int iVal;
/*    */   private float fVal;
/*    */   private String sVal;
/*    */   
/*    */   public BeatFlagWME()
/*    */   {
/* 14 */     this.bVal = false;
/* 15 */     this.iVal = 0;
/* 16 */     this.fVal = 0.0F;
/* 17 */     this.sVal = "";
/*    */   }
/*    */   
/*    */   public BeatFlagWME(boolean paramBoolean)
/*    */   {
/* 22 */     this.bVal = paramBoolean;
/* 23 */     this.iVal = 0;
/* 24 */     this.fVal = 0.0F;
/* 25 */     this.sVal = "";
/*    */   }
/*    */   
/*    */   public BeatFlagWME(int paramInt)
/*    */   {
/* 30 */     this.bVal = false;
/* 31 */     this.iVal = paramInt;
/* 32 */     this.fVal = 0.0F;
/* 33 */     this.sVal = "";
/*    */   }
/*    */   
/*    */   public BeatFlagWME(float paramFloat)
/*    */   {
/* 38 */     this.bVal = false;
/* 39 */     this.iVal = 0;
/* 40 */     this.fVal = paramFloat;
/* 41 */     this.sVal = "";
/*    */   }
/*    */   
/*    */   public BeatFlagWME(String paramString)
/*    */   {
/* 46 */     this.bVal = false;
/* 47 */     this.iVal = 0;
/* 48 */     this.fVal = 0.0F;
/* 49 */     this.sVal = paramString;
/*    */   }
/*    */   
/* 52 */   public synchronized boolean getBVal() { return this.bVal; }
/* 53 */   public synchronized int getIVal() { return this.iVal; }
/* 54 */   public synchronized float getFVal() { return this.fVal; }
/* 55 */   public synchronized String getSVal() { return this.sVal; }
/*    */   
/* 57 */   public synchronized void setBVal(boolean paramBoolean) { this.bVal = paramBoolean; }
/* 58 */   public synchronized void setIVal(int paramInt) { this.iVal = paramInt; }
/* 59 */   public synchronized void setFVal(float paramFloat) { this.fVal = paramFloat; }
/* 60 */   public synchronized void setSVal(String paramString) { this.sVal = paramString; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatFlagWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */