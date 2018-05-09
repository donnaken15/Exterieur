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
/*    */ class StepExpansionComparator
/*    */   implements Comparator
/*    */ {
/*    */   public int compare(Object paramObject1, Object paramObject2)
/*    */   {
/* 16 */     boolean bool1 = ((Step)paramObject1).currentLineOfExpansion(null);
/* 17 */     boolean bool2 = ((Step)paramObject2).currentLineOfExpansion(null);
/* 18 */     int i = 0;
/*    */     
/* 20 */     if ((bool1) && (!bool2)) { i = -1;
/* 21 */     } else if (bool1 == bool2) { i = 0;
/* 22 */     } else if ((!bool1) && (bool2)) i = 1;
/* 23 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\StepExpansionComparator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */