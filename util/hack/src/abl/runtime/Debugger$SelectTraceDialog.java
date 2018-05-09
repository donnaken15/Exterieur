/*     */ package abl.runtime;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.Rectangle;
/*     */ import java.util.Arrays;
/*     */ import java.util.Set;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JViewport;
/*     */ import javax.swing.Scrollable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Debugger$SelectTraceDialog
/*     */   extends JDialog
/*     */ {
/*     */   private final JPanel contentPane;
/*     */   private final JPanel checkBoxes;
/*     */   private final JScrollPane checkBoxesView;
/*     */   private final JPanel buttonContainer;
/*     */   private final JButton okBtn;
/*     */   private final JButton cancelBtn;
/*     */   private final JButton selectAllBtn;
/*     */   private final JButton clearAllBtn;
/*     */   final SelectTraceDialog me;
/*     */   final Debugger this$0;
/*     */   
/*     */   class ScrollableJPanel
/*     */     extends JPanel
/*     */     implements Scrollable
/*     */   {
/*     */     public Dimension getPreferredScrollableViewportSize()
/*     */     {
/* 365 */       return getPreferredSize();
/*     */     }
/*     */     
/* 368 */     public int getScrollableUnitIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) { return new JCheckBox("Sample").getPreferredSize().height; }
/*     */     
/*     */     public int getScrollableBlockIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2)
/*     */     {
/* 372 */       JCheckBox localJCheckBox = new JCheckBox("Sample");
/* 373 */       if (paramInt1 == 1) {
/* 374 */         return paramRectangle.height - localJCheckBox.getPreferredSize().height;
/*     */       }
/* 376 */       return paramRectangle.width - localJCheckBox.getPreferredSize().height; }
/*     */     
/* 378 */     public boolean getScrollableTracksViewportWidth() { return false; }
/* 379 */     public boolean getScrollableTracksViewportHeight() { return false; }
/*     */     
/*     */     ScrollableJPanel() {}
/*     */   }
/*     */   
/* 384 */   Debugger$SelectTraceDialog(Debugger paramDebugger) { this.me = this;
/*     */     
/* 386 */     setTitle("Select behaviors to trace");
/*     */     
/*     */ 
/* 389 */     this.contentPane = new JPanel();
/* 390 */     setContentPane(this.contentPane);
/* 391 */     this.contentPane.setLayout(new BoxLayout(this.contentPane, 1));
/*     */     
/* 393 */     this.checkBoxes = new ScrollableJPanel();
/* 394 */     this.checkBoxes.setLayout(new BoxLayout(this.checkBoxes, 1));
/*     */     
/* 396 */     this.checkBoxesView = new JScrollPane(this.checkBoxes);
/* 397 */     this.checkBoxesView.getViewport().setScrollMode(2);
/*     */     
/* 399 */     this.buttonContainer = new JPanel();
/* 400 */     this.buttonContainer.setLayout(new BoxLayout(this.buttonContainer, 0));
/* 401 */     this.buttonContainer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*     */     
/*     */ 
/* 404 */     this.selectAllBtn = new JButton("Select All");
/* 405 */     this.clearAllBtn = new JButton("Clear All");
/* 406 */     this.okBtn = new JButton("OK");
/* 407 */     this.cancelBtn = new JButton("Cancel");
/*     */     
/*     */ 
/* 410 */     this.okBtn.addActionListener(new Debugger.SelectTraceDialog.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 434 */     this.cancelBtn.addActionListener(new Debugger.SelectTraceDialog.2(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */     this.selectAllBtn.addActionListener(new Debugger.SelectTraceDialog.3(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 450 */     this.clearAllBtn.addActionListener(new Debugger.SelectTraceDialog.4(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */     getContentPane().add(this.checkBoxesView);
/* 460 */     getContentPane().add(this.buttonContainer);
/* 461 */     this.buttonContainer.add(this.selectAllBtn);
/* 462 */     this.buttonContainer.add(this.clearAllBtn);
/* 463 */     this.buttonContainer.add(Box.createHorizontalStrut(30));
/* 464 */     this.buttonContainer.add(this.okBtn);
/* 465 */     this.buttonContainer.add(this.cancelBtn);
/*     */     
/*     */ 
/* 468 */     Dimension localDimension = this.buttonContainer.getMaximumSize();
/* 469 */     this.buttonContainer.setMaximumSize(new Dimension(localDimension.width, 30));
/*     */     
/*     */ 
/* 472 */     this.buttonContainer.setMinimumSize(new Dimension(200, 30));
/*     */     
/*     */ 
/*     */ 
/* 476 */     Set localSet = Debugger.access$6(this.this$0).getRegisteredBehaviors();
/* 477 */     String[] arrayOfString = (String[])localSet.toArray(new String[localSet.size()]);
/*     */     
/*     */ 
/* 480 */     Arrays.sort(arrayOfString, new Debugger.StringIgnoreCaseComparator(this.this$0));
/*     */     
/* 482 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 483 */       boolean bool = this.this$0.tracedBehaviors.contains(arrayOfString[i]);
/* 484 */       localObject = new JCheckBox(arrayOfString[i], bool);
/* 485 */       this.checkBoxes.add((Component)localObject);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 490 */     JCheckBox localJCheckBox = new JCheckBox();
/* 491 */     int j = localJCheckBox.getPreferredSize().height * arrayOfString.length;
/* 492 */     Object localObject = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getBounds().getSize();
/* 493 */     if (j > ((Dimension)localObject).height - 60) {
/* 494 */       this.checkBoxesView.setPreferredSize(new Dimension(this.checkBoxes.getPreferredSize().width, ((Dimension)localObject).height - 100));
/*     */     }
/* 496 */     setModal(true);
/* 497 */     pack();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\Debugger$SelectTraceDialog.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */