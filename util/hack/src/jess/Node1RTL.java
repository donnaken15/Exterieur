/*    */ package jess;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Node1RTL
/*    */   extends Node1
/*    */   implements LogicalNode
/*    */ {
/*    */   private HashMap m_logicalDepends;
/*    */   private int m_tokenSize;
/*    */   
/*    */   void callNodeRight(Token paramToken, Context paramContext)
/*    */     throws JessException
/*    */   {
/* 22 */     if (this.m_logicalDepends != null) {
/* 23 */       removeLogicalSupportFrom(paramToken, paramContext);
/*    */     }
/* 25 */     passAlong(paramToken, paramContext);
/*    */   }
/*    */   
/*    */   void passAlong(Token paramToken, Context paramContext) throws JessException
/*    */   {
/* 30 */     this.m_tokenSize = paramToken.size();
/* 31 */     Node[] arrayOfNode = this.m_succ;
/* 32 */     for (int i = 0; i < this.m_nSucc; i++) {
/* 33 */       Node localNode = arrayOfNode[i];
/*    */       
/* 35 */       localNode.callNodeLeft(paramToken, paramContext);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 40 */     return paramObject instanceof Node1RTL;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 44 */     return "[Left input adapter]";
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void dependsOn(Fact paramFact, Token paramToken)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield 19	jess/Node1RTL:m_logicalDepends	Ljava/util/HashMap;
/*    */     //   4: ifnonnull +14 -> 18
/*    */     //   7: aload_0
/*    */     //   8: new 54	java/util/HashMap
/*    */     //   11: dup
/*    */     //   12: invokespecial 59	java/util/HashMap:<init>	()V
/*    */     //   15: putfield 19	jess/Node1RTL:m_logicalDepends	Ljava/util/HashMap;
/*    */     //   18: aload_0
/*    */     //   19: getfield 19	jess/Node1RTL:m_logicalDepends	Ljava/util/HashMap;
/*    */     //   22: aload_2
/*    */     //   23: invokevirtual 63	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   26: checkcast 64	java/util/ArrayList
/*    */     //   29: astore_3
/*    */     //   30: aload_3
/*    */     //   31: ifnonnull +21 -> 52
/*    */     //   34: new 64	java/util/ArrayList
/*    */     //   37: dup
/*    */     //   38: invokespecial 66	java/util/ArrayList:<init>	()V
/*    */     //   41: astore_3
/*    */     //   42: aload_0
/*    */     //   43: getfield 19	jess/Node1RTL:m_logicalDepends	Ljava/util/HashMap;
/*    */     //   46: aload_2
/*    */     //   47: aload_3
/*    */     //   48: invokevirtual 70	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   51: pop
/*    */     //   52: goto +7 -> 59
/*    */     //   55: aload 4
/*    */     //   57: monitorexit
/*    */     //   58: athrow
/*    */     //   59: aload_3
/*    */     //   60: dup
/*    */     //   61: astore 4
/*    */     //   63: monitorenter
/*    */     //   64: aload_3
/*    */     //   65: aload_1
/*    */     //   66: invokevirtual 73	java/util/ArrayList:add	(Ljava/lang/Object;)Z
/*    */     //   69: pop
/*    */     //   70: aload 4
/*    */     //   72: monitorexit
/*    */     //   73: return
/*    */     // Line number table:
/*    */     //   Java source line #48	-> byte code offset #0
/*    */     //   Java source line #49	-> byte code offset #7
/*    */     //   Java source line #51	-> byte code offset #18
/*    */     //   Java source line #52	-> byte code offset #30
/*    */     //   Java source line #53	-> byte code offset #34
/*    */     //   Java source line #54	-> byte code offset #42
/*    */     //   Java source line #57	-> byte code offset #52
/*    */     //   Java source line #58	-> byte code offset #64
/*    */     //   Java source line #60	-> byte code offset #73
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	74	0	this	Node1RTL
/*    */     //   0	74	1	paramFact	Fact
/*    */     //   0	74	2	paramToken	Token
/*    */     //   29	36	3	localArrayList	ArrayList
/*    */     //   55	16	4	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   55	58	55	finally
/*    */     //   64	73	55	finally
/*    */   }
/*    */   
/*    */   public Map getLogicalDependencies()
/*    */   {
/* 64 */     return this.m_logicalDepends;
/*    */   }
/*    */   
/*    */   public int getTokenSize() {
/* 68 */     return this.m_tokenSize;
/*    */   }
/*    */   
/*    */   protected void removeLogicalSupportFrom(Token paramToken, Context paramContext) {
/* 72 */     ArrayList localArrayList = (ArrayList)this.m_logicalDepends.remove(paramToken);
/* 73 */     if (localArrayList != null) {
/* 74 */       Rete localRete = paramContext.getEngine();
/* 75 */       for (int i = 0; i < localArrayList.size(); i++) {
/* 76 */         Fact localFact = (Fact)localArrayList.get(i);
/* 77 */         localRete.removeLogicalSupportFrom(paramToken, localFact);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1RTL.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */