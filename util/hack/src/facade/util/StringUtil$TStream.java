/*    */ package facade.util;
/*    */ 
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
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
/*    */ class StringUtil$TStream
/*    */   extends PrintStream
/*    */ {
/*    */   public StringUtil$TStream(OutputStream paramOutputStream)
/*    */   {
/* 43 */     super(paramOutputStream);
/*    */   }
/*    */   
/*    */ 
/*    */   public void println(String paramString)
/*    */   {
/* 49 */     super.println(paramString);
/* 50 */     System.out.println(paramString);
/*    */   }
/*    */   
/*    */   public void printToLog(String paramString)
/*    */   {
/* 55 */     super.println(paramString);
/*    */   }
/*    */   
/*    */   public void flush()
/*    */   {
/* 60 */     super.flush();
/* 61 */     System.out.flush();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\StringUtil$TStream.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */