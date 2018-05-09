/*     */ package dramaman.runtime;
/*     */ 
/*     */ import java.awt.BasicStroke;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.util.Collection;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Vector;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class BeatMonitor$BeatGraphPanel
/*     */   extends JPanel
/*     */ {
/*     */   private static final int MAX_BEAT = 20;
/*     */   private static final int MAX_VALUE = 5;
/*     */   private static final int VALUE_TICK_INCREMENT = 1;
/*     */   private static final int TICK_LENGTH = 10;
/*     */   private static final int NUMBER_OF_VALUE_TICKS = 5;
/*     */   private static final int X_BORDER = 40;
/*     */   private static final int Y_BORDER = 20;
/*     */   private static final int MINIMUM_GRAPH_HEIGHT = 40;
/*     */   private static final int MINIMUM_GRAPH_WIDTH = 70;
/*     */   private final Color[] colors;
/*     */   private int xAxisLength;
/*     */   private int yAxisLength;
/*     */   private float xTickDistance;
/*     */   private float yTickDistance;
/*     */   private float scale;
/*     */   private StoryTarget[] targets;
/*     */   private int maxBeats;
/*     */   Vector actualStoryValues;
/*     */   int beatCount;
/*     */   final BeatMonitor this$0;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  47 */     this.colors = new Color[] { Color.black, Color.red, Color.cyan, Color.green, Color.darkGray, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.white, Color.yellow };
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BeatMonitor$BeatGraphPanel(BeatMonitor paramBeatMonitor)
/*     */   {
/*  67 */     jdMethod_this();
/*  68 */     setMinimumSize(new Dimension(110, 60));
/*  69 */     setBorder(BorderFactory.createTitledBorder("Story Arc"));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void setStory(Beat[] paramArrayOfBeat, int paramInt, Hashtable paramHashtable)
/*     */   {
/*  76 */     this.targets = ((StoryTarget[])paramHashtable.values().toArray(new StoryTarget[paramHashtable.size()]));
/*     */     
/*  78 */     this.maxBeats = paramInt;
/*     */     
/*  80 */     this.actualStoryValues = new Vector();
/*  81 */     this.actualStoryValues.add(new float[this.targets.length]);
/*  82 */     this.beatCount = 0;
/*  83 */     for (int i = 0; i < this.targets.length; i++)
/*  84 */       ((float[])this.actualStoryValues.get(0))[i] = this.targets[i].getInitialValue();
/*  85 */     repaint();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void succeedBeat(Beat paramBeat)
/*     */   {
/*  94 */     this.beatCount += 1;
/*  95 */     this.actualStoryValues.add(new float[this.targets.length]);
/*  96 */     for (int i = 0; i < this.targets.length; i++) {
/*  97 */       ((float[])this.actualStoryValues.get(this.beatCount))[i] = DramaManager.getStoryMemory().getStoryValue(this.targets[i].getValueWMEName());
/*     */     }
/*  99 */     repaint();
/*     */   }
/*     */   
/*     */   private final void computeAxesInfo(Dimension paramDimension)
/*     */   {
/* 104 */     this.xAxisLength = (paramDimension.width - 40);
/* 105 */     this.yAxisLength = (paramDimension.height - 20 - 15);
/* 106 */     this.xTickDistance = (this.xAxisLength / 20);
/* 107 */     this.yTickDistance = (this.yAxisLength / 5);
/* 108 */     this.scale = ((this.xTickDistance + this.yTickDistance) / 2.0F);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final void paintAxes(Graphics2D paramGraphics2D, Dimension paramDimension, AffineTransform paramAffineTransform)
/*     */   {
/* 115 */     Line2DTransform localLine2DTransform1 = new Line2DTransform(0.0F, 0.0F, this.xAxisLength, 0.0F, paramAffineTransform);
/* 116 */     paramGraphics2D.draw(localLine2DTransform1);
/* 117 */     Line2DTransform localLine2DTransform2 = new Line2DTransform(0.0F, 0.0F, 0.0F, this.yAxisLength, paramAffineTransform);
/* 118 */     paramGraphics2D.draw(localLine2DTransform2);
/*     */     
/*     */ 
/*     */ 
/* 122 */     for (int i = 1; i <= 20; i++) {
/* 123 */       Line2DTransform localLine2DTransform3 = new Line2DTransform(i * this.xTickDistance, -5.0F, i * this.xTickDistance, 5, paramAffineTransform);
/* 124 */       paramGraphics2D.draw(localLine2DTransform3);
/*     */     }
/*     */     
/*     */ 
/* 128 */     for (int j = 1; j <= 5; j++) {
/* 129 */       Line2DTransform localLine2DTransform4 = new Line2DTransform(-5.0F, j * this.yTickDistance, 5, j * this.yTickDistance, paramAffineTransform);
/* 130 */       paramGraphics2D.draw(localLine2DTransform4);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final Color pickColor(int paramInt)
/*     */   {
/* 138 */     if (paramInt < this.colors.length) {
/* 139 */       return this.colors[paramInt];
/*     */     }
/* 141 */     return this.colors[(paramInt % this.colors.length)];
/*     */   }
/*     */   
/*     */ 
/*     */   private final void paintTargets(Graphics2D paramGraphics2D, AffineTransform paramAffineTransform)
/*     */   {
/* 147 */     if (this.targets != null) {
/* 148 */       for (int i = 0; i < this.targets.length; i++) {
/* 149 */         paramGraphics2D.setColor(pickColor(i));
/* 150 */         this.targets[i].drawTarget(paramGraphics2D, this.maxBeats, paramAffineTransform);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final void paintActualValues(Graphics2D paramGraphics2D, AffineTransform paramAffineTransform)
/*     */   {
/* 157 */     if (this.beatCount > 0) {
/* 158 */       BasicStroke localBasicStroke1 = (BasicStroke)paramGraphics2D.getStroke();
/* 159 */       float[] arrayOfFloat = { 3 };
/* 160 */       BasicStroke localBasicStroke2 = new BasicStroke(localBasicStroke1.getLineWidth(), 0, localBasicStroke1.getLineJoin(), localBasicStroke1.getMiterLimit(), arrayOfFloat, 0.0F);
/*     */       
/* 162 */       paramGraphics2D.setStroke(localBasicStroke2);
/* 163 */       for (int i = 0; i < this.targets.length; i++) {
/* 164 */         paramGraphics2D.setColor(pickColor(i));
/*     */         
/* 166 */         for (int j = 1; j <= this.beatCount; j++)
/*     */         {
/* 168 */           Line2DTransform localLine2DTransform = new Line2DTransform(j - 1, ((float[])this.actualStoryValues.get(j - 1))[i], j, ((float[])this.actualStoryValues.get(j))[i], paramAffineTransform);
/*     */           
/* 170 */           paramGraphics2D.draw(localLine2DTransform);
/*     */         }
/*     */       }
/* 173 */       paramGraphics2D.setStroke(localBasicStroke1);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void paintCurrentBeatMarker(Graphics2D paramGraphics2D, AffineTransform paramAffineTransform)
/*     */   {
/* 179 */     Color localColor = paramGraphics2D.getColor();
/* 180 */     paramGraphics2D.setColor(Color.blue);
/*     */     
/* 182 */     Line2DTransform localLine2DTransform = new Line2DTransform(this.beatCount + 1, 0.0F, this.beatCount + 1, 100.0F, paramAffineTransform);
/* 183 */     paramGraphics2D.draw(localLine2DTransform);
/*     */     
/* 185 */     paramGraphics2D.setColor(localColor);
/*     */   }
/*     */   
/*     */   public void paintComponent(Graphics paramGraphics)
/*     */   {
/* 190 */     super.paintComponent(paramGraphics);
/* 191 */     Graphics2D localGraphics2D = (Graphics2D)paramGraphics;
/* 192 */     Dimension localDimension = getSize();
/*     */     
/* 194 */     computeAxesInfo(localDimension);
/*     */     
/*     */ 
/* 197 */     localGraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/* 198 */     localGraphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
/*     */     
/*     */ 
/* 201 */     AffineTransform localAffineTransform1 = new AffineTransform(1.0F, 0.0F, 0.0F, -1.0F, 30.0F, localDimension.height - 20);
/*     */     
/* 203 */     paintAxes(localGraphics2D, localDimension, localAffineTransform1);
/*     */     
/*     */ 
/* 206 */     AffineTransform localAffineTransform2 = new AffineTransform(localAffineTransform1);
/* 207 */     localAffineTransform2.scale(this.xTickDistance, this.yTickDistance);
/* 208 */     paintTargets(localGraphics2D, localAffineTransform2);
/* 209 */     paintActualValues(localGraphics2D, localAffineTransform2);
/* 210 */     paintCurrentBeatMarker(localGraphics2D, localAffineTransform2);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatMonitor$BeatGraphPanel.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */