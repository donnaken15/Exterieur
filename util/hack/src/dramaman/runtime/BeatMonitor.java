/*     */ package dramaman.runtime;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ public class BeatMonitor extends javax.swing.JSplitPane
/*     */ {
/*     */   private static final int PREFERRED_WIDTH = 500;
/*     */   private static final int PREFERRED_HEIGHT = 400;
/*     */   private static final String BLANK_BEAT_NAME = "                           ";
/*     */   private static final String BLANK_ERROR = "                                 ";
/*     */   private BeatGraphPanel graph;
/*     */   private javax.swing.JList availableBeats;
/*     */   private javax.swing.JList usedBeats;
/*     */   private SatisfiedBeatsPane satisfiedBeatsPane;
/*     */   private ActiveBeatPane currentBeatPane;
/*     */   private javax.swing.JTextField cumulativeError;
/*     */   private DramaManager dramaManager;
/*     */   
/*     */   class BeatGraphPanel extends javax.swing.JPanel
/*     */   {
/*     */     private static final int MAX_BEAT = 20;
/*     */     private static final int MAX_VALUE = 5;
/*     */     private static final int VALUE_TICK_INCREMENT = 1;
/*     */     private static final int TICK_LENGTH = 10;
/*     */     private static final int NUMBER_OF_VALUE_TICKS = 5;
/*     */     private static final int X_BORDER = 40;
/*     */     private static final int Y_BORDER = 20;
/*     */     private static final int MINIMUM_GRAPH_HEIGHT = 40;
/*     */     private static final int MINIMUM_GRAPH_WIDTH = 70;
/*     */     private final Color[] colors;
/*     */     private int xAxisLength;
/*     */     private int yAxisLength;
/*     */     private float xTickDistance;
/*     */     private float yTickDistance;
/*     */     private float scale;
/*     */     private StoryTarget[] targets;
/*     */     private int maxBeats;
/*     */     java.util.Vector actualStoryValues;
/*     */     int beatCount;
/*     */     
/*     */     private final void jdMethod_this()
/*     */     {
/*  47 */       this.colors = new Color[] { Color.black, Color.red, Color.cyan, Color.green, Color.darkGray, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.white, Color.yellow };
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
/*     */     public BeatGraphPanel()
/*     */     {
/*  67 */       jdMethod_this();
/*  68 */       setMinimumSize(new java.awt.Dimension(110, 60));
/*  69 */       setBorder(javax.swing.BorderFactory.createTitledBorder("Story Arc"));
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     void setStory(Beat[] paramArrayOfBeat, int paramInt, java.util.Hashtable paramHashtable)
/*     */     {
/*  76 */       this.targets = ((StoryTarget[])paramHashtable.values().toArray(new StoryTarget[paramHashtable.size()]));
/*     */       
/*  78 */       this.maxBeats = paramInt;
/*     */       
/*  80 */       this.actualStoryValues = new java.util.Vector();
/*  81 */       this.actualStoryValues.add(new float[this.targets.length]);
/*  82 */       this.beatCount = 0;
/*  83 */       for (int i = 0; i < this.targets.length; i++)
/*  84 */         ((float[])this.actualStoryValues.get(0))[i] = this.targets[i].getInitialValue();
/*  85 */       repaint();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     void succeedBeat(Beat paramBeat)
/*     */     {
/*  94 */       this.beatCount += 1;
/*  95 */       this.actualStoryValues.add(new float[this.targets.length]);
/*  96 */       for (int i = 0; i < this.targets.length; i++) {
/*  97 */         ((float[])this.actualStoryValues.get(this.beatCount))[i] = DramaManager.getStoryMemory().getStoryValue(this.targets[i].getValueWMEName());
/*     */       }
/*  99 */       repaint();
/*     */     }
/*     */     
/*     */     private final void computeAxesInfo(java.awt.Dimension paramDimension)
/*     */     {
/* 104 */       this.xAxisLength = (paramDimension.width - 40);
/* 105 */       this.yAxisLength = (paramDimension.height - 20 - 15);
/* 106 */       this.xTickDistance = (this.xAxisLength / 20);
/* 107 */       this.yTickDistance = (this.yAxisLength / 5);
/* 108 */       this.scale = ((this.xTickDistance + this.yTickDistance) / 2.0F);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     private final void paintAxes(Graphics2D paramGraphics2D, java.awt.Dimension paramDimension, java.awt.geom.AffineTransform paramAffineTransform)
/*     */     {
/* 115 */       Line2DTransform localLine2DTransform1 = new Line2DTransform(0.0F, 0.0F, this.xAxisLength, 0.0F, paramAffineTransform);
/* 116 */       paramGraphics2D.draw(localLine2DTransform1);
/* 117 */       Line2DTransform localLine2DTransform2 = new Line2DTransform(0.0F, 0.0F, 0.0F, this.yAxisLength, paramAffineTransform);
/* 118 */       paramGraphics2D.draw(localLine2DTransform2);
/*     */       
/*     */ 
/*     */ 
/* 122 */       for (int i = 1; i <= 20; i++) {
/* 123 */         Line2DTransform localLine2DTransform3 = new Line2DTransform(i * this.xTickDistance, -5.0F, i * this.xTickDistance, 5, paramAffineTransform);
/* 124 */         paramGraphics2D.draw(localLine2DTransform3);
/*     */       }
/*     */       
/*     */ 
/* 128 */       for (int j = 1; j <= 5; j++) {
/* 129 */         Line2DTransform localLine2DTransform4 = new Line2DTransform(-5.0F, j * this.yTickDistance, 5, j * this.yTickDistance, paramAffineTransform);
/* 130 */         paramGraphics2D.draw(localLine2DTransform4);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     private final Color pickColor(int paramInt)
/*     */     {
/* 138 */       if (paramInt < this.colors.length) {
/* 139 */         return this.colors[paramInt];
/*     */       }
/* 141 */       return this.colors[(paramInt % this.colors.length)];
/*     */     }
/*     */     
/*     */ 
/*     */     private final void paintTargets(Graphics2D paramGraphics2D, java.awt.geom.AffineTransform paramAffineTransform)
/*     */     {
/* 147 */       if (this.targets != null) {
/* 148 */         for (int i = 0; i < this.targets.length; i++) {
/* 149 */           paramGraphics2D.setColor(pickColor(i));
/* 150 */           this.targets[i].drawTarget(paramGraphics2D, this.maxBeats, paramAffineTransform);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */     private final void paintActualValues(Graphics2D paramGraphics2D, java.awt.geom.AffineTransform paramAffineTransform)
/*     */     {
/* 157 */       if (this.beatCount > 0) {
/* 158 */         java.awt.BasicStroke localBasicStroke1 = (java.awt.BasicStroke)paramGraphics2D.getStroke();
/* 159 */         float[] arrayOfFloat = { 3 };
/* 160 */         java.awt.BasicStroke localBasicStroke2 = new java.awt.BasicStroke(localBasicStroke1.getLineWidth(), 0, localBasicStroke1.getLineJoin(), localBasicStroke1.getMiterLimit(), arrayOfFloat, 0.0F);
/*     */         
/* 162 */         paramGraphics2D.setStroke(localBasicStroke2);
/* 163 */         for (int i = 0; i < this.targets.length; i++) {
/* 164 */           paramGraphics2D.setColor(pickColor(i));
/*     */           
/* 166 */           for (int j = 1; j <= this.beatCount; j++)
/*     */           {
/* 168 */             Line2DTransform localLine2DTransform = new Line2DTransform(j - 1, ((float[])this.actualStoryValues.get(j - 1))[i], j, ((float[])this.actualStoryValues.get(j))[i], paramAffineTransform);
/*     */             
/* 170 */             paramGraphics2D.draw(localLine2DTransform);
/*     */           }
/*     */         }
/* 173 */         paramGraphics2D.setStroke(localBasicStroke1);
/*     */       }
/*     */     }
/*     */     
/*     */     private final void paintCurrentBeatMarker(Graphics2D paramGraphics2D, java.awt.geom.AffineTransform paramAffineTransform)
/*     */     {
/* 179 */       Color localColor = paramGraphics2D.getColor();
/* 180 */       paramGraphics2D.setColor(Color.blue);
/*     */       
/* 182 */       Line2DTransform localLine2DTransform = new Line2DTransform(this.beatCount + 1, 0.0F, this.beatCount + 1, 100.0F, paramAffineTransform);
/* 183 */       paramGraphics2D.draw(localLine2DTransform);
/*     */       
/* 185 */       paramGraphics2D.setColor(localColor);
/*     */     }
/*     */     
/*     */     public void paintComponent(java.awt.Graphics paramGraphics)
/*     */     {
/* 190 */       super.paintComponent(paramGraphics);
/* 191 */       Graphics2D localGraphics2D = (Graphics2D)paramGraphics;
/* 192 */       java.awt.Dimension localDimension = getSize();
/*     */       
/* 194 */       computeAxesInfo(localDimension);
/*     */       
/*     */ 
/* 197 */       localGraphics2D.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
/* 198 */       localGraphics2D.setRenderingHint(java.awt.RenderingHints.KEY_STROKE_CONTROL, java.awt.RenderingHints.VALUE_STROKE_NORMALIZE);
/*     */       
/*     */ 
/* 201 */       java.awt.geom.AffineTransform localAffineTransform1 = new java.awt.geom.AffineTransform(1.0F, 0.0F, 0.0F, -1.0F, 30.0F, localDimension.height - 20);
/*     */       
/* 203 */       paintAxes(localGraphics2D, localDimension, localAffineTransform1);
/*     */       
/*     */ 
/* 206 */       java.awt.geom.AffineTransform localAffineTransform2 = new java.awt.geom.AffineTransform(localAffineTransform1);
/* 207 */       localAffineTransform2.scale(this.xTickDistance, this.yTickDistance);
/* 208 */       paintTargets(localGraphics2D, localAffineTransform2);
/* 209 */       paintActualValues(localGraphics2D, localAffineTransform2);
/* 210 */       paintCurrentBeatMarker(localGraphics2D, localAffineTransform2);
/*     */     }
/*     */   }
/*     */   
/*     */   class ActiveBeatPane
/*     */     extends javax.swing.JPanel
/*     */   {
/*     */     javax.swing.JLabel currentBeat;
/*     */     JButton succeedBeatButton;
/*     */     JButton failBeatButton;
/*     */     
/*     */     public ActiveBeatPane()
/*     */     {
/* 223 */       setLayout(new javax.swing.BoxLayout(this, 1));
/* 224 */       setBorder(javax.swing.BorderFactory.createTitledBorder("Current Beat"));
/*     */       
/* 226 */       this.currentBeat = new javax.swing.JLabel("                           ");
/* 227 */       this.currentBeat.setForeground(Color.black);
/* 228 */       this.currentBeat.setAlignmentX(0.5F);
/* 229 */       add(this.currentBeat);
/* 230 */       add(javax.swing.Box.createVerticalStrut(15));
/*     */       
/* 232 */       this.succeedBeatButton = new JButton("Succeed beat");
/* 233 */       this.succeedBeatButton.setDefaultCapable(true);
/* 234 */       this.succeedBeatButton.setAlignmentX(0.5F);
/*     */       
/* 236 */       add(this.succeedBeatButton);
/*     */       
/* 238 */       add(javax.swing.Box.createVerticalStrut(5));
/*     */       
/* 240 */       this.failBeatButton = new JButton("Fail beat");
/* 241 */       this.failBeatButton.setAlignmentX(0.5F);
/* 242 */       add(this.failBeatButton);
/*     */       
/*     */ 
/* 245 */       this.succeedBeatButton.addActionListener(new BeatMonitor.ActiveBeatPane.1(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */       this.failBeatButton.addActionListener(new BeatMonitor.ActiveBeatPane.2(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */       clear();
/*     */     }
/*     */     
/*     */     public void clear()
/*     */     {
/* 267 */       this.currentBeat.setText("                           ");
/* 268 */       this.succeedBeatButton.setEnabled(false);
/* 269 */       this.failBeatButton.setEnabled(false);
/*     */     }
/*     */     
/*     */     public void setCurrentBeat(Beat paramBeat, float paramFloat)
/*     */     {
/* 274 */       this.currentBeat.setText(paramBeat.getBeatName() + "   " + paramFloat);
/* 275 */       this.succeedBeatButton.setEnabled(true);
/* 276 */       this.failBeatButton.setEnabled(true);
/*     */     } }
/*     */   
/*     */   class SatisfiedBeatsPane extends javax.swing.JPanel { private final javax.swing.JList satisfiedBeatsList;
/*     */     private final JButton autoChooseButton;
/*     */     private final javax.swing.JPopupMenu chooseBeatPopup;
/*     */     private Beat[] satisfiedBeats;
/*     */     private boolean popupEnabled;
/*     */     private int selectedBeatIndex;
/*     */     
/* 286 */     private final void jdMethod_this() { this.popupEnabled = true; }
/*     */     
/*     */     public SatisfiedBeatsPane()
/*     */     {
/* 290 */       jdMethod_this();
/* 291 */       this.satisfiedBeatsList = new javax.swing.JList(new DefaultListModel());
/* 292 */       JScrollPane localJScrollPane = new JScrollPane(this.satisfiedBeatsList);
/* 293 */       localJScrollPane.setMinimumSize(new java.awt.Dimension(140, 100));
/* 294 */       localJScrollPane.setPreferredSize(new java.awt.Dimension(140, 100));
/* 295 */       localJScrollPane.setAlignmentY(0.0F);
/* 296 */       localJScrollPane.setAlignmentX(0.5F);
/*     */       
/*     */ 
/* 299 */       this.chooseBeatPopup = new javax.swing.JPopupMenu();
/* 300 */       javax.swing.JMenuItem localJMenuItem = new javax.swing.JMenuItem("Choose beat");
/* 301 */       localJMenuItem.addActionListener(new BeatMonitor.SatisfiedBeatsPane.1(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */       this.chooseBeatPopup.add(localJMenuItem);
/*     */       
/*     */ 
/* 318 */       BeatMonitor.SatisfiedBeatsPane.2 local2 = new BeatMonitor.SatisfiedBeatsPane.2(this);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */       this.satisfiedBeatsList.addMouseListener(local2);
/*     */       
/* 328 */       this.autoChooseButton = new JButton("Auto Choose");
/* 329 */       this.autoChooseButton.setAlignmentX(0.5F);
/* 330 */       this.autoChooseButton.addActionListener(new BeatMonitor.SatisfiedBeatsPane.3(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */       this.autoChooseButton.setEnabled(false);
/*     */       
/* 344 */       setLayout(new javax.swing.BoxLayout(this, 1));
/* 345 */       setBorder(javax.swing.BorderFactory.createTitledBorder("Distribution"));
/* 346 */       setMinimumSize(new java.awt.Dimension(150, 100));
/* 347 */       setPreferredSize(new java.awt.Dimension(150, 100));
/* 348 */       setAlignmentY(0.0F);
/* 349 */       add(localJScrollPane);
/* 350 */       add(this.autoChooseButton);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     public void refreshSatisfiedBeats(Beat[] paramArrayOfBeat, java.util.Hashtable paramHashtable, int paramInt)
/*     */     {
/* 357 */       DefaultListModel localDefaultListModel = new DefaultListModel();
/* 358 */       for (int i = 0; i < paramArrayOfBeat.length; i++) {
/* 359 */         Beat localBeat = paramArrayOfBeat[i];
/* 360 */         localDefaultListModel.addElement(localBeat.getBeatName() + "   " + localBeat.getProbability());
/*     */       }
/* 362 */       this.satisfiedBeatsList.setModel(localDefaultListModel);
/* 363 */       this.satisfiedBeats = paramArrayOfBeat;
/* 364 */       this.autoChooseButton.setEnabled(true);
/* 365 */       this.satisfiedBeatsList.setEnabled(true);
/* 366 */       this.popupEnabled = true;
/*     */     }
/*     */     
/*     */     public void clear()
/*     */     {
/* 371 */       ((DefaultListModel)this.satisfiedBeatsList.getModel()).removeAllElements();
/* 372 */       this.autoChooseButton.setEnabled(false);
/* 373 */       this.satisfiedBeatsList.setEnabled(false);
/* 374 */       this.popupEnabled = false;
/*     */     }
/*     */   }
/*     */   
/*     */   public BeatMonitor()
/*     */   {
/* 380 */     setOrientation(0);
/* 381 */     setContinuousLayout(true);
/* 382 */     setResizeWeight(0.5D);
/* 383 */     this.graph = new BeatGraphPanel();
/* 384 */     setTopComponent(this.graph);
/*     */     
/* 386 */     this.dramaManager = DramaManager.getDramaManager();
/*     */     
/*     */ 
/*     */ 
/* 390 */     javax.swing.Box localBox = new javax.swing.Box(0);
/* 391 */     this.availableBeats = new javax.swing.JList(new DefaultListModel());
/* 392 */     JScrollPane localJScrollPane1 = new JScrollPane(this.availableBeats);
/* 393 */     localJScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Available Beats"));
/* 394 */     localJScrollPane1.setMinimumSize(new java.awt.Dimension(100, 100));
/* 395 */     localJScrollPane1.setPreferredSize(new java.awt.Dimension(150, 100));
/* 396 */     localJScrollPane1.setAlignmentY(0.0F);
/*     */     
/* 398 */     this.satisfiedBeatsPane = new SatisfiedBeatsPane();
/* 399 */     this.satisfiedBeatsPane.setAlignmentY(0.0F);
/*     */     
/* 401 */     javax.swing.JPanel localJPanel = new javax.swing.JPanel();
/* 402 */     localJPanel.setLayout(new javax.swing.BoxLayout(localJPanel, 1));
/* 403 */     localJPanel.setAlignmentY(0.0F);
/*     */     
/* 405 */     this.currentBeatPane = new ActiveBeatPane();
/* 406 */     this.currentBeatPane.setAlignmentY(0.5F);
/* 407 */     localJPanel.add(this.currentBeatPane);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 425 */     this.usedBeats = new javax.swing.JList(new DefaultListModel());
/* 426 */     JScrollPane localJScrollPane2 = new JScrollPane(this.usedBeats);
/* 427 */     localJScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Used Beats"));
/* 428 */     localJScrollPane2.setMinimumSize(new java.awt.Dimension(100, 100));
/* 429 */     localJScrollPane2.setPreferredSize(new java.awt.Dimension(150, 100));
/* 430 */     localJScrollPane2.setAlignmentY(0.0F);
/*     */     
/*     */ 
/* 433 */     localBox.add(localJScrollPane1);
/* 434 */     localBox.add(this.satisfiedBeatsPane);
/* 435 */     localBox.add(localJPanel);
/* 436 */     localBox.add(localJScrollPane2);
/*     */     
/* 438 */     setBottomComponent(localBox);
/* 439 */     setOneTouchExpandable(true);
/*     */   }
/*     */   
/*     */ 
/*     */   public void setStory(Beat[] paramArrayOfBeat, int paramInt, java.util.Hashtable paramHashtable)
/*     */   {
/* 445 */     this.graph.setStory(paramArrayOfBeat, paramInt, paramHashtable);
/*     */     
/*     */ 
/* 448 */     DefaultListModel localDefaultListModel = new DefaultListModel();
/* 449 */     localDefaultListModel.clear();
/* 450 */     for (int i = 0; i < paramArrayOfBeat.length; i++)
/* 451 */       localDefaultListModel.addElement(paramArrayOfBeat[i].getBeatName());
/* 452 */     this.availableBeats.setModel(localDefaultListModel);
/*     */     
/* 454 */     ((DefaultListModel)this.usedBeats.getModel()).clear();
/*     */   }
/*     */   
/*     */ 
/*     */   void succeedBeat(Beat paramBeat)
/*     */   {
/* 460 */     this.currentBeatPane.clear();
/*     */     
/*     */ 
/* 463 */     this.satisfiedBeatsPane.clear();
/*     */     
/*     */ 
/* 466 */     ((DefaultListModel)this.availableBeats.getModel()).removeElement(paramBeat.getBeatName());
/*     */     
/*     */ 
/* 469 */     ((DefaultListModel)this.usedBeats.getModel()).addElement(paramBeat.getBeatName() + "   succeeded");
/*     */     
/* 471 */     this.graph.succeedBeat(paramBeat);
/*     */   }
/*     */   
/*     */ 
/*     */   public void failBeat(Beat paramBeat)
/*     */   {
/* 477 */     this.currentBeatPane.clear();
/*     */     
/*     */ 
/* 480 */     this.satisfiedBeatsPane.clear();
/*     */     
/*     */ 
/* 483 */     ((DefaultListModel)this.availableBeats.getModel()).removeElement(paramBeat.getBeatName());
/*     */     
/*     */ 
/* 486 */     ((DefaultListModel)this.usedBeats.getModel()).addElement(paramBeat.getBeatName() + "   failed");
/*     */   }
/*     */   
/*     */ 
/*     */   public void refreshSatisfiedBeats(Beat[] paramArrayOfBeat, java.util.Hashtable paramHashtable, int paramInt)
/*     */   {
/* 492 */     this.satisfiedBeatsPane.refreshSatisfiedBeats(paramArrayOfBeat, paramHashtable, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   public void chooseBeat(Beat paramBeat)
/*     */   {
/* 498 */     this.currentBeatPane.setCurrentBeat(paramBeat, paramBeat.getProbability());
/*     */   }
/*     */   
/*     */   public void setCumulativeError(double paramDouble)
/*     */   {
/* 503 */     String str = Double.toString(paramDouble);
/* 504 */     if (str.length() > 5)
/* 505 */       str = str.substring(0, 5);
/* 506 */     this.cumulativeError.setText(str);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatMonitor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */