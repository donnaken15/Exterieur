/*    */ package facade.beats;
/*    */ 
/*    */ import java.awt.geom.Point2D.Float;
/*    */ import java.util.Hashtable;
/*    */ import java.util.List;
/*    */ 
/*    */ public class StoryTargets
/*    */ {
/*    */   public static Hashtable getTargets()
/*    */   {
/* 11 */     java.util.Vector localVector = new java.util.Vector();
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 18 */     localVector.add(new Point2D.Float(6.0F, 1.0F));
/* 19 */     localVector.add(new Point2D.Float(7.0F, 2.0F));
/* 20 */     localVector.add(new Point2D.Float(8.0F, 2.0F));
/* 21 */     localVector.add(new Point2D.Float(9.0F, 3));
/*    */     
/*    */ 
/* 24 */     dramaman.runtime.StoryTarget localStoryTarget = new dramaman.runtime.StoryTarget("tension", "TensionStoryValueWME", 3, 3, 17, localVector);
/*    */     
/* 26 */     Hashtable localHashtable = new Hashtable();
/* 27 */     localHashtable.put("tension", localStoryTarget);
/* 28 */     return localHashtable;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\beats\StoryTargets.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */