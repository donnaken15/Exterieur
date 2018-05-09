/*    */ package jess;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ 
/*    */ class PatternIterator
/*    */   implements Iterator
/*    */ {
/*    */   private int m_index;
/*    */   private Pattern[] m_patterns;
/*    */   
/*    */   PatternIterator(LHSComponent paramLHSComponent)
/*    */   {
/* 15 */     ArrayList localArrayList = new ArrayList();
/* 16 */     storePatternsInList(paramLHSComponent, localArrayList);
/* 17 */     this.m_patterns = ((Pattern[])localArrayList.toArray(new Pattern[localArrayList.size()]));
/*    */   }
/*    */   
/*    */   private final void storePatternsInList(LHSComponent paramLHSComponent, ArrayList paramArrayList)
/*    */   {
/* 22 */     for (int i = 0; i < paramLHSComponent.getGroupSize(); i++) {
/* 23 */       LHSComponent localLHSComponent = paramLHSComponent.getLHSComponent(i);
/* 24 */       if ((localLHSComponent instanceof Pattern)) {
/* 25 */         paramArrayList.add(localLHSComponent);
/*    */       } else
/* 27 */         storePatternsInList(localLHSComponent, paramArrayList);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/* 32 */     if (this.m_index < this.m_patterns.length) 0; return true;
/*    */   }
/*    */   
/*    */   public Object next() {
/* 36 */     return this.m_patterns[(this.m_index++)];
/*    */   }
/*    */   
/*    */   public void remove() {
/* 40 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\PatternIterator.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */