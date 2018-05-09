/*     */ package abl.runtime;
/*     */ 
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class JointGoalStep$1
/*     */   extends JointGoalNegotiationThread
/*     */ {
/*     */   final JointGoalStep this$0;
/*     */   
/*     */   JointGoalStep$1(JointGoalStep paramJointGoalStep, JointGoalNegotiator paramJointGoalNegotiator, String paramString, Behavior paramBehavior, Object[] paramArrayOfObject)
/*     */   {
/*  96 */     super(paramJointGoalNegotiator, paramString);
/*     */   }
/*     */   
/*     */   public final void run()
/*     */   {
/* 101 */     this.this$0.negotiator = this.this$0.getNewJointGoalNegotiator(this.val$beh.getTeamMembers(), true);
/* 102 */     Hashtable localHashtable = BehavingEntity.getBehavingEntity().negotiateEntry(this.this$0, this.val$args);
/* 103 */     if (localHashtable != null)
/*     */     {
/*     */ 
/* 106 */       this.this$0.addChild(this.val$beh);
/* 107 */       this.this$0.executeBookkeeping();
/*     */     }
/*     */     else
/*     */     {
/* 111 */       this.this$0.addFailedBehavior(this.val$beh);
/* 112 */       this.this$0.negotiator = null;
/*     */     }
/* 114 */     this.this$0.setIsNegotiating(false);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalStep$1.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */