/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.util.Stack;
/*     */ 
/*     */ class JJTNLUState {
/*     */   private Stack nodes;
/*     */   private Stack marks;
/*     */   private int sp;
/*     */   private int mk;
/*     */   private boolean node_created;
/*     */   
/*  12 */   JJTNLUState() { this.nodes = new Stack();
/*  13 */     this.marks = new Stack();
/*  14 */     this.sp = 0;
/*  15 */     this.mk = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   boolean nodeCreated()
/*     */   {
/*  22 */     return this.node_created;
/*     */   }
/*     */   
/*     */ 
/*     */   void reset()
/*     */   {
/*  28 */     this.nodes.removeAllElements();
/*  29 */     this.marks.removeAllElements();
/*  30 */     this.sp = 0;
/*  31 */     this.mk = 0;
/*     */   }
/*     */   
/*     */ 
/*     */   Node rootNode()
/*     */   {
/*  37 */     return (Node)this.nodes.elementAt(0);
/*     */   }
/*     */   
/*     */   void pushNode(Node paramNode)
/*     */   {
/*  42 */     this.nodes.push(paramNode);
/*  43 */     this.sp += 1;
/*     */   }
/*     */   
/*     */ 
/*     */   Node popNode()
/*     */   {
/*  49 */     if (--this.sp < this.mk) {
/*  50 */       this.mk = ((Integer)this.marks.pop()).intValue();
/*     */     }
/*  52 */     return (Node)this.nodes.pop();
/*     */   }
/*     */   
/*     */   Node peekNode()
/*     */   {
/*  57 */     return (Node)this.nodes.peek();
/*     */   }
/*     */   
/*     */ 
/*     */   int nodeArity()
/*     */   {
/*  63 */     return this.sp - this.mk;
/*     */   }
/*     */   
/*     */   void clearNodeScope(Node paramNode)
/*     */   {
/*  68 */     while (this.sp > this.mk) {
/*  69 */       popNode();
/*     */     }
/*  71 */     this.mk = ((Integer)this.marks.pop()).intValue();
/*     */   }
/*     */   
/*     */   void openNodeScope(Node paramNode)
/*     */   {
/*  76 */     this.marks.push(new Integer(this.mk));
/*  77 */     this.mk = this.sp;
/*  78 */     paramNode.jjtOpen();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void closeNodeScope(Node paramNode, int paramInt)
/*     */   {
/*  87 */     this.mk = ((Integer)this.marks.pop()).intValue();
/*  88 */     while (paramInt-- > 0) {
/*  89 */       Node localNode = popNode();
/*  90 */       localNode.jjtSetParent(paramNode);
/*  91 */       paramNode.jjtAddChild(localNode, paramInt);
/*     */     }
/*  93 */     paramNode.jjtClose();
/*  94 */     pushNode(paramNode);
/*  95 */     this.node_created = true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void closeNodeScope(Node paramNode, boolean paramBoolean)
/*     */   {
/* 105 */     if (paramBoolean) {
/* 106 */       int i = nodeArity();
/* 107 */       this.mk = ((Integer)this.marks.pop()).intValue();
/* 108 */       while (i-- > 0) {
/* 109 */         Node localNode = popNode();
/* 110 */         localNode.jjtSetParent(paramNode);
/* 111 */         paramNode.jjtAddChild(localNode, i);
/*     */       }
/* 113 */       paramNode.jjtClose();
/* 114 */       pushNode(paramNode);
/* 115 */       this.node_created = true;
/*     */     } else {
/* 117 */       this.mk = ((Integer)this.marks.pop()).intValue();
/* 118 */       this.node_created = false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\JJTNLUState.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */