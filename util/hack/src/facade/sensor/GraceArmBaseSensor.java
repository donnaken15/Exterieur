/*    */ package facade.sensor;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GraceArmBaseSensor
/*    */   extends ArmBaseSensor
/*    */   implements SpriteID
/*    */ {
/* 11 */   public void senseOneShot(Object[] paramArrayOfObject) { sense_Utility(0); }
/* 12 */   public void initializeContinuous(Object[] paramArrayOfObject) { sense_Utility(0); }
/* 13 */   public void senseContinuous(Object[] paramArrayOfObject) { sense_Utility(0); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\GraceArmBaseSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */