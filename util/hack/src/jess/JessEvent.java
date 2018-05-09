/*     */ package jess;
/*     */ 
/*     */ import java.util.EventObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JessEvent
/*     */   extends EventObject
/*     */ {
/*     */   public static final int DEFRULE = 1;
/*     */   public static final int DEFRULE_FIRED = 2;
/*     */   public static final int ACTIVATION = 4;
/*     */   public static final int DEFFACTS = 8;
/*     */   public static final int FACT = 16;
/*     */   public static final int DEFINSTANCE = 32;
/*     */   public static final int DEFTEMPLATE = 64;
/*     */   public static final int DEFCLASS = 128;
/*     */   public static final int DEFGLOBAL = 256;
/*     */   public static final int USERFUNCTION = 512;
/*     */   public static final int USERPACKAGE = 1024;
/*     */   public static final int CLEAR = 2048;
/*     */   public static final int RESET = 4096;
/*     */   public static final int RUN = 8192;
/*     */   public static final int HALT = 16384;
/*     */   public static final int RETE_TOKEN = 32768;
/*     */   public static final int RETE_TOKEN_LEFT = 32768;
/*     */   public static final int RETE_TOKEN_RIGHT = 65536;
/*     */   public static final int USERFUNCTION_CALLED = 524288;
/*     */   public static final int FOCUS = 1048576;
/*     */   public static final int MODIFIED = 1073741824;
/*     */   public static final int REMOVED = Integer.MIN_VALUE;
/*     */   Object m_obj;
/*     */   int m_type;
/*     */   
/*     */   public JessEvent(Object paramObject1, int paramInt, Object paramObject2)
/*     */   {
/*  95 */     super(paramObject1);
/*  96 */     this.m_type = paramInt;
/*  97 */     this.m_obj = paramObject2;
/*     */   }
/*     */   
/* 100 */   void reset(int paramInt, Object paramObject) { this.m_type = paramInt;this.m_obj = paramObject;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int getType()
/*     */   {
/* 107 */     return this.m_type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object getObject()
/*     */   {
/* 115 */     return this.m_obj;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 124 */     return "[JessEvent: type=" + this.m_type + ']';
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\JessEvent.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */