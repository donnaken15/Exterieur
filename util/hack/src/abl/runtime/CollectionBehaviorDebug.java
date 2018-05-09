/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class CollectionBehaviorDebug
/*    */   extends CollectionBehavior
/*    */   implements DebuggableBehavior
/*    */ {
/*    */   private final BehaviorDebugSupport debugSupport;
/*    */   private final __BehaviorDesc behaviorDesc;
/*    */   
/*    */   public CollectionBehaviorDebug(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt1, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, int paramInt2, __BehaviorDesc param__BehaviorDesc)
/*    */   {
/* 19 */     super(paramGoalStep, paramMethod1, paramMethod2, paramBoolean, paramString, paramShort, paramInt1, paramArrayOfObject, paramArrayOf__StepDesc, paramInt2);
/*    */     
/* 21 */     if (this.parent != null) {
/* 22 */       this.debugSupport = new BehaviorDebugSupport(this, ((DebuggableStep)this.parent).getNestLevel());
/*    */     } else
/* 24 */       this.debugSupport = new BehaviorDebugSupport(this, 0);
/* 25 */     this.behaviorDesc = param__BehaviorDesc;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public CollectionBehaviorDebug(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, boolean paramBoolean, String paramString, short paramShort, int paramInt1, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, int paramInt2, BehavingEntity[] paramArrayOfBehavingEntity, __BehaviorDesc param__BehaviorDesc)
/*    */   {
/* 34 */     super(paramGoalStep, paramMethod1, paramMethod2, paramBoolean, paramString, paramShort, paramInt1, paramArrayOfObject, paramArrayOf__StepDesc, paramInt2, paramArrayOfBehavingEntity);
/*    */     
/*    */ 
/* 37 */     if (this.parent != null) {
/* 38 */       this.debugSupport = new BehaviorDebugSupport(this, ((DebuggableStep)this.parent).getNestLevel());
/*    */     } else
/* 40 */       this.debugSupport = new BehaviorDebugSupport(this, 0);
/* 41 */     this.behaviorDesc = param__BehaviorDesc;
/*    */   }
/*    */   
/*    */   final boolean contextCondition()
/*    */   {
/* 46 */     boolean bool = super.contextCondition();
/* 47 */     if (!bool) {
/* 48 */       this.debugSupport.traceAblExecutionEvent(4, this.behaviorDesc, null);
/*    */     }
/* 50 */     return bool;
/*    */   }
/*    */   
/*    */   final void succeedBehavior()
/*    */   {
/* 55 */     this.debugSupport.traceAblExecutionEvent(3, this.behaviorDesc, new Boolean(true));
/* 56 */     super.succeedBehavior();
/*    */   }
/*    */   
/*    */   final void failBehavior()
/*    */   {
/* 61 */     this.debugSupport.traceAblExecutionEvent(3, this.behaviorDesc, new Boolean(false));
/* 62 */     super.failBehavior();
/*    */   }
/*    */   
/*    */   final void addChildren()
/*    */   {
/* 67 */     this.debugSupport.traceAblExecutionEvent(2, this.behaviorDesc, this.parent);
/* 68 */     super.addChildren();
/*    */   }
/*    */   
/*    */ 
/* 72 */   public final int getNestLevel() { return this.debugSupport.getNestLevel(); }
/* 73 */   public final MutableTreeNode getTree() { return this.debugSupport.getTree(); }
/*    */   
/*    */   public final void traceAblExecutionEvent(int paramInt1, Step paramStep, Object paramObject, int paramInt2) {
/* 76 */     this.debugSupport.traceAblExecutionEvent(paramInt1, paramStep, paramObject, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\CollectionBehaviorDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */