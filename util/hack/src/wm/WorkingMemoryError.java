/*    */ package wm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class WorkingMemoryError extends Error {
/*    */   private Throwable t;
/*    */   
/*  8 */   private final void jdMethod_this() { this.t = null; }
/*    */   
/* 10 */   public WorkingMemoryError() { jdMethod_this(); }
/* 11 */   public WorkingMemoryError(String paramString) { super(paramString);jdMethod_this(); }
/*    */   
/* 13 */   public WorkingMemoryError(String paramString, Throwable paramThrowable) { super(paramString);jdMethod_this();
/* 14 */     this.t = paramThrowable;
/*    */   }
/*    */   
/*    */   public void printStackTrace()
/*    */   {
/* 19 */     if (this.t != null) {
/* 20 */       System.err.println(getMessage());
/* 21 */       this.t.printStackTrace();
/*    */     }
/*    */     else {
/* 24 */       super.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public void printStackTrace(PrintStream paramPrintStream) {
/* 29 */     if (this.t != null) {
/* 30 */       paramPrintStream.println(getMessage());
/* 31 */       this.t.printStackTrace(paramPrintStream);
/*    */     }
/*    */     else {
/* 34 */       super.printStackTrace(paramPrintStream);
/*    */     }
/*    */   }
/*    */   
/*    */   public void printStackTrace(java.io.PrintWriter paramPrintWriter) {
/* 39 */     if (this.t != null) {
/* 40 */       paramPrintWriter.println(getMessage());
/* 41 */       this.t.printStackTrace(paramPrintWriter);
/*    */     }
/*    */     else {
/* 44 */       super.printStackTrace(paramPrintWriter);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */