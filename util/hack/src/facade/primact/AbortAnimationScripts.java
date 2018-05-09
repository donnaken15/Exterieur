/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.PrimitiveAction;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AbortAnimationScripts
/*    */   extends PrimitiveAction
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 14 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 15 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/*    */     
/* 17 */     NativeAnimationInterface.abortAnimationScripts(i, j);
/* 18 */     this.completionStatus = 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\AbortAnimationScripts.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */