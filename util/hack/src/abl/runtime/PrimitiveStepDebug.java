/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PrimitiveStepDebug
/*    */   extends PrimitiveStep
/*    */   implements DebuggableStep
/*    */ {
/*    */   public PrimitiveStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, PrimitiveAction paramPrimitiveAction, String[] paramArrayOfString, String paramString2)
/*    */   {
/* 21 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramPrimitiveAction, paramArrayOfString, paramString2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   final void execute()
/*    */   {
/* 31 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(5, this, null, getNestLevel());
/* 32 */     super.execute();
/*    */   }
/*    */   
/*    */   final void succeedStep()
/*    */   {
/* 37 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(6, this, new Boolean(true), getNestLevel());
/* 38 */     super.succeedStep();
/*    */   }
/*    */   
/*    */   final void failStep()
/*    */   {
/* 43 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(6, this, new Boolean(false), getNestLevel());
/* 44 */     super.failStep();
/*    */   }
/*    */   
/*    */   final boolean successTest()
/*    */   {
/* 49 */     boolean bool = super.successTest();
/* 50 */     if (bool) {
/* 51 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(18, this, null, getNestLevel());
/*    */     }
/* 53 */     return bool;
/*    */   }
/*    */   
/*    */   public final MutableTreeNode getTree()
/*    */   {
/* 58 */     return new DefaultMutableTreeNode(this);
/*    */   }
/*    */   
/*    */ 
/*    */   public final int getNestLevel()
/*    */   {
/* 64 */     return ((DebuggableBehavior)this.parent).getNestLevel() + 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\PrimitiveStepDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */