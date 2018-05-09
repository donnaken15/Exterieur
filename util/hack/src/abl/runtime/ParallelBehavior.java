/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ParallelBehavior
/*    */   extends MultiStepBehavior
/*    */ {
/* 10 */   protected static short behaviorType = 1;
/*    */   
/*    */ 
/*    */ 
/*    */   public ParallelBehavior(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt1, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, int paramInt2)
/*    */   {
/* 16 */     super(paramGoalStep, paramMethod1, paramMethod2, paramBoolean, paramString, paramShort, paramInt1, paramArrayOfObject, paramArrayOf__StepDesc, paramInt2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public ParallelBehavior(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt1, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, int paramInt2, BehavingEntity[] paramArrayOfBehavingEntity)
/*    */   {
/* 25 */     super(paramGoalStep, paramMethod1, paramMethod2, paramBoolean, paramString, paramShort, paramInt1, paramArrayOfObject, paramArrayOf__StepDesc, paramInt2, paramArrayOfBehavingEntity);
/*    */   }
/*    */   
/*    */ 
/*    */   final short getBehaviorType()
/*    */   {
/* 31 */     return behaviorType;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\ParallelBehavior.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */