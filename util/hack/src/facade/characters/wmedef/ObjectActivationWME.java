/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TransientWME;
/*    */ 
/*    */ public class ObjectActivationWME
/*    */   extends TransientWME
/*    */ {
/*    */   private int objectID;
/*    */   private int activationID;
/*    */   private int activatorID;
/*    */   
/*    */   public ObjectActivationWME(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 14 */     this.objectID = paramInt1;
/* 15 */     this.activationID = paramInt2;
/* 16 */     this.activatorID = paramInt3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 22 */   public synchronized int getObjectID() { return this.objectID; }
/* 23 */   public synchronized int getActivationID() { return this.activationID; }
/* 24 */   public synchronized int getActivatorID() { return this.activatorID; }
/*    */   
/*    */ 
/* 27 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/* 28 */   public synchronized void setActivationID(int paramInt) { this.activationID = paramInt; }
/* 29 */   public synchronized void setActivatorID(int paramInt) { this.activatorID = paramInt; }
/*    */   
/*    */   public ObjectActivationWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ObjectActivationWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */