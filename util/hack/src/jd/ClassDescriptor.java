/*     */ package jd;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ public class ClassDescriptor extends CodeBlockDescriptor {
/*     */   public String packageName;
/*     */   private LinkedList imports;
/*     */   
/*   9 */   public ClassDescriptor() { jdMethod_this(); }
/*     */   
/*     */   private final void jdMethod_this() {
/*  12 */     this.imports = new LinkedList();
/*     */     
/*  14 */     this.classModifiers = new LinkedList();
/*  15 */     this.fieldMembers = new LinkedList();
/*  16 */     this.methodMembers = new LinkedList();
/*  17 */     this.staticBlocks = new java.util.Vector();
/*     */     
/*  19 */     this.interfaces = new LinkedList();
/*  20 */     this.nestLevel = 0; }
/*     */   
/*     */   public String className;
/*  23 */   public void addPackageImport(String paramString) { this.imports.add(paramString); }
/*     */   
/*     */   private LinkedList classModifiers;
/*     */   private LinkedList fieldMembers;
/*  27 */   public void addField(FieldDescriptor paramFieldDescriptor) { this.fieldMembers.add(paramFieldDescriptor); }
/*     */   
/*     */   public void addField(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3)
/*     */   {
/*  31 */     FieldDescriptor localFieldDescriptor = new FieldDescriptor();
/*     */     
/*  33 */     localFieldDescriptor.fieldType = paramString1;
/*  34 */     localFieldDescriptor.addFieldName(paramString2);
/*  35 */     localFieldDescriptor.addFieldModifiers(paramArrayOfString);
/*  36 */     localFieldDescriptor.initializer = paramString3;
/*  37 */     this.fieldMembers.add(localFieldDescriptor);
/*     */   }
/*     */   
/*     */   public FieldDescriptor[] getFields() {
/*  41 */     LinkedList localLinkedList = new LinkedList();
/*     */     
/*     */ 
/*     */ 
/*  45 */     java.util.ListIterator localListIterator = this.fieldMembers.listIterator();
/*  46 */     while (localListIterator.hasNext()) {
/*  47 */       FieldDescriptor localFieldDescriptor2 = (FieldDescriptor)localListIterator.next();
/*  48 */       localObject1 = localFieldDescriptor2.getFieldNames();
/*  49 */       localObject2 = localFieldDescriptor2.fieldType;
/*  50 */       FieldDescriptor localFieldDescriptor1 = new FieldDescriptor();
/*  51 */       for (int i = 0; i < localObject1.length; i++) {
/*  52 */         localFieldDescriptor1.fieldType = ((String)localObject2);
/*  53 */         localFieldDescriptor1.addFieldName(localObject1[i]);
/*     */       }
/*  55 */       localLinkedList.add(localFieldDescriptor1);
/*     */     }
/*  57 */     Object localObject1 = localLinkedList.toArray();
/*  58 */     Object localObject2 = new FieldDescriptor[localObject1.length];
/*  59 */     System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
/*  60 */     return (FieldDescriptor[])localObject2;
/*     */   }
/*     */   
/*     */   public void addMethod(MethodDescriptor paramMethodDescriptor) {
/*  64 */     this.methodMembers.add(paramMethodDescriptor);
/*     */   }
/*     */   
/*     */   public void addClassModifier(String paramString) {
/*  68 */     this.classModifiers.add(paramString);
/*     */   }
/*     */   
/*     */   public void addInterface(String paramString) {
/*  72 */     this.interfaces.add(paramString);
/*     */   }
/*     */   
/*     */   public void addStaticBlock(CodeStringDescriptor paramCodeStringDescriptor)
/*     */   {
/*  77 */     CodeBlockDescriptor localCodeBlockDescriptor = new CodeBlockDescriptor();
/*  78 */     localCodeBlockDescriptor.setBlockHeader("static {");
/*  79 */     localCodeBlockDescriptor.addToBlockBody(paramCodeStringDescriptor);
/*  80 */     localCodeBlockDescriptor.setBlockFooter("}");
/*  81 */     this.staticBlocks.add(localCodeBlockDescriptor);
/*     */   }
/*     */   
/*     */   public String toString(int paramInt) {
/*  85 */     java.io.StringWriter localStringWriter = new java.io.StringWriter();
/*  86 */     java.io.PrintWriter localPrintWriter = new java.io.PrintWriter(localStringWriter);
/*     */     
/*  88 */     if (this.className == null) {
/*  89 */       throw new JavaDescriptorError("Attempt to call toString(int) on an instance of ClassDescriptor without a specified class name");
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */     if (this.packageName != null) {
/*  98 */       localPrintWriter.println("package " + this.packageName + ';');
/*  99 */       localPrintWriter.println();
/*     */     }
/*     */     
/*     */ 
/* 103 */     if (this.imports.size() != 0) {
/* 104 */       java.util.ListIterator localListIterator = this.imports.listIterator();
/* 105 */       while (localListIterator.hasNext())
/* 106 */         localPrintWriter.println("import " + (String)localListIterator.next() + ';');
/* 107 */       localPrintWriter.println();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 112 */     localStringWriter.write(delimitedList(this.classModifiers.toArray(), " "));
/* 113 */     if (this.classModifiers.size() != 0) {
/* 114 */       localStringWriter.write(" ");
/*     */     }
/*     */     
/* 117 */     localStringWriter.write("class " + this.className);
/*     */     
/* 119 */     if (this.extendsClass != null) {
/* 120 */       localStringWriter.write(" extends " + this.extendsClass);
/*     */     }
/*     */     
/* 123 */     if (this.interfaces.size() != 0) {
/* 124 */       localStringWriter.write(" implements " + delimitedList(this.interfaces.toArray(), ", "));
/*     */     }
/* 126 */     localStringWriter.write(" {");
/* 127 */     this.blockHeader = localStringWriter.toString();
/*     */     
/*     */ 
/* 130 */     this.blockFooter = "}";
/*     */     
/*     */ 
/* 133 */     this.blockBody.clear();
/* 134 */     this.blockBody.addAll(this.fieldMembers);
/* 135 */     this.blockBody.add(new BlanklineDescriptor());
/* 136 */     this.blockBody.addAll(this.staticBlocks);
/* 137 */     this.blockBody.add(new BlanklineDescriptor());
/* 138 */     this.blockBody.addAll(this.methodMembers);
/*     */     
/*     */ 
/* 141 */     return super.toString(paramInt);
/*     */   }
/*     */   
/*     */   private LinkedList methodMembers;
/*     */   private java.util.Vector staticBlocks;
/*     */   
/* 147 */   public void setBlockHeader(String paramString) { throw new JavaDescriptorError("setBlockHeader() should not be called on a ClassDescriptor."); }
/*     */   
/*     */   public String extendsClass;
/*     */   private LinkedList interfaces;
/*     */   private int nestLevel;
/*     */   public void setBlockFooter(String paramString) {
/* 153 */     throw new JavaDescriptorError("setBlockFooter() should not be called on a ClassDescriptor.");
/*     */   }
/*     */   
/*     */ 
/*     */   public void addToBlockBody(NestableCodeDescriptor paramNestableCodeDescriptor)
/*     */   {
/* 159 */     throw new JavaDescriptorError("addToBlockBody() should not be called on a ClassDescriptor.");
/*     */   }
/*     */   
/*     */   private final void writeToFileHelper(java.io.File paramFile, String paramString)
/*     */   {
/*     */     try {
/* 165 */       java.io.PrintStream localPrintStream = new java.io.PrintStream(new java.io.FileOutputStream(new java.io.File(paramFile, this.className + ".java")));
/* 166 */       localPrintStream.print(paramString);
/* 167 */       localPrintStream.close();
/*     */     } catch (java.io.IOException localIOException) {
/* 169 */       throw new JavaDescriptorError("Error writing " + this.className + ".java", localIOException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean writeToFile(java.io.File paramFile)
/*     */   {
/* 176 */     String str = toString();
/*     */     java.io.BufferedReader localBufferedReader;
/*     */     try {
/* 179 */       localBufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(paramFile, this.className + ".java")));
/*     */     } catch (java.io.FileNotFoundException localFileNotFoundException) {
/* 181 */       writeToFileHelper(paramFile, str);
/* 182 */       return true;
/*     */     }
/* 184 */     StringBuffer localStringBuffer = new StringBuffer(8000);
/*     */     try {
/* 186 */       for (int i = localBufferedReader.read(); i != -1; i = localBufferedReader.read()) {
/* 187 */         localStringBuffer.append((char)i);
/*     */       }
/* 189 */       localBufferedReader.close();
/*     */     }
/*     */     catch (java.io.IOException localIOException) {
/* 192 */       throw new JavaDescriptorError("Error reading " + this.className + ".java", localIOException);
/*     */     }
/* 194 */     if (!localStringBuffer.toString().equals(str))
/*     */     {
/* 196 */       writeToFileHelper(paramFile, str);
/* 197 */       return true;
/*     */     }
/* 199 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public void writeNestedClassToStream(java.io.PrintStream paramPrintStream)
/*     */   {
/* 205 */     addClassModifier("static");
/* 206 */     paramPrintStream.print(toString());
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\ClassDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */