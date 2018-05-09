/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.EventQueue;
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.Window;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
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
/*    */ final class QuitDialog$2
/*    */   implements ActionListener
/*    */ {
/*    */   final QuitDialog this$0;
/*    */   
/*    */   public final void actionPerformed(ActionEvent paramActionEvent)
/*    */   {
/* 51 */     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new WindowEvent((Window)this.this$0.getParent(), 201));
/*    */   }
/*    */   
/*    */   QuitDialog$2(QuitDialog paramQuitDialog) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\QuitDialog$2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */