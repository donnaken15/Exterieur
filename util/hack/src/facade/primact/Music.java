/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.PrimitiveAction;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ 
/*    */ public class Music
/*    */   extends PrimitiveAction
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 11 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 12 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/*    */     
/* 14 */     NativeAnimationInterface.music(i, j);
/* 15 */     this.completionStatus = 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\Music.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */