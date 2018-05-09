/*    */ package facade.characters.trip.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class MoodTempWME extends WME
/*    */ {
/*    */   private int val;
/*    */   private boolean bVal;
/*    */   
/*    */   public MoodTempWME(int paramInt, boolean paramBoolean) {
/* 11 */     this.val = paramInt;this.bVal = paramBoolean;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized int getVal()
/*    */   {
/* 18 */     return this.val;
/*    */   }
/*    */   
/*    */   public synchronized boolean getBVal() {
/* 22 */     return this.bVal;
/*    */   }
/*    */   
/*    */   public synchronized void setVal(int paramInt) {
/* 26 */     this.val = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setBVal(boolean paramBoolean) {
/* 30 */     this.bVal = paramBoolean;
/*    */   }
/*    */   
/*    */   public MoodTempWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\trip\java\MoodTempWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */