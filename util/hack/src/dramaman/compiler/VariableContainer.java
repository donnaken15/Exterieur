/*    */ package dramaman.compiler;
/*    */ 
/*    */ abstract class VariableContainer extends BeatParseNode
/*    */   implements BeatParserTreeConstants
/*    */ {
/*  6 */   public VariableContainer(int paramInt) { super(paramInt); }
/*    */   
/*  8 */   public VariableContainer(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/*    */ 
/*    */   public void processVariableReferences(BeatScopeMaintainer paramBeatScopeMaintainer)
/*    */     throws CompileException
/*    */   {
/* 14 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*    */     {
/* 16 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 17 */       if (localBeatParseNode.id == 22)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         try
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 30 */           ASTJavaName localASTJavaName = (ASTJavaName)localBeatParseNode;
/* 31 */           if (localASTJavaName.isVariableReference(paramBeatScopeMaintainer))
/* 32 */             localASTJavaName.setJavaNameImage(localASTJavaName.getVariableReference(paramBeatScopeMaintainer));
/* 33 */         } catch (ScopeException localScopeException) { throw new CompileException(localScopeException.getMessage());
/*    */         }
/* 35 */       } else if (localBeatParseNode.id == 23)
/*    */       {
/* 37 */         ((ASTConditionalExpression)localBeatParseNode).processVariableReferences(paramBeatScopeMaintainer);
/*    */       }
/* 39 */       else if (localBeatParseNode.id == 24)
/*    */       {
/* 41 */         ((ASTJavaStatement)localBeatParseNode).processVariableReferences(paramBeatScopeMaintainer);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   BeatScopeMaintainer getEnclosingScope() {
/* 47 */     return ((BeatParseNode)jjtGetParent()).getEnclosingScope();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\VariableContainer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */