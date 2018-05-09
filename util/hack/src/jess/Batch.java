/*    */ package jess;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.Reader;
/*    */ import java.net.URL;
/*    */ 
/*    */ class Batch implements Userfunction, java.io.Serializable
/*    */ {
/*    */   static Class class$jess$Rete;
/*    */   
/*    */   public String getName()
/*    */   {
/* 15 */     return "batch";
/*    */   }
/*    */   
/*    */   public Value batch(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 21 */     Value localValue = Funcall.FALSE;
/* 22 */     Object localObject1 = null;
/*    */     try
/*    */     {
/*    */       try {
/* 26 */         if (paramRete.getApplet() == null) {
/* 27 */           localObject1 = new java.io.FileReader(paramString);
/*    */         } else {
/* 29 */           URL localURL1 = new URL(paramRete.getApplet().getDocumentBase(), paramString);
/*    */           
/* 31 */           localObject1 = new InputStreamReader(localURL1.openStream());
/*    */         }
/*    */       }
/*    */       catch (Exception localException) {
/* 35 */         Class localClass = paramRete.getAppObjectClass();
/* 36 */         URL localURL2 = localClass.getResource(paramString);
/* 37 */         if (localURL2 == null) { Class tmp87_84 = class$jess$Rete;
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
/*    */ 
/*    */ 
/*    */ 
/* 37 */           if (tmp87_84 == null) tmp87_84; if (tmp87_84 != (class$jess$Rete = class$("[Ljess.Rete;", false))) {
/* 38 */             Class tmp108_105 = class$jess$Rete;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 38 */             if (tmp108_105 == null) tmp108_105; localURL2 = (class$jess$Rete = class$("[Ljess.Rete;", false)).getResource(paramString);
/*    */           } }
/* 40 */         if (localURL2 == null) {
/* 41 */           throw new JessException("batch", "Cannot open file", localException);
/*    */         }
/* 43 */         InputStream localInputStream = localURL2.openStream();
/* 44 */         localObject1 = new InputStreamReader(localInputStream);
/*    */       }
/* 46 */       Jesp localJesp = new Jesp((Reader)localObject1, paramRete);
/* 47 */       localValue = localJesp.parse(false);;
/*    */     }
/*    */     catch (IOException localIOException2)
/*    */     {
/* 50 */       throw new JessException("batch", "I/O Exception", localIOException2);
/*    */     }
/*    */     finally {
/* 53 */       if (localObject1 != null) try { ((Reader)localObject1).close();tmpTernaryOp = localClass;
/*    */         } catch (IOException localIOException1) {} }
/* 55 */     return localValue;
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 59 */     String str = paramValueVector.get(1).stringValue(paramContext);
/*    */     
/* 61 */     return batch(str, paramContext.getEngine());
/*    */   }
/*    */   
/*    */   static Class class$(String paramString, boolean paramBoolean)
/*    */   {
/*    */     try
/*    */     {
/*    */       if (!paramBoolean) {}
/*    */       return Class.forName(paramString).getComponentType();
/*    */     }
/*    */     catch (ClassNotFoundException localClassNotFoundException)
/*    */     {
/*    */       throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Batch.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */