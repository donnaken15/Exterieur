/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class DoPickupObjGestureAnimation extends FacadeAsynchronousAction
/*    */   implements facade.util.SpriteID, facade.util.GestureBodyPart {
/*    */   protected int character;
/*    */   protected int gestureBodyPart;
/*    */   
/* 10 */   public DoPickupObjGestureAnimation() { jdMethod_this(); }
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
/*    */     
/* 23 */     NativeAnimationInterface.doPickupObjGestureAnimation(i, j, k, m, n, this);
/*    */     
/*    */ 
/* 26 */     this.character = i;
/* 27 */     this.gestureBodyPart = j;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 31 */     if ((this.character != -1) && (this.gestureBodyPart != -1))
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
/* 42 */       unregisterAction();
/* 43 */       NativeAnimationInterface.doPickupObjGestureAnimation(this.character, this.gestureBodyPart, -1, -1, -1, this);
/*    */       
/*    */ 
/* 46 */       this.character = -1;
/* 47 */       this.gestureBodyPart = -1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoPickupObjGestureAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */