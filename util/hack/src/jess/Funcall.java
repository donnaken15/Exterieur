/*     */ package jess;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ public class Funcall extends ValueVector implements java.io.Serializable
/*     */ {
/*     */   public static Value TRUE;
/*     */   public static Value FALSE;
/*     */   public static Value NIL;
/*     */   public static Value NILLIST;
/*     */   public static Value EOF;
/*     */   static Value s_else;
/*     */   static Value s_then;
/*     */   static Value s_do;
/*     */   
/*     */   public String toString()
/*     */   {
/*     */     try
/*     */     {
/*     */       List localList1;
/*     */       int i;
/*  24 */       if (get(0).equals("assert")) {
/*  25 */         localList1 = new List("assert");
/*  26 */         for (i = 1; i < size(); i++)
/*  27 */           localList1.add(get(i).factValue(null));
/*  28 */         return localList1.toString(); }
/*  29 */       if ((get(0).equals("modify")) || (get(0).equals("duplicate")))
/*     */       {
/*  31 */         localList1 = new List(get(0).atomValue(null));
/*  32 */         localList1.add(get(1));
/*  33 */         for (i = 2; i < size(); i++) {
/*  34 */           ValueVector localValueVector = get(i).listValue(null);
/*  35 */           List localList2 = new List(localValueVector.get(0).atomValue(null));
/*  36 */           for (int j = 1; j < localValueVector.size(); j++)
/*  37 */             localList2.add(localValueVector.get(j));
/*  38 */           localList1.add(localList2);
/*     */         }
/*     */         
/*  41 */         return localList1.toString();
/*     */       }
/*     */       
/*  44 */       return new List(super.toString()).toString();
/*     */     }
/*     */     catch (JessException localJessException) {
/*  47 */       return localJessException.toString();
/*     */     }
/*     */   }
/*     */   
/*     */   public String toStringWithParens() {
/*  52 */     return toString();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */   private static HashMap m_intrinsics = new HashMap();
/*     */   FunctionHolder m_funcall;
/*     */   
/*     */   static {
/*  74 */     try { TRUE = new Value("TRUE", 1);
/*  75 */       FALSE = new Value("FALSE", 1);
/*  76 */       NIL = new Value("nil", 1);
/*  77 */       NILLIST = new Value(new ValueVector(), 512);
/*  78 */       EOF = new Value("EOF", 1);
/*  79 */       s_else = new Value("else", 1);
/*  80 */       s_then = new Value("then", 1);
/*  81 */       s_do = new Value("do", 1);
/*     */       
/*  83 */       loadIntrinsics();
/*     */     }
/*     */     catch (JessException localJessException) {
/*  86 */       System.out.println("*** FATAL ***: Can't initialize Jess");
/*  87 */       localJessException.printStackTrace();
/*  88 */       System.exit(0);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   static Userfunction getIntrinsic(String paramString)
/*     */   {
/*  97 */     return (Userfunction)m_intrinsics.get(paramString);
/*     */   }
/*     */   
/*     */   static java.util.Iterator listIntrinsics() {
/* 101 */     return m_intrinsics.values().iterator();
/*     */   }
/*     */   
/*     */   private static final void addIntrinsic(Userfunction paramUserfunction) {
/* 105 */     m_intrinsics.put(paramUserfunction.getName(), paramUserfunction);
/*     */   }
/*     */   
/*     */   private static final void addPackage(IntrinsicPackage paramIntrinsicPackage) {
/* 109 */     paramIntrinsicPackage.add(m_intrinsics);
/*     */   }
/*     */   
/*     */   private static final void loadIntrinsics() throws JessException
/*     */   {
/*     */     try {
/* 115 */       addIntrinsic(new Assert());
/* 116 */       addIntrinsic(new Retract());
/* 117 */       addIntrinsic(new Update());
/* 118 */       addIntrinsic(new RetractString());
/* 119 */       addIntrinsic(new DoBackwardChaining());
/* 120 */       addIntrinsic(new Open());
/* 121 */       addIntrinsic(new Close());
/* 122 */       addIntrinsic(new Duplicate());
/* 123 */       addIntrinsic(new Foreach());
/* 124 */       addIntrinsic(new Read());
/* 125 */       addIntrinsic(new Readline());
/* 126 */       addIntrinsic(new GensymStar());
/* 127 */       addIntrinsic(new While());
/* 128 */       addIntrinsic(new If());
/* 129 */       addIntrinsic(new Bind());
/* 130 */       addIntrinsic(new Modify());
/* 131 */       addIntrinsic(new And());
/* 132 */       addIntrinsic(new Or());
/* 133 */       addIntrinsic(new Not());
/* 134 */       addIntrinsic(new Eq());
/* 135 */       addIntrinsic(new EqStar());
/* 136 */       addIntrinsic(new Equals());
/* 137 */       addIntrinsic(new NotEquals());
/* 138 */       addIntrinsic(new Gt());
/* 139 */       addIntrinsic(new Lt());
/* 140 */       addIntrinsic(new GtOrEq());
/* 141 */       addIntrinsic(new LtOrEq());
/* 142 */       addIntrinsic(new Neq());
/* 143 */       addIntrinsic(new Mod());
/* 144 */       addIntrinsic(new Plus());
/* 145 */       addIntrinsic(new Times());
/* 146 */       addIntrinsic(new Minus());
/* 147 */       addIntrinsic(new Divide());
/* 148 */       addIntrinsic(new SymCat());
/* 149 */       addIntrinsic(new LoadFacts());
/* 150 */       addIntrinsic(new SaveFacts());
/* 151 */       addIntrinsic(new AssertString());
/* 152 */       addIntrinsic(new UnDefrule());
/* 153 */       addIntrinsic(new Batch());
/* 154 */       addIntrinsic(new Watch());
/* 155 */       addIntrinsic(new Unwatch());
/* 156 */       addIntrinsic(new JessVersion(0));
/* 157 */       addIntrinsic(new JessVersion(1));
/*     */       
/* 159 */       addIntrinsic(new HaltEtc(0));
/* 160 */       addIntrinsic(new HaltEtc(1));
/* 161 */       addIntrinsic(new HaltEtc(2));
/* 162 */       addIntrinsic(new HaltEtc(3));
/* 163 */       addIntrinsic(new HaltEtc(4));
/* 164 */       addIntrinsic(new HaltEtc(5));
/*     */       
/* 166 */       addIntrinsic(new StoreFetch(0));
/* 167 */       addIntrinsic(new StoreFetch(1));
/* 168 */       addIntrinsic(new StoreFetch(2));
/*     */       
/* 170 */       addIntrinsic(new Defadvice("defadvice"));
/* 171 */       addIntrinsic(new Defadvice("undefadvice"));
/*     */       
/* 173 */       addIntrinsic(new TryCatchThrow("try"));
/* 174 */       addIntrinsic(new TryCatchThrow("throw"));
/*     */       
/* 176 */       Printout localPrintout = new Printout(0);
/* 177 */       addIntrinsic(localPrintout);
/* 178 */       addIntrinsic(new Printout(1, localPrintout));
/* 179 */       addIntrinsic(new Printout(2, localPrintout));
/*     */       
/* 181 */       addPackage(new ReflectFunctions());
/* 182 */       addPackage(new StringFunctions());
/* 183 */       addPackage(new PredFunctions());
/* 184 */       addPackage(new MultiFunctions());
/* 185 */       addPackage(new MiscFunctions());
/* 186 */       addPackage(new ModuleFunctions());
/* 187 */       addPackage(new MathFunctions());
/* 188 */       addPackage(new LispFunctions());
/* 189 */       addPackage(new DumpFunctions());
/* 190 */       addPackage(new ReflectFunctions());
/* 191 */       addPackage(new ViewFunctions());
/* 192 */       addPackage(new BagFunctions());
/*     */     }
/*     */     catch (Throwable localThrowable) {
/* 195 */       localThrowable.printStackTrace();
/* 196 */       throw new JessException("Funcall.loadIntrisics", "Missing non-optional function class", localThrowable);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public Funcall(String paramString, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 214 */     add(new Value(paramString, 1));
/* 215 */     this.m_funcall = paramRete.findFunctionHolder(paramString);
/*     */   }
/*     */   
/*     */   Funcall(int paramInt) {
/* 219 */     super(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object clone()
/*     */   {
/* 228 */     return cloneInto(new Funcall(size()));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Funcall cloneInto(Funcall paramFuncall)
/*     */   {
/* 237 */     super.cloneInto(paramFuncall);
/* 238 */     paramFuncall.m_funcall = this.m_funcall;
/* 239 */     return paramFuncall;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Value execute(Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     try
/*     */     {
/* 253 */       if (this.m_funcall == null) {
/* 254 */         String str = get(0).stringValue(paramContext);
/*     */         
/* 256 */         if ((this.m_funcall = paramContext.getEngine().findFunctionHolder(str)) == null)
/*     */         {
/* 258 */           throw new JessException("Funcall.execute", "Unimplemented function", str);
/*     */         }
/*     */       }
/*     */       
/* 262 */       paramContext.getEngine().broadcastEvent(524288, this.m_funcall.getFunction());
/*     */       
/*     */ 
/*     */ 
/* 266 */       return this.m_funcall.call(this, paramContext);
/*     */     }
/*     */     catch (JessException localJessException1) {
/* 269 */       localJessException1.addContext(toStringWithParens());
/* 270 */       throw localJessException1;
/*     */     }
/*     */     catch (Exception localException) {
/* 273 */       JessException localJessException2 = new JessException("Funcall.execute", "Error during execution", localException);
/*     */       
/*     */ 
/*     */ 
/* 277 */       localJessException2.addContext(toStringWithParens());
/* 278 */       throw localJessException2;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Funcall arg(Value paramValue)
/*     */   {
/* 290 */     add(paramValue);
/* 291 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Funcall.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */