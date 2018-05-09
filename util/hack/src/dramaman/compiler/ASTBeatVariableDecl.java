/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.FieldDescriptor;
/*    */ 
/*    */ 
/*    */ public class ASTBeatVariableDecl
/*    */   extends BeatParseNode
/*    */ {
/*  9 */   public ASTBeatVariableDecl(int paramInt) { super(paramInt); }
/*    */   
/* 11 */   public ASTBeatVariableDecl(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getType()
/*    */   {
/* 17 */     for (int i = 0; i < jjtGetNumChildren(); i++) {
/* 18 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 19 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "JavaType")
/* 20 */         return localBeatParseNode.dumpTokens();
/*    */     }
/* 22 */     throw new CompileError("A BeatVariableDecl node is missing its JavaType child.");
/*    */   }
/*    */   
/*    */ 
/*    */   public FieldDescriptor getFieldDescriptor()
/*    */   {
/* 28 */     FieldDescriptor localFieldDescriptor = new FieldDescriptor();
/*    */     
/*    */ 
/* 31 */     for (int i = 0; i < jjtGetNumChildren(); i++) {
/* 32 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 33 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "JavaType") {
/* 34 */         localFieldDescriptor.fieldType = localBeatParseNode.dumpTokens();
/* 35 */       } else if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "VariableDeclaratorID") {
/* 36 */         localFieldDescriptor.addFieldName(localBeatParseNode.dumpTokens());
/* 37 */       } else if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "VariableInitializer")
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 44 */         localFieldDescriptor.initializer = localBeatParseNode.prettyPrintTokens();
/*    */       } else
/* 46 */         throw new CompileError("Unexpected child node of ASTBeatVariableDecl");
/*    */     }
/* 48 */     return localFieldDescriptor;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTBeatVariableDecl.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */