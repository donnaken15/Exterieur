/*   */ package dramaman.runtime;
/*   */ 
/*   */ import java.awt.geom.Point2D.Float;
/*   */ 
/*   */ public class Line2DTransform extends java.awt.geom.Line2D.Float
/*   */ {
/*   */   public Line2DTransform(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, java.awt.geom.AffineTransform paramAffineTransform)
/*   */   {
/* 9 */     super(((Point2D.Float)paramAffineTransform.transform(new Point2D.Float(paramFloat1, paramFloat2), null)).x, ((Point2D.Float)paramAffineTransform.transform(new Point2D.Float(paramFloat1, paramFloat2), null)).y, ((Point2D.Float)paramAffineTransform.transform(new Point2D.Float(paramFloat3, paramFloat4), null)).x, ((Point2D.Float)paramAffineTransform.transform(new Point2D.Float(paramFloat3, paramFloat4), null)).y);
/*   */   }
/*   */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\Line2DTransform.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */