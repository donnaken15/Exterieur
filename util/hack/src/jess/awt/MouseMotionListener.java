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
/*    */ public class MouseMotionListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.MouseMotionListener
/*    */ {
/*    */   public MouseMotionListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 27 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void mouseDragged(MouseEvent paramMouseEvent)
/*    */   {
/* 35 */     receiveEvent(paramMouseEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void mouseMoved(MouseEvent paramMouseEvent)
/*    */   {
/* 41 */     receiveEvent(paramMouseEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\MouseMotionListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */