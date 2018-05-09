/*     */ package jess;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PrettyPrinter
/*     */   implements Visitor
/*     */ {
/*     */   private Visitable m_visitable;
/*     */   private boolean m_inTestCE;
/*     */   
/*  15 */   private final void jdMethod_this() { this.m_inTestCE = false; }
/*     */   
/*  17 */   public PrettyPrinter(Visitable paramVisitable) { jdMethod_this();
/*  18 */     this.m_visitable = paramVisitable;
/*     */   }
/*     */   
/*     */   public Object visitDeffacts(Deffacts paramDeffacts) {
/*  22 */     List localList = new List("deffacts", paramDeffacts.getName());
/*     */     
/*  24 */     if ((paramDeffacts.getDocstring() != null) && (paramDeffacts.getDocstring().length() > 0))
/*     */     {
/*  26 */       localList.addQuoted(paramDeffacts.getDocstring());
/*     */     }
/*     */     
/*  29 */     for (int i = 0; i < paramDeffacts.getNFacts(); i++) {
/*  30 */       localList.newLine();
/*  31 */       localList.add(paramDeffacts.getFact(i));
/*     */     }
/*     */     
/*  34 */     return localList.toString();
/*     */   }
/*     */   
/*     */   public Object visitDeftemplate(Deftemplate paramDeftemplate) {
/*  38 */     List localList1 = new List("deftemplate", paramDeftemplate.getName());
/*  39 */     if ((paramDeftemplate.getParent() != null) && (paramDeftemplate.getParent() != paramDeftemplate))
/*     */     {
/*  41 */       localList1.add("extends");
/*  42 */       localList1.add(paramDeftemplate.getParent().getName());
/*     */     }
/*     */     
/*  45 */     if ((paramDeftemplate.getDocstring() != null) && (paramDeftemplate.getDocstring().length() > 0))
/*     */     {
/*  47 */       localList1.addQuoted(paramDeftemplate.getDocstring());
/*     */     }
/*  49 */     for (int i = 0; i < paramDeftemplate.m_data.size(); i += 3) {
/*     */       try {
/*  51 */         Value localValue = paramDeftemplate.m_data.get(i);
/*  52 */         List localList2 = new List(localValue.type() == 16384 ? "slot" : "multislot", localValue);
/*     */         
/*  54 */         localValue = paramDeftemplate.m_data.get(i + 1);
/*  55 */         if ((!localValue.equals(Funcall.NIL)) && (!localValue.equals(Funcall.NILLIST))) {
/*  56 */           String str = localValue.type() == 64 ? "default-dynamic" : "default";
/*     */           
/*     */ 
/*     */ 
/*  60 */           localList2.add(new List(str, localValue));
/*     */         }
/*  62 */         localValue = paramDeftemplate.m_data.get(i + 2);
/*  63 */         if (localValue.intValue(null) != -1)
/*  64 */           localList2.add(new List("type", localValue));
/*  65 */         localList1.newLine();
/*  66 */         localList1.add(localList2);
/*     */       }
/*     */       catch (JessException localJessException) {
/*  69 */         localList1.add(localJessException.toString());
/*  70 */         break;
/*     */       }
/*     */     }
/*  73 */     return localList1.toString();
/*     */   }
/*     */   
/*     */   public Object visitDefglobal(Defglobal paramDefglobal) {
/*  77 */     List localList = new List("defglobal");
/*  78 */     localList.add("?" + paramDefglobal.getName());
/*  79 */     localList.add("=");
/*  80 */     localList.add(paramDefglobal.getInitializationValue());
/*  81 */     return localList.toString();
/*     */   }
/*     */   
/*     */   public Object visitDeffunction(Deffunction paramDeffunction) {
/*  85 */     List localList1 = new List("deffunction", paramDeffunction.getName());
/*  86 */     List localList2 = new List();
/*  87 */     for (Iterator localIterator = paramDeffunction.getArguments(); localIterator.hasNext();) {
/*  88 */       Deffunction.Argument localArgument = (Deffunction.Argument)localIterator.next();
/*  89 */       String str = localArgument.m_type == 8 ? "?" : "$?";
/*  90 */       localList2.add(str + localArgument.m_name);
/*     */     }
/*  92 */     localList1.add(localList2);
/*     */     
/*  94 */     if ((paramDeffunction.getDocstring() != null) && (paramDeffunction.getDocstring().length() > 0)) {
/*  95 */       localList1.addQuoted(paramDeffunction.getDocstring());
/*     */     }
/*  97 */     for (localIterator = paramDeffunction.getActions(); localIterator.hasNext();) {
/*  98 */       localList1.newLine();
/*  99 */       localList1.add(localIterator.next());
/*     */     }
/* 101 */     return localList1.toString();
/*     */   }
/*     */   
/*     */   public Object visitDefrule(Defrule paramDefrule) {
/* 105 */     List localList1 = new List("defrule");
/* 106 */     localList1.add(paramDefrule.getName());
/* 107 */     localList1.indent("  ");
/*     */     
/* 109 */     if ((paramDefrule.m_docstring != null) && (paramDefrule.m_docstring.length() > 0)) {
/* 110 */       localList1.newLine();
/* 111 */       localList1.addQuoted(paramDefrule.m_docstring);
/*     */     }
/* 113 */     int i = 0;
/* 114 */     List localList2 = new List("declare");
/*     */     try
/*     */     {
/* 117 */       if ((paramDefrule.m_salienceVal.type() != 4) || (paramDefrule.m_salienceVal.intValue(null) != 0))
/*     */       {
/*     */ 
/* 120 */         List localList3 = new List("salience");
/* 121 */         localList3.add(paramDefrule.m_salienceVal);
/* 122 */         localList2.add(localList3);
/* 123 */         i = 1;
/*     */       }
/*     */     }
/*     */     catch (JessException localJessException) {}
/*     */     
/*     */ 
/*     */ 
/* 130 */     if (paramDefrule.getAutoFocus())
/*     */     {
/* 132 */       if (i != 0) {
/* 133 */         localList2.indent("           ");
/* 134 */         localList2.newLine();
/*     */       }
/*     */       
/* 137 */       List localList4 = new List("auto-focus");
/* 138 */       localList4.add("TRUE");
/* 139 */       localList2.add(localList4);
/* 140 */       i = 1;
/*     */     }
/*     */     
/* 143 */     if (i != 0) {
/* 144 */       localList1.newLine();
/* 145 */       localList1.add(localList2);
/*     */     }
/*     */     
/* 148 */     for (int j = 0; j < paramDefrule.getGroupSize(); j++) {
/* 149 */       LHSComponent localLHSComponent = paramDefrule.getLHSComponent(j);
/* 150 */       localList1.newLine();
/* 151 */       localList1.add(((Visitable)localLHSComponent).accept(this));
/*     */     }
/* 153 */     localList1.newLine();
/* 154 */     localList1.add("=>");
/* 155 */     for (j = 0; j < paramDefrule.getNActions(); j++) {
/* 156 */       localList1.newLine();
/* 157 */       localList1.add(paramDefrule.getAction(j).toString());
/*     */     }
/*     */     
/* 160 */     return localList1.toString();
/*     */   }
/*     */   
/*     */   public Object visitGroup(Group paramGroup) {
/* 164 */     List localList = new List(paramGroup.getName());
/* 165 */     for (int i = 0; i < paramGroup.getGroupSize(); i++) {
/* 166 */       LHSComponent localLHSComponent = paramGroup.getLHSComponent(i);
/* 167 */       localList.add(((Visitable)localLHSComponent).accept(this));
/*     */     }
/* 169 */     if (paramGroup.getBoundName() != null) {
/* 170 */       return "?" + paramGroup.getBoundName() + " <- " + localList.toString();
/*     */     }
/* 172 */     return localList.toString();
/*     */   }
/*     */   
/*     */   public Object visitPattern(Pattern paramPattern) {
/* 176 */     List localList1 = new List(paramPattern.getName());
/* 177 */     Deftemplate localDeftemplate = paramPattern.getDeftemplate();
/* 178 */     this.m_inTestCE = paramPattern.getName().equals("test");
/*     */     try {
/* 180 */       for (int i = 0; i < paramPattern.getNSlots(); i++) {
/* 181 */         if (paramPattern.getNTests(i) != 0) {
/*     */           List localList2;
/* 183 */           if (localDeftemplate.getSlotName(i).equals("__data")) {
/* 184 */             localList2 = localList1;
/*     */           } else {
/* 186 */             localList2 = new List(localDeftemplate.getSlotName(i));
/*     */           }
/* 188 */           for (int j = -1; j <= paramPattern.getSlotLength(i); j++) {
/* 189 */             StringBuffer localStringBuffer = new StringBuffer();
/* 190 */             for (int k = 0; k < paramPattern.getNTests(i); k++)
/*     */             {
/* 192 */               Test1 localTest1 = paramPattern.getTest(i, k);
/* 193 */               if (localTest1.m_subIdx == j) {
/* 194 */                 if (localStringBuffer.length() > 0)
/* 195 */                   localStringBuffer.append("&");
/* 196 */                 localStringBuffer.append(localTest1.accept(this));
/*     */               }
/*     */             }
/* 199 */             if (localStringBuffer.length() > 0)
/* 200 */               localList2.add(localStringBuffer);
/*     */           }
/* 202 */           if (!localDeftemplate.getSlotName(i).equals("__data"))
/* 203 */             localList1.add(localList2);
/*     */         }
/*     */       }
/*     */     } catch (JessException localJessException) {
/* 207 */       localList1.add(localJessException.getMessage());
/*     */     }
/*     */     
/* 210 */     if (paramPattern.getBoundName() != null) {
/* 211 */       return "?" + paramPattern.getBoundName() + " <- " + localList1.toString();
/*     */     }
/* 213 */     return localList1.toString();
/*     */   }
/*     */   
/*     */   public Object visitTest1(Test1 paramTest1) {
/* 217 */     StringBuffer localStringBuffer = new StringBuffer();
/* 218 */     if (paramTest1.m_test == 1)
/* 219 */       localStringBuffer.append("~");
/* 220 */     if ((paramTest1.m_slotValue.type() == 64) && (!this.m_inTestCE)) {
/* 221 */       localStringBuffer.append(":");
/*     */     }
/* 223 */     localStringBuffer.append(paramTest1.m_slotValue);
/* 224 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   public Object visitDefquery(Defquery paramDefquery) {
/* 228 */     List localList1 = new List("defquery");
/* 229 */     localList1.add(paramDefquery.getName());
/* 230 */     localList1.indent("  ");
/*     */     
/* 232 */     if ((paramDefquery.m_docstring != null) && (paramDefquery.m_docstring.length() > 0)) {
/* 233 */       localList1.newLine();
/* 234 */       localList1.addQuoted(paramDefquery.m_docstring);
/*     */     }
/*     */     Object localObject;
/* 237 */     if ((paramDefquery.getNVariables() > 0) || (paramDefquery.getMaxBackgroundRules() > 0)) {
/* 238 */       localList1.newLine();
/* 239 */       List localList2 = new List("declare");
/* 240 */       if (paramDefquery.getNVariables() > 0) {
/* 241 */         localObject = new List("variables");
/* 242 */         for (int j = 0; j < paramDefquery.getNVariables(); j++)
/* 243 */           ((List)localObject).add(paramDefquery.getQueryVariable(j));
/* 244 */         localList2.add(localObject);
/*     */       }
/* 246 */       if (paramDefquery.getMaxBackgroundRules() > 0) {
/* 247 */         localObject = new List("max-background-rules");
/* 248 */         ((List)localObject).add(String.valueOf(paramDefquery.getMaxBackgroundRules()));
/* 249 */         localList2.add(localObject);
/*     */       }
/* 251 */       localList1.add(localList2);
/*     */     }
/*     */     
/* 254 */     for (int i = 0; i < paramDefquery.getGroupSize(); i++) {
/* 255 */       localObject = paramDefquery.getLHSComponent(i);
/* 256 */       if (((LHSComponent)localObject).getName().indexOf("__query-trigger-") == -1)
/*     */       {
/*     */ 
/* 259 */         localList1.newLine();
/* 260 */         localList1.add(((Visitable)localObject).accept(this));
/*     */       }
/*     */     }
/* 263 */     return localList1.toString();
/*     */   }
/*     */   
/*     */   public String toString() {
/* 267 */     return (String)this.m_visitable.accept(this);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\PrettyPrinter.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */