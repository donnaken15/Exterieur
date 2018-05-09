/*     */ package abl.runtime;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AblEvent
/*     */   extends EventObject
/*     */ {
/*     */   public static final int PRECONDITION_EXECUTION = 1;
/*     */   public static final int BEHAVIOR_EXECUTION = 2;
/*     */   public static final int BEHAVIOR_COMPLETION = 3;
/*     */   public static final int CONTEXT_CONDITION_FAILURE = 4;
/*     */   public static final int ACT_EXECUTION = 5;
/*     */   public static final int ACT_COMPLETION = 6;
/*     */   public static final int SUBGOAL_EXECUTION = 7;
/*     */   public static final int SUBGOAL_COMPLETION = 8;
/*     */   public static final int MENTAL_STEP_EXECUTION = 9;
/*     */   public static final int MENTAL_STEP_COMPLETION = 10;
/*     */   public static final int WAIT_STEP_COMPLETION = 11;
/*     */   public static final int FAILSTEP_EXECUTION = 12;
/*     */   public static final int FAILSTEP_COMPLETION = 13;
/*     */   public static final int SUCCEEDSTEP_EXECUTION = 14;
/*     */   public static final int SUCCEEDSTEP_COMPLETION = 15;
/*     */   public static final int STEP_SUSPENSION = 16;
/*     */   public static final int STEP_UNSUSPENSION = 17;
/*     */   public static final int SUCCESS_TEST_SUCCESS = 18;
/*     */   public static final int SPAWNGOAL_AT_ROOT = 19;
/*     */   public static final int INITIATE_NEGOTIATION = 20;
/*     */   public static final int COMPLETE_NEGOTIATION = 21;
/*     */   public static final int INITIATE_INTENTION = 22;
/*     */   public static final int COMMIT_TO_INTENTION = 23;
/*     */   public static final int PROCESS_INTENTION = 24;
/*     */   public static final int BEHAVIOR = 1;
/*     */   public static final int STEP = 2;
/*     */   public static final int NEGOTIATOR = 3;
/*     */   protected Object obj;
/*     */   protected int type;
/*     */   protected int nestLevel;
/*     */   protected long elapsedTime;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/* 123 */     this.nestLevel = 0;
/* 124 */     this.elapsedTime = -1;
/*     */   }
/*     */   
/*     */   public AblEvent(Object paramObject1, int paramInt, Object paramObject2) {
/* 128 */     super(paramObject1);jdMethod_this();
/* 129 */     this.type = paramInt;
/* 130 */     this.obj = paramObject2;
/*     */   }
/*     */   
/*     */   public AblEvent(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2)
/*     */   {
/* 135 */     super(paramObject1);jdMethod_this();
/* 136 */     this.type = paramInt1;
/* 137 */     this.obj = paramObject2;
/* 138 */     this.nestLevel = paramInt2;
/*     */   }
/*     */   
/* 141 */   public int getType() { return this.type; }
/*     */   
/*     */ 
/*     */   public int getSourceType()
/*     */   {
/* 146 */     if ((this.type == 1) || (this.type == 2) || (this.type == 3) || (this.type == 4))
/*     */     {
/*     */ 
/*     */ 
/* 150 */       return 1; }
/* 151 */     if ((this.type == 20) || (this.type == 21) || (this.type == 22) || (this.type == 23) || (this.type == 24))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 156 */       return 3;
/*     */     }
/* 158 */     return 2;
/*     */   }
/*     */   
/* 161 */   public Object getObject() { return this.obj; }
/*     */   
/* 163 */   public int getNestLevel() { return this.nestLevel; }
/*     */   
/* 165 */   public long getElapsedTime() { return this.elapsedTime; }
/*     */   
/*     */   void setElapsedTime(long paramLong) {
/* 168 */     this.elapsedTime = paramLong;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 172 */     return "[AblEvent: type =" + this.type + ']';
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\AblEvent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */