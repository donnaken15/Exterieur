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
/*     */ public class ValueVector
/*     */   implements Cloneable, Serializable
/*     */ {
/*     */   Value[] m_v;
/*     */   private int m_ptr;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  20 */     this.m_ptr = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public ValueVector()
/*     */   {
/*  27 */     this(10);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public ValueVector(int paramInt)
/*     */   {
/*  34 */     jdMethod_this();
/*  35 */     this.m_v = new Value[paramInt];
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final int size()
/*     */   {
/*  43 */     return this.m_ptr;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object clone()
/*     */   {
/*  51 */     return cloneInto(new ValueVector(this.m_ptr));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ValueVector cloneInto(ValueVector paramValueVector)
/*     */   {
/*  60 */     if (this.m_ptr > paramValueVector.m_v.length) {
/*  61 */       Value[] arrayOfValue = new Value[this.m_ptr];
/*  62 */       paramValueVector.m_v = arrayOfValue;
/*     */     }
/*  64 */     paramValueVector.m_ptr = this.m_ptr;
/*  65 */     System.arraycopy(this.m_v, 0, paramValueVector.m_v, 0, this.m_ptr);
/*  66 */     return paramValueVector;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value get(int paramInt)
/*     */     throws JessException
/*     */   {
/*  76 */     if ((paramInt < 0) || (paramInt >= this.m_ptr)) {
/*  77 */       throw new JessException("ValueVector.get", "Bad index " + paramInt + " in call to get() on this vector: ", toStringWithParens());
/*     */     }
/*     */     
/*     */ 
/*  81 */     return this.m_v[paramInt];
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ValueVector setLength(int paramInt)
/*     */   {
/*  90 */     if (paramInt > this.m_v.length) {
/*  91 */       Value[] arrayOfValue = new Value[paramInt];
/*  92 */       System.arraycopy(this.m_v, 0, arrayOfValue, 0, this.m_v.length);
/*  93 */       this.m_v = arrayOfValue;
/*     */     }
/*  95 */     this.m_ptr = paramInt;
/*  96 */     return this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final ValueVector set(Value paramValue, int paramInt)
/*     */     throws JessException
/*     */   {
/* 108 */     if ((paramInt < 0) || (paramInt >= this.m_ptr)) {
/* 109 */       throw new JessException("ValueVector.set", "Bad index " + paramInt + " in call to set() on this vector:", toStringWithParens());
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 114 */     this.m_v[paramInt] = paramValue;
/* 115 */     return this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final ValueVector add(Value paramValue)
/*     */   {
/* 124 */     if (this.m_ptr >= this.m_v.length) {
/* 125 */       Value[] arrayOfValue = new Value[this.m_v.length * 2];
/* 126 */       System.arraycopy(this.m_v, 0, arrayOfValue, 0, this.m_v.length);
/* 127 */       this.m_v = arrayOfValue;
/*     */     }
/* 129 */     this.m_v[(this.m_ptr++)] = paramValue;
/* 130 */     return this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public final ValueVector remove(int paramInt)
/*     */     throws JessException
/*     */   {
/* 138 */     if ((paramInt < 0) || (paramInt >= this.m_ptr)) {
/* 139 */       throw new JessException("ValueVector.set", "Bad index " + paramInt + " in call to remove() on this vector:", toStringWithParens());
/*     */     }
/*     */     
/*     */ 
/* 143 */     if (paramInt < this.m_ptr - 1)
/* 144 */       System.arraycopy(this.m_v, paramInt + 1, this.m_v, paramInt, this.m_ptr - paramInt);
/* 145 */     this.m_v[(--this.m_ptr)] = null;
/* 146 */     return this;
/*     */   }
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
/* 158 */     if (this == paramObject) {
/* 159 */       return true;
/*     */     }
/* 161 */     if (!(paramObject instanceof ValueVector)) {
/* 162 */       return false;
/*     */     }
/* 164 */     ValueVector localValueVector = (ValueVector)paramObject;
/*     */     
/* 166 */     if (this.m_ptr != localValueVector.m_ptr) {
/* 167 */       return false;
/*     */     }
/* 169 */     for (int i = this.m_ptr - 1; i >= 0; i--) {
/* 170 */       if (!this.m_v[i].equals(localValueVector.m_v[i]))
/* 171 */         return false;
/*     */     }
/* 173 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void copy(ValueVector paramValueVector1, int paramInt1, ValueVector paramValueVector2, int paramInt2, int paramInt3)
/*     */   {
/* 184 */     int i = paramInt2 + paramInt3;
/*     */     
/*     */ 
/* 187 */     int j = paramValueVector2.m_ptr;
/* 188 */     if (i > j) {
/* 189 */       paramValueVector2.setLength(i);
/*     */     }
/*     */     
/* 192 */     for (int k = j; k < paramInt2; k++) {
/* 193 */       paramValueVector2.m_v[k] = Funcall.NIL;
/*     */     }
/* 195 */     System.arraycopy(paramValueVector1.m_v, paramInt1, paramValueVector2.m_v, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ValueVector addAll(ValueVector paramValueVector)
/*     */   {
/* 203 */     copy(paramValueVector, 0, this, this.m_ptr, paramValueVector.m_ptr);
/* 204 */     return this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 212 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 213 */     for (int i = 0; i < this.m_ptr; i++) {
/* 214 */       if (i > 0)
/* 215 */         localStringBuffer.append(" ");
/* 216 */       localStringBuffer.append(this.m_v[i]);
/*     */     }
/* 218 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toStringWithParens()
/*     */   {
/* 227 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 228 */     localStringBuffer.append("(");
/* 229 */     for (int i = 0; i < this.m_ptr; i++) {
/* 230 */       if (i > 0)
/* 231 */         localStringBuffer.append(" ");
/* 232 */       localStringBuffer.append(this.m_v[i].toStringWithParens());
/*     */     }
/* 234 */     localStringBuffer.append(")");
/* 235 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ValueVector.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */