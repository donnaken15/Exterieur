/*    */ package wordnet.util;
/*    */ 
/*    */ import java.util.Hashtable;
/*    */ import java.util.Vector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LRUCache
/*    */   implements Cache
/*    */ {
/*    */   protected int capacity;
/*    */   protected Vector keys;
/*    */   protected Hashtable map;
/*    */   
/*    */   public LRUCache(int paramInt)
/*    */   {
/* 22 */     this.capacity = paramInt;
/* 23 */     this.keys = new Vector(paramInt);
/* 24 */     this.map = new Hashtable(paramInt);
/*    */   }
/*    */   
/*    */   public synchronized void put(Object paramObject1, Object paramObject2) {
/* 28 */     remove(paramObject1);
/* 29 */     this.keys.insertElementAt(paramObject1, 0);
/* 30 */     this.map.put(paramObject1, paramObject2);
/* 31 */     if (this.keys.size() >= this.capacity) {
/* 32 */       remove(this.keys.elementAt(this.keys.size() - 1));
/*    */     }
/*    */   }
/*    */   
/*    */   public synchronized Object get(Object paramObject) {
/* 37 */     Object localObject = this.map.get(paramObject);
/* 38 */     if (localObject != null) {
/* 39 */       this.keys.removeElement(paramObject);
/* 40 */       this.keys.insertElementAt(paramObject, 0);
/*    */     }
/* 42 */     return localObject;
/*    */   }
/*    */   
/*    */   public synchronized void remove(Object paramObject) {
/* 46 */     if (this.map.remove(paramObject) != null) {
/* 47 */       this.keys.removeElement(paramObject);
/* 48 */       this.capacity -= 1;
/*    */     }
/*    */   }
/*    */   
/*    */   public synchronized void clear() {
/* 53 */     this.keys.removeAllElements();
/* 54 */     this.map.clear();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\util\LRUCache.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */