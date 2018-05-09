/*    */ package jd;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class CodeBlockDescriptor extends NestableCodeDescriptor {
/*    */   protected String blockHeader;
/*    */   protected String blockFooter;
/*    */   protected java.util.LinkedList blockBody;
/*    */   
/* 10 */   private final void jdMethod_this() { this.blockBody = new java.util.LinkedList(); }
/*    */   
/* 12 */   public CodeBlockDescriptor() { jdMethod_this();
/* 13 */     this.blockHeader = null;
/* 14 */     this.blockFooter = null;
/*    */   }
/*    */   
/* 17 */   public CodeBlockDescriptor(String paramString1, String paramString2) { jdMethod_this();
/* 18 */     this.blockHeader = paramString1;
/* 19 */     this.blockFooter = paramString2;
/*    */   }
/*    */   
/*    */   public void setBlockHeader(String paramString) {
/* 23 */     this.blockHeader = paramString;
/*    */   }
/*    */   
/*    */   public void setBlockFooter(String paramString) {
/* 27 */     this.blockFooter = paramString;
/*    */   }
/*    */   
/*    */   public void addToBlockBody(NestableCodeDescriptor paramNestableCodeDescriptor) {
/* 31 */     this.blockBody.add(paramNestableCodeDescriptor);
/*    */   }
/*    */   
/*    */   public void addToBlockBody(NestableCodeDescriptor[] paramArrayOfNestableCodeDescriptor)
/*    */   {
/* 36 */     for (int i = 0; i < paramArrayOfNestableCodeDescriptor.length; i++)
/* 37 */       this.blockBody.add(paramArrayOfNestableCodeDescriptor[i]);
/*    */   }
/*    */   
/*    */   public String toString(int paramInt) {
/* 41 */     java.io.StringWriter localStringWriter = new java.io.StringWriter(1024);
/* 42 */     PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
/*    */     
/* 44 */     if (this.blockHeader != null) {
/* 45 */       localPrintWriter.print(leadingTabs(paramInt));
/* 46 */       localPrintWriter.println(this.blockHeader);
/*    */     }
/*    */     
/* 49 */     java.util.ListIterator localListIterator = this.blockBody.listIterator();
/* 50 */     while (localListIterator.hasNext()) {
/* 51 */       NestableCodeDescriptor localNestableCodeDescriptor = (NestableCodeDescriptor)localListIterator.next();
/* 52 */       if (localNestableCodeDescriptor.getClass().getName().equals("jd.CodeSequenceDescriptor")) {
/* 53 */         localPrintWriter.println(localNestableCodeDescriptor.toString(paramInt));
/*    */       } else {
/* 55 */         localPrintWriter.println(localNestableCodeDescriptor.toString(paramInt + 1));
/*    */       }
/*    */     }
/* 58 */     if (this.blockFooter != null) {
/* 59 */       localPrintWriter.print(leadingTabs(paramInt));
/* 60 */       localPrintWriter.println(this.blockFooter);
/*    */     }
/* 62 */     return localStringWriter.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\CodeBlockDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */