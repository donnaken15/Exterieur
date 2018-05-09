/*   */ package wm;
/*   */ 
/*   */ public class WmeReflectionError extends WorkingMemoryError {
/*   */   private static final String errorString = "Error reflecting WME class";
/*   */   
/* 6 */   public WmeReflectionError() { super("Error reflecting WME class"); }
/* 7 */   public WmeReflectionError(String paramString) { super("Error reflecting WME class: " + paramString); }
/* 8 */   public WmeReflectionError(Throwable paramThrowable) { super("Error reflecting WME class", paramThrowable); }
/*   */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WmeReflectionError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */