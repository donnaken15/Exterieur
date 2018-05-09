/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Reader;
/*     */ 
/*     */ public final class ASCII_UCodeESC_CharStream
/*     */ {
/*     */   public static final boolean staticFlag = true;
/*     */   
/*     */   static final int hexval(char paramChar) throws IOException
/*     */   {
/*  13 */     switch (paramChar)
/*     */     {
/*     */     case '0': 
/*  16 */       return 0;
/*     */     case '1': 
/*  18 */       return 1;
/*     */     case '2': 
/*  20 */       return 2;
/*     */     case '3': 
/*  22 */       return 3;
/*     */     case '4': 
/*  24 */       return 4;
/*     */     case '5': 
/*  26 */       return 5;
/*     */     case '6': 
/*  28 */       return 6;
/*     */     case '7': 
/*  30 */       return 7;
/*     */     case '8': 
/*  32 */       return 8;
/*     */     case '9': 
/*  34 */       return 9;
/*     */     
/*     */     case 'A': 
/*     */     case 'a': 
/*  38 */       return 10;
/*     */     case 'B': 
/*     */     case 'b': 
/*  41 */       return 11;
/*     */     case 'C': 
/*     */     case 'c': 
/*  44 */       return 12;
/*     */     case 'D': 
/*     */     case 'd': 
/*  47 */       return 13;
/*     */     case 'E': 
/*     */     case 'e': 
/*  50 */       return 14;
/*     */     case 'F': 
/*     */     case 'f': 
/*  53 */       return 15;
/*     */     }
/*     */     
/*  56 */     throw new IOException();
/*     */   }
/*     */   
/*  59 */   public static int bufpos = -1;
/*     */   
/*     */   static int bufsize;
/*     */   static int available;
/*     */   static int tokenBegin;
/*     */   private static int[] bufline;
/*     */   private static int[] bufcolumn;
/*  66 */   private static int column = 0;
/*  67 */   private static int line = 1;
/*     */   
/*     */   private static Reader inputStream;
/*     */   
/*  71 */   private static boolean prevCharIsCR = false;
/*  72 */   private static boolean prevCharIsLF = false;
/*     */   
/*     */   private static char[] nextCharBuf;
/*     */   private static char[] buffer;
/*  76 */   private static int maxNextCharInd = 0;
/*  77 */   private static int nextCharInd = -1;
/*  78 */   private static int inBuf = 0;
/*     */   
/*     */   private static final void ExpandBuff(boolean paramBoolean)
/*     */   {
/*  82 */     char[] arrayOfChar = new char[bufsize + 2048];
/*  83 */     int[] arrayOfInt1 = new int[bufsize + 2048];
/*  84 */     int[] arrayOfInt2 = new int[bufsize + 2048];
/*     */     
/*     */     try
/*     */     {
/*  88 */       if (paramBoolean)
/*     */       {
/*  90 */         System.arraycopy(buffer, tokenBegin, arrayOfChar, 0, bufsize - tokenBegin);
/*  91 */         System.arraycopy(buffer, 0, arrayOfChar, bufsize - tokenBegin, bufpos);
/*     */         
/*  93 */         buffer = arrayOfChar;
/*     */         
/*  95 */         System.arraycopy(bufline, tokenBegin, arrayOfInt1, 0, bufsize - tokenBegin);
/*  96 */         System.arraycopy(bufline, 0, arrayOfInt1, bufsize - tokenBegin, bufpos);
/*  97 */         bufline = arrayOfInt1;
/*     */         
/*  99 */         System.arraycopy(bufcolumn, tokenBegin, arrayOfInt2, 0, bufsize - tokenBegin);
/* 100 */         System.arraycopy(bufcolumn, 0, arrayOfInt2, bufsize - tokenBegin, bufpos);
/* 101 */         bufcolumn = arrayOfInt2;
/*     */         
/* 103 */         bufpos += bufsize - tokenBegin;
/*     */       }
/*     */       else
/*     */       {
/* 107 */         System.arraycopy(buffer, tokenBegin, arrayOfChar, 0, bufsize - tokenBegin);
/* 108 */         buffer = arrayOfChar;
/*     */         
/* 110 */         System.arraycopy(bufline, tokenBegin, arrayOfInt1, 0, bufsize - tokenBegin);
/* 111 */         bufline = arrayOfInt1;
/*     */         
/* 113 */         System.arraycopy(bufcolumn, tokenBegin, arrayOfInt2, 0, bufsize - tokenBegin);
/* 114 */         bufcolumn = arrayOfInt2;
/*     */         
/* 116 */         bufpos -= tokenBegin;
/*     */       }
/*     */     }
/*     */     catch (Throwable localThrowable)
/*     */     {
/* 121 */       throw new Error(localThrowable.getMessage());
/*     */     }
/*     */     
/* 124 */     available = bufsize = bufsize + 2048;
/* 125 */     tokenBegin = 0;
/*     */   }
/*     */   
/*     */   private static final void FillBuff()
/*     */     throws IOException
/*     */   {
/* 131 */     if (maxNextCharInd == 4096)
/* 132 */       maxNextCharInd = nextCharInd = 0;
/*     */     try {
/*     */       int i;
/* 135 */       if ((i = inputStream.read(nextCharBuf, maxNextCharInd, 4096 - maxNextCharInd)) == -1)
/*     */       {
/*     */ 
/* 138 */         inputStream.close();
/* 139 */         throw new IOException();
/*     */       }
/*     */       
/* 142 */       maxNextCharInd += i;
/* 143 */       return;
/*     */     }
/*     */     catch (IOException localIOException) {
/* 146 */       if (bufpos != 0)
/*     */       {
/* 148 */         bufpos -= 1;
/* 149 */         backup(0);
/*     */       }
/*     */       else
/*     */       {
/* 153 */         bufline[bufpos] = line;
/* 154 */         bufcolumn[bufpos] = column;
/*     */       }
/* 156 */       throw localIOException;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final char ReadByte() throws IOException
/*     */   {
/* 162 */     if (++nextCharInd >= maxNextCharInd) {
/* 163 */       FillBuff();
/*     */     }
/* 165 */     return nextCharBuf[nextCharInd];
/*     */   }
/*     */   
/*     */   public static final char BeginToken() throws IOException
/*     */   {
/* 170 */     if (inBuf > 0)
/*     */     {
/* 172 */       inBuf -= 1;
/* 173 */       return buffer[(tokenBegin = ++bufpos)];
/*     */     }
/*     */     
/*     */ 
/* 177 */     tokenBegin = 0;
/* 178 */     bufpos = -1;
/*     */     
/* 180 */     return readChar();
/*     */   }
/*     */   
/*     */   private static final void AdjustBuffSize()
/*     */   {
/* 185 */     if (available == bufsize)
/*     */     {
/* 187 */       if (tokenBegin > 2048)
/*     */       {
/* 189 */         bufpos = 0;
/* 190 */         available = tokenBegin;
/*     */       }
/*     */       else {
/* 193 */         ExpandBuff(false);
/*     */       }
/* 195 */     } else if (available > tokenBegin) {
/* 196 */       available = bufsize;
/* 197 */     } else if (tokenBegin - available < 2048) {
/* 198 */       ExpandBuff(true);
/*     */     } else {
/* 200 */       available = tokenBegin;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void UpdateLineColumn(char paramChar) {
/* 205 */     column += 1;
/*     */     
/* 207 */     if (prevCharIsLF)
/*     */     {
/* 209 */       prevCharIsLF = false;
/* 210 */       line += (column = 1);
/*     */     }
/* 212 */     else if (prevCharIsCR)
/*     */     {
/* 214 */       prevCharIsCR = false;
/* 215 */       if (paramChar == '\n')
/*     */       {
/* 217 */         prevCharIsLF = true;
/*     */       }
/*     */       else {
/* 220 */         line += (column = 1);
/*     */       }
/*     */     }
/* 223 */     switch (paramChar)
/*     */     {
/*     */     case '\r': 
/* 226 */       prevCharIsCR = true;
/* 227 */       break;
/*     */     case '\n': 
/* 229 */       prevCharIsLF = true;
/* 230 */       break;
/*     */     case '\t': 
/* 232 */       column -= 1;
/* 233 */       column += 8 - (column & 0x7);
/* 234 */       break;
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 239 */     bufline[bufpos] = line;
/* 240 */     bufcolumn[bufpos] = column;
/*     */   }
/*     */   
/*     */   public static final char readChar() throws IOException
/*     */   {
/* 245 */     if (inBuf > 0)
/*     */     {
/* 247 */       inBuf -= 1;
/* 248 */       return buffer[(++bufpos)];
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 253 */     if (++bufpos == available)
/* 254 */       AdjustBuffSize();
/*     */     char c;
/* 256 */     if ((buffer[bufpos] = c = (char)(0xFF & ReadByte())) == '\\')
/*     */     {
/* 258 */       UpdateLineColumn(c);
/*     */       
/* 260 */       int i = 1;
/*     */       
/*     */       for (;;)
/*     */       {
/* 264 */         if (++bufpos == available) {
/* 265 */           AdjustBuffSize();
/*     */         }
/*     */         try
/*     */         {
/* 269 */           if ((buffer[bufpos] = c = (char)(0xFF & ReadByte())) != '\\')
/*     */           {
/* 271 */             UpdateLineColumn(c);
/*     */             
/* 273 */             if ((c == 'u') && ((i & 0x1) == 1))
/*     */             {
/* 275 */               if (--bufpos < 0) {
/* 276 */                 bufpos = bufsize - 1;
/*     */               }
/* 278 */               break;
/*     */             }
/*     */             
/* 281 */             backup(i);
/* 282 */             return '\\';
/*     */           }
/*     */         }
/*     */         catch (IOException localIOException1)
/*     */         {
/* 287 */           if (i > 1) {
/* 288 */             backup(i);
/*     */           }
/* 290 */           return '\\';
/*     */         }
/*     */         
/* 293 */         UpdateLineColumn(c);
/* 294 */         i++;
/*     */       }
/*     */       
/*     */ 
/*     */       try
/*     */       {
/* 300 */         while ((c = (char)(0xFF & ReadByte())) == 'u') {
/* 301 */           column += 1;
/*     */         }
/* 303 */         buffer[bufpos] = (c = (char)(hexval(c) << 12 | hexval((char)(0xFF & ReadByte())) << 8 | hexval((char)(0xFF & ReadByte())) << 4 | hexval((char)(0xFF & ReadByte()))));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 308 */         column += 4;
/*     */       }
/*     */       catch (IOException localIOException2)
/*     */       {
/* 312 */         throw new Error("Invalid escape character at line " + line + " column " + column + '.');
/*     */       }
/*     */       
/*     */ 
/* 316 */       if (i == 1) {
/* 317 */         return c;
/*     */       }
/*     */       
/* 320 */       backup(i - 1);
/* 321 */       return '\\';
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 326 */     UpdateLineColumn(c);
/* 327 */     return c;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public static final int getColumn()
/*     */   {
/* 337 */     return bufcolumn[bufpos];
/*     */   }
/*     */   
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public static final int getLine()
/*     */   {
/* 346 */     return bufline[bufpos];
/*     */   }
/*     */   
/*     */   public static final int getEndColumn() {
/* 350 */     return bufcolumn[bufpos];
/*     */   }
/*     */   
/*     */   public static final int getEndLine() {
/* 354 */     return bufline[bufpos];
/*     */   }
/*     */   
/*     */   public static final int getBeginColumn() {
/* 358 */     return bufcolumn[tokenBegin];
/*     */   }
/*     */   
/*     */   public static final int getBeginLine() {
/* 362 */     return bufline[tokenBegin];
/*     */   }
/*     */   
/*     */   public static final void backup(int paramInt)
/*     */   {
/* 367 */     inBuf += paramInt;
/* 368 */     if ((bufpos = bufpos - paramInt) < 0) {
/* 369 */       bufpos += bufsize;
/*     */     }
/*     */   }
/*     */   
/*     */   public ASCII_UCodeESC_CharStream(Reader paramReader, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 375 */     if (inputStream != null) {
/* 376 */       throw new Error("\n   ERROR: Second call to the constructor of a static ASCII_UCodeESC_CharStream.  You must\n       either use ReInit() or set the JavaCC option STATIC to false\n       during the generation of this class.");
/*     */     }
/*     */     
/* 379 */     inputStream = paramReader;
/* 380 */     line = paramInt1;
/* 381 */     column = paramInt2 - 1;
/*     */     
/* 383 */     available = bufsize = paramInt3;
/* 384 */     buffer = new char[paramInt3];
/* 385 */     bufline = new int[paramInt3];
/* 386 */     bufcolumn = new int[paramInt3];
/* 387 */     nextCharBuf = new char['က'];
/*     */   }
/*     */   
/*     */ 
/*     */   public ASCII_UCodeESC_CharStream(Reader paramReader, int paramInt1, int paramInt2)
/*     */   {
/* 393 */     this(paramReader, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public final void ReInit(Reader paramReader, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 398 */     inputStream = paramReader;
/* 399 */     line = paramInt1;
/* 400 */     column = paramInt2 - 1;
/*     */     
/* 402 */     if ((buffer == null) || (paramInt3 != buffer.length))
/*     */     {
/* 404 */       available = bufsize = paramInt3;
/* 405 */       buffer = new char[paramInt3];
/* 406 */       bufline = new int[paramInt3];
/* 407 */       bufcolumn = new int[paramInt3];
/* 408 */       nextCharBuf = new char['က'];
/*     */     }
/* 410 */     prevCharIsLF = prevCharIsCR = 0;
/* 411 */     tokenBegin = inBuf = maxNextCharInd = 0;
/* 412 */     nextCharInd = bufpos = -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public final void ReInit(Reader paramReader, int paramInt1, int paramInt2)
/*     */   {
/* 418 */     ReInit(paramReader, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public ASCII_UCodeESC_CharStream(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 423 */     this(new java.io.InputStreamReader(paramInputStream), paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */ 
/*     */   public ASCII_UCodeESC_CharStream(InputStream paramInputStream, int paramInt1, int paramInt2)
/*     */   {
/* 429 */     this(paramInputStream, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */ 
/*     */   public final void ReInit(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 435 */     ReInit(new java.io.InputStreamReader(paramInputStream), paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public final void ReInit(InputStream paramInputStream, int paramInt1, int paramInt2)
/*     */   {
/* 440 */     ReInit(paramInputStream, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public static final String GetImage()
/*     */   {
/* 445 */     if (bufpos >= tokenBegin) {
/* 446 */       return new String(buffer, tokenBegin, bufpos - tokenBegin + 1);
/*     */     }
/* 448 */     return new String(buffer, tokenBegin, bufsize - tokenBegin) + new String(buffer, 0, bufpos + 1);
/*     */   }
/*     */   
/*     */ 
/*     */   public static final char[] GetSuffix(int paramInt)
/*     */   {
/* 454 */     char[] arrayOfChar = new char[paramInt];
/*     */     
/* 456 */     if (bufpos + 1 >= paramInt) {
/* 457 */       System.arraycopy(buffer, bufpos - paramInt + 1, arrayOfChar, 0, paramInt);
/*     */     }
/*     */     else {
/* 460 */       System.arraycopy(buffer, bufsize - (paramInt - bufpos - 1), arrayOfChar, 0, paramInt - bufpos - 1);
/*     */       
/* 462 */       System.arraycopy(buffer, 0, arrayOfChar, paramInt - bufpos - 1, bufpos + 1);
/*     */     }
/*     */     
/* 465 */     return arrayOfChar;
/*     */   }
/*     */   
/*     */   public static final void Done()
/*     */   {
/* 470 */     nextCharBuf = null;
/* 471 */     buffer = null;
/* 472 */     bufline = null;
/* 473 */     bufcolumn = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final void adjustBeginLineColumn(int paramInt1, int paramInt2)
/*     */   {
/* 481 */     int i = tokenBegin;
/*     */     
/*     */     int j;
/* 484 */     if (bufpos >= tokenBegin)
/*     */     {
/* 486 */       j = bufpos - tokenBegin + inBuf + 1;
/*     */     }
/*     */     else
/*     */     {
/* 490 */       j = bufsize - tokenBegin + bufpos + 1 + inBuf;
/*     */     }
/*     */     
/* 493 */     int k = 0;int m = 0;int n = 0;
/* 494 */     int i1 = 0;int i2 = 0;
/*     */     
/* 496 */     while ((k < j) && (bufline[(m = i % bufsize)] == bufline[(n = ++i % bufsize)]))
/*     */     {
/*     */ 
/* 499 */       bufline[m] = paramInt1;
/* 500 */       i1 = i2 + bufcolumn[n] - bufcolumn[m];
/* 501 */       bufcolumn[m] = (paramInt2 + i2);
/* 502 */       i2 = i1;
/* 503 */       k++;
/*     */     }
/*     */     
/* 506 */     if (k < j)
/*     */     {
/* 508 */       bufline[m] = (paramInt1++);
/* 509 */       bufcolumn[m] = (paramInt2 + i2);
/*     */       
/* 511 */       while (k++ < j)
/*     */       {
/* 513 */         if (bufline[(m = i % bufsize)] != bufline[(++i % bufsize)]) {
/* 514 */           bufline[m] = (paramInt1++);
/*     */         } else {
/* 516 */           bufline[m] = paramInt1;
/*     */         }
/*     */       }
/*     */     }
/* 520 */     line = bufline[m];
/* 521 */     column = bufcolumn[m];
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASCII_UCodeESC_CharStream.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */