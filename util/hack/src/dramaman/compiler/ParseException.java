/*     */ package dramaman.compiler;
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
/*     */ 
/*     */   public ParseException(Token paramToken, int[][] paramArrayOfInt, String[] paramArrayOfString)
/*     */   {
/*  32 */     super("");jdMethod_this();
/*  33 */     this.specialConstructor = true;
/*  34 */     this.currentToken = paramToken;
/*  35 */     this.expectedTokenSequences = paramArrayOfInt;
/*  36 */     this.tokenImage = paramArrayOfString;
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
/*  50 */     jdMethod_this();
/*  51 */     this.specialConstructor = false;
/*     */   }
/*     */   
/*     */   public ParseException(String paramString) {
/*  55 */     super(paramString);jdMethod_this();
/*  56 */     this.specialConstructor = false;
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
/*  98 */     if (!this.specialConstructor) {
/*  99 */       return super.getMessage();
/*     */     }
/* 101 */     String str1 = "";
/* 102 */     int i = 0;
/* 103 */     for (int j = 0; j < this.expectedTokenSequences.length; j++) {
/* 104 */       if (i < this.expectedTokenSequences[j].length) {
/* 105 */         i = this.expectedTokenSequences[j].length;
/*     */       }
/* 107 */       for (int k = 0; k < this.expectedTokenSequences[j].length; k++) {
/* 108 */         str1 = str1 + this.tokenImage[this.expectedTokenSequences[j][k]] + ' ';
/*     */       }
/* 110 */       if (this.expectedTokenSequences[j][(this.expectedTokenSequences[j].length - 1)] != 0) {
/* 111 */         str1 = str1 + "...";
/*     */       }
/* 113 */       str1 = str1 + this.eol + "    ";
/*     */     }
/* 115 */     String str2 = "Encountered \"";
/* 116 */     Token localToken = this.currentToken.next;
/* 117 */     for (int m = 0; m < i; m++) {
/* 118 */       if (m != 0) str2 = str2 + ' ';
/* 119 */       if (localToken.kind == 0) {
/* 120 */         str2 = str2 + this.tokenImage[0];
/* 121 */         break;
/*     */       }
/* 123 */       str2 = str2 + add_escapes(localToken.image);
/* 124 */       localToken = localToken.next;
/*     */     }
/* 126 */     str2 = str2 + "\" at line " + this.currentToken.next.beginLine + ", column " + this.currentToken.next.beginColumn + '.' + this.eol;
/* 127 */     if (this.expectedTokenSequences.length == 1) {
/* 128 */       str2 = str2 + "Was expecting:" + this.eol + "    ";
/*     */     } else {
/* 130 */       str2 = str2 + "Was expecting one of:" + this.eol + "    ";
/*     */     }
/* 132 */     str2 = str2 + str1;
/* 133 */     return str2;
/*     */   }
/*     */   
/*     */ 
/*     */   private final void jdMethod_this()
/*     */   {
/* 139 */     this.eol = System.getProperty("line.separator", "\n");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected String add_escapes(String paramString)
/*     */   {
/* 147 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/* 149 */     for (int i = 0; i < paramString.length(); i++) {
/* 150 */       switch (paramString.charAt(i))
/*     */       {
/*     */       case '\000': 
/*     */         break;
/*     */       case '\b': 
/* 155 */         localStringBuffer.append("\\b");
/* 156 */         break;
/*     */       case '\t': 
/* 158 */         localStringBuffer.append("\\t");
/* 159 */         break;
/*     */       case '\n': 
/* 161 */         localStringBuffer.append("\\n");
/* 162 */         break;
/*     */       case '\f': 
/* 164 */         localStringBuffer.append("\\f");
/* 165 */         break;
/*     */       case '\r': 
/* 167 */         localStringBuffer.append("\\r");
/* 168 */         break;
/*     */       case '"': 
/* 170 */         localStringBuffer.append("\\\"");
/* 171 */         break;
/*     */       case '\'': 
/* 173 */         localStringBuffer.append("\\'");
/* 174 */         break;
/*     */       case '\\': 
/* 176 */         localStringBuffer.append("\\\\");
/* 177 */         break;
/*     */       default:  char c;
/* 179 */         if (((c = paramString.charAt(i)) < ' ') || (c > '~')) {
/* 180 */           String str = "0000" + Integer.toString(c, 16);
/* 181 */           localStringBuffer.append("\\u" + str.substring(str.length() - 4, str.length()));
/*     */         } else {
/* 183 */           localStringBuffer.append(c);
/*     */         }
/*     */         break;
/*     */       }
/*     */     }
/* 188 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ParseException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */