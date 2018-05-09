/*    */ package jess;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ class Matches
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 40 */     return "matches";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 44 */     PrintWriter localPrintWriter = paramContext.getEngine().getOutStream();
/* 45 */     HasLHS localHasLHS = paramContext.getEngine().findDefrule(paramValueVector.get(1).stringValue(paramContext));
/*    */     
/* 47 */     if (localHasLHS == null) {
/* 48 */       throw new JessException("matches", "No such rule or query", paramValueVector.get(1).stringValue(paramContext));
/*    */     }
/* 50 */     ArrayList localArrayList = localHasLHS.getNodes();
/* 51 */     for (int i = 0; i < localArrayList.size(); i++) {
/* 52 */       Node localNode = (Node)localArrayList.get(i);
/* 53 */       if ((localNode instanceof Node2)) {
/* 54 */         localPrintWriter.print(">>> ");
/* 55 */         localPrintWriter.println(localNode);
/* 56 */         localPrintWriter.println(((Node2)localNode).displayMemory());
/*    */       }
/*    */     }
/* 59 */     return Funcall.TRUE;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Matches.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */