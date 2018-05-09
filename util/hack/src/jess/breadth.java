/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ class breadth
/*    */   implements Strategy, Serializable
/*    */ {
/*    */   public int compare(Activation paramActivation1, Activation paramActivation2)
/*    */   {
/* 33 */     int i = paramActivation1.getSalience();
/* 34 */     int j = paramActivation2.getSalience();
/*    */     
/* 36 */     if (i != j) {
/* 37 */       return j - i;
/*    */     }
/* 39 */     if ((paramActivation1.isInactive()) && (!paramActivation2.isInactive()))
/* 40 */       return -1;
/* 41 */     if ((!paramActivation1.isInactive()) && (paramActivation2.isInactive()))
/* 42 */       return 1;
/* 43 */     if ((paramActivation1.isInactive()) && (paramActivation2.isInactive())) {
/* 44 */       return 0;
/*    */     }
/* 46 */     Token localToken1 = paramActivation1.getToken();
/* 47 */     Token localToken2 = paramActivation2.getToken();
/*    */     
/* 49 */     if (localToken1.getTime() != localToken2.getTime()) {
/* 50 */       return localToken1.getTime() - localToken2.getTime();
/*    */     }
/* 52 */     return localToken1.getTotalTime() - localToken2.getTotalTime();
/*    */   }
/*    */   
/*    */   public String getName() {
/* 56 */     return "breadth";
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\breadth.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */