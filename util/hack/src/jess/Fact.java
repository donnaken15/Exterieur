/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ public class Fact extends ValueVector implements Serializable, Modular
/*     */ {
/*     */   public static final int NO = 0;
/*     */   public static final int DYNAMIC = 1;
/*     */   public static final int STATIC = 2;
/*     */   private static Fact s_nullFact;
/*     */   private static Fact s_initialFact;
/*     */   private static Fact s_clearFact;
/*     */   
/*     */   private final void jdMethod_this() {
/*  15 */     this.m_id = -1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Fact getIcon()
/*     */   {
/*  24 */     return this.m_icon;
/*     */   }
/*     */   
/*     */   void setIcon(Fact paramFact) {
/*  28 */     this.m_icon = paramFact;
/*     */   }
/*     */   
/*     */   static
/*     */   {
/*     */     try
/*     */     {
/*  35 */       s_nullFact = new Fact(Deftemplate.getNullTemplate());
/*  36 */       s_clearFact = new Fact(Deftemplate.getClearTemplate());
/*  37 */       s_initialFact = new Fact(Deftemplate.getInitialTemplate());
/*     */     }
/*     */     catch (JessException localJessException) {}
/*     */   }
/*     */   
/*     */ 
/*     */   static Fact getNullFact()
/*     */   {
/*  45 */     return s_nullFact;
/*     */   }
/*     */   
/*     */   static Fact getInitialFact() {
/*  49 */     return (Fact)s_initialFact.clone();
/*     */   }
/*     */   
/*     */   static Fact getClearFact() {
/*  53 */     return s_clearFact;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  57 */     return this.m_name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getFactId()
/*     */   {
/*  65 */     return this.m_id;
/*     */   }
/*     */   
/*     */   void setFactId(int paramInt) {
/*  69 */     this.m_id = paramInt;
/*     */   }
/*     */   
/*     */   void setShadowMode(int paramInt) {
/*  73 */     this.m_shadow = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isShadow()
/*     */   {
/*  81 */     if (this.m_shadow > 0) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getShadowMode()
/*     */   {
/*  89 */     return this.m_shadow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Deftemplate getDeftemplate()
/*     */   {
/*  98 */     return this.m_deft;
/*     */   }
/*     */   
/*     */   public final String getModule() {
/* 102 */     return this.m_deft.getModule();
/*     */   }
/*     */   
/*     */   public int getTime() {
/* 106 */     return this.m_time;
/*     */   }
/*     */   
/*     */   void updateTime(int paramInt) {
/* 110 */     this.m_time = paramInt;
/*     */   }
/*     */   
/*     */   public Value get(int paramInt) throws JessException {
/* 114 */     if (paramInt == -1) {
/* 115 */       return new FactIDValue(this);
/*     */     }
/* 117 */     return super.get(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Fact(Deftemplate paramDeftemplate)
/*     */     throws JessException
/*     */   {
/* 128 */     jdMethod_this();
/* 129 */     this.m_deft = paramDeftemplate;
/* 130 */     createNewFact();
/* 131 */     this.m_time = 0;
/* 132 */     this.m_icon = this;
/*     */   }
/*     */   
/*     */   private int m_id;
/*     */   private Deftemplate m_deft;
/*     */   private int m_shadow;
/*     */   private String m_name;
/*     */   private Fact m_icon;
/*     */   private int m_time;
/*     */   public Fact(String paramString, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 144 */     jdMethod_this();
/* 145 */     if ((paramString.equals("not")) || (paramString.equals("test")) || (paramString.equals("explicit"))) {
/* 146 */       throw new JessException("Fact.Fact", "Illegal fact name:", paramString);
/*     */     }
/*     */     
/*     */ 
/* 150 */     this.m_deft = paramRete.createDeftemplate(paramString);
/* 151 */     createNewFact();
/* 152 */     this.m_time = paramRete.getTime();
/* 153 */     this.m_icon = this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Fact(Fact paramFact)
/*     */     throws JessException
/*     */   {
/* 162 */     jdMethod_this();
/* 163 */     this.m_name = paramFact.m_name;
/* 164 */     this.m_deft = paramFact.m_deft;
/* 165 */     setLength(paramFact.size());
/* 166 */     for (int i = 0; i < size(); i++)
/* 167 */       set(paramFact.get(i), i);
/* 168 */     this.m_time = paramFact.m_time;
/* 169 */     this.m_id = paramFact.m_id;
/* 170 */     this.m_icon = this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object clone()
/*     */   {
/*     */     try
/*     */     {
/* 180 */       return new Fact(this);
/*     */     }
/*     */     catch (JessException localJessException) {}
/* 183 */     return null;
/*     */   }
/*     */   
/*     */   private final void createNewFact() throws JessException
/*     */   {
/* 188 */     int i = this.m_deft.getNSlots();
/* 189 */     setLength(i);
/* 190 */     this.m_name = this.m_deft.getName();
/* 191 */     this.m_shadow = 0;
/*     */     
/* 193 */     for (int j = 0; j < i; j++)
/* 194 */       set(this.m_deft.getSlotDefault(j), j);
/*     */   }
/*     */   
/*     */   private final int findSlot(String paramString) throws JessException {
/* 198 */     int i = this.m_deft.getSlotIndex(paramString);
/* 199 */     if (i == -1) {
/* 200 */       throw new JessException("Fact.findSlot", "No slot " + paramString + " in deftemplate ", this.m_deft.getName());
/*     */     }
/*     */     
/* 203 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Value getSlotValue(String paramString)
/*     */     throws JessException
/*     */   {
/* 213 */     return get(findSlot(paramString));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final void setSlotValue(String paramString, Value paramValue)
/*     */     throws JessException
/*     */   {
/* 224 */     set(paramValue, findSlot(paramString));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   Fact expand(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 234 */     Fact localFact = (Fact)clone();
/* 235 */     for (int i = 0; i < localFact.size(); i++) {
/* 236 */       Value localValue1 = localFact.get(i).resolveValue(paramContext);
/* 237 */       if (localValue1.type() == 512) {
/* 238 */         ValueVector localValueVector1 = new ValueVector();
/* 239 */         ValueVector localValueVector2 = localValue1.listValue(paramContext);
/* 240 */         for (int j = 0; j < localValueVector2.size(); j++) {
/* 241 */           Value localValue2 = localValueVector2.get(j).resolveValue(paramContext);
/* 242 */           if (localValue2.type() == 512) {
/* 243 */             ValueVector localValueVector3 = localValue2.listValue(paramContext);
/* 244 */             for (int k = 0; k < localValueVector3.size(); k++) {
/* 245 */               localValueVector1.add(localValueVector3.get(k).resolveValue(paramContext));
/*     */             }
/*     */           } else {
/* 248 */             localValueVector1.add(localValue2);
/*     */           } }
/* 250 */         localValue1 = new Value(localValueVector1, 512);
/*     */       }
/* 252 */       localFact.set(localValue1, i);
/*     */     }
/* 254 */     return localFact;
/*     */   }
/*     */   
/*     */   List toList()
/*     */   {
/*     */     try {
/* 260 */       List localList = new List(this.m_name);
/*     */       
/* 262 */       int i = size();
/*     */       
/* 264 */       if ((i == 1) && (this.m_deft.getSlotName(0).equals("__data")))
/*     */       {
/* 266 */         if (get(0).type() != 512) {
/* 267 */           localList.add(get(0));
/* 268 */           return localList; }
/* 269 */         if (get(0).listValue(null).size() == 0) {
/* 270 */           return localList;
/*     */         }
/*     */         
/* 273 */         localList.add(get(0));
/* 274 */         return localList;
/*     */       }
/*     */       
/*     */ 
/* 278 */       for (int j = 0; j < i; j++) {
/* 279 */         localList.add(new List(this.m_deft.getSlotName(j), get(j)));
/*     */       }
/* 281 */       return localList;
/*     */     } catch (JessException localJessException) {
/* 283 */       return new List(localJessException.toString());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 294 */     return toList().toString();
/*     */   }
/*     */   
/*     */   public String toStringWithParens() {
/* 298 */     return toList().toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 307 */     if (paramObject == this) {
/* 308 */       return true;
/*     */     }
/* 310 */     if (!(paramObject instanceof Fact)) {
/* 311 */       return false;
/*     */     }
/* 313 */     Fact localFact = (Fact)paramObject;
/* 314 */     if (!this.m_name.equals(localFact.m_name)) {
/* 315 */       return false;
/*     */     }
/* 317 */     return super.equals(paramObject);
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 322 */     int i = this.m_name.hashCode();
/* 323 */     for (int j = 0; j < size(); j++)
/* 324 */       i += this.m_v[j].hashCode();
/* 325 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Fact.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */