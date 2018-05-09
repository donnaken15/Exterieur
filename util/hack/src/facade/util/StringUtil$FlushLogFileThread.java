/*    */ package facade.util;
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
/*    */ class StringUtil$FlushLogFileThread
/*    */   extends Thread
/*    */ {
/* 34 */   StringUtil$FlushLogFileThread(StringUtil.1 param1) { this(); }
/*    */   private StringUtil$FlushLogFileThread() {}
/* 36 */   public void run() { if (StringUtil.access$0() != null) {
/* 37 */       StringUtil.access$0().flush();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\StringUtil$FlushLogFileThread.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */