/*    */ package abl.runtime;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ 
/*    */ public class GoalStepWME extends ExecutableStepWME
/*    */ {
/*    */   protected BehaviorWME child;
/*    */   protected GoalChildChangeListener listener;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 12 */     this.child = null;
/*    */   }
/*    */   
/*    */   private class GoalChildChangeListener
/*    */     implements java.beans.PropertyChangeListener {
/*    */     GoalStepWME goalStepWME;
/*    */     private static final boolean $noassert = Class.forName("[Labl.runtime.GoalStepWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */     
/* 20 */     GoalChildChangeListener(GoalStepWME paramGoalStepWME) { this.goalStepWME = paramGoalStepWME; }
/*    */     
/* 22 */     public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) { if ((!$noassert) && (((paramPropertyChangeEvent.getOldValue() != null) && (paramPropertyChangeEvent.getNewValue() != null)) || ((paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() == null)))) { throw new AssertionError();
/*    */       }
/* 24 */       if (paramPropertyChangeEvent.getOldValue() == null)
/*    */       {
/* 26 */         if ((!$noassert) && (this.goalStepWME.child != null)) throw new AssertionError();
/* 27 */         Behavior localBehavior = (Behavior)paramPropertyChangeEvent.getNewValue();
/* 28 */         Object localObject = null;
/* 29 */         switch (localBehavior.getBehaviorType()) {
/*    */         case 0: 
/* 31 */           localObject = new SequentialBehaviorWME((SequentialBehavior)localBehavior, this.goalStepWME);
/* 32 */           break;
/*    */         case 1: 
/* 34 */           localObject = new ParallelBehaviorWME((ParallelBehavior)localBehavior, this.goalStepWME);
/* 35 */           break;
/*    */         case 2: 
/* 37 */           localObject = new CollectionBehaviorWME((CollectionBehavior)localBehavior, this.goalStepWME);
/*    */         }
/*    */         
/* 40 */         this.goalStepWME.setChild((BehaviorWME)localObject);
/* 41 */         BehavingEntity.getBehavingEntity().addWME((wm.WME)localObject);
/*    */       }
/*    */       else
/*    */       {
/* 45 */         if ((!$noassert) && (this.goalStepWME.child == null)) throw new AssertionError();
/* 46 */         BehavingEntity.getBehavingEntity().deleteWME(this.goalStepWME.child);
/* 47 */         GoalStepWME.this.child.delete();
/* 48 */         this.goalStepWME.setChild(null);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public GoalStepWME(GoalStep paramGoalStep, BehaviorWME paramBehaviorWME)
/*    */   {
/* 57 */     super(paramGoalStep, paramBehaviorWME);jdMethod_this();
/* 58 */     this.listener = new GoalChildChangeListener(this);
/* 59 */     paramGoalStep.addChildChangeListener(this.listener);
/*    */   }
/*    */   
/*    */ 
/*    */   void delete()
/*    */   {
/* 65 */     ((GoalStep)this.s).removeChildChangeListener(this.listener);
/* 66 */     super.delete();
/*    */   }
/*    */   
/* 69 */   public synchronized String getSignature() { return ((GoalStep)this.s).getSignature(); }
/* 70 */   public synchronized BehaviorWME getChild() { return this.child; }
/* 71 */   public synchronized boolean getIsExpanded() { return ((GoalStep)this.s).isExpanded(); }
/* 72 */   private final synchronized void setChild(BehaviorWME paramBehaviorWME) { this.child = paramBehaviorWME; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\GoalStepWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */