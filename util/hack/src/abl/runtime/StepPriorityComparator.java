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
/*    */ class StepPriorityComparator
/*    */   implements Comparator
/*    */ {
/*    */   public int compare(Object paramObject1, Object paramObject2)
/*    */   {
/* 16 */     Integer localInteger1 = new Integer(((Step)paramObject1).getPriority());
/* 17 */     Integer localInteger2 = new Integer(((Step)paramObject2).getPriority());
/* 18 */     return localInteger2.compareTo(localInteger1);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\StepPriorityComparator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */