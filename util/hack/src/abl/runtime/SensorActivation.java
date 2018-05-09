/*    */ package abl.runtime;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class SensorActivation {
/*    */   public Sensor activeSensor;
/*    */   public Object[] arguments;
/*    */   public int referenceCount;
/*    */   
/*    */   public SensorActivation(Sensor paramSensor, Object[] paramArrayOfObject) {
/* 11 */     this.activeSensor = paramSensor;
/* 12 */     this.arguments = paramArrayOfObject;
/* 13 */     this.referenceCount = 1;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 21 */     SensorActivation localSensorActivation = (SensorActivation)paramObject;
/* 22 */     if ((localSensorActivation.activeSensor.getClass() == this.activeSensor.getClass()) && (Arrays.equals(localSensorActivation.arguments, this.arguments)))
/*    */     {
/* 24 */       return true;
/*    */     }
/* 26 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SensorActivation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */