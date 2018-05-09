/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class Walk extends FacadeAsynchronousAction implements facade.util.SpriteID {
/*    */   private int character;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.Walk;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*  9 */   public Walk() { jdMethod_this(); }
/*    */   
/* 11 */   private final void jdMethod_this() { this.character = -1; }
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject) {
/* 14 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 15 */     float f1 = ((Float)paramArrayOfObject[1]).floatValue();
/* 16 */     float f2 = ((Float)paramArrayOfObject[2]).floatValue();
/* 17 */     float f3 = ((Float)paramArrayOfObject[3]).floatValue();
/* 18 */     float f4 = ((Float)paramArrayOfObject[4]).floatValue();
/* 19 */     int j = ((Integer)paramArrayOfObject[5]).intValue();
/* 20 */     facade.util.Point3D localPoint3D = (facade.util.Point3D)paramArrayOfObject[6];
/*    */     
/* 22 */     NativeAnimationInterface.walkStep(i, j, f1, f2, f3, f4, localPoint3D, this);
/*    */     
/* 24 */     this.character = i;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 28 */     if ((!$noassert) && (this.character == -1)) throw new AssertionError();
/* 29 */     unregisterAction();
/* 30 */     NativeAnimationInterface.abortWalkStep(this.character);
/*    */     
/*    */ 
/* 33 */     this.character = -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\Walk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */