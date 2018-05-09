/*    */ package facade.characters.grace.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class GazeWME extends WME
/*    */ {
/*    */   private int objectID;
/*    */   private int speed;
/*    */   private int type;
/*    */   private int alterHeadCock;
/*    */   
/*    */   public GazeWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 13 */     this.objectID = paramInt1;this.speed = paramInt2;this.type = paramInt3;this.alterHeadCock = paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized int getObjectID()
/*    */   {
/* 20 */     return this.objectID;
/*    */   }
/*    */   
/*    */   public synchronized int getSpeed() {
/* 24 */     return this.speed;
/*    */   }
/*    */   
/*    */   public synchronized int getType() {
/* 28 */     return this.type;
/*    */   }
/*    */   
/*    */   public synchronized int getAlterHeadCock() {
/* 32 */     return this.alterHeadCock;
/*    */   }
/*    */   
/*    */   public synchronized void setObjectID(int paramInt) {
/* 36 */     this.objectID = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setSpeed(int paramInt) {
/* 40 */     this.speed = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setType(int paramInt) {
/* 44 */     this.type = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setAlterHeadCock(int paramInt) {
/* 48 */     this.alterHeadCock = paramInt;
/*    */   }
/*    */   
/*    */   public GazeWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\GazeWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */