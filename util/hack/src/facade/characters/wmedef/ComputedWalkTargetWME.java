/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class ComputedWalkTargetWME extends WME
/*    */ {
/*    */   private float x;
/*    */   private float z;
/*    */   
/*    */   public ComputedWalkTargetWME(float paramFloat1, float paramFloat2) {
/* 11 */     this.x = paramFloat1;this.z = paramFloat2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized float getX()
/*    */   {
/* 18 */     return this.x;
/*    */   }
/*    */   
/*    */   public synchronized float getZ() {
/* 22 */     return this.z;
/*    */   }
/*    */   
/*    */   public synchronized void setX(float paramFloat) {
/* 26 */     this.x = paramFloat;
/*    */   }
/*    */   
/*    */   public synchronized void setZ(float paramFloat) {
/* 30 */     this.z = paramFloat;
/*    */   }
/*    */   
/*    */   public ComputedWalkTargetWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ComputedWalkTargetWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */