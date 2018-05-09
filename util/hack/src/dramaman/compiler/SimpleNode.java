/*    */ package dramaman.compiler;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class SimpleNode implements Node {
/*    */   protected Node parent;
/*    */   protected Node[] children;
/*    */   protected int id;
/*    */   protected BeatParser parser;
/*    */   
/*    */   public SimpleNode(int paramInt) {
/* 12 */     this.id = paramInt;
/*    */   }
/*    */   
/*    */   public SimpleNode(BeatParser paramBeatParser, int paramInt) {
/* 16 */     this(paramInt);
/* 17 */     this.parser = paramBeatParser;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 26 */   public void jjtSetParent(Node paramNode) { this.parent = paramNode; }
/* 27 */   public Node jjtGetParent() { return this.parent; }
/*    */   
/*    */   public void jjtAddChild(Node paramNode, int paramInt) {
/* 30 */     if (this.children == null) {
/* 31 */       this.children = new Node[paramInt + 1];
/* 32 */     } else if (paramInt >= this.children.length) {
/* 33 */       Node[] arrayOfNode = new Node[paramInt + 1];
/* 34 */       System.arraycopy(this.children, 0, arrayOfNode, 0, this.children.length);
/* 35 */       this.children = arrayOfNode;
/*    */     }
/* 37 */     this.children[paramInt] = paramNode;
/*    */   }
/*    */   
/*    */   public Node jjtGetChild(int paramInt) {
/* 41 */     return this.children[paramInt];
/*    */   }
/*    */   
/*    */   public int jjtGetNumChildren() {
/* 45 */     if (this.children != null) 0; return this.children.length;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */   public String toString() { return BeatParserTreeConstants.jjtNodeName[this.id]; }
/* 55 */   public String toString(String paramString) { return paramString + toString(); }
/*    */   
/*    */ 
/*    */ 
/*    */   public void dump(String paramString)
/*    */   {
/* 61 */     System.out.println(toString(paramString));
/* 62 */     if (this.children != null) {
/* 63 */       for (int i = 0; i < this.children.length; i++) {
/* 64 */         SimpleNode localSimpleNode = (SimpleNode)this.children[i];
/* 65 */         if (localSimpleNode != null) {
/* 66 */           localSimpleNode.dump(paramString + ' ');
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void jjtOpen() {}
/*    */   
/*    */   public void jjtClose() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\SimpleNode.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */