/*    */ package abl.runtime;
/*    */ 
/*    */ 
/*    */ public abstract class Sensor
/*    */ {
/*    */   protected boolean bCanBeParallel;
/*    */   
/*    */ 
/*    */   public Sensor()
/*    */   {
/* 11 */     jdMethod_this();
/*    */   }
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 16 */     this.bCanBeParallel = false;
/*    */   }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean canBeParallel()
/*    */   {
/* 38 */     return this.bCanBeParallel;
/*    */   }
/*    */   
/*    */   public abstract void senseContinuous(Object[] paramArrayOfObject);
/*    */   
/*    */   public abstract void initializeContinuous(Object[] paramArrayOfObject);
/*    */   
/*    */   public abstract void senseOneShot(Object[] paramArrayOfObject);
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\Sensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */