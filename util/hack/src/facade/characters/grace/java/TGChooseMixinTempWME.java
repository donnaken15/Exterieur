/*    */ package facade.characters.grace.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class TGChooseMixinTempWME extends WME
/*    */ {
/*    */   private int val;
/*    */   
/*    */   public TGChooseMixinTempWME(int paramInt) {
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
/*    */   public TGChooseMixinTempWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\TGChooseMixinTempWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */