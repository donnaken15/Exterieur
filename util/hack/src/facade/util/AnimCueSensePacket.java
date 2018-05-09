/*    */ package facade.util;
/*    */ 
/*    */ public class AnimCueSensePacket implements SpriteID, AnimLayer {
/*    */   private final int[][] cues;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.util.AnimCueSensePacket;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*  7 */   private final void jdMethod_this() { this.cues = new int[3][8]; }
/*    */   
/*  9 */   public AnimCueSensePacket() { jdMethod_this(); }
/*    */   
/*    */   public void setCueInfo(int paramInt, int[] paramArrayOfInt)
/*    */   {
/* 13 */     if ((!$noassert) && (paramArrayOfInt.length != 8)) throw new AssertionError();
/* 14 */     for (int i = 0; i < 8; i++)
/* 15 */       this.cues[paramInt][i] = paramArrayOfInt[i];
/*    */   }
/*    */   
/* 18 */   public int getCueInfo(int paramInt1, int paramInt2) { return this.cues[paramInt1][paramInt2]; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\AnimCueSensePacket.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */