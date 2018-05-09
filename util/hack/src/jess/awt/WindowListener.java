/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.WindowEvent;
/*    */ import jess.JessException;
/*    */ import jess.Rete;
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
/*    */ public class WindowListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.WindowListener
/*    */ {
/*    */   public WindowListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 29 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void windowActivated(WindowEvent paramWindowEvent)
/*    */   {
/* 37 */     receiveEvent(paramWindowEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void windowDeactivated(WindowEvent paramWindowEvent)
/*    */   {
/* 43 */     receiveEvent(paramWindowEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void windowDeiconified(WindowEvent paramWindowEvent)
/*    */   {
/* 49 */     receiveEvent(paramWindowEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void windowIconified(WindowEvent paramWindowEvent)
/*    */   {
/* 55 */     receiveEvent(paramWindowEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void windowOpened(WindowEvent paramWindowEvent)
/*    */   {
/* 61 */     receiveEvent(paramWindowEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void windowClosed(WindowEvent paramWindowEvent)
/*    */   {
/* 67 */     receiveEvent(paramWindowEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void windowClosing(WindowEvent paramWindowEvent)
/*    */   {
/* 73 */     receiveEvent(paramWindowEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\WindowListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */