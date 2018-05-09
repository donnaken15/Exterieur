/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatRomPrpWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bVal;
/*    */   private int sprite;
/*    */   private float graceWalkToX;
/*    */   private float graceWalkToY;
/*    */   private float graceWalkToZ;
/*    */   private float graceWalkToRot;
/*    */   private float tripWalkToX;
/*    */   private float tripWalkToY;
/*    */   private float tripWalkToZ;
/*    */   private float tripWalkToRot;
/*    */   private String sVal;
/*    */   private long tempMillis;
/*    */   
/*    */   public BeatRomPrpWME()
/*    */   {
/* 22 */     this.bVal = false;
/* 23 */     this.sprite = 0;
/* 24 */     this.graceWalkToX = 0.0F;
/* 25 */     this.graceWalkToY = 0.0F;
/* 26 */     this.graceWalkToZ = 0.0F;
/* 27 */     this.graceWalkToRot = 0.0F;
/* 28 */     this.tripWalkToX = 0.0F;
/* 29 */     this.tripWalkToY = 0.0F;
/* 30 */     this.tripWalkToZ = 0.0F;
/* 31 */     this.tripWalkToRot = 0.0F;
/* 32 */     this.sVal = "";
/* 33 */     this.tempMillis = 0L;
/*    */   }
/*    */   
/* 36 */   public synchronized boolean getBVal() { return this.bVal; }
/* 37 */   public synchronized int getSprite() { return this.sprite; }
/* 38 */   public synchronized float getGraceWalkToX() { return this.graceWalkToX; }
/* 39 */   public synchronized float getGraceWalkToY() { return this.graceWalkToY; }
/* 40 */   public synchronized float getGraceWalkToZ() { return this.graceWalkToZ; }
/* 41 */   public synchronized float getGraceWalkToRot() { return this.graceWalkToRot; }
/* 42 */   public synchronized float getTripWalkToX() { return this.tripWalkToX; }
/* 43 */   public synchronized float getTripWalkToY() { return this.tripWalkToY; }
/* 44 */   public synchronized float getTripWalkToZ() { return this.tripWalkToZ; }
/* 45 */   public synchronized float getTripWalkToRot() { return this.tripWalkToRot; }
/* 46 */   public synchronized String getSVal() { return this.sVal; }
/* 47 */   public synchronized long getTempMillis() { return this.tempMillis; }
/*    */   
/* 49 */   public synchronized void setBVal(boolean paramBoolean) { this.bVal = paramBoolean; }
/* 50 */   public synchronized void setSprite(int paramInt) { this.sprite = paramInt; }
/* 51 */   public synchronized void setGraceWalkToX(float paramFloat) { this.graceWalkToX = paramFloat; }
/* 52 */   public synchronized void setGraceWalkToY(float paramFloat) { this.graceWalkToY = paramFloat; }
/* 53 */   public synchronized void setGraceWalkToZ(float paramFloat) { this.graceWalkToZ = paramFloat; }
/* 54 */   public synchronized void setGraceWalkToRot(float paramFloat) { this.graceWalkToRot = paramFloat; }
/* 55 */   public synchronized void setTripWalkToX(float paramFloat) { this.tripWalkToX = paramFloat; }
/* 56 */   public synchronized void setTripWalkToY(float paramFloat) { this.tripWalkToY = paramFloat; }
/* 57 */   public synchronized void setTripWalkToZ(float paramFloat) { this.tripWalkToZ = paramFloat; }
/* 58 */   public synchronized void setTripWalkToRot(float paramFloat) { this.tripWalkToRot = paramFloat; }
/* 59 */   public synchronized void setSVal(String paramString) { this.sVal = paramString; }
/* 60 */   public synchronized void setTempMillis(long paramLong) { this.tempMillis = paramLong; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatRomPrpWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */