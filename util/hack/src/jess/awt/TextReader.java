/*     */ package jess.awt;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ public class TextReader
/*     */   extends Reader
/*     */   implements Serializable
/*     */ {
/*     */   private StringBuffer m_buf;
/*     */   private int m_ptr;
/*     */   private boolean m_dontWait;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  18 */     this.m_buf = new StringBuffer(256);
/*  19 */     this.m_ptr = 0;
/*  20 */     this.m_dontWait = false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TextReader(boolean paramBoolean)
/*     */   {
/*  29 */     jdMethod_this();this.m_dontWait = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int read()
/*     */   {
/*  39 */     while (this.m_ptr >= this.m_buf.length())
/*     */     {
/*  41 */       if (this.m_dontWait)
/*  42 */         return -1;
/*     */       try {
/*  44 */         wait(100L);
/*     */       } catch (InterruptedException localInterruptedException) {}
/*     */     }
/*  47 */     int i = this.m_buf.charAt(this.m_ptr++);
/*     */     
/*  49 */     if (this.m_ptr >= this.m_buf.length()) {
/*  50 */       clear();
/*     */     }
/*  52 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int read(char[] paramArrayOfChar)
/*     */     throws IOException
/*     */   {
/*  63 */     return read(paramArrayOfChar, 0, paramArrayOfChar.length);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*  75 */     for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
/*     */     {
/*  77 */       int j = read();
/*  78 */       if (j == -1) {
/*  79 */         return i > paramInt1 ? i - paramInt1 : -1;
/*     */       }
/*  81 */       paramArrayOfChar[i] = ((char)j);
/*     */     }
/*  83 */     return paramInt2;
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
/*     */   public int available()
/*     */   {
/*  98 */     return this.m_buf.length() - this.m_ptr;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized void appendText(String paramString)
/*     */   {
/* 109 */     this.m_buf.append(paramString);
/* 110 */     notifyAll();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized void clear()
/*     */   {
/* 118 */     this.m_buf.setLength(0);
/* 119 */     this.m_ptr = 0;
/*     */   }
/*     */   
/*     */   public void close() {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\TextReader.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */