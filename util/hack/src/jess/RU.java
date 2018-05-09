/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ public class RU
/*     */   implements Serializable
/*     */ {
/*     */   public static final int DT_SLOT_NAME = 0;
/*     */   public static final int DT_DFLT_DATA = 1;
/*     */   public static final int DT_DATA_TYPE = 2;
/*     */   public static final int DT_SLOT_SIZE = 3;
/*     */   public static final int NONE = 0;
/*     */   public static final int ATOM = 1;
/*     */   public static final int STRING = 2;
/*     */   public static final int INTEGER = 4;
/*     */   public static final int VARIABLE = 8;
/*     */   public static final int FACT = 16;
/*     */   public static final int FLOAT = 32;
/*     */   public static final int FUNCALL = 64;
/*     */   public static final int LIST = 512;
/*     */   public static final int EXTERNAL_ADDRESS = 2048;
/*     */   public static final int BINDING = 4096;
/*     */   public static final int MULTIVARIABLE = 8192;
/*     */   public static final int SLOT = 16384;
/*     */   public static final int MULTISLOT = 32768;
/*     */   public static final int LONG = 65536;
/*  58 */   private static Hashtable m_typeNames = new Hashtable();
/*     */   static final int ADD = 0;
/*     */   
/*  61 */   static { m_typeNames.put(String.valueOf(0), "NONE");
/*  62 */     m_typeNames.put(String.valueOf(1), "ATOM");
/*  63 */     m_typeNames.put(String.valueOf(2), "STRING");
/*  64 */     m_typeNames.put(String.valueOf(4), "INTEGER");
/*  65 */     m_typeNames.put(String.valueOf(8), "VARIABLE");
/*  66 */     m_typeNames.put(String.valueOf(16), "FACT");
/*  67 */     m_typeNames.put(String.valueOf(32), "FLOAT");
/*  68 */     m_typeNames.put(String.valueOf(64), "FUNCALL");
/*  69 */     m_typeNames.put(String.valueOf(512), "LIST");
/*  70 */     m_typeNames.put(String.valueOf(2048), "EXTERNAL_ADDRESS");
/*  71 */     m_typeNames.put(String.valueOf(4096), "BINDING");
/*  72 */     m_typeNames.put(String.valueOf(8192), "MULTIVARIABLE");
/*  73 */     m_typeNames.put(String.valueOf(16384), "SLOT");
/*  74 */     m_typeNames.put(String.valueOf(32768), "MULTISLOT");
/*  75 */     m_typeNames.put(String.valueOf(65536), "LONG");
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
/*     */   public static String getTypeName(int paramInt)
/*     */   {
/*  89 */     return (String)m_typeNames.get(String.valueOf(paramInt));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   static final int REMOVE = 1;
/*     */   
/*     */ 
/*     */ 
/*     */   static final int UPDATE = 2;
/*     */   
/*     */ 
/*     */ 
/*     */   static final int CLEAR = 3;
/*     */   
/*     */ 
/*     */ 
/*     */   public static final int PATTERN = -1;
/*     */   
/*     */ 
/*     */ 
/*     */   public static final int LOCAL = -2;
/*     */   
/*     */ 
/*     */ 
/*     */   public static final int GLOBAL = -3;
/*     */   
/*     */ 
/*     */ 
/*     */   static final int AND = 1;
/*     */   
/*     */ 
/*     */ 
/*     */   static final int OR = 2;
/*     */   
/*     */ 
/*     */ 
/*     */   static final String BACKCHAIN_PREFIX = "need-";
/*     */   
/*     */ 
/*     */ 
/*     */   static final String DEFAULT_SLOT_NAME = "__data";
/*     */   
/*     */ 
/*     */ 
/*     */   static final String ROOT_DEFTEMPLATE = "__fact";
/*     */   
/*     */ 
/* 138 */   static int s_gensymIdx = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static synchronized String gensym(String paramString)
/*     */   {
/* 147 */     String str = paramString + s_gensymIdx++;
/* 148 */     return str;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getProperty(String paramString)
/*     */   {
/*     */     try
/*     */     {
/* 160 */       return System.getProperty(paramString);
/*     */     }
/*     */     catch (SecurityException localSecurityException) {}
/*     */     
/* 164 */     return null;
/*     */   }
/*     */   
/*     */   static String scopeName(String paramString1, String paramString2)
/*     */   {
/* 169 */     StringBuffer localStringBuffer = new StringBuffer(paramString1);
/* 170 */     localStringBuffer.append("::");
/* 171 */     localStringBuffer.append(paramString2);
/* 172 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   static String getModuleFromName(String paramString, Rete paramRete) {
/* 176 */     int i = paramString.indexOf("::");
/* 177 */     if (i == -1) {
/* 178 */       return paramRete.getCurrentModule();
/*     */     }
/* 180 */     return paramString.substring(0, i);
/*     */   }
/*     */   
/*     */   static long time()
/*     */   {
/* 185 */     return System.currentTimeMillis();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\RU.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */