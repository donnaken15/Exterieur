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
/*     */ class Defadvice
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   static final String BEFORE = "before";
/*     */   static final String AFTER = "after";
/*     */   static final String ADVICE = "defadvice";
/*     */   static final String UNADVICE = "undefadvice";
/*     */   private String m_name;
/*     */   
/*  22 */   public String getName() { return this.m_name; }
/*     */   
/*  24 */   Defadvice(String paramString) { this.m_name = paramString; }
/*     */   
/*     */   private final ValueVector functionList(Value paramValue, Rete paramRete) throws JessException
/*     */   {
/*  28 */     switch (paramValue.type())
/*     */     {
/*     */     case 512: 
/*  31 */       return paramValue.listValue(null);
/*     */     case 1: 
/*  33 */       if (paramValue.equals("ALL"))
/*  34 */         return paramRete.executeCommand("(list-function$)").listValue(null);
/*     */       break;
/*     */     }
/*  37 */     ValueVector localValueVector = new ValueVector();
/*  38 */     localValueVector.add(paramValue);
/*  39 */     return localValueVector;
/*     */   }
/*     */   
/*     */ 
/*     */   public Value call(ValueVector paramValueVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  46 */     Rete localRete = paramContext.getEngine();
/*  47 */     Object localObject1; Object localObject2; if (this.m_name.equals("defadvice"))
/*     */     {
/*  49 */       localObject1 = paramValueVector.get(1).stringValue(paramContext);
/*  50 */       ValueVector localValueVector = functionList(paramValueVector.get(2).resolveValue(paramContext), localRete);
/*     */       
/*     */ 
/*  53 */       for (int j = 0; j < localValueVector.size(); j++)
/*     */       {
/*  55 */         localObject2 = localRete.findFunctionHolder(localValueVector.get(j).atomValue(paramContext));
/*     */         
/*     */ 
/*  58 */         if (localObject2 == null) {
/*  59 */           throw new JessException("Defadvice.call", "Cannot advice a function before defining it", this.m_name);
/*     */         }
/*     */         
/*  62 */         Userfunction localUserfunction = ((FunctionHolder)localObject2).stripAdvice();
/*     */         
/*  64 */         if (localUserfunction == null) {
/*  65 */           throw new JessException("Defadvice.call", "Cannot advice a function before defining it", this.m_name);
/*     */         }
/*     */         
/*  68 */         AfterAdvice localAfterAdvice = ((String)localObject1).equals("before") ? new BeforeAdvice(localUserfunction) : new AfterAdvice(localUserfunction);
/*     */         
/*     */ 
/*  71 */         for (int k = 3; k < paramValueVector.size(); k++) {
/*  72 */           localAfterAdvice.addAction(paramValueVector.get(k));
/*     */         }
/*  74 */         localRete.addUserfunction(localAfterAdvice);
/*     */       }
/*     */       
/*     */     }
/*     */     else
/*     */     {
/*  80 */       localObject1 = functionList(paramValueVector.get(1).resolveValue(paramContext), localRete);
/*  81 */       for (int i = 0; i < ((ValueVector)localObject1).size(); i++)
/*     */       {
/*     */ 
/*  84 */         FunctionHolder localFunctionHolder = localRete.findFunctionHolder(((ValueVector)localObject1).get(i).atomValue(paramContext));
/*     */         
/*     */ 
/*  87 */         if (localFunctionHolder == null) {
/*  88 */           throw new JessException("Defadvice.call", "Cannot advice a function before defining it", this.m_name);
/*     */         }
/*     */         
/*  91 */         localObject2 = localFunctionHolder.stripAdvice();
/*     */         
/*  93 */         if (localObject2 == null) {
/*  94 */           throw new JessException("Defadvice.call", "Cannot advice a function before defining it", this.m_name);
/*     */         }
/*     */         
/*  97 */         localRete.addUserfunction((Userfunction)localObject2);
/*     */       }
/*     */     }
/* 100 */     return Funcall.TRUE;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Defadvice.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */