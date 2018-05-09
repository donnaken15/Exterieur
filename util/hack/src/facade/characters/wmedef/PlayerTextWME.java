/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class PlayerTextWME extends WME
/*    */ {
/*    */   private String playerString;
/*    */   
/*    */   public PlayerTextWME(String paramString)
/*    */   {
/* 11 */     this.playerString = paramString;
/*    */   }
/*    */   
/*    */ 
/*    */   public synchronized String getPlayerString()
/*    */   {
/* 17 */     return new String(this.playerString);
/*    */   }
/*    */   
/* 20 */   public synchronized void setPlayerString(String paramString) { this.playerString = new String(paramString); }
/*    */   
/*    */   public PlayerTextWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerTextWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */