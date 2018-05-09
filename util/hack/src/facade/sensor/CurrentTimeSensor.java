/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import facade.characters.wmedef.CurrentTimeWME;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CurrentTimeSensor
/*    */   extends FacadeSensor
/*    */ {
/*    */   private long lastTime;
/*    */   
/*    */   private static final void addTimeWME(long paramLong)
/*    */   {
/* 16 */     BehavingEntity.getBehavingEntity().deleteAllWMEClass("CurrentTimeWME");
/* 17 */     BehavingEntity.getBehavingEntity().addWME(new CurrentTimeWME(paramLong));
/*    */   }
/*    */   
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 22 */     long l = System.currentTimeMillis();
/* 23 */     addTimeWME(l);
/*    */   }
/*    */   
/*    */   public void initializeContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 28 */     long l = System.currentTimeMillis();
/* 29 */     this.lastTime = l;
/* 30 */     addTimeWME(l);
/*    */   }
/*    */   
/*    */   public void senseContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 35 */     long l = System.currentTimeMillis();
/* 36 */     if (l != this.lastTime) {
/* 37 */       addTimeWME(l);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\CurrentTimeSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */