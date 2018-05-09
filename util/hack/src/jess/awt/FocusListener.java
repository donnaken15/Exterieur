/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.FocusEvent;
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
/*    */ public class FocusListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.FocusListener
/*    */ {
/*    */   public FocusListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 27 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void focusGained(FocusEvent paramFocusEvent)
/*    */   {
/* 35 */     receiveEvent(paramFocusEvent);
/*    */   }
/*    */   
/*    */ 
/*    */   public void focusLost(FocusEvent paramFocusEvent)
/*    */   {
/* 41 */     receiveEvent(paramFocusEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\FocusListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */