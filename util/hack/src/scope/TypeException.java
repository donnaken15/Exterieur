/*   */ package scope;
/*   */ 
/*   */ public class TypeException extends ScopeException { public TypeException() {}
/*   */   
/* 5 */   public TypeException(String paramString) { super(paramString); }
/*   */   
/*   */   public TypeException(String paramString1, String paramString2, String paramString3, String paramString4) {
/* 8 */     super("Attempt to treat variable " + paramString1 + " of type " + paramString3 + " as type " + paramString4 + " in scope " + paramString2);
/*   */   }
/*   */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\scope\TypeException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */