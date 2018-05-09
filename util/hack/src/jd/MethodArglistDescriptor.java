/*    */ package jd;
/*    */ 
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ public class MethodArglistDescriptor extends JavaCodeDescriptor {
/*    */   private java.util.List methodArgs;
/*    */   private java.util.Hashtable argIndexTable;
/*    */   private int argIndexCounter;
/*    */   
/* 10 */   public MethodArglistDescriptor() { jdMethod_this(); }
/* 11 */   private final void jdMethod_this() { this.methodArgs = new java.util.Vector();
/* 12 */     this.argIndexTable = new java.util.Hashtable();
/* 13 */     this.argIndexCounter = 0;
/*    */   }
/*    */   
/* 16 */   public void addArgument(MethodArgDescriptor paramMethodArgDescriptor) { this.methodArgs.add(paramMethodArgDescriptor);
/* 17 */     this.argIndexTable.put(paramMethodArgDescriptor.argName, new Integer(this.argIndexCounter++));
/*    */   }
/*    */   
/*    */   public Object[] getArguments()
/*    */   {
/* 22 */     return this.methodArgs.toArray();
/*    */   }
/*    */   
/*    */   public String toString() {
/* 26 */     StringWriter localStringWriter = new StringWriter();
/*    */     
/* 28 */     localStringWriter.write("(");
/* 29 */     java.util.LinkedList localLinkedList = new java.util.LinkedList();
/* 30 */     java.util.ListIterator localListIterator = this.methodArgs.listIterator();
/* 31 */     while (localListIterator.hasNext()) {
/* 32 */       localLinkedList.add(((MethodArgDescriptor)localListIterator.next()).toString());
/*    */     }
/*    */     
/* 35 */     localStringWriter.write(delimitedList(localLinkedList.toArray(), ", "));
/* 36 */     localStringWriter.write(")");
/*    */     
/* 38 */     return localStringWriter.toString();
/*    */   }
/*    */   
/*    */   public int getArgIndex(String paramString)
/*    */   {
/* 43 */     Integer localInteger = (Integer)this.argIndexTable.get(paramString);
/*    */     
/*    */ 
/* 46 */     if (localInteger == null) throw new Error("Unknown argument name " + paramString);
/* 47 */     return localInteger.intValue();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\MethodArglistDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */