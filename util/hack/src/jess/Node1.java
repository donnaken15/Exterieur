/*    */ package jess;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class Node1
/*    */   extends Node
/*    */   implements Serializable
/*    */ {
/*    */   boolean processClearCommand(Token paramToken, Context paramContext)
/*    */     throws JessException
/*    */   {
/* 25 */     broadcastEvent(32769, paramToken);
/* 26 */     if (paramToken.m_tag == 3) {
/* 27 */       passAlong(paramToken, paramContext);
/* 28 */       return true;
/*    */     }
/* 30 */     return false;
/*    */   }
/*    */   
/*    */   Value cleanupBindings(Value paramValue) throws JessException
/*    */   {
/*    */     Object localObject;
/* 36 */     if (paramValue.type() == 4096)
/*    */     {
/* 38 */       localObject = new BindingValue((BindingValue)paramValue);
/* 39 */       ((BindingValue)localObject).resetFactNumber();
/* 40 */       return (Value)localObject;
/*    */     }
/*    */     
/* 43 */     if (paramValue.type() == 64)
/*    */     {
/* 45 */       localObject = (Funcall)paramValue.funcallValue(null).clone();
/* 46 */       for (int i = 0; i < ((Funcall)localObject).size(); i++)
/* 47 */         ((Funcall)localObject).set(cleanupBindings(((Funcall)localObject).get(i)), i);
/* 48 */       return new FuncallValue((Funcall)localObject);
/*    */     }
/*    */     
/* 51 */     return paramValue;
/*    */   }
/*    */   
/*    */   void passAlong(Token paramToken, Context paramContext) throws JessException
/*    */   {
/* 56 */     Node[] arrayOfNode = this.m_succ;
/* 57 */     for (int i = 0; i < this.m_nSucc; i++)
/*    */     {
/* 59 */       Node localNode = arrayOfNode[i];
/* 60 */       localNode.callNodeRight(paramToken, paramContext);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   void debugPrint(Token paramToken, boolean paramBoolean)
/*    */   {
/* 69 */     System.out.println(this + ' ' + paramToken.topFact() + " => " + paramBoolean);
/*    */   }
/*    */   
/* 72 */   String getCompilationTraceToken() { return "1"; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */