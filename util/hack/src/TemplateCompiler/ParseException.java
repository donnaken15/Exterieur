/*     */ package TemplateCompiler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ParseException
/*     */   extends Exception
/*     */ {
/*     */   protected boolean specialConstructor;
/*     */   
/*     */ 
/*     */ 
/*     */   public Token currentToken;
/*     */   
/*     */ 
/*     */ 
/*     */   public int[][] expectedTokenSequences;
/*     */   
/*     */ 
/*     */ 
/*     */   public String[] tokenImage;
/*     */   
/*     */ 
/*     */ 
/*     */   protected String eol;
/*     */   
/*     */ 
/*     */ 
/*     */   public ParseException(Token paramToken, int[][] paramArrayOfInt, String[] paramArrayOfString)
/*     */   {
/*  31 */     super("");jdMethod_this();
/*  32 */     this.specialConstructor = true;
/*  33 */     this.currentToken = paramToken;
/*  34 */     this.expectedTokenSequences = paramArrayOfInt;
/*  35 */     this.tokenImage = paramArrayOfString;
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
/*     */   public ParseException()
/*     */   {
/*  49 */     jdMethod_this();
/*  50 */     this.specialConstructor = false;
/*     */   }
/*     */   
/*     */   public ParseException(String paramString) {
/*  54 */     super(paramString);jdMethod_this();
/*  55 */     this.specialConstructor = false;
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
/*  97 */     if (!this.specialConstructor) {
/*  98 */       return super.getMessage();
/*     */     }
/* 100 */     String str1 = "";
/* 101 */     int i = 0;
/* 102 */     for (int j = 0; j < this.expectedTokenSequences.length; j++) {
/* 103 */       if (i < this.expectedTokenSequences[j].length) {
/* 104 */         i = this.expectedTokenSequences[j].length;
/*     */       }
/* 106 */       for (int k = 0; k < this.expectedTokenSequences[j].length; k++) {
/* 107 */         str1 = str1 + this.tokenImage[this.expectedTokenSequences[j][k]] + ' ';
/*     */       }
/* 109 */       if (this.expectedTokenSequences[j][(this.expectedTokenSequences[j].length - 1)] != 0) {
/* 110 */         str1 = str1 + "...";
/*     */       }
/* 112 */       str1 = str1 + this.eol + "    ";
/*     */     }
/* 114 */     String str2 = "Encountered \"";
/* 115 */     Token localToken = this.currentToken.next;
/* 116 */     for (int m = 0; m < i; m++) {
/* 117 */       if (m != 0) str2 = str2 + ' ';
/* 118 */       if (localToken.kind == 0) {
/* 119 */         str2 = str2 + this.tokenImage[0];
/* 120 */         break;
/*     */       }
/* 122 */       str2 = str2 + add_escapes(localToken.image);
/* 123 */       localToken = localToken.next;
/*     */     }
/* 125 */     str2 = str2 + "\" at line " + this.currentToken.next.beginLine + ", column " + this.currentToken.next.beginColumn + '.' + this.eol;
/* 126 */     if (this.expectedTokenSequences.length == 1) {
/* 127 */       str2 = str2 + "Was expecting:" + this.eol + "    ";
/*     */     } else {
/* 129 */       str2 = str2 + "Was expecting one of:" + this.eol + "    ";
/*     */     }
/* 131 */     str2 = str2 + str1;
/* 132 */     return str2;
/*     */   }
/*     */   
/*     */ 
/*     */   private final void jdMethod_this()
/*     */   {
/* 138 */     this.eol = System.getProperty("line.separator", "\n");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected String add_escapes(String paramString)
/*     */   {
/* 146 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/* 148 */     for (int i = 0; i < paramString.length(); i++) {
/* 149 */       switch (paramString.charAt(i))
/*     */       {
/*     */       case '\000': 
/*     */         break;
/*     */       case '\b': 
/* 154 */         localStringBuffer.append("\\b");
/* 155 */         break;
/*     */       case '\t': 
/* 157 */         localStringBuffer.append("\\t");
/* 158 */         break;
/*     */       case '\n': 
/* 160 */         localStringBuffer.append("\\n");
/* 161 */         break;
/*     */       case '\f': 
/* 163 */         localStringBuffer.append("\\f");
/* 164 */         break;
/*     */       case '\r': 
/* 166 */         localStringBuffer.append("\\r");
/* 167 */         break;
/*     */       case '"': 
/* 169 */         localStringBuffer.append("\\\"");
/* 170 */         break;
/*     */       case '\'': 
/* 172 */         localStringBuffer.append("\\'");
/* 173 */         break;
/*     */       case '\\': 
/* 175 */         localStringBuffer.append("\\\\");
/* 176 */         break;
/*     */       default:  char c;
/* 178 */         if (((c = paramString.charAt(i)) < ' ') || (c > '~')) {
/* 179 */           String str = "0000" + Integer.toString(c, 16);
/* 180 */           localStringBuffer.append("\\u" + str.substring(str.length() - 4, str.length()));
/*     */         } else {
/* 182 */           localStringBuffer.append(c);
/*     */         }
/*     */         break;
/*     */       }
/*     */     }
/* 187 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ParseException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */