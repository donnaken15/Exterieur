/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.Checkbox;
/*    */ import java.awt.CheckboxGroup;
/*    */ import java.awt.Choice;
/*    */ import java.awt.TextField;
/*    */ import java.awt.event.ItemEvent;
/*    */ import java.awt.event.ItemListener;
/*    */ import java.util.Vector;
/*    */ import wordnet.wn.DictionaryDatabase;
/*    */ import wordnet.wn.IndexWord;
/*    */ import wordnet.wn.POS;
/*    */ import wordnet.wn.PointerType;
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
/*    */ final class BrowserPanel$2
/*    */   implements ItemListener
/*    */ {
/*    */   final BrowserPanel this$0;
/*    */   
/*    */   public final void itemStateChanged(ItemEvent paramItemEvent)
/*    */   {
/* 88 */     this.val$group.setSelectedCheckbox(this.val$box);
/* 89 */     IndexWord localIndexWord = this.this$0.dictionary.lookupIndexWord(this.val$pos, this.this$0.searchField.getText());
/* 90 */     int i = this.val$choice.getSelectedIndex();
/* 91 */     if (i == 0) {
/* 92 */       this.this$0.displaySenses(localIndexWord);
/*    */     } else {
/* 94 */       this.this$0.displaySenseChain(localIndexWord, (PointerType)this.val$pointerTypes.elementAt(i - 1));
/*    */     }
/*    */   }
/*    */   
/*    */   BrowserPanel$2(BrowserPanel paramBrowserPanel, Checkbox paramCheckbox, CheckboxGroup paramCheckboxGroup, POS paramPOS, Choice paramChoice, Vector paramVector) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\BrowserPanel$2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */