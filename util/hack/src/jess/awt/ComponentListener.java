/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.ComponentEvent;
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
/*    */ public class ComponentListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.ComponentListener
/*    */ {
/*    */   public ComponentListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 28 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void componentHidden(ComponentEvent paramComponentEvent)
/*    */   {
/* 36 */     receiveEvent(paramComponentEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void componentMoved(ComponentEvent paramComponentEvent)
/*    */   {
/* 42 */     receiveEvent(paramComponentEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void componentResized(ComponentEvent paramComponentEvent)
/*    */   {
/* 48 */     receiveEvent(paramComponentEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void componentShown(ComponentEvent paramComponentEvent)
/*    */   {
/* 54 */     receiveEvent(paramComponentEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\ComponentListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */