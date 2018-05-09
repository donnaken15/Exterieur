/*    */ package jd;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.StringReader;
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ public class CodeStringDescriptor extends NestableCodeDescriptor
/*    */ {
/*    */   protected String codeString;
/*    */   
/*    */   public CodeStringDescriptor()
/*    */   {
/* 15 */     this.codeString = null;
/*    */   }
/*    */   
/*    */   public CodeStringDescriptor(String paramString) {
/* 19 */     this.codeString = paramString;
/*    */   }
/*    */   
/*    */   public void setCodeString(String paramString) {
/* 23 */     this.codeString = paramString;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public String toString(int paramInt)
/*    */   {
/* 30 */     BufferedReader localBufferedReader = new BufferedReader(new StringReader(this.codeString));
/* 31 */     StringWriter localStringWriter = new StringWriter();
/* 32 */     PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
/*    */     try
/*    */     {
/* 35 */       for (String str = localBufferedReader.readLine(); str != null; str = localBufferedReader.readLine()) {
/* 36 */         localPrintWriter.println(leadingTabs(paramInt) + str);
/*    */       }
/*    */     } catch (IOException localIOException) {
/* 39 */       throw new JavaDescriptorError("IO error during CodeStringDescriptor.toString(int): ", localIOException);
/*    */     }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 45 */     return localStringWriter.getBuffer().substring(0, localStringWriter.getBuffer().length() - System.getProperty("line.separator").length());
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\CodeStringDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */