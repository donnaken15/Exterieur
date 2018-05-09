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
/*    */ class MathFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 17 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap)
/*    */   {
/* 22 */     addFunction(new Abs(), paramHashMap);
/*    */     
/* 24 */     addFunction(new Div(), paramHashMap);
/*    */     
/* 26 */     addFunction(new JessFloat(), paramHashMap);
/*    */     
/* 28 */     addFunction(new JessInteger(), paramHashMap);
/*    */     
/* 30 */     addFunction(new Max(), paramHashMap);
/*    */     
/* 32 */     addFunction(new Min(), paramHashMap);
/*    */     
/* 34 */     addFunction(new Expt(), paramHashMap);
/*    */     
/* 36 */     addFunction(new Exp(), paramHashMap);
/*    */     
/* 38 */     addFunction(new Log(), paramHashMap);
/*    */     
/* 40 */     addFunction(new Log10(), paramHashMap);
/* 41 */     addFunction(new Constant("pi", 3.141592653589793D), paramHashMap);
/* 42 */     addFunction(new Constant("e", 2.718281828459045D), paramHashMap);
/*    */     
/* 44 */     addFunction(new Round(), paramHashMap);
/*    */     
/* 46 */     addFunction(new Sqrt(), paramHashMap);
/*    */     
/* 48 */     addFunction(new JessRandom(), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\MathFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */