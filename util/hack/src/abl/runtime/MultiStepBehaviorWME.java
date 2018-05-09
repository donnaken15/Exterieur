/*    */ package abl.runtime;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ 
/*    */ public class MultiStepBehaviorWME extends BehaviorWME
/*    */ {
/*    */   private final java.util.HashSet children;
/*    */   private final java.util.Hashtable stepToWMETable;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 12 */     this.children = new java.util.HashSet();
/* 13 */     this.stepToWMETable = new java.util.Hashtable();
/*    */   }
/*    */   
/*    */   private class MultiStepBehaviorChildChangeListener implements java.beans.PropertyChangeListener { MultiStepBehaviorWME multiStepBehaviorWME;
/*    */     private static final boolean $noassert = Class.forName("[Labl.runtime.MultiStepBehaviorWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */     
/* 19 */     MultiStepBehaviorChildChangeListener(MultiStepBehaviorWME paramMultiStepBehaviorWME) { this.multiStepBehaviorWME = paramMultiStepBehaviorWME; }
/*    */     
/* 21 */     public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) { if ((!$noassert) && (((paramPropertyChangeEvent.getOldValue() != null) && (paramPropertyChangeEvent.getNewValue() != null)) || ((paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() == null)))) throw new AssertionError();
/*    */       Step localStep;
/* 23 */       Object localObject; if (paramPropertyChangeEvent.getOldValue() == null)
/*    */       {
/* 25 */         localStep = (Step)paramPropertyChangeEvent.getNewValue();
/* 26 */         localObject = null;
/* 27 */         switch (localStep.getStepType()) {
/*    */         case 1: 
/* 29 */           localObject = new GoalStepWME((GoalStep)localStep, this.multiStepBehaviorWME);
/* 30 */           break;
/*    */         case 0: 
/* 32 */           localObject = new PrimitiveStepWME((PrimitiveStep)localStep, this.multiStepBehaviorWME);
/* 33 */           break;
/*    */         case 3: 
/* 35 */           localObject = new WaitStepWME((WaitStep)localStep, this.multiStepBehaviorWME);
/* 36 */           break;
/*    */         case 2: 
/* 38 */           localObject = new MentalStepWME((MentalStep)localStep, this.multiStepBehaviorWME);
/* 39 */           break;
/*    */         case 4: 
/* 41 */           localObject = new FailStepWME((FailStep)localStep, this.multiStepBehaviorWME);
/* 42 */           break;
/*    */         case 5: 
/* 44 */           localObject = new SucceedStepWME((SucceedStep)localStep, this.multiStepBehaviorWME);
/*    */         }
/*    */         
/* 47 */         this.multiStepBehaviorWME.addChild((StepWME)localObject, localStep);
/* 48 */         BehavingEntity.getBehavingEntity().addWME((wm.WME)localObject);
/*    */       }
/*    */       else
/*    */       {
/* 52 */         localStep = (Step)paramPropertyChangeEvent.getOldValue();
/* 53 */         localObject = (StepWME)MultiStepBehaviorWME.this.stepToWMETable.get(localStep);
/* 54 */         if ((!$noassert) && (localObject == null)) throw new AssertionError();
/* 55 */         this.multiStepBehaviorWME.removeChild((StepWME)localObject, localStep);
/* 56 */         BehavingEntity.getBehavingEntity().deleteWME((wm.WME)localObject);
/* 57 */         ((StepWME)localObject).delete();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public MultiStepBehaviorWME(MultiStepBehavior paramMultiStepBehavior, GoalStepWME paramGoalStepWME) {
/* 63 */     super(paramMultiStepBehavior, paramGoalStepWME);jdMethod_this();
/* 64 */     this.behavior.addChildChangeListener(new MultiStepBehaviorChildChangeListener(this));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 69 */   public synchronized int getNumberNeededForSuccess() { return ((MultiStepBehavior)this.behavior).getNumberNeededForSuccess(); }
/* 70 */   public synchronized int getNumberOfCompletedSteps() { return ((MultiStepBehavior)this.behavior).getNumberOfCompletedSteps(); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 76 */   public synchronized int getNumberOfSteps() { return ((MultiStepBehavior)this.behavior).getNumberOfSteps(); }
/* 77 */   public synchronized int getBehaviorType() { return this.behavior.getBehaviorType(); }
/* 78 */   public synchronized StepWME[] getChildren() { return (StepWME[])this.children.toArray(new StepWME[this.children.size()]); }
/*    */   
/*    */   private final synchronized void addChild(StepWME paramStepWME, Step paramStep)
/*    */   {
/* 82 */     this.children.add(paramStepWME);
/* 83 */     this.stepToWMETable.put(paramStep, paramStepWME);
/*    */   }
/*    */   
/*    */   private final synchronized void removeChild(StepWME paramStepWME, Step paramStep) {
/* 87 */     this.children.remove(paramStepWME);
/* 88 */     this.stepToWMETable.remove(paramStep);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\MultiStepBehaviorWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */