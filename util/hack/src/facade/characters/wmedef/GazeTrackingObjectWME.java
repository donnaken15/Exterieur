/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class GazeTrackingObjectWME extends WME {
/*    */   private int characterID;
/*    */   private int objectID;
/*    */   
/*    */   public GazeTrackingObjectWME(int paramInt1, int paramInt2) {
/* 10 */     this.characterID = paramInt1;
/* 11 */     this.objectID = paramInt2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 17 */   public synchronized int getCharacterID() { return this.characterID; }
/* 18 */   public synchronized long getObjectID() { return this.objectID; }
/*    */   
/*    */ 
/* 21 */   public synchronized void setCharacterID(int paramInt) { this.characterID = paramInt; }
/* 22 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/*    */   
/*    */   public GazeTrackingObjectWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\GazeTrackingObjectWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */