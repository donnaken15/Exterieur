/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ import wm.TransientWME;
/*    */ 
/*    */ public class AnimationCueWME
/*    */   extends TransientWME
/*    */ {
/*    */   private int characterID;
/*    */   private int layerIndex;
/*    */   private int cue;
/*    */   
/*    */   public AnimationCueWME(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 15 */     this.characterID = paramInt1;
/* 16 */     this.layerIndex = paramInt2;
/* 17 */     this.cue = paramInt3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 23 */   public synchronized String formatCharacterID() { return PrintUtilities.spriteID_EnumToString(getCharacterID()); }
/* 24 */   public synchronized String formatLayerIndex() { return PrintUtilities.animLayer_EnumToString(getLayerIndex()); }
/*    */   
/*    */ 
/* 27 */   public synchronized int getCharacterID() { return this.characterID; }
/* 28 */   public synchronized int getLayerIndex() { return this.layerIndex; }
/* 29 */   public synchronized int getCue() { return this.cue; }
/*    */   
/*    */ 
/* 32 */   public synchronized void setCharacterID(int paramInt) { this.characterID = paramInt; }
/* 33 */   public synchronized void setLayerIndex(int paramInt) { this.layerIndex = paramInt; }
/* 34 */   public synchronized void setCue(int paramInt) { this.cue = paramInt; }
/*    */   
/*    */   public AnimationCueWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AnimationCueWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */