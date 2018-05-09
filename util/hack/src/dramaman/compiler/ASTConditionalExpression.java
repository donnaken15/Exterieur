/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.CodeBlockDescriptor;
/*    */ 
/*    */ public class ASTConditionalExpression extends VariableContainer implements Compileable, BeatParserTreeConstants {
/*  6 */   public ASTConditionalExpression(int paramInt) { super(paramInt); }
/*    */   
/*  8 */   public ASTConditionalExpression(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/*    */   public jd.JavaCodeDescriptor compileToJava()
/*    */     throws CompileException
/*    */   {
/* 13 */     CodeBlockDescriptor localCodeBlockDescriptor1 = new CodeBlockDescriptor("if (", ")");
/* 14 */     BeatScopeMaintainer localBeatScopeMaintainer = getEnclosingScope();
/*    */     
/* 16 */     processVariableReferences(localBeatScopeMaintainer);
/* 17 */     localCodeBlockDescriptor1.addToBlockBody(new jd.CodeStringDescriptor(prettyPrintTokens()));
/* 18 */     CodeBlockDescriptor localCodeBlockDescriptor2 = new CodeBlockDescriptor("{", "}");
/*    */     
/* 20 */     if (((ASTTestExpression)jjtGetParent()).hasNextTest()) {
/* 21 */       localCodeBlockDescriptor2.addToBlockBody(((ASTTestExpression)jjtGetParent()).compileNextTest());
/*    */     }
/*    */     else {
/* 24 */       ((ASTTestExpression)jjtGetParent()).compileVariableCopyThrough(localCodeBlockDescriptor2);
/* 25 */       localCodeBlockDescriptor2.addToBlockBody(new jd.CodeStringDescriptor("return true;"));
/*    */     }
/*    */     
/* 28 */     CodeBlockDescriptor localCodeBlockDescriptor3 = new CodeBlockDescriptor();
/* 29 */     localCodeBlockDescriptor3.addToBlockBody(localCodeBlockDescriptor1);
/* 30 */     localCodeBlockDescriptor3.addToBlockBody(localCodeBlockDescriptor2);
/*    */     
/* 32 */     return localCodeBlockDescriptor3;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTConditionalExpression.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */