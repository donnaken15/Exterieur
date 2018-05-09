/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.TextEvent;
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
/*    */ public class TextListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.TextListener
/*    */ {
/*    */   public TextListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 27 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void textValueChanged(TextEvent paramTextEvent)
/*    */   {
/* 35 */     receiveEvent(paramTextEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\TextListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */