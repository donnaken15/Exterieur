/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class DoPutdownObjGestureAnimation extends FacadeAsynchronousAction
/*    */   implements facade.util.SpriteID, facade.util.GestureBodyPart {
/*    */   protected int character;
/*    */   protected int gestureBodyPart;
/*    */   
/* 10 */   public DoPutdownObjGestureAnimation() { jdMethod_this(); }
/*    */   
/*    */   private final void jdMethod_this() {
/* 13 */     this.character = -1;
/* 14 */     this.gestureBodyPart = -1;
/*    */   }
/*    */   
/* 17 */   public void execute(Object[] paramArrayOfObject) { int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 18 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 19 */     int k = ((Integer)paramArrayOfObject[2]).intValue();
/* 20 */     int m = ((Integer)paramArrayOfObject[3]).intValue();
/* 21 */     int n = ((Integer)paramArrayOfObject[4]).intValue();
/* 22 */     float f1 = ((Float)paramArrayOfObject[5]).floatValue();
/* 23 */     float f2 = ((Float)paramArrayOfObject[6]).floatValue();
/* 24 */     float f3 = ((Float)paramArrayOfObject[7]).floatValue();
/* 25 */     int i1 = ((Integer)paramArrayOfObject[8]).intValue();
/*    */     
/* 27 */     NativeAnimationInterface.doPutdownObjGestureAnimation(i, j, k, m, n, f1, f2, f3, i1, this);
/*    */     
/*    */ 
/*    */ 
/* 31 */     this.character = i;
/* 32 */     this.gestureBodyPart = j;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 36 */     if ((this.character != -1) && (this.gestureBodyPart != -1))
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 47 */       unregisterAction();
/* 48 */       NativeAnimationInterface.doPutdownObjGestureAnimation(this.character, this.gestureBodyPart, -1, -1, -1, 0.0F, 0.0F, 0.0F, -1, this);
/*    */       
/*    */ 
/*    */ 
/* 52 */       this.character = -1;
/* 53 */       this.gestureBodyPart = -1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoPutdownObjGestureAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */