/*    */ package dramaman.runtime;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class StoryValueWME extends WME { private float value;
/*    */   
/*  7 */   private final void jdMethod_this() { this.value = 0.0F; }
/*    */   
/*  9 */   public StoryValueWME(float paramFloat) { jdMethod_this();this.value = paramFloat; }
/*    */   
/* 11 */   public StoryValueWME() { jdMethod_this(); }
/*    */   
/*    */   public synchronized float getValue() {
/* 14 */     return this.value;
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setValue(float paramFloat)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: goto +6 -> 6
/*    */     //   3: aload_3
/*    */     //   4: monitorexit
/*    */     //   5: athrow
/*    */     //   6: aload_0
/*    */     //   7: dup
/*    */     //   8: astore_3
/*    */     //   9: monitorenter
/*    */     //   10: aload_0
/*    */     //   11: getfield 12	dramaman/runtime/StoryValueWME:value	F
/*    */     //   14: fstore_2
/*    */     //   15: aload_0
/*    */     //   16: fload_1
/*    */     //   17: putfield 12	dramaman/runtime/StoryValueWME:value	F
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 18	dramaman/runtime/StoryValueWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 19
/*    */     //   28: new 20	java/lang/Float
/*    */     //   31: dup
/*    */     //   32: fload_2
/*    */     //   33: invokespecial 24	java/lang/Float:<init>	(F)V
/*    */     //   36: new 20	java/lang/Float
/*    */     //   39: dup
/*    */     //   40: fload_1
/*    */     //   41: invokespecial 24	java/lang/Float:<init>	(F)V
/*    */     //   44: invokevirtual 28	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   47: return
/*    */     // Line number table:
/*    */     //   Java source line #19	-> byte code offset #0
/*    */     //   Java source line #20	-> byte code offset #0
/*    */     //   Java source line #21	-> byte code offset #10
/*    */     //   Java source line #22	-> byte code offset #15
/*    */     //   Java source line #24	-> byte code offset #22
/*    */     //   Java source line #25	-> byte code offset #47
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	48	0	this	StoryValueWME
/*    */     //   0	48	1	paramFloat	float
/*    */     //   14	19	2	f	float
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryValueWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */