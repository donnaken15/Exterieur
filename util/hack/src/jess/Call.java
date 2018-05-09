/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.util.Hashtable;
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
/*     */ class Call
/*     */   implements Userfunction, Serializable
/*     */ {
/* 311 */   Call() { jdMethod_this(); }
/*     */   
/* 313 */   private final void jdMethod_this() { this.m_name = "call"; }
/*     */   
/*     */   public String getName() {
/* 316 */     return this.m_name;
/*     */   }
/*     */   
/* 319 */   private static Hashtable s_methods = new Hashtable();
/*     */   String m_name;
/*     */   
/* 322 */   static Method[] getMethods(Class paramClass) { if (s_methods.get(paramClass) != null) {
/* 323 */       return (Method[])s_methods.get(paramClass);
/*     */     }
/* 325 */     Method[] arrayOfMethod = paramClass.getMethods();
/* 326 */     s_methods.put(paramClass, arrayOfMethod);
/* 327 */     return arrayOfMethod;
/*     */   }
/*     */   
/*     */ 
/*     */   public Value call(ValueVector paramValueVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 334 */     String str = paramValueVector.get(2).stringValue(paramContext);
/*     */     
/* 336 */     Class localClass = null;
/*     */     try {
/* 338 */       Object localObject1 = null;
/*     */       
/* 340 */       Value localValue = paramValueVector.get(1).resolveValue(paramContext);
/* 341 */       if ((localValue.type() == 2) || (localValue.type() == 1))
/*     */       {
/* 343 */         if (localValue.equals(Funcall.NIL)) {
/* 344 */           throw new JessException("call", "Can't call method on nil reference:", str);
/*     */         }
/*     */         
/*     */         try
/*     */         {
/* 349 */           localClass = paramContext.getEngine().findClass(localValue.stringValue(paramContext));
/*     */         }
/*     */         catch (Exception localException) {}
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 356 */       if (localClass == null) {
/* 357 */         localObject1 = localValue.externalAddressValue(paramContext);
/* 358 */         localClass = localObject1.getClass();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */       int i = paramValueVector.size() - 3;
/* 366 */       Object[] arrayOfObject = new Object[i];
/*     */       
/* 368 */       Method[] arrayOfMethod = getMethods(localClass);
/*     */       
/*     */ 
/* 371 */       for (int j = 0; j < arrayOfMethod.length; j++) {
/*     */         try {
/* 373 */           Method localMethod = arrayOfMethod[j];
/* 374 */           Class[] arrayOfClass1 = localMethod.getParameterTypes();
/* 375 */           if ((!localMethod.getName().equals(str)) || (i == arrayOfClass1.length))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 383 */             if (!Modifier.isPublic(localClass.getModifiers())) {
/* 384 */               localMethod = null;
/*     */               
/* 386 */               while (localClass != null) {
/* 387 */                 Class[] arrayOfClass2 = localClass.getInterfaces();
/* 388 */                 for (int m = 0; m < arrayOfClass2.length; m++) {
/*     */                   try {
/* 390 */                     localMethod = arrayOfClass2[m].getMethod(str, arrayOfClass1);
/*     */                   }
/*     */                   catch (NoSuchMethodException localNoSuchMethodException3) {}
/*     */                 }
/*     */                 
/* 395 */                 localClass = localClass.getSuperclass();
/* 396 */                 if ((localClass != null) && (Modifier.isPublic(localClass.getModifiers()))) {
/*     */                   try {
/* 398 */                     localMethod = localClass.getMethod(str, arrayOfClass1);
/*     */                   }
/*     */                   catch (NoSuchMethodException localNoSuchMethodException2) {}
/*     */                 }
/*     */               }
/*     */               
/* 404 */               if (localMethod == null) {
/* 405 */                 throw new JessException("call", "Method not accessible", str);
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 412 */             for (int k = 0; k < i; k++) {
/* 413 */               arrayOfObject[k] = ReflectFunctions.valueToObject(arrayOfClass1[k], paramValueVector.get(k + 3), paramContext);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 421 */             Object localObject2 = localMethod.invoke(localObject1, arrayOfObject);
/*     */             
/* 423 */             return ReflectFunctions.objectToValue(localMethod.getReturnType(), localObject2);
/*     */           }
/*     */         }
/*     */         catch (IllegalArgumentException localIllegalArgumentException2) {}
/*     */       }
/*     */       
/*     */ 
/* 430 */       throw new NoSuchMethodException(str);
/*     */     }
/*     */     catch (NoSuchMethodException localNoSuchMethodException1) {
/* 433 */       if (!hasMethodOfName(localClass, str)) {
/* 434 */         throw new JessException("call", "No method named '" + str + "' found", "in class " + localClass.getName());
/*     */       }
/*     */       
/*     */ 
/* 438 */       throw new JessException("call", "No overloading of method '" + str + '\'', "in class " + localClass.getName() + " I can call with these arguments: " + paramValueVector.toStringWithParens());
/*     */ 
/*     */     }
/*     */     catch (InvocationTargetException localInvocationTargetException)
/*     */     {
/*     */ 
/* 444 */       throw new JessException("call", "Called method threw an exception", localInvocationTargetException.getTargetException());
/*     */     }
/*     */     catch (IllegalAccessException localIllegalAccessException) {
/* 447 */       throw new JessException("call", "Method is not accessible", localIllegalAccessException);
/*     */     } catch (IllegalArgumentException localIllegalArgumentException1) {
/* 449 */       throw new JessException("call", "Invalid argument to " + str, localIllegalArgumentException1);
/*     */     }
/*     */   }
/*     */   
/*     */   private final boolean hasMethodOfName(Class paramClass, String paramString) {
/*     */     try {
/* 455 */       Method[] arrayOfMethod = getMethods(paramClass);
/* 456 */       for (int i = 0; i < arrayOfMethod.length; i++)
/* 457 */         if (arrayOfMethod[i].getName().equals(paramString))
/* 458 */           return true;
/* 459 */       return false;
/*     */     } catch (Exception localException) {}
/* 461 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Call.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */