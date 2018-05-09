/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.util.Stack;
/*     */ 
/*     */ class JJTBeatParserState
/*     */ {
/*     */   private Stack nodes;
/*     */   private Stack marks;
/*     */   private int sp;
/*     */   private int mk;
/*     */   private boolean node_created;
/*     */   
/*     */   JJTBeatParserState() {
/*  14 */     this.nodes = new Stack();
/*  15 */     this.marks = new Stack();
/*  16 */     this.sp = 0;
/*  17 */     this.mk = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   boolean nodeCreated()
/*     */   {
/*  24 */     return this.node_created;
/*     */   }
/*     */   
/*     */ 
/*     */   void reset()
/*     */   {
/*  30 */     this.nodes.removeAllElements();
/*  31 */     this.marks.removeAllElements();
/*  32 */     this.sp = 0;
/*  33 */     this.mk = 0;
/*     */   }
/*     */   
/*     */ 
/*     */   Node rootNode()
/*     */   {
/*  39 */     return (Node)this.nodes.elementAt(0);
/*     */   }
/*     */   
/*     */   void pushNode(Node paramNode)
/*     */   {
/*  44 */     this.nodes.push(paramNode);
/*  45 */     this.sp += 1;
/*     */   }
/*     */   
/*     */ 
/*     */   Node popNode()
/*     */   {
/*  51 */     if (--this.sp < this.mk) {
/*  52 */       this.mk = ((Integer)this.marks.pop()).intValue();
/*     */     }
/*  54 */     return (Node)this.nodes.pop();
/*     */   }
/*     */   
/*     */   Node peekNode()
/*     */   {
/*  59 */     return (Node)this.nodes.peek();
/*     */   }
/*     */   
/*     */ 
/*     */   int nodeArity()
/*     */   {
/*  65 */     return this.sp - this.mk;
/*     */   }
/*     */   
/*     */   void clearNodeScope(Node paramNode)
/*     */   {
/*  70 */     while (this.sp > this.mk) {
/*  71 */       popNode();
/*     */     }
/*  73 */     this.mk = ((Integer)this.marks.pop()).intValue();
/*     */   }
/*     */   
/*     */   void openNodeScope(Node paramNode)
/*     */   {
/*  78 */     this.marks.push(new Integer(this.mk));
/*  79 */     this.mk = this.sp;
/*  80 */     paramNode.jjtOpen();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void closeNodeScope(Node paramNode, int paramInt)
/*     */   {
/*  89 */     this.mk = ((Integer)this.marks.pop()).intValue();
/*  90 */     while (paramInt-- > 0) {
/*  91 */       Node localNode = popNode();
/*  92 */       localNode.jjtSetParent(paramNode);
/*  93 */       paramNode.jjtAddChild(localNode, paramInt);
/*     */     }
/*  95 */     paramNode.jjtClose();
/*  96 */     pushNode(paramNode);
/*  97 */     this.node_created = true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void closeNodeScope(Node paramNode, boolean paramBoolean)
/*     */   {
/* 107 */     if (paramBoolean) {
/* 108 */       int i = nodeArity();
/* 109 */       this.mk = ((Integer)this.marks.pop()).intValue();
/* 110 */       while (i-- > 0) {
/* 111 */         Node localNode = popNode();
/* 112 */         localNode.jjtSetParent(paramNode);
/* 113 */         paramNode.jjtAddChild(localNode, i);
/*     */       }
/* 115 */       paramNode.jjtClose();
/* 116 */       pushNode(paramNode);
/* 117 */       this.node_created = true;
/*     */     } else {
/* 119 */       this.mk = ((Integer)this.marks.pop()).intValue();
/* 120 */       this.node_created = false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\JJTBeatParserState.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */