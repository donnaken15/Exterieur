/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class UserTestWME extends WME
/*    */ {
/*    */   private int param1;
/*    */   private int param2;
/*    */   private int param3;
/*    */   private int param4;
/*    */   
/*    */   public UserTestWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 13 */     this.param1 = paramInt1;
/* 14 */     this.param2 = paramInt2;
/* 15 */     this.param3 = paramInt3;
/* 16 */     this.param4 = paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 22 */   public synchronized int getParam1() { return this.param1; }
/* 23 */   public synchronized int getParam2() { return this.param2; }
/* 24 */   public synchronized int getParam3() { return this.param3; }
/* 25 */   public synchronized int getParam4() { return this.param4; }
/*    */   
/*    */ 
/* 28 */   public synchronized void setParam1(int paramInt) { this.param1 = paramInt; }
/* 29 */   public synchronized void setParam2(int paramInt) { this.param2 = paramInt; }
/* 30 */   public synchronized void setParam3(int paramInt) { this.param3 = paramInt; }
/* 31 */   public synchronized void setParam4(int paramInt) { this.param4 = paramInt; }
/*    */   
/*    */   public UserTestWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\UserTestWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */