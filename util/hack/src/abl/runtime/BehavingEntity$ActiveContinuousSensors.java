/*     */ package abl.runtime;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class BehavingEntity$ActiveContinuousSensors
/*     */ {
/*     */   private LinkedList activeSensors;
/*     */   final BehavingEntity this$0;
/*     */   
/* 198 */   private BehavingEntity$ActiveContinuousSensors(BehavingEntity paramBehavingEntity) { jdMethod_this(); } BehavingEntity$ActiveContinuousSensors(BehavingEntity paramBehavingEntity, BehavingEntity.1 param1) { this(paramBehavingEntity); }
/*     */   
/*     */   private final void jdMethod_this() {
/* 201 */     this.activeSensors = new LinkedList();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   synchronized void activateSensor(SensorActivation paramSensorActivation)
/*     */   {
/* 211 */     ListIterator localListIterator = this.activeSensors.listIterator();
/*     */     
/* 213 */     while (localListIterator.hasNext()) {
/* 214 */       SensorActivation localSensorActivation = (SensorActivation)localListIterator.next();
/*     */       
/* 216 */       if (paramSensorActivation.equals(localSensorActivation))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */         localSensorActivation.referenceCount += 1;
/* 223 */         return;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */     this.activeSensors.add(paramSensorActivation);
/* 232 */     paramSensorActivation.activeSensor.initializeContinuous(paramSensorActivation.arguments);
/* 233 */     notify();
/*     */   }
/*     */   
/*     */   synchronized void activateSensors(SensorActivation[] paramArrayOfSensorActivation) {
/* 237 */     if (paramArrayOfSensorActivation != null) {
/* 238 */       for (int i = 0; i < paramArrayOfSensorActivation.length; i++) {
/* 239 */         activateSensor(paramArrayOfSensorActivation[i]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   synchronized void deactivateSensor(SensorActivation paramSensorActivation)
/*     */   {
/* 251 */     ListIterator localListIterator = this.activeSensors.listIterator();
/*     */     
/* 253 */     while (localListIterator.hasNext()) {
/* 254 */       SensorActivation localSensorActivation = (SensorActivation)localListIterator.next();
/* 255 */       if (paramSensorActivation.equals(localSensorActivation))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 260 */         if (localSensorActivation.referenceCount == 1) {
/* 261 */           localListIterator.remove();
/*     */         } else {
/* 263 */           localSensorActivation.referenceCount -= 1;
/*     */         }
/* 265 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   synchronized void deactivateSensors(SensorActivation[] paramArrayOfSensorActivation)
/*     */   {
/* 274 */     if (paramArrayOfSensorActivation != null)
/* 275 */       for (int i = 0; i < paramArrayOfSensorActivation.length; i++)
/* 276 */         deactivateSensor(paramArrayOfSensorActivation[i]);
/*     */   }
/*     */   
/*     */   synchronized void sense() {
/* 280 */     if (!this.activeSensors.isEmpty()) {
/* 281 */       this.this$0.runSensors(this.activeSensors, true);
/* 282 */       this.this$0.senseMonitor.setSensedConditionsReadyToRun(true);
/*     */     } else {
/*     */       try {
/* 285 */         wait();
/*     */       }
/*     */       catch (InterruptedException localInterruptedException) {
/* 288 */         throw new RuntimeError("Sense cycle interrupted");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\BehavingEntity$ActiveContinuousSensors.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */