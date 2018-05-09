/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ import wm.WME;
/*    */ 
/*    */ public class OneCharacterVisibleWME extends WME
/*    */ {
/*    */   private int visibleCharID;
/*    */   
/*    */   public OneCharacterVisibleWME(int paramInt)
/*    */   {
/* 12 */     this.visibleCharID = paramInt;
/*    */   }
/*    */   
/*    */ 
/*    */   public synchronized int getVisibleCharID()
/*    */   {
/* 18 */     return this.visibleCharID;
/*    */   }
/*    */   
/* 21 */   public synchronized void setVisibleCharID(int paramInt) { this.visibleCharID = paramInt; }
/*    */   
/*    */   public synchronized String formatVisibleCharID() {
/* 24 */     return PrintUtilities.spriteID_EnumToString(getVisibleCharID());
/*    */   }
/*    */   
/*    */   public OneCharacterVisibleWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\OneCharacterVisibleWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */