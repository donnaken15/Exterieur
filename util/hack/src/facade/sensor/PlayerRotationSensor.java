/*    */ package facade.sensor;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ public class PlayerRotationSensor
/*    */   extends FacadeSensor
/*    */   implements SpriteID
/*    */ {
/* 10 */   private static final Object[] senseArgs = { new Integer(2) };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 23 */     ObjectRotationSensor localObjectRotationSensor = new ObjectRotationSensor();
/* 24 */     localObjectRotationSensor.senseOneShot(senseArgs);
/* 25 */     localObjectRotationSensor.addSpecificRotationWME(2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void initializeContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 37 */     ObjectRotationSensor localObjectRotationSensor = new ObjectRotationSensor();
/* 38 */     localObjectRotationSensor.initializeContinuous(senseArgs);
/* 39 */     localObjectRotationSensor.addSpecificRotationWME(2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void senseContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 51 */     ObjectRotationSensor localObjectRotationSensor = new ObjectRotationSensor();
/* 52 */     localObjectRotationSensor.senseContinuous(senseArgs);
/* 53 */     localObjectRotationSensor.addSpecificRotationWME(2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\PlayerRotationSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */