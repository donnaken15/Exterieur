/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class DoGestureAnimation extends FacadeAsynchronousAction
/*    */   implements facade.util.SpriteID, facade.util.GestureBodyPart {
/*    */   protected int character;
/*    */   protected int gestureBodyPart;
/*    */   
/* 10 */   public DoGestureAnimation() { jdMethod_this(); }
/*    */   
/*    */   private final void jdMethod_this() {
/* 13 */     this.character = -1;
/* 14 */     this.gestureBodyPart = -1;
/*    */   }
/*    */   
/* 17 */   public void execute(Object[] paramArrayOfObject) { int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 18 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 19 */     int k = ((Integer)paramArrayOfObject[2]).intValue();
/*    */     
/* 21 */     NativeAnimationInterface.doGestureAnimation(i, j, k, this);
/*    */     
/* 23 */     this.character = i;
/* 24 */     this.gestureBodyPart = j;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 28 */     if ((this.character != -1) && (this.gestureBodyPart != -1))
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
/* 39 */       unregisterAction();
/* 40 */       NativeAnimationInterface.doGestureAnimation(this.character, this.gestureBodyPart, -1, this);
/*    */       
/*    */ 
/* 43 */       this.character = -1;
/* 44 */       this.gestureBodyPart = -1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoGestureAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */