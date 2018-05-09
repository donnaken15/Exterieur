/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Reader;
/*     */ 
/*     */ public class JavaCharStream
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
/*     */   protected static int[] bufline;
/*     */   protected static int[] bufcolumn;
/*  66 */   protected static int column = 0;
/*  67 */   protected static int line = 1;
/*     */   
/*  69 */   protected static boolean prevCharIsCR = false;
/*  70 */   protected static boolean prevCharIsLF = false;
/*     */   
/*     */   protected static Reader inputStream;
/*     */   
/*     */   protected static char[] nextCharBuf;
/*     */   protected static char[] buffer;
/*  76 */   protected static int maxNextCharInd = 0;
/*  77 */   protected static int nextCharInd = -1;
/*  78 */   protected static int inBuf = 0;
/*     */   
/*     */   protected static void ExpandBuff(boolean paramBoolean)
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
/*     */   protected static void FillBuff()
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
/*     */   protected static char ReadByte() throws IOException
/*     */   {
/* 162 */     if (++nextCharInd >= maxNextCharInd) {
/* 163 */       FillBuff();
/*     */     }
/* 165 */     return nextCharBuf[nextCharInd];
/*     */   }
/*     */   
/*     */   public static char BeginToken() throws IOException
/*     */   {
/* 170 */     if (inBuf > 0)
/*     */     {
/* 172 */       inBuf -= 1;
/*     */       
/* 174 */       if (++bufpos == bufsize) {
/* 175 */         bufpos = 0;
/*     */       }
/* 177 */       tokenBegin = bufpos;
/* 178 */       return buffer[bufpos];
/*     */     }
/*     */     
/* 181 */     tokenBegin = 0;
/* 182 */     bufpos = -1;
/*     */     
/* 184 */     return readChar();
/*     */   }
/*     */   
/*     */   protected static void AdjustBuffSize()
/*     */   {
/* 189 */     if (available == bufsize)
/*     */     {
/* 191 */       if (tokenBegin > 2048)
/*     */       {
/* 193 */         bufpos = 0;
/* 194 */         available = tokenBegin;
/*     */       }
/*     */       else {
/* 197 */         ExpandBuff(false);
/*     */       }
/* 199 */     } else if (available > tokenBegin) {
/* 200 */       available = bufsize;
/* 201 */     } else if (tokenBegin - available < 2048) {
/* 202 */       ExpandBuff(true);
/*     */     } else {
/* 204 */       available = tokenBegin;
/*     */     }
/*     */   }
/*     */   
/*     */   protected static void UpdateLineColumn(char paramChar) {
/* 209 */     column += 1;
/*     */     
/* 211 */     if (prevCharIsLF)
/*     */     {
/* 213 */       prevCharIsLF = false;
/* 214 */       line += (column = 1);
/*     */     }
/* 216 */     else if (prevCharIsCR)
/*     */     {
/* 218 */       prevCharIsCR = false;
/* 219 */       if (paramChar == '\n')
/*     */       {
/* 221 */         prevCharIsLF = true;
/*     */       }
/*     */       else {
/* 224 */         line += (column = 1);
/*     */       }
/*     */     }
/* 227 */     switch (paramChar)
/*     */     {
/*     */     case '\r': 
/* 230 */       prevCharIsCR = true;
/* 231 */       break;
/*     */     case '\n': 
/* 233 */       prevCharIsLF = true;
/* 234 */       break;
/*     */     case '\t': 
/* 236 */       column -= 1;
/* 237 */       column += 8 - (column & 0x7);
/* 238 */       break;
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 243 */     bufline[bufpos] = line;
/* 244 */     bufcolumn[bufpos] = column;
/*     */   }
/*     */   
/*     */   public static char readChar() throws IOException
/*     */   {
/* 249 */     if (inBuf > 0)
/*     */     {
/* 251 */       inBuf -= 1;
/*     */       
/* 253 */       if (++bufpos == bufsize) {
/* 254 */         bufpos = 0;
/*     */       }
/* 256 */       return buffer[bufpos];
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 261 */     if (++bufpos == available)
/* 262 */       AdjustBuffSize();
/*     */     char c;
/* 264 */     if ((buffer[bufpos] = c = ReadByte()) == '\\')
/*     */     {
/* 266 */       UpdateLineColumn(c);
/*     */       
/* 268 */       int i = 1;
/*     */       
/*     */       for (;;)
/*     */       {
/* 272 */         if (++bufpos == available) {
/* 273 */           AdjustBuffSize();
/*     */         }
/*     */         try
/*     */         {
/* 277 */           if ((buffer[bufpos] = c = ReadByte()) != '\\')
/*     */           {
/* 279 */             UpdateLineColumn(c);
/*     */             
/* 281 */             if ((c == 'u') && ((i & 0x1) == 1))
/*     */             {
/* 283 */               if (--bufpos < 0) {
/* 284 */                 bufpos = bufsize - 1;
/*     */               }
/* 286 */               break;
/*     */             }
/*     */             
/* 289 */             backup(i);
/* 290 */             return '\\';
/*     */           }
/*     */         }
/*     */         catch (IOException localIOException1)
/*     */         {
/* 295 */           if (i > 1) {
/* 296 */             backup(i);
/*     */           }
/* 298 */           return '\\';
/*     */         }
/*     */         
/* 301 */         UpdateLineColumn(c);
/* 302 */         i++;
/*     */       }
/*     */       
/*     */ 
/*     */       try
/*     */       {
/* 308 */         while ((c = ReadByte()) == 'u') {
/* 309 */           column += 1;
/*     */         }
/* 311 */         buffer[bufpos] = (c = (char)(hexval(c) << 12 | hexval(ReadByte()) << 8 | hexval(ReadByte()) << 4 | hexval(ReadByte())));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 316 */         column += 4;
/*     */       }
/*     */       catch (IOException localIOException2)
/*     */       {
/* 320 */         throw new Error("Invalid escape character at line " + line + " column " + column + '.');
/*     */       }
/*     */       
/*     */ 
/* 324 */       if (i == 1) {
/* 325 */         return c;
/*     */       }
/*     */       
/* 328 */       backup(i - 1);
/* 329 */       return '\\';
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 334 */     UpdateLineColumn(c);
/* 335 */     return c;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public static int getColumn()
/*     */   {
/* 345 */     return bufcolumn[bufpos];
/*     */   }
/*     */   
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public static int getLine()
/*     */   {
/* 354 */     return bufline[bufpos];
/*     */   }
/*     */   
/*     */   public static int getEndColumn() {
/* 358 */     return bufcolumn[bufpos];
/*     */   }
/*     */   
/*     */   public static int getEndLine() {
/* 362 */     return bufline[bufpos];
/*     */   }
/*     */   
/*     */   public static int getBeginColumn() {
/* 366 */     return bufcolumn[tokenBegin];
/*     */   }
/*     */   
/*     */   public static int getBeginLine() {
/* 370 */     return bufline[tokenBegin];
/*     */   }
/*     */   
/*     */   public static void backup(int paramInt)
/*     */   {
/* 375 */     inBuf += paramInt;
/* 376 */     if ((bufpos = bufpos - paramInt) < 0) {
/* 377 */       bufpos += bufsize;
/*     */     }
/*     */   }
/*     */   
/*     */   public JavaCharStream(Reader paramReader, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 383 */     if (inputStream != null) {
/* 384 */       throw new Error("\n   ERROR: Second call to the constructor of a static JavaCharStream.  You must\n       either use ReInit() or set the JavaCC option STATIC to false\n       during the generation of this class.");
/*     */     }
/*     */     
/* 387 */     inputStream = paramReader;
/* 388 */     line = paramInt1;
/* 389 */     column = paramInt2 - 1;
/*     */     
/* 391 */     available = bufsize = paramInt3;
/* 392 */     buffer = new char[paramInt3];
/* 393 */     bufline = new int[paramInt3];
/* 394 */     bufcolumn = new int[paramInt3];
/* 395 */     nextCharBuf = new char['က'];
/*     */   }
/*     */   
/*     */ 
/*     */   public JavaCharStream(Reader paramReader, int paramInt1, int paramInt2)
/*     */   {
/* 401 */     this(paramReader, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public JavaCharStream(Reader paramReader)
/*     */   {
/* 406 */     this(paramReader, 1, 1, 4096);
/*     */   }
/*     */   
/*     */   public void ReInit(Reader paramReader, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 411 */     inputStream = paramReader;
/* 412 */     line = paramInt1;
/* 413 */     column = paramInt2 - 1;
/*     */     
/* 415 */     if ((buffer == null) || (paramInt3 != buffer.length))
/*     */     {
/* 417 */       available = bufsize = paramInt3;
/* 418 */       buffer = new char[paramInt3];
/* 419 */       bufline = new int[paramInt3];
/* 420 */       bufcolumn = new int[paramInt3];
/* 421 */       nextCharBuf = new char['က'];
/*     */     }
/* 423 */     prevCharIsLF = prevCharIsCR = 0;
/* 424 */     tokenBegin = inBuf = maxNextCharInd = 0;
/* 425 */     nextCharInd = bufpos = -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public void ReInit(Reader paramReader, int paramInt1, int paramInt2)
/*     */   {
/* 431 */     ReInit(paramReader, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public void ReInit(Reader paramReader)
/*     */   {
/* 436 */     ReInit(paramReader, 1, 1, 4096);
/*     */   }
/*     */   
/*     */   public JavaCharStream(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 441 */     this(new java.io.InputStreamReader(paramInputStream), paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */ 
/*     */   public JavaCharStream(InputStream paramInputStream, int paramInt1, int paramInt2)
/*     */   {
/* 447 */     this(paramInputStream, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public JavaCharStream(InputStream paramInputStream)
/*     */   {
/* 452 */     this(paramInputStream, 1, 1, 4096);
/*     */   }
/*     */   
/*     */ 
/*     */   public void ReInit(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 458 */     ReInit(new java.io.InputStreamReader(paramInputStream), paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public void ReInit(InputStream paramInputStream, int paramInt1, int paramInt2)
/*     */   {
/* 463 */     ReInit(paramInputStream, paramInt1, paramInt2, 4096);
/*     */   }
/*     */   
/*     */   public void ReInit(InputStream paramInputStream) {
/* 467 */     ReInit(paramInputStream, 1, 1, 4096);
/*     */   }
/*     */   
/*     */   public static String GetImage()
/*     */   {
/* 472 */     if (bufpos >= tokenBegin) {
/* 473 */       return new String(buffer, tokenBegin, bufpos - tokenBegin + 1);
/*     */     }
/* 475 */     return new String(buffer, tokenBegin, bufsize - tokenBegin) + new String(buffer, 0, bufpos + 1);
/*     */   }
/*     */   
/*     */ 
/*     */   public static char[] GetSuffix(int paramInt)
/*     */   {
/* 481 */     char[] arrayOfChar = new char[paramInt];
/*     */     
/* 483 */     if (bufpos + 1 >= paramInt) {
/* 484 */       System.arraycopy(buffer, bufpos - paramInt + 1, arrayOfChar, 0, paramInt);
/*     */     }
/*     */     else {
/* 487 */       System.arraycopy(buffer, bufsize - (paramInt - bufpos - 1), arrayOfChar, 0, paramInt - bufpos - 1);
/*     */       
/* 489 */       System.arraycopy(buffer, 0, arrayOfChar, paramInt - bufpos - 1, bufpos + 1);
/*     */     }
/*     */     
/* 492 */     return arrayOfChar;
/*     */   }
/*     */   
/*     */   public static void Done()
/*     */   {
/* 497 */     nextCharBuf = null;
/* 498 */     buffer = null;
/* 499 */     bufline = null;
/* 500 */     bufcolumn = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void adjustBeginLineColumn(int paramInt1, int paramInt2)
/*     */   {
/* 508 */     int i = tokenBegin;
/*     */     
/*     */     int j;
/* 511 */     if (bufpos >= tokenBegin)
/*     */     {
/* 513 */       j = bufpos - tokenBegin + inBuf + 1;
/*     */     }
/*     */     else
/*     */     {
/* 517 */       j = bufsize - tokenBegin + bufpos + 1 + inBuf;
/*     */     }
/*     */     
/* 520 */     int k = 0;int m = 0;int n = 0;
/* 521 */     int i1 = 0;int i2 = 0;
/*     */     
/* 523 */     while ((k < j) && (bufline[(m = i % bufsize)] == bufline[(n = ++i % bufsize)]))
/*     */     {
/*     */ 
/* 526 */       bufline[m] = paramInt1;
/* 527 */       i1 = i2 + bufcolumn[n] - bufcolumn[m];
/* 528 */       bufcolumn[m] = (paramInt2 + i2);
/* 529 */       i2 = i1;
/* 530 */       k++;
/*     */     }
/*     */     
/* 533 */     if (k < j)
/*     */     {
/* 535 */       bufline[m] = (paramInt1++);
/* 536 */       bufcolumn[m] = (paramInt2 + i2);
/*     */       
/* 538 */       while (k++ < j)
/*     */       {
/* 540 */         if (bufline[(m = i % bufsize)] != bufline[(++i % bufsize)]) {
/* 541 */           bufline[m] = (paramInt1++);
/*     */         } else {
/* 543 */           bufline[m] = paramInt1;
/*     */         }
/*     */       }
/*     */     }
/* 547 */     line = bufline[m];
/* 548 */     column = bufcolumn[m];
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\JavaCharStream.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */