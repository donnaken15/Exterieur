/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.Sensor;
/*    */ 
/*    */ public abstract class FacadeSensor extends Sensor
/*    */ {
/*    */   protected static final int ONE_SHOT = 0;
/*    */   protected static final int INITIALIZE = 1;
/*    */   protected static final int CONTINUOUS = 2;
/*    */   
/*    */   public FacadeSensor()
/*    */   {
/* 13 */     this.bCanBeParallel = true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\FacadeSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */