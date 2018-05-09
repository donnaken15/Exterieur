/*     */ package wordnet.browser;
/*     */ 
/*     */ import java.awt.Choice;
/*     */ import java.awt.Panel;
/*     */ import wordnet.wn.IndexWord;
/*     */ import wordnet.wn.PointerTarget;
/*     */ import wordnet.wn.PointerType;
/*     */ 
/*     */ public class BrowserPanel extends Panel
/*     */ {
/*     */   protected wordnet.wn.DictionaryDatabase dictionary;
/*     */   protected java.awt.TextField searchField;
/*     */   protected java.awt.TextArea resultTextArea;
/*     */   protected java.awt.Checkbox[] posBoxes;
/*     */   protected Choice[] posChoices;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  19 */     this.posBoxes = new java.awt.Checkbox[wordnet.wn.POS.CATS.length];
/*  20 */     this.posChoices = new Choice[wordnet.wn.POS.CATS.length]; }
/*     */   
/*  22 */   public BrowserPanel(wordnet.wn.DictionaryDatabase paramDictionaryDatabase) { jdMethod_this();
/*  23 */     this.dictionary = paramDictionaryDatabase;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  30 */     setLayout(new java.awt.GridBagLayout());
/*  31 */     java.awt.GridBagConstraints localGridBagConstraints = new java.awt.GridBagConstraints();
/*  32 */     localGridBagConstraints.gridx = 0;
/*  33 */     localGridBagConstraints.gridy = -1;
/*  34 */     localGridBagConstraints.fill = 1;
/*  35 */     Panel localPanel1 = new Panel(new java.awt.FlowLayout(0));
/*  36 */     localPanel1.setBackground(java.awt.Color.lightGray);
/*  37 */     java.awt.Label localLabel = new java.awt.Label("Search IndexWord:");
/*  38 */     localPanel1.add(localLabel);
/*  39 */     this.searchField = new java.awt.TextField("", 20);
/*  40 */     this.searchField.setBackground(java.awt.Color.white);
/*  41 */     localPanel1.add(this.searchField);
/*  42 */     add(localPanel1, localGridBagConstraints);
/*     */     
/*  44 */     Panel localPanel2 = makePointerPanel();
/*  45 */     add(localPanel2, localGridBagConstraints);
/*     */     
/*  47 */     localGridBagConstraints.weightx = (localGridBagConstraints.weighty = 1.0D);
/*  48 */     this.resultTextArea = new java.awt.TextArea(80, 24);
/*  49 */     this.resultTextArea.setBackground(java.awt.Color.white);
/*  50 */     this.resultTextArea.setEditable(false);
/*  51 */     add(this.resultTextArea, localGridBagConstraints);
/*     */     
/*  53 */     this.searchField.addActionListener(new BrowserPanel.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */     validate();
/*     */   }
/*     */   
/*     */   public void setVisible(boolean paramBoolean) {
/*  63 */     this.searchField.requestFocus();
/*  64 */     super.setVisible(paramBoolean);
/*     */   }
/*     */   
/*     */   protected Panel makePointerPanel() {
/*  68 */     Panel localPanel = new Panel();
/*  69 */     localPanel.setLayout(new java.awt.FlowLayout(0));
/*  70 */     localPanel.setBackground(java.awt.Color.lightGray);
/*     */     
/*  72 */     java.awt.CheckboxGroup localCheckboxGroup = new java.awt.CheckboxGroup();
/*  73 */     for (int i = 0; i < wordnet.wn.POS.CATS.length; i++) {
/*  74 */       wordnet.wn.POS localPOS = wordnet.wn.POS.CATS[i];
/*  75 */       java.awt.Checkbox localCheckbox = this.posBoxes[i] = new java.awt.Checkbox(localPOS.getLabel(), localCheckboxGroup, false);
/*  76 */       Choice localChoice = this.posChoices[i] = new Choice();
/*  77 */       java.util.Vector localVector = new java.util.Vector();
/*  78 */       localChoice.addItem("Senses");
/*  79 */       for (int j = 0; j < PointerType.TYPES.length; j++) {
/*  80 */         localObject = PointerType.TYPES[j];
/*  81 */         if (((PointerType)localObject).appliesTo(localPOS)) {
/*  82 */           localChoice.addItem(((PointerType)localObject).getLabel());
/*  83 */           localVector.addElement(localObject);
/*     */         }
/*     */       }
/*  86 */       BrowserPanel.2 local2 = new BrowserPanel.2(this, localCheckbox, localCheckboxGroup, localPOS, localChoice, localVector);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */       localCheckbox.addItemListener(local2);
/*  99 */       localChoice.addItemListener(local2);
/* 100 */       Object localObject = new Panel(new java.awt.GridBagLayout());
/* 101 */       java.awt.GridBagConstraints localGridBagConstraints = new java.awt.GridBagConstraints();
/* 102 */       ((Panel)localObject).add(localCheckbox, localGridBagConstraints);
/* 103 */       localGridBagConstraints.gridy = -1;
/* 104 */       localGridBagConstraints.gridx = 0;
/* 105 */       ((Panel)localObject).add(localChoice, localGridBagConstraints);
/* 106 */       localPanel.add((java.awt.Component)localObject);
/* 107 */       localCheckbox.setEnabled(false);
/* 108 */       localChoice.setEnabled(false);
/*     */     }
/*     */     
/*     */ 
/* 112 */     return localPanel;
/*     */   }
/*     */   
/*     */   synchronized void setWord(IndexWord paramIndexWord) {
/* 116 */     this.searchField.setText(paramIndexWord.getLemma());
/* 117 */     displayOverview();
/*     */   }
/*     */   
/*     */   protected synchronized void displayOverview() {
/* 121 */     String str = this.searchField.getText();
/* 122 */     StringBuffer localStringBuffer = new StringBuffer();
/* 123 */     boolean bool1 = false;
/* 124 */     for (int i = 0; i < wordnet.wn.POS.CATS.length; i++) {
/* 125 */       IndexWord localIndexWord = this.dictionary.lookupIndexWord(wordnet.wn.POS.CATS[i], str);
/* 126 */       appendSenses(localIndexWord, localStringBuffer);
/* 127 */       if (localIndexWord != null) 0; boolean bool2 = true;
/* 128 */       this.posBoxes[i].setEnabled(bool2);
/* 129 */       this.posChoices[i].setEnabled(bool2);
/* 130 */       bool1 |= bool2;
/*     */     }
/* 132 */     if (!bool1) {
/* 133 */       localStringBuffer.append("\"" + str + "\" is not defined.");
/*     */     }
/* 135 */     this.resultTextArea.setText(localStringBuffer.toString());
/*     */   }
/*     */   
/*     */   protected synchronized void displaySenses(IndexWord paramIndexWord) {
/* 139 */     StringBuffer localStringBuffer = new StringBuffer();
/* 140 */     appendSenses(paramIndexWord, localStringBuffer);
/* 141 */     this.resultTextArea.setText(localStringBuffer.toString());
/*     */   }
/*     */   
/*     */   protected void appendSenses(IndexWord paramIndexWord, StringBuffer paramStringBuffer) {
/* 145 */     if (paramIndexWord != null) {
/* 146 */       wordnet.wn.Synset[] arrayOfSynset = paramIndexWord.getSenses();
/* 147 */       int i = paramIndexWord.getTaggedSenseCount();
/* 148 */       paramStringBuffer.append("The " + paramIndexWord.getPOS().getLabel() + ' ' + paramIndexWord.getLemma() + " has " + arrayOfSynset.length + " sense" + (arrayOfSynset.length == 1 ? "" : "s") + ' ');
/* 149 */       paramStringBuffer.append("(");
/* 150 */       if (i == 0) {
/* 151 */         paramStringBuffer.append("no senses from tagged texts");
/*     */       } else {
/* 153 */         paramStringBuffer.append("first " + i + " from tagged texts");
/*     */       }
/* 155 */       paramStringBuffer.append(")\n\n");
/* 156 */       for (int j = 0; j < arrayOfSynset.length; j++) {
/* 157 */         wordnet.wn.Synset localSynset = arrayOfSynset[j];
/* 158 */         paramStringBuffer.append(j + 1 + ". " + localSynset.getLongDescription());
/* 159 */         paramStringBuffer.append('\n');
/*     */       }
/* 161 */       paramStringBuffer.append('\n');
/*     */     }
/*     */   }
/*     */   
/*     */   protected synchronized void displaySenseChain(IndexWord paramIndexWord, PointerType paramPointerType) {
/* 166 */     StringBuffer localStringBuffer = new StringBuffer();
/* 167 */     wordnet.wn.Synset[] arrayOfSynset = paramIndexWord.getSenses();
/* 168 */     localStringBuffer.append(arrayOfSynset.length + " senses of " + paramIndexWord.getLemma() + "\n\n");
/* 169 */     for (int i = 0; i < arrayOfSynset.length; i++) {
/* 170 */       if (arrayOfSynset[i].getTargets(paramPointerType).length > 0) {
/* 171 */         localStringBuffer.append("Sense " + (i + 1) + '\n');
/* 172 */         PointerType localPointerType1 = PointerType.HYPERNYM;
/* 173 */         PointerType localPointerType2 = paramPointerType;
/* 174 */         if ((paramPointerType.equals(localPointerType1)) || (paramPointerType.symmetricTo(localPointerType1))) {
/* 175 */           localPointerType1 = paramPointerType;
/* 176 */           localPointerType2 = null;
/*     */         }
/* 178 */         appendSenseChain(localStringBuffer, arrayOfSynset[i], localPointerType1, localPointerType2);
/* 179 */         localStringBuffer.append('\n');
/*     */       }
/*     */     }
/* 182 */     this.resultTextArea.setText(localStringBuffer.toString());
/*     */   }
/*     */   
/*     */   protected class Link {
/*     */     Object object;
/*     */     Link link;
/*     */     
/*     */     Link(Object paramObject, Link paramLink) {
/* 190 */       this.object = paramObject;
/* 191 */       this.link = paramLink;
/*     */     }
/*     */     
/*     */     boolean contains(Object paramObject) {
/* 195 */       for (Link localLink = this; localLink != null; localLink = localLink.link) {
/* 196 */         if (localLink.object.equals(paramObject)) {
/* 197 */           return true;
/*     */         }
/*     */       }
/* 200 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   void appendSenseChain(StringBuffer paramStringBuffer, PointerTarget paramPointerTarget, PointerType paramPointerType1, PointerType paramPointerType2) {
/* 205 */     appendSenseChain(paramStringBuffer, paramPointerTarget, paramPointerType1, paramPointerType2, 0, null);
/*     */   }
/*     */   
/*     */   void appendSenseChain(StringBuffer paramStringBuffer, PointerTarget paramPointerTarget, PointerType paramPointerType1, PointerType paramPointerType2, int paramInt, Link paramLink) {
/* 209 */     for (int i = 0; i < paramInt; i++) {
/* 210 */       paramStringBuffer.append(' ');
/*     */     }
/* 212 */     if (paramInt > 0) {
/* 213 */       paramStringBuffer.append("<=v ");
/*     */     }
/* 215 */     paramStringBuffer.append(paramPointerTarget.getDescription());
/* 216 */     paramStringBuffer.append('\n');
/*     */     PointerTarget[] arrayOfPointerTarget;
/* 218 */     int j; if (paramPointerType2 != null) {
/* 219 */       arrayOfPointerTarget = paramPointerTarget.getTargets(paramPointerType2);
/* 220 */       for (j = 0; j < arrayOfPointerTarget.length; j++) {
/* 221 */         for (int k = 0; k < paramInt; k++) {
/* 222 */           paramStringBuffer.append(' ');
/*     */         }
/* 224 */         paramStringBuffer.append(paramPointerType2.getLabel());
/* 225 */         paramStringBuffer.append(":  ");
/* 226 */         paramStringBuffer.append(arrayOfPointerTarget[j].getDescription());
/* 227 */         paramStringBuffer.append('\n');
/*     */       }
/*     */     }
/*     */     
/* 231 */     if ((paramLink == null) || (!paramLink.contains(paramPointerTarget))) {
/* 232 */       paramLink = new Link(paramPointerTarget, paramLink);
/* 233 */       arrayOfPointerTarget = paramPointerTarget.getTargets(paramPointerType1);
/* 234 */       for (j = 0; j < arrayOfPointerTarget.length; j++) {
/* 235 */         appendSenseChain(paramStringBuffer, arrayOfPointerTarget[j], paramPointerType1, paramPointerType2, paramInt + 4, paramLink);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\BrowserPanel.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */