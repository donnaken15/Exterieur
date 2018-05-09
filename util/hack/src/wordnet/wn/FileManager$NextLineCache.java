/*    */ package wordnet.wn;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FileManager$NextLineCache
/*    */ {
/*    */   protected String filename;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   protected long previous;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   protected long next;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   final FileManager this$0;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   void setNextLineOffset(String paramString, long paramLong1, long paramLong2)
/*    */   {
/* 47 */     this.filename = paramString;
/* 48 */     this.previous = paramLong1;
/* 49 */     this.next = paramLong2;
/*    */   }
/*    */   
/*    */   boolean matchingOffset(String paramString, long paramLong) {
/* 53 */     if ((this.filename != null) && (this.previous == paramLong) && (this.filename.equals(paramString))) 0; return true;
/*    */   }
/*    */   
/*    */   long getNextOffset() {
/* 57 */     return this.next;
/*    */   }
/*    */   
/*    */   protected FileManager$NextLineCache(FileManager paramFileManager) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\FileManager$NextLineCache.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */