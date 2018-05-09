/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConverseStagingWME
/*    */   extends WME
/*    */ {
/*    */   private boolean bGraceOnLeft;
/*    */   private boolean bIsGraceConverseStaging;
/*    */   private boolean bIsTripConverseStaging;
/*    */   private float graceWalkToX;
/*    */   private float graceWalkToY;
/*    */   private float graceWalkToZ;
/*    */   private float graceWalkToRotY;
/*    */   private float tripWalkToX;
/*    */   private float tripWalkToY;
/*    */   private float tripWalkToZ;
/*    */   private float tripWalkToRotY;
/*    */   
/*    */   public ConverseStagingWME(boolean paramBoolean)
/*    */   {
/* 28 */     this.bGraceOnLeft = paramBoolean;
/* 29 */     this.bIsGraceConverseStaging = false;
/* 30 */     this.bIsTripConverseStaging = false;
/*    */     
/* 32 */     this.graceWalkToX = 0.0F;
/* 33 */     this.graceWalkToY = 0.0F;
/* 34 */     this.graceWalkToZ = 0.0F;
/* 35 */     this.graceWalkToRotY = 0.0F;
/*    */     
/* 37 */     this.tripWalkToX = 0.0F;
/* 38 */     this.tripWalkToY = 0.0F;
/* 39 */     this.tripWalkToZ = 0.0F;
/* 40 */     this.tripWalkToRotY = 0.0F;
/*    */   }
/*    */   
/* 43 */   public synchronized boolean getBGraceOnLeft() { return this.bGraceOnLeft; }
/* 44 */   public synchronized boolean getBIsGraceConverseStaging() { return this.bIsGraceConverseStaging; }
/* 45 */   public synchronized boolean getBIsTripConverseStaging() { return this.bIsTripConverseStaging; }
/* 46 */   public synchronized float getGraceWalkToX() { return this.graceWalkToX; }
/* 47 */   public synchronized float getGraceWalkToY() { return this.graceWalkToY; }
/* 48 */   public synchronized float getGraceWalkToZ() { return this.graceWalkToZ; }
/* 49 */   public synchronized float getGraceWalkToRotY() { return this.graceWalkToRotY; }
/* 50 */   public synchronized float getTripWalkToX() { return this.tripWalkToX; }
/* 51 */   public synchronized float getTripWalkToY() { return this.tripWalkToY; }
/* 52 */   public synchronized float getTripWalkToZ() { return this.tripWalkToZ; }
/* 53 */   public synchronized float getTripWalkToRotY() { return this.tripWalkToRotY; }
/*    */   
/* 55 */   public synchronized void setBGraceOnLeft(boolean paramBoolean) { this.bGraceOnLeft = paramBoolean; }
/* 56 */   public synchronized void setBIsGraceConverseStaging(boolean paramBoolean) { this.bIsGraceConverseStaging = paramBoolean; }
/* 57 */   public synchronized void setBIsTripConverseStaging(boolean paramBoolean) { this.bIsTripConverseStaging = paramBoolean; }
/* 58 */   public synchronized void setGraceWalkToX(float paramFloat) { this.graceWalkToX = paramFloat; }
/* 59 */   public synchronized void setGraceWalkToY(float paramFloat) { this.graceWalkToY = paramFloat; }
/* 60 */   public synchronized void setGraceWalkToZ(float paramFloat) { this.graceWalkToZ = paramFloat; }
/* 61 */   public synchronized void setGraceWalkToRotY(float paramFloat) { this.graceWalkToRotY = paramFloat; }
/* 62 */   public synchronized void setTripWalkToX(float paramFloat) { this.tripWalkToX = paramFloat; }
/* 63 */   public synchronized void setTripWalkToY(float paramFloat) { this.tripWalkToY = paramFloat; }
/* 64 */   public synchronized void setTripWalkToZ(float paramFloat) { this.tripWalkToZ = paramFloat; }
/* 65 */   public synchronized void setTripWalkToRotY(float paramFloat) { this.tripWalkToRotY = paramFloat; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ConverseStagingWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */