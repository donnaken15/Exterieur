/*    */ package facade.sensor;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TripObjectPickupPositionSensor
/*    */   extends ObjectPickupPositionSensor
/*    */   implements SpriteID
/*    */ {
/* 12 */   public void senseOneShot(Object[] paramArrayOfObject) { senseOneShot_Utility(1); }
/* 13 */   public void initializeContinuous(Object[] paramArrayOfObject) { initializeContinuous_Utility(1); }
/* 14 */   public void senseContinuous(Object[] paramArrayOfObject) { senseContinuous_Utility(1); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\TripObjectPickupPositionSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */