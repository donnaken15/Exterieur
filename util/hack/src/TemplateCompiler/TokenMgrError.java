/*     */ package TemplateCompiler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TokenMgrError
/*     */   extends Error
/*     */ {
/*     */   static final int LEXICAL_ERROR = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   static final int STATIC_LEXER_ERROR = 1;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   static final int INVALID_LEXICAL_STATE = 2;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   static final int LOOP_DETECTED = 3;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   int errorCode;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected static final String addEscapes(String paramString)
/*     */   {
/*  40 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/*  42 */     for (int i = 0; i < paramString.length(); i++) {
/*  43 */       switch (paramString.charAt(i))
/*     */       {
/*     */       case '\000': 
/*     */         break;
/*     */       case '\b': 
/*  48 */         localStringBuffer.append("\\b");
/*  49 */         break;
/*     */       case '\t': 
/*  51 */         localStringBuffer.append("\\t");
/*  52 */         break;
/*     */       case '\n': 
/*  54 */         localStringBuffer.append("\\n");
/*  55 */         break;
/*     */       case '\f': 
/*  57 */         localStringBuffer.append("\\f");
/*  58 */         break;
/*     */       case '\r': 
/*  60 */         localStringBuffer.append("\\r");
/*  61 */         break;
/*     */       case '"': 
/*  63 */         localStringBuffer.append("\\\"");
/*  64 */         break;
/*     */       case '\'': 
/*  66 */         localStringBuffer.append("\\'");
/*  67 */         break;
/*     */       case '\\': 
/*  69 */         localStringBuffer.append("\\\\");
/*  70 */         break;
/*     */       default:  char c;
/*  72 */         if (((c = paramString.charAt(i)) < ' ') || (c > '~')) {
/*  73 */           String str = "0000" + Integer.toString(c, 16);
/*  74 */           localStringBuffer.append("\\u" + str.substring(str.length() - 4, str.length()));
/*     */         } else {
/*  76 */           localStringBuffer.append(c);
/*     */         }
/*     */         break;
/*     */       }
/*     */     }
/*  81 */     return localStringBuffer.toString();
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
/*     */   private static final String LexicalError(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, String paramString, char paramChar)
/*     */   {
/*  97 */     return "Lexical error at line " + paramInt2 + ", column " + paramInt3 + ".  Encountered: " + (paramBoolean ? "<EOF> " : new StringBuffer("\"").append(addEscapes(String.valueOf(paramChar))).append("\" (").append(paramChar).append("), ").toString()) + "after : \"" + addEscapes(paramString) + '"';
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
/*     */   public String getMessage()
/*     */   {
/* 114 */     return super.getMessage();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public TokenMgrError() {}
/*     */   
/*     */ 
/*     */ 
/*     */   public TokenMgrError(String paramString, int paramInt)
/*     */   {
/* 125 */     super(paramString);
/* 126 */     this.errorCode = paramInt;
/*     */   }
/*     */   
/*     */   public TokenMgrError(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, String paramString, char paramChar, int paramInt4) {
/* 130 */     this(LexicalError(paramBoolean, paramInt1, paramInt2, paramInt3, paramString, paramChar), paramInt4);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\TokenMgrError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */