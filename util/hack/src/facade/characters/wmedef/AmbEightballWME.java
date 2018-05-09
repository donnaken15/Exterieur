/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class AmbEightballWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bActiveThisSession;
/*    */   private boolean bActiveThisBeat;
/*    */   private boolean bActiveThisBeatgoal;
/*    */   private int readingCtr;
/*    */   private int beatCtrItLastHappened;
/*    */   private int phraseSpoken;
/*    */   private int prevMoodValue;
/*    */   private boolean bHoldingEightballTempVal;
/*    */   
/*    */   public AmbEightballWME()
/*    */   {
/* 18 */     this.bActiveThisSession = false;
/* 19 */     this.bActiveThisBeat = false;
/* 20 */     this.bActiveThisBeatgoal = false;
/* 21 */     this.readingCtr = 0;
/* 22 */     this.beatCtrItLastHappened = 0;
/* 23 */     this.phraseSpoken = -1;
/* 24 */     this.prevMoodValue = -1;
/* 25 */     this.bHoldingEightballTempVal = false;
/*    */   }
/*    */   
/*    */ 
/* 29 */   public synchronized boolean getBActiveThisSession() { return this.bActiveThisSession; }
/* 30 */   public synchronized boolean getBActiveThisBeat() { return this.bActiveThisBeat; }
/* 31 */   public synchronized boolean getBActiveThisBeatgoal() { return this.bActiveThisBeatgoal; }
/* 32 */   public synchronized int getReadingCtr() { return this.readingCtr; }
/* 33 */   public synchronized int getBeatCtrItLastHappened() { return this.beatCtrItLastHappened; }
/* 34 */   public synchronized int getPhraseSpoken() { return this.phraseSpoken; }
/* 35 */   public synchronized int getPrevMoodValue() { return this.prevMoodValue; }
/* 36 */   public synchronized boolean getBHoldingEightballTempVal() { return this.bHoldingEightballTempVal; }
/*    */   
/*    */ 
/* 39 */   public synchronized void setBActiveThisSession(boolean paramBoolean) { this.bActiveThisSession = paramBoolean; }
/* 40 */   public synchronized void setBActiveThisBeat(boolean paramBoolean) { this.bActiveThisBeat = paramBoolean; }
/* 41 */   public synchronized void setBActiveThisBeatgoal(boolean paramBoolean) { this.bActiveThisBeatgoal = paramBoolean; }
/* 42 */   public synchronized void setReadingCtr(int paramInt) { this.readingCtr = paramInt; }
/* 43 */   public synchronized void setBeatCtrItLastHappened(int paramInt) { this.beatCtrItLastHappened = paramInt; }
/* 44 */   public synchronized void setPhraseSpoken(int paramInt) { this.phraseSpoken = paramInt; }
/* 45 */   public synchronized void setPrevMoodValue(int paramInt) { this.prevMoodValue = paramInt; }
/* 46 */   public synchronized void setBHoldingEightballTempVal(boolean paramBoolean) { this.bHoldingEightballTempVal = paramBoolean; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AmbEightballWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */