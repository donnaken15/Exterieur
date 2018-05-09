/*    */ package abl.runtime;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ 
/*    */ public class SequentialBehaviorWME
/*    */   extends BehaviorWME {
/*    */   protected StepWME child;
/*    */   
/*  9 */   private final void jdMethod_this() { this.child = null; }
/*    */   
/*    */   private class SequentialBehaviorChildChangeListener implements java.beans.PropertyChangeListener {
/*    */     SequentialBehaviorWME sequentialBehaviorWME;
/*    */     private static final boolean $noassert = Class.forName("[Labl.runtime.SequentialBehaviorWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */     
/* 15 */     SequentialBehaviorChildChangeListener(SequentialBehaviorWME paramSequentialBehaviorWME) { this.sequentialBehaviorWME = paramSequentialBehaviorWME; }
/*    */     
/* 17 */     public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) { if ((!$noassert) && (((paramPropertyChangeEvent.getOldValue() != null) && (paramPropertyChangeEvent.getNewValue() != null)) || ((paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() == null)))) { throw new AssertionError("Behavior " + SequentialBehaviorWME.this.behavior);
/*    */       }
/*    */       
/*    */ 
/* 21 */       if (paramPropertyChangeEvent.getOldValue() == null)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 27 */         if ((BehavingEntity.getBehavingEntity().getBehavingEntityShortName().equals("Trip")) && (SequentialBehaviorWME.this.behavior.getSignature().equals("DoDialog(int, boolean, int, int, int, int, boolean)")))
/*    */         {
/* 29 */           if ((!$noassert) && (!Thread.currentThread().getName().equals("DecisionCycleThread"))) { throw new AssertionError("Thread adding a step reflection wme = " + Thread.currentThread());
/*    */           }
/*    */         }
/*    */         
/* 33 */         if ((!$noassert) && (this.sequentialBehaviorWME.child != null)) { throw new AssertionError("Behavior " + SequentialBehaviorWME.this.behavior);
/*    */         }
/* 35 */         Step localStep = (Step)paramPropertyChangeEvent.getNewValue();
/* 36 */         switch (localStep.getStepType()) {
/*    */         case 1: 
/* 38 */           this.sequentialBehaviorWME.setChild(new GoalStepWME((GoalStep)localStep, this.sequentialBehaviorWME));
/* 39 */           break;
/*    */         case 0: 
/* 41 */           this.sequentialBehaviorWME.setChild(new PrimitiveStepWME((PrimitiveStep)localStep, this.sequentialBehaviorWME));
/* 42 */           break;
/*    */         case 3: 
/* 44 */           this.sequentialBehaviorWME.setChild(new WaitStepWME((WaitStep)localStep, this.sequentialBehaviorWME));
/* 45 */           break;
/*    */         case 2: 
/* 47 */           this.sequentialBehaviorWME.setChild(new MentalStepWME((MentalStep)localStep, this.sequentialBehaviorWME));
/* 48 */           break;
/*    */         case 4: 
/* 50 */           this.sequentialBehaviorWME.setChild(new FailStepWME((FailStep)localStep, this.sequentialBehaviorWME));
/* 51 */           break;
/*    */         case 5: 
/* 53 */           this.sequentialBehaviorWME.setChild(new SucceedStepWME((SucceedStep)localStep, this.sequentialBehaviorWME));
/*    */         }
/*    */         
/* 56 */         BehavingEntity.getBehavingEntity().addWME(this.sequentialBehaviorWME.child);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       }
/*    */       else
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 68 */         if ((!$noassert) && (this.sequentialBehaviorWME.child == null)) { throw new AssertionError("Behavior " + SequentialBehaviorWME.this.behavior);
/*    */         }
/* 70 */         BehavingEntity.getBehavingEntity().deleteWME(this.sequentialBehaviorWME.child);
/* 71 */         this.sequentialBehaviorWME.getChild().delete();
/* 72 */         this.sequentialBehaviorWME.setChild(null);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public SequentialBehaviorWME(SequentialBehavior paramSequentialBehavior, GoalStepWME paramGoalStepWME) {
/* 78 */     super(paramSequentialBehavior, paramGoalStepWME);jdMethod_this();
/* 79 */     paramSequentialBehavior.addChildChangeListener(new SequentialBehaviorChildChangeListener(this));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 85 */   public synchronized StepWME getChild() { return this.child; }
/* 86 */   public synchronized int getBehaviorType() { return this.behavior.getBehaviorType(); }
/* 87 */   private final synchronized void setChild(StepWME paramStepWME) { this.child = paramStepWME; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SequentialBehaviorWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */