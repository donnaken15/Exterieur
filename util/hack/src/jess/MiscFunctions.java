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
/*    */ 
/*    */ 
/*    */ class MiscFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 21 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap)
/*    */   {
/* 26 */     addFunction(new GetStrategy(), paramHashMap);
/* 27 */     addFunction(new SetStrategy(), paramHashMap);
/* 28 */     addFunction(new JessSocket(), paramHashMap);
/* 29 */     addFunction(new JessFormat(), paramHashMap);
/* 30 */     addFunction(new JessSystem(), paramHashMap);
/* 31 */     addFunction(new LoadPkg(), paramHashMap);
/* 32 */     addFunction(new LoadFn(), paramHashMap);
/* 33 */     addFunction(new Time(), paramHashMap);
/*    */     
/*    */ 
/* 36 */     addFunction(new Build("build"), paramHashMap);
/* 37 */     addFunction(new Build("eval"), paramHashMap);
/*    */     
/* 39 */     addFunction(new ListFunctions(), paramHashMap);
/* 40 */     addFunction(new RunQuery(0), paramHashMap);
/* 41 */     addFunction(new RunQuery(1), paramHashMap);
/* 42 */     addFunction(new ShowAgenda(), paramHashMap);
/* 43 */     addFunction(new ListRules(), paramHashMap);
/* 44 */     addFunction(new ListFacts(), paramHashMap);
/* 45 */     addFunction(new ListDeftemplates(), paramHashMap);
/*    */     
/* 47 */     addFunction(new Bits("bit-and"), paramHashMap);
/* 48 */     addFunction(new Bits("bit-or"), paramHashMap);
/* 49 */     addFunction(new Bits("bit-not"), paramHashMap);
/*    */     
/*    */ 
/* 52 */     addFunction(new Setgen(), paramHashMap);
/*    */     
/* 54 */     addFunction(new ResetGlobals(0), paramHashMap);
/* 55 */     addFunction(new ResetGlobals(1), paramHashMap);
/*    */     
/* 57 */     addFunction(new EvalSalience(0), paramHashMap);
/* 58 */     addFunction(new EvalSalience(1), paramHashMap);
/*    */     
/* 60 */     addFunction(new SetNodeIndexing(), paramHashMap);
/* 61 */     addFunction(new SetFactory(), paramHashMap);
/*    */     
/* 63 */     addFunction(new JessLong(), paramHashMap);
/*    */     
/* 65 */     addFunction(new CallOnEngine(), paramHashMap);
/* 66 */     addFunction(new MakeFactID(), paramHashMap);
/* 67 */     addFunction(new Asc(), paramHashMap);
/* 68 */     addFunction(new Synchronized(), paramHashMap);
/*    */     
/* 70 */     addFunction(new Dependents(), paramHashMap);
/* 71 */     addFunction(new Dependencies(), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\MiscFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */