/*      */ package dramaman.compiler;
/*      */ 
/*      */ import java.io.IOException;
/*      */ 
/*      */ public class BeatParserTokenManager implements BeatParserConstants {
/*    6 */   public static java.io.PrintStream debugStream = System.out;
/*    7 */   public static void setDebugStream(java.io.PrintStream paramPrintStream) { debugStream = paramPrintStream; }
/*      */   
/*      */   private static final int jjStopStringLiteralDfa_0(int paramInt, long paramLong1, long paramLong2, long paramLong3) {
/*   10 */     switch (paramInt)
/*      */     {
/*      */     case 0: 
/*   13 */       if ((paramLong2 & 0x8014000000000000) != 0L)
/*   14 */         return 52;
/*   15 */       if (((paramLong1 & 0x140) != 0L) || ((paramLong2 & 0x40000000000000) != 0L) || ((paramLong3 & 2) != 0L))
/*   16 */         return 2;
/*   17 */       if ((paramLong2 & 0x800000000) != 0L)
/*   18 */         return 8;
/*   19 */       if (((paramLong1 & 0xFFFFFFFFFFFFE000) != 0L) || ((paramLong2 & 0x3FFF) != 0L))
/*      */       {
/*   21 */         jjmatchedKind = 87;
/*   22 */         return 55;
/*      */       }
/*   24 */       return -1;
/*      */     case 1: 
/*   26 */       if ((paramLong1 & 0x100) != 0L)
/*   27 */         return 0;
/*   28 */       if (((paramLong1 & 0xFFFFFFFBFCFFE000) != 0L) || ((paramLong2 & 0x3FFF) != 0L))
/*      */       {
/*   30 */         if (jjmatchedPos != 1)
/*      */         {
/*   32 */           jjmatchedKind = 87;
/*   33 */           jjmatchedPos = 1;
/*      */         }
/*   35 */         return 55;
/*      */       }
/*   37 */       if ((paramLong1 & 0x403000000) != 0L)
/*   38 */         return 55;
/*   39 */       return -1;
/*      */     case 2: 
/*   41 */       if ((paramLong1 & 0x80004C100000000) != 0L)
/*   42 */         return 55;
/*   43 */       if (((paramLong1 & 0xF7FFFB3AFEFFE000) != 0L) || ((paramLong2 & 0x3FFF) != 0L))
/*      */       {
/*   45 */         if (jjmatchedPos != 2)
/*      */         {
/*   47 */           jjmatchedKind = 87;
/*   48 */           jjmatchedPos = 2;
/*      */         }
/*   50 */         return 55;
/*      */       }
/*   52 */       return -1;
/*      */     case 3: 
/*   54 */       if ((paramLong1 & 0x14400902040B0000) != 0L)
/*   55 */         return 55;
/*   56 */       if (((paramLong1 & 0xE3BFF2B8FAF4E000) != 0L) || ((paramLong2 & 0x3FFF) != 0L))
/*      */       {
/*   58 */         jjmatchedKind = 87;
/*   59 */         jjmatchedPos = 3;
/*   60 */         return 55;
/*      */       }
/*   62 */       return -1;
/*      */     case 4: 
/*   64 */       if (((paramLong1 & 0xA235F2B80AC06000) != 0L) || ((paramLong2 & 0x3FF7) != 0L))
/*      */       {
/*   66 */         if (jjmatchedPos != 4)
/*      */         {
/*   68 */           jjmatchedKind = 87;
/*   69 */           jjmatchedPos = 4;
/*      */         }
/*   71 */         return 55;
/*      */       }
/*   73 */       if (((paramLong1 & 0x418A0000F0348000) != 0L) || ((paramLong2 & 0x8) != 0L))
/*   74 */         return 55;
/*   75 */       return -1;
/*      */     case 5: 
/*   77 */       if (((paramLong1 & 0xA22070A848C06000) != 0L) || ((paramLong2 & 0xFFD) != 0L))
/*      */       {
/*   79 */         if (jjmatchedPos != 5)
/*      */         {
/*   81 */           jjmatchedKind = 87;
/*   82 */           jjmatchedPos = 5;
/*      */         }
/*   84 */         return 55;
/*      */       }
/*   86 */       if (((paramLong1 & 0x115821002000000) != 0L) || ((paramLong2 & 0x3002) != 0L))
/*   87 */         return 55;
/*   88 */       return -1;
/*      */     case 6: 
/*   90 */       if (((paramLong1 & 0x300048804000) != 0L) || ((paramLong2 & 0x21) != 0L))
/*   91 */         return 55;
/*   92 */       if (((paramLong1 & 0xA22040A800402000) != 0L) || ((paramLong2 & 0x2FDC) != 0L))
/*      */       {
/*   94 */         jjmatchedKind = 87;
/*   95 */         jjmatchedPos = 6;
/*   96 */         return 55;
/*      */       }
/*   98 */       return -1;
/*      */     case 7: 
/*  100 */       if (((paramLong1 & 0x822040A800000000) != 0L) || ((paramLong2 & 0x2CDC) != 0L))
/*      */       {
/*  102 */         if (jjmatchedPos != 7)
/*      */         {
/*  104 */           jjmatchedKind = 87;
/*  105 */           jjmatchedPos = 7;
/*      */         }
/*  107 */         return 55;
/*      */       }
/*  109 */       if (((paramLong1 & 0x2000000000402000) != 0L) || ((paramLong2 & 0x300) != 0L))
/*  110 */         return 55;
/*  111 */       return -1;
/*      */     case 8: 
/*  113 */       if (((paramLong1 & 0x8020002800000000) != 0L) || ((paramLong2 & 0x2ED0) != 0L))
/*      */       {
/*  115 */         jjmatchedKind = 87;
/*  116 */         jjmatchedPos = 8;
/*  117 */         return 55;
/*      */       }
/*  119 */       if (((paramLong1 & 0x200408000000000) != 0L) || ((paramLong2 & 0xC) != 0L))
/*  120 */         return 55;
/*  121 */       return -1;
/*      */     case 9: 
/*  123 */       if ((paramLong1 & 0x2800000000) != 0L)
/*  124 */         return 55;
/*  125 */       if (((paramLong1 & 0x8020000000000000) != 0L) || ((paramLong2 & 0x2ED0) != 0L))
/*      */       {
/*  127 */         jjmatchedKind = 87;
/*  128 */         jjmatchedPos = 9;
/*  129 */         return 55;
/*      */       }
/*  131 */       return -1;
/*      */     case 10: 
/*  133 */       if (((paramLong1 & 0x8020000000000000) != 0L) || ((paramLong2 & 0xE50) != 0L))
/*      */       {
/*  135 */         jjmatchedKind = 87;
/*  136 */         jjmatchedPos = 10;
/*  137 */         return 55;
/*      */       }
/*  139 */       if ((paramLong2 & 0x2080) != 0L)
/*  140 */         return 55;
/*  141 */       return -1;
/*      */     case 11: 
/*  143 */       if (((paramLong1 & 0x8020000000000000) != 0L) || ((paramLong2 & 0x40) != 0L))
/*  144 */         return 55;
/*  145 */       if ((paramLong2 & 0xE10) != 0L)
/*      */       {
/*  147 */         jjmatchedKind = 87;
/*  148 */         jjmatchedPos = 11;
/*  149 */         return 55;
/*      */       }
/*  151 */       return -1;
/*      */     case 12: 
/*  153 */       if ((paramLong2 & 0x600) != 0L)
/*  154 */         return 55;
/*  155 */       if ((paramLong2 & 0x810) != 0L)
/*      */       {
/*  157 */         jjmatchedKind = 87;
/*  158 */         jjmatchedPos = 12;
/*  159 */         return 55;
/*      */       }
/*  161 */       return -1;
/*      */     case 13: 
/*  163 */       if ((paramLong2 & 0x10) != 0L)
/*      */       {
/*  165 */         jjmatchedKind = 87;
/*  166 */         jjmatchedPos = 13;
/*  167 */         return 55;
/*      */       }
/*  169 */       if ((paramLong2 & 0x800) != 0L)
/*  170 */         return 55;
/*  171 */       return -1;
/*      */     }
/*  173 */     return -1;
/*      */   }
/*      */   
/*      */   private static final int jjStartNfa_0(int paramInt, long paramLong1, long paramLong2, long paramLong3)
/*      */   {
/*  178 */     return jjMoveNfa_0(jjStopStringLiteralDfa_0(paramInt, paramLong1, paramLong2, paramLong3), paramInt + 1);
/*      */   }
/*      */   
/*      */   private static final int jjStopAtPos(int paramInt1, int paramInt2) {
/*  182 */     jjmatchedKind = paramInt2;
/*  183 */     jjmatchedPos = paramInt1;
/*  184 */     return paramInt1 + 1;
/*      */   }
/*      */   
/*      */   private static final int jjStartNfaWithStates_0(int paramInt1, int paramInt2, int paramInt3) {
/*  188 */     jjmatchedKind = paramInt2;
/*  189 */     jjmatchedPos = paramInt1;
/*  190 */     try { curChar = JavaCharStream.readChar();
/*  191 */     } catch (IOException localIOException) { return paramInt1 + 1; }
/*  192 */     return jjMoveNfa_0(paramInt3, paramInt1 + 1);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa0_0() {
/*  196 */     switch (curChar)
/*      */     {
/*      */     case '!': 
/*  199 */       jjmatchedKind = 103;
/*  200 */       return jjMoveStringLiteralDfa1_0(0L, 70368744177664L, 0L);
/*      */     case '%': 
/*  202 */       jjmatchedKind = 122;
/*  203 */       return jjMoveStringLiteralDfa1_0(0L, 0L, 32L);
/*      */     case '&': 
/*  205 */       jjmatchedKind = 119;
/*  206 */       return jjMoveStringLiteralDfa1_0(0L, 281474976710656L, 4);
/*      */     case '(': 
/*  208 */       return jjStopAtPos(0, 91);
/*      */     case ')': 
/*  210 */       return jjStopAtPos(0, 92);
/*      */     case '*': 
/*  212 */       jjmatchedKind = 117;
/*  213 */       return jjMoveStringLiteralDfa1_0(0L, 0L, 1L);
/*      */     case '+': 
/*  215 */       jjmatchedKind = 115;
/*  216 */       return jjMoveStringLiteralDfa1_0(0L, 4612248968380809216L, 0L);
/*      */     case ',': 
/*  218 */       return jjStopAtPos(0, 98);
/*      */     case '-': 
/*  220 */       jjmatchedKind = 116;
/*  221 */       return jjMoveStringLiteralDfa1_0(0L, -9222246136947933184L, 0L);
/*      */     case '.': 
/*  223 */       return jjStartNfaWithStates_0(0, 99, 8);
/*      */     case '/': 
/*  225 */       jjmatchedKind = 118;
/*  226 */       return jjMoveStringLiteralDfa1_0(320L, 0L, 2);
/*      */     case ':': 
/*  228 */       jjmatchedKind = 106;
/*  229 */       return jjMoveStringLiteralDfa1_0(0L, 16384L, 512L);
/*      */     case ';': 
/*  231 */       return jjStopAtPos(0, 97);
/*      */     case '<': 
/*  233 */       jjmatchedKind = 102;
/*  234 */       return jjMoveStringLiteralDfa1_0(0L, 576478344489467904L, 64L);
/*      */     case '=': 
/*  236 */       jjmatchedKind = 100;
/*  237 */       return jjMoveStringLiteralDfa1_0(0L, 8796093022208L, 0L);
/*      */     case '>': 
/*  239 */       jjmatchedKind = 101;
/*  240 */       return jjMoveStringLiteralDfa1_0(0L, 3458799698192629760L, 384L);
/*      */     case '?': 
/*  242 */       return jjStopAtPos(0, 105);
/*      */     case '[': 
/*  244 */       return jjStopAtPos(0, 95);
/*      */     case '\\': 
/*  246 */       return jjStopAtPos(0, 90);
/*      */     case ']': 
/*  248 */       return jjStopAtPos(0, 96);
/*      */     case '^': 
/*  250 */       jjmatchedKind = 121;
/*  251 */       return jjMoveStringLiteralDfa1_0(0L, 0L, 16L);
/*      */     case 'a': 
/*  253 */       return jjMoveStringLiteralDfa1_0(-9223372036854767616L, 0L, 0L);
/*      */     case 'b': 
/*  255 */       return jjMoveStringLiteralDfa1_0(114688L, 6L, 0L);
/*      */     case 'c': 
/*  257 */       return jjMoveStringLiteralDfa1_0(8257536L, 8L, 0L);
/*      */     case 'd': 
/*  259 */       return jjMoveStringLiteralDfa1_0(58720256L, 17L, 0L);
/*      */     case 'e': 
/*  261 */       return jjMoveStringLiteralDfa1_0(201326592L, 32L, 0L);
/*      */     case 'f': 
/*  263 */       return jjMoveStringLiteralDfa1_0(8321499136L, 0L, 0L);
/*      */     case 'g': 
/*  265 */       return jjMoveStringLiteralDfa1_0(8589934592L, 0L, 0L);
/*      */     case 'i': 
/*  267 */       return jjMoveStringLiteralDfa1_0(1082331758592L, 128L, 0L);
/*      */     case 'l': 
/*  269 */       return jjMoveStringLiteralDfa1_0(1099511627776L, 0L, 0L);
/*      */     case 'n': 
/*  271 */       return jjMoveStringLiteralDfa1_0(15393162788864L, 0L, 0L);
/*      */     case 'p': 
/*  273 */       return jjMoveStringLiteralDfa1_0(263882790666240L, 832L, 0L);
/*      */     case 'r': 
/*  275 */       return jjMoveStringLiteralDfa1_0(281474976710656L, 0L, 0L);
/*      */     case 's': 
/*  277 */       return jjMoveStringLiteralDfa1_0(17451448556060672L, 3072L, 0L);
/*      */     case 't': 
/*  279 */       return jjMoveStringLiteralDfa1_0(1134907106097364992L, 0L, 0L);
/*      */     case 'v': 
/*  281 */       return jjMoveStringLiteralDfa1_0(3458764513820540928L, 0L, 0L);
/*      */     case 'w': 
/*  283 */       return jjMoveStringLiteralDfa1_0(4611686018427387904L, 12288L, 0L);
/*      */     case '{': 
/*  285 */       return jjStopAtPos(0, 93);
/*      */     case '|': 
/*  287 */       jjmatchedKind = 120;
/*  288 */       return jjMoveStringLiteralDfa1_0(0L, 140737488355328L, 8L);
/*      */     case '}': 
/*  290 */       return jjStopAtPos(0, 94);
/*      */     case '~': 
/*  292 */       return jjStopAtPos(0, 104);
/*      */     }
/*  294 */     return jjMoveNfa_0(3, 0);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa1_0(long paramLong1, long paramLong2, long paramLong3) {
/*      */     try {
/*  299 */       curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  301 */       jjStopStringLiteralDfa_0(0, paramLong1, paramLong2, paramLong3);
/*  302 */       return 1;
/*      */     }
/*  304 */     switch (curChar)
/*      */     {
/*      */     case '&': 
/*  307 */       if ((paramLong2 & 0x1000000000000) != 0L)
/*  308 */         return jjStopAtPos(1, 112);
/*  309 */       break;
/*      */     case '*': 
/*  311 */       if ((paramLong1 & 0x100) != 0L)
/*  312 */         return jjStartNfaWithStates_0(1, 8, 0);
/*  313 */       break;
/*      */     case '+': 
/*  315 */       if ((paramLong2 & 0x2000000000000) != 0L)
/*  316 */         return jjStopAtPos(1, 113);
/*  317 */       break;
/*      */     case '-': 
/*  319 */       if ((paramLong2 & 0x4000000000000) != 0L)
/*  320 */         return jjStopAtPos(1, 114);
/*  321 */       break;
/*      */     case '/': 
/*  323 */       if ((paramLong1 & 0x40) != 0L)
/*  324 */         return jjStopAtPos(1, 6);
/*  325 */       break;
/*      */     case ':': 
/*  327 */       if ((paramLong2 & 0x4000) != 0L)
/*  328 */         return jjStopAtPos(1, 78);
/*  329 */       break;
/*      */     case '<': 
/*  331 */       if ((paramLong2 & 0x800000000000000) != 0L)
/*      */       {
/*  333 */         jjmatchedKind = 123;
/*  334 */         jjmatchedPos = 1;
/*      */       }
/*  336 */       return jjMoveStringLiteralDfa2_0(paramLong1, 0L, paramLong2, 0L, paramLong3, 64L);
/*      */     case '=': 
/*  338 */       if ((paramLong2 & 0x80000000000) != 0L)
/*  339 */         return jjStopAtPos(1, 107);
/*  340 */       if ((paramLong2 & 0x100000000000) != 0L)
/*  341 */         return jjStopAtPos(1, 108);
/*  342 */       if ((paramLong2 & 0x200000000000) != 0L)
/*  343 */         return jjStopAtPos(1, 109);
/*  344 */       if ((paramLong2 & 0x400000000000) != 0L)
/*  345 */         return jjStopAtPos(1, 110);
/*  346 */       if ((paramLong2 & 0x4000000000000000) != 0L)
/*  347 */         return jjStopAtPos(1, 126);
/*  348 */       if ((paramLong2 & 0x8000000000000000) != 0L)
/*  349 */         return jjStopAtPos(1, 127);
/*  350 */       if ((paramLong3 & 1L) != 0L)
/*  351 */         return jjStopAtPos(1, 128);
/*  352 */       if ((paramLong3 & 2) != 0L)
/*  353 */         return jjStopAtPos(1, 129);
/*  354 */       if ((paramLong3 & 4) != 0L)
/*  355 */         return jjStopAtPos(1, 130);
/*  356 */       if ((paramLong3 & 0x8) != 0L)
/*  357 */         return jjStopAtPos(1, 131);
/*  358 */       if ((paramLong3 & 0x10) != 0L)
/*  359 */         return jjStopAtPos(1, 132);
/*  360 */       if ((paramLong3 & 0x20) != 0L)
/*  361 */         return jjStopAtPos(1, 133);
/*  362 */       break;
/*      */     case '>': 
/*  364 */       if ((paramLong2 & 0x1000000000000000) != 0L)
/*      */       {
/*  366 */         jjmatchedKind = 124;
/*  367 */         jjmatchedPos = 1;
/*      */       }
/*  369 */       return jjMoveStringLiteralDfa2_0(paramLong1, 0L, paramLong2, 2305843009213693952L, paramLong3, 384L);
/*      */     case '\\': 
/*  371 */       if ((paramLong3 & 0x200) != 0L)
/*  372 */         return jjStopAtPos(1, 137);
/*  373 */       break;
/*      */     case 'a': 
/*  375 */       return jjMoveStringLiteralDfa2_0(paramLong1, 19791478128640L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'b': 
/*  377 */       return jjMoveStringLiteralDfa2_0(paramLong1, -9223372036854767616L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'e': 
/*  379 */       return jjMoveStringLiteralDfa2_0(paramLong1, 285873031610368L, paramLong2, 13319L, paramLong3, 0L);
/*      */     case 'f': 
/*  381 */       if ((paramLong1 & 0x400000000) != 0L)
/*  382 */         return jjStartNfaWithStates_0(1, 34, 55);
/*  383 */       return jjMoveStringLiteralDfa2_0(paramLong1, 0L, paramLong2, 32L, paramLong3, 0L);
/*      */     case 'h': 
/*  385 */       return jjMoveStringLiteralDfa2_0(paramLong1, 4738349757947707392L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'i': 
/*  387 */       return jjMoveStringLiteralDfa2_0(paramLong1, 1610612736L, paramLong2, 16L, paramLong3, 0L);
/*      */     case 'l': 
/*  389 */       return jjMoveStringLiteralDfa2_0(paramLong1, 2215641088L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'm': 
/*  391 */       return jjMoveStringLiteralDfa2_0(paramLong1, 103079215104L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'n': 
/*  393 */       return jjMoveStringLiteralDfa2_0(paramLong1, 962072674304L, paramLong2, 128L, paramLong3, 0L);
/*      */     case 'o': 
/*  395 */       if ((paramLong1 & 0x1000000) != 0L)
/*      */       {
/*  397 */         jjmatchedKind = 24;
/*  398 */         jjmatchedPos = 1;
/*      */       }
/*  400 */       return jjMoveStringLiteralDfa2_0(paramLong1, 3458765626256932864L, paramLong2, 8L, paramLong3, 0L);
/*      */     case 'r': 
/*  402 */       return jjMoveStringLiteralDfa2_0(paramLong1, 1008911869647290368L, paramLong2, 832L, paramLong3, 0L);
/*      */     case 't': 
/*  404 */       return jjMoveStringLiteralDfa2_0(paramLong1, 1125899906842624L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'u': 
/*  406 */       return jjMoveStringLiteralDfa2_0(paramLong1, 2401333395062784L, paramLong2, 2048L, paramLong3, 0L);
/*      */     case 'w': 
/*  408 */       return jjMoveStringLiteralDfa2_0(paramLong1, 4503599627370496L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'x': 
/*  410 */       return jjMoveStringLiteralDfa2_0(paramLong1, 134217728L, paramLong2, 0L, paramLong3, 0L);
/*      */     case 'y': 
/*  412 */       return jjMoveStringLiteralDfa2_0(paramLong1, 9007199254806528L, paramLong2, 0L, paramLong3, 0L);
/*      */     case '|': 
/*  414 */       if ((paramLong2 & 0x800000000000) != 0L)
/*  415 */         return jjStopAtPos(1, 111);
/*  416 */       break;
/*      */     }
/*      */     
/*      */     
/*  420 */     return jjStartNfa_0(0, paramLong1, paramLong2, paramLong3);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa2_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6) {
/*  424 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3 | paramLong6 &= paramLong5) == 0L)
/*  425 */       return jjStartNfa_0(0, paramLong1, paramLong3, paramLong5);
/*  426 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  428 */       jjStopStringLiteralDfa_0(1, paramLong2, paramLong4, paramLong6);
/*  429 */       return 2;
/*      */     }
/*  431 */     switch (curChar)
/*      */     {
/*      */     case '=': 
/*  434 */       if ((paramLong6 & 0x40) != 0L)
/*  435 */         return jjStopAtPos(2, 134);
/*  436 */       if ((paramLong6 & 0x80) != 0L)
/*  437 */         return jjStopAtPos(2, 135);
/*  438 */       break;
/*      */     case '>': 
/*  440 */       if ((paramLong4 & 0x2000000000000000) != 0L)
/*      */       {
/*  442 */         jjmatchedKind = 125;
/*  443 */         jjmatchedPos = 2;
/*      */       }
/*  445 */       return jjMoveStringLiteralDfa3_0(paramLong2, 0L, paramLong4, 0L, paramLong6, 256L);
/*      */     case 'a': 
/*  447 */       return jjMoveStringLiteralDfa3_0(paramLong2, 145241087984271360L, paramLong4, 2, paramLong6, 0L);
/*      */     case 'b': 
/*  449 */       return jjMoveStringLiteralDfa3_0(paramLong2, 140737488355328L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'c': 
/*  451 */       return jjMoveStringLiteralDfa3_0(paramLong2, 17592186044416L, paramLong4, 2048L, paramLong6, 0L);
/*      */     case 'e': 
/*  453 */       return jjMoveStringLiteralDfa3_0(paramLong2, 32768L, paramLong4, 64L, paramLong6, 0L);
/*      */     case 'f': 
/*  455 */       return jjMoveStringLiteralDfa3_0(paramLong2, 8388608L, paramLong4, 33L, paramLong6, 0L);
/*      */     case 'h': 
/*  457 */       return jjMoveStringLiteralDfa3_0(paramLong2, 0L, paramLong4, 4, paramLong6, 0L);
/*      */     case 'i': 
/*  459 */       return jjMoveStringLiteralDfa3_0(paramLong2, 5787160705543176192L, paramLong4, 13184L, paramLong6, 0L);
/*      */     case 'l': 
/*  461 */       return jjMoveStringLiteralDfa3_0(paramLong2, 2305851805575151616L, paramLong4, 1024L, paramLong6, 0L);
/*      */     case 'n': 
/*  463 */       return jjMoveStringLiteralDfa3_0(paramLong2, 9008300383272960L, paramLong4, 8L, paramLong6, 0L);
/*      */     case 'o': 
/*  465 */       return jjMoveStringLiteralDfa3_0(paramLong2, -9222738716009676800L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'p': 
/*  467 */       return jjMoveStringLiteralDfa3_0(paramLong2, 2251902892900352L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'r': 
/*  469 */       if ((paramLong2 & 0x100000000) != 0L)
/*  470 */         return jjStartNfaWithStates_0(2, 32, 55);
/*  471 */       return jjMoveStringLiteralDfa3_0(paramLong2, 108086391056891904L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 's': 
/*  473 */       return jjMoveStringLiteralDfa3_0(paramLong2, 137506201600L, paramLong4, 16L, paramLong6, 0L);
/*      */     case 't': 
/*  475 */       if ((paramLong2 & 0x4000000000) != 0L)
/*      */       {
/*  477 */         jjmatchedKind = 38;
/*  478 */         jjmatchedPos = 2;
/*      */       }
/*  480 */       return jjMoveStringLiteralDfa3_0(paramLong2, 284232480260096L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'u': 
/*  482 */       return jjMoveStringLiteralDfa3_0(paramLong2, 288230376185266176L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'w': 
/*  484 */       if ((paramLong2 & 0x40000000000) != 0L)
/*  485 */         return jjStartNfaWithStates_0(2, 42, 55);
/*  486 */       break;
/*      */     case 'y': 
/*  488 */       if ((paramLong2 & 0x800000000000000) != 0L)
/*  489 */         return jjStartNfaWithStates_0(2, 59, 55);
/*  490 */       break;
/*      */     }
/*      */     
/*      */     
/*  494 */     return jjStartNfa_0(1, paramLong2, paramLong4, paramLong6);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa3_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6) {
/*  498 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3 | paramLong6 &= paramLong5) == 0L)
/*  499 */       return jjStartNfa_0(1, paramLong1, paramLong3, paramLong5);
/*  500 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  502 */       jjStopStringLiteralDfa_0(2, paramLong2, paramLong4, paramLong6);
/*  503 */       return 3;
/*      */     }
/*  505 */     switch (curChar)
/*      */     {
/*      */     case '=': 
/*  508 */       if ((paramLong6 & 0x100) != 0L)
/*  509 */         return jjStopAtPos(3, 136);
/*  510 */       break;
/*      */     case 'a': 
/*  512 */       return jjMoveStringLiteralDfa4_0(paramLong2, 2305843012980211712L, paramLong4, 4, paramLong6, 0L);
/*      */     case 'b': 
/*  514 */       return jjMoveStringLiteralDfa4_0(paramLong2, 33554432L, paramLong4, 1L, paramLong6, 0L);
/*      */     case 'c': 
/*  516 */       return jjMoveStringLiteralDfa4_0(paramLong2, 9007199255003136L, paramLong4, 2128L, paramLong6, 0L);
/*      */     case 'd': 
/*  518 */       if ((paramLong2 & 0x1000000000000000) != 0L)
/*  519 */         return jjStartNfaWithStates_0(3, 60, 55);
/*  520 */       break;
/*      */     case 'e': 
/*  522 */       if ((paramLong2 & 0x10000) != 0L)
/*  523 */         return jjStartNfaWithStates_0(3, 16, 55);
/*  524 */       if ((paramLong2 & 0x20000) != 0L)
/*  525 */         return jjStartNfaWithStates_0(3, 17, 55);
/*  526 */       if ((paramLong2 & 0x4000000) != 0L)
/*  527 */         return jjStartNfaWithStates_0(3, 26, 55);
/*  528 */       if ((paramLong2 & 0x400000000000000) != 0L)
/*  529 */         return jjStartNfaWithStates_0(3, 58, 55);
/*  530 */       return jjMoveStringLiteralDfa4_0(paramLong2, 2252349703716864L, paramLong4, 1056L, paramLong6, 0L);
/*      */     case 'g': 
/*  532 */       if ((paramLong2 & 0x10000000000) != 0L)
/*  533 */         return jjStartNfaWithStates_0(3, 40, 55);
/*  534 */       return jjMoveStringLiteralDfa4_0(paramLong2, 0L, paramLong4, 12288L, paramLong6, 0L);
/*      */     case 'i': 
/*  536 */       return jjMoveStringLiteralDfa4_0(paramLong2, 2199023255552L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'k': 
/*  538 */       return jjMoveStringLiteralDfa4_0(paramLong2, 17592186044416L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'l': 
/*  540 */       if ((paramLong2 & 0x80000000000) != 0L)
/*  541 */         return jjStartNfaWithStates_0(3, 43, 55);
/*  542 */       return jjMoveStringLiteralDfa4_0(paramLong2, 4611826790275497984L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'n': 
/*  544 */       return jjMoveStringLiteralDfa4_0(paramLong2, 144115188075855872L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'o': 
/*  546 */       if ((paramLong2 & 0x200000000) != 0L)
/*  547 */         return jjStartNfaWithStates_0(3, 33, 55);
/*  548 */       return jjMoveStringLiteralDfa4_0(paramLong2, 108086459776368640L, paramLong4, 768L, paramLong6, 0L);
/*      */     case 'r': 
/*  550 */       if ((paramLong2 & 0x80000) != 0L)
/*  551 */         return jjStartNfaWithStates_0(3, 19, 55);
/*  552 */       return jjMoveStringLiteralDfa4_0(paramLong2, -9222809086901354496L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 's': 
/*  554 */       if ((paramLong2 & 0x40000000000000) != 0L)
/*  555 */         return jjStartNfaWithStates_0(3, 54, 55);
/*  556 */       return jjMoveStringLiteralDfa4_0(paramLong2, 271581184L, paramLong4, 8L, paramLong6, 0L);
/*      */     case 't': 
/*  558 */       return jjMoveStringLiteralDfa4_0(paramLong2, 5700005721546752L, paramLong4, 130L, paramLong6, 0L);
/*      */     case 'u': 
/*  560 */       return jjMoveStringLiteralDfa4_0(paramLong2, 281474976710656L, paramLong4, 0L, paramLong6, 0L);
/*      */     case 'v': 
/*  562 */       return jjMoveStringLiteralDfa4_0(paramLong2, 35184372088832L, paramLong4, 0L, paramLong6, 0L);
/*      */     }
/*      */     
/*      */     
/*  566 */     return jjStartNfa_0(2, paramLong2, paramLong4, paramLong6);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa4_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6) {
/*  570 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3 | paramLong6 &= paramLong5) == 0L)
/*  571 */       return jjStartNfa_0(2, paramLong1, paramLong3, paramLong5);
/*  572 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  574 */       jjStopStringLiteralDfa_0(3, paramLong2, paramLong4, 0L);
/*  575 */       return 4;
/*      */     }
/*  577 */     switch (curChar)
/*      */     {
/*      */     case '_': 
/*  580 */       return jjMoveStringLiteralDfa5_0(paramLong2, 0L, paramLong4, 128L);
/*      */     case 'a': 
/*  582 */       return jjMoveStringLiteralDfa5_0(paramLong2, 52913997086720L, paramLong4, 0L);
/*      */     case 'c': 
/*  584 */       return jjMoveStringLiteralDfa5_0(paramLong2, 4503599627370496L, paramLong4, 1056L);
/*      */     case 'e': 
/*  586 */       if ((paramLong2 & 0x10000000) != 0L)
/*  587 */         return jjStartNfaWithStates_0(4, 28, 55);
/*  588 */       if ((paramLong2 & 0x4000000000000000) != 0L)
/*  589 */         return jjStartNfaWithStates_0(4, 62, 55);
/*  590 */       return jjMoveStringLiteralDfa5_0(paramLong2, 70403103932416L, paramLong4, 2049L);
/*      */     case 'h': 
/*  592 */       if ((paramLong2 & 0x40000) != 0L)
/*  593 */         return jjStartNfaWithStates_0(4, 18, 55);
/*  594 */       return jjMoveStringLiteralDfa5_0(paramLong2, 9007199254740992L, paramLong4, 12288L);
/*      */     case 'i': 
/*  596 */       return jjMoveStringLiteralDfa5_0(paramLong2, 1266637399392256L, paramLong4, 2);
/*      */     case 'k': 
/*  598 */       if ((paramLong2 & 0x8000) != 0L)
/*  599 */         return jjStartNfaWithStates_0(4, 15, 55);
/*  600 */       break;
/*      */     case 'l': 
/*  602 */       if ((paramLong2 & 0x20000000) != 0L)
/*      */       {
/*  604 */         jjmatchedKind = 29;
/*  605 */         jjmatchedPos = 4;
/*      */       }
/*  607 */       return jjMoveStringLiteralDfa5_0(paramLong2, 1107296256L, paramLong4, 0L);
/*      */     case 'n': 
/*  609 */       return jjMoveStringLiteralDfa5_0(paramLong2, 134217728L, paramLong4, 0L);
/*      */     case 'o': 
/*  611 */       return jjMoveStringLiteralDfa5_0(paramLong2, 0L, paramLong4, 80L);
/*      */     case 'r': 
/*  613 */       if ((paramLong2 & 0x8000000000000) != 0L)
/*  614 */         return jjStartNfaWithStates_0(4, 51, 55);
/*  615 */       return jjMoveStringLiteralDfa5_0(paramLong2, 282093452009472L, paramLong4, 768L);
/*      */     case 's': 
/*  617 */       if ((paramLong2 & 0x100000) != 0L)
/*  618 */         return jjStartNfaWithStates_0(4, 20, 55);
/*  619 */       return jjMoveStringLiteralDfa5_0(paramLong2, 144115188075855872L, paramLong4, 0L);
/*      */     case 't': 
/*  621 */       if ((paramLong2 & 0x200000) != 0L)
/*      */       {
/*  623 */         jjmatchedKind = 21;
/*  624 */         jjmatchedPos = 4;
/*      */       } else {
/*  626 */         if ((paramLong2 & 0x80000000) != 0L)
/*  627 */           return jjStartNfaWithStates_0(4, 31, 55);
/*  628 */         if ((paramLong2 & 0x2000000000000) != 0L)
/*  629 */           return jjStartNfaWithStates_0(4, 49, 55); }
/*  630 */       return jjMoveStringLiteralDfa5_0(paramLong2, -6917529027641081856L, paramLong4, 8L);
/*      */     case 'u': 
/*  632 */       return jjMoveStringLiteralDfa5_0(paramLong2, 8388608L, paramLong4, 0L);
/*      */     case 'v': 
/*  634 */       return jjMoveStringLiteralDfa5_0(paramLong2, 2199023255552L, paramLong4, 4);
/*      */     case 'w': 
/*  636 */       if ((paramLong2 & 0x80000000000000) != 0L)
/*      */       {
/*  638 */         jjmatchedKind = 55;
/*  639 */         jjmatchedPos = 4;
/*      */       }
/*  641 */       return jjMoveStringLiteralDfa5_0(paramLong2, 72057594037927936L, paramLong4, 0L);
/*      */     }
/*      */     
/*      */     
/*  645 */     return jjStartNfa_0(3, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa5_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  649 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  650 */       return jjStartNfa_0(3, paramLong1, paramLong3, 0L);
/*  651 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  653 */       jjStopStringLiteralDfa_0(4, paramLong2, paramLong4, 0L);
/*  654 */       return 5;
/*      */     }
/*  656 */     switch (curChar)
/*      */     {
/*      */     case '_': 
/*  659 */       return jjMoveStringLiteralDfa6_0(paramLong2, Long.MIN_VALUE, paramLong4, 0L);
/*      */     case 'a': 
/*  661 */       return jjMoveStringLiteralDfa6_0(paramLong2, 24576L, paramLong4, 137L);
/*      */     case 'c': 
/*  663 */       if ((paramLong2 & 0x800000000000) != 0L)
/*  664 */         return jjStartNfaWithStates_0(5, 47, 55);
/*  665 */       if ((paramLong2 & 0x4000000000000) != 0L)
/*  666 */         return jjStartNfaWithStates_0(5, 50, 55);
/*  667 */       return jjMoveStringLiteralDfa6_0(paramLong2, 70368744177664L, paramLong4, 0L);
/*      */     case 'd': 
/*  669 */       if ((paramLong4 & 2) != 0L)
/*  670 */         return jjStartNfaWithStates_0(5, 65, 55);
/*  671 */       return jjMoveStringLiteralDfa6_0(paramLong2, 134217728L, paramLong4, 0L);
/*      */     case 'e': 
/*  673 */       if ((paramLong2 & 0x2000000) != 0L)
/*  674 */         return jjStartNfaWithStates_0(5, 25, 55);
/*  675 */       if ((paramLong2 & 0x20000000000) != 0L)
/*  676 */         return jjStartNfaWithStates_0(5, 41, 55);
/*  677 */       return jjMoveStringLiteralDfa6_0(paramLong2, 0L, paramLong4, 2048L);
/*      */     case 'f': 
/*  679 */       return jjMoveStringLiteralDfa6_0(paramLong2, 549755813888L, paramLong4, 0L);
/*      */     case 'g': 
/*  681 */       return jjMoveStringLiteralDfa6_0(paramLong2, 17592186044416L, paramLong4, 0L);
/*      */     case 'h': 
/*  683 */       if ((paramLong2 & 0x10000000000000) != 0L)
/*  684 */         return jjStartNfaWithStates_0(5, 52, 55);
/*  685 */       break;
/*      */     case 'i': 
/*  687 */       return jjMoveStringLiteralDfa6_0(paramLong2, 2449958197289549824L, paramLong4, 772L);
/*      */     case 'l': 
/*  689 */       return jjMoveStringLiteralDfa6_0(paramLong2, 1082130432L, paramLong4, 0L);
/*      */     case 'm': 
/*  691 */       return jjMoveStringLiteralDfa6_0(paramLong2, 34359738368L, paramLong4, 0L);
/*      */     case 'n': 
/*  693 */       if ((paramLong2 & 0x1000000000000) != 0L)
/*  694 */         return jjStartNfaWithStates_0(5, 48, 55);
/*  695 */       return jjMoveStringLiteralDfa6_0(paramLong2, 137443147776L, paramLong4, 64L);
/*      */     case 'r': 
/*  697 */       return jjMoveStringLiteralDfa6_0(paramLong2, 9007199254740992L, paramLong4, 0L);
/*      */     case 's': 
/*  699 */       if ((paramLong2 & 0x100000000000000) != 0L)
/*  700 */         return jjStartNfaWithStates_0(5, 56, 55);
/*  701 */       break;
/*      */     case 't': 
/*  703 */       if ((paramLong2 & 0x1000000000) != 0L)
/*  704 */         return jjStartNfaWithStates_0(5, 36, 55);
/*  705 */       if ((paramLong4 & 0x1000) != 0L)
/*      */       {
/*  707 */         jjmatchedKind = 76;
/*  708 */         jjmatchedPos = 5;
/*      */       }
/*  710 */       return jjMoveStringLiteralDfa6_0(paramLong2, 35184372088832L, paramLong4, 9248L);
/*      */     case 'u': 
/*  712 */       return jjMoveStringLiteralDfa6_0(paramLong2, 0L, paramLong4, 16L);
/*      */     }
/*      */     
/*      */     
/*  716 */     return jjStartNfa_0(4, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa6_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  720 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  721 */       return jjStartNfa_0(4, paramLong1, paramLong3, 0L);
/*  722 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  724 */       jjStopStringLiteralDfa_0(5, paramLong2, paramLong4, 0L);
/*  725 */       return 6;
/*      */     }
/*  727 */     switch (curChar)
/*      */     {
/*      */     case '_': 
/*  730 */       return jjMoveStringLiteralDfa7_0(paramLong2, 0L, paramLong4, 9216L);
/*      */     case 'a': 
/*  732 */       return jjMoveStringLiteralDfa7_0(paramLong2, -9223371487098961920L, paramLong4, 0L);
/*      */     case 'c': 
/*  734 */       return jjMoveStringLiteralDfa7_0(paramLong2, 137438961664L, paramLong4, 128L);
/*      */     case 'd': 
/*  736 */       return jjMoveStringLiteralDfa7_0(paramLong2, 0L, paramLong4, 2112L);
/*      */     case 'e': 
/*  738 */       if ((paramLong2 & 0x100000000000) != 0L)
/*  739 */         return jjStartNfaWithStates_0(6, 44, 55);
/*  740 */       if ((paramLong2 & 0x200000000000) != 0L)
/*  741 */         return jjStartNfaWithStates_0(6, 45, 55);
/*  742 */       return jjMoveStringLiteralDfa7_0(paramLong2, 144115222435594240L, paramLong4, 0L);
/*      */     case 'l': 
/*  744 */       return jjMoveStringLiteralDfa7_0(paramLong2, 2305843009213693952L, paramLong4, 0L);
/*      */     case 'n': 
/*  746 */       if ((paramLong2 & 0x4000) != 0L)
/*  747 */         return jjStartNfaWithStates_0(6, 14, 55);
/*  748 */       return jjMoveStringLiteralDfa7_0(paramLong2, 0L, paramLong4, 8L);
/*      */     case 'o': 
/*  750 */       return jjMoveStringLiteralDfa7_0(paramLong2, 9007199254740992L, paramLong4, 4);
/*      */     case 'r': 
/*  752 */       return jjMoveStringLiteralDfa7_0(paramLong2, 0L, paramLong4, 16L);
/*      */     case 's': 
/*  754 */       if ((paramLong2 & 0x8000000) != 0L)
/*  755 */         return jjStartNfaWithStates_0(6, 27, 55);
/*  756 */       if ((paramLong4 & 0x20) != 0L)
/*  757 */         return jjStartNfaWithStates_0(6, 69, 55);
/*  758 */       break;
/*      */     case 't': 
/*  760 */       if ((paramLong2 & 0x800000) != 0L)
/*  761 */         return jjStartNfaWithStates_0(6, 23, 55);
/*  762 */       if ((paramLong4 & 1L) != 0L)
/*  763 */         return jjStartNfaWithStates_0(6, 64, 55);
/*  764 */       return jjMoveStringLiteralDfa7_0(paramLong2, 70368744177664L, paramLong4, 768L);
/*      */     case 'u': 
/*  766 */       return jjMoveStringLiteralDfa7_0(paramLong2, 4194304L, paramLong4, 0L);
/*      */     case 'y': 
/*  768 */       if ((paramLong2 & 0x40000000) != 0L)
/*  769 */         return jjStartNfaWithStates_0(6, 30, 55);
/*  770 */       break;
/*      */     }
/*      */     
/*      */     
/*  774 */     return jjStartNfa_0(5, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa7_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  778 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  779 */       return jjStartNfa_0(5, paramLong1, paramLong3, 0L);
/*  780 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  782 */       jjStopStringLiteralDfa_0(6, paramLong2, paramLong4, 0L);
/*  783 */       return 7;
/*      */     }
/*  785 */     switch (curChar)
/*      */     {
/*      */     case '_': 
/*  788 */       return jjMoveStringLiteralDfa8_0(paramLong2, 0L, paramLong4, 2048L);
/*      */     case 'a': 
/*  790 */       return jjMoveStringLiteralDfa8_0(paramLong2, 0L, paramLong4, 1024L);
/*      */     case 'c': 
/*  792 */       return jjMoveStringLiteralDfa8_0(paramLong2, -9223371487098961920L, paramLong4, 0L);
/*      */     case 'e': 
/*  794 */       if ((paramLong2 & 0x400000) != 0L)
/*  795 */         return jjStartNfaWithStates_0(7, 22, 55);
/*  796 */       if ((paramLong2 & 0x2000000000000000) != 0L)
/*  797 */         return jjStartNfaWithStates_0(7, 61, 55);
/*  798 */       return jjMoveStringLiteralDfa8_0(paramLong2, 70506183131136L, paramLong4, 0L);
/*      */     case 'i': 
/*  800 */       return jjMoveStringLiteralDfa8_0(paramLong2, 0L, paramLong4, 64L);
/*      */     case 'n': 
/*  802 */       return jjMoveStringLiteralDfa8_0(paramLong2, 153122421690335232L, paramLong4, 0L);
/*      */     case 'r': 
/*  804 */       return jjMoveStringLiteralDfa8_0(paramLong2, 0L, paramLong4, 4);
/*      */     case 's': 
/*  806 */       return jjMoveStringLiteralDfa8_0(paramLong2, 0L, paramLong4, 16L);
/*      */     case 't': 
/*  808 */       if ((paramLong2 & 0x2000) != 0L)
/*  809 */         return jjStartNfaWithStates_0(7, 13, 55);
/*  810 */       return jjMoveStringLiteralDfa8_0(paramLong2, 0L, paramLong4, 8328L);
/*      */     case 'y': 
/*  812 */       if ((paramLong4 & 0x100) != 0L)
/*      */       {
/*  814 */         jjmatchedKind = 72;
/*  815 */         jjmatchedPos = 7;
/*      */       }
/*  817 */       return jjMoveStringLiteralDfa8_0(paramLong2, 0L, paramLong4, 512L);
/*      */     }
/*      */     
/*      */     
/*  821 */     return jjStartNfa_0(6, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa8_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  825 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  826 */       return jjStartNfa_0(6, paramLong1, paramLong3, 0L);
/*  827 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  829 */       jjStopStringLiteralDfa_0(7, paramLong2, paramLong4, 0L);
/*  830 */       return 8;
/*      */     }
/*  832 */     switch (curChar)
/*      */     {
/*      */     case '_': 
/*  835 */       return jjMoveStringLiteralDfa9_0(paramLong2, 0L, paramLong4, 512L);
/*      */     case 'a': 
/*  837 */       return jjMoveStringLiteralDfa9_0(paramLong2, 0L, paramLong4, 2048L);
/*      */     case 'c': 
/*  839 */       return jjMoveStringLiteralDfa9_0(paramLong2, 0L, paramLong4, 1024L);
/*      */     case 'd': 
/*  841 */       if ((paramLong2 & 0x400000000000) != 0L)
/*  842 */         return jjStartNfaWithStates_0(8, 46, 55);
/*  843 */       break;
/*      */     case 'e': 
/*  845 */       if ((paramLong2 & 0x8000000000) != 0L)
/*  846 */         return jjStartNfaWithStates_0(8, 39, 55);
/*  847 */       return jjMoveStringLiteralDfa9_0(paramLong2, 0L, paramLong4, 8208L);
/*      */     case 'i': 
/*  849 */       return jjMoveStringLiteralDfa9_0(paramLong2, 9007199254740992L, paramLong4, 128L);
/*      */     case 'o': 
/*  851 */       return jjMoveStringLiteralDfa9_0(paramLong2, 137438953472L, paramLong4, 0L);
/*      */     case 's': 
/*  853 */       if ((paramLong4 & 4) != 0L)
/*  854 */         return jjStartNfaWithStates_0(8, 66, 55);
/*  855 */       if ((paramLong4 & 0x8) != 0L)
/*  856 */         return jjStartNfaWithStates_0(8, 67, 55);
/*  857 */       break;
/*      */     case 't': 
/*  859 */       if ((paramLong2 & 0x200000000000000) != 0L)
/*  860 */         return jjStartNfaWithStates_0(8, 57, 55);
/*  861 */       return jjMoveStringLiteralDfa9_0(paramLong2, -9223372002495037440L, paramLong4, 64L);
/*      */     }
/*      */     
/*      */     
/*  865 */     return jjStartNfa_0(7, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa9_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  869 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  870 */       return jjStartNfa_0(7, paramLong1, paramLong3, 0L);
/*  871 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  873 */       jjStopStringLiteralDfa_0(8, paramLong2, paramLong4, 0L);
/*  874 */       return 9;
/*      */     }
/*  876 */     switch (curChar)
/*      */     {
/*      */     case '_': 
/*  879 */       return jjMoveStringLiteralDfa10_0(paramLong2, 0L, paramLong4, 16L);
/*      */     case 'c': 
/*  881 */       return jjMoveStringLiteralDfa10_0(paramLong2, 0L, paramLong4, 2048L);
/*      */     case 'f': 
/*  883 */       if ((paramLong2 & 0x2000000000) != 0L)
/*  884 */         return jjStartNfaWithStates_0(9, 37, 55);
/*  885 */       break;
/*      */     case 'i': 
/*  887 */       return jjMoveStringLiteralDfa10_0(paramLong2, Long.MIN_VALUE, paramLong4, 64L);
/*      */     case 'o': 
/*  889 */       return jjMoveStringLiteralDfa10_0(paramLong2, 0L, paramLong4, 128L);
/*      */     case 's': 
/*  891 */       if ((paramLong2 & 0x800000000) != 0L)
/*  892 */         return jjStartNfaWithStates_0(9, 35, 55);
/*  893 */       return jjMoveStringLiteralDfa10_0(paramLong2, 0L, paramLong4, 8192L);
/*      */     case 't': 
/*  895 */       return jjMoveStringLiteralDfa10_0(paramLong2, 0L, paramLong4, 1536L);
/*      */     case 'z': 
/*  897 */       return jjMoveStringLiteralDfa10_0(paramLong2, 9007199254740992L, paramLong4, 0L);
/*      */     }
/*      */     
/*      */     
/*  901 */     return jjStartNfa_0(8, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa10_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  905 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  906 */       return jjStartNfa_0(8, paramLong1, paramLong3, 0L);
/*  907 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  909 */       jjStopStringLiteralDfa_0(9, paramLong2, paramLong4, 0L);
/*  910 */       return 10;
/*      */     }
/*  912 */     switch (curChar)
/*      */     {
/*      */     case 'e': 
/*  915 */       return jjMoveStringLiteralDfa11_0(paramLong2, 9007199254740992L, paramLong4, 512L);
/*      */     case 'i': 
/*  917 */       return jjMoveStringLiteralDfa11_0(paramLong2, 0L, paramLong4, 1024L);
/*      */     case 'n': 
/*  919 */       if ((paramLong4 & 0x80) != 0L)
/*  920 */         return jjStartNfaWithStates_0(10, 71, 55);
/*  921 */       break;
/*      */     case 'o': 
/*  923 */       return jjMoveStringLiteralDfa11_0(paramLong2, Long.MIN_VALUE, paramLong4, 64L);
/*      */     case 'r': 
/*  925 */       return jjMoveStringLiteralDfa11_0(paramLong2, 0L, paramLong4, 16L);
/*      */     case 't': 
/*  927 */       if ((paramLong4 & 0x2000) != 0L)
/*  928 */         return jjStartNfaWithStates_0(10, 77, 55);
/*  929 */       return jjMoveStringLiteralDfa11_0(paramLong2, 0L, paramLong4, 2048L);
/*      */     }
/*      */     
/*      */     
/*  933 */     return jjStartNfa_0(9, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa11_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  937 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  938 */       return jjStartNfa_0(9, paramLong1, paramLong3, 0L);
/*  939 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  941 */       jjStopStringLiteralDfa_0(10, paramLong2, paramLong4, 0L);
/*  942 */       return 11;
/*      */     }
/*  944 */     switch (curChar)
/*      */     {
/*      */     case 'd': 
/*  947 */       if ((paramLong2 & 0x20000000000000) != 0L)
/*  948 */         return jjStartNfaWithStates_0(11, 53, 55);
/*  949 */       break;
/*      */     case 'i': 
/*  951 */       return jjMoveStringLiteralDfa12_0(paramLong2, 0L, paramLong4, 2048L);
/*      */     case 'n': 
/*  953 */       if ((paramLong2 & 0x8000000000000000) != 0L)
/*  954 */         return jjStartNfaWithStates_0(11, 63, 55);
/*  955 */       if ((paramLong4 & 0x40) != 0L)
/*  956 */         return jjStartNfaWithStates_0(11, 70, 55);
/*  957 */       break;
/*      */     case 'o': 
/*  959 */       return jjMoveStringLiteralDfa12_0(paramLong2, 0L, paramLong4, 1024L);
/*      */     case 's': 
/*  961 */       return jjMoveStringLiteralDfa12_0(paramLong2, 0L, paramLong4, 512L);
/*      */     case 'u': 
/*  963 */       return jjMoveStringLiteralDfa12_0(paramLong2, 0L, paramLong4, 16L);
/*      */     }
/*      */     
/*      */     
/*  967 */     return jjStartNfa_0(10, paramLong2, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa12_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*  971 */     if ((paramLong2 &= paramLong1 | paramLong4 &= paramLong3) == 0L)
/*  972 */       return jjStartNfa_0(10, paramLong1, paramLong3, 0L);
/*  973 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/*  975 */       jjStopStringLiteralDfa_0(11, 0L, paramLong4, 0L);
/*  976 */       return 12;
/*      */     }
/*  978 */     switch (curChar)
/*      */     {
/*      */     case 'l': 
/*  981 */       return jjMoveStringLiteralDfa13_0(paramLong4, 16L);
/*      */     case 'n': 
/*  983 */       if ((paramLong4 & 0x400) != 0L)
/*  984 */         return jjStartNfaWithStates_0(12, 74, 55);
/*  985 */       break;
/*      */     case 'o': 
/*  987 */       return jjMoveStringLiteralDfa13_0(paramLong4, 2048L);
/*      */     case 't': 
/*  989 */       if ((paramLong4 & 0x200) != 0L)
/*  990 */         return jjStartNfaWithStates_0(12, 73, 55);
/*  991 */       break;
/*      */     }
/*      */     
/*      */     
/*  995 */     return jjStartNfa_0(11, 0L, paramLong4, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa13_0(long paramLong1, long paramLong2) {
/*  999 */     if ((paramLong2 &= paramLong1) == 0L)
/* 1000 */       return jjStartNfa_0(11, 0L, paramLong1, 0L);
/* 1001 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1003 */       jjStopStringLiteralDfa_0(12, 0L, paramLong2, 0L);
/* 1004 */       return 13;
/*      */     }
/* 1006 */     switch (curChar)
/*      */     {
/*      */     case 'e': 
/* 1009 */       return jjMoveStringLiteralDfa14_0(paramLong2, 16L);
/*      */     case 'n': 
/* 1011 */       if ((paramLong2 & 0x800) != 0L)
/* 1012 */         return jjStartNfaWithStates_0(13, 75, 55);
/* 1013 */       break;
/*      */     }
/*      */     
/*      */     
/* 1017 */     return jjStartNfa_0(12, 0L, paramLong2, 0L);
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa14_0(long paramLong1, long paramLong2) {
/* 1021 */     if ((paramLong2 &= paramLong1) == 0L)
/* 1022 */       return jjStartNfa_0(12, 0L, paramLong1, 0L);
/* 1023 */     try { curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1025 */       jjStopStringLiteralDfa_0(13, 0L, paramLong2, 0L);
/* 1026 */       return 14;
/*      */     }
/* 1028 */     switch (curChar)
/*      */     {
/*      */     case 's': 
/* 1031 */       if ((paramLong2 & 0x10) != 0L)
/* 1032 */         return jjStartNfaWithStates_0(14, 68, 55);
/* 1033 */       break;
/*      */     }
/*      */     
/*      */     
/* 1037 */     return jjStartNfa_0(13, 0L, paramLong2, 0L);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAdd(int paramInt) {
/* 1041 */     if (jjrounds[paramInt] != jjround)
/*      */     {
/* 1043 */       jjstateSet[(jjnewStateCnt++)] = paramInt;
/* 1044 */       jjrounds[paramInt] = jjround;
/*      */     }
/*      */   }
/*      */   
/*      */   private static final void jjAddStates(int paramInt1, int paramInt2) {
/*      */     do {
/* 1050 */       jjstateSet[(jjnewStateCnt++)] = jjnextStates[paramInt1];
/* 1051 */     } while (paramInt1++ != paramInt2);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAddTwoStates(int paramInt1, int paramInt2) {
/* 1055 */     jjCheckNAdd(paramInt1);
/* 1056 */     jjCheckNAdd(paramInt2);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAddStates(int paramInt1, int paramInt2) {
/*      */     do {
/* 1061 */       jjCheckNAdd(jjnextStates[paramInt1]);
/* 1062 */     } while (paramInt1++ != paramInt2);
/*      */   }
/*      */   
/*      */   private static final void jjCheckNAddStates(int paramInt) {
/* 1066 */     jjCheckNAdd(jjnextStates[paramInt]);
/* 1067 */     jjCheckNAdd(jjnextStates[(paramInt + 1)]); }
/*      */   
/* 1069 */   static final long[] jjbitVec0 = { -2L, -1, -1, -1 };
/*      */   
/*      */ 
/* 1072 */   static final long[] jjbitVec2 = { 0, 0, -1, -1 };
/*      */   
/*      */ 
/* 1075 */   static final long[] jjbitVec3 = { 5632L };
/*      */   
/*      */ 
/* 1078 */   static final long[] jjbitVec4 = { 0, 281200098803712L, 0281200098803712L };
/*      */   
/*      */ 
/* 1081 */   static final long[] jjbitVec5 = { 0, 4393751543808L, 0287948901175001088L };
/*      */   
/*      */ 
/* 1084 */   static final long[] jjbitVec6 = { 0, 281200098803712L, 0280925220896768L };
/*      */   
/*      */ 
/* 1087 */   static final long[] jjbitVec7 = { 0281200098803712L };
/*      */   
/*      */ 
/* 1090 */   static final long[] jjbitVec8 = { 0, 67043328L, 067043328L };
/*      */   
/*      */ 
/* 1093 */   static final long[] jjbitVec9 = { 01023L };
/*      */   
/*      */ 
/* 1096 */   static final long[] jjbitVec10 = { 2301339413881290750L, -16384L, 4294967295L, 432345564227567616L };
/*      */   
/*      */ 
/* 1099 */   static final long[] jjbitVec11 = { 000-36028797027352577L };
/*      */   
/*      */ 
/* 1102 */   static final long[] jjbitVec12 = { 0, -1, -1, -1 };
/*      */   
/*      */ 
/* 1105 */   static final long[] jjbitVec13 = { -1, -1, 65535L };
/*      */   
/*      */ 
/* 1108 */   static final long[] jjbitVec14 = { -1, -1 };
/*      */   
/*      */ 
/* 1111 */   static final long[] jjbitVec15 = { 70368744177663L };
/*      */   
/*      */ 
/*      */ 
/*      */   private static final int jjMoveNfa_0(int paramInt1, int paramInt2)
/*      */   {
/* 1117 */     int i = 0;
/* 1118 */     jjnewStateCnt = 56;
/* 1119 */     int j = 1;
/* 1120 */     jjstateSet[0] = paramInt1;
/* 1121 */     int k = Integer.MAX_VALUE;
/*      */     for (;;)
/*      */     {
/* 1124 */       if (++jjround == Integer.MAX_VALUE)
/* 1125 */         ReInitRounds();
/* 1126 */       long l1; if (curChar < '@')
/*      */       {
/* 1128 */         l1 = 1L << curChar;
/*      */         do
/*      */         {
/* 1131 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 52: 
/* 1134 */             if ((0x3FF000000000000 & l1) != 0L) {
/* 1135 */               jjCheckNAddStates(0, 6);
/* 1136 */             } else if (curChar == '.')
/* 1137 */               jjCheckNAdd(8);
/* 1138 */             if ((0x3FE000000000000 & l1) != 0L)
/*      */             {
/* 1140 */               if (k > 79)
/* 1141 */                 k = 79;
/* 1142 */               jjCheckNAddTwoStates(5, 6);
/*      */             }
/* 1144 */             else if (curChar == '0')
/*      */             {
/* 1146 */               if (k > 79)
/* 1147 */                 k = 79;
/* 1148 */               jjCheckNAddTwoStates(50, 6);
/*      */             }
/* 1150 */             if (curChar == '0')
/* 1151 */               jjCheckNAdd(48);
/* 1152 */             break;
/*      */           case 3: 
/* 1154 */             if ((0x3FF000000000000 & l1) != 0L) {
/* 1155 */               jjCheckNAddStates(0, 6);
/* 1156 */             } else if (curChar == '$')
/*      */             {
/* 1158 */               if (k > 87)
/* 1159 */                 k = 87;
/* 1160 */               jjCheckNAdd(55);
/*      */             }
/* 1162 */             else if (curChar == '-') {
/* 1163 */               jjAddStates(7, 11);
/* 1164 */             } else if (curChar == '"') {
/* 1165 */               jjCheckNAddStates(12, 14);
/* 1166 */             } else if (curChar == '\'') {
/* 1167 */               jjAddStates(15, 16);
/* 1168 */             } else if (curChar == '.') {
/* 1169 */               jjCheckNAdd(8);
/* 1170 */             } else if (curChar == '/') {
/* 1171 */               jjstateSet[(jjnewStateCnt++)] = 2; }
/* 1172 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1174 */               if (k > 89)
/* 1175 */                 k = 89;
/*      */             }
/* 1177 */             if ((0x3FE000000000000 & l1) != 0L)
/*      */             {
/* 1179 */               if (k > 79)
/* 1180 */                 k = 79;
/* 1181 */               jjCheckNAddTwoStates(5, 6);
/*      */             }
/* 1183 */             else if (curChar == '0')
/*      */             {
/* 1185 */               if (k > 79)
/* 1186 */                 k = 79;
/* 1187 */               jjCheckNAddStates(17, 19);
/*      */             }
/* 1189 */             break;
/*      */           case 0: 
/* 1191 */             if (curChar == '*')
/* 1192 */               jjstateSet[(jjnewStateCnt++)] = 1;
/* 1193 */             break;
/*      */           case 1: 
/* 1195 */             if (((0xFFFF7FFFFFFFFFFF & l1) != 0L) && (k > 7))
/* 1196 */               k = 7;
/* 1197 */             break;
/*      */           case 2: 
/* 1199 */             if (curChar == '*')
/* 1200 */               jjstateSet[(jjnewStateCnt++)] = 0;
/* 1201 */             break;
/*      */           case 4: 
/* 1203 */             if ((0x3FE000000000000 & l1) != 0L)
/*      */             {
/* 1205 */               if (k > 79)
/* 1206 */                 k = 79;
/* 1207 */               jjCheckNAddTwoStates(5, 6); }
/* 1208 */             break;
/*      */           case 5: 
/* 1210 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1212 */               if (k > 79)
/* 1213 */                 k = 79;
/* 1214 */               jjCheckNAddTwoStates(5, 6); }
/* 1215 */             break;
/*      */           case 7: 
/* 1217 */             if (curChar == '.')
/* 1218 */               jjCheckNAdd(8);
/* 1219 */             break;
/*      */           case 8: 
/* 1221 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1223 */               if (k > 83)
/* 1224 */                 k = 83;
/* 1225 */               jjCheckNAddStates(20, 22); }
/* 1226 */             break;
/*      */           case 10: 
/* 1228 */             if ((0x280000000000 & l1) != 0L)
/* 1229 */               jjCheckNAdd(11);
/* 1230 */             break;
/*      */           case 11: 
/* 1232 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1234 */               if (k > 83)
/* 1235 */                 k = 83;
/* 1236 */               jjCheckNAddTwoStates(11, 12); }
/* 1237 */             break;
/*      */           case 13: 
/* 1239 */             if (curChar == '\'')
/* 1240 */               jjAddStates(15, 16);
/* 1241 */             break;
/*      */           case 14: 
/* 1243 */             if ((0xFFFFFF7FFFFFDBFF & l1) != 0L)
/* 1244 */               jjCheckNAdd(15);
/* 1245 */             break;
/*      */           case 15: 
/* 1247 */             if ((curChar == '\'') && (k > 85))
/* 1248 */               k = 85;
/* 1249 */             break;
/*      */           case 17: 
/* 1251 */             if ((0x8400000000 & l1) != 0L)
/* 1252 */               jjCheckNAdd(15);
/* 1253 */             break;
/*      */           case 18: 
/* 1255 */             if ((0xFF000000000000 & l1) != 0L)
/* 1256 */               jjCheckNAddTwoStates(19, 15);
/* 1257 */             break;
/*      */           case 19: 
/* 1259 */             if ((0xFF000000000000 & l1) != 0L)
/* 1260 */               jjCheckNAdd(15);
/* 1261 */             break;
/*      */           case 20: 
/* 1263 */             if ((0xF000000000000 & l1) != 0L)
/* 1264 */               jjstateSet[(jjnewStateCnt++)] = 21;
/* 1265 */             break;
/*      */           case 21: 
/* 1267 */             if ((0xFF000000000000 & l1) != 0L)
/* 1268 */               jjCheckNAdd(19);
/* 1269 */             break;
/*      */           case 22: 
/* 1271 */             if (curChar == '"')
/* 1272 */               jjCheckNAddStates(12, 14);
/* 1273 */             break;
/*      */           case 23: 
/* 1275 */             if ((0xFFFFFFFBFFFFDBFF & l1) != 0L)
/* 1276 */               jjCheckNAddStates(12, 14);
/* 1277 */             break;
/*      */           case 25: 
/* 1279 */             if ((0x8400000000 & l1) != 0L)
/* 1280 */               jjCheckNAddStates(12, 14);
/* 1281 */             break;
/*      */           case 26: 
/* 1283 */             if ((curChar == '"') && (k > 86))
/* 1284 */               k = 86;
/* 1285 */             break;
/*      */           case 27: 
/* 1287 */             if ((0xFF000000000000 & l1) != 0L)
/* 1288 */               jjCheckNAddStates(23, 26);
/* 1289 */             break;
/*      */           case 28: 
/* 1291 */             if ((0xFF000000000000 & l1) != 0L)
/* 1292 */               jjCheckNAddStates(12, 14);
/* 1293 */             break;
/*      */           case 29: 
/* 1295 */             if ((0xF000000000000 & l1) != 0L)
/* 1296 */               jjstateSet[(jjnewStateCnt++)] = 30;
/* 1297 */             break;
/*      */           case 30: 
/* 1299 */             if ((0xFF000000000000 & l1) != 0L)
/* 1300 */               jjCheckNAdd(28);
/* 1301 */             break;
/*      */           case 31: 
/* 1303 */             if (((0x3FF000000000000 & l1) != 0L) && (k > 89))
/* 1304 */               k = 89;
/* 1305 */             break;
/*      */           case 32: 
/* 1307 */             if ((0x3FF000000000000 & l1) != 0L)
/* 1308 */               jjCheckNAddStates(0, 6);
/* 1309 */             break;
/*      */           case 33: 
/* 1311 */             if ((0x3FF000000000000 & l1) != 0L)
/* 1312 */               jjCheckNAddTwoStates(33, 34);
/* 1313 */             break;
/*      */           case 34: 
/* 1315 */             if (curChar == '.')
/*      */             {
/* 1317 */               if (k > 83)
/* 1318 */                 k = 83;
/* 1319 */               jjCheckNAddStates(27, 29); }
/* 1320 */             break;
/*      */           case 35: 
/* 1322 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1324 */               if (k > 83)
/* 1325 */                 k = 83;
/* 1326 */               jjCheckNAddStates(27, 29); }
/* 1327 */             break;
/*      */           case 37: 
/* 1329 */             if ((0x280000000000 & l1) != 0L)
/* 1330 */               jjCheckNAdd(38);
/* 1331 */             break;
/*      */           case 38: 
/* 1333 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1335 */               if (k > 83)
/* 1336 */                 k = 83;
/* 1337 */               jjCheckNAddTwoStates(38, 12); }
/* 1338 */             break;
/*      */           case 39: 
/* 1340 */             if ((0x3FF000000000000 & l1) != 0L)
/* 1341 */               jjCheckNAddTwoStates(39, 40);
/* 1342 */             break;
/*      */           case 41: 
/* 1344 */             if ((0x280000000000 & l1) != 0L)
/* 1345 */               jjCheckNAdd(42);
/* 1346 */             break;
/*      */           case 42: 
/* 1348 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1350 */               if (k > 83)
/* 1351 */                 k = 83;
/* 1352 */               jjCheckNAddTwoStates(42, 12); }
/* 1353 */             break;
/*      */           case 43: 
/* 1355 */             if ((0x3FF000000000000 & l1) != 0L)
/* 1356 */               jjCheckNAddStates(30, 32);
/* 1357 */             break;
/*      */           case 45: 
/* 1359 */             if ((0x280000000000 & l1) != 0L)
/* 1360 */               jjCheckNAdd(46);
/* 1361 */             break;
/*      */           case 46: 
/* 1363 */             if ((0x3FF000000000000 & l1) != 0L)
/* 1364 */               jjCheckNAddTwoStates(46, 12);
/* 1365 */             break;
/*      */           case 47: 
/* 1367 */             if (curChar == '0')
/*      */             {
/* 1369 */               if (k > 79)
/* 1370 */                 k = 79;
/* 1371 */               jjCheckNAddStates(17, 19); }
/* 1372 */             break;
/*      */           case 49: 
/* 1374 */             if ((0x3FF000000000000 & l1) != 0L)
/*      */             {
/* 1376 */               if (k > 79)
/* 1377 */                 k = 79;
/* 1378 */               jjCheckNAddTwoStates(49, 6); }
/* 1379 */             break;
/*      */           case 50: 
/* 1381 */             if ((0xFF000000000000 & l1) != 0L)
/*      */             {
/* 1383 */               if (k > 79)
/* 1384 */                 k = 79;
/* 1385 */               jjCheckNAddTwoStates(50, 6); }
/* 1386 */             break;
/*      */           case 51: 
/* 1388 */             if (curChar == '-')
/* 1389 */               jjAddStates(7, 11);
/* 1390 */             break;
/*      */           case 53: 
/* 1392 */             if (curChar == '0')
/*      */             {
/* 1394 */               if (k > 79)
/* 1395 */                 k = 79;
/* 1396 */               jjCheckNAddTwoStates(50, 6); }
/* 1397 */             break;
/*      */           case 54: 
/* 1399 */             if (curChar == '$')
/*      */             {
/* 1401 */               if (k > 87)
/* 1402 */                 k = 87;
/* 1403 */               jjCheckNAdd(55); }
/* 1404 */             break;
/*      */           case 55: 
/* 1406 */             if ((0x3FF001000000000 & l1) != 0L)
/*      */             {
/* 1408 */               if (k > 87)
/* 1409 */                 k = 87;
/* 1410 */               jjCheckNAdd(55);
/*      */             }
/*      */             break;
/*      */           }
/* 1414 */         } while (j != i);
/*      */       }
/* 1416 */       else if (curChar < '')
/*      */       {
/* 1418 */         l1 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1421 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 3: 
/*      */           case 55: 
/* 1425 */             if ((0x7FFFFFE87FFFFFE & l1) != 0L)
/*      */             {
/* 1427 */               if (k > 87)
/* 1428 */                 k = 87;
/* 1429 */               jjCheckNAdd(55); }
/* 1430 */             break;
/*      */           case 1: 
/* 1432 */             if (k > 7)
/* 1433 */               k = 7;
/* 1434 */             break;
/*      */           case 6: 
/* 1436 */             if (((0x100000001000 & l1) != 0L) && (k > 79))
/* 1437 */               k = 79;
/* 1438 */             break;
/*      */           case 9: 
/* 1440 */             if ((0x2000000020 & l1) != 0L)
/* 1441 */               jjAddStates(33, 34);
/* 1442 */             break;
/*      */           case 12: 
/* 1444 */             if (((0x5000000050 & l1) != 0L) && (k > 83))
/* 1445 */               k = 83;
/* 1446 */             break;
/*      */           case 14: 
/* 1448 */             if ((0xFFFFFFFFEFFFFFFF & l1) != 0L)
/* 1449 */               jjCheckNAdd(15);
/* 1450 */             break;
/*      */           case 16: 
/* 1452 */             if (curChar == '\\')
/* 1453 */               jjAddStates(35, 37);
/* 1454 */             break;
/*      */           case 17: 
/* 1456 */             if ((0x14404410000000 & l1) != 0L)
/* 1457 */               jjCheckNAdd(15);
/* 1458 */             break;
/*      */           case 23: 
/* 1460 */             if ((0xFFFFFFFFEFFFFFFF & l1) != 0L)
/* 1461 */               jjCheckNAddStates(12, 14);
/* 1462 */             break;
/*      */           case 24: 
/* 1464 */             if (curChar == '\\')
/* 1465 */               jjAddStates(38, 40);
/* 1466 */             break;
/*      */           case 25: 
/* 1468 */             if ((0x14404410000000 & l1) != 0L)
/* 1469 */               jjCheckNAddStates(12, 14);
/* 1470 */             break;
/*      */           case 36: 
/* 1472 */             if ((0x2000000020 & l1) != 0L)
/* 1473 */               jjAddStates(41, 42);
/* 1474 */             break;
/*      */           case 40: 
/* 1476 */             if ((0x2000000020 & l1) != 0L)
/* 1477 */               jjAddStates(43, 44);
/* 1478 */             break;
/*      */           case 44: 
/* 1480 */             if ((0x2000000020 & l1) != 0L)
/* 1481 */               jjAddStates(45, 46);
/* 1482 */             break;
/*      */           case 48: 
/* 1484 */             if ((0x100000001000000 & l1) != 0L)
/* 1485 */               jjCheckNAdd(49);
/* 1486 */             break;
/*      */           case 49: 
/* 1488 */             if ((0x7E0000007E & l1) != 0L)
/*      */             {
/* 1490 */               if (k > 79)
/* 1491 */                 k = 79;
/* 1492 */               jjCheckNAddTwoStates(49, 6);
/*      */             }
/*      */             break;
/*      */           }
/* 1496 */         } while (j != i);
/*      */       }
/*      */       else
/*      */       {
/* 1500 */         int m = curChar >> '\b';
/* 1501 */         int n = m >> 6;
/* 1502 */         long l2 = 1L << (m & 0x3F);
/* 1503 */         int i1 = (curChar & 0xFF) >> '\006';
/* 1504 */         long l3 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1507 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 3: 
/* 1510 */             if (jjCanMove_1(m, n, i1, l2, l3))
/*      */             {
/* 1512 */               if (k > 89)
/* 1513 */                 k = 89;
/*      */             }
/* 1515 */             if (jjCanMove_2(m, n, i1, l2, l3))
/*      */             {
/* 1517 */               if (k > 87)
/* 1518 */                 k = 87;
/* 1519 */               jjCheckNAdd(55);
/*      */             }
/* 1521 */             break;
/*      */           case 1: 
/* 1523 */             if ((jjCanMove_0(m, n, i1, l2, l3)) && (k > 7))
/* 1524 */               k = 7;
/* 1525 */             break;
/*      */           case 14: 
/* 1527 */             if (jjCanMove_0(m, n, i1, l2, l3))
/* 1528 */               jjstateSet[(jjnewStateCnt++)] = 15;
/* 1529 */             break;
/*      */           case 23: 
/* 1531 */             if (jjCanMove_0(m, n, i1, l2, l3))
/* 1532 */               jjAddStates(12, 14);
/* 1533 */             break;
/*      */           case 31: 
/* 1535 */             if ((jjCanMove_1(m, n, i1, l2, l3)) && (k > 89))
/* 1536 */               k = 89;
/* 1537 */             break;
/*      */           case 54: 
/*      */           case 55: 
/* 1540 */             if (jjCanMove_2(m, n, i1, l2, l3))
/*      */             {
/* 1542 */               if (k > 87)
/* 1543 */                 k = 87;
/* 1544 */               jjCheckNAdd(55);
/*      */             }
/*      */             break;
/*      */           }
/* 1548 */         } while (j != i);
/*      */       }
/* 1550 */       if (k != Integer.MAX_VALUE)
/*      */       {
/* 1552 */         jjmatchedKind = k;
/* 1553 */         jjmatchedPos = paramInt2;
/* 1554 */         k = Integer.MAX_VALUE;
/*      */       }
/* 1556 */       paramInt2++;
/* 1557 */       if ((j = jjnewStateCnt) == (i = 56 - (jjnewStateCnt = i)))
/* 1558 */         return paramInt2;
/* 1559 */       try { curChar = JavaCharStream.readChar();
/* 1560 */       } catch (IOException localIOException) { return paramInt2;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/* 1565 */   private static final int jjMoveStringLiteralDfa0_3() { switch (curChar)
/*      */     {
/*      */     case '*': 
/* 1568 */       return jjMoveStringLiteralDfa1_3(2048L);
/*      */     }
/* 1570 */     return 1;
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa1_3(long paramLong) {
/*      */     try {
/* 1575 */       curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1577 */       return 1;
/*      */     }
/* 1579 */     switch (curChar)
/*      */     {
/*      */     case '/': 
/* 1582 */       if ((paramLong & 0x800) != 0L)
/* 1583 */         return jjStopAtPos(1, 11);
/* 1584 */       break;
/*      */     default: 
/* 1586 */       return 2;
/*      */     }
/* 1588 */     return 2;
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa0_1() {
/* 1592 */     return jjMoveNfa_1(0, 0);
/*      */   }
/*      */   
/*      */   private static final int jjMoveNfa_1(int paramInt1, int paramInt2)
/*      */   {
/* 1597 */     int i = 0;
/* 1598 */     jjnewStateCnt = 3;
/* 1599 */     int j = 1;
/* 1600 */     jjstateSet[0] = paramInt1;
/* 1601 */     int k = Integer.MAX_VALUE;
/*      */     for (;;)
/*      */     {
/* 1604 */       if (++jjround == Integer.MAX_VALUE)
/* 1605 */         ReInitRounds();
/* 1606 */       long l1; if (curChar < '@')
/*      */       {
/* 1608 */         l1 = 1L << curChar;
/*      */         do
/*      */         {
/* 1611 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           case 0: 
/* 1614 */             if ((0x2400 & l1) != 0L)
/*      */             {
/* 1616 */               if (k > 9)
/* 1617 */                 k = 9;
/*      */             }
/* 1619 */             if (curChar == '\r')
/* 1620 */               jjstateSet[(jjnewStateCnt++)] = 1;
/* 1621 */             break;
/*      */           case 1: 
/* 1623 */             if ((curChar == '\n') && (k > 9))
/* 1624 */               k = 9;
/* 1625 */             break;
/*      */           case 2: 
/* 1627 */             if (curChar == '\r') {
/* 1628 */               jjstateSet[(jjnewStateCnt++)] = 1;
/*      */             }
/*      */           }
/*      */           
/* 1632 */         } while (j != i);
/*      */       }
/* 1634 */       else if (curChar < '')
/*      */       {
/* 1636 */         l1 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1639 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           }
/*      */           
/* 1643 */         } while (j != i);
/*      */       }
/*      */       else
/*      */       {
/* 1647 */         int m = curChar >> '\b';
/* 1648 */         int n = m >> 6;
/* 1649 */         long l2 = 1L << (m & 0x3F);
/* 1650 */         int i1 = (curChar & 0xFF) >> '\006';
/* 1651 */         long l3 = 1L << (curChar & 0x3F);
/*      */         do
/*      */         {
/* 1654 */           switch (jjstateSet[(--j)])
/*      */           {
/*      */           }
/*      */           
/* 1658 */         } while (j != i);
/*      */       }
/* 1660 */       if (k != Integer.MAX_VALUE)
/*      */       {
/* 1662 */         jjmatchedKind = k;
/* 1663 */         jjmatchedPos = paramInt2;
/* 1664 */         k = Integer.MAX_VALUE;
/*      */       }
/* 1666 */       paramInt2++;
/* 1667 */       if ((j = jjnewStateCnt) == (i = 3 - (jjnewStateCnt = i)))
/* 1668 */         return paramInt2;
/* 1669 */       try { curChar = JavaCharStream.readChar();
/* 1670 */       } catch (IOException localIOException) { return paramInt2;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/* 1675 */   private static final int jjMoveStringLiteralDfa0_2() { switch (curChar)
/*      */     {
/*      */     case '*': 
/* 1678 */       return jjMoveStringLiteralDfa1_2(1024L);
/*      */     }
/* 1680 */     return 1;
/*      */   }
/*      */   
/*      */   private static final int jjMoveStringLiteralDfa1_2(long paramLong) {
/*      */     try {
/* 1685 */       curChar = JavaCharStream.readChar();
/*      */     } catch (IOException localIOException) {
/* 1687 */       return 1;
/*      */     }
/* 1689 */     switch (curChar)
/*      */     {
/*      */     case '/': 
/* 1692 */       if ((paramLong & 0x400) != 0L)
/* 1693 */         return jjStopAtPos(1, 10);
/* 1694 */       break;
/*      */     default: 
/* 1696 */       return 2;
/*      */     }
/* 1698 */     return 2; }
/*      */   
/* 1700 */   static final int[] jjnextStates = { 33, 34, 39, 40, 43, 44, 12, 4, 52, 53, 7, 32, 23, 24, 26, 14, 16, 48, 50, 6, 8, 9, 12, 23, 24, 28, 26, 35, 36, 12, 43, 44, 12, 10, 11, 17, 18, 20, 25, 27, 29, 37, 38, 41, 42, 45, 46 };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private static final boolean jjCanMove_0(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
/*      */   {
/* 1707 */     switch (paramInt1)
/*      */     {
/*      */     case 0: 
/* 1710 */       if ((jjbitVec2[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     }
/* 1712 */     if ((jjbitVec0[paramInt2] & paramLong1) != 0L)
/* 1713 */       return true;
/* 1714 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jjCanMove_1(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
/*      */   {
/* 1719 */     switch (paramInt1)
/*      */     {
/*      */     case 6: 
/* 1722 */       if ((jjbitVec5[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 11: 
/* 1724 */       if ((jjbitVec6[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 13: 
/* 1726 */       if ((jjbitVec7[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 14: 
/* 1728 */       if ((jjbitVec8[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 16: 
/* 1730 */       if ((jjbitVec9[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     }
/* 1732 */     if ((jjbitVec3[paramInt2] & paramLong1) != 0L) {
/* 1733 */       if ((jjbitVec4[paramInt3] & paramLong2) == 0L) {
/* 1734 */         return false;
/*      */       }
/* 1736 */       return true; }
/* 1737 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jjCanMove_2(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
/*      */   {
/* 1742 */     switch (paramInt1)
/*      */     {
/*      */     case 0: 
/* 1745 */       if ((jjbitVec11[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 48: 
/* 1747 */       if ((jjbitVec12[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 49: 
/* 1749 */       if ((jjbitVec13[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 51: 
/* 1751 */       if ((jjbitVec14[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     case 61: 
/* 1753 */       if ((jjbitVec15[paramInt3] & paramLong2) != 0L) 0; return true;
/*      */     }
/* 1755 */     if ((jjbitVec10[paramInt2] & paramLong1) != 0L)
/* 1756 */       return true;
/* 1757 */     return false;
/*      */   }
/*      */   
/* 1760 */   public static final String[] jjstrLiteralImages = { "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "abstract", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "void", "volatile", "while", "abort_action", "defbeat", "beatid", "behaviors", "constants", "discourse_rules", "effects", "precondition", "init_action", "priority", "priority_test", "select_action", "succeed_action", "weight", "weight_test", "::", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "\\", "(", ")", "{", "}", "[", "]", ";", ",", ".", "=", ">", "<", "!", "~", "?", ":", "==", "<=", ">=", "!=", "||", "&&", "++", "--", "+", "-", "*", "/", "&", "|", "^", "%", "<<", ">>", ">>>", "+=", "-=", "*=", "/=", "&=", "|=", "^=", "%=", "<<=", ">>=", ">>>=", ":\\" };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1790 */   public static final String[] lexStateNames = { "DEFAULT", "IN_SINGLE_LINE_COMMENT", "IN_FORMAL_COMMENT", "IN_MULTI_LINE_COMMENT" };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1796 */   public static final int[] jjnewLexState = { -1, -1, -1, -1, -1, -1, 1, 2, 3, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1804 */   static final long[] jjtoToken = { -8191L, -1507329L, 1023L };
/*      */   
/*      */ 
/* 1807 */   static final long[] jjtoSkip = { 3646L };
/*      */   
/*      */ 
/* 1810 */   static final long[] jjtoSpecial = { 3584L };
/*      */   
/*      */ 
/* 1813 */   static final long[] jjtoMore = { 4544L };
/*      */   
/*      */   protected static JavaCharStream input_stream;
/*      */   
/* 1817 */   private static final int[] jjrounds = new int[56];
/* 1818 */   private static final int[] jjstateSet = new int[112];
/*      */   static StringBuffer image;
/*      */   static int jjimageLen;
/*      */   static int lengthOfMatch;
/*      */   protected static char curChar;
/*      */   
/*      */   public BeatParserTokenManager(JavaCharStream paramJavaCharStream) {
/* 1825 */     if (input_stream != null)
/* 1826 */       throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", 1);
/* 1827 */     input_stream = paramJavaCharStream;
/*      */   }
/*      */   
/*      */   public BeatParserTokenManager(JavaCharStream paramJavaCharStream, int paramInt) {
/* 1831 */     this(paramJavaCharStream);
/* 1832 */     SwitchTo(paramInt);
/*      */   }
/*      */   
/*      */   public static void ReInit(JavaCharStream paramJavaCharStream) {
/* 1836 */     jjmatchedPos = jjnewStateCnt = 0;
/* 1837 */     curLexState = defaultLexState;
/* 1838 */     input_stream = paramJavaCharStream;
/* 1839 */     ReInitRounds();
/*      */   }
/*      */   
/*      */   private static final void ReInitRounds()
/*      */   {
/* 1844 */     jjround = -2147483647;
/* 1845 */     for (int i = 56; i-- > 0;)
/* 1846 */       jjrounds[i] = Integer.MIN_VALUE;
/*      */   }
/*      */   
/*      */   public static void ReInit(JavaCharStream paramJavaCharStream, int paramInt) {
/* 1850 */     ReInit(paramJavaCharStream);
/* 1851 */     SwitchTo(paramInt);
/*      */   }
/*      */   
/*      */   public static void SwitchTo(int paramInt) {
/* 1855 */     if ((paramInt >= 4) || (paramInt < 0)) {
/* 1856 */       throw new TokenMgrError("Error: Ignoring invalid lexical state : " + paramInt + ". State unchanged.", 2);
/*      */     }
/* 1858 */     curLexState = paramInt;
/*      */   }
/*      */   
/*      */   protected static Token jjFillToken()
/*      */   {
/* 1863 */     Token localToken = Token.newToken(jjmatchedKind);
/* 1864 */     localToken.kind = jjmatchedKind;
/* 1865 */     String str = jjstrLiteralImages[jjmatchedKind];
/* 1866 */     localToken.image = (str == null ? JavaCharStream.GetImage() : str);
/* 1867 */     localToken.beginLine = JavaCharStream.getBeginLine();
/* 1868 */     localToken.beginColumn = JavaCharStream.getBeginColumn();
/* 1869 */     localToken.endLine = JavaCharStream.getEndLine();
/* 1870 */     localToken.endColumn = JavaCharStream.getEndColumn();
/* 1871 */     return localToken;
/*      */   }
/*      */   
/* 1874 */   static int curLexState = 0;
/* 1875 */   static int defaultLexState = 0;
/*      */   
/*      */   static int jjnewStateCnt;
/*      */   static int jjround;
/*      */   static int jjmatchedPos;
/*      */   static int jjmatchedKind;
/*      */   
/*      */   public static Token getNextToken()
/*      */   {
/* 1884 */     Object localObject = null;
/*      */     
/* 1886 */     int i = 0;
/*      */     label599:
/*      */     for (;;)
/*      */     {
/*      */       Token localToken;
/*      */       try
/*      */       {
/* 1893 */         curChar = JavaCharStream.BeginToken();
/*      */       }
/*      */       catch (IOException localIOException1)
/*      */       {
/* 1897 */         jjmatchedKind = 0;
/* 1898 */         localToken = jjFillToken();
/* 1899 */         localToken.specialToken = ((Token)localObject);
/* 1900 */         return localToken;
/*      */       }
/* 1902 */       image = null;
/* 1903 */       jjimageLen = 0;
/*      */       
/*      */       for (;;)
/*      */       {
/* 1907 */         switch (curLexState) {
/*      */         case 0: 
/*      */           try {
/* 1910 */             JavaCharStream.backup(0);
/*      */             do {
/* 1912 */               curChar = JavaCharStream.BeginToken();
/* 1911 */               if (curChar > ' ') break; } while ((0x100003600 & 1L << curChar) != 0L);
/*      */           } catch (IOException localIOException2) {
/*      */             break label599;
/*      */           }
/* 1915 */           jjmatchedKind = Integer.MAX_VALUE;
/* 1916 */           jjmatchedPos = 0;
/* 1917 */           i = jjMoveStringLiteralDfa0_0();
/* 1918 */           break;
/*      */         case 1: 
/* 1920 */           jjmatchedKind = Integer.MAX_VALUE;
/* 1921 */           jjmatchedPos = 0;
/* 1922 */           i = jjMoveStringLiteralDfa0_1();
/* 1923 */           if ((jjmatchedPos == 0) && (jjmatchedKind > 12))
/*      */           {
/* 1925 */             jjmatchedKind = 12;
/*      */           }
/* 1927 */           break;
/*      */         case 2: 
/* 1929 */           jjmatchedKind = Integer.MAX_VALUE;
/* 1930 */           jjmatchedPos = 0;
/* 1931 */           i = jjMoveStringLiteralDfa0_2();
/* 1932 */           if ((jjmatchedPos == 0) && (jjmatchedKind > 12))
/*      */           {
/* 1934 */             jjmatchedKind = 12;
/*      */           }
/* 1936 */           break;
/*      */         case 3: 
/* 1938 */           jjmatchedKind = Integer.MAX_VALUE;
/* 1939 */           jjmatchedPos = 0;
/* 1940 */           i = jjMoveStringLiteralDfa0_3();
/* 1941 */           if ((jjmatchedPos == 0) && (jjmatchedKind > 12))
/*      */           {
/* 1943 */             jjmatchedKind = 12;
/*      */           }
/*      */           break;
/*      */         }
/* 1947 */         if (jjmatchedKind != Integer.MAX_VALUE)
/*      */         {
/* 1949 */           if (jjmatchedPos + 1 < i)
/* 1950 */             JavaCharStream.backup(i - jjmatchedPos - 1);
/* 1951 */           if ((jjtoToken[(jjmatchedKind >> 6)] & 1L << (jjmatchedKind & 0x3F)) != 0L)
/*      */           {
/* 1953 */             localToken = jjFillToken();
/* 1954 */             localToken.specialToken = ((Token)localObject);
/* 1955 */             if (jjnewLexState[jjmatchedKind] != -1)
/* 1956 */               curLexState = jjnewLexState[jjmatchedKind];
/* 1957 */             return localToken;
/*      */           }
/* 1959 */           if ((jjtoSkip[(jjmatchedKind >> 6)] & 1L << (jjmatchedKind & 0x3F)) != 0L)
/*      */           {
/* 1961 */             if ((jjtoSpecial[(jjmatchedKind >> 6)] & 1L << (jjmatchedKind & 0x3F)) != 0L)
/*      */             {
/* 1963 */               localToken = jjFillToken();
/* 1964 */               if (localObject == null) {
/* 1965 */                 localObject = localToken;
/*      */               }
/*      */               else {
/* 1968 */                 localToken.specialToken = ((Token)localObject);
/* 1969 */                 localObject = ((Token)localObject).next = localToken;
/*      */               }
/* 1971 */               SkipLexicalActions(localToken);
/*      */             }
/*      */             else {
/* 1974 */               SkipLexicalActions(null); }
/* 1975 */             if (jjnewLexState[jjmatchedKind] != -1)
/* 1976 */               curLexState = jjnewLexState[jjmatchedKind];
/* 1977 */             break;
/*      */           }
/* 1979 */           MoreLexicalActions();
/* 1980 */           if (jjnewLexState[jjmatchedKind] != -1)
/* 1981 */             curLexState = jjnewLexState[jjmatchedKind];
/* 1982 */           i = 0;
/* 1983 */           jjmatchedKind = Integer.MAX_VALUE;
/*      */           try {
/* 1985 */             curChar = JavaCharStream.readChar();
/*      */           }
/*      */           catch (IOException localIOException3) {}
/*      */         }
/*      */         else {
/* 1990 */           int j = JavaCharStream.getEndLine();
/* 1991 */           int k = JavaCharStream.getEndColumn();
/* 1992 */           String str = null;
/* 1993 */           boolean bool = false;
/* 1994 */           try { JavaCharStream.readChar();JavaCharStream.backup(1);
/*      */           } catch (IOException localIOException4) {
/* 1996 */             bool = true;
/* 1997 */             str = i <= 1 ? "" : JavaCharStream.GetImage();
/* 1998 */             if ((curChar == '\n') || (curChar == '\r')) {
/* 1999 */               j++;
/* 2000 */               k = 0;
/*      */             }
/*      */             else {
/* 2003 */               k++;
/*      */             } }
/* 2005 */           if (!bool) {
/* 2006 */             JavaCharStream.backup(1);
/* 2007 */             str = i <= 1 ? "" : JavaCharStream.GetImage();
/*      */           }
/* 2009 */           throw new TokenMgrError(bool, curLexState, j, k, str, curChar, 0);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   static void SkipLexicalActions(Token paramToken) {
/* 2016 */     switch (jjmatchedKind)
/*      */     {
/*      */     }
/*      */     
/*      */   }
/*      */   
/*      */   static void MoreLexicalActions()
/*      */   {
/* 2024 */     jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
/* 2025 */     switch (jjmatchedKind)
/*      */     {
/*      */     case 7: 
/* 2028 */       if (image == null) {
/* 2029 */         image = new StringBuffer(new String(JavaCharStream.GetSuffix(jjimageLen)));
/*      */       } else
/* 2031 */         image.append(JavaCharStream.GetSuffix(jjimageLen));
/* 2032 */       jjimageLen = 0;
/* 2033 */       JavaCharStream.backup(1);
/* 2034 */       break;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\BeatParserTokenManager.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */