/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.KeyEvent;
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
/*    */ public class KeyListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.KeyListener
/*    */ {
/*    */   public KeyListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 29 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void keyPressed(KeyEvent paramKeyEvent)
/*    */   {
/* 37 */     receiveEvent(paramKeyEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void keyReleased(KeyEvent paramKeyEvent)
/*    */   {
/* 43 */     receiveEvent(paramKeyEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void keyTyped(KeyEvent paramKeyEvent)
/*    */   {
/* 49 */     receiveEvent(paramKeyEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\KeyListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */