/*    */ package abl.runtime;
/*    */ 
/*    */ import abl.compiler.AblDebuggerConstants;
/*    */ import java.lang.reflect.Method;
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MentalStepDebug
/*    */   extends MentalStep
/*    */   implements DebuggableStep, AblDebuggerConstants
/*    */ {
/*    */   private final byte debugLevel;
/*    */   private final String uniqueStepName;
/*    */   
/*    */   public MentalStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, byte paramByte, String paramString2)
/*    */   {
/* 21 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport);
/*    */     
/*    */ 
/* 24 */     this.debugLevel = paramByte;
/* 25 */     this.uniqueStepName = paramString2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   final void execute()
/*    */   {
/* 32 */     if (this.debugLevel == 2) {
/* 33 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(9, this, null, getNestLevel());
/*    */     }
/* 35 */     MentalStepDebug.1 local1 = new MentalStepDebug.1(this);
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 43 */     local1.start();
/* 44 */     super.execute();
/* 45 */     local1.interrupt();
/*    */   }
/*    */   
/*    */   final void succeedStep()
/*    */   {
/* 50 */     if (this.debugLevel == 2)
/* 51 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(10, this, new Boolean(true), getNestLevel());
/* 52 */     super.succeedStep();
/*    */   }
/*    */   
/*    */   final void failStep()
/*    */   {
/* 57 */     if (this.debugLevel == 2)
/* 58 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(10, this, new Boolean(false), getNestLevel());
/* 59 */     super.failStep();
/*    */   }
/*    */   
/*    */   final boolean successTest()
/*    */   {
/* 64 */     boolean bool = super.successTest();
/* 65 */     if ((bool) && (this.debugLevel == 2)) {
/* 66 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(18, this, null, getNestLevel());
/*    */     }
/* 68 */     return bool;
/*    */   }
/*    */   
/*    */   public final MutableTreeNode getTree()
/*    */   {
/* 73 */     return new DefaultMutableTreeNode(this);
/*    */   }
/*    */   
/*    */ 
/*    */   public final int getNestLevel()
/*    */   {
/* 79 */     return ((DebuggableBehavior)this.parent).getNestLevel() + 1;
/*    */   }
/*    */   
/*    */   public final String toString()
/*    */   {
/* 84 */     return "mental " + this.uniqueStepName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\MentalStepDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */