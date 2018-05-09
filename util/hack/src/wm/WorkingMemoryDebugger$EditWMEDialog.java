/*     */ package wm;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.Method;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JViewport;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ class WorkingMemoryDebugger$EditWMEDialog
/*     */   extends JDialog
/*     */ {
/*     */   JButton okButton;
/*     */   JButton cancelButton;
/*     */   JPanel contentPane;
/*     */   JPanel labelsAndFields;
/*     */   JScrollPane labelsAndFieldsView;
/*     */   JPanel labelContainer;
/*     */   JPanel fieldContainer;
/*     */   JPanel buttonContainer;
/*     */   String[] wmeFieldNames;
/*     */   Class[] wmeFieldTypes;
/*     */   final EditWMEDialog me;
/*     */   final WorkingMemoryDebugger this$0;
/*     */   
/*     */   WorkingMemoryDebugger$EditWMEDialog(WorkingMemoryDebugger paramWorkingMemoryDebugger, Class paramClass)
/*     */   {
/* 446 */     this.me = this;
/* 447 */     setModal(true);
/*     */     try
/*     */     {
/* 450 */       Constructor localConstructor = paramClass.getConstructor(null);
/* 451 */       WME localWME = (WME)localConstructor.newInstance(null);
/* 452 */       initializeDialog(localWME);
/*     */     } catch (Exception localException) {
/* 454 */       throw new WmeReflectionError(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   WorkingMemoryDebugger$EditWMEDialog(WorkingMemoryDebugger paramWorkingMemoryDebugger, WME paramWME) {
/* 459 */     this.me = this;
/* 460 */     setModal(true);
/* 461 */     initializeDialog(paramWME);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void initializeDialog(WME paramWME)
/*     */   {
/* 467 */     setTitle("Modify WME of class " + paramWME.getClass().getName());
/*     */     
/*     */ 
/* 470 */     this.contentPane = new JPanel();
/* 471 */     setContentPane(this.contentPane);
/* 472 */     this.contentPane.setLayout(new BoxLayout(this.contentPane, 1));
/*     */     
/* 474 */     this.labelsAndFields = new JPanel();
/* 475 */     this.labelsAndFields.setLayout(new BoxLayout(this.labelsAndFields, 0));
/* 476 */     this.labelsAndFields.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 478 */     this.labelsAndFieldsView = new JScrollPane(this.labelsAndFields);
/* 479 */     this.labelsAndFieldsView.getViewport().setScrollMode(2);
/*     */     
/* 481 */     this.labelContainer = new JPanel();
/* 482 */     this.labelContainer.setLayout(new BoxLayout(this.labelContainer, 1));
/* 483 */     this.labelContainer.setAlignmentY(0.0F);
/*     */     
/* 485 */     this.fieldContainer = new JPanel();
/* 486 */     this.fieldContainer.setLayout(new BoxLayout(this.fieldContainer, 1));
/* 487 */     this.fieldContainer.setAlignmentY(0.0F);
/*     */     
/* 489 */     this.buttonContainer = new JPanel();
/* 490 */     this.buttonContainer.setLayout(new BoxLayout(this.buttonContainer, 0));
/* 491 */     this.buttonContainer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*     */     
/*     */ 
/* 494 */     getContentPane().add(this.labelsAndFieldsView);
/* 495 */     this.labelsAndFields.add(this.labelContainer);
/* 496 */     this.labelsAndFields.add(Box.createHorizontalStrut(20));
/* 497 */     this.labelsAndFields.add(this.fieldContainer);
/* 498 */     getContentPane().add(this.buttonContainer);
/*     */     
/*     */ 
/* 501 */     this.okButton = new JButton("OK");
/* 502 */     this.cancelButton = new JButton("Cancel");
/*     */     
/*     */ 
/* 505 */     this.cancelButton.addActionListener(new WorkingMemoryDebugger.EditWMEDialog.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */     this.buttonContainer.add(Box.createHorizontalGlue());
/* 515 */     this.buttonContainer.add(this.okButton);
/* 516 */     this.buttonContainer.add(Box.createHorizontalStrut(10));
/* 517 */     this.buttonContainer.add(this.cancelButton);
/*     */     
/*     */ 
/*     */ 
/* 521 */     int i = this.buttonContainer.getMinimumSize().width;
/* 522 */     this.buttonContainer.setMinimumSize(new Dimension(i, 47));
/* 523 */     i = this.buttonContainer.getMaximumSize().width;
/* 524 */     this.buttonContainer.setMaximumSize(new Dimension(i, 47));
/* 525 */     i = this.buttonContainer.getPreferredSize().width;
/* 526 */     this.buttonContainer.setPreferredSize(new Dimension(i, 47));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 532 */     int j = 0;
/* 533 */     int k = 0;
/* 534 */     int m = 0;
/* 535 */     int n = 0;
/*     */     
/*     */ 
/* 538 */     this.wmeFieldTypes = paramWME._getFieldTypes();
/* 539 */     this.wmeFieldNames = paramWME._getFieldNames();
/* 540 */     for (int i1 = 0; i1 < this.wmeFieldNames.length; i1++) {
/* 541 */       JLabel localJLabel = new JLabel(this.wmeFieldNames[i1]);
/*     */       
/*     */ 
/* 544 */       Dimension localDimension1 = localJLabel.getPreferredSize();
/* 545 */       localDimension1.height = 21;
/* 546 */       localJLabel.setMinimumSize(localDimension1);
/* 547 */       localJLabel.setMaximumSize(localDimension1);
/* 548 */       localJLabel.setPreferredSize(localDimension1);
/*     */       
/*     */ 
/* 551 */       j += localJLabel.getPreferredSize().height;
/* 552 */       if (localJLabel.getPreferredSize().width > k) {
/* 553 */         k = localJLabel.getPreferredSize().width;
/*     */       }
/* 555 */       localJLabel.setAlignmentY(0.0F);
/* 556 */       this.labelContainer.add(localJLabel);
/*     */       Object localObject;
/*     */       try
/*     */       {
/* 560 */         String str = "_get" + WME.uppercaseFirstCharacter(this.wmeFieldNames[i1]) + "Editor";
/* 561 */         Method localMethod = paramWME.getClass().getMethod(str, null);
/* 562 */         localObject = (JComponent)localMethod.invoke(paramWME, null);
/*     */       } catch (Exception localException) {
/* 564 */         localObject = new WorkingMemoryDebugger.DefaultFieldEditor(this.this$0);
/*     */       }
/*     */       
/*     */ 
/* 568 */       Dimension localDimension2 = ((JComponent)localObject).getPreferredSize();
/* 569 */       localDimension2.height = 21;
/* 570 */       ((JComponent)localObject).setPreferredSize(localDimension2);
/* 571 */       localDimension2 = ((JComponent)localObject).getMaximumSize();
/* 572 */       localDimension2.height = 21;
/* 573 */       ((JComponent)localObject).setMaximumSize(localDimension2);
/*     */       
/*     */ 
/* 576 */       ((JComponent)localObject).setAlignmentY(0.0F);
/*     */       
/*     */ 
/* 579 */       m += localJLabel.getPreferredSize().height;
/* 580 */       if (((JComponent)localObject).getPreferredSize().width > n) {
/* 581 */         n = ((JComponent)localObject).getPreferredSize().width;
/*     */       }
/* 583 */       this.fieldContainer.add((Component)localObject);
/*     */     }
/*     */     
/*     */ 
/* 587 */     this.labelContainer.setPreferredSize(new Dimension(k, j));
/* 588 */     this.labelContainer.setMinimumSize(new Dimension(k, j));
/* 589 */     this.fieldContainer.setPreferredSize(new Dimension(n, m));
/* 590 */     this.fieldContainer.setMinimumSize(new Dimension(n, m));
/*     */     
/*     */ 
/* 593 */     i1 = this.labelContainer.getMinimumSize().width + this.fieldContainer.getMinimumSize().width + 20;
/*     */     
/*     */ 
/*     */ 
/* 597 */     this.labelsAndFieldsView.setMinimumSize(new Dimension(i1, 63));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 605 */     pack();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryDebugger$EditWMEDialog.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */