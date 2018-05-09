/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class ReactiveWalk extends FacadeAsynchronousAction implements facade.util.SpriteID { private int character;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.ReactiveWalk;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*  8 */   public ReactiveWalk() { jdMethod_this(); }
/*    */   
/* 10 */   private final void jdMethod_this() { this.character = -1; }
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 14 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 15 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 16 */     boolean bool = ((Boolean)paramArrayOfObject[2]).booleanValue();
/*    */     
/* 18 */     NativeAnimationInterface.reactiveWalkStep(i, j, bool, this);
/* 19 */     this.character = i;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 23 */     if ((!$noassert) && (this.character == -1)) throw new AssertionError();
/* 24 */     unregisterAction();
/* 25 */     NativeAnimationInterface.abortWalkStep(this.character);
/*    */     
/*    */ 
/* 28 */     this.character = -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\ReactiveWalk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */