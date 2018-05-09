/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.List;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import wordnet.wn.DictionaryDatabase;
/*    */ import wordnet.wn.IndexWord;
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
/*    */ final class SearchFrame$3
/*    */   implements ActionListener
/*    */ {
/*    */   final SearchFrame this$0;
/*    */   
/*    */   public final void actionPerformed(ActionEvent paramActionEvent)
/*    */   {
/* 63 */     IndexWord localIndexWord = this.this$0.dictionary.lookupIndexWord(this.this$0.pos, this.this$0.resultList.getSelectedItem());
/* 64 */     this.this$0.browser.setWord(localIndexWord);
/*    */   }
/*    */   
/*    */   SearchFrame$3(SearchFrame paramSearchFrame) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\SearchFrame$3.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */