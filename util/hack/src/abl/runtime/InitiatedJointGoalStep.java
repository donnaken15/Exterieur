/*    */ package abl.runtime;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
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
/*    */ public class InitiatedJointGoalStep
/*    */   extends JointGoalStep
/*    */ {
/*    */   private static final int INITIATED_JOINT_GOAL_STEP_ID = -4;
/*    */   private static final short defaultPriority = 0;
/*    */   private static final short defaultPriorityModifier = 0;
/*    */   private final Set teamMembers;
/*    */   private final Object[] args;
/*    */   
/*    */   public InitiatedJointGoalStep(Behavior paramBehavior, String paramString, Set paramSet, Object[] paramArrayOfObject, boolean paramBoolean)
/*    */   {
/* 26 */     super(-4, paramBehavior, false, false, false, false, false, false, (short)0, (short)0, false, null, null, null, null, null, paramString, null, paramBoolean);
/*    */     
/* 28 */     this.teamMembers = new HashSet(paramSet);
/* 29 */     this.args = paramArrayOfObject;
/* 30 */     this.negotiator = new JointGoalNegotiator(this.teamMembers, this);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   void execute()
/*    */   {
/* 39 */     Behavior localBehavior = BehavingEntity.getBehavingEntity().chooseJointBehavior(this.args, this.failedBehaviors, this, this.teamMembers);
/*    */     
/* 41 */     if (localBehavior != null) {
/* 42 */       addChild(localBehavior);
/* 43 */       executeBookkeeping();
/*    */     }
/*    */     else
/*    */     {
/* 47 */       failStep();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\InitiatedJointGoalStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */