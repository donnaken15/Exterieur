/*    */ package facade.sensor;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TripAnimationCueSensor
/*    */   extends AnimationCueSensor
/*    */   implements SpriteID
/*    */ {
/* 13 */   private static final Object[] senseArgs = { new Integer(1) };
/*    */   
/*    */ 
/*    */ 
/* 17 */   public void senseOneShot(Object[] paramArrayOfObject) { super.senseOneShot(senseArgs); }
/*    */   
/* 19 */   public void initializeContinuous(Object[] paramArrayOfObject) { super.initializeContinuous(senseArgs); }
/*    */   
/* 21 */   public void senseContinuous(Object[] paramArrayOfObject) { super.senseContinuous(senseArgs); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\TripAnimationCueSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */