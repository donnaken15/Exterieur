/*    */ package abl.runtime;
/*    */ 
/*    */ public class JointGoalNegotiationError extends AblRuntimeError
/*    */ {
/*    */   public JointGoalNegotiationError(String paramString) {
/*  6 */     super(paramString);
/*    */   }
/*    */   
/*    */   protected static String stateName(int paramInt) {
/* 10 */     switch (paramInt) {
/*    */     case -1: 
/* 12 */       return "START";
/*    */     case 0: 
/* 14 */       return "INTENTION_TO_ENTER";
/*    */     case 1: 
/* 16 */       return "INTENTION_TO_REFUSE_ENTRY";
/*    */     case 2: 
/* 18 */       return "COMMIT_TO_ENTER";
/*    */     case 3: 
/* 20 */       return "COMMIT_TO_REFUSE_ENTRY";
/*    */     case 4: 
/* 22 */       return "RUNNING";
/*    */     case 5: 
/* 24 */       return "INTENTION_TO_SUCCEED";
/*    */     case 6: 
/* 26 */       return "WAIT_FOR_SUCCESS";
/*    */     case 7: 
/* 28 */       return "COMMIT_TO_SUCCEED";
/*    */     case 8: 
/* 30 */       return "INTENTION_TO_FAIL";
/*    */     case 9: 
/* 32 */       return "COMMIT_TO_FAIL";
/*    */     case 10: 
/* 34 */       return "INTENTION_TO_SUSPEND";
/*    */     case 11: 
/* 36 */       return "COMMIT_TO_SUSPEND";
/*    */     case 12: 
/* 38 */       return "SUSPENDED";
/*    */     case 13: 
/* 40 */       return "INTENTION_TO_UNSUSPEND";
/*    */     case 14: 
/* 42 */       return "COMMIT_TO_UNSUSPEND";
/*    */     case 15: 
/* 44 */       return "INTENTION_TO_REMOVE";
/*    */     case 16: 
/* 46 */       return "COMMIT_TO_REMOVE";
/*    */     }
/* 48 */     return "UNKNOWN_STATE";
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalNegotiationError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */