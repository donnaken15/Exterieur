/*   */ package dramaman.runtime;
/*   */ 
/*   */ public class BeatCompletedWME extends BeatEventWME
/*   */   implements DramaManagerConstants {
/* 5 */   public BeatCompletedWME(Beat paramBeat) { super(1, paramBeat, paramBeat.getBeatID()); }
/*   */   
/* 7 */   public BeatCompletedWME() { setBeatEventID(1); }
/*   */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatCompletedWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */