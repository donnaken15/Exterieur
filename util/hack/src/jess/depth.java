/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class depth
/*    */   implements Strategy, Serializable
/*    */ {
/*    */   public int compare(Activation paramActivation1, Activation paramActivation2)
/*    */   {
/* 14 */     int i = paramActivation1.getSalience();
/* 15 */     int j = paramActivation2.getSalience();
/*    */     
/* 17 */     if (i != j) {
/* 18 */       return j - i;
/*    */     }
/* 20 */     if ((paramActivation1.isInactive()) && (!paramActivation2.isInactive()))
/* 21 */       return -1;
/* 22 */     if ((!paramActivation1.isInactive()) && (paramActivation2.isInactive()))
/* 23 */       return 1;
/* 24 */     if ((paramActivation1.isInactive()) && (paramActivation2.isInactive())) {
/* 25 */       return 0;
/*    */     }
/* 27 */     Token localToken1 = paramActivation1.getToken();
/* 28 */     Token localToken2 = paramActivation2.getToken();
/*    */     
/* 30 */     if (localToken1.getTime() != localToken2.getTime()) {
/* 31 */       return localToken2.getTime() - localToken1.getTime();
/*    */     }
/* 33 */     return localToken2.getTotalTime() - localToken1.getTotalTime();
/*    */   }
/*    */   
/*    */   public String getName() {
/* 37 */     return "depth";
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\depth.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */