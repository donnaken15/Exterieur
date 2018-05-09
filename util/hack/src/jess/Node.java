/*     */ package jess;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public abstract class Node implements Serializable
/*     */ {
/*     */   public static final int LEFT = 0;
/*     */   public static final int RIGHT = 1;
/*     */   public int m_usecount;
/*     */   Node[] m_succ;
/*     */   int m_nSucc;
/*     */   private transient Hashtable m_listeners;
/*     */   
/*     */   public Node()
/*     */   {
/*  20 */     jdMethod_this();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void jdMethod_this()
/*     */   {
/*  29 */     this.m_usecount = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Enumeration getSuccessors()
/*     */   {
/*  40 */     return new NodeEnumeration(null);
/*     */   }
/*     */   
/*     */   Node resolve(Node paramNode) {
/*  44 */     for (int i = 0; i < this.m_nSucc; i++) {
/*  45 */       if (this.m_succ[i].equals(paramNode))
/*  46 */         return this.m_succ[i];
/*     */     }
/*  48 */     return paramNode;
/*     */   }
/*     */   
/*     */   void addSuccessor(Node paramNode, NodeSink paramNodeSink) throws JessException
/*     */   {
/*  53 */     if ((this.m_succ == null) || (this.m_nSucc == this.m_succ.length)) {
/*  54 */       Node[] arrayOfNode = this.m_succ;
/*  55 */       this.m_succ = new Node[this.m_nSucc + 5];
/*  56 */       if (arrayOfNode != null)
/*  57 */         System.arraycopy(arrayOfNode, 0, this.m_succ, 0, this.m_nSucc);
/*     */     }
/*  59 */     this.m_succ[(this.m_nSucc++)] = paramNode;
/*  60 */     paramNodeSink.addNode(paramNode);
/*     */   }
/*     */   
/*     */   Node mergeSuccessor(Node paramNode, NodeSink paramNodeSink) throws JessException
/*     */   {
/*  65 */     for (int i = 0; i < this.m_nSucc; i++) {
/*  66 */       Node localNode = this.m_succ[i];
/*  67 */       if (paramNode.equals(localNode)) {
/*  68 */         paramNodeSink.addNode(localNode);
/*  69 */         return localNode;
/*     */       }
/*     */     }
/*     */     
/*  73 */     addSuccessor(paramNode, paramNodeSink);
/*  74 */     return paramNode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void removeSuccessor(Node paramNode)
/*     */   {
/*  84 */     for (int i = 0; i < this.m_nSucc; i++) {
/*  85 */       if (paramNode == this.m_succ[i]) {
/*  86 */         System.arraycopy(this.m_succ, i + 1, this.m_succ, i, --this.m_nSucc - i);
/*  87 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void callNodeLeft(Token paramToken, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  96 */     throw new JessException("callNodeLeft", "Undefined in class", getClass().getName());
/*     */   }
/*     */   
/*     */   void callNodeRight(Token paramToken, Context paramContext) throws JessException {
/* 100 */     throw new JessException("callNodeRight", "Undefined in class", getClass().getName());
/*     */   }
/*     */   
/*     */ 
/*     */   public void addJessListener(JessListener paramJessListener)
/*     */   {
/* 106 */     if (this.m_listeners == null) {
/* 107 */       this.m_listeners = new Hashtable();
/*     */     }
/* 109 */     this.m_listeners.put(paramJessListener, paramJessListener);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void removeJessListener(JessListener paramJessListener)
/*     */   {
/* 116 */     if (this.m_listeners == null) {
/* 117 */       return;
/*     */     }
/* 119 */     this.m_listeners.remove(paramJessListener);
/* 120 */     if (this.m_listeners.size() == 0)
/* 121 */       this.m_listeners = null;
/*     */   }
/*     */   
/*     */   void broadcastEvent(int paramInt, Object paramObject) throws JessException {
/* 125 */     if ((this.m_listeners != null) && (this.m_listeners.size() != 0)) {
/* 126 */       Enumeration localEnumeration = this.m_listeners.elements();
/* 127 */       JessEvent localJessEvent = new JessEvent(this, paramInt, paramObject);
/* 128 */       while (localEnumeration.hasMoreElements()) {
/* 129 */         ((JessListener)localEnumeration.nextElement()).eventHappened(localJessEvent);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 136 */   private final void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException { paramObjectInputStream.defaultReadObject(); }
/*     */   
/*     */   private class NodeEnumeration implements Enumeration {
/* 139 */     private NodeEnumeration() { jdMethod_this(); } NodeEnumeration(Node.1 param1) { this(); }
/* 140 */     private final void jdMethod_this() { this.m_index = 0; }
/*     */     
/*     */     private int m_index;
/* 143 */     public boolean hasMoreElements() { if (this.m_index < Node.this.m_nSucc) 0; return true;
/*     */     }
/*     */     
/*     */     public Object nextElement() {
/* 147 */       if (!hasMoreElements())
/* 148 */         throw new RuntimeException("No more elements!");
/* 149 */       return Node.this.m_succ[(this.m_index++)];
/*     */     }
/*     */   }
/*     */   
/*     */   abstract String getCompilationTraceToken();
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */