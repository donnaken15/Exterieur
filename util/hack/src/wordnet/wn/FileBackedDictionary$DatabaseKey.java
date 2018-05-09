/*    */ package wordnet.wn;
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
/*    */ public class FileBackedDictionary$DatabaseKey
/*    */ {
/*    */   POS pos;
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
/*    */   Object key;
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
/*    */   final FileBackedDictionary this$0;
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
/*    */   FileBackedDictionary$DatabaseKey(FileBackedDictionary paramFileBackedDictionary, POS paramPOS, Object paramObject)
/*    */   {
/* 69 */     this.pos = paramPOS;
/* 70 */     this.key = paramObject;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 74 */     if (((paramObject instanceof DatabaseKey)) && (((DatabaseKey)paramObject).pos.equals(this.pos)) && (((DatabaseKey)paramObject).key.equals(this.key))) 0; return true;
/*    */   }
/*    */   
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 80 */     return this.pos.hashCode() ^ this.key.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\FileBackedDictionary$DatabaseKey.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */