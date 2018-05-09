/*    */ package facade.characters.player.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class PhysicallyFavorInfoWME extends WME
/*    */ {
/*    */   private int spriteID;
/*    */   private boolean lookAtSensorActive;
/*    */   private boolean objectActivateSensorActive;
/*    */   private float lookDistance;
/*    */   
/*    */   public PhysicallyFavorInfoWME(int paramInt, boolean paramBoolean1, boolean paramBoolean2, float paramFloat) {
/* 13 */     this.spriteID = paramInt;this.lookAtSensorActive = paramBoolean1;this.objectActivateSensorActive = paramBoolean2;this.lookDistance = paramFloat;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized int getSpriteID()
/*    */   {
/* 20 */     return this.spriteID;
/*    */   }
/*    */   
/*    */   public synchronized boolean getLookAtSensorActive() {
/* 24 */     return this.lookAtSensorActive;
/*    */   }
/*    */   
/*    */   public synchronized boolean getObjectActivateSensorActive() {
/* 28 */     return this.objectActivateSensorActive;
/*    */   }
/*    */   
/*    */   public synchronized float getLookDistance() {
/* 32 */     return this.lookDistance;
/*    */   }
/*    */   
/*    */   public synchronized void setSpriteID(int paramInt) {
/* 36 */     this.spriteID = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setLookAtSensorActive(boolean paramBoolean) {
/* 40 */     this.lookAtSensorActive = paramBoolean;
/*    */   }
/*    */   
/*    */   public synchronized void setObjectActivateSensorActive(boolean paramBoolean) {
/* 44 */     this.objectActivateSensorActive = paramBoolean;
/*    */   }
/*    */   
/*    */   public synchronized void setLookDistance(float paramFloat) {
/* 48 */     this.lookDistance = paramFloat;
/*    */   }
/*    */   
/*    */   public PhysicallyFavorInfoWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\PhysicallyFavorInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */