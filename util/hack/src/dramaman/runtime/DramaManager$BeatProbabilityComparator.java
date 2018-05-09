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
/*    */ class DramaManager$BeatProbabilityComparator
/*    */   implements Comparator
/*    */ {
/*    */   final DramaManager this$0;
/*    */   
/*    */   public int compare(Object paramObject1, Object paramObject2)
/*    */   {
/* 35 */     Beat localBeat1 = (Beat)paramObject1;
/* 36 */     Beat localBeat2 = (Beat)paramObject2;
/*    */     
/*    */ 
/* 39 */     Float localFloat1 = new Float(localBeat1.getProbability());
/* 40 */     Float localFloat2 = new Float(localBeat2.getProbability());
/* 41 */     return localFloat2.compareTo(localFloat1);
/*    */   }
/*    */   
/*    */   DramaManager$BeatProbabilityComparator(DramaManager paramDramaManager) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\DramaManager$BeatProbabilityComparator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */