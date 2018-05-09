/*    */ package facade.sensor;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TripArmBaseSensor
/*    */   extends ArmBaseSensor
/*    */   implements SpriteID
/*    */ {
/* 11 */   public void senseOneShot(Object[] paramArrayOfObject) { sense_Utility(1); }
/* 12 */   public void initializeContinuous(Object[] paramArrayOfObject) { sense_Utility(1); }
/* 13 */   public void senseContinuous(Object[] paramArrayOfObject) { sense_Utility(1); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\TripArmBaseSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */