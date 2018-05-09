/*    */ package facade.characters.trip.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class DoGestureTempWME extends WME
/*    */ {
/*    */   private int val;
/*    */   
/*    */   public DoGestureTempWME(int paramInt) {
/* 10 */     this.val = paramInt;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized int getVal()
/*    */   {
/* 17 */     return this.val;
/*    */   }
/*    */   
/*    */   public synchronized void setVal(int paramInt) {
/* 21 */     this.val = paramInt;
/*    */   }
/*    */   
/*    */   public DoGestureTempWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\trip\java\DoGestureTempWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */