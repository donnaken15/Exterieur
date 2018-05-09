/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ public class PrimitiveStepWME
/*    */   extends ExecutableStepWME
/*    */ {
/*  7 */   public PrimitiveStepWME(PrimitiveStep paramPrimitiveStep, BehaviorWME paramBehaviorWME) { super(paramPrimitiveStep, paramBehaviorWME); }
/*    */   
/*  9 */   public synchronized int getCompletionStatus() { return ((PrimitiveStep)this.s).getCompletionStatus(); }
/* 10 */   public synchronized String getName() { return ((PrimitiveStep)this.s).getName(); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\PrimitiveStepWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */