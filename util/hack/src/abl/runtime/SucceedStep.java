/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SucceedStep
/*    */   extends Step
/*    */ {
/*    */   public SucceedStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, short paramShort1, short paramShort2, boolean paramBoolean3, String paramString, AblNamedPropertySupport paramAblNamedPropertySupport)
/*    */   {
/* 15 */     super(paramInt, paramBehavior, false, false, false, false, paramBoolean1, paramBoolean2, paramShort1, paramShort2, paramBoolean3, paramString, null, null, null, paramAblNamedPropertySupport, (short)5);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 21 */   void execute() { succeedStep(); }
/*    */   
/* 23 */   void resetStep() { BehavingEntity.getBehavingEntity().resetStep(this); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SucceedStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */