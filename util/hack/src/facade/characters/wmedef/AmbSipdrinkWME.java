/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class AmbSipdrinkWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bActiveThisSession;
/*    */   private boolean bActiveThisBeat;
/*    */   private boolean bActiveThisBeatgoal;
/*    */   private int beatCtrItLastHappened;
/*    */   private int chance;
/*    */   private int finishScript;
/*    */   
/*    */   public AmbSipdrinkWME()
/*    */   {
/* 16 */     this.bActiveThisSession = false;
/* 17 */     this.bActiveThisBeat = false;
/* 18 */     this.bActiveThisBeatgoal = false;
/* 19 */     this.beatCtrItLastHappened = 0;
/* 20 */     this.chance = 0;
/* 21 */     this.finishScript = 0;
/*    */   }
/*    */   
/*    */ 
/* 25 */   public synchronized boolean getBActiveThisSession() { return this.bActiveThisSession; }
/* 26 */   public synchronized boolean getBActiveThisBeat() { return this.bActiveThisBeat; }
/* 27 */   public synchronized boolean getBActiveThisBeatgoal() { return this.bActiveThisBeatgoal; }
/* 28 */   public synchronized int getBeatCtrItLastHappened() { return this.beatCtrItLastHappened; }
/* 29 */   public synchronized int getChance() { return this.chance; }
/* 30 */   public synchronized int getFinishScript() { return this.finishScript; }
/*    */   
/*    */ 
/* 33 */   public synchronized void setBActiveThisSession(boolean paramBoolean) { this.bActiveThisSession = paramBoolean; }
/* 34 */   public synchronized void setBActiveThisBeat(boolean paramBoolean) { this.bActiveThisBeat = paramBoolean; }
/* 35 */   public synchronized void setBActiveThisBeatgoal(boolean paramBoolean) { this.bActiveThisBeatgoal = paramBoolean; }
/* 36 */   public synchronized void setBeatCtrItLastHappened(int paramInt) { this.beatCtrItLastHappened = paramInt; }
/* 37 */   public synchronized void setChance(int paramInt) { this.chance = paramInt; }
/* 38 */   public synchronized void setFinishScript(int paramInt) { this.finishScript = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AmbSipdrinkWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */