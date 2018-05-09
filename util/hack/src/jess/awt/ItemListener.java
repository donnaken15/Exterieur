/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.ItemEvent;
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
/*    */ public class ItemListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.ItemListener
/*    */ {
/*    */   public ItemListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 27 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void itemStateChanged(ItemEvent paramItemEvent)
/*    */   {
/* 35 */     receiveEvent(paramItemEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\ItemListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */