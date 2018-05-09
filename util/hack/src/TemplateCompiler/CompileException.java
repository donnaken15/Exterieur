/*    */ package TemplateCompiler;
/*    */ 
/*    */ public class CompileException extends ParseException
/*    */ {
/*    */   public CompileException() {}
/*    */   
/*    */   public CompileException(String paramString)
/*    */   {
/*  9 */     super(paramString);
/*    */   }
/*    */   
/* 12 */   public CompileException(int paramInt, String paramString) { super("line " + paramInt + ": " + paramString); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\CompileException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */