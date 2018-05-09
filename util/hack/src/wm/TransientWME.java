/*    */ package wm;
/*    */ 
/*  3 */ public abstract class TransientWME extends WME { public TransientWME() { jdMethod_this(); }
/*  4 */   private final void jdMethod_this() { this.marked = false; }
/*    */   
/*    */   private boolean marked;
/*  7 */   public void mark() { this.marked = true; }
/*    */   
/*  9 */   public boolean getMarked() { return this.marked; }
/*    */   
/* 11 */   public boolean isTransient() { return true; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\TransientWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */