/*   */ package dramaman.runtime;
/*   */ 
/*   */ public class BeatStartWME extends BeatEventWME
/*   */   implements DramaManagerConstants {
/* 5 */   public BeatStartWME(Beat paramBeat) { super(0, paramBeat, paramBeat.getBeatID()); }
/*   */   
/* 7 */   public BeatStartWME() { setBeatEventID(0); }
/*   */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatStartWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */