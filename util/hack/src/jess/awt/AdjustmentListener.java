/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.event.AdjustmentEvent;
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
/*    */ public class AdjustmentListener
/*    */   extends JessAWTListener
/*    */   implements java.awt.event.AdjustmentListener
/*    */ {
/*    */   public AdjustmentListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 28 */     super(paramString, paramRete);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void adjustmentValueChanged(AdjustmentEvent paramAdjustmentEvent)
/*    */   {
/* 36 */     receiveEvent(paramAdjustmentEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\AdjustmentListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */