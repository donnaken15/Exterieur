/*    */ package abl.runtime;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ import java.beans.PropertyChangeListener;
/*    */ import wm.WME;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class GoalStepWME$GoalChildChangeListener
/*    */   implements PropertyChangeListener
/*    */ {
/*    */   GoalStepWME goalStepWME;
/*    */   final GoalStepWME this$0;
/*    */   private static final boolean $noassert = Class.forName("[Labl.runtime.GoalStepWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/* 20 */   GoalStepWME$GoalChildChangeListener(GoalStepWME paramGoalStepWME1, GoalStepWME paramGoalStepWME2) { this.goalStepWME = paramGoalStepWME2; }
/*    */   
/* 22 */   public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) { if ((!$noassert) && (((paramPropertyChangeEvent.getOldValue() != null) && (paramPropertyChangeEvent.getNewValue() != null)) || ((paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() == null)))) { throw new AssertionError();
/*    */     }
/* 24 */     if (paramPropertyChangeEvent.getOldValue() == null)
/*    */     {
/* 26 */       if ((!$noassert) && (this.goalStepWME.child != null)) throw new AssertionError();
/* 27 */       Behavior localBehavior = (Behavior)paramPropertyChangeEvent.getNewValue();
/* 28 */       Object localObject = null;
/* 29 */       switch (localBehavior.getBehaviorType()) {
/*    */       case 0: 
/* 31 */         localObject = new SequentialBehaviorWME((SequentialBehavior)localBehavior, this.goalStepWME);
/* 32 */         break;
/*    */       case 1: 
/* 34 */         localObject = new ParallelBehaviorWME((ParallelBehavior)localBehavior, this.goalStepWME);
/* 35 */         break;
/*    */       case 2: 
/* 37 */         localObject = new CollectionBehaviorWME((CollectionBehavior)localBehavior, this.goalStepWME);
/*    */       }
/*    */       
/* 40 */       GoalStepWME.access$0(this.goalStepWME, (BehaviorWME)localObject);
/* 41 */       BehavingEntity.getBehavingEntity().addWME((WME)localObject);
/*    */     }
/*    */     else
/*    */     {
/* 45 */       if ((!$noassert) && (this.goalStepWME.child == null)) throw new AssertionError();
/* 46 */       BehavingEntity.getBehavingEntity().deleteWME(this.goalStepWME.child);
/* 47 */       this.this$0.child.delete();
/* 48 */       GoalStepWME.access$0(this.goalStepWME, null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\GoalStepWME$GoalChildChangeListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */