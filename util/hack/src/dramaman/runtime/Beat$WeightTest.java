/*    */ package dramaman.runtime;
/*    */ 
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import scope.VariableScope;
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
/*    */ public class Beat$WeightTest
/*    */   implements Comparable
/*    */ {
/*    */   private String weightTestName;
/*    */   private float weight;
/*    */   Method weightTest;
/*    */   
/* 54 */   private final void jdMethod_this() { this.weightTest = null; }
/*    */   
/*    */   public Beat$WeightTest(String paramString, float paramFloat) {
/* 57 */     jdMethod_this();
/* 58 */     this.weightTestName = paramString;
/* 59 */     this.weight = paramFloat;
/*    */   }
/*    */   
/*    */ 
/* 63 */   public String getWeightTestName() { return new String(this.weightTestName); }
/* 64 */   public float getWeight() { return this.weight; }
/*    */   
/*    */   public boolean test(VariableScope paramVariableScope)
/*    */     throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
/*    */   {
/* 69 */     if (this.weightTest == null) {
/* 70 */       this.weightTest = Beat.access$1().getMethod(this.weightTestName, Beat.access$0());
/*    */     }
/* 72 */     Object[] arrayOfObject = { paramVariableScope };
/* 73 */     return ((Boolean)this.weightTest.invoke(null, arrayOfObject)).booleanValue();
/*    */   }
/*    */   
/*    */ 
/*    */   public int compareTo(Object paramObject)
/*    */   {
/* 79 */     Float localFloat1 = new Float(((WeightTest)paramObject).getWeight());
/* 80 */     Float localFloat2 = new Float(this.weight);
/* 81 */     return -localFloat2.compareTo(localFloat1);
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 86 */     return "WeightTest(weightTestName: " + this.weightTestName + ", weight: " + this.weight + ')';
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\Beat$WeightTest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */