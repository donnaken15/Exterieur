/*    */ package facade.characters.player.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class OneCharacterVisibleInfoWME extends WME
/*    */ {
/*    */   private float lookDistance;
/*    */   
/*    */   public OneCharacterVisibleInfoWME(float paramFloat) {
/* 10 */     this.lookDistance = paramFloat;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized float getLookDistance()
/*    */   {
/* 17 */     return this.lookDistance;
/*    */   }
/*    */   
/*    */   public synchronized void setLookDistance(float paramFloat) {
/* 21 */     this.lookDistance = paramFloat;
/*    */   }
/*    */   
/*    */   public OneCharacterVisibleInfoWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\OneCharacterVisibleInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */