/*    */ package facade.util;
/*    */ 
/*    */ 
/*    */ public class IntegerRef
/*    */ {
/*    */   public int i;
/*    */   
/*    */   public IntegerRef()
/*    */   {
/* 10 */     this.i = 0;
/*    */   }
/*    */   
/*    */   public IntegerRef(int paramInt)
/*    */   {
/* 15 */     this.i = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized int getI() {
/* 19 */     return this.i;
/*    */   }
/*    */   
/* 22 */   public synchronized void setI(int paramInt) { this.i = paramInt; }
/* 23 */   public synchronized boolean bSetI(int paramInt) { this.i = paramInt;return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\IntegerRef.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */