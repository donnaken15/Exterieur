/*    */ package facade.characters.player.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class CachedPlayerPositionWME extends WME
/*    */ {
/*    */   private float x;
/*    */   private float y;
/*    */   private float z;
/*    */   
/*    */   public CachedPlayerPositionWME(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 12 */     this.x = paramFloat1;this.y = paramFloat2;this.z = paramFloat3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized float getX()
/*    */   {
/* 19 */     return this.x;
/*    */   }
/*    */   
/*    */   public synchronized float getY() {
/* 23 */     return this.y;
/*    */   }
/*    */   
/*    */   public synchronized float getZ() {
/* 27 */     return this.z;
/*    */   }
/*    */   
/*    */   public synchronized void setX(float paramFloat) {
/* 31 */     this.x = paramFloat;
/*    */   }
/*    */   
/*    */   public synchronized void setY(float paramFloat) {
/* 35 */     this.y = paramFloat;
/*    */   }
/*    */   
/*    */   public synchronized void setZ(float paramFloat) {
/* 39 */     this.z = paramFloat;
/*    */   }
/*    */   
/*    */   public CachedPlayerPositionWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\CachedPlayerPositionWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */