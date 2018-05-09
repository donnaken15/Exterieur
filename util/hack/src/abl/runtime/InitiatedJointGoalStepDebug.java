/*     */ package abl.runtime;
/*     */ 
/*     */ import abl.compiler.AblDebuggerConstants;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Set;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.MutableTreeNode;
/*     */ 
/*     */ public class InitiatedJointGoalStepDebug
/*     */   extends InitiatedJointGoalStep implements DebuggableJointGoalStep, AblDebuggerConstants
/*     */ {
/*     */   private final byte debugLevel;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.InitiatedJointGoalStepDebug;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   public InitiatedJointGoalStepDebug(Behavior paramBehavior, String paramString, Set paramSet, Object[] paramArrayOfObject, boolean paramBoolean, byte paramByte)
/*     */   {
/*  17 */     super(paramBehavior, paramString, paramSet, paramArrayOfObject, paramBoolean);
/*  18 */     this.debugLevel = paramByte;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected final JointGoalNegotiator getNewJointGoalNegotiator(Hashtable paramHashtable)
/*     */   {
/*  25 */     return new JointGoalNegotiatorDebug(paramHashtable, this.debugLevel);
/*     */   }
/*     */   
/*     */   protected final JointGoalNegotiator getNewJointGoalNegotiator(Set paramSet)
/*     */   {
/*  30 */     return new JointGoalNegotiatorDebug(paramSet, this, this.debugLevel);
/*     */   }
/*     */   
/*     */   protected final JointGoalNegotiator getNewJointGoalNegotiator(Hashtable paramHashtable, int paramInt)
/*     */   {
/*  35 */     return new JointGoalNegotiatorDebug(paramHashtable, paramInt, this.debugLevel);
/*     */   }
/*     */   
/*     */   protected JointGoalNegotiator getNewJointGoalNegotiator(Set paramSet, boolean paramBoolean)
/*     */   {
/*  40 */     return new JointGoalNegotiatorDebug(paramSet, paramBoolean, this, this.debugLevel);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public final void traceAblNegotiationEvent(int paramInt, JointGoalNegotiatorDebug.JointGoalNegotiationInfo paramJointGoalNegotiationInfo)
/*     */   {
/*  47 */     if ((!$noassert) && (this.debugLevel != 2)) throw new AssertionError();
/*  48 */     ((DebuggableBehavior)this.parent).traceAblExecutionEvent(paramInt, this, paramJointGoalNegotiationInfo, getNestLevel());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   final void execute()
/*     */   {
/*  57 */     if (this.debugLevel == 2)
/*  58 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(7, this, null, getNestLevel());
/*  59 */     super.execute();
/*     */   }
/*     */   
/*     */   final void succeedStep()
/*     */   {
/*  64 */     if (this.debugLevel == 2)
/*  65 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(8, this, new Boolean(true), getNestLevel());
/*  66 */     super.succeedStep();
/*     */   }
/*     */   
/*     */   final void failStep()
/*     */   {
/*  71 */     if (this.debugLevel == 2)
/*  72 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(8, this, new Boolean(false), getNestLevel());
/*  73 */     super.failStep();
/*     */   }
/*     */   
/*     */   final boolean successTest()
/*     */   {
/*  78 */     boolean bool = super.successTest();
/*  79 */     if ((bool) && (this.debugLevel == 2)) {
/*  80 */       ((DebuggableBehavior)this.parent).traceAblExecutionEvent(18, this, null, getNestLevel());
/*     */     }
/*  82 */     return bool;
/*     */   }
/*     */   
/*     */ 
/*     */   public final MutableTreeNode getTree()
/*     */   {
/*  88 */     DefaultMutableTreeNode localDefaultMutableTreeNode = new DefaultMutableTreeNode(this);
/*  89 */     if (this.child != null)
/*     */     {
/*     */ 
/*  92 */       localDefaultMutableTreeNode.add(((DebuggableBehavior)this.child).getTree());
/*     */     }
/*  94 */     return localDefaultMutableTreeNode;
/*     */   }
/*     */   
/*     */ 
/*     */   public final int getNestLevel()
/*     */   {
/* 100 */     return ((DebuggableBehavior)this.parent).getNestLevel() + 1;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\InitiatedJointGoalStepDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */