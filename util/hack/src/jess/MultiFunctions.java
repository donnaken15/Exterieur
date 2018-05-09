/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class MultiFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 19 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap) {
/* 23 */     addFunction(new CreateMF(), paramHashMap);
/* 24 */     addFunction(new DeleteMF(), paramHashMap);
/* 25 */     addFunction(new ExplodeMF(), paramHashMap);
/* 26 */     addFunction(new FirstMF(), paramHashMap);
/*    */     
/* 28 */     addFunction(new ImplodeMF(), paramHashMap);
/*    */     
/* 30 */     addFunction(new InsertMF(), paramHashMap);
/* 31 */     addFunction(new LengthMF(), paramHashMap);
/* 32 */     addFunction(new MemberMF(), paramHashMap);
/* 33 */     addFunction(new NthMF(), paramHashMap);
/*    */     
/* 35 */     addFunction(new ReplaceMF(), paramHashMap);
/* 36 */     addFunction(new RestMF(), paramHashMap);
/*    */     
/* 38 */     addFunction(new SubseqMF(), paramHashMap);
/*    */     
/* 40 */     addFunction(new SubsetP(), paramHashMap);
/*    */     
/* 42 */     addFunction(new Union(), paramHashMap);
/*    */     
/* 44 */     addFunction(new Intersection(), paramHashMap);
/*    */     
/* 46 */     addFunction(new Complement(), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\MultiFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */