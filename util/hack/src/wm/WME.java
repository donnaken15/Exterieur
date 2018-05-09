/*     */ package wm;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ public abstract class WME implements Cloneable { protected static final String BOLD_TAG = "<B>";
/*     */   protected static final String UNBOLD_TAG = "</B>";
/*     */   protected java.beans.PropertyChangeSupport __support;
/*     */   
/*   9 */   public WME() { jdMethod_this(); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void jdMethod_this()
/*     */   {
/*  23 */     this.__support = new java.beans.PropertyChangeSupport(this);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String lowercaseFirstCharacter(String paramString)
/*     */   {
/*  29 */     StringBuffer localStringBuffer = new StringBuffer(paramString);
/*  30 */     localStringBuffer.setCharAt(0, Character.toLowerCase(localStringBuffer.charAt(0)));
/*  31 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   public static String uppercaseFirstCharacter(String paramString) {
/*  35 */     StringBuffer localStringBuffer = new StringBuffer(paramString);
/*  36 */     localStringBuffer.setCharAt(0, Character.toUpperCase(localStringBuffer.charAt(0)));
/*  37 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   public Method[] _getSetMethods()
/*     */   {
/*     */     try {
/*  43 */       Class localClass = getClass();
/*  44 */       Method[] arrayOfMethod1 = localClass.getMethods();
/*  45 */       java.util.Vector localVector = new java.util.Vector(arrayOfMethod1.length);
/*     */       
/*  47 */       for (int i = 0; i < arrayOfMethod1.length; i++) {
/*  48 */         String str = arrayOfMethod1[i].getName();
/*  49 */         if ((str.substring(0, 3).equals("set")) && (arrayOfMethod1[i].getParameterTypes().length == 1))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  54 */           localVector.add(arrayOfMethod1[i]);
/*     */         }
/*     */       }
/*  57 */       Method[] arrayOfMethod2 = new Method[localVector.size()];
/*  58 */       return (Method[])localVector.toArray(arrayOfMethod2);
/*  59 */     } catch (Exception localException) { throw new WmeReflectionError(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   public Method[] _getGetMethods() {
/*     */     try {
/*  65 */       Class localClass = getClass();
/*  66 */       Method[] arrayOfMethod1 = localClass.getMethods();
/*  67 */       java.util.Vector localVector = new java.util.Vector(arrayOfMethod1.length);
/*     */       
/*  69 */       for (int i = 0; i < arrayOfMethod1.length; i++) {
/*  70 */         String str = arrayOfMethod1[i].getName();
/*  71 */         if ((str.substring(0, 3).equals("get")) && (!str.equals("getClass")) && (arrayOfMethod1[i].getParameterTypes().length == 0))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */           localVector.add(arrayOfMethod1[i]);
/*     */         }
/*     */       }
/*  80 */       Method[] arrayOfMethod2 = new Method[localVector.size()];
/*  81 */       return (Method[])localVector.toArray(arrayOfMethod2);
/*  82 */     } catch (Exception localException) { throw new WmeReflectionError(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   public String[] _getFieldNames() {
/*  87 */     Method[] arrayOfMethod = _getGetMethods();
/*  88 */     String[] arrayOfString = new String[arrayOfMethod.length];
/*  89 */     for (int i = 0; i < arrayOfMethod.length; i++)
/*  90 */       arrayOfString[i] = lowercaseFirstCharacter(arrayOfMethod[i].getName().substring(3));
/*  91 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   public Class[] _getFieldTypes()
/*     */   {
/*  96 */     Method[] arrayOfMethod = _getGetMethods();
/*  97 */     Class[] arrayOfClass = new Class[arrayOfMethod.length];
/*  98 */     for (int i = 0; i < arrayOfMethod.length; i++)
/*  99 */       arrayOfClass[i] = arrayOfMethod[i].getReturnType();
/* 100 */     return arrayOfClass;
/*     */   }
/*     */   
/*     */   public Method _getGetMethod(String paramString) throws NoSuchFieldException
/*     */   {
/* 105 */     String str = "get" + uppercaseFirstCharacter(paramString);
/*     */     try {
/* 107 */       return getClass().getMethod(str, null);
/* 108 */     } catch (NoSuchMethodException localNoSuchMethodException) { throw new NoSuchFieldException(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   public Method _getSetMethod(String paramString, Class paramClass) throws NoSuchFieldException {
/* 113 */     String str = "set" + uppercaseFirstCharacter(paramString);
/*     */     try {
/* 115 */       Class[] arrayOfClass = { paramClass };
/* 116 */       return getClass().getMethod(str, arrayOfClass);
/* 117 */     } catch (NoSuchMethodException localNoSuchMethodException) { throw new NoSuchFieldException(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 123 */     String[] arrayOfString = _getFieldNames();
/* 124 */     Method[] arrayOfMethod = _getGetMethods();
/* 125 */     StringBuffer localStringBuffer = new StringBuffer();
/* 126 */     localStringBuffer.append("(");
/*     */     try {
/* 128 */       for (int i = 0; i < arrayOfString.length; i++) {
/* 129 */         localStringBuffer.append(arrayOfString[i] + ": ");
/*     */         
/* 131 */         String str = "format" + uppercaseFirstCharacter(arrayOfString[i]);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 136 */         if (!Class.forName("wm.WME").isAssignableFrom(arrayOfMethod[i].getReturnType()))
/*     */         {
/*     */ 
/*     */           try
/*     */           {
/*     */ 
/* 142 */             Method localMethod1 = getClass().getMethod(str, null);
/* 143 */             localStringBuffer.append(localMethod1.invoke(this, null));
/*     */           } catch (NoSuchMethodException localNoSuchMethodException1) {
/* 145 */             localStringBuffer.append(arrayOfMethod[i].invoke(this, null));
/*     */           }
/*     */           
/*     */         }
/*     */         else
/*     */         {
/*     */           try
/*     */           {
/*     */ 
/* 154 */             Method localMethod2 = getClass().getMethod(str, null);
/* 155 */             localStringBuffer.append(localMethod2.invoke(this, null));
/*     */           } catch (NoSuchMethodException localNoSuchMethodException2) {
/* 157 */             WME localWME = (WME)arrayOfMethod[i].invoke(this, null);
/* 158 */             if (localWME == null) {
/* 159 */               localStringBuffer.append(localWME);
/*     */             } else
/* 161 */               localStringBuffer.append(localWME.objectToString());
/*     */           }
/*     */         }
/* 164 */         if (i + 1 != arrayOfString.length)
/* 165 */           localStringBuffer.append(", ");
/*     */       }
/* 167 */       localStringBuffer.append(")");
/* 168 */       return localStringBuffer.toString();
/*     */     } catch (Exception localException) {
/* 170 */       throw new WmeReflectionError(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   public String toString_HTML()
/*     */   {
/* 176 */     String[] arrayOfString = _getFieldNames();
/* 177 */     Method[] arrayOfMethod = _getGetMethods();
/* 178 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/* 180 */     localStringBuffer.append("<font size = \"-1\" face=\"Helvetica, Arial, sans-serif\">");
/* 181 */     localStringBuffer.append("(");
/*     */     try {
/* 183 */       for (int i = 0; i < arrayOfString.length; i++) {
/* 184 */         localStringBuffer.append(arrayOfString[i] + ": ");
/*     */         
/* 186 */         String str = "format" + uppercaseFirstCharacter(arrayOfString[i]);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 191 */         if (!Class.forName("wm.WME").isAssignableFrom(arrayOfMethod[i].getReturnType()))
/*     */         {
/*     */ 
/*     */           try
/*     */           {
/*     */ 
/* 197 */             Method localMethod1 = getClass().getMethod(str, null);
/* 198 */             localStringBuffer.append("<B>" + localMethod1.invoke(this, null) + "</B>");
/*     */           } catch (NoSuchMethodException localNoSuchMethodException1) {
/* 200 */             localStringBuffer.append("<B>" + arrayOfMethod[i].invoke(this, null) + "</B>");
/*     */           }
/*     */           
/*     */         }
/*     */         else
/*     */         {
/*     */           try
/*     */           {
/*     */ 
/* 209 */             Method localMethod2 = getClass().getMethod(str, null);
/* 210 */             localStringBuffer.append("<B>" + localMethod2.invoke(this, null) + "</B>");
/*     */           } catch (NoSuchMethodException localNoSuchMethodException2) {
/* 212 */             WME localWME = (WME)arrayOfMethod[i].invoke(this, null);
/* 213 */             if (localWME == null) {
/* 214 */               localStringBuffer.append("<B>" + localWME + "</B>");
/*     */             } else {
/* 216 */               localStringBuffer.append("<B>" + localWME.objectToString() + "</B>");
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 221 */         if (i + 1 != arrayOfString.length)
/* 222 */           localStringBuffer.append(", ");
/*     */       }
/* 224 */       localStringBuffer.append(")");
/* 225 */       return localStringBuffer.toString();
/*     */     } catch (Exception localException) {
/* 227 */       throw new WmeReflectionError(localException);
/*     */     }
/*     */   }
/*     */   
/* 231 */   protected String objectToString() { return super.toString(); }
/*     */   
/*     */   public WME cloneWME() {
/*     */     try {
/* 235 */       return (WME)clone();
/*     */     } catch (CloneNotSupportedException localCloneNotSupportedException) {
/* 237 */       throw new WorkingMemoryError(localCloneNotSupportedException.getMessage());
/*     */     }
/*     */   }
/*     */   
/* 241 */   public void addPropertyChangeListener(java.beans.PropertyChangeListener paramPropertyChangeListener) { this.__support.addPropertyChangeListener(paramPropertyChangeListener); }
/* 242 */   public void removePropertyChangeListener(java.beans.PropertyChangeListener paramPropertyChangeListener) { this.__support.removePropertyChangeListener(paramPropertyChangeListener); }
/*     */   
/*     */   public void addPropertyChangeListener(String paramString, java.beans.PropertyChangeListener paramPropertyChangeListener) {
/* 245 */     this.__support.addPropertyChangeListener(paramPropertyChangeListener);
/*     */   }
/*     */   
/*     */   public void removePropertyChangeListener(String paramString, java.beans.PropertyChangeListener paramPropertyChangeListener) {
/* 249 */     this.__support.removePropertyChangeListener(paramString, paramPropertyChangeListener);
/*     */   }
/*     */   
/*     */   public boolean isTransient() {
/* 253 */     return false;
/*     */   }
/*     */   
/*     */   public void assign(WME paramWME)
/*     */   {
/* 258 */     Method[] arrayOfMethod = paramWME._getGetMethods();
/* 259 */     Class[] arrayOfClass = paramWME._getFieldTypes();
/* 260 */     for (int i = 0; i < arrayOfMethod.length; i++) {
/*     */       try {
/* 262 */         String str = lowercaseFirstCharacter(arrayOfMethod[i].getName().substring(3));
/* 263 */         Class localClass = arrayOfMethod[i].getReturnType();
/*     */         try {
/* 265 */           Method localMethod = _getSetMethod(str, localClass);
/* 266 */           Object[] arrayOfObject = { arrayOfMethod[i].invoke(paramWME, null) };
/* 267 */           localMethod.invoke(this, arrayOfObject);
/*     */         } catch (NoSuchFieldException localNoSuchFieldException) {}
/* 269 */       } catch (Exception localException) { throw new WmeReflectionError(localException);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */