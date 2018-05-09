/*     */ package wm;
/*     */ 
/*     */ import java.awt.Dimension;
/*     */ import java.lang.reflect.Method;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class WorkingMemoryDebugger extends JPanel
/*     */ {
/*     */   private static final int wmeEditButtonContainerHeight = 47;
/*     */   private static final int labelAndFieldHeight = 21;
/*     */   private static final int minimumEditFieldWidth = 20;
/*     */   private static final int labelFieldHSeparation = 20;
/*     */   private WorkingMemory wmBeingDebugged;
/*     */   private javax.swing.JTree wmTree;
/*     */   private javax.swing.JCheckBox wmUpdateTreeButton;
/*     */   private javax.swing.JPopupMenu classNodePopup;
/*     */   private javax.swing.JPopupMenu wmeNodePopup;
/*     */   private javax.swing.JPopupMenu noNodePopup;
/*     */   private WME selectedWME;
/*     */   private String selectedClass;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  24 */     this.wmBeingDebugged = null;
/*  25 */     this.wmTree = null;
/*  26 */     this.wmUpdateTreeButton = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   class PopupMenuActionListener
/*     */     implements java.awt.event.ActionListener
/*     */   {
/*     */     public void actionPerformed(java.awt.event.ActionEvent paramActionEvent)
/*     */     {
/*  42 */       String str = paramActionEvent.getActionCommand();
/*  43 */       if (str.equals("Delete")) {
/*  44 */         WorkingMemoryDebugger.this.wmBeingDebugged.deleteWME(WorkingMemoryDebugger.this.selectedWME);
/*     */       }
/*  46 */       else if (str.equals("Delete all")) {
/*  47 */         WorkingMemoryDebugger.this.wmBeingDebugged.deleteAllWMEClass(WorkingMemoryDebugger.this.selectedClass);
/*     */       }
/*  49 */       else if (str.equals("Add..."))
/*     */       {
/*  51 */         WME localWME = (WME)WorkingMemoryDebugger.this.wmBeingDebugged.lookupWME(WorkingMemoryDebugger.this.selectedClass).get(0);
/*  52 */         Class localClass = localWME.getClass();
/*  53 */         new WorkingMemoryDebugger.AddWMEDialog(WorkingMemoryDebugger.this, localClass).setVisible(true);
/*     */       }
/*  55 */       else if (str.equals("Modify...")) {
/*  56 */         new WorkingMemoryDebugger.ModifyWMEDialog(WorkingMemoryDebugger.this, WorkingMemoryDebugger.this.selectedWME).setVisible(true);
/*     */       }
/*  58 */       else if (str.equals("Add WME...")) {
/*  59 */         new WorkingMemoryDebugger.ChooseWMEDialog(WorkingMemoryDebugger.this).setVisible(true);
/*     */       }
/*     */       
/*     */ 
/*  63 */       if (!WorkingMemoryDebugger.this.wmUpdateTreeButton.isSelected())
/*  64 */         WorkingMemoryDebugger.this.update();
/*     */     }
/*     */     
/*     */     PopupMenuActionListener() {} }
/*     */   
/*  69 */   protected class WMCellRenderer extends javax.swing.JTextPane implements javax.swing.tree.TreeCellRenderer { private final void jdMethod_this() { this.defaultRenderer = new javax.swing.tree.DefaultTreeCellRenderer(); }
/*     */     
/*     */     public WMCellRenderer() {
/*  72 */       jdMethod_this();
/*  73 */       setContentType("text/html");
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     private final javax.swing.tree.DefaultTreeCellRenderer defaultRenderer;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public java.awt.Component getTreeCellRendererComponent(javax.swing.JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
/*     */     {
/*     */       javax.swing.Icon localIcon;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       if (paramBoolean2) {
/* 105 */         localIcon = this.defaultRenderer.getOpenIcon();
/* 106 */       } else if (paramBoolean3) {
/* 107 */         localIcon = this.defaultRenderer.getLeafIcon();
/*     */       } else {
/* 109 */         localIcon = this.defaultRenderer.getClosedIcon();
/*     */       }
/*     */       
/*     */       java.awt.Color localColor;
/* 113 */       if (paramBoolean1) {
/* 114 */         localColor = this.defaultRenderer.getBackgroundSelectionColor();
/*     */       } else {
/* 116 */         localColor = this.defaultRenderer.getBackgroundNonSelectionColor();
/*     */       }
/* 118 */       javax.swing.tree.DefaultMutableTreeNode localDefaultMutableTreeNode = (javax.swing.tree.DefaultMutableTreeNode)paramObject;
/* 119 */       if (localDefaultMutableTreeNode.getUserObject() != null) {
/* 120 */         setDocument(getEditorKit().createDefaultDocument());
/* 121 */         if (localDefaultMutableTreeNode.getUserObject().getClass().getName().equals("java.lang.String")) {
/* 122 */           setText("<font size = \"-1\" face=\"Helvetica, Arial, sans-serif\">" + (String)localDefaultMutableTreeNode.getUserObject());
/*     */         }
/*     */         else {
/* 125 */           setText(((WME)localDefaultMutableTreeNode.getUserObject()).toString_HTML());
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */       setBackground(localColor);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       return this;
/*     */     }
/*     */   }
/*     */   
/*     */   public WorkingMemoryDebugger(WorkingMemory paramWorkingMemory)
/*     */   {
/* 154 */     jdMethod_this();
/* 155 */     this.wmBeingDebugged = paramWorkingMemory;
/* 156 */     paramWorkingMemory.setWMDebugger(this);
/* 157 */     this.wmTree = new javax.swing.JTree(this.wmBeingDebugged.getWMTreeModel());
/* 158 */     this.wmTree.setCellRenderer(new WMCellRenderer());
/* 159 */     this.wmTree.setRootVisible(false);
/* 160 */     this.wmUpdateTreeButton = new javax.swing.JCheckBox("Continuously update working memory");
/* 161 */     this.wmUpdateTreeButton.addActionListener(new WorkingMemoryDebugger.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */     javax.swing.JScrollPane localJScrollPane = new javax.swing.JScrollPane(this.wmTree);
/* 169 */     localJScrollPane.getViewport().setScrollMode(2);
/* 170 */     setLayout(new javax.swing.BoxLayout(this, 1));
/* 171 */     add(this.wmUpdateTreeButton);
/* 172 */     add(localJScrollPane);
/* 173 */     setBorder(javax.swing.BorderFactory.createTitledBorder("Working Memory"));
/*     */     
/*     */ 
/* 176 */     PopupMenuActionListener localPopupMenuActionListener = new PopupMenuActionListener();
/*     */     
/*     */ 
/*     */ 
/* 180 */     this.classNodePopup = new javax.swing.JPopupMenu();
/* 181 */     javax.swing.JMenuItem localJMenuItem = new javax.swing.JMenuItem("Add...");
/* 182 */     localJMenuItem.addActionListener(localPopupMenuActionListener);
/* 183 */     this.classNodePopup.add(localJMenuItem);
/* 184 */     localJMenuItem = new javax.swing.JMenuItem("Delete all");
/* 185 */     localJMenuItem.addActionListener(localPopupMenuActionListener);
/* 186 */     this.classNodePopup.add(localJMenuItem);
/*     */     
/*     */ 
/* 189 */     this.wmeNodePopup = new javax.swing.JPopupMenu();
/* 190 */     localJMenuItem = new javax.swing.JMenuItem("Modify...");
/* 191 */     localJMenuItem.addActionListener(localPopupMenuActionListener);
/* 192 */     this.wmeNodePopup.add(localJMenuItem);
/* 193 */     localJMenuItem = new javax.swing.JMenuItem("Delete");
/* 194 */     localJMenuItem.addActionListener(localPopupMenuActionListener);
/* 195 */     this.wmeNodePopup.add(localJMenuItem);
/*     */     
/*     */ 
/* 198 */     this.noNodePopup = new javax.swing.JPopupMenu();
/* 199 */     localJMenuItem = new javax.swing.JMenuItem("Add WME...");
/* 200 */     localJMenuItem.addActionListener(localPopupMenuActionListener);
/* 201 */     this.noNodePopup.add(localJMenuItem);
/*     */     
/*     */ 
/*     */ 
/* 205 */     WorkingMemoryDebugger.2 local2 = new WorkingMemoryDebugger.2(this);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */     this.wmTree.addMouseListener(local2);
/*     */   }
/*     */   
/*     */   private final java.util.LinkedList getAllLeafPaths(javax.swing.tree.TreeNode paramTreeNode, javax.swing.tree.DefaultTreeModel paramDefaultTreeModel)
/*     */   {
/* 234 */     java.util.LinkedList localLinkedList = new java.util.LinkedList();
/* 235 */     int i = paramTreeNode.getChildCount();
/* 236 */     if (i == 0)
/*     */     {
/* 238 */       localLinkedList.add(new javax.swing.tree.TreePath(paramDefaultTreeModel.getPathToRoot(paramTreeNode)));
/* 239 */       return localLinkedList;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 244 */     for (int j = 0; j < i; j++)
/* 245 */       localLinkedList.addAll(getAllLeafPaths(paramTreeNode.getChildAt(j), paramDefaultTreeModel));
/* 246 */     return localLinkedList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void update()
/*     */   {
/* 253 */     javax.swing.tree.DefaultTreeModel localDefaultTreeModel = this.wmBeingDebugged.getWMTreeModel();
/* 254 */     this.wmTree.setModel(localDefaultTreeModel);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void updateIfMonitoring()
/*     */   {
/* 268 */     if (this.wmUpdateTreeButton.isSelected()) {
/* 269 */       update();
/*     */     }
/*     */   }
/*     */   
/*     */   public void clearWMView()
/*     */   {
/* 275 */     this.wmTree.setModel(new javax.swing.tree.DefaultTreeModel(new javax.swing.tree.DefaultMutableTreeNode()));
/*     */   }
/*     */   
/*     */   class WMEActionListener
/*     */     implements java.awt.event.ActionListener
/*     */   {
/*     */     static final int ADD_WME = 0;
/*     */     static final int MODIFY_WME = 1;
/*     */     private int actionToPerform;
/*     */     private WME wmeToModify;
/*     */     private WorkingMemoryDebugger.EditWMEDialog dialog;
/*     */     
/*     */     WMEActionListener(WorkingMemoryDebugger.EditWMEDialog paramEditWMEDialog, WME paramWME)
/*     */     {
/* 289 */       this.actionToPerform = 1;
/* 290 */       this.wmeToModify = paramWME;
/* 291 */       this.dialog = paramEditWMEDialog;
/*     */     }
/*     */     
/*     */ 
/*     */     WMEActionListener(WorkingMemoryDebugger.EditWMEDialog paramEditWMEDialog, Class paramClass)
/*     */     {
/* 297 */       this.actionToPerform = 0;
/* 298 */       this.dialog = paramEditWMEDialog;
/*     */       try {
/* 300 */         java.lang.reflect.Constructor localConstructor = paramClass.getConstructor(null);
/* 301 */         this.wmeToModify = ((WME)localConstructor.newInstance(null));
/*     */       } catch (NoSuchMethodException localNoSuchMethodException) {
/* 303 */         throw new WmeReflectionError(localNoSuchMethodException.getMessage());
/* 304 */       } catch (InstantiationException localInstantiationException) { throw new WmeReflectionError(localInstantiationException.getMessage());
/* 305 */       } catch (IllegalAccessException localIllegalAccessException) { throw new WmeReflectionError(localIllegalAccessException.getMessage());
/* 306 */       } catch (java.lang.reflect.InvocationTargetException localInvocationTargetException) { throw new WmeReflectionError(localInvocationTargetException.getMessage());
/*     */       }
/*     */     }
/*     */     
/*     */     class IllegalWMEFieldValueException extends Exception
/*     */     {
/*     */       public String fieldValue;
/*     */       public Class fieldType;
/*     */       
/*     */       public IllegalWMEFieldValueException(String paramString, Class paramClass) {
/* 316 */         this.fieldValue = paramString;
/* 317 */         this.fieldType = paramClass;
/*     */       }
/*     */     }
/*     */     
/*     */     private final void modifyWME()
/*     */     {
/*     */       WME localWME;
/*     */       try {
/* 325 */         localWME = (WME)this.wmeToModify.getClass().getConstructor(null).newInstance(null);
/* 326 */         localWME.assign(this.wmeToModify);
/* 327 */       } catch (Exception localException) { throw new WmeReflectionError(localException);
/*     */       }
/* 329 */       int i = 0;
/*     */       try {
/* 331 */         for (int j = 0; j < this.dialog.wmeFieldTypes.length; j++)
/*     */         {
/* 333 */           String str1 = ((WMEFieldEditor)this.dialog.fieldContainer.getComponent(j)).getFieldValue();
/* 334 */           String str2 = ((javax.swing.JLabel)this.dialog.labelContainer.getComponent(j)).getText();
/*     */           try {
/* 336 */             Method localMethod = this.wmeToModify._getSetMethod(str2, this.dialog.wmeFieldTypes[j]);
/* 337 */             Object[] arrayOfObject1; if (this.dialog.wmeFieldTypes[j] == Boolean.TYPE)
/* 338 */               if ((str1.equals("true")) || (str1.equals("false"))) {
/* 339 */                 arrayOfObject1 = new Object[] { new Boolean(str1) };
/* 340 */                 localMethod.invoke(localWME, arrayOfObject1);
/*     */               } else {
/* 342 */                 throw new IllegalWMEFieldValueException(str1, this.dialog.wmeFieldTypes[j]);
/*     */               }
/*     */             try {
/* 345 */               if (this.dialog.wmeFieldTypes[j] == Byte.TYPE) {
/* 346 */                 arrayOfObject1 = new Object[] { new Byte(str1) };
/* 347 */                 localMethod.invoke(localWME, arrayOfObject1);
/*     */               }
/* 349 */               if (this.dialog.wmeFieldTypes[j] == Integer.TYPE) {
/* 350 */                 arrayOfObject1 = new Object[] { new Integer(str1) };
/* 351 */                 localMethod.invoke(localWME, arrayOfObject1);
/*     */               }
/* 353 */               if (this.dialog.wmeFieldTypes[j] == Long.TYPE) {
/* 354 */                 arrayOfObject1 = new Object[] { new Long(str1) };
/* 355 */                 localMethod.invoke(localWME, arrayOfObject1);
/*     */               }
/* 357 */               if (this.dialog.wmeFieldTypes[j] == Short.TYPE) {
/* 358 */                 arrayOfObject1 = new Object[] { new Short(str1) };
/* 359 */                 localMethod.invoke(localWME, arrayOfObject1);
/*     */               }
/* 361 */               if (this.dialog.wmeFieldTypes[j] == Float.TYPE) {
/* 362 */                 arrayOfObject1 = new Object[] { new Float(str1) };
/* 363 */                 localMethod.invoke(localWME, arrayOfObject1);
/*     */               }
/* 365 */               if (this.dialog.wmeFieldTypes[j] == Double.TYPE) {
/* 366 */                 arrayOfObject1 = new Object[] { new Double(str1) };
/* 367 */                 localMethod.invoke(localWME, arrayOfObject1);
/*     */               }
/* 369 */             } catch (NumberFormatException localNumberFormatException) { throw new IllegalWMEFieldValueException(str1, this.dialog.wmeFieldTypes[j]); }
/* 370 */             Object localObject; if (this.dialog.wmeFieldTypes[j] == Character.TYPE) {
/* 371 */               localObject = str1.toCharArray();
/* 372 */               if (localObject.length == 1) {
/* 373 */                 Object[] arrayOfObject2 = { new Character(localObject[0]) };
/* 374 */                 localMethod.invoke(localWME, arrayOfObject2);
/*     */               } else {
/* 376 */                 throw new IllegalWMEFieldValueException(str1, this.dialog.wmeFieldTypes[j]);
/*     */               } }
/* 378 */             if (this.dialog.wmeFieldTypes[j].getName().equals("java.lang.String")) {
/* 379 */               localObject = new Object[] { str1 };
/* 380 */               localMethod.invoke(localWME, (Object[])localObject);
/*     */             }
/*     */           } catch (NoSuchFieldException localNoSuchFieldException) {}
/*     */         }
/* 384 */         if (this.actionToPerform == 1) {
/* 385 */           WorkingMemoryDebugger.this.wmBeingDebugged.modifyWME(this.wmeToModify, localWME);
/* 386 */         } else if (this.actionToPerform == 0)
/* 387 */           WorkingMemoryDebugger.this.wmBeingDebugged.addWME(localWME);
/* 388 */         this.dialog.dispose();
/*     */       } catch (java.lang.reflect.InvocationTargetException localInvocationTargetException) {
/* 390 */         throw new WmeReflectionError(localInvocationTargetException);
/* 391 */       } catch (IllegalAccessException localIllegalAccessException) { throw new WmeReflectionError(localIllegalAccessException);
/* 392 */       } catch (WorkingMemoryException localWorkingMemoryException) { throw new WorkingMemoryError(localWorkingMemoryException.getMessage());
/*     */       } catch (IllegalWMEFieldValueException localIllegalWMEFieldValueException) {
/* 394 */         javax.swing.JOptionPane.showMessageDialog(this.dialog, "Field value " + localIllegalWMEFieldValueException.fieldValue + " is not a valid " + localIllegalWMEFieldValueException.fieldType);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void actionPerformed(java.awt.event.ActionEvent paramActionEvent)
/*     */     {
/* 421 */       modifyWME();
/*     */     }
/*     */   }
/*     */   
/*     */   class DefaultFieldEditor extends javax.swing.JTextField implements WMEFieldEditor {
/* 426 */     public String getFieldValue() { return getText(); }
/* 427 */     public void setFieldValue(String paramString) { setText(paramString); }
/*     */     
/*     */     DefaultFieldEditor() {}
/*     */   }
/*     */   
/*     */   class EditWMEDialog extends javax.swing.JDialog {
/*     */     javax.swing.JButton okButton;
/*     */     javax.swing.JButton cancelButton;
/*     */     JPanel contentPane;
/*     */     JPanel labelsAndFields;
/*     */     javax.swing.JScrollPane labelsAndFieldsView;
/*     */     JPanel labelContainer;
/*     */     JPanel fieldContainer;
/*     */     JPanel buttonContainer;
/*     */     String[] wmeFieldNames;
/*     */     Class[] wmeFieldTypes;
/*     */     final EditWMEDialog me;
/*     */     
/*     */     EditWMEDialog(Class paramClass) {
/* 446 */       this.me = this;
/* 447 */       setModal(true);
/*     */       try
/*     */       {
/* 450 */         java.lang.reflect.Constructor localConstructor = paramClass.getConstructor(null);
/* 451 */         WME localWME = (WME)localConstructor.newInstance(null);
/* 452 */         initializeDialog(localWME);
/*     */       } catch (Exception localException) {
/* 454 */         throw new WmeReflectionError(localException);
/*     */       }
/*     */     }
/*     */     
/*     */     EditWMEDialog(WME paramWME) {
/* 459 */       this.me = this;
/* 460 */       setModal(true);
/* 461 */       initializeDialog(paramWME);
/*     */     }
/*     */     
/*     */ 
/*     */     protected void initializeDialog(WME paramWME)
/*     */     {
/* 467 */       setTitle("Modify WME of class " + paramWME.getClass().getName());
/*     */       
/*     */ 
/* 470 */       this.contentPane = new JPanel();
/* 471 */       setContentPane(this.contentPane);
/* 472 */       this.contentPane.setLayout(new javax.swing.BoxLayout(this.contentPane, 1));
/*     */       
/* 474 */       this.labelsAndFields = new JPanel();
/* 475 */       this.labelsAndFields.setLayout(new javax.swing.BoxLayout(this.labelsAndFields, 0));
/* 476 */       this.labelsAndFields.setBorder(javax.swing.BorderFactory.createEtchedBorder());
/*     */       
/* 478 */       this.labelsAndFieldsView = new javax.swing.JScrollPane(this.labelsAndFields);
/* 479 */       this.labelsAndFieldsView.getViewport().setScrollMode(2);
/*     */       
/* 481 */       this.labelContainer = new JPanel();
/* 482 */       this.labelContainer.setLayout(new javax.swing.BoxLayout(this.labelContainer, 1));
/* 483 */       this.labelContainer.setAlignmentY(0.0F);
/*     */       
/* 485 */       this.fieldContainer = new JPanel();
/* 486 */       this.fieldContainer.setLayout(new javax.swing.BoxLayout(this.fieldContainer, 1));
/* 487 */       this.fieldContainer.setAlignmentY(0.0F);
/*     */       
/* 489 */       this.buttonContainer = new JPanel();
/* 490 */       this.buttonContainer.setLayout(new javax.swing.BoxLayout(this.buttonContainer, 0));
/* 491 */       this.buttonContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*     */       
/*     */ 
/* 494 */       getContentPane().add(this.labelsAndFieldsView);
/* 495 */       this.labelsAndFields.add(this.labelContainer);
/* 496 */       this.labelsAndFields.add(javax.swing.Box.createHorizontalStrut(20));
/* 497 */       this.labelsAndFields.add(this.fieldContainer);
/* 498 */       getContentPane().add(this.buttonContainer);
/*     */       
/*     */ 
/* 501 */       this.okButton = new javax.swing.JButton("OK");
/* 502 */       this.cancelButton = new javax.swing.JButton("Cancel");
/*     */       
/*     */ 
/* 505 */       this.cancelButton.addActionListener(new WorkingMemoryDebugger.EditWMEDialog.1(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */       this.buttonContainer.add(javax.swing.Box.createHorizontalGlue());
/* 515 */       this.buttonContainer.add(this.okButton);
/* 516 */       this.buttonContainer.add(javax.swing.Box.createHorizontalStrut(10));
/* 517 */       this.buttonContainer.add(this.cancelButton);
/*     */       
/*     */ 
/*     */ 
/* 521 */       int i = this.buttonContainer.getMinimumSize().width;
/* 522 */       this.buttonContainer.setMinimumSize(new Dimension(i, 47));
/* 523 */       i = this.buttonContainer.getMaximumSize().width;
/* 524 */       this.buttonContainer.setMaximumSize(new Dimension(i, 47));
/* 525 */       i = this.buttonContainer.getPreferredSize().width;
/* 526 */       this.buttonContainer.setPreferredSize(new Dimension(i, 47));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 532 */       int j = 0;
/* 533 */       int k = 0;
/* 534 */       int m = 0;
/* 535 */       int n = 0;
/*     */       
/*     */ 
/* 538 */       this.wmeFieldTypes = paramWME._getFieldTypes();
/* 539 */       this.wmeFieldNames = paramWME._getFieldNames();
/* 540 */       for (int i1 = 0; i1 < this.wmeFieldNames.length; i1++) {
/* 541 */         javax.swing.JLabel localJLabel = new javax.swing.JLabel(this.wmeFieldNames[i1]);
/*     */         
/*     */ 
/* 544 */         Dimension localDimension1 = localJLabel.getPreferredSize();
/* 545 */         localDimension1.height = 21;
/* 546 */         localJLabel.setMinimumSize(localDimension1);
/* 547 */         localJLabel.setMaximumSize(localDimension1);
/* 548 */         localJLabel.setPreferredSize(localDimension1);
/*     */         
/*     */ 
/* 551 */         j += localJLabel.getPreferredSize().height;
/* 552 */         if (localJLabel.getPreferredSize().width > k) {
/* 553 */           k = localJLabel.getPreferredSize().width;
/*     */         }
/* 555 */         localJLabel.setAlignmentY(0.0F);
/* 556 */         this.labelContainer.add(localJLabel);
/*     */         Object localObject;
/*     */         try
/*     */         {
/* 560 */           String str = "_get" + WME.uppercaseFirstCharacter(this.wmeFieldNames[i1]) + "Editor";
/* 561 */           Method localMethod = paramWME.getClass().getMethod(str, null);
/* 562 */           localObject = (javax.swing.JComponent)localMethod.invoke(paramWME, null);
/*     */         } catch (Exception localException) {
/* 564 */           localObject = new WorkingMemoryDebugger.DefaultFieldEditor(WorkingMemoryDebugger.this);
/*     */         }
/*     */         
/*     */ 
/* 568 */         Dimension localDimension2 = ((javax.swing.JComponent)localObject).getPreferredSize();
/* 569 */         localDimension2.height = 21;
/* 570 */         ((javax.swing.JComponent)localObject).setPreferredSize(localDimension2);
/* 571 */         localDimension2 = ((javax.swing.JComponent)localObject).getMaximumSize();
/* 572 */         localDimension2.height = 21;
/* 573 */         ((javax.swing.JComponent)localObject).setMaximumSize(localDimension2);
/*     */         
/*     */ 
/* 576 */         ((javax.swing.JComponent)localObject).setAlignmentY(0.0F);
/*     */         
/*     */ 
/* 579 */         m += localJLabel.getPreferredSize().height;
/* 580 */         if (((javax.swing.JComponent)localObject).getPreferredSize().width > n) {
/* 581 */           n = ((javax.swing.JComponent)localObject).getPreferredSize().width;
/*     */         }
/* 583 */         this.fieldContainer.add((java.awt.Component)localObject);
/*     */       }
/*     */       
/*     */ 
/* 587 */       this.labelContainer.setPreferredSize(new Dimension(k, j));
/* 588 */       this.labelContainer.setMinimumSize(new Dimension(k, j));
/* 589 */       this.fieldContainer.setPreferredSize(new Dimension(n, m));
/* 590 */       this.fieldContainer.setMinimumSize(new Dimension(n, m));
/*     */       
/*     */ 
/* 593 */       i1 = this.labelContainer.getMinimumSize().width + this.fieldContainer.getMinimumSize().width + 20;
/*     */       
/*     */ 
/*     */ 
/* 597 */       this.labelsAndFieldsView.setMinimumSize(new Dimension(i1, 63));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 605 */       pack();
/*     */     }
/*     */   }
/*     */   
/*     */   class ModifyWMEDialog extends WorkingMemoryDebugger.EditWMEDialog
/*     */   {
/*     */     ModifyWMEDialog(WME paramWME)
/*     */     {
/* 613 */       super(paramWME.getClass());
/* 614 */       this.okButton.addActionListener(new WorkingMemoryDebugger.WMEActionListener(WorkingMemoryDebugger.this, this, paramWME));
/*     */       try {
/* 616 */         for (int i = 0; i < this.wmeFieldTypes.length; i++)
/*     */         {
/*     */ 
/* 619 */           Method localMethod = paramWME._getGetMethod(this.wmeFieldNames[i]);
/* 620 */           Object localObject; if (this.wmeFieldTypes[i] == Boolean.TYPE) {
/* 621 */             localObject = (Boolean)localMethod.invoke(paramWME, null);
/* 622 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Boolean)localObject).toString());
/*     */           }
/* 624 */           else if (this.wmeFieldTypes[i] == Byte.TYPE) {
/* 625 */             localObject = (Byte)localMethod.invoke(paramWME, null);
/* 626 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Byte)localObject).toString());
/*     */           }
/* 628 */           else if (this.wmeFieldTypes[i] == Integer.TYPE) {
/* 629 */             localObject = (Integer)localMethod.invoke(paramWME, null);
/* 630 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Integer)localObject).toString());
/*     */           }
/* 632 */           else if (this.wmeFieldTypes[i] == Long.TYPE) {
/* 633 */             localObject = (Long)localMethod.invoke(paramWME, null);
/* 634 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Long)localObject).toString());
/*     */           }
/* 636 */           else if (this.wmeFieldTypes[i] == Short.TYPE) {
/* 637 */             localObject = (Short)localMethod.invoke(paramWME, null);
/* 638 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Short)localObject).toString());
/*     */           }
/* 640 */           else if (this.wmeFieldTypes[i] == Float.TYPE) {
/* 641 */             localObject = (Float)localMethod.invoke(paramWME, null);
/* 642 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Float)localObject).toString());
/*     */           }
/* 644 */           else if (this.wmeFieldTypes[i] == Double.TYPE) {
/* 645 */             localObject = (Double)localMethod.invoke(paramWME, null);
/* 646 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Double)localObject).toString());
/*     */           }
/* 648 */           else if (this.wmeFieldTypes[i] == Character.TYPE) {
/* 649 */             localObject = (Character)localMethod.invoke(paramWME, null);
/*     */             
/* 651 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Character)localObject).toString());
/*     */           }
/* 653 */           else if (this.wmeFieldTypes[i].getName().equals("java.lang.String")) {
/* 654 */             localObject = (String)localMethod.invoke(paramWME, null);
/* 655 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue((String)localObject);
/*     */           }
/*     */           else
/*     */           {
/* 659 */             localObject = localMethod.invoke(paramWME, null);
/* 660 */             if (localObject != null) {
/* 661 */               String str = localObject.toString();
/* 662 */               ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(str);
/*     */             }
/*     */             else {
/* 665 */               ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue("null");
/*     */             }
/* 667 */             ((javax.swing.JTextField)this.fieldContainer.getComponent(i)).setEditable(false);
/*     */           }
/*     */         }
/*     */       } catch (IllegalAccessException localIllegalAccessException) {
/* 671 */         throw new WmeReflectionError(localIllegalAccessException);
/* 672 */       } catch (java.lang.reflect.InvocationTargetException localInvocationTargetException) { throw new WmeReflectionError(localInvocationTargetException);
/* 673 */       } catch (NoSuchFieldException localNoSuchFieldException) { throw new WmeReflectionError(localNoSuchFieldException);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   class AddWMEDialog extends WorkingMemoryDebugger.EditWMEDialog
/*     */   {
/*     */     AddWMEDialog(Class paramClass) {
/* 681 */       super(paramClass);
/* 682 */       this.okButton.addActionListener(new WorkingMemoryDebugger.WMEActionListener(WorkingMemoryDebugger.this, this, paramClass));
/*     */     }
/*     */   }
/*     */   
/*     */   class ChooseWMEDialog extends javax.swing.JDialog
/*     */   {
/*     */     ChooseWMEDialog me;
/*     */     
/*     */     ChooseWMEDialog()
/*     */     {
/* 692 */       this.me = this;
/* 693 */       setModal(true);
/*     */       
/* 695 */       JPanel localJPanel1 = new JPanel();
/* 696 */       localJPanel1.setLayout(new javax.swing.BoxLayout(localJPanel1, 1));
/* 697 */       setContentPane(localJPanel1);
/* 698 */       javax.swing.JLabel localJLabel = new javax.swing.JLabel("Enter the fully qualified name of a WME");
/*     */       
/*     */ 
/* 701 */       localJLabel.setAlignmentX(0.0F);
/* 702 */       localJLabel.setHorizontalAlignment(2);
/*     */       
/*     */ 
/* 705 */       String[] arrayOfString = { "facade.characters.wmedef.DAWME", "facade.characters.wmedef.PlayerGestureWME" };
/*     */       
/* 707 */       javax.swing.JComboBox localJComboBox = new javax.swing.JComboBox(arrayOfString);
/* 708 */       localJComboBox.setEditable(true);
/* 709 */       localJComboBox.setSelectedItem("");
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 714 */       ((javax.swing.JTextField)localJComboBox.getEditor().getEditorComponent()).getKeymap().removeKeyStrokeBinding(javax.swing.KeyStroke.getKeyStroke("ENTER"));
/*     */       
/* 716 */       JPanel localJPanel2 = new JPanel();
/* 717 */       localJPanel2.setLayout(new javax.swing.BoxLayout(localJPanel2, 0));
/* 718 */       localJPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*     */       
/*     */ 
/* 721 */       javax.swing.JButton localJButton1 = new javax.swing.JButton("OK");
/* 722 */       localJButton1.setDefaultCapable(true);
/* 723 */       getRootPane().setDefaultButton(localJButton1);
/* 724 */       javax.swing.JButton localJButton2 = new javax.swing.JButton("Cancel");
/*     */       
/*     */ 
/* 727 */       localJButton1.addActionListener(new WorkingMemoryDebugger.ChooseWMEDialog.1(this, localJComboBox));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 745 */       localJButton2.addActionListener(new WorkingMemoryDebugger.ChooseWMEDialog.2(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 751 */       localJPanel2.add(localJButton1);
/* 752 */       localJPanel2.add(localJButton2);
/* 753 */       localJPanel1.add(localJLabel);
/* 754 */       localJPanel1.add(localJComboBox);
/* 755 */       localJPanel1.add(localJPanel2);
/*     */       
/* 757 */       pack();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryDebugger.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */