/*    */ package jd;
/*    */ 
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ public class MethodDescriptor extends CodeBlockDescriptor { private java.util.LinkedList methodModifiers;
/*    */   private MethodArglistDescriptor methodArguments;
/*    */   
/*  8 */   public MethodDescriptor() { jdMethod_this(); }
/*  9 */   private final void jdMethod_this() { this.methodModifiers = new java.util.LinkedList();
/* 10 */     this.methodArguments = new MethodArglistDescriptor();
/* 11 */     this.localVarNames = new java.util.HashSet();
/*    */   }
/*    */   
/*    */ 
/*    */   public void addModifier(String paramString)
/*    */   {
/* 17 */     this.methodModifiers.add(paramString);
/*    */   }
/*    */   
/*    */   public void addArgument(MethodArgDescriptor paramMethodArgDescriptor) {
/* 21 */     this.methodArguments.addArgument(paramMethodArgDescriptor);
/*    */   }
/*    */   
/*    */   public void addArgument(String paramString1, String paramString2) {
/* 25 */     MethodArgDescriptor localMethodArgDescriptor = new MethodArgDescriptor();
/*    */     
/* 27 */     localMethodArgDescriptor.argType = paramString1;
/* 28 */     localMethodArgDescriptor.argName = paramString2;
/* 29 */     this.methodArguments.addArgument(localMethodArgDescriptor);
/*    */   }
/*    */   
/*    */   private java.util.HashSet localVarNames;
/*    */   public String methodName;
/*    */   public void addLocalVariableDecl(FieldDescriptor paramFieldDescriptor)
/*    */   {
/* 36 */     addToBlockBody(paramFieldDescriptor);
/* 37 */     String[] arrayOfString = paramFieldDescriptor.getFieldNames();
/* 38 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 39 */       if (this.localVarNames.contains(arrayOfString[i])) {
/* 40 */         throw new JavaDescriptorError("Variable " + arrayOfString[i] + " multiply defined in MethodDescriptor " + this.methodName);
/*    */       }
/* 42 */       this.localVarNames.add(arrayOfString[i]);
/*    */     }
/*    */   }
/*    */   
/*    */   public String toString(int paramInt) {
/* 47 */     this.blockHeader = (methodSignatureString() + " {");
/* 48 */     this.blockFooter = "}";
/* 49 */     return super.toString(paramInt);
/*    */   }
/*    */   
/*    */   protected String methodSignatureString() {
/* 53 */     StringWriter localStringWriter = new StringWriter();
/*    */     
/*    */ 
/* 56 */     java.util.ListIterator localListIterator = this.methodModifiers.listIterator();
/* 57 */     while (localListIterator.hasNext()) {
/* 58 */       localStringWriter.write((String)localListIterator.next() + ' ');
/*    */     }
/* 60 */     localStringWriter.write(this.methodName);
/*    */     
/*    */ 
/* 63 */     localStringWriter.write(this.methodArguments.toString());
/*    */     
/* 65 */     return localStringWriter.toString();
/*    */   }
/*    */   
/*    */ 
/*    */   public void setBlockHeader(String paramString)
/*    */   {
/* 71 */     throw new JavaDescriptorError("setBlockHeader() should not be called on a MethodDescriptor.");
/*    */   }
/*    */   
/*    */ 
/*    */   public void setBlockFooter(String paramString)
/*    */   {
/* 77 */     throw new JavaDescriptorError("setBlockFooter() should not be called on a MethodDescriptor.");
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\MethodDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */