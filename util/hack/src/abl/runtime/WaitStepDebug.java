/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WaitStepDebug
/*    */   extends WaitStep
/*    */   implements DebuggableStep
/*    */ {
/*    */   public WaitStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport)
/*    */   {
/* 16 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   final void succeedStep()
/*    */   {
/* 27 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(11, this, new Boolean(true), getNestLevel());
/* 28 */     super.succeedStep();
/*    */   }
/*    */   
/*    */   final void failStep()
/*    */   {
/* 33 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(11, this, new Boolean(false), getNestLevel());
/* 34 */     super.failStep();
/*    */   }
/*    */   
/*    */   final boolean successTest()
/*    */   {
/* 39 */     boolean bool = super.successTest();
/* 40 */     if (bool) {
/* 41 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(18, this, null, getNestLevel());
/*    */     }
/* 43 */     return bool;
/*    */   }
/*    */   
/*    */   public final MutableTreeNode getTree()
/*    */   {
/* 48 */     return new DefaultMutableTreeNode(this);
/*    */   }
/*    */   
/*    */ 
/*    */   public final int getNestLevel()
/*    */   {
/* 54 */     return ((DebuggableBehavior)this.parent).getNestLevel() + 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\WaitStepDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */