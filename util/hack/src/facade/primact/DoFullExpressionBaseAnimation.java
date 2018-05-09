/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class DoFullExpressionBaseAnimation extends FacadeAsynchronousAction implements facade.util.FullExpressions {
/*    */   private int character;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.DoFullExpressionBaseAnimation;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public DoFullExpressionBaseAnimation() {
/* 10 */     jdMethod_this();
/*    */   }
/*    */   
/* 13 */   private final void jdMethod_this() { this.character = -1; }
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject) {
/* 16 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 17 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 18 */     int k = ((Integer)paramArrayOfObject[2]).intValue();
/* 19 */     int m = ((Integer)paramArrayOfObject[3]).intValue();
/*    */     
/*    */ 
/*    */ 
/* 23 */     NativeAnimationInterface.doFullExpressionBaseAnimation(i, j, k, m, this);
/*    */     
/*    */ 
/*    */ 
/* 27 */     this.character = i;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 31 */     if ((!$noassert) && (this.character == -1)) throw new AssertionError();
/* 32 */     unregisterAction();
/*    */     
/*    */ 
/*    */ 
/* 36 */     NativeAnimationInterface.doFullExpressionBaseAnimation(this.character, -1, 0, 0, this);
/*    */     
/* 38 */     this.character = -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoFullExpressionBaseAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */