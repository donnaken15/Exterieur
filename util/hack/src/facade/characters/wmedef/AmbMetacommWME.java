/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class AmbMetacommWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bActiveThisSession;
/*    */   private boolean bActiveThisBeat;
/*    */   private boolean bActiveThisBeatgoal;
/*    */   private int prevAffinity;
/*    */   private boolean bAffinityChangeFromNDone;
/*    */   private boolean bAffinityChangeSwitchDone;
/*    */   
/*    */   public AmbMetacommWME()
/*    */   {
/* 16 */     this.bActiveThisSession = false;
/* 17 */     this.bActiveThisBeat = false;
/* 18 */     this.bActiveThisBeatgoal = false;
/* 19 */     this.prevAffinity = 0;
/* 20 */     this.bAffinityChangeFromNDone = false;
/* 21 */     this.bAffinityChangeSwitchDone = false;
/*    */   }
/*    */   
/*    */ 
/* 25 */   public synchronized boolean getBActiveThisSession() { return this.bActiveThisSession; }
/* 26 */   public synchronized boolean getBActiveThisBeat() { return this.bActiveThisBeat; }
/* 27 */   public synchronized boolean getBActiveThisBeatgoal() { return this.bActiveThisBeatgoal; }
/* 28 */   public synchronized int getPrevAffinity() { return this.prevAffinity; }
/* 29 */   public synchronized boolean getBAffinityChangeFromNDone() { return this.bAffinityChangeFromNDone; }
/* 30 */   public synchronized boolean getBAffinityChangeSwitchDone() { return this.bAffinityChangeSwitchDone; }
/*    */   
/*    */ 
/* 33 */   public synchronized void setBActiveThisSession(boolean paramBoolean) { this.bActiveThisSession = paramBoolean; }
/* 34 */   public synchronized void setBActiveThisBeat(boolean paramBoolean) { this.bActiveThisBeat = paramBoolean; }
/* 35 */   public synchronized void setBActiveThisBeatgoal(boolean paramBoolean) { this.bActiveThisBeatgoal = paramBoolean; }
/* 36 */   public synchronized void setPrevAffinity(int paramInt) { this.prevAffinity = paramInt; }
/* 37 */   public synchronized void setBAffinityChangeFromNDone(boolean paramBoolean) { this.bAffinityChangeFromNDone = paramBoolean; }
/* 38 */   public synchronized void setBAffinityChangeSwitchDone(boolean paramBoolean) { this.bAffinityChangeSwitchDone = paramBoolean; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AmbMetacommWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */