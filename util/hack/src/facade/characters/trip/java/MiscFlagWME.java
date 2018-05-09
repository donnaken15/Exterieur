/*    */ package facade.characters.trip.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class MiscFlagWME extends WME
/*    */ {
/*    */   private boolean bGmProvocativeL2Moved;
/*    */   private boolean bMiscTempBool;
/*    */   
/*    */   public MiscFlagWME(boolean paramBoolean1, boolean paramBoolean2) {
/* 11 */     this.bGmProvocativeL2Moved = paramBoolean1;this.bMiscTempBool = paramBoolean2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized boolean getBGmProvocativeL2Moved()
/*    */   {
/* 18 */     return this.bGmProvocativeL2Moved;
/*    */   }
/*    */   
/*    */   public synchronized boolean getBMiscTempBool() {
/* 22 */     return this.bMiscTempBool;
/*    */   }
/*    */   
/*    */   public synchronized void setBGmProvocativeL2Moved(boolean paramBoolean) {
/* 26 */     this.bGmProvocativeL2Moved = paramBoolean;
/*    */   }
/*    */   
/*    */   public synchronized void setBMiscTempBool(boolean paramBoolean) {
/* 30 */     this.bMiscTempBool = paramBoolean;
/*    */   }
/*    */   
/*    */   public MiscFlagWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\trip\java\MiscFlagWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */