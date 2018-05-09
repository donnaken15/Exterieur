/*     */ package abl.runtime;
/*     */ 
/*     */ import abl.compiler.AblDebuggerConstants;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Set;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.MutableTreeNode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JointGoalStepDebug
/*     */   extends JointGoalStep
/*     */   implements DebuggableJointGoalStep, AblDebuggerConstants
/*     */ {
/*     */   private final byte debugLevel;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.JointGoalStepDebug;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   public JointGoalStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString, boolean paramBoolean8, byte paramByte)
/*     */   {
/*  26 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramString2, paramArrayOfString, paramBoolean8);
/*     */     
/*     */ 
/*     */ 
/*  30 */     this.debugLevel = paramByte;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JointGoalStepDebug(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, String paramString2, String[] paramArrayOfString, short paramShort3, boolean paramBoolean8, byte paramByte)
/*     */   {
/*  42 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramString2, paramArrayOfString, paramShort3, paramBoolean8);
/*     */     
/*     */ 
/*     */ 
/*  46 */     this.debugLevel = paramByte;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected final JointGoalNegotiator getNewJointGoalNegotiator(Hashtable paramHashtable)
/*     */   {
/*  53 */     return new JointGoalNegotiatorDebug(paramHashtable, this.debugLevel);
/*     */   }
/*     */   
/*     */   protected final JointGoalNegotiator getNewJointGoalNegotiator(Set paramSet)
/*     */   {
/*  58 */     return new JointGoalNegotiatorDebug(paramSet, this, this.debugLevel);
/*     */   }
/*     */   
/*     */   protected final JointGoalNegotiator getNewJointGoalNegotiator(Hashtable paramHashtable, int paramInt)
/*     */   {
/*  63 */     return new JointGoalNegotiatorDebug(paramHashtable, paramInt, this.debugLevel);
/*     */   }
/*     */   
/*     */   protected JointGoalNegotiator getNewJointGoalNegotiator(Set paramSet, boolean paramBoolean)
/*     */   {
/*  68 */     return new JointGoalNegotiatorDebug(paramSet, paramBoolean, this, this.debugLevel);
/*     */   }
/*     */   
/*     */ 
/*     */   public final void traceAblNegotiationEvent(int paramInt, JointGoalNegotiatorDebug.JointGoalNegotiationInfo paramJointGoalNegotiationInfo)
/*     */   {
/*  74 */     if ((!$noassert) && (this.debugLevel != 2)) throw new AssertionError();
/*  75 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(paramInt, this, paramJointGoalNegotiationInfo, getNestLevel());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   final void execute()
/*     */   {
/*  84 */     if (this.debugLevel == 2)
/*  85 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(7, this, null, getNestLevel());
/*  86 */     super.execute();
/*     */   }
/*     */   
/*     */   final void succeedStep()
/*     */   {
/*  91 */     if (this.debugLevel == 2)
/*  92 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(8, this, new Boolean(true), getNestLevel());
/*  93 */     super.succeedStep();
/*     */   }
/*     */   
/*     */   final void failStep()
/*     */   {
/*  98 */     if (this.debugLevel == 2)
/*  99 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(8, this, new Boolean(false), getNestLevel());
/* 100 */     super.failStep();
/*     */   }
/*     */   
/*     */   final boolean successTest()
/*     */   {
/* 105 */     boolean bool = super.successTest();
/* 106 */     if ((bool) && (this.debugLevel == 2)) {
/* 107 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(18, this, null, getNestLevel());
/*     */     }
/* 109 */     return bool;
/*     */   }
/*     */   
/*     */ 
/*     */   public final MutableTreeNode getTree()
/*     */   {
/* 115 */     DefaultMutableTreeNode localDefaultMutableTreeNode = new DefaultMutableTreeNode(this);
/* 116 */     if (this.child != null)
/*     */     {
/*     */ 
/* 119 */       localDefaultMutableTreeNode.add(((DebuggableBehavior)this.child).getTree());
/*     */     }
/* 121 */     return localDefaultMutableTreeNode;
/*     */   }
/*     */   
/*     */ 
/*     */   public final int getNestLevel()
/*     */   {
/* 127 */     return ((DebuggableBehavior)this.parent).getNestLevel() + 1;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalStepDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */