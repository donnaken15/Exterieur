/*     */ package jess;
/*     */ 
/*     */ import java.util.ArrayList;
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
/*     */ class AfterAdvice
/*     */   implements Advice
/*     */ {
/*     */   private Userfunction m_uf;
/*     */   private ArrayList m_actions;
/*     */   
/* 155 */   private final void jdMethod_this() { this.m_actions = new ArrayList(3); }
/*     */   
/*     */   AfterAdvice(Userfunction paramUserfunction) {
/* 158 */     jdMethod_this();
/* 159 */     this.m_uf = paramUserfunction;
/*     */   }
/*     */   
/* 162 */   public Userfunction getFunction() { return this.m_uf; }
/*     */   
/* 164 */   public void addAction(Value paramValue) { this.m_actions.add(paramValue); }
/*     */   
/* 166 */   public String getName() { return this.m_uf.getName(); }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException
/*     */   {
/* 170 */     boolean bool = paramContext.getInAdvice();
/*     */     try
/*     */     {
/* 173 */       paramContext.setInAdvice(true);
/* 174 */       Value localValue2 = this.m_uf.call(paramValueVector, paramContext);
/*     */       
/* 176 */       paramContext.setVariable("retval", localValue2);
/*     */       
/* 178 */       Value localValue3 = null;
/* 179 */       for (int i = 0; i < this.m_actions.size(); i++)
/* 180 */         localValue3 = ((Value)this.m_actions.get(i)).resolveValue(paramContext);
/*     */       Value localValue1;
/* 182 */       if (paramContext.returning())
/*     */       {
/* 184 */         paramContext.clearReturnValue();
/* 185 */         return localValue3;
/*     */       }
/*     */       
/* 188 */       return localValue2;
/*     */     }
/*     */     catch (JessException localJessException)
/*     */     {
/* 192 */       localJessException.addContext("advice");
/* 193 */       throw localJessException;
/*     */     }
/*     */     finally
/*     */     {
/* 197 */       paramContext.setInAdvice(bool);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\AfterAdvice.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */