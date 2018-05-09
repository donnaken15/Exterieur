/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.Choice;
/*    */ import java.awt.event.ItemEvent;
/*    */ import java.awt.event.ItemListener;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class SearchFrame$2
/*    */   implements ItemListener
/*    */ {
/*    */   final SearchFrame this$0;
/*    */   
/*    */   public final void itemStateChanged(ItemEvent paramItemEvent)
/*    */   {
/* 50 */     Choice localChoice = (Choice)paramItemEvent.getSource();
/* 51 */     this.this$0.pos = wordnet.wn.POS.CATS[localChoice.getSelectedIndex()];
/*    */   }
/*    */   
/*    */   SearchFrame$2(SearchFrame paramSearchFrame) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\SearchFrame$2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */