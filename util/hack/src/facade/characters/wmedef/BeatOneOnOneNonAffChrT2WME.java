/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatOneOnOneNonAffChrT2WME extends TimeStampedWME
/*    */ {
/*    */   private float playerOrigX;
/*    */   private float playerOrigZ;
/*    */   
/*    */   public BeatOneOnOneNonAffChrT2WME()
/*    */   {
/* 12 */     this.playerOrigX = 0.0F;
/* 13 */     this.playerOrigZ = 0.0F;
/*    */   }
/*    */   
/* 16 */   public synchronized float getPlayerOrigX() { return this.playerOrigX; }
/* 17 */   public synchronized float getPlayerOrigZ() { return this.playerOrigZ; }
/*    */   
/* 19 */   public synchronized void setPlayerOrigX(float paramFloat) { this.playerOrigX = paramFloat; }
/* 20 */   public synchronized void setPlayerOrigZ(float paramFloat) { this.playerOrigZ = paramFloat; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatOneOnOneNonAffChrT2WME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */