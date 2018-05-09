/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.List;
/*    */ import java.awt.Panel;
/*    */ import java.awt.TextField;
/*    */ import java.util.Enumeration;
/*    */ import java.util.Vector;
/*    */ 
/*    */ 
/*    */ class SearchFrame
/*    */   extends java.awt.Frame
/*    */ {
/*    */   protected BrowserPanel browser;
/*    */   protected wordnet.wn.DictionaryDatabase dictionary;
/*    */   protected TextField searchField;
/*    */   protected List resultList;
/*    */   protected wordnet.wn.POS pos;
/*    */   
/* 19 */   private final void jdMethod_this() { this.pos = wordnet.wn.POS.CATS[0]; }
/*    */   
/*    */   SearchFrame(BrowserPanel paramBrowserPanel) {
/* 22 */     super("Substring Search");jdMethod_this();
/* 23 */     this.browser = paramBrowserPanel;
/* 24 */     this.dictionary = paramBrowserPanel.dictionary;
/* 25 */     setVisible(false);
/*    */     
/* 27 */     setSize(400, 300);
/* 28 */     setLocation(paramBrowserPanel.getLocation().x + 20, paramBrowserPanel.getLocation().y + 20);
/* 29 */     setLayout(new java.awt.GridBagLayout());
/* 30 */     java.awt.GridBagConstraints localGridBagConstraints = new java.awt.GridBagConstraints();
/* 31 */     localGridBagConstraints.fill = 1;
/*    */     
/* 33 */     Panel localPanel = new Panel(new java.awt.FlowLayout(0));
/* 34 */     java.awt.Label localLabel = new java.awt.Label("Substring");
/* 35 */     localPanel.add(localLabel);
/* 36 */     this.searchField = new TextField("", 20);
/* 37 */     this.searchField.setBackground(java.awt.Color.white);
/* 38 */     localPanel.add(this.searchField);
/* 39 */     this.searchField.addActionListener(new SearchFrame.1(this));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 44 */     java.awt.Choice localChoice = new java.awt.Choice();
/* 45 */     for (int i = 0; i < wordnet.wn.POS.CATS.length; i++) {
/* 46 */       localChoice.add(wordnet.wn.POS.CATS[i].getLabel());
/*    */     }
/* 48 */     localChoice.addItemListener(new SearchFrame.2(this));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */     localPanel.add(localChoice);
/* 55 */     add(localPanel, localGridBagConstraints);
/*    */     
/* 57 */     localGridBagConstraints.gridx = 0;
/* 58 */     localGridBagConstraints.weightx = (localGridBagConstraints.weighty = 1.0D);
/* 59 */     this.resultList = new List();
/* 60 */     this.resultList.setBackground(java.awt.Color.white);
/* 61 */     this.resultList.addActionListener(new SearchFrame.3(this));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */     add(this.resultList, localGridBagConstraints);
/*    */     
/* 69 */     addWindowListener(new SearchFrame.4(this));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 75 */     validate();
/*    */     
/* 77 */     setVisible(true);
/* 78 */     this.searchField.requestFocus();
/*    */   }
/*    */   
/*    */   protected void recomputeResults() {
/* 82 */     String str = this.searchField.getText();
/* 83 */     this.resultList.removeAll();
/* 84 */     this.resultList.add("Searching for " + str + "...");
/* 85 */     this.resultList.setEnabled(false);
/* 86 */     Vector localVector = new Vector();
/* 87 */     for (Enumeration localEnumeration = this.dictionary.searchIndexWords(this.pos, str); localEnumeration.hasMoreElements();) {
/* 88 */       wordnet.wn.IndexWord localIndexWord = (wordnet.wn.IndexWord)localEnumeration.nextElement();
/* 89 */       localVector.addElement(localIndexWord.getLemma());
/*    */     }
/* 91 */     this.resultList.removeAll();
/* 92 */     for (localEnumeration = localVector.elements(); localEnumeration.hasMoreElements();) {
/* 93 */       this.resultList.add((String)localEnumeration.nextElement());
/*    */     }
/* 95 */     this.resultList.setEnabled(true);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\SearchFrame.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */