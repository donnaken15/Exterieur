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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Value
/*     */   implements Serializable
/*     */ {
/*     */   static final int STRING_TYPES = 57355;
/*     */   static final int NUM_TYPES = 36;
/*     */   private int m_type;
/*     */   private int m_intval;
/*     */   private double m_floatval;
/*     */   private Object m_objectval;
/*     */   
/*     */   public Value(int paramInt1, int paramInt2)
/*     */     throws JessException
/*     */   {
/*  33 */     this.m_type = paramInt2;
/*  34 */     switch (this.m_type)
/*     */     {
/*     */     case 0: 
/*     */     case 4: 
/*  38 */       this.m_intval = paramInt1; break;
/*     */     case 1: case 2: 
/*     */     case 3: default: 
/*  41 */       throw typeError("Value", "Not an integral type", paramInt2);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value(Value paramValue)
/*     */   {
/*  51 */     this.m_type = paramValue.m_type;
/*  52 */     this.m_intval = paramValue.m_intval;
/*  53 */     this.m_floatval = paramValue.m_floatval;
/*  54 */     this.m_objectval = paramValue.m_objectval;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value(String paramString, int paramInt)
/*     */     throws JessException
/*     */   {
/*  67 */     if ((!(this instanceof Variable)) && ((paramInt == 8) || (paramInt == 8192)))
/*     */     {
/*  69 */       throw new JessException("Value.Value", "Cannot use jess.Value to represent variable " + paramString + '.', "You must use class jess.Variable");
/*     */     }
/*     */     
/*     */ 
/*  73 */     if ((paramInt & 0xE00B) == 0) {
/*  74 */       throw typeError("Value", "Not a string type", paramInt);
/*     */     }
/*  76 */     this.m_type = paramInt;
/*  77 */     this.m_objectval = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value(ValueVector paramValueVector, int paramInt)
/*     */     throws JessException
/*     */   {
/*  89 */     if ((!(this instanceof FuncallValue)) && (paramInt == 64)) {
/*  90 */       throw new JessException("Value.Value", "Cannot use jess.Value to represent the function call " + paramValueVector.toStringWithParens(), "You must use class jess.FuncallValue");
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  95 */     if ((paramInt != 64) && (paramInt != 512)) {
/*  96 */       throw typeError("Value", "Not a vector type", paramInt);
/*     */     }
/*  98 */     this.m_type = paramInt;
/*  99 */     this.m_objectval = paramValueVector;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value(double paramDouble, int paramInt)
/*     */     throws JessException
/*     */   {
/* 112 */     if ((paramInt != 32) && (paramInt != 4) && (paramInt != 65536))
/* 113 */       throw typeError("Value", "Not a float type", paramInt);
/* 114 */     if ((paramInt == 65536) && (!(this instanceof LongValue))) {
/* 115 */       throw typeError("Value", "You must use class jess.LongValue", paramInt);
/*     */     }
/* 117 */     this.m_type = paramInt;
/* 118 */     if ((paramInt == 32) || (paramInt == 65536)) {
/* 119 */       this.m_floatval = paramDouble;
/*     */     } else {
/* 121 */       this.m_intval = ((int)paramDouble);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value(boolean paramBoolean)
/*     */   {
/* 132 */     this.m_type = 1;
/* 133 */     if (paramBoolean) {
/* 134 */       this.m_objectval = Funcall.TRUE.m_objectval;
/*     */     } else {
/* 136 */       this.m_objectval = Funcall.FALSE.m_objectval;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value(Object paramObject)
/*     */   {
/* 145 */     if (paramObject != null) {
/* 146 */       this.m_type = 2048;
/* 147 */       this.m_objectval = paramObject;
/*     */     } else {
/* 149 */       this.m_type = Funcall.NIL.m_type;
/* 150 */       this.m_objectval = Funcall.NIL.m_objectval;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   Value(Fact paramFact)
/*     */     throws JessException
/*     */   {
/* 161 */     if (!(this instanceof FactIDValue)) {
/* 162 */       throw new JessException("Value.Value", "Cannot use jess.Value to represent fact-ids.", "You must use class jess.FactIDValue");
/*     */     }
/*     */     
/*     */ 
/* 166 */     if (paramFact == null) {
/* 167 */       paramFact = Fact.getNullFact();
/*     */     } else {
/* 169 */       while (paramFact.getIcon() != paramFact)
/* 170 */         paramFact = paramFact.getIcon();
/*     */     }
/* 172 */     this.m_type = 16;
/* 173 */     this.m_objectval = paramFact;
/* 174 */     this.m_intval = paramFact.getFactId();
/*     */   }
/*     */   
/*     */   Value() throws JessException
/*     */   {
/* 179 */     if (!(this instanceof BindingValue)) {
/* 180 */       throw new JessException("Value.Value", "Cannot use jess.Value to represent bindings.", "You must use class jess.BindingValue");
/*     */     }
/*     */     
/* 183 */     this.m_type = 4096;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object externalAddressValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 193 */     switch (this.m_type)
/*     */     {
/*     */     case 1: 
/*     */     case 2: 
/*     */     case 16: 
/*     */     case 2048: 
/* 199 */       return this.m_objectval;
/*     */     }
/* 201 */     throw typeError("externalAddressValue", "Not an external address");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Funcall funcallValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 212 */     if (this.m_type == 64)
/* 213 */       return (Funcall)this.m_objectval;
/* 214 */     throw typeError("funcallValue", "Not a function call");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Fact factValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 225 */     if ((this.m_type == 16) || ((this.m_type == 2048) && ((this.m_objectval instanceof Fact))))
/*     */     {
/* 227 */       return (Fact)this.m_objectval; }
/* 228 */     throw typeError("factValue", "Not a fact");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ValueVector listValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 239 */     if (this.m_type == 512)
/* 240 */       return (ValueVector)this.m_objectval;
/* 241 */     throw typeError("listValue", "Not a list");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public double numericValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 252 */     Value localValue = resolveValue(paramContext);
/* 253 */     switch (localValue.m_type)
/*     */     {
/*     */     case 32: 
/* 256 */       return localValue.m_floatval;
/*     */     case 4: 
/*     */     case 16: 
/* 259 */       return localValue.m_intval;
/*     */     case 1: 
/*     */     case 2: 
/*     */       try
/*     */       {
/* 264 */         return Double.valueOf((String)this.m_objectval).doubleValue();
/*     */       }
/*     */       catch (NumberFormatException localNumberFormatException) {}
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 271 */     throw typeError("numericValue", "Not a number");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int intValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 283 */     switch (this.m_type)
/*     */     {
/*     */     case 32: 
/* 286 */       return (int)this.m_floatval;
/*     */     case 4: 
/* 288 */       return this.m_intval;
/*     */     case 1: 
/*     */     case 2: 
/*     */       try
/*     */       {
/* 293 */         return Integer.parseInt((String)this.m_objectval);
/*     */       }
/*     */       catch (NumberFormatException localNumberFormatException) {}
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 300 */     throw typeError("intValue", "Not an integer");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public long longValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 312 */     return numericValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public double floatValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 324 */     return numericValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String atomValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 335 */     return stringValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String variableValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 346 */     if ((this.m_type != 8) && (this.m_type != 8192))
/* 347 */       throw typeError("variableValue", "Not a variable");
/* 348 */     return stringValue(paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String stringValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 359 */     switch (this.m_type)
/*     */     {
/*     */     case 1: 
/*     */     case 2: 
/*     */     case 8: 
/*     */     case 8192: 
/*     */     case 16384: 
/*     */     case 32768: 
/* 367 */       return (String)this.m_objectval;
/*     */     case 4: 
/* 369 */       return String.valueOf(this.m_intval);
/*     */     case 32: 
/* 371 */       return String.valueOf(this.m_floatval);
/*     */     case 2048: 
/* 373 */       return this.m_objectval.toString();
/*     */     }
/* 375 */     throw typeError("stringValue", "Not a string");
/*     */   }
/*     */   
/*     */ 
/*     */   private final JessException typeError(String paramString1, String paramString2)
/*     */   {
/* 381 */     return typeError(paramString1, paramString2, this.m_type);
/*     */   }
/*     */   
/*     */   private final JessException typeError(String paramString1, String paramString2, int paramInt)
/*     */   {
/* 386 */     return new JessException("Value." + paramString1, paramString2 + ": \"" + toString() + '"', "(type = " + RU.getTypeName(paramInt) + ')');
/*     */   }
/*     */   
/*     */ 
/*     */   private final String escape(String paramString)
/*     */   {
/* 392 */     if ((paramString.indexOf('"') == -1) && (paramString.indexOf('\\') == -1)) {
/* 393 */       return paramString;
/*     */     }
/* 395 */     StringBuffer localStringBuffer = new StringBuffer();
/* 396 */     for (int i = 0; i < paramString.length(); i++) {
/* 397 */       char c = paramString.charAt(i);
/* 398 */       if ((c == '"') || (c == '\\'))
/* 399 */         localStringBuffer.append('\\');
/* 400 */       localStringBuffer.append(c);
/*     */     }
/* 402 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 412 */     switch (this.m_type)
/*     */     {
/*     */     case 4: 
/* 415 */       return String.valueOf(this.m_intval);
/*     */     case 32: 
/* 417 */       return String.valueOf(this.m_floatval);
/*     */     case 2: 
/* 419 */       return "\"" + escape((String)this.m_objectval) + '"';
/*     */     case 1: 
/*     */     case 16384: 
/*     */     case 32768: 
/* 423 */       return (String)this.m_objectval;
/*     */     case 8: 
/* 425 */       return "?" + this.m_objectval;
/*     */     case 8192: 
/* 427 */       return "$?" + this.m_objectval;
/*     */     case 16: 
/* 429 */       return "<Fact-" + this.m_intval + '>';
/*     */     case 64: 
/*     */     case 512: 
/* 432 */       return this.m_objectval.toString();
/*     */     case 2048: 
/* 434 */       return "<External-Address:" + this.m_objectval.getClass().getName() + '>';
/*     */     case 0: 
/* 436 */       return Funcall.NIL.toString();
/*     */     }
/* 438 */     return "<UNKNOWN>";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toStringWithParens()
/*     */   {
/* 449 */     switch (this.m_type)
/*     */     {
/*     */     case 64: 
/*     */     case 512: 
/* 453 */       return ((ValueVector)this.m_objectval).toStringWithParens();
/*     */     }
/* 455 */     return toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int type()
/*     */   {
/* 465 */     return this.m_type;
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
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 478 */     if (this == paramObject) {
/* 479 */       return true;
/*     */     }
/* 481 */     if ((paramObject instanceof Value)) {
/* 482 */       return equals((Value)paramObject);
/*     */     }
/* 484 */     return paramObject.equals(this.m_objectval);
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
/*     */   public boolean equals(Value paramValue)
/*     */   {
/* 497 */     if (this == paramValue) {
/* 498 */       return true;
/*     */     }
/* 500 */     if (paramValue.m_type != this.m_type) {
/* 501 */       return false;
/*     */     }
/* 503 */     switch (this.m_type) {
/*     */     case 4: 
/*     */     case 16: 
/* 506 */       if (this.m_intval == paramValue.m_intval) 0; return true;
/*     */     
/*     */     case 32: 
/* 509 */       if (this.m_floatval == paramValue.m_floatval) 0; return true;
/*     */     }
/*     */     
/* 512 */     return this.m_objectval.equals(paramValue.m_objectval);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equalsStar(Value paramValue)
/*     */   {
/* 524 */     if (this == paramValue) {
/* 525 */       return true;
/*     */     }
/*     */     try
/*     */     {
/* 529 */       if (((this.m_type & 0x24) != 0) && ((paramValue.m_type & 0x24) != 0))
/*     */       {
/* 531 */         if (numericValue(null) == paramValue.numericValue(null)) 0; return true;
/*     */       }
/*     */       
/*     */ 
/* 535 */       return equals(paramValue);
/*     */     } catch (JessException localJessException) {}
/* 537 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 547 */     switch (this.m_type)
/*     */     {
/*     */     case 0: 
/* 550 */       return 0;
/*     */     case 4: 
/*     */     case 16: 
/* 553 */       return this.m_intval;
/*     */     
/*     */     case 32: 
/* 556 */       return (int)this.m_floatval;
/*     */     
/*     */ 
/*     */     case 64: 
/*     */     case 512: 
/*     */       try
/*     */       {
/* 563 */         ValueVector localValueVector = (ValueVector)this.m_objectval;
/* 564 */         int i = 0;
/* 565 */         for (int j = 0; j < localValueVector.size(); j++)
/* 566 */           i += localValueVector.get(j).hashCode();
/* 567 */         return i;
/*     */       } catch (JessException localJessException) {
/* 569 */         return 0;
/*     */       }
/*     */     }
/*     */     
/* 573 */     if (this.m_objectval != null) 0; return this.m_objectval.hashCode();
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
/*     */   public Value resolveValue(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 589 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Value.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */