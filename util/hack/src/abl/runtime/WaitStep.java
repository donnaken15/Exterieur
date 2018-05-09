/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WaitStep
/*    */   extends Step
/*    */ {
/*    */   public WaitStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport)
/*    */   {
/* 14 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, (short)3);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   void resetStep()
/*    */   {
/* 21 */     throw new RuntimeError("Attempt to reset a wait step.");
/*    */   }
/*    */   
/*    */   void execute()
/*    */   {
/* 26 */     throw new RuntimeError("Attempt to execute a wait step.");
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\WaitStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */