/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.PrimitiveAction;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SetGazeTracking
/*    */   extends PrimitiveAction
/*    */   implements SpriteID
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.SetGazeTracking;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 17 */     if ((!$noassert) && (paramArrayOfObject.length != 5) && (paramArrayOfObject.length != 7)) { throw new AssertionError();
/*    */     }
/* 19 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     
/* 21 */     float f1 = 0.0F;
/* 22 */     float f2 = 0.0F;
/* 23 */     float f3 = 0.0F;
/*    */     int j;
/*    */     int k;
/*    */     int m;
/*    */     int n;
/* 28 */     if (paramArrayOfObject.length == 5) {
/* 29 */       j = ((Integer)paramArrayOfObject[1]).intValue();
/* 30 */       k = ((Integer)paramArrayOfObject[2]).intValue();
/* 31 */       m = ((Integer)paramArrayOfObject[3]).intValue();
/* 32 */       n = ((Integer)paramArrayOfObject[4]).intValue();
/*    */     }
/*    */     else {
/* 35 */       j = -1;
/* 36 */       f1 = ((Float)paramArrayOfObject[1]).floatValue();
/* 37 */       f2 = ((Float)paramArrayOfObject[2]).floatValue();
/* 38 */       f3 = ((Float)paramArrayOfObject[3]).floatValue();
/* 39 */       k = ((Integer)paramArrayOfObject[4]).intValue();
/* 40 */       m = ((Integer)paramArrayOfObject[5]).intValue();
/* 41 */       n = ((Integer)paramArrayOfObject[6]).intValue();
/*    */     }
/*    */     
/* 44 */     NativeAnimationInterface.setGazeTracking(i, j, f1, f2, f3, k, m, n);
/*    */     
/* 46 */     this.completionStatus = 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\SetGazeTracking.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */