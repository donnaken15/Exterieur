/*   */ package scope;
/*   */ 
/*   */ public class UndefinedVariableException extends ScopeException { public UndefinedVariableException() {}
/*   */   
/* 5 */   public UndefinedVariableException(String paramString) { super(paramString); }
/*   */   
/*   */   public UndefinedVariableException(String paramString1, String paramString2) {
/* 8 */     super("Variable " + paramString1 + " undefined in scope " + paramString2);
/*   */   }
/*   */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\scope\UndefinedVariableException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */