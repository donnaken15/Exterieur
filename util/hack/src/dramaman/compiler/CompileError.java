/*    */ package dramaman.compiler;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ public class CompileError
/*    */   extends Error
/*    */ {
/*    */   public CompileError(String paramString)
/*    */   {
/* 11 */     super(paramString);
/*    */   }
/*    */   
/*    */   public CompileError(String paramString, Throwable paramThrowable) {
/* 15 */     super(fullErrorString(paramString, paramThrowable));
/*    */   }
/*    */   
/*    */   protected static String fullErrorString(String paramString, Throwable paramThrowable)
/*    */   {
/* 20 */     StringWriter localStringWriter = new StringWriter();
/* 21 */     PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
/* 22 */     paramThrowable.printStackTrace(localPrintWriter);
/* 23 */     return paramString + paramThrowable.getMessage() + localStringWriter;
/*    */   }
/*    */   
/*    */   public CompileError() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\CompileError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */