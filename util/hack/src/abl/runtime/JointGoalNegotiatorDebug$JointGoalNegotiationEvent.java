/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class JointGoalNegotiatorDebug$JointGoalNegotiationEvent
/*    */ {
/*    */   String negotiation;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   JointGoalNegotiatorDebug.JointGoalNegotiationInfo info;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   int currentState;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   final JointGoalNegotiatorDebug this$0;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   JointGoalNegotiatorDebug$JointGoalNegotiationEvent(JointGoalNegotiatorDebug paramJointGoalNegotiatorDebug, String paramString, JointGoalNegotiatorDebug.JointGoalNegotiationInfo paramJointGoalNegotiationInfo, int paramInt)
/*    */   {
/* 37 */     this.negotiation = paramString;
/* 38 */     this.info = paramJointGoalNegotiationInfo;
/* 39 */     this.currentState = paramInt;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 44 */     if (this.info != null) {
/*    */       String str;
/* 46 */       if (this.info.behavingEntity != null) {
/* 47 */         str = this.info.behavingEntity.getBehavingEntityShortName();
/*    */       } else
/* 49 */         str = "self";
/* 50 */       return this.negotiation + " from: " + str + ", intention: " + JointGoalNegotiatorDebug.formatIntention(this.info.intention) + ", state: " + JointGoalNegotiatorDebug.formatState(this.currentState);
/*    */     }
/*    */     
/*    */ 
/* 54 */     return "state changed by " + this.negotiation + " to: " + JointGoalNegotiatorDebug.formatState(this.currentState);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalNegotiatorDebug$JointGoalNegotiationEvent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */