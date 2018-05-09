/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class SignalWME extends WME
/*    */ {
/*    */   private String name;
/*    */   
/*    */   public SignalWME(String paramString) {
/* 10 */     this.name = paramString;
/*    */   }
/*    */   
/*    */ 
/*    */   public synchronized String getName()
/*    */   {
/* 16 */     return this.name;
/*    */   }
/*    */   
/* 19 */   public synchronized void setName(String paramString) { this.name = this.name; }
/*    */   
/*    */   public SignalWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\SignalWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */