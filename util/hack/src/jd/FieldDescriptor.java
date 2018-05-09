/*    */ package jd;
/*    */ 
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ public class FieldDescriptor extends CodeStringDescriptor { public String fieldType;
/*    */   
/*  7 */   private final void jdMethod_this() { this.fieldNames = new LinkedList();
/*  8 */     this.fieldModifiers = new LinkedList(); }
/*    */   
/*    */   private LinkedList fieldNames;
/* 11 */   public FieldDescriptor() { jdMethod_this();
/* 12 */     this.fieldType = null;
/* 13 */     this.initializer = null;
/*    */   }
/*    */   
/*    */   public void addFieldModifier(String paramString) {
/* 17 */     this.fieldModifiers.add(paramString.intern());
/*    */   }
/*    */   
/*    */   public void addFieldModifiers(String[] paramArrayOfString) {
/* 21 */     for (int i = 0; i < paramArrayOfString.length; i++) {
/* 22 */       addFieldModifier(paramArrayOfString[i].intern());
/*    */     }
/*    */   }
/*    */   
/*    */   public void addFieldName(String paramString) {
/* 27 */     this.fieldNames.add(paramString.intern());
/*    */   }
/*    */   
/*    */   public String[] getFieldNames() {
/* 31 */     Object[] arrayOfObject = this.fieldNames.toArray();
/* 32 */     String[] arrayOfString = new String[arrayOfObject.length];
/* 33 */     System.arraycopy(arrayOfObject, 0, arrayOfString, 0, arrayOfObject.length);
/* 34 */     return arrayOfString;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 38 */     int i = this.fieldType.hashCode();
/* 39 */     for (int j = 0; j < this.fieldNames.size(); j++)
/* 40 */       i += this.fieldNames.get(j).hashCode();
/* 41 */     return i;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 45 */     if (paramObject.getClass() != getClass()) {
/* 46 */       return false;
/*    */     }
/* 48 */     FieldDescriptor localFieldDescriptor = (FieldDescriptor)paramObject;
/* 49 */     if (localFieldDescriptor.fieldType != this.fieldType) {
/* 50 */       return false;
/*    */     }
/* 52 */     String[] arrayOfString = localFieldDescriptor.getFieldNames();
/* 53 */     if (arrayOfString.length != this.fieldNames.size()) {
/* 54 */       return false;
/*    */     }
/*    */     
/* 57 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 58 */       for (int j = 0; j < this.fieldNames.size(); j++) {
/* 59 */         if (arrayOfString[i] == (String)this.fieldNames.get(j))
/*    */           break;
/*    */       }
/* 62 */       if (j >= this.fieldNames.size())
/* 63 */         return false;
/*    */     }
/* 65 */     return true;
/*    */   }
/*    */   
/*    */   public String toString(int paramInt) {
/* 69 */     this.codeString = fieldDeclarationString();
/* 70 */     return super.toString(paramInt);
/*    */   }
/*    */   
/*    */   protected String fieldDeclarationString() {
/* 74 */     StringBuffer localStringBuffer = new StringBuffer();
/*    */     
/* 76 */     localStringBuffer.append(delimitedList(this.fieldModifiers.toArray(), " "));
/*    */     
/*    */ 
/*    */ 
/* 80 */     if (this.fieldModifiers.size() != 0) {
/* 81 */       localStringBuffer.append(" ");
/*    */     }
/*    */     
/*    */ 
/* 85 */     localStringBuffer.append(this.fieldType + ' ');
/* 86 */     localStringBuffer.append(delimitedList(this.fieldNames.toArray(), ", "));
/*    */     
/* 88 */     if (this.initializer != null) {
/* 89 */       localStringBuffer.append(" = " + this.initializer);
/*    */     }
/* 91 */     localStringBuffer.append(";");
/*    */     
/* 93 */     return localStringBuffer.toString();
/*    */   }
/*    */   
/*    */   private LinkedList fieldModifiers;
/*    */   public String initializer;
/*    */   public void setCodeString(String paramString) {
/* 99 */     throw new JavaDescriptorError("setCodeString() should not be called on a FieldDescriptor.");
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\FieldDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */