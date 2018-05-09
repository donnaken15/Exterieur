/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashMap;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Deftemplate
/*     */   implements Serializable, Visitable, Modular
/*     */ {
/*  16 */   private static Hashtable s_types = new Hashtable();
/*  17 */   private static final String[] s_typenames = { "ANY", "INTEGER", "FLOAT", "NUMBER", "ATOM", "STRING", "LEXEME", "OBJECT", "LONG" };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  23 */   private static final int[] s_typevals = { -1, 4, 32, 36, 1, 2, 3, 2048, 65536 };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  32 */   private static Deftemplate s_rootTemplate = new Deftemplate("__fact", "Parent template");
/*  33 */   private static Deftemplate s_clearTemplate = new Deftemplate("__clear", "(Implied)");
/*  34 */   private static Deftemplate s_nullTemplate = new Deftemplate("__not_or_test_CE", "(Implied)");
/*  35 */   private static Deftemplate s_initialTemplate = new Deftemplate("initial-fact", "(Implied)");
/*     */   private boolean m_backchain;
/*     */   private String m_baseName;
/*     */   
/*  39 */   static { try { for (int i = 0; i < s_typenames.length; i++) {
/*  40 */         s_types.put(s_typenames[i], new Value(s_typevals[i], 4));
/*     */       }
/*     */     }
/*     */     catch (JessException localJessException) {}
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Deftemplate getRootTemplate()
/*     */   {
/*  51 */     return s_rootTemplate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Deftemplate getInitialTemplate()
/*     */   {
/*  59 */     return s_initialTemplate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Deftemplate getClearTemplate()
/*     */   {
/*  67 */     return s_clearTemplate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static Deftemplate getNullTemplate()
/*     */   {
/*  74 */     return s_nullTemplate;
/*     */   }
/*     */   
/*     */   static void addStandardTemplates(Rete paramRete) throws JessException {
/*  78 */     paramRete.addDeftemplate(getRootTemplate());
/*  79 */     paramRete.addDeftemplate(getNullTemplate());
/*  80 */     paramRete.addDeftemplate(getClearTemplate());
/*  81 */     paramRete.addDeftemplate(getInitialTemplate());
/*     */   }
/*     */   
/*     */ 
/*     */   private final void jdMethod_this()
/*     */   {
/*  87 */     this.m_docstring = "";
/*     */     
/*  89 */     this.m_data = new ValueVector();
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  95 */     if (!(paramObject instanceof Deftemplate))
/*  96 */       return false;
/*  97 */     Deftemplate localDeftemplate = (Deftemplate)paramObject;
/*  98 */     if ((this.m_fullName.equals(localDeftemplate.m_fullName)) && (this.m_backchain == localDeftemplate.m_backchain) && (this.m_parent == localDeftemplate.m_parent) && (this.m_data.equals(localDeftemplate.m_data))) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return this.m_fullName.hashCode();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Deftemplate getParent()
/*     */   {
/* 114 */     return this.m_parent;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void forgetParent()
/*     */   {
/* 122 */     this.m_parent = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final String getName()
/*     */   {
/* 131 */     return this.m_fullName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final String getBaseName()
/*     */   {
/* 139 */     return this.m_baseName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final String getDocstring()
/*     */   {
/* 147 */     return this.m_docstring;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public final void doBackwardChaining()
/*     */   {
/* 154 */     this.m_backchain = true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final boolean getBackwardChaining()
/*     */   {
/* 162 */     return this.m_backchain;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Deftemplate(String paramString1, String paramString2, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 173 */     this(paramString1, paramString2, s_rootTemplate, paramRete);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private String m_fullName;
/*     */   
/*     */   private String m_docstring;
/*     */   
/*     */   public Deftemplate(String paramString1, String paramString2, Deftemplate paramDeftemplate, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 185 */     jdMethod_this();
/*     */     
/*     */ 
/* 188 */     int i = paramString1.indexOf("::");
/* 189 */     if (i != -1) {
/* 190 */       this.m_module = paramString1.substring(0, i);
/* 191 */       paramRete.verifyModule(this.m_module);
/* 192 */       this.m_baseName = paramString1.substring(i + 2);
/* 193 */       this.m_fullName = paramString1;
/*     */     } else {
/* 195 */       this.m_module = paramRete.getCurrentModule();
/* 196 */       this.m_baseName = paramString1;
/* 197 */       this.m_fullName = paramRete.resolveName(paramString1);
/*     */     }
/*     */     
/* 200 */     this.m_parent = paramDeftemplate;
/* 201 */     this.m_docstring = paramString2;
/*     */     
/* 203 */     for (int j = 0; j < paramDeftemplate.m_data.size(); j++) {
/* 204 */       this.m_data.add(paramDeftemplate.m_data.get(j));
/*     */     }
/* 206 */     this.m_indexes = ((HashMap)paramDeftemplate.m_indexes.clone());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private Deftemplate(String paramString1, String paramString2)
/*     */   {
/* 213 */     jdMethod_this();
/*     */     
/* 215 */     this.m_module = "MAIN";
/* 216 */     this.m_baseName = paramString1;
/* 217 */     this.m_fullName = RU.scopeName(this.m_module, this.m_baseName);
/* 218 */     this.m_docstring = paramString2;
/* 219 */     if (!paramString1.equals("__fact"))
/* 220 */       this.m_parent = s_rootTemplate;
/* 221 */     this.m_indexes = new HashMap();
/*     */   }
/*     */   
/*     */ 
/*     */   private Deftemplate m_parent;
/*     */   
/*     */   ValueVector m_data;
/*     */   
/*     */   private HashMap m_indexes;
/*     */   
/*     */   private String m_module;
/*     */   public void addSlot(String paramString1, Value paramValue, String paramString2)
/*     */     throws JessException
/*     */   {
/* 235 */     Value localValue = (Value)s_types.get(paramString2.toUpperCase());
/* 236 */     if (localValue == null) {
/* 237 */       throw new JessException("Deftemplate.addSlot", "Bad slot type:", paramString2);
/*     */     }
/*     */     
/*     */     int i;
/* 241 */     if ((i = getSlotIndex(paramString1)) != -1) {
/* 242 */       this.m_data.set(paramValue, i * 3 + 1);
/* 243 */       this.m_data.set(localValue, i * 3 + 2);
/*     */     }
/*     */     else {
/* 246 */       int j = this.m_data.size();
/* 247 */       this.m_data.setLength(j + 3);
/* 248 */       this.m_data.set(new Value(paramString1, 16384), j);
/* 249 */       this.m_data.set(paramValue, j + 1);
/* 250 */       this.m_data.set(localValue, j + 2);
/* 251 */       this.m_indexes.put(paramString1, new Integer(j / 3));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addMultiSlot(String paramString, Value paramValue)
/*     */     throws JessException
/*     */   {
/*     */     int i;
/*     */     
/*     */ 
/*     */ 
/* 266 */     if ((i = getSlotIndex(paramString)) != -1) {
/* 267 */       this.m_data.set(paramValue, absoluteIndex(i) + 1);
/* 268 */       return;
/*     */     }
/* 270 */     int j = this.m_data.size();
/* 271 */     this.m_data.setLength(j + 3);
/* 272 */     this.m_data.set(new Value(paramString, 32768), j);
/* 273 */     this.m_data.set(paramValue, j + 1);
/* 274 */     this.m_data.set((Value)s_types.get(s_typenames[0]), j + 2);
/*     */     
/* 276 */     this.m_indexes.put(paramString, new Integer(j / 3));
/*     */   }
/*     */   
/*     */   private final int absoluteIndex(int paramInt)
/*     */   {
/* 281 */     return paramInt * 3;
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
/*     */   public int getSlotDataType(int paramInt)
/*     */     throws JessException
/*     */   {
/* 295 */     return this.m_data.get(absoluteIndex(paramInt) + 2).intValue(null);
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
/*     */   public Value getSlotDefault(int paramInt)
/*     */     throws JessException
/*     */   {
/* 309 */     return this.m_data.get(absoluteIndex(paramInt) + 1);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSlotType(int paramInt)
/*     */     throws JessException
/*     */   {
/* 322 */     return this.m_data.get(absoluteIndex(paramInt)).type();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSlotIndex(String paramString)
/*     */     throws JessException
/*     */   {
/* 332 */     Integer localInteger = (Integer)this.m_indexes.get(paramString);
/* 333 */     if (localInteger == null) {
/* 334 */       return -1;
/*     */     }
/* 336 */     return localInteger.intValue();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSlotName(int paramInt)
/*     */     throws JessException
/*     */   {
/* 346 */     return this.m_data.get(absoluteIndex(paramInt)).stringValue(null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNSlots()
/*     */   {
/* 355 */     return this.m_data.size() / 3;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 363 */     return "[deftemplate " + this.m_fullName + ']';
/*     */   }
/*     */   
/*     */   public Object accept(Visitor paramVisitor) {
/* 367 */     return paramVisitor.visitDeftemplate(this);
/*     */   }
/*     */   
/*     */   public String getModule() {
/* 371 */     return this.m_module;
/*     */   }
/*     */   
/*     */   public boolean isBackwardChainingTrigger() {
/* 375 */     return this.m_baseName.startsWith("need-");
/*     */   }
/*     */   
/*     */   public String getBackchainingTemplateName() {
/* 379 */     return RU.scopeName(this.m_module, "need-" + this.m_baseName);
/*     */   }
/*     */   
/*     */   public String getNameWithoutBackchainingPrefix() {
/* 383 */     if (!isBackwardChainingTrigger()) {
/* 384 */       return this.m_fullName;
/*     */     }
/* 386 */     return RU.scopeName(this.m_module, this.m_baseName.substring("need-".length()));
/*     */   }
/*     */   
/*     */ 
/*     */   public Deftemplate getBackchainingTemplate(Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 393 */     return new Deftemplate(getBackchainingTemplateName(), "Goal seeker for " + this.m_fullName, this, paramRete);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Deftemplate.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */