/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ListFunctions
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public String getName()
/*     */   {
/* 162 */     return "list-function$";
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 166 */     ValueVector localValueVector = new ValueVector(100);
/* 167 */     HashSet localHashSet = new HashSet();
/*     */     
/* 169 */     Iterator localIterator = paramContext.getEngine().listFunctions();
/* 170 */     while (localIterator.hasNext()) {
/* 171 */       localObject = ((Userfunction)localIterator.next()).getName();
/* 172 */       localHashSet.add(localObject);
/*     */     }
/*     */     
/* 175 */     localIterator = Funcall.listIntrinsics();
/* 176 */     while (localIterator.hasNext()) {
/* 177 */       localObject = ((Userfunction)localIterator.next()).getName();
/* 178 */       localHashSet.add(localObject);
/*     */     }
/*     */     
/* 181 */     Object localObject = localHashSet.toArray();
/* 182 */     Arrays.sort((Object[])localObject);
/* 183 */     for (int i = 0; i < localObject.length; i++) {
/* 184 */       localValueVector.add(new Value((String)localObject[i], 1));
/*     */     }
/* 186 */     return new Value(localValueVector, 512);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ListFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */