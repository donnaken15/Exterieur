/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class AmbDreamrecWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bActiveThisSession;
/*    */   private boolean bActiveThisBeat;
/*    */   private boolean bActiveThisBeatgoal;
/*    */   private int beatCtrItLastHappened;
/*    */   
/*    */   public AmbDreamrecWME()
/*    */   {
/* 14 */     this.bActiveThisSession = false;
/* 15 */     this.bActiveThisBeat = false;
/* 16 */     this.bActiveThisBeatgoal = false;
/* 17 */     this.beatCtrItLastHappened = 0;
/*    */   }
/*    */   
/*    */ 
/* 21 */   public synchronized boolean getBActiveThisSession() { return this.bActiveThisSession; }
/* 22 */   public synchronized boolean getBActiveThisBeat() { return this.bActiveThisBeat; }
/* 23 */   public synchronized boolean getBActiveThisBeatgoal() { return this.bActiveThisBeatgoal; }
/* 24 */   public synchronized int getBeatCtrItLastHappened() { return this.beatCtrItLastHappened; }
/*    */   
/*    */ 
/* 27 */   public synchronized void setBActiveThisSession(boolean paramBoolean) { this.bActiveThisSession = paramBoolean; }
/* 28 */   public synchronized void setBActiveThisBeat(boolean paramBoolean) { this.bActiveThisBeat = paramBoolean; }
/* 29 */   public synchronized void setBActiveThisBeatgoal(boolean paramBoolean) { this.bActiveThisBeatgoal = paramBoolean; }
/* 30 */   public synchronized void setBeatCtrItLastHappened(int paramInt) { this.beatCtrItLastHappened = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AmbDreamrecWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */