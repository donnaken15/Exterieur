/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ 
/*    */ public class HeldObjectWME extends wm.WME
/*    */ {
/*    */   private int objectID;
/*    */   private int characterID;
/*    */   private int attachPointID;
/*    */   private int objectCategory;
/*    */   
/*    */   public HeldObjectWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 14 */     this.objectID = paramInt1;
/* 15 */     this.characterID = paramInt2;
/* 16 */     this.attachPointID = paramInt3;
/* 17 */     this.objectCategory = paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 23 */   public synchronized int getObjectID() { return this.objectID; }
/* 24 */   public synchronized int getCharacterID() { return this.characterID; }
/* 25 */   public synchronized int getAttachPointID() { return this.attachPointID; }
/* 26 */   public synchronized int getObjectCategory() { return this.objectCategory; }
/*    */   
/*    */ 
/* 29 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/* 30 */   public synchronized void setCharacterID(int paramInt) { this.characterID = paramInt; }
/* 31 */   public synchronized void setAttachPointID(int paramInt) { this.attachPointID = paramInt; }
/* 32 */   public synchronized void setObjectCategory(int paramInt) { this.objectCategory = paramInt; }
/*    */   
/*    */ 
/* 35 */   public synchronized String formatObjectID() { return PrintUtilities.spriteID_EnumToString(getObjectID()); }
/* 36 */   public synchronized String formatCharacterID() { return PrintUtilities.spriteID_EnumToString(getCharacterID()); }
/*    */   
/*    */   public HeldObjectWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\HeldObjectWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */