/*    */ package dramaman.runtime;
/*    */ 
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import scope.VariableScope;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Beat$PriorityTest
/*    */   implements Comparable
/*    */ {
/*    */   private String priorityTestName;
/*    */   private int priority;
/*    */   Method priorityTest;
/*    */   
/* 16 */   private final void jdMethod_this() { this.priorityTest = null; }
/*    */   
/*    */   public Beat$PriorityTest(String paramString, int paramInt) {
/* 19 */     jdMethod_this();
/* 20 */     this.priorityTestName = paramString;
/* 21 */     this.priority = paramInt;
/*    */   }
/*    */   
/* 24 */   public String getPriorityTestName() { return new String(this.priorityTestName); }
/* 25 */   public int getPriority() { return this.priority; }
/*    */   
/*    */   public boolean test(VariableScope paramVariableScope)
/*    */     throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
/*    */   {
/* 30 */     if (this.priorityTest == null) {
/* 31 */       this.priorityTest = Beat.access$1().getMethod(this.priorityTestName, Beat.access$0());
/*    */     }
/* 33 */     Object[] arrayOfObject = { paramVariableScope };
/* 34 */     return ((Boolean)this.priorityTest.invoke(null, arrayOfObject)).booleanValue();
/*    */   }
/*    */   
/*    */ 
/*    */   public int compareTo(Object paramObject)
/*    */   {
/* 40 */     Integer localInteger1 = new Integer(((PriorityTest)paramObject).getPriority());
/* 41 */     Integer localInteger2 = new Integer(this.priority);
/* 42 */     return -localInteger2.compareTo(localInteger1);
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 47 */     return "PriorityTest(priorityTestName: " + this.priorityTestName + ", priority: " + this.priority + ')';
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\Beat$PriorityTest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */