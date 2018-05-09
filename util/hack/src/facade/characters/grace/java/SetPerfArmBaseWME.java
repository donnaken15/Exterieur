/*    */ package facade.characters.grace.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class SetPerfArmBaseWME extends WME
/*    */ {
/*    */   private int armLBase;
/*    */   private int armRBase;
/*    */   private int armsBothBase;
/*    */   
/*    */   public SetPerfArmBaseWME(int paramInt1, int paramInt2, int paramInt3) {
/* 12 */     this.armLBase = paramInt1;this.armRBase = paramInt2;this.armsBothBase = paramInt3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized int getArmLBase()
/*    */   {
/* 19 */     return this.armLBase;
/*    */   }
/*    */   
/*    */   public synchronized int getArmRBase() {
/* 23 */     return this.armRBase;
/*    */   }
/*    */   
/*    */   public synchronized int getArmsBothBase() {
/* 27 */     return this.armsBothBase;
/*    */   }
/*    */   
/*    */   public synchronized void setArmLBase(int paramInt) {
/* 31 */     this.armLBase = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setArmRBase(int paramInt) {
/* 35 */     this.armRBase = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setArmsBothBase(int paramInt) {
/* 39 */     this.armsBothBase = paramInt;
/*    */   }
/*    */   
/*    */   public SetPerfArmBaseWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\SetPerfArmBaseWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */