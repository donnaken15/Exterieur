/*    */ package facade.sensor;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ public class GraceObjectActivationSensor
/*    */   extends ObjectActivationSensor
/*    */   implements SpriteID
/*    */ {
/* 10 */   private static final Object[] senseArgs = { new Integer(0) };
/*    */   
/*    */ 
/*    */ 
/* 14 */   public void senseOneShot(Object[] paramArrayOfObject) { super.senseOneShot(senseArgs); }
/*    */   
/* 16 */   public void initializeContinuous(Object[] paramArrayOfObject) { super.initializeContinuous(senseArgs); }
/*    */   
/* 18 */   public void senseContinuous(Object[] paramArrayOfObject) { super.senseContinuous(senseArgs); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\GraceObjectActivationSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */