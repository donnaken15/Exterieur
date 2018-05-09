/*     */ package dramaman.runtime;
/*     */ 
/*     */ import java.awt.Dimension;
/*     */ import java.util.Hashtable;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JMenuItem;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPopupMenu;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class BeatMonitor$SatisfiedBeatsPane
/*     */   extends JPanel
/*     */ {
/*     */   private final JList satisfiedBeatsList;
/*     */   private final JButton autoChooseButton;
/*     */   private final JPopupMenu chooseBeatPopup;
/*     */   private Beat[] satisfiedBeats;
/*     */   private boolean popupEnabled;
/*     */   private int selectedBeatIndex;
/*     */   final BeatMonitor this$0;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/* 286 */     this.popupEnabled = true;
/*     */   }
/*     */   
/*     */   public BeatMonitor$SatisfiedBeatsPane(BeatMonitor paramBeatMonitor) {
/* 290 */     jdMethod_this();
/* 291 */     this.satisfiedBeatsList = new JList(new DefaultListModel());
/* 292 */     JScrollPane localJScrollPane = new JScrollPane(this.satisfiedBeatsList);
/* 293 */     localJScrollPane.setMinimumSize(new Dimension(140, 100));
/* 294 */     localJScrollPane.setPreferredSize(new Dimension(140, 100));
/* 295 */     localJScrollPane.setAlignmentY(0.0F);
/* 296 */     localJScrollPane.setAlignmentX(0.5F);
/*     */     
/*     */ 
/* 299 */     this.chooseBeatPopup = new JPopupMenu();
/* 300 */     JMenuItem localJMenuItem = new JMenuItem("Choose beat");
/* 301 */     localJMenuItem.addActionListener(new BeatMonitor.SatisfiedBeatsPane.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */     this.chooseBeatPopup.add(localJMenuItem);
/*     */     
/*     */ 
/* 318 */     BeatMonitor.SatisfiedBeatsPane.2 local2 = new BeatMonitor.SatisfiedBeatsPane.2(this);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */     this.satisfiedBeatsList.addMouseListener(local2);
/*     */     
/* 328 */     this.autoChooseButton = new JButton("Auto Choose");
/* 329 */     this.autoChooseButton.setAlignmentX(0.5F);
/* 330 */     this.autoChooseButton.addActionListener(new BeatMonitor.SatisfiedBeatsPane.3(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */     this.autoChooseButton.setEnabled(false);
/*     */     
/* 344 */     setLayout(new BoxLayout(this, 1));
/* 345 */     setBorder(BorderFactory.createTitledBorder("Distribution"));
/* 346 */     setMinimumSize(new Dimension(150, 100));
/* 347 */     setPreferredSize(new Dimension(150, 100));
/* 348 */     setAlignmentY(0.0F);
/* 349 */     add(localJScrollPane);
/* 350 */     add(this.autoChooseButton);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void refreshSatisfiedBeats(Beat[] paramArrayOfBeat, Hashtable paramHashtable, int paramInt)
/*     */   {
/* 357 */     DefaultListModel localDefaultListModel = new DefaultListModel();
/* 358 */     for (int i = 0; i < paramArrayOfBeat.length; i++) {
/* 359 */       Beat localBeat = paramArrayOfBeat[i];
/* 360 */       localDefaultListModel.addElement(localBeat.getBeatName() + "   " + localBeat.getProbability());
/*     */     }
/* 362 */     this.satisfiedBeatsList.setModel(localDefaultListModel);
/* 363 */     this.satisfiedBeats = paramArrayOfBeat;
/* 364 */     this.autoChooseButton.setEnabled(true);
/* 365 */     this.satisfiedBeatsList.setEnabled(true);
/* 366 */     this.popupEnabled = true;
/*     */   }
/*     */   
/*     */   public void clear()
/*     */   {
/* 371 */     ((DefaultListModel)this.satisfiedBeatsList.getModel()).removeAllElements();
/* 372 */     this.autoChooseButton.setEnabled(false);
/* 373 */     this.satisfiedBeatsList.setEnabled(false);
/* 374 */     this.popupEnabled = false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatMonitor$SatisfiedBeatsPane.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */