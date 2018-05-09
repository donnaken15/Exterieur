/*    */ package abl.runtime;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ import java.beans.PropertyChangeListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ class SequentialBehaviorWME$SequentialBehaviorChildChangeListener
/*    */   implements PropertyChangeListener
/*    */ {
/*    */   SequentialBehaviorWME sequentialBehaviorWME;
/*    */   final SequentialBehaviorWME this$0;
/*    */   private static final boolean $noassert = Class.forName("[Labl.runtime.SequentialBehaviorWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/* 15 */   SequentialBehaviorWME$SequentialBehaviorChildChangeListener(SequentialBehaviorWME paramSequentialBehaviorWME1, SequentialBehaviorWME paramSequentialBehaviorWME2) { this.sequentialBehaviorWME = paramSequentialBehaviorWME2; }
/*    */   
/* 17 */   public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) { if ((!$noassert) && (((paramPropertyChangeEvent.getOldValue() != null) && (paramPropertyChangeEvent.getNewValue() != null)) || ((paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() == null)))) { throw new AssertionError("Behavior " + this.this$0.behavior);
/*    */     }
/*    */     
/*    */ 
/* 21 */     if (paramPropertyChangeEvent.getOldValue() == null)
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 27 */       if ((BehavingEntity.getBehavingEntity().getBehavingEntityShortName().equals("Trip")) && (this.this$0.behavior.getSignature().equals("DoDialog(int, boolean, int, int, int, int, boolean)")))
/*    */       {
/* 29 */         if ((!$noassert) && (!Thread.currentThread().getName().equals("DecisionCycleThread"))) { throw new AssertionError("Thread adding a step reflection wme = " + Thread.currentThread());
/*    */         }
/*    */       }
/*    */       
/* 33 */       if ((!$noassert) && (this.sequentialBehaviorWME.child != null)) { throw new AssertionError("Behavior " + this.this$0.behavior);
/*    */       }
/* 35 */       Step localStep = (Step)paramPropertyChangeEvent.getNewValue();
/* 36 */       switch (localStep.getStepType()) {
/*    */       case 1: 
/* 38 */         SequentialBehaviorWME.access$0(this.sequentialBehaviorWME, new GoalStepWME((GoalStep)localStep, this.sequentialBehaviorWME));
/* 39 */         break;
/*    */       case 0: 
/* 41 */         SequentialBehaviorWME.access$0(this.sequentialBehaviorWME, new PrimitiveStepWME((PrimitiveStep)localStep, this.sequentialBehaviorWME));
/* 42 */         break;
/*    */       case 3: 
/* 44 */         SequentialBehaviorWME.access$0(this.sequentialBehaviorWME, new WaitStepWME((WaitStep)localStep, this.sequentialBehaviorWME));
/* 45 */         break;
/*    */       case 2: 
/* 47 */         SequentialBehaviorWME.access$0(this.sequentialBehaviorWME, new MentalStepWME((MentalStep)localStep, this.sequentialBehaviorWME));
/* 48 */         break;
/*    */       case 4: 
/* 50 */         SequentialBehaviorWME.access$0(this.sequentialBehaviorWME, new FailStepWME((FailStep)localStep, this.sequentialBehaviorWME));
/* 51 */         break;
/*    */       case 5: 
/* 53 */         SequentialBehaviorWME.access$0(this.sequentialBehaviorWME, new SucceedStepWME((SucceedStep)localStep, this.sequentialBehaviorWME));
/*    */       }
/*    */       
/* 56 */       BehavingEntity.getBehavingEntity().addWME(this.sequentialBehaviorWME.child);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     }
/*    */     else
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 68 */       if ((!$noassert) && (this.sequentialBehaviorWME.child == null)) { throw new AssertionError("Behavior " + this.this$0.behavior);
/*    */       }
/* 70 */       BehavingEntity.getBehavingEntity().deleteWME(this.sequentialBehaviorWME.child);
/* 71 */       this.sequentialBehaviorWME.getChild().delete();
/* 72 */       SequentialBehaviorWME.access$0(this.sequentialBehaviorWME, null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SequentialBehaviorWME$SequentialBehaviorChildChangeListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */