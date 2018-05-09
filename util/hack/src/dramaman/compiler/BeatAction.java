/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ abstract class BeatAction extends BeatScopeMaintainer
/*    */   implements BeatParserTreeConstants
/*    */ {
/*  8 */   BeatAction(int paramInt) { super(paramInt); }
/*  9 */   BeatAction(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString) throws CompileException
/*    */   {
/* 13 */     MethodDescriptor localMethodDescriptor = new MethodDescriptor();
/* 14 */     localMethodDescriptor.methodName = paramString;
/* 15 */     localMethodDescriptor.addModifier("public");
/* 16 */     localMethodDescriptor.addModifier("static");
/* 17 */     localMethodDescriptor.addModifier("void");
/* 18 */     localMethodDescriptor.addArgument("VariableScope", "beatScope");
/* 19 */     initializeScope(1, paramString, getNextEnclosingScope());
/* 20 */     addChildVariableDeclarations();
/* 21 */     defineRuntimeScope(localMethodDescriptor, paramString, "beatScope");
/*    */     
/*    */ 
/*    */ 
/* 25 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*    */     {
/*    */ 
/* 28 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 29 */       if (localBeatParseNode.id == 24)
/*    */       {
/* 31 */         ASTJavaStatement localASTJavaStatement = (ASTJavaStatement)localBeatParseNode;
/* 32 */         localASTJavaStatement.processVariableReferences(this);
/* 33 */         localMethodDescriptor.addToBlockBody(new jd.CodeStringDescriptor(localASTJavaStatement.prettyPrintTokens()));
/*    */       }
/*    */     }
/*    */     
/* 37 */     return localMethodDescriptor;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\BeatAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */