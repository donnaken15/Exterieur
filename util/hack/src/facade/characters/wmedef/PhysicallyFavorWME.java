/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class PhysicallyFavorWME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private int objectID;
/*    */   private int favoringCharID;
/*    */   private boolean handled;
/*    */   
/*    */   public PhysicallyFavorWME(int paramInt1, int paramInt2)
/*    */   {
/* 15 */     this.objectID = paramInt1;
/* 16 */     this.favoringCharID = paramInt2;
/* 17 */     this.handled = false;
/*    */   }
/*    */   
/*    */   public PhysicallyFavorWME(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 22 */     super(paramInt3);
/* 23 */     this.objectID = paramInt1;
/* 24 */     this.favoringCharID = paramInt2;
/* 25 */     this.handled = false;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 31 */   public synchronized int getObjectID() { return this.objectID; }
/* 32 */   public synchronized int getFavoringCharID() { return this.favoringCharID; }
/* 33 */   public synchronized boolean getHandled() { return this.handled; }
/*    */   
/*    */ 
/* 36 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/* 37 */   public synchronized void setFavoringCharID(int paramInt) { this.favoringCharID = paramInt; }
/* 38 */   public synchronized void setHandled(boolean paramBoolean) { this.handled = paramBoolean; }
/*    */   
/*    */ 
/* 41 */   public synchronized String formatObjectID() { return PrintUtilities.spriteID_EnumToString(getObjectID()); }
/* 42 */   public synchronized String formatFavoringCharID() { return PrintUtilities.spriteID_EnumToString(getFavoringCharID()); }
/*    */   
/*    */   public PhysicallyFavorWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PhysicallyFavorWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */