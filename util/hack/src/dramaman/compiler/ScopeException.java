/*    */ package dramaman.compiler;
/*    */ 
/*    */ public class ScopeException extends CompileException {
/*    */   private static final String errorString = "Undeclared variable";
/*    */   
/*  6 */   public ScopeException() { super("Undeclared variable"); }
/*    */   
/*    */   public ScopeException(String paramString)
/*    */   {
/* 10 */     super("Undeclared variable: " + paramString);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ScopeException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */