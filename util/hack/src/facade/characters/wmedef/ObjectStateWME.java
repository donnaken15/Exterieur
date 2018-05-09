/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class ObjectStateWME extends WME
/*    */ {
/*    */   private int objectID;
/*    */   private int state;
/*    */   
/*    */   public ObjectStateWME(int paramInt1, int paramInt2)
/*    */   {
/* 12 */     this.objectID = paramInt1;
/* 13 */     this.state = paramInt2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 19 */   public synchronized int getObjectID() { return this.objectID; }
/* 20 */   public synchronized int getState() { return this.state; }
/*    */   
/*    */ 
/* 23 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/* 24 */   public synchronized void setState(int paramInt) { this.state = paramInt; }
/*    */   
/*    */   public synchronized String formatObjectID() {
/* 27 */     return facade.util.PrintUtilities.spriteID_EnumToString(getObjectID());
/*    */   }
/*    */   
/*    */   public ObjectStateWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ObjectStateWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */