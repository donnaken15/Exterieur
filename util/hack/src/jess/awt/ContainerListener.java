/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.ContainerEvent;
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
/*    */ public class ContainerListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.ContainerListener
/*    */ {
/*    */   public ContainerListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 27 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void componentAdded(ContainerEvent paramContainerEvent)
/*    */   {
/* 35 */     receiveEvent(paramContainerEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void componentRemoved(ContainerEvent paramContainerEvent)
/*    */   {
/* 41 */     receiveEvent(paramContainerEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\ContainerListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */