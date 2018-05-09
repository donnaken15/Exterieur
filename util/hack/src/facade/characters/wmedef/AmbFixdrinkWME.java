/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class AmbFixdrinkWME extends WME implements facade.util.DAType
/*    */ {
/*    */   private boolean bActiveThisSession;
/*    */   private boolean bActiveThisBeat;
/*    */   private boolean bActiveThisBeatgoal;
/*    */   private int beatCtrItLastHappened;
/*    */   private int playerDrink;
/*    */   private int tripDrink;
/*    */   private int graceDrink;
/*    */   
/*    */   public AmbFixdrinkWME()
/*    */   {
/* 17 */     this.bActiveThisSession = false;
/* 18 */     this.bActiveThisBeat = false;
/* 19 */     this.bActiveThisBeatgoal = false;
/* 20 */     this.beatCtrItLastHappened = 0;
/* 21 */     this.playerDrink = 4998;
/* 22 */     this.tripDrink = 4998;
/* 23 */     this.graceDrink = 4998;
/*    */   }
/*    */   
/*    */ 
/* 27 */   public synchronized boolean getBActiveThisSession() { return this.bActiveThisSession; }
/* 28 */   public synchronized boolean getBActiveThisBeat() { return this.bActiveThisBeat; }
/* 29 */   public synchronized boolean getBActiveThisBeatgoal() { return this.bActiveThisBeatgoal; }
/* 30 */   public synchronized int getBeatCtrItLastHappened() { return this.beatCtrItLastHappened; }
/* 31 */   public synchronized int getPlayerDrink() { return this.playerDrink; }
/* 32 */   public synchronized int getTripDrink() { return this.tripDrink; }
/* 33 */   public synchronized int getGraceDrink() { return this.graceDrink; }
/*    */   
/*    */ 
/* 36 */   public synchronized void setBActiveThisSession(boolean paramBoolean) { this.bActiveThisSession = paramBoolean; }
/* 37 */   public synchronized void setBActiveThisBeat(boolean paramBoolean) { this.bActiveThisBeat = paramBoolean; }
/* 38 */   public synchronized void setBActiveThisBeatgoal(boolean paramBoolean) { this.bActiveThisBeatgoal = paramBoolean; }
/* 39 */   public synchronized void setBeatCtrItLastHappened(int paramInt) { this.beatCtrItLastHappened = paramInt; }
/* 40 */   public synchronized void setPlayerDrink(int paramInt) { this.playerDrink = paramInt; }
/* 41 */   public synchronized void setTripDrink(int paramInt) { this.tripDrink = paramInt; }
/* 42 */   public synchronized void setGraceDrink(int paramInt) { this.graceDrink = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AmbFixdrinkWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */