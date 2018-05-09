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
/*     */ class BeforeAdvice
/*     */   implements Advice
/*     */ {
/*     */   private Userfunction m_uf;
/*     */   private ArrayList m_actions;
/*     */   
/* 108 */   private final void jdMethod_this() { this.m_actions = new ArrayList(3); }
/*     */   
/* 110 */   BeforeAdvice(Userfunction paramUserfunction) { jdMethod_this();this.m_uf = paramUserfunction; }
/*     */   
/* 112 */   public Userfunction getFunction() { return this.m_uf; }
/*     */   
/* 114 */   public void addAction(Value paramValue) { this.m_actions.add(paramValue); }
/*     */   
/* 116 */   public String getName() { return this.m_uf.getName(); }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException
/*     */   {
/* 120 */     boolean bool = paramContext.getInAdvice();
/*     */     try
/*     */     {
/* 123 */       paramContext.setInAdvice(true);
/* 124 */       paramContext.setVariable("argv", new Value(paramValueVector, 512));
/*     */       
/* 126 */       Value localValue2 = null;
/* 127 */       for (int i = 0; i < this.m_actions.size(); i++)
/* 128 */         localValue2 = ((Value)this.m_actions.get(i)).resolveValue(paramContext);
/*     */       Value localValue1;
/* 130 */       if (paramContext.returning())
/*     */       {
/* 132 */         paramContext.clearReturnValue();
/* 133 */         return localValue2;
/*     */       }
/*     */       
/* 136 */       paramValueVector = paramContext.getVariable("argv").listValue(paramContext);
/* 137 */       return this.m_uf.call(paramValueVector, paramContext);
/*     */     }
/*     */     catch (JessException localJessException)
/*     */     {
/* 141 */       localJessException.addContext("advice");
/* 142 */       throw localJessException;
/*     */     }
/*     */     finally
/*     */     {
/* 146 */       paramContext.setInAdvice(bool);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\BeforeAdvice.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */