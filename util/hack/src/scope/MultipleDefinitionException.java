/*   */ package scope;
/*   */ 
/*   */ public class MultipleDefinitionException extends ScopeException {
/*   */   public MultipleDefinitionException() {}
/*   */   
/* 6 */   public MultipleDefinitionException(String paramString) { super(paramString); }
/*   */   
/*   */   public MultipleDefinitionException(String paramString1, String paramString2) {
/* 9 */     super("Attempt to multiply define variable " + paramString1 + " in scope " + paramString2);
/*   */   }
/*   */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\scope\MultipleDefinitionException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */