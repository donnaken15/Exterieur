/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class PushMultipleAnimationScripts extends FacadeAsynchronousAction implements facade.util.AnimLayer, facade.util.SpriteID { private int character;
/*    */   private int layer;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.PushMultipleAnimationScripts;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*  9 */   public PushMultipleAnimationScripts() { jdMethod_this(); }
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 13 */     this.character = -1;
/* 14 */     this.layer = -1;
/*    */   }
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject) {
/* 18 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 19 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 20 */     int k = ((Integer)paramArrayOfObject[2]).intValue();
/* 21 */     int m = ((Integer)paramArrayOfObject[3]).intValue();
/* 22 */     int n = ((Integer)paramArrayOfObject[4]).intValue();
/* 23 */     int i1 = ((Integer)paramArrayOfObject[5]).intValue();
/* 24 */     boolean bool = ((Boolean)paramArrayOfObject[6]).booleanValue();
/*    */     
/* 26 */     this.character = i;
/* 27 */     this.layer = i1;
/*    */     
/* 29 */     if (bool) {
/* 30 */       NativeAnimationInterface.pushAnimationUScript(i, j, i1, this);
/*    */     }
/*    */     else {
/* 33 */       NativeAnimationInterface.pushMultipleAnimationScripts(i, j, k, m, n, i1, this);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void abort()
/*    */   {
/* 44 */     if ((!$noassert) && ((this.character == -1) || (this.layer == -1))) { throw new AssertionError();
/*    */     }
/*    */     
/* 47 */     NativeAnimationInterface.abortAnimationScripts(this.character, this.layer);
/* 48 */     unregisterAction();
/*    */     
/*    */ 
/* 51 */     this.character = -1;
/* 52 */     this.layer = -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\PushMultipleAnimationScripts.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */