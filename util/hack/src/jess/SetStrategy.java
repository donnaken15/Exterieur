/*    */ package jess;
/*    */ 
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
/*    */ class SetStrategy
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 78 */     return "set-strategy";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException
/*    */   {
/* 83 */     String str1 = paramValueVector.get(1).stringValue(paramContext);
/* 84 */     Rete localRete = paramContext.getEngine();
/*    */     Strategy localStrategy;
/* 86 */     try { localStrategy = (Strategy)Class.forName("jess." + str1).newInstance();
/*    */     }
/*    */     catch (Throwable localThrowable1) {
/*    */       try {
/* 90 */         localStrategy = (Strategy)localRete.findClass(str1).newInstance();
/*    */       } catch (Throwable localThrowable2) {
/* 92 */         throw new JessException("set-strategy", "Strategy class not found:", str1);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 98 */     String str2 = localRete.setStrategy(localStrategy);
/* 99 */     return new Value(str2, 1);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\SetStrategy.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */