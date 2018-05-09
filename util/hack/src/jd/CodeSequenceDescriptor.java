/*    */ package jd;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class CodeSequenceDescriptor extends NestableCodeDescriptor { private java.util.List sequence;
/*    */   
/*  7 */   private final void jdMethod_this() { this.sequence = new java.util.Vector(100); }
/*    */   
/*  9 */   public CodeSequenceDescriptor() { jdMethod_this(); }
/*    */   
/*    */   public void addToSequence(NestableCodeDescriptor paramNestableCodeDescriptor) {
/* 12 */     this.sequence.add(paramNestableCodeDescriptor);
/*    */   }
/*    */   
/*    */   public void addToSequence(NestableCodeDescriptor[] paramArrayOfNestableCodeDescriptor)
/*    */   {
/* 17 */     for (int i = 0; i < paramArrayOfNestableCodeDescriptor.length; i++) {
/* 18 */       this.sequence.add(paramArrayOfNestableCodeDescriptor[i]);
/*    */     }
/*    */   }
/*    */   
/*    */   public String toString(int paramInt) {
/* 23 */     java.io.StringWriter localStringWriter = new java.io.StringWriter(1024);
/* 24 */     PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
/*    */     
/* 26 */     java.util.Iterator localIterator = this.sequence.iterator();
/* 27 */     while (localIterator.hasNext()) {
/* 28 */       NestableCodeDescriptor localNestableCodeDescriptor = (NestableCodeDescriptor)localIterator.next();
/* 29 */       if (localNestableCodeDescriptor.getClass().getName().equals("jd.CodeSequenceDescriptor")) {
/* 30 */         localPrintWriter.println(localNestableCodeDescriptor.toString(paramInt));
/*    */       } else {
/* 32 */         localPrintWriter.println(localNestableCodeDescriptor.toString(paramInt + 1));
/*    */       }
/*    */     }
/* 35 */     return localStringWriter.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\CodeSequenceDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */