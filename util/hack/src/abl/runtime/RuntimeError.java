/*    */ package abl.runtime;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ public class RuntimeError extends Error
/*    */ {
/*    */   public RuntimeError(String paramString)
/*    */   {
/* 10 */     super(paramString);
/*    */   }
/*    */   
/*    */   public RuntimeError(String paramString, Throwable paramThrowable) {
/* 14 */     super(fullErrorString(paramString, paramThrowable));
/*    */   }
/*    */   
/*    */   protected static String fullErrorString(String paramString, Throwable paramThrowable)
/*    */   {
/* 19 */     StringWriter localStringWriter = new StringWriter();
/* 20 */     PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
/* 21 */     paramThrowable.printStackTrace(localPrintWriter);
/* 22 */     return paramString + paramThrowable.getMessage() + localStringWriter;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\RuntimeError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */