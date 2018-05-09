/*    */ package facade.primact;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class PushPoseScript extends FacadeAsynchronousAction implements facade.util.AnimLayer, facade.util.SpriteID { private int character;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.PushPoseScript;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*  8 */   public PushPoseScript() { jdMethod_this(); }
/*    */   
/*    */   private final void jdMethod_this() {
/* 11 */     this.character = -1;
/*    */   }
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 16 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 17 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/*    */     
/* 19 */     this.character = i;
/*    */     
/* 21 */     NativeAnimationInterface.pushPoseScript(i, j, this);
/*    */   }
/*    */   
/*    */   public void abort() {
/* 25 */     if ((!$noassert) && (this.character == -1)) { throw new AssertionError();
/*    */     }
/*    */     
/* 28 */     NativeAnimationInterface.abortAnimationScripts(this.character, 0);
/*    */     
/*    */ 
/* 31 */     this.character = -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\PushPoseScript.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */