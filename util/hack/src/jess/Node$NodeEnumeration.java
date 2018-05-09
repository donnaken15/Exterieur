/*     */ package jess;
/*     */ 
/*     */ import java.util.Enumeration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Node$NodeEnumeration
/*     */   implements Enumeration
/*     */ {
/*     */   private int m_index;
/*     */   final Node this$0;
/*     */   
/*     */   private Node$NodeEnumeration(Node paramNode)
/*     */   {
/* 139 */     this.this$0 = paramNode;jdMethod_this(); } Node$NodeEnumeration(Node paramNode, Node.1 param1) { this(paramNode); }
/* 140 */   private final void jdMethod_this() { this.m_index = 0; }
/*     */   
/*     */   public boolean hasMoreElements() {
/* 143 */     if (this.m_index < this.this$0.m_nSucc) 0; return true;
/*     */   }
/*     */   
/*     */   public Object nextElement() {
/* 147 */     if (!hasMoreElements())
/* 148 */       throw new RuntimeException("No more elements!");
/* 149 */     return this.this$0.m_succ[(this.m_index++)];
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node$NodeEnumeration.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */