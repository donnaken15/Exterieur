/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class ReestablishBeatGoalStoryContextWME extends TimeStampedWME
/*    */ {
/*    */   private boolean bVal;
/*    */   
/*    */   public ReestablishBeatGoalStoryContextWME()
/*    */   {
/* 11 */     this.bVal = false;
/*    */   }
/*    */   
/*    */   public ReestablishBeatGoalStoryContextWME(boolean paramBoolean)
/*    */   {
/* 16 */     this.bVal = paramBoolean;
/*    */   }
/*    */   
/* 19 */   public synchronized boolean getBVal() { return this.bVal; }
/* 20 */   public synchronized void setBVal(boolean paramBoolean) { this.bVal = paramBoolean; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ReestablishBeatGoalStoryContextWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */