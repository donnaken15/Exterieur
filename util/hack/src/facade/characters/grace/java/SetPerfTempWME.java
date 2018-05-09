/*    */ package facade.characters.grace.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class SetPerfTempWME extends WME
/*    */ {
/*    */   private boolean bVal;
/*    */   
/*    */   public SetPerfTempWME(boolean paramBoolean) {
/* 10 */     this.bVal = paramBoolean;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized boolean getBVal()
/*    */   {
/* 17 */     return this.bVal;
/*    */   }
/*    */   
/*    */   public synchronized void setBVal(boolean paramBoolean) {
/* 21 */     this.bVal = paramBoolean;
/*    */   }
/*    */   
/*    */   public SetPerfTempWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\SetPerfTempWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */