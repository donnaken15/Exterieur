/*    */ package TemplateCompiler;
/*    */ 
/*    */ public class NLUNode extends SimpleNode implements Node {
/*    */   public Token firstToken;
/*    */   public Token lastToken;
/*    */   
/*    */   public NLUNode(int paramInt) {
/*  8 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public NLUNode(NLU paramNLU, int paramInt)
/*    */   {
/* 13 */     super(paramNLU, paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\NLUNode.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */