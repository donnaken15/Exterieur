/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import jess.JessException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class JessExceptionHelper
/*    */ {
/*    */   static void processJessException(JessException paramJessException)
/*    */   {
/* 15 */     if (paramJessException.getCause() != null)
/* 16 */       System.out.println(paramJessException.getCause());
/* 17 */     System.out.println(paramJessException.getRoutine() + ' ' + paramJessException.getProgramText() + ' ' + paramJessException.getData() + ' ' + paramJessException.getLineNumber());
/* 18 */     System.out.println(paramJessException.getNextException());
/* 19 */     throw new RuntimeException(paramJessException.getMessage());
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\JessExceptionHelper.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */