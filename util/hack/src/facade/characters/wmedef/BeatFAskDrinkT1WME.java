/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatFAskDrinkT1WME extends TimeStampedWME
/*    */ {
/*    */   private boolean bGotFancySpecificRequest;
/*    */   private boolean bGotNonFancySpecificRequest;
/*    */   private int roundOfDrinks;
/*    */   private int whenToGoToBar;
/*    */   private int curDrinkIdea;
/*    */   private int tripDrinkIdea;
/*    */   private int graceDrinkIdea;
/*    */   private float fVal;
/*    */   private String sVal;
/*    */   private long tempMillis;
/*    */   
/*    */   public BeatFAskDrinkT1WME()
/*    */   {
/* 20 */     this.bGotFancySpecificRequest = false;
/* 21 */     this.bGotNonFancySpecificRequest = false;
/* 22 */     this.roundOfDrinks = 0;
/* 23 */     this.whenToGoToBar = 0;
/* 24 */     this.curDrinkIdea = 0;
/* 25 */     this.tripDrinkIdea = 0;
/* 26 */     this.graceDrinkIdea = 0;
/* 27 */     this.fVal = 0.0F;
/* 28 */     this.sVal = "";
/* 29 */     this.tempMillis = 0L;
/*    */   }
/*    */   
/* 32 */   public synchronized boolean getBGotFancySpecificRequest() { return this.bGotFancySpecificRequest; }
/* 33 */   public synchronized boolean getBGotNonFancySpecificRequest() { return this.bGotNonFancySpecificRequest; }
/* 34 */   public synchronized int getRoundOfDrinks() { return this.roundOfDrinks; }
/* 35 */   public synchronized int getWhenToGoToBar() { return this.whenToGoToBar; }
/* 36 */   public synchronized int getCurDrinkIdea() { return this.curDrinkIdea; }
/* 37 */   public synchronized int getTripDrinkIdea() { return this.tripDrinkIdea; }
/* 38 */   public synchronized int getGraceDrinkIdea() { return this.graceDrinkIdea; }
/* 39 */   public synchronized float getFVal() { return this.fVal; }
/* 40 */   public synchronized String getSVal() { return this.sVal; }
/* 41 */   public synchronized long getTempMillis() { return this.tempMillis; }
/*    */   
/* 43 */   public synchronized void setBGotFancySpecificRequest(boolean paramBoolean) { this.bGotFancySpecificRequest = paramBoolean; }
/* 44 */   public synchronized void setBGotNonFancySpecificRequest(boolean paramBoolean) { this.bGotNonFancySpecificRequest = paramBoolean; }
/* 45 */   public synchronized void setRoundOfDrinks(int paramInt) { this.roundOfDrinks = paramInt; }
/* 46 */   public synchronized void setWhenToGoToBar(int paramInt) { this.whenToGoToBar = paramInt; }
/* 47 */   public synchronized void setCurDrinkIdea(int paramInt) { this.curDrinkIdea = paramInt; }
/* 48 */   public synchronized void setTripDrinkIdea(int paramInt) { this.tripDrinkIdea = paramInt; }
/* 49 */   public synchronized void setGraceDrinkIdea(int paramInt) { this.graceDrinkIdea = paramInt; }
/* 50 */   public synchronized void setFVal(float paramFloat) { this.fVal = paramFloat; }
/* 51 */   public synchronized void setSVal(String paramString) { this.sVal = paramString; }
/* 52 */   public synchronized void setTempMillis(long paramLong) { this.tempMillis = paramLong; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatFAskDrinkT1WME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */