/*    */ package abl.runtime;
/*    */ 
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class BehaviorDebugSupport
/*    */ {
/*    */   private final int nestLevel;
/*    */   private final Behavior debuggedBehavior;
/*    */   private final BehavingEntity entity;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 17 */     this.entity = BehavingEntity.getBehavingEntity();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   BehaviorDebugSupport(Behavior paramBehavior, int paramInt)
/*    */   {
/* 26 */     jdMethod_this();
/* 27 */     this.debuggedBehavior = paramBehavior;
/* 28 */     this.nestLevel = paramInt;
/*    */   }
/*    */   
/* 31 */   int getNestLevel() { return this.nestLevel; }
/*    */   
/*    */   MutableTreeNode getTree()
/*    */   {
/* 35 */     int i = this.debuggedBehavior.getBehaviorType();
/* 36 */     DefaultMutableTreeNode localDefaultMutableTreeNode = new DefaultMutableTreeNode(this.debuggedBehavior);
/*    */     
/* 38 */     switch (i) {
/*    */     case 1: 
/*    */     case 2: 
/* 41 */       Step[] arrayOfStep = ((MultiStepBehavior)this.debuggedBehavior).getChildren();
/* 42 */       for (int j = 0; j < arrayOfStep.length; j++)
/* 43 */         localDefaultMutableTreeNode.add(((DebuggableStep)arrayOfStep[j]).getTree());
/* 44 */       return localDefaultMutableTreeNode;
/*    */     case 0: 
/* 46 */       Step localStep = ((SequentialBehavior)this.debuggedBehavior).getChild();
/* 47 */       localDefaultMutableTreeNode.add(((DebuggableStep)localStep).getTree());
/* 48 */       return localDefaultMutableTreeNode;
/*    */     }
/* 50 */     throw new AblRuntimeError("Unexpected behavior type " + i);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   void traceAblExecutionEvent(int paramInt1, Step paramStep, Object paramObject, int paramInt2)
/*    */   {
/* 60 */     this.entity.traceAblExecutionEvent(paramInt1, paramStep, paramObject, paramInt2, this.debuggedBehavior.getID());
/*    */   }
/*    */   
/*    */   void traceAblExecutionEvent(int paramInt, Step paramStep, Object paramObject)
/*    */   {
/* 65 */     this.entity.traceAblExecutionEvent(paramInt, paramStep, paramObject, this.nestLevel + 1, this.debuggedBehavior.getID());
/*    */   }
/*    */   
/*    */   void traceAblExecutionEvent(int paramInt1, __BehaviorDesc param__BehaviorDesc, Object paramObject, int paramInt2)
/*    */   {
/* 70 */     this.entity.traceAblExecutionEvent(paramInt1, param__BehaviorDesc, paramObject, paramInt2, param__BehaviorDesc.behaviorID);
/*    */   }
/*    */   
/*    */   void traceAblExecutionEvent(int paramInt, __BehaviorDesc param__BehaviorDesc, Object paramObject)
/*    */   {
/* 75 */     this.entity.traceAblExecutionEvent(paramInt, param__BehaviorDesc, paramObject, this.nestLevel, param__BehaviorDesc.behaviorID);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\BehaviorDebugSupport.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */