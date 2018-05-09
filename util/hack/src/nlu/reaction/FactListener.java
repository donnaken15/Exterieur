/*     */ package nlu.reaction;
/*     */ 
/*     */ import jess.Fact;
/*     */ 
/*     */ public class FactListener
/*     */   implements jess.JessListener
/*     */ {
/*     */   private java.util.List reactionList;
/*     */   private final int NOT_A_GLOBAL = -1;
/*     */   private static final boolean $noassert = Class.forName("[Lnlu.reaction.FactListener;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*  12 */   public FactListener() { jdMethod_this(); }
/*  13 */   private final void jdMethod_this() { this.reactionList = new java.util.Vector();
/*     */     
/*  15 */     this.NOT_A_GLOBAL = -1;
/*     */   }
/*     */   
/*     */   private final boolean isGlobalReaction(jess.Deftemplate paramDeftemplate)
/*     */   {
/*  20 */     if (paramDeftemplate == null)
/*  21 */       return false;
/*  22 */     if (paramDeftemplate.getBaseName().equals("globalReaction"))
/*  23 */       return true;
/*  24 */     return isGlobalReaction(paramDeftemplate.getParent());
/*     */   }
/*     */   
/*     */   public void eventHappened(jess.JessEvent paramJessEvent)
/*     */     throws jess.JessException
/*     */   {
/*  30 */     int i = paramJessEvent.getType();
/*  31 */     if (i == 1073741840)
/*     */     {
/*     */ 
/*  34 */       Fact localFact1 = (Fact)paramJessEvent.getObject();
/*  35 */       String str = localFact1.getDeftemplate().getBaseName();
/*     */       
/*     */ 
/*  38 */       jess.Context localContext = ((jess.Rete)paramJessEvent.getSource()).getGlobalContext();
/*     */       
/*  40 */       if (str.equals("winningReaction"))
/*     */       {
/*     */ 
/*  43 */         int j = localFact1.getSlotValue("order").intValue(localContext);
/*  44 */         if (j != -1)
/*     */         {
/*  46 */           Fact localFact2 = localFact1.getSlotValue("reactionFactID").factValue(localContext);
/*  47 */           if ((!$noassert) && (localFact2.getSlotValue("rxnType").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  48 */           if ((!$noassert) && (localFact2.getSlotValue("priority").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  49 */           int k = localFact2.getSlotValue("rxnType").intValue(localContext);
/*  50 */           int m = localFact2.getSlotValue("priority").intValue(localContext);
/*     */           facade.characters.wmedef.DAWME localDAWME;
/*  52 */           if (k != 6) {
/*  53 */             localDAWME = (facade.characters.wmedef.DAWME)localFact2.getSlotValue("daWME").externalAddressValue(localContext);
/*     */           } else {
/*  55 */             localDAWME = null;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           int n;
/*     */           
/*     */ 
/*     */ 
/*  65 */           if (localFact2.getDeftemplate().getBaseName().equals("deflectReaction")) {
/*  66 */             if ((!$noassert) && (localFact2.getSlotValue("daDeflectCategory").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  67 */             n = localFact2.getSlotValue("daDeflectCategory").intValue(localContext);
/*  68 */             this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, -1, -1, j, m, n, -1, localDAWME, null));
/*     */           } else {
/*     */             int i1;
/*     */             facade.characters.wmedef.ReactionInfoWME localReactionInfoWME1;
/*  72 */             if (localFact2.getDeftemplate().getBaseName().equals("objectReaction")) {
/*  73 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategory").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  74 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategoryLevel").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  75 */               n = localFact2.getSlotValue("rxnCategory").intValue(localContext);
/*  76 */               i1 = localFact2.getSlotValue("rxnCategoryLevel").intValue(localContext);
/*  77 */               localReactionInfoWME1 = (facade.characters.wmedef.ReactionInfoWME)localFact2.getSlotValue("reactionInfoRef").externalAddressValue(localContext);
/*  78 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, n, i1, j, m, -1, -1, localDAWME, localReactionInfoWME1));
/*     */ 
/*     */ 
/*     */             }
/*  82 */             else if (localFact2.getDeftemplate().getBaseName().equals("satelliteReaction")) {
/*  83 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategory").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  84 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategoryLevel").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  85 */               n = localFact2.getSlotValue("rxnCategory").intValue(localContext);
/*  86 */               i1 = localFact2.getSlotValue("rxnCategoryLevel").intValue(localContext);
/*  87 */               localReactionInfoWME1 = (facade.characters.wmedef.ReactionInfoWME)localFact2.getSlotValue("reactionInfoRef").externalAddressValue(localContext);
/*  88 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, n, i1, j, m, -1, -1, localDAWME, localReactionInfoWME1));
/*     */ 
/*     */ 
/*     */             }
/*  92 */             else if (localFact2.getDeftemplate().getBaseName().equals("daReaction")) {
/*  93 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategory").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  94 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategoryLevel").atomValue(localContext).equals("nil"))) throw new AssertionError();
/*  95 */               n = localFact2.getSlotValue("rxnCategory").intValue(localContext);
/*  96 */               i1 = localFact2.getSlotValue("rxnCategoryLevel").intValue(localContext);
/*  97 */               localReactionInfoWME1 = (facade.characters.wmedef.ReactionInfoWME)localFact2.getSlotValue("reactionInfoRef").externalAddressValue(localContext);
/*  98 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, n, i1, j, m, -1, -1, localDAWME, localReactionInfoWME1));
/*     */ 
/*     */ 
/*     */             }
/* 102 */             else if (localFact2.getDeftemplate().getBaseName().equals("pushTooFarReaction")) {
/* 103 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategory").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 104 */               if ((!$noassert) && (localFact2.getSlotValue("rxnCategoryLevel").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 105 */               if ((!$noassert) && (localFact2.getSlotValue("origSatlOrObjParam").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 106 */               n = localFact2.getSlotValue("rxnCategory").intValue(localContext);
/* 107 */               i1 = localFact2.getSlotValue("rxnCategoryLevel").intValue(localContext);
/* 108 */               int i2 = localFact2.getSlotValue("origSatlOrObjParam").intValue(localContext);
/* 109 */               facade.characters.wmedef.ReactionInfoWME localReactionInfoWME2 = (facade.characters.wmedef.ReactionInfoWME)localFact2.getSlotValue("reactionInfoRef").externalAddressValue(localContext);
/* 110 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, n, i1, j, m, i2, -1, localDAWME, localReactionInfoWME2));
/*     */ 
/*     */ 
/*     */             }
/* 114 */             else if (localFact2.getDeftemplate().getBaseName().equals("subtopicSwitchReaction")) {
/* 115 */               if ((!$noassert) && (localFact2.getSlotValue("subtopicID").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 116 */               n = localFact2.getSlotValue("subtopicID").intValue(localContext);
/* 117 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, -1, -1, j, m, n, -1, localDAWME, null));
/*     */ 
/*     */ 
/*     */             }
/* 121 */             else if (localFact2.getDeftemplate().getBaseName().equals("tellMeMoreAboutReaction")) {
/* 122 */               if ((!$noassert) && (localFact2.getSlotValue("subtopicID").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 123 */               n = localFact2.getSlotValue("subtopicID").intValue(localContext);
/* 124 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, -1, -1, j, m, n, -1, localDAWME, null));
/*     */ 
/*     */ 
/*     */             }
/* 128 */             else if (localFact2.getDeftemplate().getBaseName().equals("mixinBeforeBeatGistReaction")) {
/* 129 */               if ((!$noassert) && (localFact2.getSlotValue("mixinParam").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 130 */               if ((!$noassert) && (localFact2.getSlotValue("daParam").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 131 */               n = localFact2.getSlotValue("mixinParam").intValue(localContext);
/* 132 */               i1 = localFact2.getSlotValue("daParam").intValue(localContext);
/* 133 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, -1, -1, j, m, n, i1, localDAWME, null));
/*     */ 
/*     */ 
/*     */             }
/* 137 */             else if (localFact2.getDeftemplate().getBaseName().equals("txnOutReaction")) {
/* 138 */               if ((!$noassert) && (localFact2.getSlotValue("txnOutParam").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 139 */               if ((!$noassert) && (localFact2.getSlotValue("daParam").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 140 */               n = localFact2.getSlotValue("txnOutParam").intValue(localContext);
/* 141 */               i1 = localFact2.getSlotValue("daParam").intValue(localContext);
/* 142 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, -1, -1, j, m, n, i1, localDAWME, null));
/*     */ 
/*     */ 
/*     */             }
/* 146 */             else if (localFact2.getDeftemplate().getBaseName().equals("tgReaction")) {
/* 147 */               if ((!$noassert) && (localFact2.getSlotValue("daType").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 148 */               if ((!$noassert) && (localFact2.getSlotValue("daAddressee").atomValue(localContext).equals("nil"))) throw new AssertionError();
/* 149 */               n = localFact2.getSlotValue("daType").intValue(localContext);
/* 150 */               i1 = localFact2.getSlotValue("daAddressee").intValue(localContext);
/* 151 */               this.reactionList.add(new facade.characters.wmedef.ReactionWME(k, -1, -1, j, m, n, i1, localDAWME, null));
/*     */             }
/*     */             else
/*     */             {
/* 155 */               System.out.println("WARNING: ReactionDecider encountered unknown reaction " + localFact2.getDeftemplate().getBaseName());
/*     */             }
/*     */           }
/*     */         }
/* 159 */       } } else if (paramJessEvent.getType() == 16384)
/*     */     {
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
/* 215 */       wm.WorkingMemory.addWMEs("TripMemory", this.reactionList);
/* 216 */       this.reactionList = new java.util.Vector();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\nlu\reaction\FactListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */