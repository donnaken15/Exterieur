/*    */ package abl.runtime;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AblRuntimeError
/*    */   extends Error
/*    */ {
/*    */   public AblRuntimeError(String paramString)
/*    */   {
/* 14 */     super(paramString);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public AblRuntimeError(String paramString, Throwable paramThrowable)
/*    */   {
/* 21 */     super(fullErrorString(paramString, paramThrowable));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public AblRuntimeError(Throwable paramThrowable)
/*    */   {
/* 28 */     super(fullErrorString("", paramThrowable));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   protected static String fullErrorString(String paramString, Throwable paramThrowable)
/*    */   {
/* 35 */     StringWriter localStringWriter = new StringWriter();
/* 36 */     PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
/* 37 */     paramThrowable.printStackTrace(localPrintWriter);
/* 38 */     return paramString + paramThrowable.getMessage() + localStringWriter;
/*    */   }
/*    */   
/*    */   public AblRuntimeError() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\AblRuntimeError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */