/*    */ package facade.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Point3D
/*    */ {
/*    */   public float x;
/*    */   
/*    */ 
/*    */   public float y;
/*    */   
/*    */   public float z;
/*    */   
/*    */ 
/*    */   public Point3D(float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 17 */     this.x = paramFloat1;
/* 18 */     this.y = paramFloat2;
/* 19 */     this.z = paramFloat3;
/*    */   }
/*    */   
/* 22 */   public synchronized void setX(float paramFloat) { this.x = paramFloat; }
/* 23 */   public synchronized void setY(float paramFloat) { this.y = paramFloat; }
/* 24 */   public synchronized void setZ(float paramFloat) { this.z = paramFloat; }
/*    */   
/*    */   public Point3D() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\Point3D.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */