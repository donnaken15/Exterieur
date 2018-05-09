/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public class RefCountRete extends jess.Rete { private int sharedRuleRefs;
/*     */   private int uniqueRules;
/*     */   private int redefinedRules;
/*     */   
/*   9 */   private final void jdMethod_this() { this.sharedRuleRefs = 0;
/*  10 */     this.uniqueRules = 0;
/*  11 */     this.redefinedRules = 0;
/*     */     
/*  13 */     this.ruletable = new Hashtable(15000);
/*  14 */     this.facttable = new Hashtable(4000);
/*     */   }
/*     */   
/*  17 */   public RefCountRete() { jdMethod_this();
/*  18 */     addJessListener(new FactTableListener());
/*     */   }
/*     */   
/*  21 */   public int getSharedRuleRefs() { return this.sharedRuleRefs; }
/*  22 */   public int getUniqueRules() { return this.uniqueRules; }
/*  23 */   public int getRedefinedRules() { return this.redefinedRules; }
/*     */   
/*     */   void printSharedRuleKeys() {
/*  26 */     java.util.Enumeration localEnumeration = this.ruletable.keys();
/*  27 */     while (localEnumeration.hasMoreElements()) {
/*  28 */       System.out.println(localEnumeration.nextElement());
/*     */     }
/*     */   }
/*     */   
/*     */   private final void addFactToTable(jess.Fact paramFact) throws jess.JessException {
/*  33 */     if (findFactByFact(paramFact) == null)
/*     */     {
/*  35 */       String str = paramFact.getName();
/*  36 */       int i = str.indexOf(":") + 2;
/*  37 */       str = str.substring(i, str.length());
/*  38 */       Object localObject = (java.util.List)this.facttable.get(str);
/*     */       
/*  40 */       if (localObject == null) {
/*  41 */         localObject = new java.util.LinkedList();
/*  42 */         ((java.util.List)localObject).add(paramFact);
/*  43 */         this.facttable.put(str, localObject);
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  50 */         ((java.util.List)localObject).add(paramFact);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private Hashtable ruletable;
/*     */   
/*     */ 
/*     */   private Hashtable facttable;
/*     */   
/*     */ 
/*     */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.RefCountRete;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   private final void removeFactFromTable(jess.Fact paramFact)
/*     */     throws jess.JessException
/*     */   {
/*  68 */     if (findFactByFact(paramFact) != null)
/*     */     {
/*  70 */       String str = paramFact.getName();
/*  71 */       int i = str.indexOf(":") + 2;
/*  72 */       str = str.substring(i, str.length());
/*  73 */       java.util.List localList = (java.util.List)this.facttable.get(str);
/*  74 */       if ((!$noassert) && (localList == null)) { throw new AssertionError("factList == null, name == " + str);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       if ((!$noassert) && (!localList.contains(paramFact))) throw new AssertionError("!factList.contains(f), name == " + str);
/*  84 */       localList.remove(paramFact);
/*  85 */       if (localList.size() == 0)
/*     */       {
/*  87 */         this.facttable.remove(str);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   class FactTableListener
/*     */     implements jess.JessListener
/*     */   {
/*     */     public void eventHappened(jess.JessEvent paramJessEvent)
/*     */       throws jess.JessException
/*     */     {
/*  98 */       int i = paramJessEvent.getType();
/*  99 */       if ((i & 0x10) != 0)
/*     */       {
/* 101 */         jess.Fact localFact = (jess.Fact)paramJessEvent.getObject();
/*     */         
/* 103 */         if (!localFact.getName().equals("MAIN::anaphoricRef"))
/*     */         {
/* 105 */           if ((i & 0x80000000) == 0)
/*     */           {
/* 107 */             RefCountRete.this.addFactToTable(localFact);
/*     */           }
/* 109 */           else if ((i & 0x80000000) != 0)
/*     */           {
/* 111 */             RefCountRete.this.removeFactFromTable(localFact);
/*     */           }
/*     */         }
/*     */       }
/* 115 */       if ((i & 0x1000) != 0)
/*     */       {
/* 117 */         RefCountRete.this.facttable.clear(); }
/*     */     }
/*     */     
/*     */     public FactTableListener() {}
/*     */   }
/*     */   
/*     */   public jess.Value executeCommands(String paramString) throws jess.JessException {
/* 124 */     java.io.StringReader localStringReader = new java.io.StringReader(paramString);
/* 125 */     jess.Jesp localJesp = new jess.Jesp(localStringReader, this);
/* 126 */     return localJesp.parse(false);
/*     */   }
/*     */   
/*     */   jess.Value defineRule(String paramString1, int paramInt, String paramString2) throws jess.JessException {
/*     */     Integer localInteger;
/* 131 */     if (this.ruletable.containsKey(paramString1)) {
/* 132 */       this.sharedRuleRefs += 1;
/* 133 */       localInteger = (Integer)this.ruletable.get(paramString1);
/* 134 */       localInteger = new Integer(localInteger.intValue() + 1);
/* 135 */       this.ruletable.put(paramString1, localInteger);
/* 136 */       jess.Defrule localDefrule = (jess.Defrule)findDefrule(paramString1);
/* 137 */       if ((!$noassert) && (localDefrule == null)) throw new AssertionError();
/* 138 */       if (paramInt > localDefrule.getSalience()) {
/* 139 */         this.redefinedRules += 1;
/* 140 */         unDefrule(paramString1);
/* 141 */         executeCommand("(defrule " + paramString1 + paramString2 + ')');
/*     */       }
/*     */     }
/*     */     else {
/* 145 */       this.uniqueRules += 1;
/* 146 */       localInteger = new Integer(1);
/* 147 */       this.ruletable.put(paramString1, localInteger);
/* 148 */       executeCommand("(defrule " + paramString1 + paramString2 + ')');
/*     */     }
/* 150 */     return new jess.Value("TRUE", 1);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void conditionalRetract(String paramString, int paramInt1, int paramInt2)
/*     */   {
/*     */     try
/*     */     {
/* 161 */       java.util.List localList = (java.util.List)this.facttable.get(paramString);
/* 162 */       if (localList == null)
/* 163 */         return;
/* 164 */       java.util.Vector localVector = new java.util.Vector(localList);
/* 165 */       jess.Context localContext = getGlobalContext();
/* 166 */       java.util.Iterator localIterator = localVector.iterator();
/* 167 */       while (localIterator.hasNext()) {
/* 168 */         jess.Fact localFact = (jess.Fact)localIterator.next();
/*     */         
/* 170 */         jess.ValueVector localValueVector = localFact.get(0).listValue(localContext);
/* 171 */         String str1 = localValueVector.get(0).stringValue(localContext);
/*     */         int i;
/* 173 */         if (str1.equals("any")) {
/* 174 */           i = Integer.MAX_VALUE;
/*     */         } else
/* 176 */           i = localValueVector.get(0).intValue(localContext);
/* 177 */         String str2 = localValueVector.get(1).stringValue(localContext);
/*     */         int j;
/* 179 */         if (str2.equals("any")) {
/* 180 */           j = Integer.MIN_VALUE;
/*     */         } else
/* 182 */           j = localValueVector.get(1).intValue(localContext);
/* 183 */         if ((i >= paramInt1) && (j <= paramInt2)) {
/* 184 */           super.retract(localFact);
/*     */         }
/*     */       }
/*     */     } catch (jess.JessException localJessException) {
/* 188 */       JessExceptionHelper.processJessException(localJessException);
/*     */     }
/*     */   }
/*     */   
/*     */   public jess.Value getHashValue(String paramString) throws jess.JessException
/*     */   {
/* 194 */     if (this.ruletable.containsKey(paramString))
/*     */     {
/* 196 */       Integer localInteger = (Integer)this.ruletable.get(paramString);
/* 197 */       System.out.println(localInteger);
/* 198 */       return new jess.Value("TRUE", 1);
/*     */     }
/* 200 */     return new jess.Value("FALSE", 1);
/*     */   }
/*     */   
/*     */   public jess.Value undefineRule(jess.ValueVector paramValueVector, jess.Context paramContext) throws jess.JessException
/*     */   {
/* 205 */     String str = new String();
/* 206 */     int i = paramValueVector.size();
/*     */     
/* 208 */     for (int j = 1; j < i; j++) {
/* 209 */       str = paramValueVector.get(j).stringValue(paramContext);
/* 210 */       if (this.ruletable.containsKey(str)) {
/* 211 */         Integer localInteger = (Integer)this.ruletable.get(str);
/* 212 */         if (localInteger.intValue() == 1) {
/* 213 */           this.ruletable.remove(str);
/* 214 */           executeCommand("(undefrule " + str + ')');
/*     */         }
/*     */         else {
/* 217 */           localInteger = new Integer(localInteger.intValue() - 1);
/* 218 */           this.ruletable.put(str, localInteger);
/*     */         }
/*     */       }
/*     */     }
/* 222 */     return new jess.Value("FALSE", 1);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\RefCountRete.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */