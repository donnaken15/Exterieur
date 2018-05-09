/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class ObjectPickupRotationWME extends WME {
/*    */   private int objectID;
/*    */   private int characterID;
/*    */   private float x;
/*    */   private float y;
/*    */   private float z;
/*    */   
/*    */   public ObjectPickupRotationWME(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 13 */     this.objectID = paramInt1;
/* 14 */     this.characterID = paramInt2;
/* 15 */     this.x = paramFloat1;
/* 16 */     this.y = paramFloat2;
/* 17 */     this.z = paramFloat3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 23 */   public synchronized int getObjectID() { return this.objectID; }
/* 24 */   public synchronized int getCharacterID() { return this.characterID; }
/* 25 */   public synchronized float getX() { return this.x; }
/* 26 */   public synchronized float getY() { return this.y; }
/* 27 */   public synchronized float getZ() { return this.z; }
/*    */   
/*    */ 
/*    */ 
/* 31 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/* 32 */   public synchronized void setCharacterID(int paramInt) { this.characterID = paramInt; }
/* 33 */   public synchronized void setX(float paramFloat) { this.x = paramFloat; }
/* 34 */   public synchronized void setY(float paramFloat) { this.y = paramFloat; }
/* 35 */   public synchronized void setZ(float paramFloat) { this.z = paramFloat; }
/*    */   
/*    */   public ObjectPickupRotationWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ObjectPickupRotationWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */