/*    */ package facade.util;
/*    */ 
/*    */ 
/*    */ public class BooleanRef
/*    */ {
/*    */   public boolean b;
/*    */   
/*    */   public BooleanRef()
/*    */   {
/* 10 */     this.b = false;
/*    */   }
/*    */   
/*    */   public BooleanRef(boolean paramBoolean)
/*    */   {
/* 15 */     this.b = paramBoolean;
/*    */   }
/*    */   
/*    */   public synchronized boolean getB() {
/* 19 */     return this.b;
/*    */   }
/*    */   
/* 22 */   public synchronized void setB(boolean paramBoolean) { this.b = paramBoolean; }
/* 23 */   public synchronized boolean bSetB(boolean paramBoolean) { this.b = paramBoolean;return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\BooleanRef.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */