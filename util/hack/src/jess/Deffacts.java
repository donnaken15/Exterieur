/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Deffacts
/*     */   implements Serializable, Visitable
/*     */ {
/*     */   private String m_name;
/*     */   private String m_module;
/*     */   private ArrayList m_facts;
/*     */   private String m_docstring;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  19 */     this.m_docstring = "";
/*     */   }
/*     */   
/*     */ 
/*     */   public final String getName()
/*     */   {
/*  25 */     return this.m_name;
/*     */   }
/*     */   
/*     */ 
/*     */   public final String getModule()
/*     */   {
/*  31 */     return this.m_module;
/*     */   }
/*     */   
/*     */ 
/*     */   public final String getDocstring()
/*     */   {
/*  37 */     return this.m_docstring;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Deffacts(String paramString1, String paramString2, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*  46 */     jdMethod_this();
/*     */     
/*  48 */     int i = paramString1.indexOf("::");
/*  49 */     if (i != -1) {
/*  50 */       this.m_module = paramString1.substring(0, i);
/*  51 */       paramRete.verifyModule(this.m_module);
/*  52 */       this.m_name = paramString1;
/*     */     } else {
/*  54 */       this.m_module = paramRete.getCurrentModule();
/*  55 */       this.m_name = paramRete.resolveName(paramString1);
/*     */     }
/*     */     
/*  58 */     this.m_facts = new ArrayList();
/*  59 */     this.m_docstring = paramString2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addFact(Fact paramFact)
/*     */   {
/*  68 */     this.m_facts.add(paramFact);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNFacts()
/*     */   {
/*  76 */     return this.m_facts.size();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Fact getFact(int paramInt)
/*     */   {
/*  85 */     return (Fact)this.m_facts.get(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   public void reset(Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     try
/*     */     {
/*  94 */       Context localContext = paramRete.getGlobalContext();
/*  95 */       for (int i = 0; i < this.m_facts.size(); i++) {
/*  96 */         Fact localFact = (Fact)this.m_facts.get(i);
/*  97 */         localFact = localFact.expand(localContext);
/*  98 */         paramRete.assertFact(localFact, paramRete.getGlobalContext());
/*     */       }
/*     */     } catch (JessException localJessException) {
/* 101 */       localJessException.addContext("assert from deffacts " + this.m_name);
/* 102 */       throw localJessException;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 112 */     return "[deffacts " + this.m_name + ']';
/*     */   }
/*     */   
/*     */   public Object accept(Visitor paramVisitor) {
/* 116 */     return paramVisitor.visitDeffacts(this);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Deffacts.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */