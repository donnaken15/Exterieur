/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatC2TGGlueWME extends TimeStampedWME
/*    */ {
/*    */   private int who;
/*    */   private boolean bFuriousOrUpset;
/*    */   private boolean bSwitchedToKitchen;
/*    */   
/*    */   public BeatC2TGGlueWME(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
/*    */   {
/* 13 */     this.who = paramInt;
/* 14 */     this.bFuriousOrUpset = paramBoolean1;
/* 15 */     this.bSwitchedToKitchen = paramBoolean2;
/*    */   }
/*    */   
/* 18 */   public synchronized int getWho() { return this.who; }
/* 19 */   public synchronized boolean getBFuriousOrUpset() { return this.bFuriousOrUpset; }
/* 20 */   public synchronized boolean getBSwitchedToKitchen() { return this.bSwitchedToKitchen; }
/*    */   
/* 22 */   public synchronized void setWho(int paramInt) { this.who = paramInt; }
/* 23 */   public synchronized void setBFuriousOrUpset(boolean paramBoolean) { this.bFuriousOrUpset = paramBoolean; }
/* 24 */   public synchronized void setBSwitchedToKitchen(boolean paramBoolean) { this.bSwitchedToKitchen = paramBoolean; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatC2TGGlueWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */