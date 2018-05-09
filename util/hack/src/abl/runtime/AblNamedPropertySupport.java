/*    */ package abl.runtime;
/*    */ 
/*    */ import java.util.Hashtable;
/*    */ 
/*    */ public class AblNamedPropertySupport {
/*    */   private final Hashtable propertyTable;
/*    */   
/*  8 */   public AblNamedPropertySupport() { jdMethod_this(); }
/*  9 */   private final void jdMethod_this() { this.propertyTable = new Hashtable(); }
/*    */   
/*    */   public class UserProperty
/*    */   {
/*    */     private final String name;
/*    */     private final Object value;
/*    */     
/*    */     UserProperty(String paramString, Object paramObject) {
/* 17 */       this.name = paramString;
/* 18 */       this.value = paramObject;
/*    */     }
/*    */     
/* 21 */     public String getName() { return this.name; }
/* 22 */     public Object getValue() { return this.value; }
/*    */   }
/*    */   
/*    */ 
/* 26 */   public void setProperty(String paramString, Object paramObject) { this.propertyTable.put(paramString, paramObject); }
/* 27 */   public Object getProperty(String paramString) { return this.propertyTable.get(paramString); }
/* 28 */   void deleteProperty(String paramString) { this.propertyTable.remove(paramString); }
/*    */   
/*    */   java.util.List getAllDefinedProperties() {
/* 31 */     java.util.Vector localVector = new java.util.Vector();
/*    */     
/* 33 */     java.util.Enumeration localEnumeration = this.propertyTable.keys();
/* 34 */     while (localEnumeration.hasMoreElements()) {
/* 35 */       String str = (String)localEnumeration.nextElement();
/* 36 */       Object localObject = this.propertyTable.get(str);
/* 37 */       localVector.add(new UserProperty(str, localObject));
/*    */     }
/*    */     
/* 40 */     return localVector;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\AblNamedPropertySupport.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */