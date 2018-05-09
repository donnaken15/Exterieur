/*    */ package dramaman.runtime;
/*    */ 
/*    */ import java.awt.geom.Point2D.Float;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class StoryTarget$SegmentEndpoints
/*    */ {
/*    */   Point2D.Float beginPoint;
/*    */   Point2D.Float endPoint;
/*    */   final StoryTarget this$0;
/*    */   
/*    */   StoryTarget$SegmentEndpoints(StoryTarget paramStoryTarget, Point2D.Float paramFloat1, Point2D.Float paramFloat2)
/*    */   {
/* 49 */     this.beginPoint = paramFloat1;
/* 50 */     this.endPoint = paramFloat2;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 55 */     return "SegmentEndpoints: (" + this.beginPoint.x + ", " + this.beginPoint.y + ")(" + this.endPoint.x + ", " + this.endPoint.y + ')';
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryTarget$SegmentEndpoints.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */