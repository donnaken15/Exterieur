/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ abstract class BeatTest extends BeatParseNode
/*    */   implements BeatParserTreeConstants
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Ldramaman.compiler.BeatTest;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/* 10 */   BeatTest(int paramInt) { super(paramInt); }
/* 11 */   BeatTest(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString) throws CompileException
/*    */   {
/* 15 */     MethodDescriptor localMethodDescriptor = new MethodDescriptor();
/* 16 */     localMethodDescriptor.methodName = paramString;
/* 17 */     localMethodDescriptor.addModifier("public");
/* 18 */     localMethodDescriptor.addModifier("static");
/* 19 */     localMethodDescriptor.addModifier("boolean");
/* 20 */     localMethodDescriptor.addArgument("VariableScope", "beatScope");
/* 21 */     ASTTestExpression localASTTestExpression = null;
/* 22 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/* 23 */       if (((SimpleNode)jjtGetChild(i)).id == 14) {
/* 24 */         localASTTestExpression = (ASTTestExpression)jjtGetChild(i);
/* 25 */         break;
/*    */       }
/* 27 */     if ((!$noassert) && (localASTTestExpression == null)) throw new AssertionError("no ASTTestExpression found");
/* 28 */     localASTTestExpression.initializeTestScope(paramString);
/* 29 */     localASTTestExpression.defineRuntimeScope(localMethodDescriptor, paramString, "beatScope");
/* 30 */     localMethodDescriptor.addToBlockBody(localASTTestExpression.compileToJava());
/*    */     
/* 32 */     return localMethodDescriptor;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\BeatTest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */