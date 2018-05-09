/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ 
/*     */ 
/*     */ public final class ASCII_CharStream
/*     */ {
/*     */   public static final boolean staticFlag = true;
/*     */   static int bufsize;
/*     */   static int available;
/*     */   static int tokenBegin;
/*  15 */   public static int bufpos = -1;
/*     */   
/*     */   private static int[] bufline;
/*     */   private static int[] bufcolumn;
/*  19 */   private static int column = 0;
/*  20 */   private static int line = 1;
/*     */   
/*  22 */   private static boolean prevCharIsCR = false;
/*  23 */   private static boolean prevCharIsLF = false;
/*     */   
/*     */   private static Reader inputStream;
/*     */   
/*     */   private static char[] buffer;
/*  28 */   private static int maxNextCharInd = 0;
/*  29 */   private static int inBuf = 0;
/*     */   
/*     */   private static final void ExpandBuff(boolean paramBoolean)
/*     */   {
/*  33 */     char[] arrayOfChar = new char[bufsize + 2048];
/*  34 */     int[] arrayOfInt1 = new int[bufsize + 2048];
/*  35 */     int[] arrayOfInt2 = new int[bufsize + 2048];
/*     */     
/*     */     try
/*     */     {
/*  39 */       if (paramBoolean)
/*     */       {
/*  41 */         System.arraycopy(buffer, tokenBegin, arrayOfChar, 0, bufsize - tokenBegin);
/*  42 */         System.arraycopy(buffer, 0, arrayOfChar, bufsize - tokenBegin, bufpos);
/*     */         
/*  44 */         buffer = arrayOfChar;
/*     */         
/*  46 */         System.arraycopy(bufline, tokenBegin, arrayOfInt1, 0, bufsize - tokenBegin);
/*  47 */         System.arraycopy(bufline, 0, arrayOfInt1, bufsize - tokenBegin, bufpos);
/*  48 */         bufline = arrayOfInt1;
/*     */         
/*  50 */         System.arraycopy(bufcolumn, tokenBegin, arrayOfInt2, 0, bufsize - tokenBegin);
/*  51 */         System.arraycopy(bufcolumn, 0, arrayOfInt2, bufsize - tokenBegin, bufpos);
/*  52 */         bufcolumn = arrayOfInt2;
/*     */         
/*  54 */         maxNextCharInd = bufpos = bufpos + (bufsize - tokenBegin);
/*     */       }
/*     */       else
/*     */       {
/*  58 */         System.arraycopy(buffer, tokenBegin, arrayOfChar, 0, bufsize - tokenBegin);
/*  59 */         buffer = arrayOfChar;
/*     */         
/*  61 */         System.arraycopy(bufline, tokenBegin, arrayOfInt1, 0, bufsize - tokenBegin);
/*  62 */         bufline = arrayOfInt1;
/*     */         
/*  64 */         System.arraycopy(bufcolumn, tokenBegin, arrayOfInt2, 0, bufsize - tokenBegin);
/*  65 */         bufcolumn = arrayOfInt2;
/*     */         
/*  67 */         maxNextCharInd = bufpos = bufpos - tokenBegin;
/*     */       }
/*     */     }
/*     */     catch (Throwable localThrowable)
/*     */     {
/*  72 */       throw new Error(localThrowable.getMessage());
/*     */     }
/*     */     
/*     */ 
/*  76 */     bufsize += 2048;
/*  77 */     available = bufsize;
/*  78 */     tokenBegin = 0;
/*     */   }
/*     */   
/*     */   private static final void FillBuff() throws IOException
/*     */   {
/*  83 */     if (maxNextCharInd == available)
/*     */     {
/*  85 */       if (available == bufsize)
/*     */       {
/*  87 */         if (tokenBegin > 2048)
/*     */         {
/*  89 */           bufpos = maxNextCharInd = 0;
/*  90 */           available = tokenBegin;
/*     */         }
/*  92 */         else if (tokenBegin < 0) {
/*  93 */           bufpos = maxNextCharInd = 0;
/*     */         } else {
/*  95 */           ExpandBuff(false);
/*     */         }
/*  97 */       } else if (available > tokenBegin) {
/*  98 */         available = bufsize;
/*  99 */       } else if (tokenBegin - available < 2048) {
/* 100 */         ExpandBuff(true);
/*     */       } else {
/* 102 */         available = tokenBegin;
/*     */       }
/*     */     }
/*     */     try {
/*     */       int i;
/* 107 */       if ((i = inputStream.read(buffer, maxNextCharInd, available - maxNextCharInd)) == -1)
/*     */       {
/*     */ 
/* 110 */         inputStream.close();
/* 111 */         throw new IOException();
/*     */       }
/*     */       
/* 114 */       maxNextCharInd += i;
/* 115 */       return;
/*     */     }
/*     */     catch (IOException localIOException) {
/* 118 */       bufpos -= 1;
/* 119 */       backup(0);
/* 120 */       if (tokenBegin == -1)
/* 121 */         tokenBegin = bufpos;
/* 122 */       throw localIOException;
/*     */     }
/*     */   }
/*     */   
/*     */   public static final char BeginToken() throws IOException
/*     */   {
/* 128 */     tokenBegin = -1;
/* 129 */     char c = readChar();
/* 130 */     tokenBegin = bufpos;
/*     */     
/* 132 */     return c;
/*     */   }
/*     */   
/*     */   private static final void UpdateLineColumn(char paramChar)
/*     */   {
/* 137 */     column += 1;
/*     */     
/* 139 */     if (prevCharIsLF)
/*     */     {
/* 141 */       prevCharIsLF = false;
/* 142 */       line += (column = 1);
/*     */     }
/* 144 */     else if (prevCharIsCR)
/*     */     {
/* 146 */       prevCharIsCR = false;
/* 147 */       if (paramChar == '\n')
/*     */       {
/* 149 */         prevCharIsLF = true;
/*     */       }
/*     */       else {
/* 152 */         line += (column = 1);
/*     */       }
/*     */     }
/* 155 */     switch (paramChar)
/*     */     {
/*     */     case '\r': 
/* 158 */       prevCharIsCR = true;
/* 159 */       break;
/*     */     case '\n': 
/* 161 */       prevCharIsLF = true;
/* 162 */       break;
/*     */     case '\t': 
/* 164 */       column -= 1;
/* 165 */       column += 8 - (column & 0x7);
/* 166 */       break;
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 171 */     bufline[bufpos] = line;
/* 172 */     bufcolumn[bufpos] = column;
/*     */   }
/*     */   
/*     */   public static final char readChar() throws IOException
/*     */   {
/* 177 */     if (inBuf > 0)
/*     */     {
/* 179 */       inBuf -= 1;
/* 180 */       return (char)(0xFF & buffer[(++bufpos)]);
/*     */     }
/*     */     
/* 183 */     if (++bufpos >= maxNextCharInd) {
/* 184 */       FillBuff();
/*     */     }
/* 186 */     char c = (char)(0xFF & buffer[bufpos]);
/*     */     
/* 188 */     UpdateLineColumn(c);
/* 189 */     return c;
/*     */   }
/*     */   
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public static final int getColumn()
/*     */   {
/* 198 */     return bufcolumn[bufpos];
/*     */   }
/*     */   
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public static final int getLine()
/*     */   {
/* 207 */     return bufline[bufpos];
/*     */   }
/*     */   
/*     */   public static final int getEndColumn() {
/* 211 */     return bufcolumn[bufpos];
/*     */   }
/*     */   
/*     */   public static final int getEndLine() {
/* 215 */     return bufline[bufpos];
/*     */   }
/*     */   
/*     */   public static final int getBeginColumn() {
/* 219 */     return bufcolumn[tokenBegin];
/*     */   }
/*     */   
/*     */   public static final int getBeginLine() {
/* 223 */     return bufline[tokenBegin];
/*     */   }
/*     */   
/*     */   public static final void backup(int paramInt)
/*     */   {
/* 228 */     inBuf += paramInt;
/* 229 */     if ((bufpos = bufpos - paramInt) < 0) {
/* 230 */       bufpos += bufsize;
/*     */     }
/*     */   }
/*     */   
/*     */   public ASCII_CharStream(Reader paramReader, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 236 */     if (inputStream != null) {
/* 237 */       throw new Error("\n   ERROR: Second call to the constructor of a static ASCII_CharStream.  You must\n       either use ReInit() or set the JavaCC option STATIC to false\n       during the generation of this class.");
/*     */     }
/*     */     
/* 240 */     inputStream = paramReader;
/* 241 */     line = paramInt1;
/* 242 */     column = paramInt2 - 1;
/*     */     
/* 244 */     available = bufsize = paramInt3;
/* 245 */     buffer = new char[paramInt3];
/* 246 */     bufline = new int[paramInt3];
/* 247 */     bufcolumn = new int[paramInt3];
/*     */   }
/*     */   
/*     */ 
/*     */   public ASCII_CharStream(Reader paramReader, int paramInt1, int paramInt2)
/*     */   {
/* 253 */     this(paramReader, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public static final void ReInit(Reader paramReader, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 258 */     inputStream = paramReader;
/* 259 */     line = paramInt1;
/* 260 */     column = paramInt2 - 1;
/*     */     
/* 262 */     if ((buffer == null) || (paramInt3 != buffer.length))
/*     */     {
/* 264 */       available = bufsize = paramInt3;
/* 265 */       buffer = new char[paramInt3];
/* 266 */       bufline = new int[paramInt3];
/* 267 */       bufcolumn = new int[paramInt3];
/*     */     }
/* 269 */     prevCharIsLF = prevCharIsCR = 0;
/* 270 */     tokenBegin = inBuf = maxNextCharInd = 0;
/* 271 */     bufpos = -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public static final void ReInit(Reader paramReader, int paramInt1, int paramInt2)
/*     */   {
/* 277 */     ReInit(paramReader, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public ASCII_CharStream(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 282 */     this(new InputStreamReader(paramInputStream), paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */ 
/*     */   public ASCII_CharStream(InputStream paramInputStream, int paramInt1, int paramInt2)
/*     */   {
/* 288 */     this(paramInputStream, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */ 
/*     */   public static final void ReInit(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 294 */     ReInit(new InputStreamReader(paramInputStream), paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public static final void ReInit(InputStream paramInputStream, int paramInt1, int paramInt2)
/*     */   {
/* 299 */     ReInit(paramInputStream, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public static final String GetImage() {
/* 303 */     if (bufpos >= tokenBegin) {
/* 304 */       return new String(buffer, tokenBegin, bufpos - tokenBegin + 1);
/*     */     }
/* 306 */     return new String(buffer, tokenBegin, bufsize - tokenBegin) + new String(buffer, 0, bufpos + 1);
/*     */   }
/*     */   
/*     */ 
/*     */   public static final char[] GetSuffix(int paramInt)
/*     */   {
/* 312 */     char[] arrayOfChar = new char[paramInt];
/*     */     
/* 314 */     if (bufpos + 1 >= paramInt) {
/* 315 */       System.arraycopy(buffer, bufpos - paramInt + 1, arrayOfChar, 0, paramInt);
/*     */     }
/*     */     else {
/* 318 */       System.arraycopy(buffer, bufsize - (paramInt - bufpos - 1), arrayOfChar, 0, paramInt - bufpos - 1);
/*     */       
/* 320 */       System.arraycopy(buffer, 0, arrayOfChar, paramInt - bufpos - 1, bufpos + 1);
/*     */     }
/*     */     
/* 323 */     return arrayOfChar;
/*     */   }
/*     */   
/*     */   public static final void Done()
/*     */   {
/* 328 */     buffer = null;
/* 329 */     bufline = null;
/* 330 */     bufcolumn = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final void adjustBeginLineColumn(int paramInt1, int paramInt2)
/*     */   {
/* 338 */     int i = tokenBegin;
/*     */     
/*     */     int j;
/* 341 */     if (bufpos >= tokenBegin)
/*     */     {
/* 343 */       j = bufpos - tokenBegin + inBuf + 1;
/*     */     }
/*     */     else
/*     */     {
/* 347 */       j = bufsize - tokenBegin + bufpos + 1 + inBuf;
/*     */     }
/*     */     
/* 350 */     int k = 0;int m = 0;int n = 0;
/* 351 */     int i1 = 0;int i2 = 0;
/*     */     
/* 353 */     while ((k < j) && (bufline[(m = i % bufsize)] == bufline[(n = ++i % bufsize)]))
/*     */     {
/*     */ 
/* 356 */       bufline[m] = paramInt1;
/* 357 */       i1 = i2 + bufcolumn[n] - bufcolumn[m];
/* 358 */       bufcolumn[m] = (paramInt2 + i2);
/* 359 */       i2 = i1;
/* 360 */       k++;
/*     */     }
/*     */     
/* 363 */     if (k < j)
/*     */     {
/* 365 */       bufline[m] = (paramInt1++);
/* 366 */       bufcolumn[m] = (paramInt2 + i2);
/*     */       
/* 368 */       while (k++ < j)
/*     */       {
/* 370 */         if (bufline[(m = i % bufsize)] != bufline[(++i % bufsize)]) {
/* 371 */           bufline[m] = (paramInt1++);
/*     */         } else {
/* 373 */           bufline[m] = paramInt1;
/*     */         }
/*     */       }
/*     */     }
/* 377 */     line = bufline[m];
/* 378 */     column = bufcolumn[m];
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASCII_CharStream.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */