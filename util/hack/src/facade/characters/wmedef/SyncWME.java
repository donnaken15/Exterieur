/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class SyncWME extends WME
/*    */ {
/*    */   private int val;
/*    */   
/*    */   public SyncWME()
/*    */   {
/* 11 */     this.val = 0;
/*    */   }
/*    */   
/* 14 */   public synchronized int getVal() { return this.val; }
/* 15 */   public synchronized void setVal(int paramInt) { this.val = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\SyncWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */