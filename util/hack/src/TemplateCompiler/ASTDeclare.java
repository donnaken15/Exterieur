/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTDeclare extends ASTJessRule {
/*  6 */   ASTDeclare(int paramInt) { super(paramInt); }
/*    */   
/*    */   private String name;
/*    */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.ASTDeclare;").getComponentType().desiredAssertionStatus() ^ true;
/* 10 */   ASTDeclare(NLU paramNLU, int paramInt) { super(paramNLU, paramInt); }
/*    */   
/*    */ 
/*    */   void setName(String paramString)
/*    */   {
/* 15 */     this.name = paramString;
/*    */   }
/*    */   
/*    */   int getSalience() throws CompileException {
/* 19 */     Token localToken = this.firstToken;
/* 20 */     localToken = localToken.next;
/*    */     
/* 22 */     String str1 = localToken.image;
/* 23 */     if (str1.equals("salience")) {
/* 24 */       String str2 = localToken.next.image;
/*    */       try {
/* 26 */         return Integer.parseInt(str2);
/*    */       }
/*    */       catch (NumberFormatException localNumberFormatException)
/*    */       {
/* 30 */         throw new CompileException(getFirstLineNumber(), localNumberFormatException.getMessage());
/*    */       }
/*    */     }
/* 33 */     return 65281;
/*    */   }
/*    */   
/*    */   void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException {
/* 37 */     Token localToken = this.firstToken;
/* 38 */     localToken = localToken.next;
/*    */     
/* 40 */     String str1 = localToken.image;
/* 41 */     String str2 = "";
/*    */     
/* 43 */     if (str1.equals("timeout")) {
/* 44 */       if ((!$noassert) && (this.name == null)) throw new AssertionError();
/* 45 */       String str3 = localToken.next.image;
/* 46 */       String str4 = str3.substring(str3.length() - 1, str3.length());
/*    */       try {
/* 48 */         int i = Integer.parseInt(str3.substring(0, str3.length() - 1));
/* 49 */         if (str4.equals("u")) {
/* 50 */           paramBufferedWriter.write("(assert (_timeout " + this.name + ' ' + i + " 10))");
/*    */         }
/* 52 */         else if (str4.equals("b")) {
/* 53 */           paramBufferedWriter.write("(assert (_timeout " + this.name + ' ' + i + " 4))");
/*    */         }
/* 55 */         else if (str4.equals("s")) {
/* 56 */           paramBufferedWriter.write("(assert (_timeout " + this.name + ' ' + i + " 7))");
/*    */         }
/*    */         else {
/* 59 */           throw new CompileException(getFirstLineNumber(), "Expected 'b' or 's' or 'u' as a suffix to timeout declaration");
/*    */         }
/*    */       } catch (NumberFormatException localNumberFormatException) {
/* 62 */         throw new CompileException(getFirstLineNumber(), localNumberFormatException.getMessage());
/*    */       }
/*    */       
/*    */     }
/* 66 */     else if (!str1.equals("salience")) {
/* 67 */       throw new CompileException(getFirstLineNumber(), "Expected 'timeout' or 'salience' keyword here.");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTDeclare.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */