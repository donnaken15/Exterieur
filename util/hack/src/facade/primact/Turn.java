/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class Turn extends FacadeAsynchronousAction implements facade.util.SpriteID { private int character;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.Turn;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*  8 */   public Turn() { jdMethod_this(); }
/*    */   
/* 10 */   private final void jdMethod_this() { this.character = -1; }
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject) {
/* 13 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 14 */     float f = ((Float)paramArrayOfObject[1]).floatValue();
/*    */     
/* 16 */     NativeAnimationInterface.turnInPlace(i, f, this);
/* 17 */     this.character = i;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 21 */     if ((!$noassert) && (this.character == -1)) throw new AssertionError();
/* 22 */     unregisterAction();
/* 23 */     NativeAnimationInterface.abortTurnInPlace(this.character);
/*    */     
/*    */ 
/* 26 */     this.character = -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\Turn.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */