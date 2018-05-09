/*    */ package abl.runtime;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ import java.beans.PropertyChangeListener;
/*    */ import java.util.Hashtable;
/*    */ import wm.WME;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class MultiStepBehaviorWME$MultiStepBehaviorChildChangeListener
/*    */   implements PropertyChangeListener
/*    */ {
/*    */   MultiStepBehaviorWME multiStepBehaviorWME;
/*    */   final MultiStepBehaviorWME this$0;
/*    */   private static final boolean $noassert = Class.forName("[Labl.runtime.MultiStepBehaviorWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/* 19 */   MultiStepBehaviorWME$MultiStepBehaviorChildChangeListener(MultiStepBehaviorWME paramMultiStepBehaviorWME1, MultiStepBehaviorWME paramMultiStepBehaviorWME2) { this.multiStepBehaviorWME = paramMultiStepBehaviorWME2; }
/*    */   
/* 21 */   public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) { if ((!$noassert) && (((paramPropertyChangeEvent.getOldValue() != null) && (paramPropertyChangeEvent.getNewValue() != null)) || ((paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() == null)))) throw new AssertionError();
/*    */     Step localStep;
/* 23 */     Object localObject; if (paramPropertyChangeEvent.getOldValue() == null)
/*    */     {
/* 25 */       localStep = (Step)paramPropertyChangeEvent.getNewValue();
/* 26 */       localObject = null;
/* 27 */       switch (localStep.getStepType()) {
/*    */       case 1: 
/* 29 */         localObject = new GoalStepWME((GoalStep)localStep, this.multiStepBehaviorWME);
/* 30 */         break;
/*    */       case 0: 
/* 32 */         localObject = new PrimitiveStepWME((PrimitiveStep)localStep, this.multiStepBehaviorWME);
/* 33 */         break;
/*    */       case 3: 
/* 35 */         localObject = new WaitStepWME((WaitStep)localStep, this.multiStepBehaviorWME);
/* 36 */         break;
/*    */       case 2: 
/* 38 */         localObject = new MentalStepWME((MentalStep)localStep, this.multiStepBehaviorWME);
/* 39 */         break;
/*    */       case 4: 
/* 41 */         localObject = new FailStepWME((FailStep)localStep, this.multiStepBehaviorWME);
/* 42 */         break;
/*    */       case 5: 
/* 44 */         localObject = new SucceedStepWME((SucceedStep)localStep, this.multiStepBehaviorWME);
/*    */       }
/*    */       
/* 47 */       MultiStepBehaviorWME.access$0(this.multiStepBehaviorWME, (StepWME)localObject, localStep);
/* 48 */       BehavingEntity.getBehavingEntity().addWME((WME)localObject);
/*    */     }
/*    */     else
/*    */     {
/* 52 */       localStep = (Step)paramPropertyChangeEvent.getOldValue();
/* 53 */       localObject = (StepWME)MultiStepBehaviorWME.access$1(this.this$0).get(localStep);
/* 54 */       if ((!$noassert) && (localObject == null)) throw new AssertionError();
/* 55 */       MultiStepBehaviorWME.access$2(this.multiStepBehaviorWME, (StepWME)localObject, localStep);
/* 56 */       BehavingEntity.getBehavingEntity().deleteWME((WME)localObject);
/* 57 */       ((StepWME)localObject).delete();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\MultiStepBehaviorWME$MultiStepBehaviorChildChangeListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */