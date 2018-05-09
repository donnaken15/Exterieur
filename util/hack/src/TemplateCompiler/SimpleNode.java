/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class SimpleNode implements Node {
/*    */   protected Node parent;
/*    */   protected Node[] children;
/*    */   protected int id;
/*    */   protected NLU parser;
/*    */   public Token firstToken;
/*    */   public Token lastToken;
/*    */   
/* 13 */   public SimpleNode(int paramInt) { this.id = paramInt; }
/*    */   
/*    */   public SimpleNode(NLU paramNLU, int paramInt)
/*    */   {
/* 17 */     this(paramInt);
/* 18 */     this.parser = paramNLU;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 27 */   public void jjtSetParent(Node paramNode) { this.parent = paramNode; }
/* 28 */   public Node jjtGetParent() { return this.parent; }
/*    */   
/*    */   public void jjtAddChild(Node paramNode, int paramInt) {
/* 31 */     if (this.children == null) {
/* 32 */       this.children = new Node[paramInt + 1];
/* 33 */     } else if (paramInt >= this.children.length) {
/* 34 */       Node[] arrayOfNode = new Node[paramInt + 1];
/* 35 */       System.arraycopy(this.children, 0, arrayOfNode, 0, this.children.length);
/* 36 */       this.children = arrayOfNode;
/*    */     }
/* 38 */     this.children[paramInt] = paramNode;
/*    */   }
/*    */   
/*    */   public Node jjtGetChild(int paramInt) {
/* 42 */     return this.children[paramInt];
/*    */   }
/*    */   
/*    */   public int jjtGetNumChildren() {
/* 46 */     if (this.children != null) 0; return this.children.length;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */   public String toString() { return NLUTreeConstants.jjtNodeName[this.id]; }
/* 56 */   public String toString(String paramString) { return paramString + toString(); }
/*    */   
/*    */ 
/*    */ 
/*    */   public void dump(String paramString)
/*    */   {
/* 62 */     System.out.println(toString(paramString));
/* 63 */     if (this.children != null) {
/* 64 */       for (int i = 0; i < this.children.length; i++) {
/* 65 */         SimpleNode localSimpleNode = (SimpleNode)this.children[i];
/* 66 */         if (localSimpleNode != null)
/* 67 */           localSimpleNode.dump(paramString + ' ');
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   int getParseNodeID() {
/* 73 */     return this.id;
/*    */   }
/*    */   
/*    */   public void jjtOpen() {}
/*    */   
/*    */   public void jjtClose() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\SimpleNode.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */