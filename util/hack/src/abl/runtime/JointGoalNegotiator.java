/*      */ package abl.runtime;
/*      */ 
/*      */ import debug.Trace;
/*      */ import java.io.PrintStream;
/*      */ import java.util.HashSet;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Iterator;
/*      */ import java.util.Set;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class JointGoalNegotiator
/*      */ {
/*   68 */   private static final boolean $noassert = Class.forName("[Labl.runtime.JointGoalNegotiator;").getComponentType().desiredAssertionStatus() ^ true; protected JointGoalStep escroedGoalStep; protected final Set teamMembers; protected Set negotiatingCommitSet; protected Hashtable runningCommitSet; protected JointGoalStep negotiatingGoal; protected final BehavingEntity receiver; protected int currentState; private static long uniqueEntryNegotiationID = 0L;
/*      */   static final int LAST_EXIT_INTENTION = 23;
/*      */   static final int UNSUSPEND = 23;
/*      */   static final int SUSPEND = 22;
/*      */   static final int REMOVE = 21;
/*      */   static final int FAIL = 20;
/*      */   static final int SUCCEED = 19;
/*      */   static final int FIRST_EXIT_INTENTION = 19;
/*      */   static final int LAST_ENTRY_INTENTION = 18;
/*      */   static final int REFUSE_ENTRY = 18;
/*      */   static final int ENTER = 17;
/*      */   static final int FIRST_ENTRY_INTENTION = 17;
/*      */   static final int LAST_STATE = 16;
/*      */   static final int COMMIT_TO_REMOVE = 16;
/*      */   static final int INTENTION_TO_REMOVE = 15;
/*      */   static final int COMMIT_TO_UNSUSPEND = 14;
/*      */   static final int INTENTION_TO_UNSUSPEND = 13;
/*      */   static final int SUSPENDED = 12;
/*      */   static final int COMMIT_TO_SUSPEND = 11;
/*      */   static final int INTENTION_TO_SUSPEND = 10;
/*      */   static final int COMMIT_TO_FAIL = 9;
/*      */   static final int INTENTION_TO_FAIL = 8;
/*      */   static final int COMMIT_TO_SUCCEED = 7;
/*      */   static final int WAIT_FOR_SUCCESS = 6;
/*      */   static final int INTENTION_TO_SUCCEED = 5;
/*      */   static final int RUNNING = 4;
/*      */   static final int COMMIT_TO_REFUSE_ENTRY = 3;
/*      */   static final int COMMIT_TO_ENTER = 2;
/*      */   static final int INTENTION_TO_REFUSE_ENTRY = 1;
/*      */   static final int INTENTION_TO_ENTER = 0;
/*      */   static final int START = -1;
/*      */   static final int FIRST_STATE = -1;
/*      */   static final int INVALID = -3;
/*      */   
/*      */   private final void jdMethod_this()
/*      */   {
/*   15 */     this.receiver = BehavingEntity.getBehavingEntity();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   59 */     this.runningCommitSet = new Hashtable();
/*      */     
/*      */ 
/*      */ 
/*   63 */     this.negotiatingCommitSet = new HashSet();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   72 */     this.escroedGoalStep = null;
/*      */   }
/*      */   
/*      */   private final boolean teamMembersAreBehavingEntities(Set paramSet) {
/*   76 */     Iterator localIterator = paramSet.iterator();
/*   77 */     while (localIterator.hasNext()) {
/*      */       try {
/*   79 */         BehavingEntity localBehavingEntity = (BehavingEntity)localIterator.next();
/*      */       } catch (ClassCastException localClassCastException) {
/*   81 */         return false;
/*      */       }
/*      */     }
/*   84 */     return true;
/*      */   }
/*      */   
/*      */   JointGoalNegotiator(Set paramSet, JointGoalStep paramJointGoalStep) {
/*   88 */     jdMethod_this();
/*   89 */     if ((!$noassert) && (!teamMembersAreBehavingEntities(paramSet))) { throw new AssertionError();
/*      */     }
/*   91 */     this.teamMembers = new HashSet(paramSet);
/*   92 */     this.currentState = -1;
/*   93 */     this.negotiatingGoal = paramJointGoalStep;
/*      */   }
/*      */   
/*      */   JointGoalNegotiator(Set paramSet, boolean paramBoolean, JointGoalStep paramJointGoalStep) {
/*   97 */     jdMethod_this();
/*   98 */     if ((!$noassert) && (!teamMembersAreBehavingEntities(paramSet))) { throw new AssertionError();
/*      */     }
/*  100 */     this.teamMembers = new HashSet(paramSet);
/*  101 */     this.currentState = -1;
/*  102 */     if (paramBoolean)
/*  103 */       uniqueEntryNegotiationID += 1L;
/*  104 */     this.negotiatingGoal = paramJointGoalStep;
/*      */   }
/*      */   
/*      */   JointGoalNegotiator(Hashtable paramHashtable) {
/*  108 */     jdMethod_this();
/*  109 */     this.teamMembers = new HashSet(paramHashtable.keySet());
/*  110 */     if ((!$noassert) && (!teamMembersAreBehavingEntities(this.teamMembers))) throw new AssertionError();
/*  111 */     this.runningCommitSet = new Hashtable(paramHashtable);
/*  112 */     this.currentState = -1;
/*  113 */     this.negotiatingGoal = ((JointGoalStep)this.runningCommitSet.get(this.receiver));
/*  114 */     if ((!$noassert) && (this.negotiatingGoal == null)) throw new AssertionError();
/*      */   }
/*      */   
/*      */   JointGoalNegotiator(Hashtable paramHashtable, int paramInt) {
/*  118 */     jdMethod_this();
/*  119 */     this.teamMembers = new HashSet(paramHashtable.keySet());
/*  120 */     if ((!$noassert) && (!teamMembersAreBehavingEntities(this.teamMembers))) throw new AssertionError();
/*  121 */     this.runningCommitSet = new Hashtable(paramHashtable);
/*  122 */     if ((!$noassert) && (!isLegalState(paramInt))) throw new AssertionError(Integer.toString(paramInt));
/*  123 */     this.currentState = paramInt;
/*  124 */     this.negotiatingGoal = ((JointGoalStep)this.runningCommitSet.get(this.receiver));
/*  125 */     if ((!$noassert) && (this.negotiatingGoal == null)) throw new AssertionError();
/*      */   }
/*      */   
/*      */   public static String formatIntention(int paramInt)
/*      */   {
/*  130 */     if ((!$noassert) && ((paramInt < 17) || (paramInt > 23))) throw new AssertionError();
/*  131 */     switch (paramInt) {
/*      */     case 17: 
/*  133 */       return "ENTER";
/*  134 */     case 18:  return "REFUSE_ENTRY";
/*  135 */     case 19:  return "SUCCEED";
/*  136 */     case 20:  return "FAIL";
/*  137 */     case 21:  return "REMOVE";
/*  138 */     case 22:  return "SUSPEND";
/*  139 */     case 23:  return "UNSUSPEND"; }
/*  140 */     return "NOT_INTENTION";
/*      */   }
/*      */   
/*      */ 
/*      */   public static String formatState(int paramInt)
/*      */   {
/*  146 */     if ((!$noassert) && ((paramInt < -1) || (paramInt > 16))) throw new AssertionError();
/*  147 */     switch (paramInt) {
/*  148 */     case -1:  return "START";
/*  149 */     case 0:  return "INTENTION_TO_ENTER";
/*  150 */     case 1:  return "INTENTION_TO_REFUSE_ENTRY";
/*  151 */     case 2:  return "COMMIT_TO_ENTER";
/*  152 */     case 3:  return "COMMIT_TO_REFUSE_ENTRY";
/*  153 */     case 4:  return "RUNNING";
/*  154 */     case 5:  return "INTENTION_TO_SUCCEED";
/*  155 */     case 6:  return "WAIT_FOR_SUCCESS";
/*  156 */     case 7:  return "COMMIT_TO_SUCCEED";
/*  157 */     case 8:  return "INTENTION_TO_FAIL";
/*  158 */     case 9:  return "COMMIT_TO_FAIL";
/*  159 */     case 10:  return "INTENTION_TO_SUSPEND";
/*  160 */     case 11:  return "COMMIT_TO_SUSPEND";
/*  161 */     case 12:  return "SUSPENDED";
/*  162 */     case 13:  return "INTENTION_TO_UNSUSPEND";
/*  163 */     case 14:  return "COMMIT_TO_UNSUSPEND";
/*  164 */     case 15:  return "INTENTION_TO_REMOVE";
/*  165 */     case 16:  return "COMMIT_TO_REMOVE"; }
/*  166 */     return "INVALID";
/*      */   }
/*      */   
/*      */ 
/*  170 */   Long getUniqueEntryNegotiationID() { return new Long(uniqueEntryNegotiationID); }
/*      */   
/*  172 */   synchronized int getState() { return this.currentState; }
/*      */   
/*      */   protected synchronized void setState(int paramInt)
/*      */   {
/*  176 */     if ((!$noassert) && ((paramInt < -1) || (paramInt > 16))) throw new AssertionError();
/*  177 */     this.currentState = paramInt;
/*      */     
/*  179 */     if ((paramInt == 2) || (paramInt == 3) || (paramInt == 7) || (paramInt == 9) || (paramInt == 11) || (paramInt == 14) || (paramInt == 16))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  188 */       BehavingEntity.getBehavingEntity().jointGoalNegotiatorCommitted(); }
/*      */   }
/*      */   
/*      */   Set getTeamMembers() {
/*  192 */     return new HashSet(this.teamMembers);
/*      */   }
/*      */   
/*      */   void setCommitSet(Hashtable paramHashtable)
/*      */   {
/*  197 */     this.runningCommitSet = new Hashtable(paramHashtable);
/*  198 */     this.negotiatingGoal = ((JointGoalStep)this.runningCommitSet.get(this.receiver));
/*  199 */     if ((!$noassert) && (this.negotiatingGoal == null)) throw new AssertionError();
/*      */   }
/*      */   
/*  202 */   Hashtable getCommitSet() { return new Hashtable(this.runningCommitSet); }
/*      */   
/*      */ 
/*      */   static boolean isLegalState(int paramInt)
/*      */   {
/*  207 */     if ((paramInt >= -1) && (paramInt <= 16))
/*      */     {
/*  209 */       return true;
/*      */     }
/*  211 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final int convertCommitStateToIntention(int paramInt)
/*      */   {
/*  245 */     switch (paramInt) {
/*      */     case 2: 
/*  247 */       return 17;
/*      */     case 3: 
/*  249 */       return 18;
/*      */     case 7: 
/*  251 */       return 19;
/*      */     case 9: 
/*  253 */       return 20;
/*      */     case 11: 
/*      */     case 12: 
/*  256 */       return 22;
/*      */     case 4: 
/*      */     case 14: 
/*  259 */       return 23;
/*      */     case 16: 
/*  261 */       return 21;
/*      */     }
/*  263 */     return 24;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Hashtable negotiateEntry(Object[] paramArrayOfObject, JointGoalStep paramJointGoalStep)
/*      */   {
/*  274 */     Trace.ablTrace("Negotiating entry for " + paramJointGoalStep + ", teamNeededForSuccess = " + paramJointGoalStep.getTeamNeededForSuccess());
/*      */     
/*  276 */     if (getState() != -1) {
/*  277 */       throw new UnexpectedStateError(getState());
/*      */     }
/*      */     
/*  280 */     setState(0);
/*  281 */     Long localLong = new Long(uniqueEntryNegotiationID);
/*  282 */     this.escroedGoalStep = paramJointGoalStep;
/*  283 */     initiateNegotiationAction(paramJointGoalStep, 17);
/*      */     
/*  285 */     this.runningCommitSet.put(BehavingEntity.getBehavingEntity(), paramJointGoalStep);
/*      */     
/*  287 */     broadcastIntentionToEnter(localLong, paramArrayOfObject, paramJointGoalStep.getTeamNeededForSuccess(), paramJointGoalStep);
/*      */     
/*      */ 
/*  290 */     while ((getState() != 2) && (getState() != 3))
/*      */     {
/*  292 */       ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */     }
/*      */     
/*      */ 
/*  296 */     Trace.ablTrace("Entry negotiated");
/*      */     
/*  298 */     if (getState() == 2) {
/*  299 */       completeNegotiationAction(paramJointGoalStep, 17);
/*      */     } else {
/*  301 */       completeNegotiationAction(paramJointGoalStep, 18);
/*      */     }
/*      */     
/*  304 */     if (getState() == 2) {
/*  305 */       setState(4);
/*  306 */       return getCommitSet();
/*      */     }
/*  308 */     if (getState() == 3) {
/*  309 */       return null;
/*      */     }
/*      */     
/*  312 */     throw new UnexpectedStateError(getState());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void processIntentionToEnter(Long paramLong, BehavingEntity paramBehavingEntity, Object[] paramArrayOfObject, boolean paramBoolean, Set paramSet, JointGoalStep paramJointGoalStep1, JointGoalStep paramJointGoalStep2)
/*      */   {
/*  320 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*      */     
/*  322 */     Trace.ablTrace("Process intention to enter in " + localBehavingEntity + " for goal " + paramJointGoalStep1);
/*      */     
/*  324 */     processIntentionAction(paramBehavingEntity, paramJointGoalStep1, 17);
/*      */     
/*  326 */     if (getState() == -1)
/*      */     {
/*      */ 
/*      */ 
/*  330 */       Behavior localBehavior = BehavingEntity.getBehavingEntity().chooseJointBehavior(paramArrayOfObject, new HashSet(), paramJointGoalStep2, paramSet);
/*  331 */       if (localBehavior != null)
/*      */       {
/*      */ 
/*  334 */         setState(0);
/*  335 */         initiateIntentionAction(paramBehavingEntity, paramJointGoalStep2, 17);
/*      */         
/*  337 */         this.runningCommitSet.put(paramBehavingEntity, paramJointGoalStep1);
/*  338 */         this.runningCommitSet.put(localBehavingEntity, paramJointGoalStep2);
/*      */         
/*  340 */         broadcastIntentionToEnter(paramLong, paramArrayOfObject, paramJointGoalStep2.getTeamNeededForSuccess(), paramJointGoalStep2);
/*      */         
/*      */ 
/*      */ 
/*  344 */         if (this.runningCommitSet.keySet().equals(paramSet))
/*      */         {
/*      */ 
/*      */ 
/*  348 */           setState(2);
/*  349 */           commitToIntentionAction(paramJointGoalStep2, 17);
/*  350 */           localBehavingEntity.terminateEntryNegotiation(paramLong);
/*      */           
/*      */ 
/*  353 */           paramJointGoalStep2.resetNegotiator(this.runningCommitSet, 4);
/*  354 */           localBehavingEntity.getRootCollectionBehavior().addChild(paramJointGoalStep2);
/*  355 */           paramJointGoalStep2.addChild(localBehavior);
/*  356 */           paramJointGoalStep2.executeBookkeeping();
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*  361 */           while ((getState() != 2) && (getState() != 3))
/*      */           {
/*  363 */             ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */           }
/*  365 */           commitToIntentionAction(paramJointGoalStep2, convertCommitStateToIntention(getState()));
/*  366 */           localBehavingEntity.terminateEntryNegotiation(paramLong);
/*  367 */           if (getState() == 2)
/*      */           {
/*      */ 
/*  370 */             paramJointGoalStep2.resetNegotiator(this.runningCommitSet, 4);
/*  371 */             localBehavingEntity.getRootCollectionBehavior().addChild(paramJointGoalStep2);
/*  372 */             paramJointGoalStep2.addChild(localBehavior);
/*  373 */             paramJointGoalStep2.executeBookkeeping();
/*      */           }
/*  375 */           else if (getState() == 3) {
/*  376 */             paramJointGoalStep2 = null;
/*      */           }
/*      */           else {
/*  379 */             throw new UnexpectedStateError(getState());
/*      */           }
/*      */         }
/*      */       }
/*      */       else {
/*  384 */         setState(1);
/*  385 */         initiateIntentionAction(null, paramJointGoalStep2, 18);
/*  386 */         this.runningCommitSet.put(localBehavingEntity, new Integer(0));
/*      */         
/*      */ 
/*  389 */         broadcastIntentionToRefuseEntry(paramLong);
/*  390 */         while (getState() != 3) {
/*  391 */           ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */         }
/*  393 */         commitToIntentionAction(paramJointGoalStep2, 18);
/*  394 */         localBehavingEntity.terminateEntryNegotiation(paramLong);
/*  395 */         paramJointGoalStep2 = null;
/*      */       }
/*      */       
/*      */     }
/*  399 */     else if (getState() == 0)
/*      */     {
/*      */ 
/*  402 */       if (this.runningCommitSet.get(paramBehavingEntity) == null) {
/*  403 */         this.runningCommitSet.put(paramBehavingEntity, paramJointGoalStep1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  408 */       if (this.runningCommitSet.keySet().equals(paramSet)) {
/*  409 */         setState(2);
/*      */       }
/*  411 */     } else if (getState() == 1)
/*      */     {
/*      */ 
/*  414 */       this.runningCommitSet.remove(paramBehavingEntity);
/*      */       
/*      */ 
/*  417 */       broadcastIntentionToRefuseEntry(paramLong);
/*      */     }
/*      */     else {
/*  420 */       throw new UnexpectedStateError(getState());
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void processIntentionToRefuseEntry(Long paramLong, BehavingEntity paramBehavingEntity)
/*      */   {
/*  427 */     processIntentionAction(paramBehavingEntity, this.escroedGoalStep, 18);
/*      */     
/*  429 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  434 */     if (getState() == -1)
/*      */     {
/*      */ 
/*      */ 
/*  438 */       initiateIntentionAction(paramBehavingEntity, null, 18);
/*      */       
/*  440 */       setState(1);
/*  441 */       this.runningCommitSet.put(localBehavingEntity, new Integer(0));
/*  442 */       this.runningCommitSet.put(paramBehavingEntity, new Integer(0));
/*  443 */       broadcastIntentionToRefuseEntry(paramLong);
/*      */       
/*      */ 
/*      */ 
/*  447 */       if (this.runningCommitSet.keySet().equals(this.teamMembers))
/*      */       {
/*  449 */         setState(3);
/*      */         
/*  451 */         commitToIntentionAction(this.escroedGoalStep, 18);
/*  452 */         BehavingEntity.getBehavingEntity().terminateEntryNegotiation(paramLong);
/*      */       }
/*      */       else
/*      */       {
/*  456 */         while (getState() != 3) {
/*  457 */           ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */         }
/*  459 */         commitToIntentionAction(this.escroedGoalStep, 18);
/*  460 */         BehavingEntity.getBehavingEntity().terminateEntryNegotiation(paramLong);
/*      */       }
/*      */     }
/*  463 */     else if (getState() == 0)
/*      */     {
/*      */ 
/*      */ 
/*  467 */       setState(1);
/*      */       
/*  469 */       initiateIntentionAction(null, this.escroedGoalStep, 18);
/*  470 */       this.runningCommitSet = new Hashtable();
/*  471 */       this.runningCommitSet.put(localBehavingEntity, new Integer(0));
/*  472 */       this.runningCommitSet.put(paramBehavingEntity, new Integer(0));
/*  473 */       broadcastIntentionToRefuseEntry(paramLong);
/*      */       
/*  475 */       if (this.runningCommitSet.keySet().equals(this.teamMembers))
/*      */       {
/*  477 */         setState(3);
/*      */         
/*  479 */         commitToIntentionAction(null, 18);
/*  480 */         BehavingEntity.getBehavingEntity().terminateEntryNegotiation(paramLong);
/*      */       }
/*      */       else
/*      */       {
/*  484 */         while (getState() != 3) {
/*  485 */           ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */         }
/*  487 */         commitToIntentionAction(this.escroedGoalStep, 18);
/*  488 */         BehavingEntity.getBehavingEntity().terminateEntryNegotiation(paramLong);
/*      */       }
/*      */       
/*      */     }
/*  492 */     else if (getState() == 1)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*  497 */       if (this.runningCommitSet.get(paramBehavingEntity) == null) {
/*  498 */         this.runningCommitSet.put(paramBehavingEntity, new Integer(0));
/*      */       }
/*      */       
/*  501 */       if (this.runningCommitSet.keySet().equals(this.teamMembers))
/*      */       {
/*  503 */         setState(3);
/*      */       }
/*      */     }
/*      */     else {
/*  507 */       throw new UnexpectedStateError(getState());
/*      */     }
/*      */   }
/*      */   
/*      */   private final boolean initiateSuccessNegotiation() {
/*  512 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*  513 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*  515 */     initiateNegotiationAction(localJointGoalStep, 19);
/*      */     
/*  517 */     setState(5);
/*      */     
/*      */ 
/*  520 */     this.negotiatingCommitSet.clear();
/*  521 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/*  523 */     broadcastIntentionToExit(19);
/*      */     
/*      */ 
/*  526 */     while ((getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */     {
/*      */ 
/*  529 */       ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */     }
/*  531 */     completeNegotiationAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/*      */     
/*  533 */     if (getState() == 7) {
/*  534 */       return true;
/*      */     }
/*  536 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean negotiateSuccess()
/*      */   {
/*  544 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(BehavingEntity.getBehavingEntity());
/*      */     
/*      */ 
/*  547 */     Trace.ablTrace("Initiating success in state " + getState());
/*      */     
/*      */ 
/*      */ 
/*  551 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 0: 
/*      */     case 1: 
/*      */     case 2: 
/*  557 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  562 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/*  563 */       if (getState() == 4)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  569 */         localJointGoalStep.removeChild(true);
/*  570 */         return initiateSuccessNegotiation();
/*      */       }
/*  572 */       if (getState() == 3) {
/*  573 */         return false;
/*      */       }
/*  575 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/*  588 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/*      */     case 5: 
/*      */     case 8: 
/*      */     case 15: 
/*  603 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 10: 
/*      */     case 11: 
/*      */     case 12: 
/*      */     case 13: 
/*      */     case 14: 
/*  620 */       return initiateSuccessNegotiation();
/*      */     
/*      */ 
/*      */     case 6: 
/*  624 */       initiateNegotiationAction(localJointGoalStep, 19);
/*      */       
/*  626 */       setState(5);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  631 */       while ((getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*  634 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/*  636 */       completeNegotiationAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/*      */       
/*  638 */       if (getState() == 7) {
/*  639 */         return true;
/*      */       }
/*  641 */       return false;
/*      */     }
/*      */     
/*      */     
/*  645 */     throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void initiateIntentionToSucceed(BehavingEntity paramBehavingEntity)
/*      */   {
/*  654 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*  655 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*  657 */     Trace.ablTrace("Initiating intention to succeed on " + localBehavingEntity);
/*  658 */     Trace.ablTrace("Goal to succeed " + localJointGoalStep + ", teamNeededForSuccess = " + localJointGoalStep.getTeamNeededForSuccess());
/*      */     
/*      */ 
/*  661 */     setState(5);
/*  662 */     initiateIntentionAction(paramBehavingEntity, localJointGoalStep, 19);
/*      */     
/*      */ 
/*  665 */     this.negotiatingCommitSet.clear();
/*  666 */     this.negotiatingCommitSet.add(paramBehavingEntity);
/*  667 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  674 */     if (localJointGoalStep.getTeamNeededForSuccess())
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*  679 */       Trace.ablTrace("waiting for success in " + localJointGoalStep);
/*      */       
/*  681 */       setState(6);
/*  682 */       while ((getState() != 5) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*  686 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/*  688 */       Trace.ablTrace("goal succeeded: " + localJointGoalStep);
/*      */     }
/*      */     
/*  691 */     if (getState() == 5)
/*      */     {
/*      */ 
/*  694 */       JointGoalStep.blockOnSubtreeNegotiation(localJointGoalStep.freezeSubtreeAndNegotiateRemovalEntry());
/*      */       
/*  696 */       broadcastIntentionToExit(19);
/*      */       
/*      */ 
/*      */ 
/*  700 */       if (this.negotiatingCommitSet.equals(this.teamMembers))
/*      */       {
/*  702 */         setState(7);
/*  703 */         commitToIntentionAction(localJointGoalStep, 19);
/*  704 */         localJointGoalStep.succeedStep();
/*      */       }
/*      */       else
/*      */       {
/*  708 */         while ((getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */         {
/*      */ 
/*  711 */           ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */         }
/*  713 */         commitToIntentionAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/*      */         
/*  715 */         if (getState() == 7) {
/*  716 */           localJointGoalStep.succeedStep();
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void processIntentionToSucceed(BehavingEntity paramBehavingEntity)
/*      */   {
/*  725 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*  726 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*  728 */     processIntentionAction(paramBehavingEntity, localJointGoalStep, 19);
/*      */     
/*  730 */     switch (getState()) {
/*      */     case -1: 
/*      */     case 1: 
/*      */     case 3: 
/*  734 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 0: 
/*      */     case 2: 
/*  741 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  746 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/*  747 */       switch (getState()) {
/*      */       case 4: 
/*  749 */         initiateIntentionToSucceed(paramBehavingEntity);
/*  750 */         break;
/*      */       
/*      */ 
/*      */       case 7: 
/*      */       case 9: 
/*      */       case 16: 
/*      */         break;
/*      */       
/*      */ 
/*      */       case 3: 
/*  760 */         throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */       }
/*  762 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 10: 
/*      */     case 11: 
/*      */     case 12: 
/*      */     case 13: 
/*      */     case 14: 
/*  779 */       initiateIntentionToSucceed(paramBehavingEntity);
/*  780 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15: 
/*      */       
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5: 
/*      */     case 6: 
/*  793 */       this.negotiatingCommitSet.add(paramBehavingEntity);
/*  794 */       if (this.negotiatingCommitSet.equals(this.teamMembers))
/*  795 */         setState(7);
/*  796 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/*  806 */       throw new MessageReceivedAfterCommitError(19, getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8: 
/*  812 */       this.negotiatingCommitSet.remove(paramBehavingEntity);
/*  813 */       break;
/*      */     default: 
/*  815 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     }
/*      */   }
/*      */   
/*      */   private final void initiateFailureNegotiation()
/*      */   {
/*  821 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*  822 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*  824 */     initiateNegotiationAction(localJointGoalStep, 20);
/*      */     
/*  826 */     setState(8);
/*  827 */     this.negotiatingCommitSet.clear();
/*  828 */     this.negotiatingCommitSet.add(BehavingEntity.getBehavingEntity());
/*      */     
/*  830 */     broadcastIntentionToExit(20);
/*      */     
/*      */ 
/*  833 */     while (getState() != 9) {
/*  834 */       ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */     }
/*  836 */     completeNegotiationAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean negotiateFailure()
/*      */   {
/*  849 */     Trace.ablTrace("Negotiating failure");
/*      */     
/*  851 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 0: 
/*      */     case 1: 
/*      */     case 2: 
/*  857 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  862 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/*  863 */       if (getState() == 4)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  869 */         this.negotiatingGoal.removeChild(true);
/*  870 */         initiateFailureNegotiation();
/*  871 */         return true;
/*      */       }
/*  873 */       if (getState() == 3) {
/*  874 */         return false;
/*      */       }
/*  876 */       throw new UnexpectedStateError(getState(), this.negotiatingGoal);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/*  889 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/*      */     case 8: 
/*      */     case 15: 
/*  900 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 5: 
/*      */     case 6: 
/*      */     case 10: 
/*      */     case 11: 
/*      */     case 12: 
/*      */     case 13: 
/*      */     case 14: 
/*  921 */       initiateFailureNegotiation();
/*  922 */       return true;
/*      */     }
/*      */     
/*      */     
/*  926 */     throw new UnexpectedStateError(getState(), this.negotiatingGoal);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void initiateIntentionToFail(BehavingEntity paramBehavingEntity)
/*      */   {
/*  935 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*  936 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*  938 */     setState(8);
/*  939 */     initiateIntentionAction(paramBehavingEntity, localJointGoalStep, 20);
/*      */     
/*      */ 
/*  942 */     this.negotiatingCommitSet.clear();
/*  943 */     this.negotiatingCommitSet.add(paramBehavingEntity);
/*  944 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/*  946 */     JointGoalStep.blockOnSubtreeNegotiation(localJointGoalStep.freezeSubtreeAndNegotiateRemovalEntry());
/*      */     
/*  948 */     broadcastIntentionToExit(20);
/*      */     
/*      */ 
/*      */ 
/*  952 */     if (this.negotiatingCommitSet.equals(this.teamMembers))
/*      */     {
/*  954 */       setState(9);
/*  955 */       commitToIntentionAction(localJointGoalStep, 20);
/*  956 */       ((JointGoalStep)this.runningCommitSet.get(localBehavingEntity)).failStep();
/*      */     }
/*      */     else
/*      */     {
/*  960 */       while (getState() != 9) {
/*  961 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/*  963 */       commitToIntentionAction(localJointGoalStep, 20);
/*  964 */       ((JointGoalStep)this.runningCommitSet.get(localBehavingEntity)).failStep();
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void processIntentionToFail(BehavingEntity paramBehavingEntity)
/*      */   {
/*  971 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/*  972 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*  974 */     processIntentionAction(paramBehavingEntity, localJointGoalStep, 20);
/*      */     
/*  976 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 1: 
/*      */     case 3: 
/*  981 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 0: 
/*      */     case 2: 
/*  988 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  993 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/*  994 */       if (getState() == 4) {
/*  995 */         initiateIntentionToFail(paramBehavingEntity);
/*      */       } else
/*  997 */         throw new UnexpectedStateError(getState(), localJointGoalStep);
/*  998 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/* 1008 */       throw new MessageReceivedAfterCommitError(20, getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 5: 
/*      */     case 6: 
/*      */     case 10: 
/*      */     case 11: 
/*      */     case 12: 
/*      */     case 13: 
/*      */     case 14: 
/* 1031 */       initiateIntentionToFail(paramBehavingEntity);
/* 1032 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 15: 
/*      */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8: 
/* 1043 */       this.negotiatingCommitSet.add(paramBehavingEntity);
/* 1044 */       if (this.negotiatingCommitSet.equals(this.teamMembers))
/* 1045 */         setState(9);
/* 1046 */       break;
/*      */     default: 
/* 1048 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     }
/*      */     
/*      */   }
/*      */   
/*      */ 
/*      */   private final boolean initiateSuspendNegotiation()
/*      */   {
/* 1056 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1057 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/* 1059 */     initiateNegotiationAction(localJointGoalStep, 22);
/*      */     
/* 1061 */     setState(10);
/* 1062 */     this.negotiatingCommitSet.clear();
/* 1063 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/* 1065 */     broadcastIntentionToExit(22);
/*      */     
/*      */ 
/* 1068 */     while ((getState() != 16) && (getState() != 9) && (getState() != 7) && (getState() != 11))
/*      */     {
/*      */ 
/*      */ 
/* 1072 */       ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */     }
/* 1074 */     completeNegotiationAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/* 1075 */     if (getState() == 11) {
/* 1076 */       return true;
/*      */     }
/*      */     
/* 1079 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean negotiateSuspend()
/*      */   {
/* 1087 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(BehavingEntity.getBehavingEntity());
/*      */     
/*      */ 
/* 1090 */     Trace.ablTrace("Initiating suspend in state " + getState());
/*      */     
/*      */ 
/*      */ 
/* 1094 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 0: 
/*      */     case 1: 
/*      */     case 2: 
/* 1100 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1105 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1106 */       if (getState() == 4)
/* 1107 */         return initiateSuspendNegotiation();
/* 1108 */       if (getState() == 3) {
/* 1109 */         return false;
/*      */       }
/* 1111 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/* 1124 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/*      */     case 5: 
/*      */     case 8: 
/*      */     case 10: 
/*      */     case 12: 
/*      */     case 15: 
/* 1140 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 6: 
/* 1146 */       return initiateSuspendNegotiation();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11: 
/*      */     case 13: 
/*      */     case 14: 
/* 1158 */       while ((getState() != 7) && (getState() != 9) && (getState() != 16) && (getState() != 4) && (getState() != 12))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1163 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/* 1165 */       if ((getState() == 4) || (getState() == 12)) {
/* 1166 */         return initiateSuspendNegotiation();
/*      */       }
/* 1168 */       return false;
/*      */     }
/*      */     
/*      */     
/* 1172 */     throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void initiateIntentionToSuspend(BehavingEntity paramBehavingEntity)
/*      */   {
/* 1181 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1182 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*      */ 
/* 1185 */     initiateIntentionAction(paramBehavingEntity, localJointGoalStep, 22);
/* 1186 */     setState(10);
/*      */     
/*      */ 
/* 1189 */     this.negotiatingCommitSet.clear();
/* 1190 */     this.negotiatingCommitSet.add(paramBehavingEntity);
/* 1191 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/*      */ 
/* 1194 */     JointGoalStep.blockOnSubtreeNegotiation(localJointGoalStep.negotiateSuspensionOfSubtreeEntry());
/* 1195 */     broadcastIntentionToExit(22);
/*      */     
/*      */ 
/*      */ 
/* 1199 */     if (this.negotiatingCommitSet.equals(this.teamMembers))
/*      */     {
/* 1201 */       commitToIntentionAction(localJointGoalStep, 22);
/* 1202 */       setState(12);
/* 1203 */       localJointGoalStep.jointSuspend();
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 1208 */       while ((getState() != 7) && (getState() != 9) && (getState() != 16) && (getState() != 11))
/*      */       {
/*      */ 
/*      */ 
/* 1212 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/* 1214 */       commitToIntentionAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/* 1215 */       if (getState() == 11) {
/* 1216 */         localJointGoalStep.jointSuspend();
/* 1217 */         setState(12);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void processIntentionToSuspend(BehavingEntity paramBehavingEntity)
/*      */   {
/* 1227 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1228 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/* 1230 */     processIntentionAction(paramBehavingEntity, localJointGoalStep, 22);
/*      */     
/* 1232 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 1: 
/*      */     case 3: 
/* 1237 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 0: 
/*      */     case 2: 
/* 1244 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1249 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1250 */       if (getState() == 4) {
/* 1251 */         initiateIntentionToSuspend(paramBehavingEntity);
/*      */       } else
/* 1253 */         throw new UnexpectedStateError(getState(), localJointGoalStep);
/* 1254 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/* 1264 */       throw new MessageReceivedAfterCommitError(20, getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 6: 
/*      */     case 12: 
/* 1273 */       initiateIntentionToSuspend(paramBehavingEntity);
/* 1274 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 13: 
/* 1279 */       HashSet localHashSet = new HashSet(this.negotiatingCommitSet);
/* 1280 */       initiateIntentionToSuspend(paramBehavingEntity);
/*      */       
/*      */ 
/* 1283 */       while ((getState() != 4) && (getState() != 7) && (getState() != 9) && (getState() != 16) && (getState() != 12))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1288 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/* 1290 */       if ((getState() == 4) || (getState() == 12))
/*      */       {
/* 1292 */         setState(13);
/* 1293 */         this.negotiatingCommitSet = localHashSet;
/*      */       }
/* 1295 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11: 
/*      */     case 14: 
/* 1304 */       while ((getState() != 4) && (getState() != 7) && (getState() != 9) && (getState() != 16) && (getState() != 12))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1309 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1310 */       if ((getState() == 4) || (getState() == 12)) {
/* 1311 */         initiateIntentionToSuspend(paramBehavingEntity);
/*      */       }
/* 1313 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5: 
/*      */     case 8: 
/*      */     case 15: 
/* 1322 */       this.negotiatingCommitSet.remove(paramBehavingEntity);
/* 1323 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 10: 
/* 1328 */       this.negotiatingCommitSet.add(paramBehavingEntity);
/* 1329 */       if (this.negotiatingCommitSet.equals(this.teamMembers))
/* 1330 */         setState(11);
/* 1331 */       break;
/*      */     
/*      */     default: 
/* 1334 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     }
/*      */     
/*      */   }
/*      */   
/*      */ 
/*      */   private final boolean initiateUnsuspendNegotiation()
/*      */   {
/* 1342 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1343 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/* 1345 */     initiateNegotiationAction(localJointGoalStep, 23);
/*      */     
/* 1347 */     setState(13);
/* 1348 */     this.negotiatingCommitSet.clear();
/* 1349 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/* 1351 */     broadcastIntentionToExit(23);
/*      */     
/*      */ 
/* 1354 */     while ((getState() != 16) && (getState() != 9) && (getState() != 7) && (getState() != 14))
/*      */     {
/*      */ 
/*      */ 
/* 1358 */       ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */     }
/* 1360 */     completeNegotiationAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/* 1361 */     if (getState() == 14) {
/* 1362 */       return true;
/*      */     }
/*      */     
/* 1365 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean negotiateUnsuspend()
/*      */   {
/* 1378 */     Trace.ablTrace("Initiating unsuspend in state " + getState());
/*      */     
/* 1380 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 0: 
/*      */     case 1: 
/*      */     case 2: 
/* 1386 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1391 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1392 */       if (getState() == 4)
/* 1393 */         return initiateUnsuspendNegotiation();
/* 1394 */       if (getState() == 3) {
/* 1395 */         return false;
/*      */       }
/* 1397 */       throw new UnexpectedStateError(getState(), this.negotiatingGoal);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/* 1410 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */     case 11: 
/*      */     case 14: 
/* 1416 */       while ((getState() != 16) && (getState() != 9) && (getState() != 7) && (getState() != 12) && (getState() != 4))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1421 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/* 1423 */       if ((getState() == 12) || (getState() == 4)) {
/* 1424 */         return initiateUnsuspendNegotiation();
/*      */       }
/* 1426 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 10: 
/*      */     case 13: 
/* 1435 */       while ((getState() != 16) && (getState() != 9) && (getState() != 7) && (getState() != 12) && (getState() != 4))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1440 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/* 1442 */       if (getState() == 12) {
/* 1443 */         return initiateUnsuspendNegotiation();
/*      */       }
/* 1445 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/*      */     case 4: 
/*      */     case 5: 
/*      */     case 8: 
/*      */     case 15: 
/* 1459 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */     case 12: 
/* 1464 */       return initiateUnsuspendNegotiation();
/*      */     }
/*      */     
/*      */     
/* 1468 */     throw new UnexpectedStateError(getState(), this.negotiatingGoal);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private final void initiateIntentionToUnsuspend(BehavingEntity paramBehavingEntity)
/*      */   {
/* 1475 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1476 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*      */ 
/* 1479 */     initiateIntentionAction(paramBehavingEntity, localJointGoalStep, 23);
/* 1480 */     setState(13);
/*      */     
/*      */ 
/* 1483 */     this.negotiatingCommitSet.clear();
/* 1484 */     this.negotiatingCommitSet.add(paramBehavingEntity);
/* 1485 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/* 1487 */     broadcastIntentionToExit(23);
/*      */     
/*      */ 
/*      */ 
/* 1491 */     if (this.negotiatingCommitSet.equals(this.teamMembers))
/*      */     {
/* 1493 */       commitToIntentionAction(localJointGoalStep, 23);
/* 1494 */       localJointGoalStep.jointUnsuspendEntry();
/* 1495 */       if (localJointGoalStep.isSuspended()) {
/* 1496 */         setState(12);
/*      */       } else {
/* 1498 */         setState(4);
/*      */       }
/*      */     }
/*      */     else
/*      */     {
/* 1503 */       while ((getState() != 7) && (getState() != 9) && (getState() != 16) && (getState() != 14))
/*      */       {
/*      */ 
/*      */ 
/* 1507 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/* 1509 */       commitToIntentionAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/* 1510 */       if (getState() == 14) {
/* 1511 */         localJointGoalStep.jointUnsuspendEntry();
/* 1512 */         if (localJointGoalStep.isSuspended()) {
/* 1513 */           setState(12);
/*      */         } else {
/* 1515 */           setState(4);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void processIntentionToUnsuspend(BehavingEntity paramBehavingEntity)
/*      */   {
/* 1526 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1527 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/* 1529 */     processIntentionAction(paramBehavingEntity, localJointGoalStep, 23);
/*      */     
/* 1531 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 1: 
/*      */     case 3: 
/* 1536 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 0: 
/*      */     case 2: 
/* 1543 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1548 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1549 */       if (getState() == 4) {
/* 1550 */         initiateIntentionToUnsuspend(paramBehavingEntity);
/*      */       } else
/* 1552 */         throw new UnexpectedStateError(getState(), localJointGoalStep);
/* 1553 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/* 1563 */       throw new MessageReceivedAfterCommitError(20, getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */     case 12: 
/* 1568 */       initiateIntentionToUnsuspend(paramBehavingEntity);
/* 1569 */       break;
/*      */     
/*      */ 
/*      */     case 4: 
/* 1573 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 10: 
/*      */     case 11: 
/*      */     case 14: 
/* 1586 */       while ((getState() != 4) && (getState() != 7) && (getState() != 9) && (getState() != 16) && (getState() != 12))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1591 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1592 */       if ((getState() == 4) || (getState() == 12)) {
/* 1593 */         initiateIntentionToUnsuspend(paramBehavingEntity);
/*      */       }
/* 1595 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 5: 
/*      */     case 8: 
/*      */     case 15: 
/*      */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 13: 
/* 1608 */       this.negotiatingCommitSet.add(paramBehavingEntity);
/* 1609 */       if (this.negotiatingCommitSet.equals(this.teamMembers))
/* 1610 */         setState(14);
/* 1611 */       break;
/*      */     case 6: 
/*      */     default: 
/* 1614 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     }
/*      */   }
/*      */   
/*      */   private final boolean initiateRemovalNegotiation()
/*      */   {
/* 1620 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1621 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/* 1623 */     initiateNegotiationAction(localJointGoalStep, 21);
/*      */     
/* 1625 */     setState(15);
/* 1626 */     this.negotiatingCommitSet.clear();
/* 1627 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/* 1629 */     broadcastIntentionToExit(21);
/*      */     
/*      */ 
/* 1632 */     while ((getState() != 16) && (getState() != 9) && (getState() != 7))
/*      */     {
/*      */ 
/* 1635 */       ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */     }
/* 1637 */     completeNegotiationAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/* 1638 */     if (getState() == 16) {
/* 1639 */       return true;
/*      */     }
/* 1641 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean negotiateRemoval()
/*      */   {
/* 1650 */     Trace.ablTrace("Negotiating removal");
/*      */     
/*      */ 
/*      */ 
/* 1654 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 0: 
/*      */     case 1: 
/*      */     case 2: 
/* 1660 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1665 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1666 */       if (getState() == 4)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1673 */         this.negotiatingGoal.removeChild(true);
/* 1674 */         return initiateRemovalNegotiation();
/*      */       }
/* 1676 */       if (getState() == 3) {
/* 1677 */         return false;
/*      */       }
/* 1679 */       throw new UnexpectedStateError(getState(), this.negotiatingGoal);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/* 1687 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/*      */     case 8: 
/*      */     case 15: 
/* 1698 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 5: 
/*      */     case 6: 
/*      */     case 10: 
/*      */     case 11: 
/*      */     case 12: 
/*      */     case 13: 
/*      */     case 14: 
/* 1718 */       return initiateRemovalNegotiation();
/*      */     }
/*      */     
/*      */     
/* 1722 */     throw new UnexpectedStateError(getState(), this.negotiatingGoal);
/*      */   }
/*      */   
/*      */ 
/*      */   private final void removeGoal(JointGoalStep paramJointGoalStep)
/*      */   {
/* 1728 */     paramJointGoalStep.removeGoal();
/* 1729 */     paramJointGoalStep.cleanupParentIfRoot();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void initiateIntentionToRemove(BehavingEntity paramBehavingEntity)
/*      */   {
/* 1737 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1738 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/*      */ 
/* 1741 */     initiateIntentionAction(paramBehavingEntity, localJointGoalStep, 21);
/* 1742 */     setState(15);
/*      */     
/*      */ 
/* 1745 */     this.negotiatingCommitSet.clear();
/* 1746 */     this.negotiatingCommitSet.add(paramBehavingEntity);
/* 1747 */     this.negotiatingCommitSet.add(localBehavingEntity);
/*      */     
/*      */ 
/* 1750 */     JointGoalStep.blockOnSubtreeNegotiation(localJointGoalStep.freezeSubtreeAndNegotiateRemovalEntry());
/* 1751 */     broadcastIntentionToExit(21);
/*      */     
/*      */ 
/*      */ 
/* 1755 */     if (this.negotiatingCommitSet.equals(this.teamMembers))
/*      */     {
/* 1757 */       commitToIntentionAction(localJointGoalStep, 21);
/* 1758 */       setState(16);
/* 1759 */       removeGoal((JointGoalStep)this.runningCommitSet.get(localBehavingEntity));
/*      */     }
/*      */     else
/*      */     {
/* 1763 */       while ((getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/* 1766 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle();
/*      */       }
/* 1768 */       commitToIntentionAction(localJointGoalStep, convertCommitStateToIntention(getState()));
/* 1769 */       if (getState() == 16) {
/* 1770 */         removeGoal((JointGoalStep)this.runningCommitSet.get(localBehavingEntity));
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void processIntentionToRemove(BehavingEntity paramBehavingEntity)
/*      */   {
/* 1778 */     BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 1779 */     JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity);
/*      */     
/* 1781 */     processIntentionAction(paramBehavingEntity, localJointGoalStep, 21);
/*      */     
/* 1783 */     switch (getState())
/*      */     {
/*      */     case -1: 
/*      */     case 0: 
/*      */     case 1: 
/*      */     case 2: 
/*      */     case 3: 
/* 1790 */       while ((getState() != 4) && (getState() != 3) && (getState() != 7) && (getState() != 9) && (getState() != 16))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1795 */         ((JointGoalNegotiationThread)Thread.currentThread()).waitForDecisionCycle(); }
/* 1796 */       if (getState() == 4) {
/* 1797 */         initiateIntentionToRemove(paramBehavingEntity);
/* 1798 */       } else { if (getState() == 3) {
/* 1799 */           return;
/*      */         }
/* 1801 */         throw new UnexpectedStateError(getState(), localJointGoalStep); }
/* 1802 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 5: 
/*      */     case 6: 
/*      */     case 10: 
/*      */     case 11: 
/*      */     case 12: 
/*      */     case 13: 
/*      */     case 14: 
/* 1824 */       initiateIntentionToRemove(paramBehavingEntity);
/* 1825 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 15: 
/* 1830 */       this.negotiatingCommitSet.add(paramBehavingEntity);
/* 1831 */       if (this.negotiatingCommitSet.equals(this.teamMembers))
/* 1832 */         setState(16);
/* 1833 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 8: 
/* 1838 */       this.negotiatingCommitSet.remove(paramBehavingEntity);
/* 1839 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7: 
/*      */     case 9: 
/*      */     case 16: 
/* 1849 */       throw new MessageReceivedAfterCommitError(19, getState(), localJointGoalStep);
/*      */     
/*      */ 
/*      */     default: 
/* 1853 */       throw new UnexpectedStateError(getState(), localJointGoalStep);
/*      */     }
/*      */     
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private final void broadcastIntentionToEnter(Long paramLong, Object[] paramArrayOfObject, boolean paramBoolean, JointGoalStep paramJointGoalStep)
/*      */   {
/* 1862 */     BehavingEntity localBehavingEntity1 = BehavingEntity.getBehavingEntity();
/*      */     
/*      */ 
/* 1865 */     HashSet localHashSet = new HashSet(this.teamMembers);
/* 1866 */     localHashSet.remove(localBehavingEntity1);
/*      */     
/*      */ 
/* 1869 */     Iterator localIterator = localHashSet.iterator();
/* 1870 */     while (localIterator.hasNext()) {
/* 1871 */       BehavingEntity localBehavingEntity2 = (BehavingEntity)localIterator.next();
/* 1872 */       localBehavingEntity2.queueIntentionToEnter(paramLong, localBehavingEntity1, paramArrayOfObject, paramBoolean, this.teamMembers, paramJointGoalStep);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void broadcastIntentionToRefuseEntry(Long paramLong)
/*      */   {
/* 1892 */     BehavingEntity localBehavingEntity1 = BehavingEntity.getBehavingEntity();
/*      */     
/*      */ 
/* 1895 */     HashSet localHashSet = new HashSet(this.teamMembers);
/* 1896 */     localHashSet.remove(localBehavingEntity1);
/*      */     
/*      */ 
/* 1899 */     Iterator localIterator = localHashSet.iterator();
/* 1900 */     while (localIterator.hasNext()) {
/* 1901 */       BehavingEntity localBehavingEntity2 = (BehavingEntity)localIterator.next();
/* 1902 */       localBehavingEntity2.queueIntentionToRefuseEntry(paramLong, localBehavingEntity1, this.teamMembers);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void broadcastIntentionToExit(int paramInt)
/*      */   {
/* 1923 */     BehavingEntity localBehavingEntity1 = BehavingEntity.getBehavingEntity();
/*      */     
/*      */ 
/* 1926 */     HashSet localHashSet = new HashSet(this.teamMembers);
/* 1927 */     localHashSet.remove(localBehavingEntity1);
/*      */     
/*      */ 
/* 1930 */     Iterator localIterator = localHashSet.iterator();
/* 1931 */     while (localIterator.hasNext()) {
/* 1932 */       BehavingEntity localBehavingEntity2 = (BehavingEntity)localIterator.next();
/* 1933 */       JointGoalStep localJointGoalStep = (JointGoalStep)this.runningCommitSet.get(localBehavingEntity2);
/* 1934 */       localBehavingEntity2.queueIntentionToExit(localBehavingEntity1, localJointGoalStep, paramInt);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void initiateNegotiationAction(JointGoalStep paramJointGoalStep, int paramInt) {}
/*      */   
/*      */   protected void completeNegotiationAction(JointGoalStep paramJointGoalStep, int paramInt) {}
/*      */   
/*      */   protected void initiateIntentionAction(BehavingEntity paramBehavingEntity, JointGoalStep paramJointGoalStep, int paramInt) {}
/*      */   
/*      */   protected void commitToIntentionAction(JointGoalStep paramJointGoalStep, int paramInt) {}
/*      */   
/*      */   protected void processIntentionAction(BehavingEntity paramBehavingEntity, JointGoalStep paramJointGoalStep, int paramInt) {}
/*      */   
/*      */   void printNegotiationHistory() {}
/*      */   
/*      */   void printNegotiationHistory(PrintStream paramPrintStream) {}
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalNegotiator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */