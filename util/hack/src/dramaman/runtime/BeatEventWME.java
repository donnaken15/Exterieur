/*    */ package dramaman.runtime;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatEventWME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private int beatEventID;
/*    */   private int beatID;
/*    */   private Beat beat;
/*    */   
/*    */   public BeatEventWME(int paramInt1, Beat paramBeat, int paramInt2)
/*    */   {
/* 15 */     this.beatEventID = paramInt1;
/* 16 */     this.beat = paramBeat;
/* 17 */     this.beatID = paramInt2;
/*    */   }
/*    */   
/*    */ 
/*    */   public String formatBeatID()
/*    */   {
/* 23 */     return PrintUtilities.beatID_EnumToString(getBeatID());
/*    */   }
/*    */   
/* 26 */   public synchronized int getBeatEventID() { return this.beatEventID; }
/* 27 */   public synchronized void setBeatEventID(int paramInt) { this.beatEventID = paramInt; }
/*    */   
/* 29 */   public synchronized int getBeatID() { return this.beatID; }
/* 30 */   public synchronized void setBeatID(int paramInt) { this.beatID = paramInt; }
/*    */   
/* 32 */   public synchronized Beat getBeat() { return this.beat; }
/* 33 */   public synchronized void setBeat(Beat paramBeat) { this.beat = paramBeat; }
/*    */   
/*    */   public BeatEventWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatEventWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */