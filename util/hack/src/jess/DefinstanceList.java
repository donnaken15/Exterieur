/*     */ package jess;
/*     */ 
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyDescriptor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ class DefinstanceList implements java.io.Serializable, java.beans.PropertyChangeListener
/*     */ {
/*     */   private HashMap m_javaClasses;
/*     */   private HashMap m_definstances;
/*     */   private HashMap m_jessClasses;
/*     */   private transient Rete m_rete;
/*     */   static Class class$java$beans$PropertyChangeListener;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  21 */     this.m_javaClasses = new HashMap(101);
/*     */     
/*  23 */     this.m_definstances = new HashMap(101);
/*     */     
/*  25 */     this.m_jessClasses = new HashMap(101);
/*     */   }
/*     */   
/*     */   DefinstanceList(Rete paramRete) {
/*  29 */     jdMethod_this();
/*     */     
/*  31 */     setEngine(paramRete);
/*     */   }
/*     */   
/*     */   void setEngine(Rete paramRete) {
/*  35 */     this.m_rete = paramRete;
/*     */   }
/*     */   
/*     */   synchronized void clear() {
/*  39 */     for (Iterator localIterator = this.m_definstances.keySet().iterator(); localIterator.hasNext();) {
/*  40 */       removePropertyChangeListener(localIterator.next());
/*     */     }
/*  42 */     this.m_javaClasses.clear();
/*  43 */     this.m_definstances.clear();
/*  44 */     this.m_jessClasses.clear();
/*     */   }
/*     */   
/*     */   synchronized void reset() throws JessException {
/*  48 */     for (Iterator localIterator = this.m_definstances.keySet().iterator(); localIterator.hasNext();) {
/*  49 */       updateMultipleSlots(localIterator.next(), true, this.m_rete.getGlobalContext());
/*     */     }
/*     */   }
/*     */   
/*     */   synchronized Iterator listDefinstances()
/*     */   {
/*  55 */     return new ArrayList(this.m_definstances.keySet()).iterator();
/*     */   }
/*     */   
/*     */   synchronized Iterator listDefclasses() {
/*  59 */     return new ArrayList(this.m_javaClasses.keySet()).iterator();
/*     */   }
/*     */   
/*     */   String jessNameToJavaName(String paramString) {
/*  63 */     return (String)this.m_javaClasses.get(paramString);
/*     */   }
/*     */   
/*     */   void mapDefclassName(String paramString1, String paramString2) {
/*  67 */     this.m_javaClasses.put(paramString1, paramString2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final Fact updateShadowFact(Object paramObject1, String paramString, Object paramObject2, boolean paramBoolean, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  75 */     if ((paramString == null) || (paramObject2 == null)) {
/*  76 */       return updateMultipleSlots(paramObject1, paramBoolean, paramContext);
/*     */     }
/*  78 */     return updateSingleSlot(paramObject1, paramString, paramObject2, paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final synchronized Fact createNewShadowFact(Object paramObject, Context paramContext, int paramInt)
/*     */     throws JessException
/*     */   {
/* 192 */     Fact localFact = null;
/* 193 */     Rete localRete = paramContext.getEngine();
/*     */     try
/*     */     {
/* 196 */       localFact = new Fact((String)this.m_jessClasses.get(paramObject), this.m_rete);
/* 197 */       localFact.setSlotValue("OBJECT", new Value(paramObject));
/* 198 */       localFact.setShadowMode(paramInt);
/* 199 */       this.m_definstances.put(paramObject, localFact);
/*     */       
/* 201 */       Deftemplate localDeftemplate = localFact.getDeftemplate();
/* 202 */       Object[] arrayOfObject = new Object[0];
/*     */       
/* 204 */       for (int i = 0; i < localDeftemplate.getNSlots(); i++) {
/* 205 */         if (!localDeftemplate.getSlotName(i).equals("OBJECT"))
/*     */         {
/*     */ 
/* 208 */           SerializablePD localSerializablePD = (SerializablePD)localDeftemplate.getSlotDefault(i).externalAddressValue(paramContext);
/*     */           
/* 210 */           String str = localSerializablePD.getName();
/*     */           
/* 212 */           Method localMethod = localSerializablePD.getReadMethod(localRete);
/* 213 */           Class localClass = localMethod.getReturnType();
/*     */           
/* 215 */           Object localObject = localMethod.invoke(paramObject, arrayOfObject);
/*     */           
/* 217 */           Value localValue = ReflectFunctions.objectToValue(localClass, localObject);
/* 218 */           localFact.setSlotValue(str, localValue);
/*     */         }
/*     */       }
/*     */     } catch (InvocationTargetException localInvocationTargetException) {
/* 222 */       throw new JessException("DefinstanceList.createNewShadowFact", "Called method threw an exception", localInvocationTargetException.getTargetException());
/*     */ 
/*     */     }
/*     */     catch (IllegalAccessException localIllegalAccessException)
/*     */     {
/* 227 */       throw new JessException("DefinstanceList.createNewShadowFact", "Method is not accessible", localIllegalAccessException);
/*     */     }
/*     */     catch (IllegalArgumentException localIllegalArgumentException)
/*     */     {
/* 231 */       throw new JessException("DefinstanceList.createNewShadowFact", "Invalid argument", localIllegalArgumentException);
/*     */     }
/*     */     
/* 234 */     return this.m_rete.assertFact(localFact, paramContext);
/*     */   }
/*     */   
/*     */   synchronized Value updateObject(Object paramObject) throws JessException {
/* 238 */     Fact localFact = updateMultipleSlots(paramObject, false, this.m_rete.getGlobalContext());
/* 239 */     return new FactIDValue(localFact);
/*     */   }
/*     */   
/*     */   synchronized Value definstance(String paramString, Object paramObject, boolean paramBoolean, Context paramContext) throws JessException
/*     */   {
/*     */     try
/*     */     {
/* 246 */       String str = jessNameToJavaName(paramString);
/*     */       
/* 248 */       if (str == null) {
/* 249 */         throw new JessException("DefinstanceList.definstance", "Unknown object class", paramString);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 254 */       if (this.m_definstances.get(paramObject) != null) {
/* 255 */         return new FactIDValue(null);
/*     */       }
/*     */       
/* 258 */       if (!paramContext.getEngine().findClass(str).isAssignableFrom(paramObject.getClass()))
/*     */       {
/* 260 */         throw new JessException("DefinstanceList.definstance", "Object is not instance of", str);
/*     */       }
/*     */       
/*     */ 
/* 264 */       if (paramBoolean)
/*     */       {
/*     */ 
/* 267 */         Class localClass = Class.forName("java.beans.PropertyChangeListener");
/* 268 */         localObject = paramObject.getClass().getMethod("addPropertyChangeListener", new Class[] { localClass });
/*     */         
/*     */ 
/* 271 */         ((Method)localObject).invoke(paramObject, new Object[] { this });
/*     */       }
/*     */       
/* 274 */       this.m_jessClasses.put(paramObject, paramString);
/* 275 */       int i = true - paramBoolean;
/* 276 */       Object localObject = createNewShadowFact(paramObject, paramContext, i);
/*     */       
/* 278 */       return new FactIDValue((Fact)localObject);
/*     */     }
/*     */     catch (InvocationTargetException localInvocationTargetException) {
/* 281 */       throw new JessException("DefinstanceList.definstance", "Cannot add PropertyChangeListener", localInvocationTargetException.getTargetException());
/*     */ 
/*     */     }
/*     */     catch (NoSuchMethodException localNoSuchMethodException)
/*     */     {
/* 286 */       throw new JessException("DefinstanceList.definstance", "Obj doesn't accept PropertyChangeListeners", localNoSuchMethodException);
/*     */ 
/*     */     }
/*     */     catch (ClassNotFoundException localClassNotFoundException)
/*     */     {
/* 291 */       throw new JessException("DefinstanceList.definstance", "Class not found", localClassNotFoundException);
/*     */     }
/*     */     catch (IllegalAccessException localIllegalAccessException) {
/* 294 */       throw new JessException("DefinstanceList.definstance", "Class or method is not accessible", localIllegalAccessException);
/*     */     }
/*     */   }
/*     */   
/*     */   synchronized Fact undefinstance(Object paramObject)
/*     */     throws JessException
/*     */   {
/* 301 */     Fact localFact = (Fact)this.m_definstances.get(paramObject);
/* 302 */     if (localFact != null)
/* 303 */       localFact = this.m_rete.retractNoUndefinstance(localFact);
/* 304 */     this.m_definstances.remove(paramObject);
/* 305 */     removePropertyChangeListener(paramObject);
/* 306 */     this.m_jessClasses.remove(paramObject);
/* 307 */     return localFact;
/*     */   }
/*     */   
/*     */   private final void removePropertyChangeListener(Object paramObject) {
/*     */     try {
/* 312 */       Class[] tmp11_8 = new Class[1]; Class tmp16_13 = class$java$beans$PropertyChangeListener;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */       if (tmp16_13 == null) tmp16_13; 0[tmp16_13] = (class$java$beans$PropertyChangeListener = class$("[Ljava.beans.PropertyChangeListener;", false));Method localMethod = "removePropertyChangeListener".getMethod(tmp11_8, tmp11_8);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 317 */       localMethod.invoke(paramObject, new Object[] { this });paramObject.getClass();
/*     */     }
/*     */     catch (Exception localException) {}
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
/*     */   {
/* 324 */     Object localObject = paramPropertyChangeEvent.getSource();
/*     */     try
/*     */     {
/* 327 */       String str = (String)this.m_jessClasses.get(localObject);
/*     */       
/*     */ 
/* 330 */       if (str != null) {
/* 331 */         updateShadowFact(localObject, paramPropertyChangeEvent.getPropertyName(), paramPropertyChangeEvent.getNewValue(), false, this.m_rete.getGlobalContext());
/*     */       }
/*     */       
/*     */     }
/*     */     catch (JessException localJessException)
/*     */     {
/* 337 */       System.out.println("Async Error: " + localJessException);
/* 338 */       if (localJessException.getCause() != null) {
/* 339 */         localJessException.getCause().printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   synchronized Value defclass(String paramString1, String paramString2, String paramString3) throws JessException
/*     */   {
/*     */     try {
/*     */       Deftemplate localDeftemplate;
/* 348 */       if (paramString3 != null) {
/* 349 */         localDeftemplate = this.m_rete.findDeftemplate(this.m_rete.resolveName(paramString3));
/* 350 */         if (localDeftemplate == null) {
/* 351 */           throw new JessException("defclass", "No such parent template: ", paramString3);
/*     */         }
/*     */         
/* 354 */         localDeftemplate = new Deftemplate(paramString1, "$JAVA-OBJECT$ " + paramString2, localDeftemplate, this.m_rete);
/*     */       }
/*     */       else {
/* 357 */         localDeftemplate = new Deftemplate(paramString1, "$JAVA-OBJECT$ " + paramString2, this.m_rete);
/*     */       }
/*     */       
/* 360 */       Class localClass1 = this.m_rete.findClass(paramString2);
/* 361 */       mapDefclassName(paramString1, localClass1.getName());
/*     */       
/*     */ 
/* 364 */       PropertyDescriptor[] arrayOfPropertyDescriptor = ReflectFunctions.getPropertyDescriptors(localClass1);
/*     */       
/*     */       Object localObject;
/*     */       
/* 368 */       for (int i = 0; i < arrayOfPropertyDescriptor.length - 1; i++) {
/* 369 */         for (int j = i + 1; j < arrayOfPropertyDescriptor.length; j++) {
/* 370 */           if (arrayOfPropertyDescriptor[i].getName().compareTo(arrayOfPropertyDescriptor[j].getName()) > 0) {
/* 371 */             localObject = arrayOfPropertyDescriptor[i];
/* 372 */             arrayOfPropertyDescriptor[i] = arrayOfPropertyDescriptor[j];
/* 373 */             arrayOfPropertyDescriptor[j] = localObject;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 378 */       for (i = 0; i < arrayOfPropertyDescriptor.length; i++) {
/* 379 */         Method localMethod = arrayOfPropertyDescriptor[i].getReadMethod();
/* 380 */         if (localMethod != null)
/*     */         {
/* 382 */           localObject = arrayOfPropertyDescriptor[i].getName();
/* 383 */           Class localClass2 = localMethod.getReturnType();
/* 384 */           Value localValue = new Value(new SerializablePD(localClass1, arrayOfPropertyDescriptor[i]));
/* 385 */           if (localClass2.isArray()) {
/* 386 */             localDeftemplate.addMultiSlot((String)localObject, localValue);
/*     */           } else {
/* 388 */             localDeftemplate.addSlot((String)localObject, localValue, "ANY");
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 393 */       localDeftemplate.addSlot("OBJECT", Funcall.NIL, "OBJECT");
/*     */       
/*     */ 
/* 396 */       this.m_rete.addDeftemplate(localDeftemplate);
/*     */       
/* 398 */       return new Value(localClass1.getName(), 1);
/*     */     } catch (ClassNotFoundException localClassNotFoundException) {
/* 400 */       throw new JessException("defclass", "Class not found:", localClassNotFoundException);
/*     */     } catch (java.beans.IntrospectionException localIntrospectionException) {
/* 402 */       throw new JessException("defclass", "Introspection error:", localIntrospectionException);
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final synchronized Fact updateMultipleSlots(Object paramObject, boolean paramBoolean, Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 27	jess/DefinstanceList:m_definstances	Ljava/util/HashMap;
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual 88	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   8: checkcast 103	jess/Fact
/*     */     //   11: astore 4
/*     */     //   13: aload 4
/*     */     //   15: ifnonnull +19 -> 34
/*     */     //   18: new 62	jess/JessException
/*     */     //   21: dup
/*     */     //   22: ldc 105
/*     */     //   24: ldc 107
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual 112	java/lang/Object:toString	()Ljava/lang/String;
/*     */     //   30: invokespecial 115	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   33: athrow
/*     */     //   34: aload_3
/*     */     //   35: invokevirtual 119	jess/Context:getEngine	()Ljess/Rete;
/*     */     //   38: astore 5
/*     */     //   40: aload 5
/*     */     //   42: invokevirtual 125	jess/Rete:getFactList	()Ljess/FactList;
/*     */     //   45: astore 6
/*     */     //   47: goto +7 -> 54
/*     */     //   50: aload 7
/*     */     //   52: monitorexit
/*     */     //   53: athrow
/*     */     //   54: aload 5
/*     */     //   56: invokevirtual 129	jess/Rete:getCompiler	()Ljess/ReteCompiler;
/*     */     //   59: dup
/*     */     //   60: astore 7
/*     */     //   62: monitorenter
/*     */     //   63: goto +7 -> 70
/*     */     //   66: aload 10
/*     */     //   68: monitorexit
/*     */     //   69: athrow
/*     */     //   70: aload 5
/*     */     //   72: invokevirtual 132	jess/Rete:getActivationSemaphore	()Ljava/lang/Object;
/*     */     //   75: dup
/*     */     //   76: astore 10
/*     */     //   78: monitorenter
/*     */     //   79: aload 6
/*     */     //   81: aload 4
/*     */     //   83: aload 5
/*     */     //   85: invokevirtual 136	jess/FactList:prepareToModify	(Ljess/Fact;Ljess/Rete;)Ljess/Fact;
/*     */     //   88: pop
/*     */     //   89: aload 4
/*     */     //   91: invokevirtual 142	jess/Fact:getDeftemplate	()Ljess/Deftemplate;
/*     */     //   94: astore 16
/*     */     //   96: iconst_0
/*     */     //   97: anewarray 3	java/lang/Object
/*     */     //   100: astore 17
/*     */     //   102: iconst_0
/*     */     //   103: istore 18
/*     */     //   105: goto +110 -> 215
/*     */     //   108: aload 16
/*     */     //   110: iload 18
/*     */     //   112: invokevirtual 146	jess/Deftemplate:getSlotName	(I)Ljava/lang/String;
/*     */     //   115: ldc -107
/*     */     //   117: invokevirtual 154	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   120: ifeq +6 -> 126
/*     */     //   123: goto +89 -> 212
/*     */     //   126: aload 16
/*     */     //   128: iload 18
/*     */     //   130: invokevirtual 158	jess/Deftemplate:getSlotDefault	(I)Ljess/Value;
/*     */     //   133: aload_3
/*     */     //   134: invokevirtual 162	jess/Value:externalAddressValue	(Ljess/Context;)Ljava/lang/Object;
/*     */     //   137: checkcast 165	jess/SerializablePD
/*     */     //   140: astore 19
/*     */     //   142: aload 19
/*     */     //   144: invokevirtual 169	jess/SerializablePD:getName	()Ljava/lang/String;
/*     */     //   147: astore 20
/*     */     //   149: aload 19
/*     */     //   151: aload 5
/*     */     //   153: invokevirtual 173	jess/SerializablePD:getReadMethod	(Ljess/Rete;)Ljava/lang/reflect/Method;
/*     */     //   156: astore 21
/*     */     //   158: aload 21
/*     */     //   160: invokevirtual 177	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
/*     */     //   163: astore 22
/*     */     //   165: aload 21
/*     */     //   167: aload_1
/*     */     //   168: aload 17
/*     */     //   170: invokevirtual 183	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   173: astore 23
/*     */     //   175: aload 22
/*     */     //   177: aload 23
/*     */     //   179: invokestatic 187	jess/ReflectFunctions:objectToValue	(Ljava/lang/Class;Ljava/lang/Object;)Ljess/Value;
/*     */     //   182: astore 24
/*     */     //   184: aload 4
/*     */     //   186: aload 20
/*     */     //   188: invokevirtual 193	jess/Fact:getSlotValue	(Ljava/lang/String;)Ljess/Value;
/*     */     //   191: astore 25
/*     */     //   193: aload 24
/*     */     //   195: aload 25
/*     */     //   197: invokevirtual 196	jess/Value:equals	(Ljess/Value;)Z
/*     */     //   200: ifne +12 -> 212
/*     */     //   203: aload 4
/*     */     //   205: aload 20
/*     */     //   207: aload 24
/*     */     //   209: invokevirtual 200	jess/Fact:setSlotValue	(Ljava/lang/String;Ljess/Value;)V
/*     */     //   212: iinc 18 1
/*     */     //   215: iload 18
/*     */     //   217: aload 16
/*     */     //   219: invokevirtual 204	jess/Deftemplate:getNSlots	()I
/*     */     //   222: if_icmplt -114 -> 108
/*     */     //   225: goto +97 -> 322
/*     */     //   228: astore 16
/*     */     //   230: new 62	jess/JessException
/*     */     //   233: dup
/*     */     //   234: ldc 105
/*     */     //   236: ldc -49
/*     */     //   238: aload 16
/*     */     //   240: invokevirtual 212	java/lang/reflect/InvocationTargetException:getTargetException	()Ljava/lang/Throwable;
/*     */     //   243: invokespecial 215	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   246: athrow
/*     */     //   247: astore 16
/*     */     //   249: new 62	jess/JessException
/*     */     //   252: dup
/*     */     //   253: ldc 105
/*     */     //   255: ldc -38
/*     */     //   257: aload 16
/*     */     //   259: invokespecial 215	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   262: athrow
/*     */     //   263: astore 16
/*     */     //   265: new 62	jess/JessException
/*     */     //   268: dup
/*     */     //   269: ldc 105
/*     */     //   271: ldc -34
/*     */     //   273: aload 16
/*     */     //   275: invokespecial 215	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   278: athrow
/*     */     //   279: astore 13
/*     */     //   281: jsr +6 -> 287
/*     */     //   284: aload 13
/*     */     //   286: athrow
/*     */     //   287: astore 14
/*     */     //   289: iload_2
/*     */     //   290: ifne +18 -> 308
/*     */     //   293: aload 6
/*     */     //   295: aload 4
/*     */     //   297: aload 5
/*     */     //   299: aload_3
/*     */     //   300: invokevirtual 227	jess/FactList:finishModify	(Ljess/Fact;Ljess/Rete;Ljess/Context;)Ljess/Fact;
/*     */     //   303: astore 4
/*     */     //   305: goto +15 -> 320
/*     */     //   308: aload_0
/*     */     //   309: getfield 23	jess/DefinstanceList:m_rete	Ljess/Rete;
/*     */     //   312: aload 4
/*     */     //   314: aload_3
/*     */     //   315: invokevirtual 231	jess/Rete:assertFact	(Ljess/Fact;Ljess/Context;)Ljess/Fact;
/*     */     //   318: astore 4
/*     */     //   320: ret 14
/*     */     //   322: jsr -35 -> 287
/*     */     //   325: aload 10
/*     */     //   327: monitorexit
/*     */     //   328: aload 7
/*     */     //   330: monitorexit
/*     */     //   331: aload 4
/*     */     //   333: areturn
/*     */     // Line number table:
/*     */     //   Java source line #87	-> byte code offset #0
/*     */     //   Java source line #88	-> byte code offset #13
/*     */     //   Java source line #89	-> byte code offset #18
/*     */     //   Java source line #92	-> byte code offset #34
/*     */     //   Java source line #93	-> byte code offset #40
/*     */     //   Java source line #94	-> byte code offset #47
/*     */     //   Java source line #95	-> byte code offset #63
/*     */     //   Java source line #96	-> byte code offset #79
/*     */     //   Java source line #97	-> byte code offset #79
/*     */     //   Java source line #99	-> byte code offset #89
/*     */     //   Java source line #100	-> byte code offset #96
/*     */     //   Java source line #102	-> byte code offset #102
/*     */     //   Java source line #102	-> byte code offset #102
/*     */     //   Java source line #103	-> byte code offset #108
/*     */     //   Java source line #104	-> byte code offset #123
/*     */     //   Java source line #105	-> byte code offset #126
/*     */     //   Java source line #107	-> byte code offset #142
/*     */     //   Java source line #109	-> byte code offset #149
/*     */     //   Java source line #110	-> byte code offset #158
/*     */     //   Java source line #112	-> byte code offset #165
/*     */     //   Java source line #114	-> byte code offset #175
/*     */     //   Java source line #116	-> byte code offset #184
/*     */     //   Java source line #117	-> byte code offset #193
/*     */     //   Java source line #118	-> byte code offset #203
/*     */     //   Java source line #102	-> byte code offset #212
/*     */     //   Java source line #102	-> byte code offset #215
/*     */     //   Java source line #122	-> byte code offset #230
/*     */     //   Java source line #127	-> byte code offset #249
/*     */     //   Java source line #131	-> byte code offset #265
/*     */     //   Java source line #134	-> byte code offset #289
/*     */     //   Java source line #135	-> byte code offset #293
/*     */     //   Java source line #137	-> byte code offset #308
/*     */     //   Java source line #141	-> byte code offset #331
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	334	0	this	DefinstanceList
/*     */     //   0	334	1	paramObject	Object
/*     */     //   0	334	2	paramBoolean	boolean
/*     */     //   0	334	3	paramContext	Context
/*     */     //   11	321	4	localFact	Fact
/*     */     //   38	260	5	localRete	Rete
/*     */     //   45	249	6	localFactList	FactList
/*     */     //   50	279	7	Ljava/lang/Object;	Object
/*     */     //   66	260	10	Ljava/lang/Object;	Object
/*     */     //   279	6	13	localObject1	Object
/*     */     //   287	1	14	localObject2	Object
/*     */     //   94	124	16	localDeftemplate	Deftemplate
/*     */     //   228	11	16	localInvocationTargetException	InvocationTargetException
/*     */     //   247	11	16	localIllegalAccessException	IllegalAccessException
/*     */     //   263	11	16	localIllegalArgumentException	IllegalArgumentException
/*     */     //   100	69	17	arrayOfObject	Object[]
/*     */     //   103	120	18	i	int
/*     */     //   140	10	19	localSerializablePD	SerializablePD
/*     */     //   147	59	20	str	String
/*     */     //   156	10	21	localMethod	Method
/*     */     //   163	13	22	localClass	Class
/*     */     //   173	5	23	localObject3	Object
/*     */     //   182	26	24	localValue1	Value
/*     */     //   191	5	25	localValue2	Value
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   50	53	50	finally
/*     */     //   63	331	50	finally
/*     */     //   66	69	66	finally
/*     */     //   79	328	66	finally
/*     */     //   79	225	228	java/lang/reflect/InvocationTargetException
/*     */     //   79	225	247	java/lang/IllegalAccessException
/*     */     //   79	225	263	java/lang/IllegalArgumentException
/*     */     //   79	284	279	finally
/*     */     //   322	325	279	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final synchronized Fact updateSingleSlot(Object paramObject1, String paramString, Object paramObject2, Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 27	jess/DefinstanceList:m_definstances	Ljava/util/HashMap;
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual 88	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   8: checkcast 103	jess/Fact
/*     */     //   11: astore 5
/*     */     //   13: aload 5
/*     */     //   15: ifnonnull +19 -> 34
/*     */     //   18: new 62	jess/JessException
/*     */     //   21: dup
/*     */     //   22: ldc 105
/*     */     //   24: ldc 107
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual 112	java/lang/Object:toString	()Ljava/lang/String;
/*     */     //   30: invokespecial 115	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   33: athrow
/*     */     //   34: aload 4
/*     */     //   36: invokevirtual 119	jess/Context:getEngine	()Ljess/Rete;
/*     */     //   39: astore 6
/*     */     //   41: aload 6
/*     */     //   43: invokevirtual 125	jess/Rete:getFactList	()Ljess/FactList;
/*     */     //   46: astore 7
/*     */     //   48: goto +7 -> 55
/*     */     //   51: aload 8
/*     */     //   53: monitorexit
/*     */     //   54: athrow
/*     */     //   55: aload 6
/*     */     //   57: invokevirtual 129	jess/Rete:getCompiler	()Ljess/ReteCompiler;
/*     */     //   60: dup
/*     */     //   61: astore 8
/*     */     //   63: monitorenter
/*     */     //   64: goto +7 -> 71
/*     */     //   67: aload 11
/*     */     //   69: monitorexit
/*     */     //   70: athrow
/*     */     //   71: aload 6
/*     */     //   73: invokevirtual 132	jess/Rete:getActivationSemaphore	()Ljava/lang/Object;
/*     */     //   76: dup
/*     */     //   77: astore 11
/*     */     //   79: monitorenter
/*     */     //   80: aload 7
/*     */     //   82: aload 5
/*     */     //   84: aload 6
/*     */     //   86: invokevirtual 136	jess/FactList:prepareToModify	(Ljess/Fact;Ljess/Rete;)Ljess/Fact;
/*     */     //   89: pop
/*     */     //   90: aload 5
/*     */     //   92: invokevirtual 142	jess/Fact:getDeftemplate	()Ljess/Deftemplate;
/*     */     //   95: astore 17
/*     */     //   97: aload 17
/*     */     //   99: aload_2
/*     */     //   100: invokevirtual 235	jess/Deftemplate:getSlotIndex	(Ljava/lang/String;)I
/*     */     //   103: istore 18
/*     */     //   105: iload 18
/*     */     //   107: iconst_m1
/*     */     //   108: if_icmpne +39 -> 147
/*     */     //   111: new 62	jess/JessException
/*     */     //   114: dup
/*     */     //   115: ldc -20
/*     */     //   117: new 238	java/lang/StringBuffer
/*     */     //   120: dup
/*     */     //   121: ldc -16
/*     */     //   123: invokespecial 244	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
/*     */     //   126: aload_2
/*     */     //   127: invokevirtual 248	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   130: ldc -7
/*     */     //   132: invokevirtual 248	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   135: invokevirtual 251	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*     */     //   138: aload 17
/*     */     //   140: invokevirtual 252	jess/Deftemplate:getName	()Ljava/lang/String;
/*     */     //   143: invokespecial 115	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   146: athrow
/*     */     //   147: aload 17
/*     */     //   149: iload 18
/*     */     //   151: invokevirtual 158	jess/Deftemplate:getSlotDefault	(I)Ljess/Value;
/*     */     //   154: aload 4
/*     */     //   156: invokevirtual 162	jess/Value:externalAddressValue	(Ljess/Context;)Ljava/lang/Object;
/*     */     //   159: checkcast 165	jess/SerializablePD
/*     */     //   162: astore 19
/*     */     //   164: aload 19
/*     */     //   166: aload 6
/*     */     //   168: invokevirtual 173	jess/SerializablePD:getReadMethod	(Ljess/Rete;)Ljava/lang/reflect/Method;
/*     */     //   171: astore 20
/*     */     //   173: aload 20
/*     */     //   175: invokevirtual 177	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
/*     */     //   178: astore 21
/*     */     //   180: aload 21
/*     */     //   182: aload_3
/*     */     //   183: invokestatic 187	jess/ReflectFunctions:objectToValue	(Ljava/lang/Class;Ljava/lang/Object;)Ljess/Value;
/*     */     //   186: astore 22
/*     */     //   188: aload 5
/*     */     //   190: aload_2
/*     */     //   191: aload 22
/*     */     //   193: invokevirtual 200	jess/Fact:setSlotValue	(Ljava/lang/String;Ljess/Value;)V
/*     */     //   196: goto +44 -> 240
/*     */     //   199: astore 17
/*     */     //   201: new 62	jess/JessException
/*     */     //   204: dup
/*     */     //   205: ldc 105
/*     */     //   207: ldc -34
/*     */     //   209: aload 17
/*     */     //   211: invokespecial 215	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   214: athrow
/*     */     //   215: astore 14
/*     */     //   217: jsr +6 -> 223
/*     */     //   220: aload 14
/*     */     //   222: athrow
/*     */     //   223: astore 15
/*     */     //   225: aload 7
/*     */     //   227: aload 5
/*     */     //   229: aload 6
/*     */     //   231: aload 4
/*     */     //   233: invokevirtual 227	jess/FactList:finishModify	(Ljess/Fact;Ljess/Rete;Ljess/Context;)Ljess/Fact;
/*     */     //   236: astore 5
/*     */     //   238: ret 15
/*     */     //   240: jsr -17 -> 223
/*     */     //   243: aload 11
/*     */     //   245: monitorexit
/*     */     //   246: aload 8
/*     */     //   248: monitorexit
/*     */     //   249: aload 5
/*     */     //   251: areturn
/*     */     // Line number table:
/*     */     //   Java source line #150	-> byte code offset #0
/*     */     //   Java source line #151	-> byte code offset #13
/*     */     //   Java source line #152	-> byte code offset #18
/*     */     //   Java source line #155	-> byte code offset #34
/*     */     //   Java source line #156	-> byte code offset #41
/*     */     //   Java source line #157	-> byte code offset #48
/*     */     //   Java source line #158	-> byte code offset #64
/*     */     //   Java source line #159	-> byte code offset #80
/*     */     //   Java source line #160	-> byte code offset #80
/*     */     //   Java source line #162	-> byte code offset #90
/*     */     //   Java source line #163	-> byte code offset #97
/*     */     //   Java source line #164	-> byte code offset #105
/*     */     //   Java source line #165	-> byte code offset #111
/*     */     //   Java source line #168	-> byte code offset #147
/*     */     //   Java source line #170	-> byte code offset #164
/*     */     //   Java source line #171	-> byte code offset #173
/*     */     //   Java source line #173	-> byte code offset #180
/*     */     //   Java source line #174	-> byte code offset #188
/*     */     //   Java source line #177	-> byte code offset #201
/*     */     //   Java source line #180	-> byte code offset #225
/*     */     //   Java source line #184	-> byte code offset #249
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	252	0	this	DefinstanceList
/*     */     //   0	252	1	paramObject1	Object
/*     */     //   0	252	2	paramString	String
/*     */     //   0	252	3	paramObject2	Object
/*     */     //   0	252	4	paramContext	Context
/*     */     //   11	239	5	localFact	Fact
/*     */     //   39	191	6	localRete	Rete
/*     */     //   46	180	7	localFactList	FactList
/*     */     //   51	196	8	Ljava/lang/Object;	Object
/*     */     //   67	177	11	Ljava/lang/Object;	Object
/*     */     //   215	6	14	localObject1	Object
/*     */     //   223	1	15	localObject2	Object
/*     */     //   95	53	17	localDeftemplate	Deftemplate
/*     */     //   199	11	17	localIllegalArgumentException	IllegalArgumentException
/*     */     //   103	47	18	i	int
/*     */     //   162	3	19	localSerializablePD	SerializablePD
/*     */     //   171	3	20	localMethod	Method
/*     */     //   178	3	21	localClass	Class
/*     */     //   186	6	22	localValue	Value
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   51	54	51	finally
/*     */     //   64	249	51	finally
/*     */     //   67	70	67	finally
/*     */     //   80	246	67	finally
/*     */     //   80	196	199	java/lang/IllegalArgumentException
/*     */     //   80	220	215	finally
/*     */     //   240	243	215	finally
/*     */   }
/*     */   
/*     */   static Class class$(String paramString, boolean paramBoolean)
/*     */   {
/*     */     try
/*     */     {
/*     */       if (!paramBoolean) {}
/*     */       return Class.forName(paramString).getComponentType();
/*     */     }
/*     */     catch (ClassNotFoundException localClassNotFoundException)
/*     */     {
/*     */       throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\DefinstanceList.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */