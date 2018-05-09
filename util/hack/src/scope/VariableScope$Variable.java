/*    */ package scope;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class VariableScope$Variable
/*    */ {
/*    */   public Object value;
/*    */   
/*    */ 
/*    */   String typeName;
/*    */   
/*    */ 
/*    */   VariableScope$Variable(Object paramObject, String paramString)
/*    */   {
/* 15 */     this.value = paramObject;
/* 16 */     this.typeName = paramString;
/*    */   }
/*    */   
/* 19 */   public String toString() { return "Variable(" + this.value + ' ' + this.typeName + ')'; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\scope\VariableScope$Variable.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */