/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.event.WindowAdapter;
/*    */ import java.awt.event.WindowEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class Browser$1
/*    */   extends WindowAdapter
/*    */ {
/*    */   final Browser this$0;
/*    */   
/*    */   public final void windowClosing(WindowEvent paramWindowEvent)
/*    */   {
/* 90 */     this.this$0.setVisible(false);
/* 91 */     this.this$0.dispose();
/*    */   }
/*    */   
/*    */   Browser$1(Browser paramBrowser) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\Browser$1.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */