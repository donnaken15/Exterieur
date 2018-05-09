/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ public class Variable
/*     */   extends Value
/*     */   implements Serializable
/*     */ {
/*     */   public Variable(String paramString, int paramInt)
/*     */     throws JessException
/*     */   {
/*  23 */     super(paramString, paramInt);
/*  24 */     if ((paramString.indexOf("?") != -1) || (paramString.indexOf("$") != -1)) {
/*  25 */       throw new JessException("Variable.Variable", "Variable name cannot contain '?' or '$'", paramString);
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
/*     */   public Value resolveValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  40 */     if (paramContext == null) {
/*  41 */       throw new JessException("Variable.resolveValue", "Null context for", variableValue(paramContext));
/*     */     }
/*     */     
/*     */ 
/*  45 */     return paramContext.getVariable(variableValue(paramContext));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Object externalAddressValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  54 */     return resolveValue(paramContext).externalAddressValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Fact factValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  63 */     return resolveValue(paramContext).factValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final ValueVector listValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  72 */     return resolveValue(paramContext).listValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final int intValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  81 */     return resolveValue(paramContext).intValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final double floatValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  90 */     return resolveValue(paramContext).floatValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final double numericValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  99 */     return resolveValue(paramContext).numericValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final String atomValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 108 */     return resolveValue(paramContext).atomValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final String variableValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 117 */     return super.stringValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final String stringValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 126 */     return resolveValue(paramContext).stringValue(paramContext);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Variable.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */