/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ class TokenVector
/*    */   implements Serializable
/*    */ {
/*    */   private Token[] m_v;
/*    */   private int m_ptr;
/*    */   
/* 14 */   private final void jdMethod_this() { this.m_ptr = 0; }
/*    */   
/* 16 */   TokenVector() { jdMethod_this();this.m_v = new Token[3];
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 21 */   final int size() { return this.m_ptr; }
/*    */   
/*    */   final void clear() {
/* 24 */     if (this.m_ptr > 0) {
/* 25 */       Arrays.fill(this.m_v, 0, this.m_ptr, null);
/* 26 */       this.m_ptr = 0;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   final void addElement(Token paramToken)
/*    */   {
/* 35 */     if (this.m_ptr >= this.m_v.length)
/*    */     {
/* 37 */       Token[] arrayOfToken = new Token[this.m_v.length * 2];
/* 38 */       System.arraycopy(this.m_v, 0, arrayOfToken, 0, this.m_v.length);
/* 39 */       this.m_v = arrayOfToken;
/*    */     }
/* 41 */     this.m_v[(this.m_ptr++)] = paramToken;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   final Token elementAt(int paramInt)
/*    */   {
/* 50 */     return this.m_v[paramInt];
/*    */   }
/*    */   
/*    */   final void removeElementAt(int paramInt)
/*    */   {
/* 55 */     this.m_v[paramInt] = this.m_v[(this.m_ptr - 1)];
/* 56 */     this.m_v[(--this.m_ptr)] = null;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 60 */     StringBuffer localStringBuffer = new StringBuffer();
/* 61 */     for (int i = 0; i < this.m_ptr; i++) {
/* 62 */       localStringBuffer.append(this.m_v[i]);
/* 63 */       localStringBuffer.append(" ");
/*    */     }
/* 65 */     return localStringBuffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\TokenVector.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */