/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class MentalStep extends Step {
/*    */   private boolean valid;
/*    */   private static final boolean $noassert = Class.forName("[Labl.runtime.MentalStep;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   private final void jdMethod_this() {
/* 10 */     this.valid = true;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public MentalStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport)
/*    */   {
/* 19 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, (short)2);jdMethod_this();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   void resetStep()
/*    */   {
/* 27 */     if (this.valid) {
/* 28 */       BehavingEntity.getBehavingEntity().resetStep(this);
/*    */     }
/*    */   }
/*    */   
/*    */   void succeedStep() {
/* 33 */     if (this.valid) {
/* 34 */       super.succeedStep();
/*    */     }
/*    */   }
/*    */   
/*    */   void failStep() {
/* 39 */     if (this.valid)
/* 40 */       super.failStep();
/*    */   }
/*    */   
/*    */   void execute() {
/* 44 */     if ((!$noassert) && (!this.valid)) { throw new AssertionError();
/*    */     }
/* 46 */     Object[] arrayOfObject = { new Integer(this.stepID), this.parent.getBehaviorVariableFrame(), BehavingEntity.getBehavingEntity(), this };
/*    */     try
/*    */     {
/* 49 */       this.execute.invoke(null, arrayOfObject);
/*    */     }
/*    */     catch (java.lang.reflect.InvocationTargetException localInvocationTargetException) {
/* 52 */       throw new AblRuntimeError("InvocationTargetException executing mental step in behavior " + this.parent + ". Error " + localInvocationTargetException.getCause(), localInvocationTargetException.getCause());
/* 53 */     } catch (Exception localException) { throw new AblRuntimeError("Error executing mental step in behavior " + this.parent, localException); }
/* 54 */     succeedStep();
/*    */   }
/*    */   
/*    */   void delete()
/*    */   {
/* 59 */     this.valid = false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\MentalStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */