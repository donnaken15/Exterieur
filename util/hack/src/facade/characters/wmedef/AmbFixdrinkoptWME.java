/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class AmbFixdrinkoptWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bActiveThisSession;
/*    */   private boolean bActiveThisBeat;
/*    */   private boolean bActiveThisBeatgoal;
/*    */   private int beatCtrItLastHappened;
/*    */   private int which;
/*    */   
/*    */   public AmbFixdrinkoptWME()
/*    */   {
/* 15 */     this.bActiveThisSession = false;
/* 16 */     this.bActiveThisBeat = false;
/* 17 */     this.bActiveThisBeatgoal = false;
/* 18 */     this.beatCtrItLastHappened = 0;
/* 19 */     this.which = -1;
/*    */   }
/*    */   
/*    */ 
/* 23 */   public synchronized boolean getBActiveThisSession() { return this.bActiveThisSession; }
/* 24 */   public synchronized boolean getBActiveThisBeat() { return this.bActiveThisBeat; }
/* 25 */   public synchronized boolean getBActiveThisBeatgoal() { return this.bActiveThisBeatgoal; }
/* 26 */   public synchronized int getBeatCtrItLastHappened() { return this.beatCtrItLastHappened; }
/* 27 */   public synchronized int getWhich() { return this.which; }
/*    */   
/*    */ 
/* 30 */   public synchronized void setBActiveThisSession(boolean paramBoolean) { this.bActiveThisSession = paramBoolean; }
/* 31 */   public synchronized void setBActiveThisBeat(boolean paramBoolean) { this.bActiveThisBeat = paramBoolean; }
/* 32 */   public synchronized void setBActiveThisBeatgoal(boolean paramBoolean) { this.bActiveThisBeatgoal = paramBoolean; }
/* 33 */   public synchronized void setBeatCtrItLastHappened(int paramInt) { this.beatCtrItLastHappened = paramInt; }
/* 34 */   public synchronized void setWhich(int paramInt) { this.which = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AmbFixdrinkoptWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */