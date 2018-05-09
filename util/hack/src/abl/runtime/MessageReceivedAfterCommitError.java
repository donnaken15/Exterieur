/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ public class MessageReceivedAfterCommitError
/*    */   extends JointGoalNegotiationError
/*    */ {
/*    */   protected static String messageName(int paramInt)
/*    */   {
/*  9 */     switch (paramInt) {
/*    */     case 19: 
/* 11 */       return "SUCCEED";
/*    */     case 20: 
/* 13 */       return "FAIL";
/*    */     case 21: 
/* 15 */       return "REMOVE";
/*    */     case 22: 
/* 17 */       return "SUSPEND";
/*    */     case 23: 
/* 19 */       return "UNSUSPEND";
/*    */     }
/* 21 */     return "UNKNOWN MESSAGE";
/*    */   }
/*    */   
/*    */ 
/*    */   public MessageReceivedAfterCommitError(int paramInt1, int paramInt2)
/*    */   {
/* 27 */     super("Received message " + messageName(paramInt1) + " in commit state " + stateName(paramInt2));
/*    */   }
/*    */   
/*    */   public MessageReceivedAfterCommitError(int paramInt1, int paramInt2, JointGoalStep paramJointGoalStep)
/*    */   {
/* 32 */     super("Received message " + messageName(paramInt1) + " in commit state " + stateName(paramInt2) + " in goal " + paramJointGoalStep);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\MessageReceivedAfterCommitError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */