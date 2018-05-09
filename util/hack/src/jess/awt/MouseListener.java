/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.MouseEvent;
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
/*    */ public class MouseListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.MouseListener
/*    */ {
/*    */   public MouseListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 28 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void mouseClicked(MouseEvent paramMouseEvent)
/*    */   {
/* 36 */     receiveEvent(paramMouseEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void mouseEntered(MouseEvent paramMouseEvent)
/*    */   {
/* 42 */     receiveEvent(paramMouseEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void mouseExited(MouseEvent paramMouseEvent)
/*    */   {
/* 48 */     receiveEvent(paramMouseEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void mousePressed(MouseEvent paramMouseEvent)
/*    */   {
/* 54 */     receiveEvent(paramMouseEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void mouseReleased(MouseEvent paramMouseEvent)
/*    */   {
/* 60 */     receiveEvent(paramMouseEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\MouseListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */