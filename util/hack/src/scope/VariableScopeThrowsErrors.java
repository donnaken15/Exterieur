/*     */ package scope;
/*     */ 
/*     */ 
/*     */ public class VariableScopeThrowsErrors
/*     */   extends VariableScope
/*     */ {
/*     */   public VariableScopeThrowsErrors(VariableScope paramVariableScope, String paramString)
/*     */   {
/*   9 */     super(paramVariableScope, paramString);
/*     */   }
/*     */   
/*     */   public void defineVariable(String paramString1, Object paramObject, String paramString2) {
/*     */     try {
/*  14 */       super.defineVariable(paramString1, paramObject, paramString2);
/*     */     } catch (MultipleDefinitionException localMultipleDefinitionException) {
/*  16 */       throw new MultipleDefinitionError(localMultipleDefinitionException);
/*     */     }
/*     */   }
/*     */   
/*     */   public String getType(String paramString) {
/*     */     try {
/*  22 */       return super.getType(paramString);
/*     */     } catch (UndefinedVariableException localUndefinedVariableException) {
/*  24 */       throw new UndefinedVariableError(localUndefinedVariableException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object getValue(String paramString)
/*     */   {
/*     */     try
/*     */     {
/* 141 */       return super.getValue(paramString);
/*     */     } catch (UndefinedVariableException localUndefinedVariableException) {
/* 143 */       throw new UndefinedVariableError(localUndefinedVariableException);
/* 144 */     } catch (TypeException localTypeException) { throw new TypeError(localTypeException);
/*     */     }
/*     */   }
/*     */   
/*     */   public Object setValue(String paramString, Object paramObject) {
/*     */     try {
/* 150 */       return super.setValue(paramString, paramObject);
/*     */     } catch (UndefinedVariableException localUndefinedVariableException) {
/* 152 */       throw new UndefinedVariableError(localUndefinedVariableException);
/* 153 */     } catch (TypeException localTypeException) { throw new TypeError(localTypeException);
/*     */     }
/*     */   }
/*     */   
/*     */   public VariableScope.Variable getVariable(String paramString) {
/*     */     try {
/* 159 */       return super.getVariable(paramString);
/*     */     } catch (UndefinedVariableException localUndefinedVariableException) {
/* 161 */       throw new UndefinedVariableError(localUndefinedVariableException);
/* 162 */     } catch (TypeException localTypeException) { throw new TypeError(localTypeException);
/*     */     }
/*     */   }
/*     */   
/*     */   public VariableScope.Variable getParentVariable(String paramString) {
/*     */     try {
/* 168 */       return super.getParentVariable(paramString);
/*     */     } catch (UndefinedVariableException localUndefinedVariableException) {
/* 170 */       throw new UndefinedVariableError(localUndefinedVariableException);
/* 171 */     } catch (TypeException localTypeException) { throw new TypeError(localTypeException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\scope\VariableScopeThrowsErrors.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */