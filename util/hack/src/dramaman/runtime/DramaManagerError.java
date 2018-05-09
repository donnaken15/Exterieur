/*    */ package dramaman.runtime;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class DramaManagerError extends Error {
/*  6 */   public DramaManagerError(String paramString) { super(paramString); }
/*  7 */   public DramaManagerError(Throwable paramThrowable) { super(fullErrorString("", paramThrowable)); }
/*    */   
/*    */   protected static String fullErrorString(String paramString, Throwable paramThrowable) {
/* 10 */     java.io.StringWriter localStringWriter = new java.io.StringWriter();
/* 11 */     PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
/* 12 */     paramThrowable.printStackTrace(localPrintWriter);
/* 13 */     return paramString + paramThrowable.getMessage() + localStringWriter;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\DramaManagerError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */