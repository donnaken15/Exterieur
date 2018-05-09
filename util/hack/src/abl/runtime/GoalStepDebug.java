/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GoalStepDebug
/*    */   extends GoalStep
/*    */   implements DebuggableStep
/*    */ {
/*    */   public GoalStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString)
/*    */   {
/* 15 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramString2, paramArrayOfString);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public GoalStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString, short paramShort3)
/*    */   {
/* 29 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramString2, paramArrayOfString, paramShort3);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   final void execute()
/*    */   {
/* 39 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(7, this, null, getNestLevel());
/* 40 */     super.execute();
/*    */   }
/*    */   
/*    */   final void succeedStep()
/*    */   {
/* 45 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(8, this, new Boolean(true), getNestLevel());
/* 46 */     super.succeedStep();
/*    */   }
/*    */   
/*    */   final void failStep()
/*    */   {
/* 51 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(8, this, new Boolean(false), getNestLevel());
/* 52 */     super.failStep();
/*    */   }
/*    */   
/*    */   final boolean successTest()
/*    */   {
/* 57 */     boolean bool = super.successTest();
/* 58 */     if (bool) {
/* 59 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(18, this, null, getNestLevel());
/*    */     }
/* 61 */     return bool;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public final MutableTreeNode getTree()
/*    */   {
/* 69 */     DefaultMutableTreeNode localDefaultMutableTreeNode = new DefaultMutableTreeNode(this);
/* 70 */     if (this.child != null)
/*    */     {
/*    */ 
/* 73 */       localDefaultMutableTreeNode.add(((DebuggableBehavior)this.child).getTree());
/*    */     }
/* 75 */     return localDefaultMutableTreeNode;
/*    */   }
/*    */   
/*    */ 
/*    */   public final int getNestLevel()
/*    */   {
/* 81 */     return ((DebuggableBehavior)this.parent).getNestLevel() + 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\GoalStepDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */