/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FailStep
/*    */   extends Step
/*    */ {
/*    */   public FailStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, short paramShort1, short paramShort2, boolean paramBoolean4, String paramString, AblNamedPropertySupport paramAblNamedPropertySupport)
/*    */   {
/* 15 */     super(paramInt, paramBehavior, false, false, false, paramBoolean1, paramBoolean2, paramBoolean3, paramShort1, paramShort2, paramBoolean4, paramString, null, null, null, paramAblNamedPropertySupport, (short)4);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 21 */   void execute() { failStep(); }
/*    */   
/* 23 */   void resetStep() { BehavingEntity.getBehavingEntity().resetStep(this); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\FailStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */