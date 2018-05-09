/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.PrimitiveAction;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ public class ResetEntireBody
/*    */   extends PrimitiveAction
/*    */   implements SpriteID
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.ResetEntireBody;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 16 */     if ((!$noassert) && (paramArrayOfObject.length != 1)) { throw new AssertionError();
/*    */     }
/* 18 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 19 */     NativeAnimationInterface.abortAnimationScripts(i, -1);
/* 20 */     this.completionStatus = 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\ResetEntireBody.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */