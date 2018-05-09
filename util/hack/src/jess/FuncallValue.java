/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FuncallValue
/*    */   extends Value
/*    */   implements Serializable
/*    */ {
/*    */   public FuncallValue(Funcall paramFuncall)
/*    */     throws JessException
/*    */   {
/* 22 */     super(paramFuncall, 64);
/*    */   }
/*    */   
/*    */   public Value resolveValue(Context paramContext) throws JessException
/*    */   {
/* 27 */     if (paramContext == null) {
/* 28 */       throw new JessException("FuncallValue.resolveValue", "Null context for", funcallValue(paramContext).toStringWithParens());
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 33 */     return funcallValue(paramContext).execute(paramContext);
/*    */   }
/*    */   
/*    */   public final Object externalAddressValue(Context paramContext) throws JessException
/*    */   {
/* 38 */     return resolveValue(paramContext).externalAddressValue(paramContext);
/*    */   }
/*    */   
/*    */   public final Fact factValue(Context paramContext) throws JessException
/*    */   {
/* 43 */     return resolveValue(paramContext).factValue(paramContext);
/*    */   }
/*    */   
/*    */   public final ValueVector listValue(Context paramContext) throws JessException
/*    */   {
/* 48 */     return resolveValue(paramContext).listValue(paramContext);
/*    */   }
/*    */   
/*    */   public final int intValue(Context paramContext) throws JessException
/*    */   {
/* 53 */     return resolveValue(paramContext).intValue(paramContext);
/*    */   }
/*    */   
/*    */   public final double floatValue(Context paramContext) throws JessException
/*    */   {
/* 58 */     return resolveValue(paramContext).floatValue(paramContext);
/*    */   }
/*    */   
/*    */   public final double numericValue(Context paramContext) throws JessException
/*    */   {
/* 63 */     return resolveValue(paramContext).numericValue(paramContext);
/*    */   }
/*    */   
/*    */   public final String atomValue(Context paramContext) throws JessException
/*    */   {
/* 68 */     return resolveValue(paramContext).atomValue(paramContext);
/*    */   }
/*    */   
/*    */   public final String variableValue(Context paramContext) throws JessException
/*    */   {
/* 73 */     return resolveValue(paramContext).variableValue(paramContext);
/*    */   }
/*    */   
/*    */   public final String stringValue(Context paramContext) throws JessException
/*    */   {
/* 78 */     return resolveValue(paramContext).stringValue(paramContext);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\FuncallValue.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */