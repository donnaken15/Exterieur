/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
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
/*    */ public class ActionListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.ActionListener
/*    */ {
/*    */   public ActionListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 28 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void actionPerformed(ActionEvent paramActionEvent)
/*    */   {
/* 36 */     receiveEvent(paramActionEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\ActionListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */