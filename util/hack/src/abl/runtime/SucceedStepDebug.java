/*    */ package abl.runtime;
/*    */ 
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SucceedStepDebug
/*    */   extends SucceedStep
/*    */   implements DebuggableStep
/*    */ {
/*    */   public SucceedStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, short paramShort1, short paramShort2, boolean paramBoolean3, String paramString, AblNamedPropertySupport paramAblNamedPropertySupport)
/*    */   {
/* 17 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramShort1, paramShort2, paramBoolean3, paramString, paramAblNamedPropertySupport);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   final void execute()
/*    */   {
/* 25 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(14, this, null, getNestLevel());
/* 26 */     super.execute();
/*    */   }
/*    */   
/*    */   final void succeedStep()
/*    */   {
/* 31 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(15, this, new Boolean(true), getNestLevel());
/* 32 */     super.succeedStep();
/*    */   }
/*    */   
/*    */   final void failStep()
/*    */   {
/* 37 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(15, this, new Boolean(false), getNestLevel());
/* 38 */     super.failStep();
/*    */   }
/*    */   
/*    */   final boolean successTest()
/*    */   {
/* 43 */     boolean bool = super.successTest();
/* 44 */     if (bool) {
/* 45 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(18, this, null, getNestLevel());
/*    */     }
/* 47 */     return bool;
/*    */   }
/*    */   
/*    */   public final MutableTreeNode getTree()
/*    */   {
/* 52 */     return new DefaultMutableTreeNode(this);
/*    */   }
/*    */   
/*    */ 
/*    */   public final int getNestLevel()
/*    */   {
/* 58 */     return ((DebuggableBehavior)this.parent).getNestLevel() + 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SucceedStepDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */