/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Enumeration;
/*    */ import java.util.Hashtable;
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
/*    */ class Bag
/*    */   implements Userfunction, Serializable
/*    */ {
/* 28 */   private static Hashtable m_bags = new Hashtable();
/*    */   
/*    */   public String getName() {
/* 31 */     return "bag";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 35 */     String str = paramValueVector.get(1).stringValue(paramContext);
/*    */     
/*    */ 
/* 38 */     Hashtable localHashtable = (Hashtable)m_bags.get(paramContext.getEngine());
/* 39 */     if (localHashtable == null)
/* 40 */       m_bags.put(paramContext.getEngine(), localHashtable = new Hashtable());
/*    */     Object localObject1;
/* 42 */     Object localObject2; if (str.equals("create")) {
/* 43 */       localObject1 = paramValueVector.get(2).stringValue(paramContext);
/* 44 */       localObject2 = (Hashtable)localHashtable.get(localObject1);
/* 45 */       if (localObject2 == null) {
/* 46 */         localObject2 = new Hashtable();
/* 47 */         localHashtable.put(localObject1, localObject2);
/*    */       }
/* 49 */       return new Value(localObject2);
/*    */     }
/* 51 */     if (str.equals("delete")) {
/* 52 */       localObject1 = paramValueVector.get(2).stringValue(paramContext);
/* 53 */       localHashtable.remove(localObject1);
/* 54 */       if (localHashtable.size() == 0)
/* 55 */         m_bags.remove(paramContext.getEngine());
/* 56 */       return Funcall.TRUE;
/*    */     }
/* 58 */     if (str.equals("find")) {
/* 59 */       localObject1 = paramValueVector.get(2).stringValue(paramContext);
/* 60 */       localObject2 = (Hashtable)localHashtable.get(localObject1);
/* 61 */       if (localObject2 != null) {
/* 62 */         return new Value(localObject2);
/*    */       }
/* 64 */       return Funcall.NIL;
/*    */     }
/* 66 */     if (str.equals("list")) {
/* 67 */       localObject1 = new ValueVector();
/* 68 */       localObject2 = localHashtable.keys();
/* 69 */       while (((Enumeration)localObject2).hasMoreElements())
/* 70 */         ((ValueVector)localObject1).add(new Value((String)((Enumeration)localObject2).nextElement(), 2));
/* 71 */       return new Value((ValueVector)localObject1, 512);
/*    */     }
/*    */     
/*    */     Object localObject3;
/* 75 */     if (str.equals("set")) {
/* 76 */       localObject1 = (Hashtable)paramValueVector.get(2).externalAddressValue(paramContext);
/* 77 */       localObject2 = paramValueVector.get(3).stringValue(paramContext);
/* 78 */       localObject3 = paramValueVector.get(4).resolveValue(paramContext);
/* 79 */       ((Hashtable)localObject1).put(localObject2, localObject3);
/* 80 */       return (Value)localObject3;
/*    */     }
/* 82 */     if (str.equals("get")) {
/* 83 */       localObject1 = (Hashtable)paramValueVector.get(2).externalAddressValue(paramContext);
/* 84 */       localObject2 = paramValueVector.get(3).stringValue(paramContext);
/* 85 */       localObject3 = (Value)((Hashtable)localObject1).get(localObject2);
/* 86 */       if (localObject3 != null) {
/* 87 */         return (Value)localObject3;
/*    */       }
/* 89 */       return Funcall.NIL;
/*    */     }
/* 91 */     if (str.equals("props")) {
/* 92 */       localObject1 = (Hashtable)paramValueVector.get(2).externalAddressValue(paramContext);
/* 93 */       localObject2 = new ValueVector();
/* 94 */       localObject3 = ((Hashtable)localObject1).keys();
/* 95 */       while (((Enumeration)localObject3).hasMoreElements())
/* 96 */         ((ValueVector)localObject2).add(new Value((String)((Enumeration)localObject3).nextElement(), 2));
/* 97 */       return new Value((ValueVector)localObject2, 512);
/*    */     }
/* 99 */     throw new JessException("bag", "Unknown command", str);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Bag.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */