/*     */ package dramaman.runtime;
/*     */ 
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Point2D.Float;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ public class StoryTarget
/*     */ {
/*     */   public static final int LINEAR = 0;
/*     */   public static final int DIP = 1;
/*     */   public static final int BUMP = 2;
/*     */   private String valueName;
/*     */   private String valueWMEName;
/*     */   private float targetMin;
/*     */   private float targetMax;
/*     */   private float initialValue;
/*     */   private int arcType;
/*     */   private int averageBeatLength;
/*     */   private InflectionPoint[] inflectionPoints;
/*     */   private static final boolean $noassert = Class.forName("[Ldramaman.runtime.StoryTarget;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   class InflectionPoint extends Point2D.Float implements Comparable
/*     */   {
/*     */     InflectionPoint(float paramFloat1, float paramFloat2)
/*     */     {
/*  28 */       super(paramFloat2);
/*     */     }
/*     */     
/*     */     public int compareTo(Object paramObject)
/*     */     {
/*  33 */       InflectionPoint localInflectionPoint = (InflectionPoint)paramObject;
/*  34 */       if (this.x < localInflectionPoint.x)
/*  35 */         return -1;
/*  36 */       if (this.x == localInflectionPoint.x) {
/*  37 */         return 0;
/*     */       }
/*  39 */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   class SegmentEndpoints
/*     */   {
/*     */     Point2D.Float beginPoint;
/*     */     Point2D.Float endPoint;
/*     */     
/*     */     SegmentEndpoints(Point2D.Float paramFloat1, Point2D.Float paramFloat2) {
/*  49 */       this.beginPoint = paramFloat1;
/*  50 */       this.endPoint = paramFloat2;
/*     */     }
/*     */     
/*     */     public String toString()
/*     */     {
/*  55 */       return "SegmentEndpoints: (" + this.beginPoint.x + ", " + this.beginPoint.y + ")(" + this.endPoint.x + ", " + this.endPoint.y + ')';
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public StoryTarget(String paramString1, String paramString2, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
/*     */   {
/*  64 */     this.valueName = paramString1;
/*  65 */     this.valueWMEName = paramString2;
/*  66 */     this.targetMin = paramFloat1;
/*  67 */     this.targetMax = paramFloat2;
/*  68 */     this.initialValue = StoryMemory.getStoryMemory().getStoryValue(paramString2);
/*  69 */     this.averageBeatLength = paramInt1;
/*  70 */     if ((paramInt2 != 0) && (paramInt2 != 1) && (paramInt2 != 2))
/*  71 */       throw new DramaManagerError("Illegal arc type " + paramInt2 + " in StoryTarget constructor.");
/*  72 */     switch (paramInt2) {
/*     */     case 0: 
/*  74 */       this.inflectionPoints = new InflectionPoint[0];
/*  75 */       break;
/*     */     case 1: 
/*  77 */       float f1 = Math.min(this.targetMin, this.initialValue);
/*  78 */       float f2 = Math.max(f1 - 10.0F, 0.0F);
/*  79 */       this.inflectionPoints = new InflectionPoint[1];
/*  80 */       this.inflectionPoints[0] = new InflectionPoint(this.averageBeatLength / 2, f2);
/*  81 */       break;
/*     */     case 2: 
/*  83 */       float f3 = Math.max(this.targetMax, this.initialValue);
/*  84 */       float f4 = Math.min(f3 + 10.0F, 100.0F);
/*  85 */       this.inflectionPoints = new InflectionPoint[1];
/*  86 */       this.inflectionPoints[0] = new InflectionPoint(this.averageBeatLength / 2, f4);
/*     */     }
/*     */     
/*  89 */     this.arcType = paramInt2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public StoryTarget(String paramString1, String paramString2, float paramFloat1, float paramFloat2, int paramInt, List paramList)
/*     */   {
/* 100 */     this.valueName = paramString1;
/* 101 */     this.valueWMEName = paramString2;
/* 102 */     this.targetMin = paramFloat1;
/* 103 */     this.targetMax = paramFloat2;
/* 104 */     this.initialValue = StoryMemory.getStoryMemory().getStoryValue(paramString2);
/* 105 */     this.averageBeatLength = paramInt;
/* 106 */     this.arcType = -1;
/* 107 */     this.inflectionPoints = new InflectionPoint[paramList.size()];
/* 108 */     Iterator localIterator = paramList.iterator();
/* 109 */     int i = 0;
/* 110 */     while (localIterator.hasNext()) {
/* 111 */       Object localObject = localIterator.next();
/* 112 */       if (!localObject.getClass().getName().equals("java.awt.geom.Point2D$Float")) {
/* 113 */         throw new DramaManagerError("Illegal object " + localObject.getClass() + " passed as an arc inflection point to StoryTarget constructor");
/*     */       }
/*     */       
/* 116 */       this.inflectionPoints[i] = new InflectionPoint(((Point2D.Float)localObject).x, ((Point2D.Float)localObject).y);
/* 117 */       i++;
/*     */     }
/* 119 */     java.util.Arrays.sort(this.inflectionPoints);
/*     */   }
/*     */   
/* 122 */   public String getValueName() { return this.valueName; }
/* 123 */   public String getValueWMEName() { return this.valueWMEName; }
/* 124 */   public float getInitialValue() { return this.initialValue; }
/* 125 */   public float getTargetMin() { return this.targetMin; }
/* 126 */   public float getTargetMax() { return this.targetMax; }
/*     */   
/*     */   private final SegmentEndpoints getSegmentEndpoints(int paramInt)
/*     */   {
/* 130 */     if (this.inflectionPoints.length == 0)
/*     */     {
/*     */ 
/* 133 */       return new SegmentEndpoints(new Point2D.Float(0.0F, this.initialValue), new Point2D.Float(this.averageBeatLength, this.targetMin + (this.targetMax - this.targetMin) / 2.0F));
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */     int i = java.util.Arrays.binarySearch(this.inflectionPoints, new InflectionPoint(paramInt, 0.0F));
/* 143 */     if ((i == -1) || (i == 0))
/*     */     {
/*     */ 
/* 146 */       return new SegmentEndpoints(new Point2D.Float(0.0F, this.initialValue), this.inflectionPoints[0]);
/*     */     }
/* 148 */     if (i == -this.inflectionPoints.length - 1)
/*     */     {
/*     */ 
/* 151 */       return new SegmentEndpoints(this.inflectionPoints[(this.inflectionPoints.length - 1)], new Point2D.Float(this.averageBeatLength, this.targetMin + (this.targetMax - this.targetMin) / 2.0F));
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 157 */     if (i < 0)
/* 158 */       i = Math.abs(i + 1);
/* 159 */     return new SegmentEndpoints(this.inflectionPoints[(i - 1)], this.inflectionPoints[i]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float getDesiredValue(int paramInt)
/*     */   {
/* 167 */     SegmentEndpoints localSegmentEndpoints = getSegmentEndpoints(paramInt);
/*     */     
/* 169 */     if ((!$noassert) && (localSegmentEndpoints.endPoint.x <= localSegmentEndpoints.beginPoint.x)) throw new AssertionError("Endpoint < beginpoint " + localSegmentEndpoints);
/* 170 */     float f1 = (localSegmentEndpoints.endPoint.y - localSegmentEndpoints.beginPoint.y) / (localSegmentEndpoints.endPoint.x - localSegmentEndpoints.beginPoint.x);
/* 171 */     float f2 = localSegmentEndpoints.beginPoint.y - f1 * localSegmentEndpoints.beginPoint.x;
/*     */     
/* 173 */     return f1 * paramInt + f2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float getDesiredSlope(int paramInt, float paramFloat)
/*     */   {
/* 181 */     SegmentEndpoints localSegmentEndpoints = getSegmentEndpoints(paramInt);
/* 182 */     if ((!$noassert) && (localSegmentEndpoints.endPoint.x <= localSegmentEndpoints.beginPoint.x)) { throw new AssertionError();
/*     */     }
/* 184 */     return (localSegmentEndpoints.endPoint.y - paramFloat) / (localSegmentEndpoints.endPoint.x - paramInt + 1.0F);
/*     */   }
/*     */   
/*     */ 
/*     */   public float getSquaredError(int paramInt1, int paramInt2)
/*     */   {
/* 190 */     float f = getDesiredValue(paramInt1) - paramInt2;
/* 191 */     return f * f;
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
/*     */   public void drawTarget(Graphics2D paramGraphics2D, int paramInt, AffineTransform paramAffineTransform)
/*     */   {
/* 204 */     float f1 = getDesiredValue(0);
/*     */     
/* 206 */     for (int i = 1; i <= paramInt; i++) {
/* 207 */       float f2 = getDesiredValue(i);
/* 208 */       paramGraphics2D.draw(new Line2DTransform(i - 1.0F, f1, i, f2, paramAffineTransform));
/* 209 */       f1 = f2;
/*     */     }
/* 211 */     Point2D.Float localFloat1 = new Point2D.Float(paramInt, getDesiredValue(paramInt));
/* 212 */     Point2D.Float localFloat2 = (Point2D.Float)paramAffineTransform.transform(localFloat1, null);
/* 213 */     paramGraphics2D.drawString(this.valueName, localFloat2.x, localFloat2.y);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryTarget.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */