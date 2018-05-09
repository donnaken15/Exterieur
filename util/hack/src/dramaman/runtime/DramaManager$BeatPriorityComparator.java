/*    */ package dramaman.runtime;
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
/*    */ class DramaManager$BeatPriorityComparator
/*    */   implements Comparator
/*    */ {
/*    */   final DramaManager this$0;
/*    */   
/*    */   public int compare(Object paramObject1, Object paramObject2)
/*    */   {
/* 49 */     Beat localBeat1 = (Beat)paramObject1;
/* 50 */     Beat localBeat2 = (Beat)paramObject2;
/*    */     
/*    */ 
/* 53 */     Integer localInteger1 = new Integer(localBeat1.getPriority());
/* 54 */     Integer localInteger2 = new Integer(localBeat2.getPriority());
/* 55 */     return localInteger2.compareTo(localInteger1);
/*    */   }
/*    */   
/*    */   DramaManager$BeatPriorityComparator(DramaManager paramDramaManager) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\DramaManager$BeatPriorityComparator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */