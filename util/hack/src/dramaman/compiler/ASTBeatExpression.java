/*     */ package dramaman.compiler;
/*     */ 
/*     */ 
/*     */ public class ASTBeatExpression
/*     */   extends BeatParseNode
/*     */ {
/*     */   public ASTBeatExpression(int paramInt)
/*     */   {
/*   9 */     super(paramInt);
/*     */   }
/*     */   
/*     */   public ASTBeatExpression(BeatParser paramBeatParser, int paramInt) {
/*  13 */     super(paramBeatParser, paramInt);
/*     */   }
/*     */   
/*     */   boolean isIdentifier()
/*     */   {
/*  18 */     if (jjtGetNumChildren() == 1)
/*     */     {
/*  20 */       return true;
/*     */     }
/*  22 */     return false;
/*     */   }
/*     */   
/*     */   boolean isLiteral()
/*     */   {
/*  27 */     return isIdentifier() ^ true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public ASTJavaName getRef()
/*     */   {
/*  34 */     if (isIdentifier()) {
/*  35 */       return (ASTJavaName)jjtGetChild(0);
/*     */     }
/*  37 */     return null;
/*     */   }
/*     */   
/*     */   public String getVariableReferenceConstantOrLiteral(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws CompileException
/*     */   {
/*  43 */     if (isIdentifier()) {
/*  44 */       return getRef().getVariableReferenceOrConstant(paramBeatScopeMaintainer);
/*     */     }
/*     */     
/*  47 */     return this.firstToken.image;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVariableReferenceConstantOrLiteralAsObject(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws CompileException
/*     */   {
/*  56 */     if (isIdentifier()) {
/*  57 */       return getRef().getVariableReferenceOrConstantAsObject(paramBeatScopeMaintainer);
/*     */     }
/*     */     
/*  60 */     switch (this.firstToken.kind) {
/*     */     case 79: 
/*  62 */       return "new Integer(" + this.firstToken.image + ')';
/*     */     case 83: 
/*  64 */       return "new Float(" + this.firstToken.image + ')';
/*     */     case 85: 
/*  66 */       return "new Character(" + this.firstToken.image.charAt(0) + ')';
/*     */     case 86: 
/*  68 */       return "new String(" + this.firstToken.image + ')';
/*     */     case 28: 
/*     */     case 58: 
/*  71 */       return "new Boolean(" + this.firstToken.image + ')';
/*     */     case 43: 
/*  73 */       return "null";
/*     */     }
/*  75 */     throw new CompileError("Unexpected literal token");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object getLiteralValue()
/*     */   {
/*  83 */     if (isLiteral()) {
/*  84 */       switch (this.firstToken.kind) {
/*     */       case 79: 
/*  86 */         return new Integer(this.firstToken.image);
/*     */       case 83: 
/*  88 */         return new Float(this.firstToken.image);
/*     */       case 85: 
/*  90 */         return new Character(this.firstToken.image.charAt(0));
/*     */       case 86: 
/*  92 */         return new String(this.firstToken.image);
/*     */       case 28: 
/*     */       case 58: 
/*  95 */         return new Boolean(this.firstToken.image);
/*     */       case 43: 
/*  97 */         return null;
/*     */       }
/*  99 */       throw new CompileError("Unexpected literal token");
/*     */     }
/*     */     
/*     */ 
/* 103 */     throw new CompileError(dumpTokens() + " is not a literal.");
/*     */   }
/*     */   
/*     */   public String getFullNameOrLiteral() {
/* 107 */     if (isIdentifier()) {
/* 108 */       return getRef().getFullName();
/*     */     }
/* 110 */     return this.firstToken.image;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getType(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws CompileException
/*     */   {
/* 117 */     if (isIdentifier()) {
/* 118 */       return getRef().getType(paramBeatScopeMaintainer);
/*     */     }
/* 120 */     switch (this.firstToken.kind) {
/*     */     case 79: 
/* 122 */       return "int";
/*     */     case 83: 
/* 124 */       return "float";
/*     */     case 85: 
/* 126 */       return "char";
/*     */     case 86: 
/* 128 */       return "String";
/*     */     case 28: 
/*     */     case 58: 
/* 131 */       return "boolean";
/*     */     case 43: 
/* 133 */       return "Object";
/*     */     }
/* 135 */     throw new CompileError("Unexpected literal token");
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTBeatExpression.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */