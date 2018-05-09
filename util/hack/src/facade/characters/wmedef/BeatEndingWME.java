/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatEndingWME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private int rxn;
/*    */   private int ctr;
/*    */   
/*    */   public BeatEndingWME()
/*    */   {
/* 13 */     this.rxn = -1;
/* 14 */     this.ctr = 0;
/*    */   }
/*    */   
/* 17 */   public synchronized int getRxn() { return this.rxn; }
/* 18 */   public synchronized int getCtr() { return this.ctr; }
/*    */   
/* 20 */   public synchronized void setRxn(int paramInt) { this.rxn = paramInt; }
/* 21 */   public synchronized void setCtr(int paramInt) { this.ctr = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatEndingWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */