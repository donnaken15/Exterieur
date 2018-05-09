/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class FunctionHolder
/*    */   implements Serializable
/*    */ {
/*    */   private Userfunction m_uf;
/*    */   
/*    */   FunctionHolder(Userfunction paramUserfunction)
/*    */   {
/* 15 */     setFunction(paramUserfunction);
/*    */   }
/*    */   
/*    */   final void setFunction(Userfunction paramUserfunction) {
/* 19 */     this.m_uf = paramUserfunction;
/*    */   }
/*    */   
/*    */   final Userfunction getFunction() {
/* 23 */     return this.m_uf;
/*    */   }
/*    */   
/*    */   final Value call(Funcall paramFuncall, Context paramContext) throws JessException {
/* 27 */     Userfunction localUserfunction = this.m_uf;
/* 28 */     if (paramContext.getInAdvice())
/* 29 */       localUserfunction = stripAdvice();
/* 30 */     return localUserfunction.call(paramFuncall, paramContext);
/*    */   }
/*    */   
/*    */   final Userfunction stripAdvice()
/*    */   {
/* 35 */     Userfunction localUserfunction = this.m_uf;
/*    */     
/* 37 */     while ((localUserfunction instanceof Advice)) {
/* 38 */       localUserfunction = ((Advice)localUserfunction).getFunction();
/*    */     }
/* 40 */     return localUserfunction;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\FunctionHolder.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */