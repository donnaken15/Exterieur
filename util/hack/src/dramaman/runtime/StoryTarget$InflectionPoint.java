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
/*    */ class StoryTarget$InflectionPoint
/*    */   extends Point2D.Float
/*    */   implements Comparable
/*    */ {
/*    */   final StoryTarget this$0;
/*    */   
/*    */   StoryTarget$InflectionPoint(StoryTarget paramStoryTarget, float paramFloat1, float paramFloat2)
/*    */   {
/* 28 */     super(paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   public int compareTo(Object paramObject)
/*    */   {
/* 33 */     InflectionPoint localInflectionPoint = (InflectionPoint)paramObject;
/* 34 */     if (this.x < localInflectionPoint.x)
/* 35 */       return -1;
/* 36 */     if (this.x == localInflectionPoint.x) {
/* 37 */       return 0;
/*    */     }
/* 39 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryTarget$InflectionPoint.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */