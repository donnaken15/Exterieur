/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class ObjectStagingRotationWME extends WME {
/*    */   private int objectID;
/*    */   private float x;
/*    */   private float y;
/*    */   private float z;
/*    */   
/*    */   public ObjectStagingRotationWME(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 12 */     this.objectID = paramInt;
/* 13 */     this.x = paramFloat1;
/* 14 */     this.y = paramFloat2;
/* 15 */     this.z = paramFloat3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 21 */   public synchronized int getObjectID() { return this.objectID; }
/* 22 */   public synchronized float getX() { return this.x; }
/* 23 */   public synchronized float getY() { return this.y; }
/* 24 */   public synchronized float getZ() { return this.z; }
/*    */   
/*    */ 
/*    */ 
/* 28 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/* 29 */   public synchronized void setX(float paramFloat) { this.x = paramFloat; }
/* 30 */   public synchronized void setY(float paramFloat) { this.y = paramFloat; }
/* 31 */   public synchronized void setZ(float paramFloat) { this.z = paramFloat; }
/*    */   
/*    */   public ObjectStagingRotationWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ObjectStagingRotationWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */