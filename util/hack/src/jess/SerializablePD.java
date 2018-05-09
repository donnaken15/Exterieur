/*    */ package jess;
/*    */ 
/*    */ import java.beans.PropertyDescriptor;
/*    */ import java.io.Serializable;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ class SerializablePD
/*    */   implements Serializable
/*    */ {
/*    */   private String m_class;
/*    */   private String m_property;
/*    */   private transient Method m_get;
/*    */   private transient Method m_set;
/*    */   
/*    */   SerializablePD(Class paramClass, PropertyDescriptor paramPropertyDescriptor)
/*    */   {
/* 17 */     this.m_class = paramClass.getName();
/* 18 */     this.m_property = paramPropertyDescriptor.getName();
/* 19 */     this.m_get = paramPropertyDescriptor.getReadMethod();
/* 20 */     this.m_set = paramPropertyDescriptor.getWriteMethod();
/*    */   }
/*    */   
/*    */   private final void reload(Rete paramRete) throws JessException {
/*    */     try {
/* 25 */       Class localClass = paramRete.findClass(this.m_class);
/* 26 */       PropertyDescriptor[] arrayOfPropertyDescriptor = ReflectFunctions.getPropertyDescriptors(localClass);
/* 27 */       for (int i = 0; i < arrayOfPropertyDescriptor.length; i++) {
/* 28 */         if (arrayOfPropertyDescriptor[i].getName().equals(this.m_property)) {
/* 29 */           this.m_get = arrayOfPropertyDescriptor[i].getReadMethod();
/* 30 */           this.m_set = arrayOfPropertyDescriptor[i].getWriteMethod();
/* 31 */           return;
/*    */         }
/*    */       }
/*    */     } catch (Exception localException) {
/* 35 */       throw new JessException("SerializablePD.reload", "Can't recreate property", localException);
/*    */     }
/*    */   }
/*    */   
/*    */   String getName() {
/* 40 */     return this.m_property;
/*    */   }
/*    */   
/*    */   Method getReadMethod(Rete paramRete) throws JessException {
/* 44 */     if (this.m_get == null)
/* 45 */       reload(paramRete);
/* 46 */     return this.m_get;
/*    */   }
/*    */   
/*    */   Method getWriteMethod(Rete paramRete) throws JessException {
/* 50 */     if (this.m_set == null)
/* 51 */       reload(paramRete);
/* 52 */     return this.m_set;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 56 */     if (!(paramObject instanceof SerializablePD)) {
/* 57 */       return false;
/*    */     }
/* 59 */     SerializablePD localSerializablePD = (SerializablePD)paramObject;
/*    */     
/* 61 */     if ((this.m_class.equals(localSerializablePD.m_class)) && (this.m_property.equals(localSerializablePD.m_property))) 0; return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\SerializablePD.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */