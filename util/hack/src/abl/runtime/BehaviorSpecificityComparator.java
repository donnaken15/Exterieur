/*    */ package abl.runtime;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class BehaviorSpecificityComparator
/*    */   implements Comparator
/*    */ {
/*    */   public int compare(Object paramObject1, Object paramObject2)
/*    */   {
/* 17 */     Integer localInteger1 = new Integer(((SatisfiedBehavior)paramObject1).behDesc.specificity);
/* 18 */     Integer localInteger2 = new Integer(((SatisfiedBehavior)paramObject2).behDesc.specificity);
/* 19 */     return -localInteger1.compareTo(localInteger2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\BehaviorSpecificityComparator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */