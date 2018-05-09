/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ 
/*    */ public class ArmBaseWME extends wm.WME
/*    */ {
/*    */   private int characterID;
/*    */   private int gestureLayer;
/*    */   private int base;
/*    */   
/*    */   public ArmBaseWME(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 13 */     this.characterID = paramInt1;
/* 14 */     this.gestureLayer = paramInt2;
/* 15 */     this.base = paramInt3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 21 */   public synchronized int getCharacterID() { return this.characterID; }
/* 22 */   public synchronized int getGestureLayer() { return this.gestureLayer; }
/* 23 */   public synchronized int getBase() { return this.base; }
/*    */   
/*    */ 
/*    */ 
/* 27 */   public synchronized void setCharacterID(int paramInt) { this.characterID = paramInt; }
/* 28 */   public synchronized void setGestureLayer(int paramInt) { this.gestureLayer = paramInt; }
/* 29 */   public synchronized void setBase(int paramInt) { this.base = paramInt; }
/*    */   
/*    */ 
/*    */ 
/* 33 */   public synchronized String formatCharacterID() { return PrintUtilities.spriteID_EnumToString(getCharacterID()); }
/* 34 */   public synchronized String formatGestureLayer() { return PrintUtilities.animLayer_EnumToString(getGestureLayer()); }
/*    */   
/*    */   public ArmBaseWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ArmBaseWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */