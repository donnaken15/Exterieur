/*    */ package facade.sensor;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlayerPositionSensor
/*    */   extends FacadeSensor
/*    */   implements SpriteID
/*    */ {
/* 11 */   private static final Object[] senseArgs = { new Integer(2) };
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
/*    */ 
/*    */ 
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 26 */     ObjectPositionSensor localObjectPositionSensor = new ObjectPositionSensor();
/* 27 */     localObjectPositionSensor.senseOneShot(senseArgs);
/* 28 */     localObjectPositionSensor.addSpecificPositionWME(2);
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
/* 40 */     ObjectPositionSensor localObjectPositionSensor = new ObjectPositionSensor();
/*    */     
/*    */ 
/* 43 */     localObjectPositionSensor.senseContinuous(senseArgs);
/* 44 */     localObjectPositionSensor.addSpecificPositionWME(2);
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
/* 56 */     ObjectPositionSensor localObjectPositionSensor = new ObjectPositionSensor();
/*    */     
/*    */ 
/* 59 */     localObjectPositionSensor.senseContinuous(senseArgs);
/* 60 */     localObjectPositionSensor.addSpecificPositionWME(2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\PlayerPositionSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */