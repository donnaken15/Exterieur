/*      */ package TemplateCompiler;
/*      */ 
/*      */ import java.io.IOException;
/*      */ import java.io.PrintStream;
/*      */ 
/*      */ public class NLUTokenManager
/*      */   implements NLUConstants
/*      */ {
/*    9 */   public static PrintStream debugStream = System.out;
/*   10 */   public static void setDebugStream(PrintStream paramPrintStream) { debugStream = paramPrintStream; }
/*      */   
/*      */   private static final int jjStopStringLiteralDfa_0(int paramInt, long paramLong) {
/*   13 */     switch (paramInt)
/*      */     {
/*      */     case 0: 
/*   16 */       if ((paramLong & 0x2000000000000000) != 0L)
/*   17 */         return 3;
/*   18 */       if ((paramLong & 0xC000000) != 0L)
/*      */       {
/*   20 */         jjmatchedKind = 25;
/*   21 */         return -1;
/*      */       }
/*   23 */       if ((paramLong & 0x381F80) != 0L)
/*      */       {
/*   25 */         jjmatchedKind = 29;
/*   26 */         return 9;
/*      */       }
/*   28 */       return -1;
/*      */     case 1: 
/*   30 */       if ((paramLong & 0x281F80) != 0L)
/*      */       {
/*   32 */         jjmatchedKind = 29;
/*   33 */         jjmatchedPos = 1;
/*   34 */         return 9;
/*      */       }
/*   36 */       if ((paramLong & 0xC000000) != 0L)
/*      */       {
/*   38 */         if (jjmatchedPos == 0)
/*      */         {
/*   40 */           jjmatchedKind = 25;
/*   41 */           jjmatchedPos = 0;
/*      */         }
/*   43 */         return -1;
/*      */       }
/*   45 */       if ((paramLong & 0x100000) != 0L)
/*   46 */         return 9;
/*   47 */       return -1;
/*      */     case 2: 
/*   49 */       if ((paramLong & 0x81F80) != 0L)
/*      */       {
/*   51 */         jjmatchedKind = 29;
/*   52 */         jjmatchedPos = 2;
/*   53 */         return 9;
/*      */       }
/*   55 */       if ((paramLong & 0x200000) != 0L)
/*   56 */         return 9;
/*   57 */       return -1;
/*      */     case 3: 
/*   59 */       if ((paramLong & 0x81F80) != 0L)
/*      */       {
/*   61 */         jjmatchedKind = 29;
/*   62 */         jjmatchedPos = 3;
/*   63 */         return 9;
/*      */       }
/*   65 */       return -1;
/*      */     case 4: 
/*   67 */       if ((paramLong & 0x81F80) != 0L)
/*      */       {
/*   69 */         jjmatchedKind = 29;
/*   70 */         jjmatchedPos = 4;
/*   71 */         return 9;
/*      */       }
/*   73 */       return -1;
/*      */     case 5: 
/*   75 */       if ((paramLong & 0x81D80) != 0L)
/*      */       {
/*   77 */         jjmatchedKind = 29;
/*   78 */         jjmatchedPos = 5;
/*   79 */         return 9;
/*      */       }
/*   81 */       if ((paramLong & 0x200) != 0L)
/*   82 */         return 9;
/*   83 */       return -1;
/*      */     case 6: 
/*   85 */       if ((paramLong & 0x80) != 0L)
/*      */       {
/*   87 */         jjmatchedKind = 29;
/*   88 */         jjmatchedPos = 6;
/*   89 */         return 9;
/*      */       }
/*   91 */       if ((paramLong & 0x81D00) != 0L)
/*   92 */         return 9;
/*   93 */       return -1;
/*      */     case 7: 
/*   95 */       if ((paramLong & 0x80) != 0L)
/*   96 */         return 9;
/*   97 */       return -1;
/*      */     }
/*   99 */     return -1;
/*      */   }
/*      */   
/*      */   private static final int jjStartNfa_0(int paramInt, long paramLong)
/*      */   {
/*  104 */     return jjMoveNfa_0(jjStopStringLiteralDfa_0(paramInt, paramLong), paramInt + 1);
/*      */   }
/*      */   
/*      */   private static final int jjStopAtPos(int paramInt1, int paramInt2) {
/*  108 */     jjmatchedKind = paramInt2;
/*  109 */     jjmatchedPos = paramInt1;
/*  110 */     return paramInt1 + 1;
/*      */   }
/*      */   
/*      */   private static final int jjStartNfaWithStates_0(int paramInt1, int paramInt2, int paramInt3) {
/*  114 */     jjmatchedKind = paramInt2;
/*  115 */     jjmatchedPos = paramInt1;
/*  116 */     try { curChar = JavaCharStream.readChar();
/*  117 */     } catch (IOException localIOException) { return paramInt1 + 1; }
/*  118 */     return jjMoveNfa_0(paramInt3, paramInt1 + 1);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa0_0() {
/*  122 */     switch (curChar)
/*      */     {
/*      */     case '\r': 
/*  125 */       jjmatchedKind = 4;
/*  126 */       return jjMoveStringLiteralDfa1_0(64L);
/*      */     case '%': 
/*  128 */       return jjMoveStringLiteralDfa1_0(268697600L);
/*      */     case '&': 
/*  130 */       return jjStopAtPos(0, 24);
/*      */     case '(': 
/*  132 */       return jjStopAtPos(0, 13);
/*      */     case ')': 
/*  134 */       return jjStopAtPos(0, 14);
/*      */     case '/': 
/*  136 */       return jjMoveStringLiteralDfa1_0(2305843009213693952L);
/*      */     case ':': 
/*  138 */       return jjStopAtPos(0, 23);
/*      */     case ';': 
/*  140 */       return jjStopAtPos(0, 22);
/*      */     case '<': 
/*  142 */       return jjMoveStringLiteralDfa1_0(134217728L);
/*      */     case '=': 
/*  144 */       return jjMoveStringLiteralDfa1_0(67108864L);
/*      */     case '[': 
/*  146 */       return jjStopAtPos(0, 15);
/*      */     case ']': 
/*  148 */       return jjStopAtPos(0, 16);
/*      */     case 'a': 
/*  150 */       return jjMoveStringLiteralDfa1_0(2097152L);
/*      */     case 'd': 
/*  152 */       return jjMoveStringLiteralDfa1_0(7936L);
/*      */     case 'i': 
/*  154 */       return jjMoveStringLiteralDfa1_0(524288L);
/*      */     case 'o': 
/*  156 */       return jjMoveStringLiteralDfa1_0(1048576L);
/*      */     case 't': 
/*  158 */       return jjMoveStringLiteralDfa1_0(128L);
/*      */     case '|': 
/*  160 */       return jjStopAtPos(0, 17);
/*      */     }
/*  162 */     return jjMoveNfa_0(0, 0);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa1_0(long paramLong) {
/*      */     try {
/*  167 */       curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  169 */       jjStopStringLiteralDfa_0(0, paramLong);
/*  170 */       return 1;
/*      */     }
/*  172 */     switch (curChar)
/*      */     {
/*      */     case '\n': 
/*  175 */       if ((paramLong & 0x40) != 0L)
/*  176 */         return jjStopAtPos(1, 6);
/*  177 */       break;
/*      */     case '%': 
/*  179 */       return jjMoveStringLiteralDfa2_0(paramLong, 268435456L);
/*      */     case '*': 
/*  181 */       if ((paramLong & 0x2000000000000000) != 0L)
/*  182 */         return jjStopAtPos(1, 61);
/*  183 */       break;
/*      */     case '-': 
/*  185 */       if ((paramLong & 0x8000000) != 0L)
/*  186 */         return jjStopAtPos(1, 27);
/*  187 */       break;
/*      */     case '>': 
/*  189 */       if ((paramLong & 0x4000000) != 0L)
/*  190 */         return jjStopAtPos(1, 26);
/*  191 */       break;
/*      */     case 'e': 
/*  193 */       return jjMoveStringLiteralDfa2_0(paramLong, 8064L);
/*      */     case 'f': 
/*  195 */       return jjMoveStringLiteralDfa2_0(paramLong, 262144L);
/*      */     case 'n': 
/*  197 */       return jjMoveStringLiteralDfa2_0(paramLong, 2621440L);
/*      */     case 'r': 
/*  199 */       if ((paramLong & 0x100000) != 0L)
/*  200 */         return jjStartNfaWithStates_0(1, 20, 9);
/*  201 */       break;
/*      */     }
/*      */     
/*      */     
/*  205 */     return jjStartNfa_0(0, paramLong);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa2_0(long paramLong1, long paramLong2) {
/*  209 */     if ((paramLong2 &= paramLong1) == 0L)
/*  210 */       return jjStartNfa_0(0, paramLong1);
/*  211 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  213 */       jjStopStringLiteralDfa_0(1, paramLong2);
/*  214 */       return 2;
/*      */     }
/*  216 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  219 */       return jjMoveStringLiteralDfa3_0(paramLong2, 268435456L);
/*      */     case 'c': 
/*  221 */       return jjMoveStringLiteralDfa3_0(paramLong2, 528384L);
/*      */     case 'd': 
/*  223 */       if ((paramLong2 & 0x200000) != 0L)
/*  224 */         return jjStartNfaWithStates_0(2, 21, 9);
/*  225 */       break;
/*      */     case 'f': 
/*  227 */       return jjMoveStringLiteralDfa3_0(paramLong2, 3840L);
/*      */     case 'm': 
/*  229 */       return jjMoveStringLiteralDfa3_0(paramLong2, 128L);
/*      */     case 'r': 
/*  231 */       return jjMoveStringLiteralDfa3_0(paramLong2, 262144L);
/*      */     }
/*      */     
/*      */     
/*  235 */     return jjStartNfa_0(1, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa3_0(long paramLong1, long paramLong2) {
/*  239 */     if ((paramLong2 &= paramLong1) == 0L)
/*  240 */       return jjStartNfa_0(1, paramLong1);
/*  241 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  243 */       jjStopStringLiteralDfa_0(2, paramLong2);
/*  244 */       return 3;
/*      */     }
/*  246 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  249 */       return jjMoveStringLiteralDfa4_0(paramLong2, 268435456L);
/*      */     case 'b': 
/*  251 */       return jjMoveStringLiteralDfa4_0(paramLong2, 2048L);
/*      */     case 'l': 
/*  253 */       return jjMoveStringLiteralDfa4_0(paramLong2, 528384L);
/*      */     case 'm': 
/*  255 */       return jjMoveStringLiteralDfa4_0(paramLong2, 512L);
/*      */     case 'o': 
/*  257 */       return jjMoveStringLiteralDfa4_0(paramLong2, 262144L);
/*      */     case 'p': 
/*  259 */       return jjMoveStringLiteralDfa4_0(paramLong2, 128L);
/*      */     case 'r': 
/*  261 */       return jjMoveStringLiteralDfa4_0(paramLong2, 256L);
/*      */     case 't': 
/*  263 */       return jjMoveStringLiteralDfa4_0(paramLong2, 1024L);
/*      */     }
/*      */     
/*      */     
/*  267 */     return jjStartNfa_0(2, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa4_0(long paramLong1, long paramLong2) {
/*  271 */     if ((paramLong2 &= paramLong1) == 0L)
/*  272 */       return jjStartNfa_0(2, paramLong1);
/*  273 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  275 */       jjStopStringLiteralDfa_0(3, paramLong2);
/*  276 */       return 4;
/*      */     }
/*  278 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  281 */       return jjMoveStringLiteralDfa5_0(paramLong2, 268435456L);
/*      */     case 'a': 
/*  283 */       return jjMoveStringLiteralDfa5_0(paramLong2, 4608L);
/*      */     case 'e': 
/*  285 */       return jjMoveStringLiteralDfa5_0(paramLong2, 2048L);
/*      */     case 'l': 
/*  287 */       return jjMoveStringLiteralDfa5_0(paramLong2, 128L);
/*      */     case 'm': 
/*  289 */       return jjMoveStringLiteralDfa5_0(paramLong2, 262144L);
/*      */     case 'u': 
/*  291 */       return jjMoveStringLiteralDfa5_0(paramLong2, 524544L);
/*      */     case 'y': 
/*  293 */       return jjMoveStringLiteralDfa5_0(paramLong2, 1024L);
/*      */     }
/*      */     
/*      */     
/*  297 */     return jjStartNfa_0(3, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa5_0(long paramLong1, long paramLong2) {
/*  301 */     if ((paramLong2 &= paramLong1) == 0L)
/*  302 */       return jjStartNfa_0(3, paramLong1);
/*  303 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  305 */       jjStopStringLiteralDfa_0(4, paramLong2);
/*  306 */       return 5;
/*      */     }
/*  308 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  311 */       return jjMoveStringLiteralDfa6_0(paramLong2, 268435456L);
/*      */     case 'a': 
/*  313 */       return jjMoveStringLiteralDfa6_0(paramLong2, 2176L);
/*      */     case 'd': 
/*  315 */       return jjMoveStringLiteralDfa6_0(paramLong2, 524288L);
/*      */     case 'f': 
/*  317 */       return jjMoveStringLiteralDfa6_0(paramLong2, 262144L);
/*      */     case 'l': 
/*  319 */       return jjMoveStringLiteralDfa6_0(paramLong2, 256L);
/*      */     case 'p': 
/*  321 */       if ((paramLong2 & 0x200) != 0L)
/*  322 */         return jjStartNfaWithStates_0(5, 9, 9);
/*  323 */       return jjMoveStringLiteralDfa6_0(paramLong2, 1024L);
/*      */     case 'r': 
/*  325 */       return jjMoveStringLiteralDfa6_0(paramLong2, 4096L);
/*      */     }
/*      */     
/*      */     
/*  329 */     return jjStartNfa_0(4, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa6_0(long paramLong1, long paramLong2) {
/*  333 */     if ((paramLong2 &= paramLong1) == 0L)
/*  334 */       return jjStartNfa_0(4, paramLong1);
/*  335 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  337 */       jjStopStringLiteralDfa_0(5, paramLong2);
/*  338 */       return 6;
/*      */     }
/*  340 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  343 */       return jjMoveStringLiteralDfa7_0(paramLong2, 268435456L);
/*      */     case 'e': 
/*  345 */       if ((paramLong2 & 0x100) != 0L)
/*  346 */         return jjStartNfaWithStates_0(6, 8, 9);
/*  347 */       if ((paramLong2 & 0x400) != 0L)
/*  348 */         return jjStartNfaWithStates_0(6, 10, 9);
/*  349 */       if ((paramLong2 & 0x1000) != 0L)
/*  350 */         return jjStartNfaWithStates_0(6, 12, 9);
/*  351 */       if ((paramLong2 & 0x80000) != 0L)
/*  352 */         return jjStartNfaWithStates_0(6, 19, 9);
/*  353 */       break;
/*      */     case 'i': 
/*  355 */       return jjMoveStringLiteralDfa7_0(paramLong2, 262144L);
/*      */     case 't': 
/*  357 */       if ((paramLong2 & 0x800) != 0L)
/*  358 */         return jjStartNfaWithStates_0(6, 11, 9);
/*  359 */       return jjMoveStringLiteralDfa7_0(paramLong2, 128L);
/*      */     }
/*      */     
/*      */     
/*  363 */     return jjStartNfa_0(5, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa7_0(long paramLong1, long paramLong2) {
/*  367 */     if ((paramLong2 &= paramLong1) == 0L)
/*  368 */       return jjStartNfa_0(5, paramLong1);
/*  369 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  371 */       jjStopStringLiteralDfa_0(6, paramLong2);
/*  372 */       return 7;
/*      */     }
/*  374 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  377 */       return jjMoveStringLiteralDfa8_0(paramLong2, 268435456L);
/*      */     case 'e': 
/*  379 */       if ((paramLong2 & 0x80) != 0L)
/*  380 */         return jjStartNfaWithStates_0(7, 7, 9);
/*  381 */       break;
/*      */     case 'l': 
/*  383 */       return jjMoveStringLiteralDfa8_0(paramLong2, 262144L);
/*      */     }
/*      */     
/*      */     
/*  387 */     return jjStartNfa_0(6, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa8_0(long paramLong1, long paramLong2) {
/*  391 */     if ((paramLong2 &= paramLong1) == 0L)
/*  392 */       return jjStartNfa_0(6, paramLong1);
/*  393 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  395 */       jjStopStringLiteralDfa_0(7, paramLong2);
/*  396 */       return 8;
/*      */     }
/*  398 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  401 */       return jjMoveStringLiteralDfa9_0(paramLong2, 268435456L);
/*      */     case 'e': 
/*  403 */       if ((paramLong2 & 0x40000) != 0L)
/*  404 */         return jjStopAtPos(8, 18);
/*  405 */       break;
/*      */     }
/*      */     
/*      */     
/*  409 */     return jjStartNfa_0(7, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa9_0(long paramLong1, long paramLong2) {
/*  413 */     if ((paramLong2 &= paramLong1) == 0L)
/*  414 */       return jjStartNfa_0(7, paramLong1);
/*  415 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  417 */       jjStopStringLiteralDfa_0(8, paramLong2);
/*  418 */       return 9;
/*      */     }
/*  420 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  423 */       return jjMoveStringLiteralDfa10_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  427 */     return jjStartNfa_0(8, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa10_0(long paramLong1, long paramLong2) {
/*  431 */     if ((paramLong2 &= paramLong1) == 0L)
/*  432 */       return jjStartNfa_0(8, paramLong1);
/*  433 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  435 */       jjStopStringLiteralDfa_0(9, paramLong2);
/*  436 */       return 10;
/*      */     }
/*  438 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  441 */       return jjMoveStringLiteralDfa11_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  445 */     return jjStartNfa_0(9, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa11_0(long paramLong1, long paramLong2) {
/*  449 */     if ((paramLong2 &= paramLong1) == 0L)
/*  450 */       return jjStartNfa_0(9, paramLong1);
/*  451 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  453 */       jjStopStringLiteralDfa_0(10, paramLong2);
/*  454 */       return 11;
/*      */     }
/*  456 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  459 */       return jjMoveStringLiteralDfa12_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  463 */     return jjStartNfa_0(10, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa12_0(long paramLong1, long paramLong2) {
/*  467 */     if ((paramLong2 &= paramLong1) == 0L)
/*  468 */       return jjStartNfa_0(10, paramLong1);
/*  469 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  471 */       jjStopStringLiteralDfa_0(11, paramLong2);
/*  472 */       return 12;
/*      */     }
/*  474 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  477 */       return jjMoveStringLiteralDfa13_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  481 */     return jjStartNfa_0(11, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa13_0(long paramLong1, long paramLong2) {
/*  485 */     if ((paramLong2 &= paramLong1) == 0L)
/*  486 */       return jjStartNfa_0(11, paramLong1);
/*  487 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  489 */       jjStopStringLiteralDfa_0(12, paramLong2);
/*  490 */       return 13;
/*      */     }
/*  492 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  495 */       return jjMoveStringLiteralDfa14_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  499 */     return jjStartNfa_0(12, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa14_0(long paramLong1, long paramLong2) {
/*  503 */     if ((paramLong2 &= paramLong1) == 0L)
/*  504 */       return jjStartNfa_0(12, paramLong1);
/*  505 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  507 */       jjStopStringLiteralDfa_0(13, paramLong2);
/*  508 */       return 14;
/*      */     }
/*  510 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  513 */       return jjMoveStringLiteralDfa15_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  517 */     return jjStartNfa_0(13, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa15_0(long paramLong1, long paramLong2) {
/*  521 */     if ((paramLong2 &= paramLong1) == 0L)
/*  522 */       return jjStartNfa_0(13, paramLong1);
/*  523 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  525 */       jjStopStringLiteralDfa_0(14, paramLong2);
/*  526 */       return 15;
/*      */     }
/*  528 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  531 */       return jjMoveStringLiteralDfa16_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  535 */     return jjStartNfa_0(14, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa16_0(long paramLong1, long paramLong2) {
/*  539 */     if ((paramLong2 &= paramLong1) == 0L)
/*  540 */       return jjStartNfa_0(14, paramLong1);
/*  541 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  543 */       jjStopStringLiteralDfa_0(15, paramLong2);
/*  544 */       return 16;
/*      */     }
/*  546 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  549 */       return jjMoveStringLiteralDfa17_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  553 */     return jjStartNfa_0(15, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa17_0(long paramLong1, long paramLong2) {
/*  557 */     if ((paramLong2 &= paramLong1) == 0L)
/*  558 */       return jjStartNfa_0(15, paramLong1);
/*  559 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  561 */       jjStopStringLiteralDfa_0(16, paramLong2);
/*  562 */       return 17;
/*      */     }
/*  564 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  567 */       return jjMoveStringLiteralDfa18_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  571 */     return jjStartNfa_0(16, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa18_0(long paramLong1, long paramLong2) {
/*  575 */     if ((paramLong2 &= paramLong1) == 0L)
/*  576 */       return jjStartNfa_0(16, paramLong1);
/*  577 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  579 */       jjStopStringLiteralDfa_0(17, paramLong2);
/*  580 */       return 18;
/*      */     }
/*  582 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  585 */       return jjMoveStringLiteralDfa19_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  589 */     return jjStartNfa_0(17, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa19_0(long paramLong1, long paramLong2) {
/*  593 */     if ((paramLong2 &= paramLong1) == 0L)
/*  594 */       return jjStartNfa_0(17, paramLong1);
/*  595 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  597 */       jjStopStringLiteralDfa_0(18, paramLong2);
/*  598 */       return 19;
/*      */     }
/*  600 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  603 */       return jjMoveStringLiteralDfa20_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  607 */     return jjStartNfa_0(18, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa20_0(long paramLong1, long paramLong2) {
/*  611 */     if ((paramLong2 &= paramLong1) == 0L)
/*  612 */       return jjStartNfa_0(18, paramLong1);
/*  613 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  615 */       jjStopStringLiteralDfa_0(19, paramLong2);
/*  616 */       return 20;
/*      */     }
/*  618 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  621 */       return jjMoveStringLiteralDfa21_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  625 */     return jjStartNfa_0(19, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa21_0(long paramLong1, long paramLong2) {
/*  629 */     if ((paramLong2 &= paramLong1) == 0L)
/*  630 */       return jjStartNfa_0(19, paramLong1);
/*  631 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  633 */       jjStopStringLiteralDfa_0(20, paramLong2);
/*  634 */       return 21;
/*      */     }
/*  636 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  639 */       return jjMoveStringLiteralDfa22_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  643 */     return jjStartNfa_0(20, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa22_0(long paramLong1, long paramLong2) {
/*  647 */     if ((paramLong2 &= paramLong1) == 0L)
/*  648 */       return jjStartNfa_0(20, paramLong1);
/*  649 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  651 */       jjStopStringLiteralDfa_0(21, paramLong2);
/*  652 */       return 22;
/*      */     }
/*  654 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  657 */       return jjMoveStringLiteralDfa23_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  661 */     return jjStartNfa_0(21, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa23_0(long paramLong1, long paramLong2) {
/*  665 */     if ((paramLong2 &= paramLong1) == 0L)
/*  666 */       return jjStartNfa_0(21, paramLong1);
/*  667 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  669 */       jjStopStringLiteralDfa_0(22, paramLong2);
/*  670 */       return 23;
/*      */     }
/*  672 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  675 */       return jjMoveStringLiteralDfa24_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  679 */     return jjStartNfa_0(22, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa24_0(long paramLong1, long paramLong2) {
/*  683 */     if ((paramLong2 &= paramLong1) == 0L)
/*  684 */       return jjStartNfa_0(22, paramLong1);
/*  685 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  687 */       jjStopStringLiteralDfa_0(23, paramLong2);
/*  688 */       return 24;
/*      */     }
/*  690 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  693 */       return jjMoveStringLiteralDfa25_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  697 */     return jjStartNfa_0(23, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa25_0(long paramLong1, long paramLong2) {
/*  701 */     if ((paramLong2 &= paramLong1) == 0L)
/*  702 */       return jjStartNfa_0(23, paramLong1);
/*  703 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  705 */       jjStopStringLiteralDfa_0(24, paramLong2);
/*  706 */       return 25;
/*      */     }
/*  708 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  711 */       return jjMoveStringLiteralDfa26_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  715 */     return jjStartNfa_0(24, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa26_0(long paramLong1, long paramLong2) {
/*  719 */     if ((paramLong2 &= paramLong1) == 0L)
/*  720 */       return jjStartNfa_0(24, paramLong1);
/*  721 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  723 */       jjStopStringLiteralDfa_0(25, paramLong2);
/*  724 */       return 26;
/*      */     }
/*  726 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  729 */       return jjMoveStringLiteralDfa27_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  733 */     return jjStartNfa_0(25, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa27_0(long paramLong1, long paramLong2) {
/*  737 */     if ((paramLong2 &= paramLong1) == 0L)
/*  738 */       return jjStartNfa_0(25, paramLong1);
/*  739 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  741 */       jjStopStringLiteralDfa_0(26, paramLong2);
/*  742 */       return 27;
/*      */     }
/*  744 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  747 */       return jjMoveStringLiteralDfa28_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  751 */     return jjStartNfa_0(26, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa28_0(long paramLong1, long paramLong2) {
/*  755 */     if ((paramLong2 &= paramLong1) == 0L)
/*  756 */       return jjStartNfa_0(26, paramLong1);
/*  757 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  759 */       jjStopStringLiteralDfa_0(27, paramLong2);
/*  760 */       return 28;
/*      */     }
/*  762 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  765 */       return jjMoveStringLiteralDfa29_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  769 */     return jjStartNfa_0(27, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa29_0(long paramLong1, long paramLong2) {
/*  773 */     if ((paramLong2 &= paramLong1) == 0L)
/*  774 */       return jjStartNfa_0(27, paramLong1);
/*  775 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  777 */       jjStopStringLiteralDfa_0(28, paramLong2);
/*  778 */       return 29;
/*      */     }
/*  780 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  783 */       return jjMoveStringLiteralDfa30_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  787 */     return jjStartNfa_0(28, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa30_0(long paramLong1, long paramLong2) {
/*  791 */     if ((paramLong2 &= paramLong1) == 0L)
/*  792 */       return jjStartNfa_0(28, paramLong1);
/*  793 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  795 */       jjStopStringLiteralDfa_0(29, paramLong2);
/*  796 */       return 30;
/*      */     }
/*  798 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  801 */       return jjMoveStringLiteralDfa31_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  805 */     return jjStartNfa_0(29, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa31_0(long paramLong1, long paramLong2) {
/*  809 */     if ((paramLong2 &= paramLong1) == 0L)
/*  810 */       return jjStartNfa_0(29, paramLong1);
/*  811 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  813 */       jjStopStringLiteralDfa_0(30, paramLong2);
/*  814 */       return 31;
/*      */     }
/*  816 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  819 */       return jjMoveStringLiteralDfa32_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  823 */     return jjStartNfa_0(30, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa32_0(long paramLong1, long paramLong2) {
/*  827 */     if ((paramLong2 &= paramLong1) == 0L)
/*  828 */       return jjStartNfa_0(30, paramLong1);
/*  829 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  831 */       jjStopStringLiteralDfa_0(31, paramLong2);
/*  832 */       return 32;
/*      */     }
/*  834 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  837 */       return jjMoveStringLiteralDfa33_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  841 */     return jjStartNfa_0(31, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa33_0(long paramLong1, long paramLong2) {
/*  845 */     if ((paramLong2 &= paramLong1) == 0L)
/*  846 */       return jjStartNfa_0(31, paramLong1);
/*  847 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  849 */       jjStopStringLiteralDfa_0(32, paramLong2);
/*  850 */       return 33;
/*      */     }
/*  852 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  855 */       return jjMoveStringLiteralDfa34_0(paramLong2, 268435456L);
/*      */     }
/*      */     
/*      */     
/*  859 */     return jjStartNfa_0(32, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa34_0(long paramLong1, long paramLong2) {
/*  863 */     if ((paramLong2 &= paramLong1) == 0L)
/*  864 */       return jjStartNfa_0(32, paramLong1);
/*  865 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  867 */       jjStopStringLiteralDfa_0(33, paramLong2);
/*  868 */       return 34;
/*      */     }
/*  870 */     switch (curChar)
/*      */     {
/*      */     case '%': 
/*  873 */       if ((paramLong2 & 0x10000000) != 0L)
/*  874 */         return jjStopAtPos(34, 28);
/*  875 */       break;
/*      */     }
/*      */     
/*      */     
/*  879 */     return jjStartNfa_0(33, paramLong2);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAdd(int paramInt) {
/*  883 */     if (jjrounds[paramInt] != jjround)
/*      */     {
/*  885 */       jjstateSet[(jjnewStateCnt++)] = paramInt;
/*  886 */       jjrounds[paramInt] = jjround;
/*      */     }
/*      */   }
/*      */   
/*      */   private static final void jjAddStates(int paramInt1, int paramInt2) {
/*      */     do {
/*  892 */       jjstateSet[(jjnewStateCnt++)] = jjnextStates[paramInt1];
/*  893 */     } while (paramInt1++ != paramInt2);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAddTwoStates(int paramInt1, int paramInt2) {
/*  897 */     jjCheckNAdd(paramInt1);
/*  898 */     jjCheckNAdd(paramInt2);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAddStates(int paramInt1, int paramInt2) {
/*      */     do {
/*  903 */       jjCheckNAdd(jjnextStates[paramInt1]);
/*  904 */     } while (paramInt1++ != paramInt2);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAddStates(int paramInt) {
/*  908 */     jjCheckNAdd(jjnextStates[paramInt]);
/*  909 */     jjCheckNAdd(jjnextStates[(paramInt + 1)]); }
/*      */   
/*  911 */   static final long[] jjbitVec0 = { -2L, -1, -1, -1 };
/*      */   
/*      */ 
/*  914 */   static final long[] jjbitVec2 = { 0, 0, -1, -1 };
/*      */   
/*      */ 
/*      */ 
/*      */   private static final int jjMoveNfa_0(int paramInt1, int paramInt2)
/*      */   {
/*  920 */     int i = 0;
/*  921 */     jjnewStateCnt = 9;
/*  922 */     int j = 1;
/*  923 */     jjstateSet[0] = paramInt1;
/*  924 */     int k = Integer.MAX_VALUE;
/*      */     for (;;)
/*      */     {
/*  927 */       if (++jjround == Integer.MAX_VALUE)
/*  928 */         ReInitRounds();
/*  929 */       long l1; if (curChar < '@')
/*      */       {
/*  931 */         l1 = 1L << curChar;
/*      */         do
/*      */         {
/*  934 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 9: 
/*  937 */             if ((0x83FF6C0000000000 & l1) != 0L)
/*      */             {
/*  939 */               if (k > 29)
/*  940 */                 k = 29;
/*  941 */               jjCheckNAdd(1);
/*      */             }
/*  943 */             if ((0x3FF600000000000 & l1) != 0L)
/*      */             {
/*  945 */               if (k > 30)
/*  946 */                 k = 30;
/*  947 */               jjCheckNAdd(2);
/*      */             }
/*  949 */             break;
/*      */           case 0: 
/*  951 */             if ((0x83FF6C0000000000 & l1) != 0L)
/*      */             {
/*  953 */               if (k > 29)
/*  954 */                 k = 29;
/*  955 */               jjCheckNAdd(1);
/*      */             }
/*  957 */             else if ((0x7000000000000000 & l1) != 0L)
/*      */             {
/*  959 */               if (k > 25) {
/*  960 */                 k = 25;
/*      */               }
/*  962 */             } else if (curChar == '/') {
/*  963 */               jjstateSet[(jjnewStateCnt++)] = 3; }
/*  964 */             if ((0x3FF600000000000 & l1) != 0L)
/*      */             {
/*  966 */               if (k > 30)
/*  967 */                 k = 30;
/*  968 */               jjCheckNAdd(2);
/*      */             }
/*  970 */             break;
/*      */           case 1: 
/*  972 */             if ((0x83FF6C0000000000 & l1) != 0L)
/*      */             {
/*  974 */               if (k > 29)
/*  975 */                 k = 29;
/*  976 */               jjCheckNAdd(1); }
/*  977 */             break;
/*      */           case 2: 
/*  979 */             if ((0x3FF600000000000 & l1) != 0L)
/*      */             {
/*  981 */               if (k > 30)
/*  982 */                 k = 30;
/*  983 */               jjCheckNAdd(2); }
/*  984 */             break;
/*      */           case 3: 
/*  986 */             if (curChar == '/')
/*  987 */               jjCheckNAddStates(0, 2);
/*  988 */             break;
/*      */           case 4: 
/*  990 */             if ((0xFFFFFFFFFFFFDBFF & l1) != 0L)
/*  991 */               jjCheckNAddStates(0, 2);
/*  992 */             break;
/*      */           case 5: 
/*  994 */             if (((0x2400 & l1) != 0L) && (k > 60))
/*  995 */               k = 60;
/*  996 */             break;
/*      */           case 6: 
/*  998 */             if ((curChar == '\n') && (k > 60))
/*  999 */               k = 60;
/* 1000 */             break;
/*      */           case 7: 
/* 1002 */             if (curChar == '\r')
/* 1003 */               jjstateSet[(jjnewStateCnt++)] = 6;
/* 1004 */             break;
/*      */           case 8: 
/* 1006 */             if (curChar == '/') {
/* 1007 */               jjstateSet[(jjnewStateCnt++)] = 3;
/*      */             }
/*      */           }
/*      */           
/* 1011 */         } while (j != i);
/*      */       }
/* 1013 */       else if (curChar < '')
/*      */       {
/* 1015 */         l1 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1018 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 9: 
/* 1021 */             if ((0x7FFFFFE97FFFFFE & l1) != 0L)
/*      */             {
/* 1023 */               if (k > 30)
/* 1024 */                 k = 30;
/* 1025 */               jjCheckNAdd(2);
/*      */             }
/* 1027 */             if ((0x7FFFFFE87FFFFFE & l1) != 0L)
/*      */             {
/* 1029 */               if (k > 29)
/* 1030 */                 k = 29;
/* 1031 */               jjCheckNAdd(1);
/*      */             }
/* 1033 */             break;
/*      */           case 0: 
/* 1035 */             if ((0x7FFFFFE97FFFFFE & l1) != 0L)
/*      */             {
/* 1037 */               if (k > 30)
/* 1038 */                 k = 30;
/* 1039 */               jjCheckNAdd(2);
/*      */             }
/* 1041 */             if ((0x7FFFFFE87FFFFFE & l1) != 0L)
/*      */             {
/* 1043 */               if (k > 29)
/* 1044 */                 k = 29;
/* 1045 */               jjCheckNAdd(1);
/*      */             }
/* 1047 */             break;
/*      */           case 1: 
/* 1049 */             if ((0x7FFFFFE87FFFFFE & l1) != 0L)
/*      */             {
/* 1051 */               if (k > 29)
/* 1052 */                 k = 29;
/* 1053 */               jjCheckNAdd(1); }
/* 1054 */             break;
/*      */           case 2: 
/* 1056 */             if ((0x7FFFFFE97FFFFFE & l1) != 0L)
/*      */             {
/* 1058 */               if (k > 30)
/* 1059 */                 k = 30;
/* 1060 */               jjCheckNAdd(2); }
/* 1061 */             break;
/*      */           case 4: 
/* 1063 */             jjAddStates(0, 2);
/*      */           
/*      */           }
/*      */           
/* 1067 */         } while (j != i);
/*      */       }
/*      */       else
/*      */       {
/* 1071 */         int m = curChar >> '\b';
/* 1072 */         int n = m >> 6;
/* 1073 */         long l2 = 1L << (m & 0x3F);
/* 1074 */         int i1 = (curChar & 0xFF) >> '\006';
/* 1075 */         long l3 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1078 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 4: 
/* 1081 */             if (jjCanMove_0(m, n, i1, l2, l3)) {
/* 1082 */               jjAddStates(0, 2);
/*      */             }
/*      */           }
/*      */           
/* 1086 */         } while (j != i);
/*      */       }
/* 1088 */       if (k != Integer.MAX_VALUE)
/*      */       {
/* 1090 */         jjmatchedKind = k;
/* 1091 */         jjmatchedPos = paramInt2;
/* 1092 */         k = Integer.MAX_VALUE;
/*      */       }
/* 1094 */       paramInt2++;
/* 1095 */       if ((j = jjnewStateCnt) == (i = 9 - (jjnewStateCnt = i)))
/* 1096 */         return paramInt2;
/* 1097 */       try { curChar = JavaCharStream.readChar();
/* 1098 */       } catch (IOException localIOException) { return paramInt2;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/* 1103 */   private static final int jjMoveStringLiteralDfa0_2() { switch (curChar)
/*      */     {
/*      */     case '*': 
/* 1106 */       return jjMoveStringLiteralDfa1_2(4611686018427387904L);
/*      */     }
/* 1108 */     return 1;
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa1_2(long paramLong) {
/*      */     try {
/* 1113 */       curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1115 */       return 1;
/*      */     }
/* 1117 */     switch (curChar)
/*      */     {
/*      */     case '/': 
/* 1120 */       if ((paramLong & 0x4000000000000000) != 0L)
/* 1121 */         return jjStopAtPos(1, 62);
/* 1122 */       break;
/*      */     default: 
/* 1124 */       return 2;
/*      */     }
/* 1126 */     return 2;
/*      */   }
/*      */   
/*      */   private static final int jjStopStringLiteralDfa_1(int paramInt, long paramLong) {
/* 1130 */     switch (paramInt)
/*      */     {
/*      */     case 0: 
/* 1133 */       if ((paramLong & 0x780000000) != 0L)
/*      */       {
/* 1135 */         jjmatchedKind = 46;
/* 1136 */         return 2;
/*      */       }
/* 1138 */       return -1;
/*      */     case 1: 
/* 1140 */       if ((paramLong & 0x780000000) != 0L)
/*      */       {
/* 1142 */         jjmatchedKind = 46;
/* 1143 */         jjmatchedPos = 1;
/* 1144 */         return 2;
/*      */       }
/* 1146 */       return -1;
/*      */     case 2: 
/* 1148 */       if ((paramLong & 0x300000000) != 0L)
/* 1149 */         return 2;
/* 1150 */       if ((paramLong & 0x480000000) != 0L)
/*      */       {
/* 1152 */         jjmatchedKind = 46;
/* 1153 */         jjmatchedPos = 2;
/* 1154 */         return 2;
/*      */       }
/* 1156 */       return -1;
/*      */     }
/* 1158 */     return -1;
/*      */   }
/*      */   
/*      */   private static final int jjStartNfa_1(int paramInt, long paramLong)
/*      */   {
/* 1163 */     return jjMoveNfa_1(jjStopStringLiteralDfa_1(paramInt, paramLong), paramInt + 1);
/*      */   }
/*      */   
/*      */   private static final int jjStartNfaWithStates_1(int paramInt1, int paramInt2, int paramInt3) {
/* 1167 */     jjmatchedKind = paramInt2;
/* 1168 */     jjmatchedPos = paramInt1;
/* 1169 */     try { curChar = JavaCharStream.readChar();
/* 1170 */     } catch (IOException localIOException) { return paramInt1 + 1; }
/* 1171 */     return jjMoveNfa_1(paramInt3, paramInt1 + 1);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa0_1() {
/* 1175 */     switch (curChar)
/*      */     {
/*      */     case '\r': 
/* 1178 */       jjmatchedKind = 57;
/* 1179 */       return jjMoveStringLiteralDfa1_1(576460752303423488L);
/*      */     case '(': 
/* 1181 */       return jjStopAtPos(0, 35);
/*      */     case ')': 
/* 1183 */       return jjStopAtPos(0, 36);
/*      */     case '-': 
/* 1185 */       return jjStopAtPos(0, 41);
/*      */     case '<': 
/* 1187 */       return jjStopAtPos(0, 39);
/*      */     case '>': 
/* 1189 */       return jjStopAtPos(0, 40);
/*      */     case '[': 
/* 1191 */       return jjStopAtPos(0, 37);
/*      */     case ']': 
/* 1193 */       return jjStopAtPos(0, 38);
/*      */     case 't': 
/* 1195 */       return jjMoveStringLiteralDfa1_1(32212254720L);
/*      */     case '{': 
/* 1197 */       return jjStopAtPos(0, 42);
/*      */     case '|': 
/* 1199 */       return jjStopAtPos(0, 44);
/*      */     case '}': 
/* 1201 */       return jjStopAtPos(0, 43);
/*      */     }
/* 1203 */     return jjMoveNfa_1(0, 0);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa1_1(long paramLong) {
/*      */     try {
/* 1208 */       curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1210 */       jjStopStringLiteralDfa_1(0, paramLong);
/* 1211 */       return 1;
/*      */     }
/* 1213 */     switch (curChar)
/*      */     {
/*      */     case '\n': 
/* 1216 */       if ((paramLong & 0x800000000000000) != 0L)
/* 1217 */         return jjStopAtPos(1, 59);
/* 1218 */       break;
/*      */     case 'a': 
/* 1220 */       return jjMoveStringLiteralDfa2_1(paramLong, 2147483648L);
/*      */     case 'n': 
/* 1222 */       return jjMoveStringLiteralDfa2_1(paramLong, 17179869184L);
/*      */     case 'o': 
/* 1224 */       return jjMoveStringLiteralDfa2_1(paramLong, 12884901888L);
/*      */     }
/*      */     
/*      */     
/* 1228 */     return jjStartNfa_1(0, paramLong);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa2_1(long paramLong1, long paramLong2) {
/* 1232 */     if ((paramLong2 &= paramLong1) == 0L)
/* 1233 */       return jjStartNfa_1(0, paramLong1);
/* 1234 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1236 */       jjStopStringLiteralDfa_1(1, paramLong2);
/* 1237 */       return 2;
/*      */     }
/* 1239 */     switch (curChar)
/*      */     {
/*      */     case 'c': 
/* 1242 */       if ((paramLong2 & 0x200000000) != 0L)
/* 1243 */         return jjStartNfaWithStates_1(2, 33, 2);
/* 1244 */       break;
/*      */     case 'n': 
/* 1246 */       return jjMoveStringLiteralDfa3_1(paramLong2, 2147483648L);
/*      */     case 'o': 
/* 1248 */       return jjMoveStringLiteralDfa3_1(paramLong2, 17179869184L);
/*      */     case 'r': 
/* 1250 */       if ((paramLong2 & 0x100000000) != 0L)
/* 1251 */         return jjStartNfaWithStates_1(2, 32, 2);
/* 1252 */       break;
/*      */     }
/*      */     
/*      */     
/* 1256 */     return jjStartNfa_1(1, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa3_1(long paramLong1, long paramLong2) {
/* 1260 */     if ((paramLong2 &= paramLong1) == 0L)
/* 1261 */       return jjStartNfa_1(1, paramLong1);
/* 1262 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1264 */       jjStopStringLiteralDfa_1(2, paramLong2);
/* 1265 */       return 3;
/*      */     }
/* 1267 */     switch (curChar)
/*      */     {
/*      */     case 'd': 
/* 1270 */       if ((paramLong2 & 0x80000000) != 0L)
/* 1271 */         return jjStartNfaWithStates_1(3, 31, 2);
/* 1272 */       break;
/*      */     case 't': 
/* 1274 */       if ((paramLong2 & 0x400000000) != 0L)
/* 1275 */         return jjStartNfaWithStates_1(3, 34, 2);
/* 1276 */       break;
/*      */     }
/*      */     
/*      */     
/* 1280 */     return jjStartNfa_1(2, paramLong2);
/*      */   }
/*      */   
/*      */   private static final int jjMoveNfa_1(int paramInt1, int paramInt2)
/*      */   {
/* 1285 */     int i = 0;
/* 1286 */     jjnewStateCnt = 33;
/* 1287 */     int j = 1;
/* 1288 */     jjstateSet[0] = paramInt1;
/* 1289 */     int k = Integer.MAX_VALUE;
/*      */     for (;;)
/*      */     {
/* 1292 */       if (++jjround == Integer.MAX_VALUE)
/* 1293 */         ReInitRounds();
/* 1294 */       long l1; if (curChar < '@')
/*      */       {
/* 1296 */         l1 = 1L << curChar;
/*      */         do
/*      */         {
/* 1299 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 0: 
/* 1302 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1304 */               if (k > 46)
/* 1305 */                 k = 46;
/* 1306 */               jjCheckNAdd(2);
/*      */             }
/* 1308 */             else if (curChar == ':') {
/* 1309 */               jjCheckNAddStates(3, 20);
/* 1310 */             } else if (curChar == ';') {
/* 1311 */               jjCheckNAddStates(21, 24);
/* 1312 */             } else if ((0x8000040000000000 & l1) != 0L)
/*      */             {
/* 1314 */               if (k > 45)
/* 1315 */                 k = 45;
/*      */             }
/* 1317 */             if (curChar == '?')
/* 1318 */               jjCheckNAdd(4);
/* 1319 */             break;
/*      */           case 1: 
/* 1321 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1323 */               if (k > 46)
/* 1324 */                 k = 46;
/* 1325 */               jjCheckNAdd(2); }
/* 1326 */             break;
/*      */           case 2: 
/* 1328 */             if ((0x83FF6C0000000000 & l1) != 0L)
/*      */             {
/* 1330 */               if (k > 46)
/* 1331 */                 k = 46;
/* 1332 */               jjCheckNAdd(2); }
/* 1333 */             break;
/*      */           case 3: 
/* 1335 */             if (curChar == '?')
/* 1336 */               jjCheckNAdd(4);
/* 1337 */             break;
/*      */           case 4: 
/* 1339 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1341 */               if (k > 52)
/* 1342 */                 k = 52;
/* 1343 */               jjCheckNAdd(4); }
/* 1344 */             break;
/*      */           case 5: 
/* 1346 */             if (curChar == ';')
/* 1347 */               jjCheckNAddStates(21, 24);
/* 1348 */             break;
/*      */           case 6: 
/* 1350 */             if (curChar == ')')
/* 1351 */               k = 53;
/* 1352 */             break;
/*      */           case 7: 
/*      */           case 27: 
/* 1355 */             if (curChar == '-')
/* 1356 */               jjCheckNAdd(6);
/* 1357 */             break;
/*      */           case 9: 
/*      */           case 30: 
/* 1360 */             if (curChar == '-')
/* 1361 */               jjCheckNAdd(8);
/* 1362 */             break;
/*      */           case 10: 
/* 1364 */             if (curChar == ':')
/* 1365 */               jjCheckNAddStates(3, 20);
/* 1366 */             break;
/*      */           case 28: 
/* 1368 */             if (curChar == '(')
/* 1369 */               k = 53;
/* 1370 */             break;
/*      */           case 29: 
/* 1372 */             if (curChar == '-')
/* 1373 */               jjCheckNAdd(28);
/* 1374 */             break;
/*      */           case 31: 
/* 1376 */             if (curChar == '<')
/* 1377 */               k = 53;
/* 1378 */             break;
/*      */           case 32: 
/* 1380 */             if (curChar == '-') {
/* 1381 */               jjCheckNAdd(31);
/*      */             }
/*      */           }
/*      */           
/* 1385 */         } while (j != i);
/*      */       }
/* 1387 */       else if (curChar < '')
/*      */       {
/* 1389 */         l1 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1392 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 0: 
/* 1395 */             if ((0x7FFFFFE07FFFFFE & l1) != 0L)
/*      */             {
/* 1397 */               if (k > 46)
/* 1398 */                 k = 46;
/* 1399 */               jjCheckNAdd(2); }
/* 1400 */             break;
/*      */           case 2: 
/* 1402 */             if ((0x7FFFFFE87FFFFFE & l1) != 0L)
/*      */             {
/* 1404 */               if (k > 46)
/* 1405 */                 k = 46;
/* 1406 */               jjCheckNAdd(2); }
/* 1407 */             break;
/*      */           case 4: 
/* 1409 */             if ((0x7FFFFFE07FFFFFE & l1) != 0L)
/*      */             {
/* 1411 */               if (k > 52)
/* 1412 */                 k = 52;
/* 1413 */               jjstateSet[(jjnewStateCnt++)] = 4; }
/* 1414 */             break;
/*      */           case 8: 
/* 1416 */             if ((curChar == 'D') && (k > 53))
/* 1417 */               k = 53;
/* 1418 */             break;
/*      */           case 11: 
/* 1420 */             if ((curChar == 'N') && (k > 50))
/* 1421 */               k = 50;
/* 1422 */             break;
/*      */           case 12: 
/* 1424 */             if ((curChar == 'n') && (k > 50))
/* 1425 */               k = 50;
/* 1426 */             break;
/*      */           case 13: 
/* 1428 */             if ((curChar == 'V') && (k > 50))
/* 1429 */               k = 50;
/* 1430 */             break;
/*      */           case 14: 
/* 1432 */             if ((curChar == 'v') && (k > 50))
/* 1433 */               k = 50;
/* 1434 */             break;
/*      */           case 15: 
/* 1436 */             if ((curChar == 'J') && (k > 50))
/* 1437 */               k = 50;
/* 1438 */             break;
/*      */           case 16: 
/* 1440 */             if (curChar == 'D')
/* 1441 */               jjstateSet[(jjnewStateCnt++)] = 15;
/* 1442 */             break;
/*      */           case 17: 
/* 1444 */             if (curChar == 'A')
/* 1445 */               jjstateSet[(jjnewStateCnt++)] = 16;
/* 1446 */             break;
/*      */           case 18: 
/* 1448 */             if ((curChar == 'j') && (k > 50))
/* 1449 */               k = 50;
/* 1450 */             break;
/*      */           case 19: 
/* 1452 */             if (curChar == 'd')
/* 1453 */               jjstateSet[(jjnewStateCnt++)] = 18;
/* 1454 */             break;
/*      */           case 20: 
/* 1456 */             if (curChar == 'a')
/* 1457 */               jjstateSet[(jjnewStateCnt++)] = 19;
/* 1458 */             break;
/*      */           case 21: 
/* 1460 */             if (curChar == 'D')
/* 1461 */               jjstateSet[(jjnewStateCnt++)] = 13;
/* 1462 */             break;
/*      */           case 22: 
/* 1464 */             if (curChar == 'A')
/* 1465 */               jjstateSet[(jjnewStateCnt++)] = 21;
/* 1466 */             break;
/*      */           case 23: 
/* 1468 */             if (curChar == 'd')
/* 1469 */               jjstateSet[(jjnewStateCnt++)] = 14;
/* 1470 */             break;
/*      */           case 24: 
/* 1472 */             if (curChar == 'a')
/* 1473 */               jjstateSet[(jjnewStateCnt++)] = 23;
/* 1474 */             break;
/*      */           case 25: 
/* 1476 */             if ((curChar == 'R') && (k > 51))
/* 1477 */               k = 51;
/* 1478 */             break;
/*      */           case 26: 
/* 1480 */             if ((curChar == 'r') && (k > 51)) {
/* 1481 */               k = 51;
/*      */             }
/*      */           }
/*      */           
/* 1485 */         } while (j != i);
/*      */       }
/*      */       else
/*      */       {
/* 1489 */         int m = curChar >> '\b';
/* 1490 */         int n = m >> 6;
/* 1491 */         long l2 = 1L << (m & 0x3F);
/* 1492 */         int i1 = (curChar & 0xFF) >> '\006';
/* 1493 */         long l3 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1496 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           }
/*      */           
/* 1500 */         } while (j != i);
/*      */       }
/* 1502 */       if (k != Integer.MAX_VALUE)
/*      */       {
/* 1504 */         jjmatchedKind = k;
/* 1505 */         jjmatchedPos = paramInt2;
/* 1506 */         k = Integer.MAX_VALUE;
/*      */       }
/* 1508 */       paramInt2++;
/* 1509 */       if ((j = jjnewStateCnt) == (i = 33 - (jjnewStateCnt = i)))
/* 1510 */         return paramInt2;
/* 1511 */       try { curChar = JavaCharStream.readChar();
/* 1512 */       } catch (IOException localIOException) { return paramInt2;
/*      */       } } }
/*      */   
/* 1515 */   static final int[] jjnextStates = { 4, 5, 7, 11, 12, 13, 14, 17, 20, 22, 24, 25, 26, 6, 27, 29, 28, 30, 8, 31, 32, 6, 7, 9, 8 };
/*      */   
/*      */ 
/*      */ 
/*      */   private static final boolean jjCanMove_0(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
/*      */   {
/* 1521 */     switch (paramInt1)
/*      */     {
/*      */     case 0: 
/* 1524 */       if ((jjbitVec2[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     }
/* 1526 */     if ((jjbitVec0[paramInt2] & paramLong1) != 0L)
/* 1527 */       return true;
/* 1528 */     return false;
/*      */   }
/*      */   
/* 1531 */   public static final String[] jjstrLiteralImages = { "", 0, 0, 0, 0, 0, 0, "template", "defrule", "defmap", "deftype", "defbeat", "declare", "(", ")", "[", "]", "|", "%fromfile", "include", "or", "and", ";", ":", "&", 0, "=>", "<-", "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%", 0, 0, "tand", "tor", "toc", "tnot", "(", ")", "[", "]", "<", ">", "-", "{", "}", "|" };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1541 */   public static final String[] lexStateNames = { "DEFAULT", "TEMPLATE", "MultiComment" };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/* 1546 */   public static final int[] jjnewLexState = { -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, 0-1 };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/* 1551 */   static final long[] jjtoToken = { 17029236090994561L };
/*      */   
/*      */ 
/* 1554 */   static final long[] jjtoSkip = { 9205357638345293950L };
/*      */   
/*      */ 
/* 1557 */   static final long[] jjtoSpecial = { 1152921504606846976L };
/*      */   
/*      */ 
/* 1560 */   static final long[] jjtoMore = { Long.MIN_VALUE };
/*      */   
/*      */   protected static JavaCharStream input_stream;
/*      */   
/* 1564 */   private static final int[] jjrounds = new int[33];
/* 1565 */   private static final int[] jjstateSet = new int[66];
/*      */   protected static char curChar;
/*      */   
/*      */   public NLUTokenManager(JavaCharStream paramJavaCharStream) {
/* 1569 */     if (input_stream != null)
/* 1570 */       throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", 1);
/* 1571 */     input_stream = paramJavaCharStream;
/*      */   }
/*      */   
/*      */   public NLUTokenManager(JavaCharStream paramJavaCharStream, int paramInt) {
/* 1575 */     this(paramJavaCharStream);
/* 1576 */     SwitchTo(paramInt);
/*      */   }
/*      */   
/*      */   public static void ReInit(JavaCharStream paramJavaCharStream) {
/* 1580 */     jjmatchedPos = jjnewStateCnt = 0;
/* 1581 */     curLexState = defaultLexState;
/* 1582 */     input_stream = paramJavaCharStream;
/* 1583 */     ReInitRounds();
/*      */   }
/*      */   
/*      */   private static final void ReInitRounds()
/*      */   {
/* 1588 */     jjround = -2147483647;
/* 1589 */     for (int i = 33; i-- > 0;)
/* 1590 */       jjrounds[i] = Integer.MIN_VALUE;
/*      */   }
/*      */   
/*      */   public static void ReInit(JavaCharStream paramJavaCharStream, int paramInt) {
/* 1594 */     ReInit(paramJavaCharStream);
/* 1595 */     SwitchTo(paramInt);
/*      */   }
/*      */   
/*      */   public static void SwitchTo(int paramInt) {
/* 1599 */     if ((paramInt >= 3) || (paramInt < 0)) {
/* 1600 */       throw new TokenMgrError("Error: Ignoring invalid lexical state : " + paramInt + ". State unchanged.", 2);
/*      */     }
/* 1602 */     curLexState = paramInt;
/*      */   }
/*      */   
/*      */   protected static Token jjFillToken()
/*      */   {
/* 1607 */     Token localToken = Token.newToken(jjmatchedKind);
/* 1608 */     localToken.kind = jjmatchedKind;
/* 1609 */     String str = jjstrLiteralImages[jjmatchedKind];
/* 1610 */     localToken.image = (str == null ? JavaCharStream.GetImage() : str);
/* 1611 */     localToken.beginLine = JavaCharStream.getBeginLine();
/* 1612 */     localToken.beginColumn = JavaCharStream.getBeginColumn();
/* 1613 */     localToken.endLine = JavaCharStream.getEndLine();
/* 1614 */     localToken.endColumn = JavaCharStream.getEndColumn();
/* 1615 */     return localToken;
/*      */   }
/*      */   
/* 1618 */   static int curLexState = 0;
/* 1619 */   static int defaultLexState = 0;
/*      */   
/*      */   static int jjnewStateCnt;
/*      */   static int jjround;
/*      */   static int jjmatchedPos;
/*      */   static int jjmatchedKind;
/*      */   
/*      */   public static Token getNextToken()
/*      */   {
/* 1628 */     Object localObject = null;
/*      */     
/* 1630 */     int i = 0;
/*      */     label561:
/*      */     for (;;)
/*      */     {
/*      */       Token localToken;
/*      */       try
/*      */       {
/* 1637 */         curChar = JavaCharStream.BeginToken();
/*      */       }
/*      */       catch (IOException localIOException1)
/*      */       {
/* 1641 */         jjmatchedKind = 0;
/* 1642 */         localToken = jjFillToken();
/* 1643 */         localToken.specialToken = ((Token)localObject);
/* 1644 */         return localToken;
/*      */       }
/*      */       
/*      */       for (;;)
/*      */       {
/* 1649 */         switch (curLexState) {
/*      */         case 0: 
/*      */           try {
/* 1652 */             JavaCharStream.backup(0);
/*      */             do {
/* 1654 */               curChar = JavaCharStream.BeginToken();
/* 1653 */               if (curChar > ' ') break; } while ((0x100001600 & 1L << curChar) != 0L);
/*      */           } catch (IOException localIOException2) {
/*      */             break label561;
/*      */           }
/* 1657 */           jjmatchedKind = Integer.MAX_VALUE;
/* 1658 */           jjmatchedPos = 0;
/* 1659 */           i = jjMoveStringLiteralDfa0_0();
/* 1660 */           break;
/*      */         case 1:  try {
/* 1662 */             JavaCharStream.backup(0);
/*      */             do {
/* 1664 */               curChar = JavaCharStream.BeginToken();
/* 1663 */               if (curChar > ' ') break; } while ((0x100001600 & 1L << curChar) != 0L);
/*      */           } catch (IOException localIOException3) {
/*      */             break label561;
/*      */           }
/* 1667 */           jjmatchedKind = Integer.MAX_VALUE;
/* 1668 */           jjmatchedPos = 0;
/* 1669 */           i = jjMoveStringLiteralDfa0_1();
/* 1670 */           break;
/*      */         case 2: 
/* 1672 */           jjmatchedKind = Integer.MAX_VALUE;
/* 1673 */           jjmatchedPos = 0;
/* 1674 */           i = jjMoveStringLiteralDfa0_2();
/* 1675 */           if ((jjmatchedPos == 0) && (jjmatchedKind > 63))
/*      */           {
/* 1677 */             jjmatchedKind = 63;
/*      */           }
/*      */           break;
/*      */         }
/* 1681 */         if (jjmatchedKind != Integer.MAX_VALUE)
/*      */         {
/* 1683 */           if (jjmatchedPos + 1 < i)
/* 1684 */             JavaCharStream.backup(i - jjmatchedPos - 1);
/* 1685 */           if ((jjtoToken[(jjmatchedKind >> 6)] & 1L << (jjmatchedKind & 0x3F)) != 0L)
/*      */           {
/* 1687 */             localToken = jjFillToken();
/* 1688 */             localToken.specialToken = ((Token)localObject);
/* 1689 */             if (jjnewLexState[jjmatchedKind] != -1)
/* 1690 */               curLexState = jjnewLexState[jjmatchedKind];
/* 1691 */             return localToken;
/*      */           }
/* 1693 */           if ((jjtoSkip[(jjmatchedKind >> 6)] & 1L << (jjmatchedKind & 0x3F)) != 0L)
/*      */           {
/* 1695 */             if ((jjtoSpecial[(jjmatchedKind >> 6)] & 1L << (jjmatchedKind & 0x3F)) != 0L)
/*      */             {
/* 1697 */               localToken = jjFillToken();
/* 1698 */               if (localObject == null) {
/* 1699 */                 localObject = localToken;
/*      */               }
/*      */               else {
/* 1702 */                 localToken.specialToken = ((Token)localObject);
/* 1703 */                 localObject = ((Token)localObject).next = localToken;
/*      */               }
/*      */             }
/* 1706 */             if (jjnewLexState[jjmatchedKind] != -1)
/* 1707 */               curLexState = jjnewLexState[jjmatchedKind];
/* 1708 */             break;
/*      */           }
/* 1710 */           if (jjnewLexState[jjmatchedKind] != -1)
/* 1711 */             curLexState = jjnewLexState[jjmatchedKind];
/* 1712 */           i = 0;
/* 1713 */           jjmatchedKind = Integer.MAX_VALUE;
/*      */           try {
/* 1715 */             curChar = JavaCharStream.readChar();
/*      */           }
/*      */           catch (IOException localIOException4) {}
/*      */         }
/*      */         else {
/* 1720 */           int j = JavaCharStream.getEndLine();
/* 1721 */           int k = JavaCharStream.getEndColumn();
/* 1722 */           String str = null;
/* 1723 */           boolean bool = false;
/* 1724 */           try { JavaCharStream.readChar();JavaCharStream.backup(1);
/*      */           } catch (IOException localIOException5) {
/* 1726 */             bool = true;
/* 1727 */             str = i <= 1 ? "" : JavaCharStream.GetImage();
/* 1728 */             if ((curChar == '\n') || (curChar == '\r')) {
/* 1729 */               j++;
/* 1730 */               k = 0;
/*      */             }
/*      */             else {
/* 1733 */               k++;
/*      */             } }
/* 1735 */           if (!bool) {
/* 1736 */             JavaCharStream.backup(1);
/* 1737 */             str = i <= 1 ? "" : JavaCharStream.GetImage();
/*      */           }
/* 1739 */           throw new TokenMgrError(bool, curLexState, j, k, str, curChar, 0);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\NLUTokenManager.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */