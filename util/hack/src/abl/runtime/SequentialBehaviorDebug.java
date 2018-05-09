/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class SequentialBehaviorDebug
/*    */   extends SequentialBehavior
/*    */   implements DebuggableBehavior
/*    */ {
/*    */   private final BehaviorDebugSupport debugSupport;
/*    */   private final __BehaviorDesc behaviorDesc;
/*    */   
/*    */   public SequentialBehaviorDebug(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, __BehaviorDesc param__BehaviorDesc)
/*    */   {
/* 21 */     super(paramGoalStep, paramMethod1, paramMethod2, paramBoolean, paramString, paramShort, paramInt, paramArrayOfObject, paramArrayOf__StepDesc);
/*    */     
/* 23 */     this.debugSupport = new BehaviorDebugSupport(this, ((DebuggableStep)this.parent).getNestLevel());
/* 24 */     this.behaviorDesc = param__BehaviorDesc;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public SequentialBehaviorDebug(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, BehavingEntity[] paramArrayOfBehavingEntity, __BehaviorDesc param__BehaviorDesc)
/*    */   {
/* 33 */     super(paramGoalStep, paramMethod1, paramMethod2, paramBoolean, paramString, paramShort, paramInt, paramArrayOfObject, paramArrayOf__StepDesc, paramArrayOfBehavingEntity);
/*    */     
/* 35 */     this.debugSupport = new BehaviorDebugSupport(this, ((DebuggableStep)this.parent).getNestLevel());
/* 36 */     this.behaviorDesc = param__BehaviorDesc;
/*    */   }
/*    */   
/*    */   final boolean contextCondition()
/*    */   {
/* 41 */     boolean bool = super.contextCondition();
/* 42 */     if (!bool) {
/* 43 */       this.debugSupport.traceAblExecutionEvent(4, this.behaviorDesc, null);
/*    */     }
/* 45 */     return bool;
/*    */   }
/*    */   
/*    */   final void succeedBehavior()
/*    */   {
/* 50 */     this.debugSupport.traceAblExecutionEvent(3, this.behaviorDesc, new Boolean(true));
/* 51 */     super.succeedBehavior();
/*    */   }
/*    */   
/*    */   final void failBehavior()
/*    */   {
/* 56 */     this.debugSupport.traceAblExecutionEvent(3, this.behaviorDesc, new Boolean(false));
/* 57 */     super.failBehavior();
/*    */   }
/*    */   
/*    */   final void addChildren()
/*    */   {
/* 62 */     this.debugSupport.traceAblExecutionEvent(2, this.behaviorDesc, this.parent);
/* 63 */     super.addChildren();
/*    */   }
/*    */   
/*    */ 
/* 67 */   public final int getNestLevel() { return this.debugSupport.getNestLevel(); }
/* 68 */   public final MutableTreeNode getTree() { return this.debugSupport.getTree(); }
/*    */   
/*    */   public final void traceAblExecutionEvent(int paramInt1, Step paramStep, Object paramObject, int paramInt2) {
/* 71 */     this.debugSupport.traceAblExecutionEvent(paramInt1, paramStep, paramObject, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SequentialBehaviorDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */