/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BeatGoalStatusWME
/*    */   extends WME
/*    */ {
/*    */   private String bgSig;
/*    */   private boolean bCommitPointReached;
/*    */   private boolean bGistPointReached;
/*    */   private boolean bLetBeatGoalFinish;
/*    */   
/*    */   public BeatGoalStatusWME(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*    */   {
/* 17 */     this.bgSig = paramString;
/* 18 */     this.bCommitPointReached = paramBoolean1;
/* 19 */     this.bGistPointReached = paramBoolean2;
/* 20 */     this.bLetBeatGoalFinish = paramBoolean3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 26 */   public synchronized String getBgSig() { return this.bgSig; }
/* 27 */   public synchronized void setBgSig(String paramString) { this.bgSig = paramString; }
/*    */   
/* 29 */   public synchronized boolean getBCommitPointReached() { return this.bCommitPointReached; }
/* 30 */   public synchronized void setBCommitPointReached(boolean paramBoolean) { this.bCommitPointReached = paramBoolean; }
/*    */   
/* 32 */   public synchronized boolean getBGistPointReached() { return this.bGistPointReached; }
/* 33 */   public synchronized void setBGistPointReached(boolean paramBoolean) { this.bGistPointReached = paramBoolean; }
/*    */   
/* 35 */   public synchronized boolean getBLetBeatGoalFinish() { return this.bLetBeatGoalFinish; }
/* 36 */   public synchronized void setBLetBeatGoalFinish(boolean paramBoolean) { this.bLetBeatGoalFinish = paramBoolean; }
/*    */   
/*    */   public BeatGoalStatusWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatGoalStatusWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */