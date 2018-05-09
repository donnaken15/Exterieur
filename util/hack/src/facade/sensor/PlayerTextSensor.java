/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import abl.runtime.RuntimeError;
/*    */ import facade.characters.wmedef.PlayerTextWME;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlayerTextSensor
/*    */   extends FacadeSensor
/*    */ {
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 15 */     String str = NativeAnimationInterface.textSensor();
/* 16 */     BehavingEntity.getBehavingEntity().deleteAllWMEClass("PlayerTextWME");
/* 17 */     BehavingEntity.getBehavingEntity().addWME(new PlayerTextWME(str));
/*    */   }
/*    */   
/* 20 */   public void initializeContinuous(Object[] paramArrayOfObject) { throw new RuntimeError("continuous sensing not defined for PlayerTextSensor"); }
/*    */   
/* 22 */   public void senseContinuous(Object[] paramArrayOfObject) { throw new RuntimeError("continuous sensing not defined for PlayerTextSensor"); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\PlayerTextSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */