/*     */ package jess;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Map;
/*     */ import jess.factory.Factory;
/*     */ 
/*     */ class Node2
/*     */   extends NodeJoin
/*     */   implements LogicalNode, Serializable
/*     */ {
/*     */   TokenTree m_left;
/*     */   TokenTree m_right;
/*     */   private int m_rightIdx;
/*     */   private int m_rightSubIdx;
/*     */   private int m_leftIdx;
/*     */   private int m_leftSubIdx;
/*     */   private int m_tokenIdx;
/*     */   private int m_tokenSize;
/*     */   protected int m_hashkey;
/*     */   Pattern m_pattern;
/*     */   HasLHS m_defrule;
/*     */   public int m_matches;
/*     */   private boolean m_blessed;
/*     */   protected HashMap m_logicalDepends;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  34 */     this.m_rightIdx = -1;
/*  35 */     this.m_rightSubIdx = -1;
/*  36 */     this.m_leftIdx = -1;
/*  37 */     this.m_leftSubIdx = -1;
/*  38 */     this.m_tokenIdx = 0;
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
/*  62 */     this.m_matches = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */     this.m_blessed = false;
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
/*     */   Node2(int paramInt)
/*     */   {
/*  82 */     jdMethod_this();
/*  83 */     this.m_hashkey = paramInt;
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
/*     */ 
/*     */   void addTest(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  98 */     if ((paramInt4 == -1) && (paramInt6 == -1)) {
/*  99 */       addTest(new Test2Simple(paramInt1, paramInt2, paramInt3, paramInt5));
/*     */     } else {
/* 101 */       addTest(new Test2Multi(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6));
/*     */     }
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
/*     */   void callNodeLeft(Token paramToken, Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     try
/*     */     {
/* 162 */       this.m_matches = 0;
/*     */       
/* 164 */       switch (paramToken.m_tag)
/*     */       {
/*     */ 
/*     */       case 0: 
/*     */       case 2: 
/*     */         try
/*     */         {
/* 171 */           this.m_tokenSize = paramToken.size();
/* 172 */           if (paramToken.m_tag == 2) 0; this.m_left.add(paramToken, true);
/*     */         } catch (NullPointerException localNullPointerException) {
/* 174 */           throw new JessException("Node2.callNode", "Negated conjunction with", "unbound variables");
/*     */         }
/*     */         
/*     */ 
/* 178 */         runTestsVaryRight(paramToken, this.m_right, paramContext);
/* 179 */         askForBackChain(paramToken, paramContext);
/*     */         
/* 181 */         break;
/*     */       
/*     */       case 1: 
/* 184 */         if (this.m_left.remove(paramToken)) {
/* 185 */           runTestsVaryRight(paramToken, this.m_right, paramContext);
/*     */         }
/* 187 */         break;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       case 3: 
/* 193 */         initTokenTrees();
/* 194 */         if (this.m_logicalDepends != null) {
/* 195 */           this.m_logicalDepends.clear();
/*     */         }
/* 197 */         passAlong(paramToken, paramContext);
/* 198 */         break;
/*     */       
/*     */       default: 
/* 201 */         throw new JessException("Node2.callNode", "Bad tag in token", paramToken.m_tag);
/*     */       }
/*     */       
/*     */       
/*     */ 
/* 206 */       broadcastEvent(32768, paramToken);
/*     */       
/* 208 */       return;
/*     */     }
/*     */     catch (JessException localJessException) {
/* 211 */       localJessException.addContext("rule LHS (Node2)");
/* 212 */       throw localJessException;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void removeLogicalSupportFrom(Token paramToken, Context paramContext) {
/* 217 */     ArrayList localArrayList = (ArrayList)this.m_logicalDepends.remove(paramToken);
/* 218 */     if (localArrayList != null) {
/* 219 */       Rete localRete = paramContext.getEngine();
/* 220 */       for (int i = 0; i < localArrayList.size(); i++) {
/* 221 */         Fact localFact = (Fact)localArrayList.get(i);
/* 222 */         localRete.removeLogicalSupportFrom(paramToken, localFact);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void callNodeRight(Token paramToken, Context paramContext) throws JessException {
/*     */     try {
/* 229 */       int i = paramToken.m_tag;
/* 230 */       switch (i)
/*     */       {
/*     */       case 0: 
/*     */       case 2: 
/* 234 */         if (i == 2) 0; this.m_right.add(paramToken, true);
/* 235 */         runTestsVaryLeft(paramToken, this.m_left, paramContext);
/* 236 */         break;
/*     */       
/*     */       case 1: 
/* 239 */         if (this.m_right.remove(paramToken)) {
/* 240 */           runTestsVaryLeft(paramToken, this.m_left, paramContext);
/*     */         }
/* 242 */         break;
/*     */       
/*     */       case 3: 
/*     */         break;
/*     */       
/*     */       default: 
/* 248 */         throw new JessException("Node2.callNode", "Bad tag in token", i);
/*     */       }
/*     */       
/*     */       
/*     */ 
/* 253 */       broadcastEvent(32769, paramToken);
/*     */       
/* 255 */       return;
/*     */     }
/*     */     catch (JessException localJessException) {
/* 258 */       localJessException.addContext("rule LHS (Node2)");
/* 259 */       throw localJessException;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void debugPrint(Token paramToken, int paramInt)
/*     */   {
/* 270 */     System.out.println("TEST " + toString() + '(' + hashCode() + ");calltype=" + paramInt + ";tag=" + paramToken.m_tag + ";class=" + paramToken.fact(0).getName());
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
/*     */   void runTestsVaryRight(Token paramToken, TokenTree paramTokenTree, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 284 */     if (this.m_blessed) {
/*     */       Value localValue;
/* 286 */       if (this.m_leftSubIdx == -1) {
/* 287 */         localValue = paramToken.fact(this.m_tokenIdx).get(this.m_leftIdx);
/*     */       } else {
/* 289 */         localValue = paramToken.fact(this.m_tokenIdx).get(this.m_leftIdx).listValue(null).get(this.m_leftSubIdx);
/*     */       }
/*     */       
/*     */       TokenVector localTokenVector;
/* 293 */       if ((localTokenVector = paramTokenTree.findCodeInTree(localValue.hashCode(), false)) == null) {
/* 294 */         return;
/*     */       }
/*     */       
/* 297 */       doRunTestsVaryRight(paramToken, localTokenVector, paramContext);
/* 298 */       return;
/*     */     }
/*     */     
/* 301 */     doRunTestsVaryRight(paramToken, paramTokenTree, paramContext);
/*     */   }
/*     */   
/*     */   void doRunTestsVaryRight(Token paramToken, TokenTree paramTokenTree, Context paramContext) throws JessException
/*     */   {
/* 306 */     if (paramTokenTree == null) {
/* 307 */       return;
/*     */     }
/* 309 */     int i = paramTokenTree.m_hash;
/* 310 */     TokenVector[] arrayOfTokenVector = paramTokenTree.m_tokens;
/*     */     
/* 312 */     for (int j = 0; j < i; j++) {
/* 313 */       if (doRunTestsVaryRight(paramToken, arrayOfTokenVector[j], paramContext)) {
/* 314 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   boolean doRunTestsVaryRight(Token paramToken, TokenVector paramTokenVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 323 */     if (paramTokenVector != null) {
/* 324 */       int i = paramTokenVector.size();
/* 325 */       int j = this.m_nTests;
/*     */       
/* 327 */       int k = paramToken.m_tag;
/* 328 */       for (int m = 0; m < i; m++)
/*     */       {
/* 330 */         paramContext.setToken(paramToken);
/* 331 */         Token localToken1 = paramTokenVector.elementAt(m);
/* 332 */         boolean bool = true;
/* 333 */         if ((bool = runTests(j, paramContext, localToken1))) {
/* 334 */           if (k != 1) {
/* 335 */             this.m_matches += 1;
/*     */           }
/* 337 */           if (j != 0)
/* 338 */             paramToken = paramToken.prepare(bool);
/* 339 */           Token localToken2 = Rete.getFactory().newToken(paramToken, localToken1);
/* 340 */           passAlong(localToken2, paramContext);
/* 341 */           if ((this.m_logicalDepends != null) && (k != 2)) {
/* 342 */             removeLogicalSupportFrom(localToken2, paramContext);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 347 */     return false;
/*     */   }
/*     */   
/*     */   void runTestsVaryLeft(Token paramToken, TokenTree paramTokenTree, Context paramContext) throws JessException
/*     */   {
/* 352 */     if (paramTokenTree == null) {
/* 353 */       return;
/*     */     }
/* 355 */     if (this.m_blessed)
/*     */     {
/* 357 */       Fact localFact = paramToken.topFact();
/*     */       Value localValue;
/* 359 */       if (this.m_rightSubIdx == -1) {
/* 360 */         localValue = localFact.get(this.m_rightIdx);
/*     */       } else {
/* 362 */         localValue = localFact.get(this.m_rightIdx).listValue(null).get(this.m_rightSubIdx);
/*     */       }
/*     */       TokenVector localTokenVector;
/* 365 */       if ((localTokenVector = paramTokenTree.findCodeInTree(localValue.hashCode(), false)) == null) {
/* 366 */         return;
/*     */       }
/* 368 */       doRunTestsVaryLeft(paramToken, localTokenVector, paramContext);
/* 369 */       return;
/*     */     }
/*     */     
/*     */ 
/* 373 */     doRunTestsVaryLeft(paramToken, paramTokenTree, paramContext);
/*     */   }
/*     */   
/*     */   void doRunTestsVaryLeft(Token paramToken, TokenTree paramTokenTree, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 379 */     if (paramTokenTree == null) {
/* 380 */       return;
/*     */     }
/* 382 */     for (int i = 0; i < paramTokenTree.m_hash; i++) {
/* 383 */       doRunTestsVaryLeft(paramToken, paramTokenTree.m_tokens[i], paramContext);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void doRunTestsVaryLeft(Token paramToken, TokenVector paramTokenVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 391 */     if (paramTokenVector != null) {
/* 392 */       int i = paramTokenVector.size();
/* 393 */       if (i > 0) {
/* 394 */         int j = this.m_nTests;
/*     */         
/* 396 */         for (int k = 0; k < i; k++) {
/* 397 */           Token localToken1 = paramTokenVector.elementAt(k);
/* 398 */           paramContext.setToken(localToken1);
/*     */           
/* 400 */           boolean bool = true;
/* 401 */           if ((bool = runTests(j, paramContext, paramToken)))
/*     */           {
/*     */ 
/* 404 */             if (j != 0) {
/* 405 */               localToken1 = localToken1.prepare(bool);
/*     */             }
/* 407 */             Token localToken2 = Rete.getFactory().newToken(localToken1, paramToken);
/* 408 */             localToken2.m_tag = paramToken.m_tag;
/* 409 */             passAlong(localToken2, paramContext);
/* 410 */             if ((this.m_logicalDepends != null) && (localToken2.m_tag != 2)) {
/* 411 */               removeLogicalSupportFrom(localToken2, paramContext);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   boolean runTests(int paramInt, Context paramContext, Token paramToken) throws JessException
/*     */   {
/* 421 */     TestBase[] arrayOfTestBase = this.m_tests;
/* 422 */     paramContext.setFact(paramToken.topFact());
/* 423 */     for (int i = 0; i < paramInt; i++) {
/* 424 */       if (!arrayOfTestBase[i].doTest(paramContext)) {
/* 425 */         return false;
/*     */       }
/*     */     }
/* 428 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void setBackchainInfo(Pattern paramPattern, HasLHS paramHasLHS)
/*     */   {
/* 436 */     this.m_pattern = paramPattern;
/* 437 */     this.m_defrule = paramHasLHS;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final void askForBackChain(Token paramToken, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 445 */     if ((this.m_pattern == null) || (this.m_matches != 0))
/*     */     {
/* 447 */       return;
/*     */     }
/* 449 */     Fact localFact1 = new Fact(this.m_pattern.getBackchainingTemplateName(), paramContext.getEngine());
/*     */     
/*     */ 
/*     */ 
/* 453 */     Fact localFact2 = localFact1;
/*     */     
/*     */ 
/* 456 */     for (int i = 0; i < this.m_pattern.getNSlots(); i++) {
/* 457 */       int j = this.m_pattern.getDeftemplate().getSlotType(i);
/*     */       
/*     */ 
/*     */ 
/* 461 */       Value localValue = Funcall.NIL;
/*     */       
/* 463 */       ValueVector localValueVector = null;
/* 464 */       if (j == 32768) {
/* 465 */         localValueVector = new ValueVector();
/*     */       }
/*     */       
/*     */ 
/* 469 */       for (int k = 0; k < this.m_pattern.getNTests(i); k++) {
/* 470 */         Test1 localTest1 = this.m_pattern.getTest(i, k);
/*     */         
/*     */ 
/* 473 */         if (localTest1.m_test == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */           if ((localTest1.m_slotValue instanceof Variable)) {
/* 481 */             BindingValue localBindingValue = (BindingValue)this.m_defrule.getBindings().get(localTest1.m_slotValue.variableValue(null));
/*     */             
/*     */ 
/*     */ 
/* 485 */             if (localBindingValue == null) {
/* 486 */               localValue = localTest1.m_slotValue;
/*     */             }
/* 488 */             else if (localBindingValue.getFactNumber() < paramToken.size()) {
/* 489 */               localValue = paramToken.fact(localBindingValue.getFactNumber()).get(localBindingValue.getSlotIndex());
/*     */               
/* 491 */               if (localBindingValue.getSubIndex() != -1) {
/* 492 */                 localValue = localValue.listValue(null).get(localBindingValue.getSubIndex());
/*     */               }
/*     */             }
/* 495 */             if (j == 16384) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           else
/*     */           {
/* 501 */             localValue = localTest1.m_slotValue;
/*     */             
/* 503 */             if (j == 16384) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/* 508 */           if (j == 32768) {
/* 509 */             if (localValueVector.size() < localTest1.m_subIdx + 1)
/* 510 */               localValueVector.setLength(localTest1.m_subIdx + 1);
/* 511 */             localValueVector.set(localValue, localTest1.m_subIdx);
/* 512 */             localValue = Funcall.NIL;
/*     */           }
/*     */         }
/*     */       }
/* 516 */       if (j == 32768) {
/* 517 */         for (k = 0; k < localValueVector.size(); k++) {
/* 518 */           if (localValueVector.get(k) == null)
/* 519 */             localValueVector.set(Funcall.NIL, k);
/*     */         }
/* 521 */         localValue = new Value(localValueVector, 512);
/*     */       }
/*     */       
/* 524 */       localFact2.set(localValue, i);
/* 525 */       localValue = Funcall.NIL;
/*     */     }
/*     */     
/*     */ 
/* 529 */     if (this.m_matches == 0) 0; paramContext.getEngine().setPendingFact(localFact2, true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 538 */     StringBuffer localStringBuffer = new StringBuffer(256);
/* 539 */     localStringBuffer.append("[Node2 ntests=");
/* 540 */     localStringBuffer.append(this.m_nTests);
/* 541 */     localStringBuffer.append(" ");
/* 542 */     for (int i = 0; i < this.m_nTests; i++) {
/* 543 */       localStringBuffer.append(this.m_tests[i].toString());
/* 544 */       localStringBuffer.append(" ");
/*     */     }
/* 546 */     localStringBuffer.append(";usecount = ");
/* 547 */     localStringBuffer.append(this.m_usecount);
/* 548 */     if (this.m_blessed)
/* 549 */       localStringBuffer.append(";blessed");
/* 550 */     localStringBuffer.append("]");
/* 551 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void readObject(ObjectInputStream paramObjectInputStream)
/*     */     throws IOException, ClassNotFoundException
/*     */   {
/* 562 */     paramObjectInputStream.defaultReadObject();
/*     */   }
/*     */   
/*     */   protected void initTokenTrees()
/*     */   {
/* 567 */     if (this.m_leftIdx == -1) 0; boolean bool = true;
/* 568 */     if (!bool) 0; int i = this.m_tokenIdx;
/* 569 */     if (this.m_left == null) {
/* 570 */       this.m_left = new TokenTree(this.m_hashkey, bool, i, this.m_leftIdx, this.m_leftSubIdx);
/*     */     }
/*     */     else {
/* 573 */       this.m_left.clear();
/*     */     }
/* 575 */     if (this.m_right == null) {
/* 576 */       if (this.m_rightIdx == -1) 0; this.m_right = new TokenTree(this.m_hashkey, true, 0, this.m_rightIdx, this.m_rightSubIdx);
/*     */     }
/*     */     else {
/* 579 */       this.m_right.clear();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   StringBuffer displayMemory()
/*     */   {
/* 587 */     StringBuffer localStringBuffer = new StringBuffer("*** Left Memory:\n");
/* 588 */     TokenVector localTokenVector; int j; for (int i = 0; i < this.m_left.m_hash; i++) {
/* 589 */       localTokenVector = this.m_left.m_tokens[i];
/* 590 */       if (localTokenVector != null)
/*     */       {
/* 592 */         for (j = 0; j < localTokenVector.size(); j++) {
/* 593 */           localStringBuffer.append(localTokenVector.elementAt(j));
/* 594 */           localStringBuffer.append("\n");
/*     */         } }
/*     */     }
/* 597 */     localStringBuffer.append("*** RightMemory:\n");
/* 598 */     for (i = 0; i < this.m_right.m_hash; i++) {
/* 599 */       localTokenVector = this.m_right.m_tokens[i];
/* 600 */       if (localTokenVector != null)
/*     */       {
/* 602 */         for (j = 0; j < localTokenVector.size(); j++) {
/* 603 */           localStringBuffer.append(localTokenVector.elementAt(j));
/* 604 */           localStringBuffer.append("\n");
/*     */         } }
/*     */     }
/* 607 */     return localStringBuffer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void complete()
/*     */     throws JessException
/*     */   {
/* 620 */     loadAccelerator();
/*     */     TestBase localTestBase1;
/*     */     Object localObject;
/* 623 */     TestBase localTestBase2; for (int i = 0; i < this.m_nTests; i++) {
/* 624 */       localTestBase1 = this.m_tests[i];
/* 625 */       if ((localTestBase1 instanceof Test2Simple)) {
/* 626 */         localObject = (Test2Simple)localTestBase1;
/*     */         
/* 628 */         if ((((Test2Simple)localObject).getTest()) && (
/* 629 */           (((Test2Simple)localObject).getRightIndex() == -1) || (((Test2Simple)localObject).getLeftIndex() != -1)))
/*     */         {
/*     */ 
/*     */ 
/* 633 */           if (i > 0) {
/* 634 */             localTestBase2 = this.m_tests[0];
/* 635 */             this.m_tests[0] = localObject;
/* 636 */             this.m_tests[i] = localTestBase2;
/*     */           }
/*     */           
/* 639 */           this.m_rightIdx = ((Test2Simple)localObject).getRightIndex();
/* 640 */           this.m_tokenIdx = ((Test2Simple)localObject).getTokenIndex();
/* 641 */           this.m_leftIdx = ((Test2Simple)localObject).getLeftIndex();
/* 642 */           this.m_blessed = true;
/* 643 */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 650 */     if (!this.m_blessed) {
/* 651 */       for (i = 0; i < this.m_nTests; i++) {
/* 652 */         localTestBase1 = this.m_tests[i];
/* 653 */         if ((localTestBase1 instanceof Test2Multi)) {
/* 654 */           localObject = (Test2Multi)localTestBase1;
/*     */           
/* 656 */           if ((((Test2Multi)localObject).getTest()) && (
/* 657 */             (((Test2Multi)localObject).getRightIndex() == -1) || (((Test2Multi)localObject).getLeftIndex() != -1)))
/*     */           {
/*     */ 
/*     */ 
/* 661 */             if (i > 0) {
/* 662 */               localTestBase2 = this.m_tests[0];
/* 663 */               this.m_tests[0] = localObject;
/* 664 */               this.m_tests[i] = localTestBase2;
/*     */             }
/* 666 */             this.m_rightIdx = ((Test2Multi)localObject).getRightIndex();
/* 667 */             this.m_rightSubIdx = ((Test2Multi)localObject).getRightSubIndex();
/* 668 */             this.m_tokenIdx = ((Test2Multi)localObject).getTokenIndex();
/* 669 */             this.m_leftIdx = ((Test2Multi)localObject).getLeftIndex();
/* 670 */             this.m_leftSubIdx = ((Test2Multi)localObject).getLeftSubIndex();
/* 671 */             this.m_blessed = true;
/* 672 */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 678 */     initTokenTrees();
/*     */   }
/*     */   
/*     */   public int getTokenSize()
/*     */   {
/* 683 */     return this.m_tokenSize + 1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Map getLogicalDependencies()
/*     */   {
/* 703 */     return this.m_logicalDepends;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void dependsOn(Fact paramFact, Token paramToken)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 101	jess/Node2:m_logicalDepends	Ljava/util/HashMap;
/*     */     //   4: ifnonnull +14 -> 18
/*     */     //   7: aload_0
/*     */     //   8: new 105	java/util/HashMap
/*     */     //   11: dup
/*     */     //   12: invokespecial 478	java/util/HashMap:<init>	()V
/*     */     //   15: putfield 101	jess/Node2:m_logicalDepends	Ljava/util/HashMap;
/*     */     //   18: aload_0
/*     */     //   19: getfield 101	jess/Node2:m_logicalDepends	Ljava/util/HashMap;
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual 479	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   26: checkcast 130	java/util/ArrayList
/*     */     //   29: astore_3
/*     */     //   30: aload_3
/*     */     //   31: ifnonnull +21 -> 52
/*     */     //   34: new 130	java/util/ArrayList
/*     */     //   37: dup
/*     */     //   38: invokespecial 480	java/util/ArrayList:<init>	()V
/*     */     //   41: astore_3
/*     */     //   42: aload_0
/*     */     //   43: getfield 101	jess/Node2:m_logicalDepends	Ljava/util/HashMap;
/*     */     //   46: aload_2
/*     */     //   47: aload_3
/*     */     //   48: invokevirtual 484	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   51: pop
/*     */     //   52: goto +7 -> 59
/*     */     //   55: aload 4
/*     */     //   57: monitorexit
/*     */     //   58: athrow
/*     */     //   59: aload_3
/*     */     //   60: dup
/*     */     //   61: astore 4
/*     */     //   63: monitorenter
/*     */     //   64: aload_3
/*     */     //   65: aload_1
/*     */     //   66: invokevirtual 487	java/util/ArrayList:add	(Ljava/lang/Object;)Z
/*     */     //   69: pop
/*     */     //   70: aload 4
/*     */     //   72: monitorexit
/*     */     //   73: return
/*     */     // Line number table:
/*     */     //   Java source line #687	-> byte code offset #0
/*     */     //   Java source line #688	-> byte code offset #7
/*     */     //   Java source line #690	-> byte code offset #18
/*     */     //   Java source line #691	-> byte code offset #30
/*     */     //   Java source line #692	-> byte code offset #34
/*     */     //   Java source line #693	-> byte code offset #42
/*     */     //   Java source line #696	-> byte code offset #52
/*     */     //   Java source line #697	-> byte code offset #64
/*     */     //   Java source line #699	-> byte code offset #73
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	74	0	this	Node2
/*     */     //   0	74	1	paramFact	Fact
/*     */     //   0	74	2	paramToken	Token
/*     */     //   29	36	3	localArrayList	ArrayList
/*     */     //   55	16	4	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   55	58	55	finally
/*     */     //   64	73	55	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node2.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */