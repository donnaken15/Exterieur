/*    */ package dramaman.runtime;
/*    */ 
/*    */ public class BeatAbortWME extends BeatEventWME implements DramaManagerConstants
/*    */ {
/*    */   private int beatAbortReason;
/*    */   
/*    */   public BeatAbortWME(Beat paramBeat)
/*    */   {
/*  9 */     super(2, paramBeat, paramBeat.getBeatID());
/* 10 */     this.beatAbortReason = 0;
/*    */   }
/*    */   
/*    */   public BeatAbortWME(Beat paramBeat, int paramInt)
/*    */   {
/* 15 */     super(2, paramBeat, paramBeat.getBeatID());
/* 16 */     this.beatAbortReason = paramInt;
/*    */   }
/*    */   
/* 19 */   public BeatAbortWME() { setBeatEventID(2); }
/*    */   
/* 21 */   public int getBeatAbortReason() { return this.beatAbortReason; }
/* 22 */   public void setBeatAbortReason(int paramInt) { this.beatAbortReason = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatAbortWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */