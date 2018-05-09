/*      */ package nlu.reaction;
/*      */ 
/*      */ import facade.characters.wmedef.DAReactionInfoWME;
/*      */ import facade.characters.wmedef.DAWME;
/*      */ import facade.characters.wmedef.ObjectReactionInfoWME;
/*      */ import facade.characters.wmedef.PatternCountWME;
/*      */ import facade.characters.wmedef.PushTooFarReactionInfoWME;
/*      */ import facade.characters.wmedef.RxnCategoryLevelWME;
/*      */ import facade.characters.wmedef.SatelliteReactionInfoWME;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.File;
/*      */ import java.io.PrintStream;
/*      */ import java.util.Enumeration;
/*      */ import java.util.Hashtable;
/*      */ import java.util.List;
/*      */ import jess.JessException;
/*      */ import jess.Rete;
/*      */ import wm.WME;
/*      */ import wm.WorkingMemory;
/*      */ 
/*      */ public class ReactionDecider implements facade.util.ReactionID, facade.util.DAType, dramaman.runtime.DramaManagerConstants, facade.util.SpriteID, facade.util.BeatID
/*      */ {
/*      */   private final Rete engine;
/*      */   private final WorkingMemory storyMemory;
/*      */   private final Hashtable activeContexts;
/*      */   private final java.util.HashSet activeReactionPriorityMaps;
/*      */   private String activeContextPriorityMap;
/*      */   private String activeSelector;
/*      */   private int centricCharID;
/*      */   private static final boolean $noassert = Class.forName("[Lnlu.reaction.ReactionDecider;").getComponentType().desiredAssertionStatus() ^ true;
/*      */   
/*      */   private final void jdMethod_this()
/*      */   {
/*   34 */     this.activeContexts = new Hashtable();
/*   35 */     this.activeReactionPriorityMaps = new java.util.HashSet();
/*   36 */     this.activeContextPriorityMap = null;
/*   37 */     this.activeSelector = "Selector_Standard";
/*   38 */     this.centricCharID = -1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public ReactionDecider()
/*      */   {
/*   45 */     jdMethod_this();
/*   46 */     this.engine = new Rete();
/*   47 */     this.storyMemory = WorkingMemory.lookupRegisteredMemory("StoryMemory");
/*   48 */     if (this.storyMemory == null) {
/*   49 */       throw new RuntimeException("Couldn't find story memory. Unable to build ReactionDecider.");
/*      */     }
/*      */     try {
/*   52 */       readAndExecute("nlu/reaction/ReactionUtilities");
/*   53 */       readAndExecute("nlu/reaction/Proposer_GlobalMixIn");
/*   54 */       readAndExecute("nlu/reaction/Proposer_DuringMixin");
/*   55 */       readAndExecute("nlu/reaction/Proposer_DuringMixin_old");
/*   56 */       readAndExecute("nlu/reaction/Proposer_DuringBeatMixin");
/*   57 */       readAndExecute("nlu/reaction/Proposer_DuringTxnOut");
/*   58 */       readAndExecute("nlu/reaction/Proposer_IgnoreAllButRecovery");
/*   59 */       readAndExecute("nlu/reaction/Proposer_IgnoreMost");
/*   60 */       readAndExecute("nlu/reaction/Proposer_IgnoreThanks");
/*   61 */       readAndExecute("nlu/reaction/Proposer_TGreetsP");
/*   62 */       readAndExecute("nlu/reaction/Proposer_TGreetsP_TxnOut");
/*   63 */       readAndExecute("nlu/reaction/Proposer_GGreetsP");
/*   64 */       readAndExecute("nlu/reaction/Proposer_GGreetsPKiss");
/*   65 */       readAndExecute("nlu/reaction/Proposer_ExplDatAnniv");
/*   66 */       readAndExecute("nlu/reaction/Proposer_AA");
/*   67 */       readAndExecute("nlu/reaction/Proposer_AA_postTellMeMore");
/*   68 */       readAndExecute("nlu/reaction/Proposer_RM_ItalyGuessingGame");
/*   69 */       readAndExecute("nlu/reaction/Proposer_RM_PlayerNotAtPicture");
/*   70 */       readAndExecute("nlu/reaction/Proposer_FAskDrink");
/*   71 */       readAndExecute("nlu/reaction/Proposer_PhoneCall");
/*   72 */       readAndExecute("nlu/reaction/Proposer_TxnT1ToT2");
/*   73 */       readAndExecute("nlu/reaction/Proposer_OneOnOneAffChr");
/*   74 */       readAndExecute("nlu/reaction/Proposer_OneOnOneAffChr_xtra");
/*   75 */       readAndExecute("nlu/reaction/Proposer_OneOnOneNonAffChr");
/*   76 */       readAndExecute("nlu/reaction/Proposer_NonAffChrGReturns");
/*   77 */       readAndExecute("nlu/reaction/Proposer_NonAffChrGReturns_xtra");
/*   78 */       readAndExecute("nlu/reaction/Proposer_NonAffChrTReturns");
/*   79 */       readAndExecute("nlu/reaction/Proposer_RomanticProposal");
/*   80 */       readAndExecute("nlu/reaction/Proposer_BigQuestion");
/*   81 */       readAndExecute("nlu/reaction/Proposer_CrisisP1");
/*   82 */       readAndExecute("nlu/reaction/Proposer_C2TGGlue");
/*   83 */       readAndExecute("nlu/reaction/Proposer_TherapyGameP2");
/*   84 */       readAndExecute("nlu/reaction/Proposer_RevelationsP2");
/*   85 */       readAndExecute("nlu/reaction/Proposer_Ending");
/*   86 */       readAndExecute("nlu/reaction/ContextPriorityMap_GlobalTrumpsBeat");
/*   87 */       readAndExecute("nlu/reaction/ContextPriorityMap_GlobalTrumpsBeat_obj");
/*   88 */       readAndExecute("nlu/reaction/ContextPriorityMap_GlobalTrumpsBeat_veryHighPri");
/*   89 */       readAndExecute("nlu/reaction/Selector_Standard");
/*      */       
/*   91 */       this.engine.executeCommand("(set-current-module CONTEXT_GLOBALMIXIN)");
/*      */     } catch (JessException localJessException1) {
/*   93 */       throw new RuntimeException(localJessException1);
/*   94 */     } catch (java.io.IOException localIOException) { throw new RuntimeException(localIOException);
/*      */     }
/*   96 */     createObjectReactionInfoWMEs();
/*   97 */     createSatelliteReactionInfoWMEs();
/*   98 */     createDAReactionInfoWMEs();
/*   99 */     createPushTooFarReactionInfoWMEs();
/*      */     
/*      */ 
/*  102 */     createRxnCategoryLevelWMEs();
/*      */     
/*      */ 
/*      */ 
/*  106 */     facade.characters.wmedef.RxnDeciderMiscWME localRxnDeciderMiscWME = new facade.characters.wmedef.RxnDeciderMiscWME();
/*  107 */     this.storyMemory.addWME(localRxnDeciderMiscWME);
/*  108 */     createShadowFact("rxnDeciderMisc", localRxnDeciderMiscWME);
/*      */     
/*  110 */     localRxnDeciderMiscWME.setSatelliteFreebieCtr(0);
/*  111 */     localRxnDeciderMiscWME.setOkayToPushTooFar(false);
/*      */     try
/*      */     {
/*  114 */       this.engine.executeCommand("(set-current-module MAIN)");
/*  115 */     } catch (JessException localJessException2) { throw new RuntimeException(localJessException2);
/*      */     }
/*      */     
/*      */ 
/*  119 */     facade.characters.wmedef.TopicReferenceCountWME localTopicReferenceCountWME = new facade.characters.wmedef.TopicReferenceCountWME(59);
/*  120 */     this.storyMemory.addWME(localTopicReferenceCountWME);
/*  121 */     createShadowFact("topicReferenceCount", localTopicReferenceCountWME);
/*      */     
/*  123 */     localTopicReferenceCountWME = new facade.characters.wmedef.TopicReferenceCountWME(60);
/*  124 */     this.storyMemory.addWME(localTopicReferenceCountWME);
/*  125 */     createShadowFact("topicReferenceCount", localTopicReferenceCountWME);
/*      */     
/*  127 */     localTopicReferenceCountWME = new facade.characters.wmedef.TopicReferenceCountWME(61);
/*  128 */     this.storyMemory.addWME(localTopicReferenceCountWME);
/*  129 */     createShadowFact("topicReferenceCount", localTopicReferenceCountWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  137 */     java.util.LinkedList localLinkedList = this.storyMemory.lookupWME("StoryStatusWME");
/*  138 */     if ((!$noassert) && (localLinkedList.size() != 1)) throw new AssertionError();
/*  139 */     createShadowFact("storyStatus", (WME)localLinkedList.get(0));
/*      */     
/*      */ 
/*  142 */     localLinkedList = this.storyMemory.lookupWME("TensionStoryValueWME");
/*  143 */     if ((!$noassert) && (localLinkedList.size() != 1)) throw new AssertionError();
/*  144 */     createShadowFact("tension", (WME)localLinkedList.get(0));
/*      */     
/*  146 */     facade.characters.wmedef.PlayerInfoWME localPlayerInfoWME = new facade.characters.wmedef.PlayerInfoWME();
/*  147 */     this.storyMemory.addWME(localPlayerInfoWME);
/*  148 */     createShadowFact("playerInfo", localPlayerInfoWME);
/*      */     
/*  150 */     PatternCountWME localPatternCountWME = new PatternCountWME(0);
/*  151 */     this.storyMemory.addWME(localPatternCountWME);
/*  152 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  154 */     localPatternCountWME = new PatternCountWME(1);
/*  155 */     this.storyMemory.addWME(localPatternCountWME);
/*  156 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  158 */     localPatternCountWME = new PatternCountWME(2);
/*  159 */     this.storyMemory.addWME(localPatternCountWME);
/*  160 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  162 */     localPatternCountWME = new PatternCountWME(3);
/*  163 */     this.storyMemory.addWME(localPatternCountWME);
/*  164 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  166 */     localPatternCountWME = new PatternCountWME(4);
/*  167 */     this.storyMemory.addWME(localPatternCountWME);
/*  168 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  170 */     localPatternCountWME = new PatternCountWME(5);
/*  171 */     this.storyMemory.addWME(localPatternCountWME);
/*  172 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  174 */     localPatternCountWME = new PatternCountWME(6);
/*  175 */     this.storyMemory.addWME(localPatternCountWME);
/*  176 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  178 */     localPatternCountWME = new PatternCountWME(7);
/*  179 */     this.storyMemory.addWME(localPatternCountWME);
/*  180 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*  182 */     localPatternCountWME = new PatternCountWME(8);
/*  183 */     this.storyMemory.addWME(localPatternCountWME);
/*  184 */     createShadowFact("patternCount", localPatternCountWME);
/*      */     
/*      */ 
/*  187 */     localLinkedList = this.storyMemory.lookupWME("PostBeatMixinInfoWME");
/*  188 */     if ((!$noassert) && (localLinkedList.size() != 1)) throw new AssertionError();
/*  189 */     createShadowFact("postBeatMixinInfo", (facade.characters.wmedef.PostBeatMixinInfoWME)localLinkedList.get(0));
/*      */     
/*      */     try
/*      */     {
/*  193 */       this.engine.executeCommand("(reset)");
/*  194 */     } catch (JessException localJessException3) { throw new RuntimeException(localJessException3);
/*      */     }
/*      */     
/*  197 */     this.engine.addJessListener(new FactListener());
/*      */     
/*  199 */     this.engine.setEventMask(20496);
/*      */   }
/*      */   
/*      */   private final void readAndExecute(String paramString)
/*      */     throws java.io.IOException, JessException
/*      */   {
/*  205 */     File localFile1 = new File(paramString + ".jess");
/*  206 */     File localFile2 = new File(paramString + ".bin");
/*      */     
/*      */ 
/*      */ 
/*  210 */     if ((localFile1.exists()) && (localFile2.exists())) {
/*  211 */       long l1 = localFile1.lastModified();
/*  212 */       long l2 = localFile2.lastModified();
/*  213 */       String str2; if (l1 > l2)
/*      */       {
/*  215 */         str2 = readJessFile(localFile1);
/*  216 */         this.engine.executeCommand(str2);
/*  217 */         writeBinFile(localFile2, str2);
/*      */       }
/*      */       else
/*      */       {
/*  221 */         str2 = readBinFile(localFile2);
/*  222 */         this.engine.executeCommand(str2);
/*      */       }
/*      */     } else { String str1;
/*  225 */       if ((localFile1.exists()) && (!localFile2.exists()))
/*      */       {
/*  227 */         str1 = readJessFile(localFile1);
/*  228 */         this.engine.executeCommand(str1);
/*  229 */         writeBinFile(localFile2, str1);
/*      */       }
/*  231 */       else if ((!localFile1.exists()) && (localFile2.exists()))
/*      */       {
/*  233 */         str1 = readBinFile(localFile2);
/*  234 */         this.engine.executeCommand(str1);
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  240 */         System.out.println("No .jess or .bin file found for " + paramString);
/*      */         
/*  242 */         throw new RuntimeException("No .jess or .bin file found for " + paramString);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private final String readJessFile(File paramFile) throws java.io.IOException {
/*  248 */     System.out.println("Reading " + paramFile.getName());
/*  249 */     BufferedReader localBufferedReader = new BufferedReader(new java.io.FileReader(paramFile));
/*  250 */     StringBuffer localStringBuffer = new StringBuffer(50000);
/*  251 */     while (localBufferedReader.ready()) {
/*  252 */       char[] arrayOfChar = new char['✐'];
/*  253 */       int i = localBufferedReader.read(arrayOfChar);
/*  254 */       if ((!$noassert) && (i == -1)) throw new AssertionError();
/*  255 */       localStringBuffer.append(arrayOfChar);
/*      */     }
/*  257 */     localBufferedReader.close();
/*  258 */     return localStringBuffer.toString();
/*      */   }
/*      */   
/*      */   private final String readBinFile(File paramFile) throws java.io.IOException
/*      */   {
/*  263 */     System.out.println("Reading " + paramFile.getName());
/*  264 */     java.io.FileInputStream localFileInputStream = new java.io.FileInputStream(paramFile);
/*  265 */     java.util.zip.InflaterInputStream localInflaterInputStream = new java.util.zip.InflaterInputStream(localFileInputStream);
/*  266 */     java.io.InputStreamReader localInputStreamReader = new java.io.InputStreamReader(localInflaterInputStream);
/*  267 */     BufferedReader localBufferedReader = new BufferedReader(localInputStreamReader);
/*  268 */     StringBuffer localStringBuffer = new StringBuffer(50000);
/*  269 */     while (localBufferedReader.ready()) {
/*  270 */       char[] arrayOfChar = new char['✐'];
/*  271 */       int i = localBufferedReader.read(arrayOfChar);
/*  272 */       if (i != -1)
/*  273 */         localStringBuffer.append(arrayOfChar);
/*      */     }
/*  275 */     localBufferedReader.close();
/*  276 */     return localStringBuffer.toString();
/*      */   }
/*      */   
/*      */   private final void writeBinFile(File paramFile, String paramString) throws java.io.IOException {
/*  280 */     System.out.println("Writing " + paramFile.getName());
/*  281 */     java.io.FileOutputStream localFileOutputStream = new java.io.FileOutputStream(paramFile);
/*  282 */     java.util.zip.DeflaterOutputStream localDeflaterOutputStream = new java.util.zip.DeflaterOutputStream(localFileOutputStream);
/*  283 */     java.io.BufferedWriter localBufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(localDeflaterOutputStream));
/*  284 */     localBufferedWriter.write(paramString);
/*  285 */     localBufferedWriter.close();
/*      */   }
/*      */   
/*      */   public void createShadowFact(String paramString, WME paramWME)
/*      */   {
/*  290 */     this.engine.store("__factKey", paramString);
/*  291 */     this.engine.store("__wmeKey", paramWME);
/*      */     try {
/*  293 */       this.engine.executeCommand("(shadowWME __factKey __wmeKey)");
/*  294 */     } catch (JessException localJessException) { throw new RuntimeException(localJessException);
/*      */     }
/*      */   }
/*      */   
/*      */   public void createShadowFact(String paramString1, String paramString2, WME paramWME) {
/*  299 */     this.engine.store("__factKey", paramString1);
/*  300 */     this.engine.store("__wmeKey", paramWME);
/*      */     try {
/*  302 */       this.engine.executeCommand("(set-current-module " + paramString2 + ')');
/*  303 */       this.engine.executeCommand("(shadowWME __factKey __wmeKey)");
/*  304 */     } catch (JessException localJessException) { throw new RuntimeException(localJessException);
/*      */     }
/*      */   }
/*      */   
/*      */   public void deleteShadowFact(WME paramWME) {
/*  309 */     this.engine.store("__wmeKey", paramWME);
/*  310 */     try { this.engine.executeCommand("(unshadowWME __wmeKey)");
/*  311 */     } catch (JessException localJessException) { throw new RuntimeException(localJessException);
/*      */     }
/*      */   }
/*      */   
/*      */   private final void addDA(DAWME paramDAWME) throws JessException {
/*  316 */     this.engine.store("__externalDA", paramDAWME);
/*  317 */     this.engine.executeCommand("(modify (assert (DA (type " + paramDAWME.getId() + ") (charID " + paramDAWME.getCharID() + ") (param " + paramDAWME.getParam1() + ") (param2 " + paramDAWME.getParam2() + ") (param3 " + paramDAWME.getParam3() + ")))(daWME (fetch __externalDA)))");
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getCentricChar()
/*      */   {
/*  326 */     return this.centricCharID;
/*      */   }
/*      */   
/*      */   public void setCentricChar(int paramInt)
/*      */   {
/*  331 */     this.centricCharID = paramInt;
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
/*      */   public void chooseReaction(List paramList)
/*      */   {
/*  396 */     ReactionDecider.1ReactionThread local1ReactionThread = new ReactionDecider.1ReactionThread(this, paramList);
/*  397 */     local1ReactionThread.setPriority(Thread.currentThread().getPriority() + 1);
/*  398 */     local1ReactionThread.start();
/*      */   }
/*      */   
/*      */ 
/*      */   public void activateContext(String paramString, int paramInt)
/*      */   {
/*  404 */     Enumeration localEnumeration = this.activeContexts.keys();
/*  405 */     Object localObject = null;
/*  406 */     String str; while (localEnumeration.hasMoreElements()) {
/*  407 */       str = (String)localEnumeration.nextElement();
/*  408 */       if ((!str.equals(paramString)) && (((Integer)this.activeContexts.get(str)).intValue() == paramInt))
/*  409 */         localObject = str;
/*      */     }
/*  411 */     if (localObject != null)
/*      */     {
/*  413 */       str = "WARNING: Activating context " + paramString + " with same priority as already activated context " + (String)localObject + ". When multiple contexts with the same priority are active, the selector will choose among them randomly.";
/*  414 */       facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog(str);
/*  415 */       facade.util.StringUtil.println(str);
/*      */     }
/*      */     
/*  418 */     this.activeContexts.put(paramString, new Integer(paramInt));
/*      */   }
/*      */   
/*      */   public void deactivateContext(String paramString) {
/*  422 */     this.activeContexts.remove(paramString);
/*      */   }
/*      */   
/*      */   public void deactivateAllContexts()
/*      */   {
/*  427 */     Enumeration localEnumeration = this.activeContexts.keys();
/*  428 */     while (localEnumeration.hasMoreElements()) {
/*  429 */       String str = (String)localEnumeration.nextElement();
/*  430 */       this.activeContexts.remove(str);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void deactivateAllContextsExcept(String paramString)
/*      */   {
/*  437 */     Enumeration localEnumeration = this.activeContexts.keys();
/*  438 */     while (localEnumeration.hasMoreElements()) {
/*  439 */       String str = (String)localEnumeration.nextElement();
/*  440 */       if (!str.equals(paramString)) {
/*  441 */         this.activeContexts.remove(str);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*  446 */   public void activateReactionPriorityMapper(String paramString) { this.activeReactionPriorityMaps.add(paramString); }
/*  447 */   public void deactivateReactionPriorityMapper(String paramString) { this.activeReactionPriorityMaps.remove(paramString); }
/*      */   
/*  449 */   public void activateContextPriorityMap(String paramString) { this.activeContextPriorityMap = paramString; }
/*  450 */   public void deactivateContextPriorityMap(String paramString) { this.activeContextPriorityMap = null; }
/*      */   
/*      */   public void activateReactionSelector(String paramString)
/*      */   {
/*  454 */     this.activeSelector = paramString;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void createObjectReactionInfoWMEs()
/*      */   {
/*  465 */     ObjectReactionInfoWME localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, 0, 2, 90);
/*      */     
/*  467 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  469 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, -2, -1, 90);
/*      */     
/*  471 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  473 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, 1, 2, 97);
/*      */     
/*  475 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  477 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, -2, 0, 97);
/*      */     
/*  479 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  481 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, 0, 2, 91);
/*      */     
/*  483 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  485 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, -2, -1, 91);
/*      */     
/*  487 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  489 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, 1, 2, 92);
/*      */     
/*  491 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  493 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, -2, 0, 92);
/*      */     
/*  495 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  497 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, 0, 2, 82);
/*      */     
/*  499 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  501 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, -2, -1, 82);
/*      */     
/*  503 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  505 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, 1, 2, 88);
/*      */     
/*  507 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  509 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, -2, 0, 88);
/*      */     
/*  511 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  513 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, 0, 2, 96);
/*      */     
/*  515 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  517 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, 0, 1, 1, -2, -1, 96);
/*      */     
/*  519 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  521 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, 0, 2, 86);
/*      */     
/*  523 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  525 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, -2, -1, 86);
/*      */     
/*  527 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  529 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, 0, 2, 95);
/*      */     
/*  531 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  533 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, -2, -1, 95);
/*      */     
/*  535 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  537 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, 0, 2, 93);
/*      */     
/*  539 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  541 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, 0, 1, 1, -2, -1, 93);
/*      */     
/*  543 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  548 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 2, -2, 2, 90);
/*      */     
/*  550 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  552 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 2, -2, 2, 97);
/*      */     
/*  554 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  556 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 2, -2, 2, 91);
/*      */     
/*  558 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  560 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 2, -2, 2, 92);
/*      */     
/*  562 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  564 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 2, -2, 2, 82);
/*      */     
/*  566 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  568 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 2, -2, 2, 88);
/*      */     
/*  570 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  572 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 2, -2, 2, 96);
/*      */     
/*  574 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  576 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 2, -2, 2, 86);
/*      */     
/*  578 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  580 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 2, -2, 2, 95);
/*      */     
/*  582 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
/*      */     
/*  584 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 2, -2, 2, 93);
/*      */     
/*  586 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", localObjectReactionInfoWME);
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
/*      */   public void createExtraT2ObjectReactionInfoWMEs()
/*      */   {
/*  599 */     System.out.println("### createExtraT2ObjectReactionInfoWMEs()");
/*      */     
/*      */ 
/*      */ 
/*  603 */     ObjectReactionInfoWME localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 3, -2, 2, 90);
/*      */     
/*  605 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  607 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 3, -2, 2, 97);
/*      */     
/*  609 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  611 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 3, -2, 2, 91);
/*      */     
/*  613 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  615 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 3, -2, 2, 92);
/*      */     
/*  617 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  619 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 3, -2, 2, 82);
/*      */     
/*  621 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  623 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 3, -2, 2, 88);
/*      */     
/*  625 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  627 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 0, -1, 1, 3, -2, 2, 96);
/*      */     
/*  629 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  631 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 3, -2, 2, 86);
/*      */     
/*  633 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  635 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 3, -2, 2, 95);
/*      */     
/*  637 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
/*      */     
/*  639 */     localObjectReactionInfoWME = new ObjectReactionInfoWME(2, true, 1, -1, 1, 3, -2, 2, 93);
/*      */     
/*  641 */     this.storyMemory.addWME(localObjectReactionInfoWME);createShadowFact("objectReactionInfo", "CONTEXT_GLOBALMIXIN", localObjectReactionInfoWME);
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
/*      */   private final void createSatelliteReactionInfoWMEs()
/*      */   {
/*  654 */     SatelliteReactionInfoWME localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, 0, 2, 71);
/*      */     
/*  656 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  658 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, -2, -1, 71);
/*      */     
/*  660 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  662 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, 0, 2, 72);
/*      */     
/*  664 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  666 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, -2, -1, 72);
/*      */     
/*  668 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  670 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, 0, 2, 73);
/*      */     
/*  672 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  674 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, -2, -1, 73);
/*      */     
/*  676 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  678 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, 0, 2, 75);
/*      */     
/*  680 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  682 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, -2, -1, 75);
/*      */     
/*  684 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  686 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, 1, 2, 74);
/*      */     
/*  688 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  690 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, 0, 1, 1, -2, 0, 74);
/*      */     
/*  692 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  697 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 0, -1, 1, 2, -2, 2, 71);
/*      */     
/*  699 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  701 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, -1, 1, 2, -2, 2, 72);
/*      */     
/*  703 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  705 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 0, -1, 1, 2, -2, 2, 73);
/*      */     
/*  707 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  709 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, -1, 1, 2, -2, 2, 75);
/*      */     
/*  711 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
/*      */     
/*  713 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 0, -1, 1, 2, -2, 2, 74);
/*      */     
/*  715 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", localSatelliteReactionInfoWME);
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
/*      */   public void createExtraT2SatelliteReactionInfoWMEs()
/*      */   {
/*  729 */     System.out.println("### createExtraT2SatelliteReactionInfoWMEs()");
/*      */     
/*      */ 
/*      */ 
/*  733 */     SatelliteReactionInfoWME localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 0, -1, 1, 3, -2, 2, 71);
/*      */     
/*  735 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", "CONTEXT_GLOBALMIXIN", localSatelliteReactionInfoWME);
/*      */     
/*  737 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, -1, 1, 3, -2, 2, 72);
/*      */     
/*  739 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", "CONTEXT_GLOBALMIXIN", localSatelliteReactionInfoWME);
/*      */     
/*  741 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 0, -1, 1, 3, -2, 2, 73);
/*      */     
/*  743 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", "CONTEXT_GLOBALMIXIN", localSatelliteReactionInfoWME);
/*      */     
/*  745 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 1, -1, 1, 3, -2, 2, 75);
/*      */     
/*  747 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", "CONTEXT_GLOBALMIXIN", localSatelliteReactionInfoWME);
/*      */     
/*  749 */     localSatelliteReactionInfoWME = new SatelliteReactionInfoWME(1, true, 0, -1, 1, 3, -2, 2, 74);
/*      */     
/*  751 */     this.storyMemory.addWME(localSatelliteReactionInfoWME);createShadowFact("satelliteReactionInfo", "CONTEXT_GLOBALMIXIN", localSatelliteReactionInfoWME);
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
/*      */   private final void createDAReactionInfoWMEs()
/*      */   {
/*  766 */     DAReactionInfoWME localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 11, 0);
/*      */     
/*  768 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  770 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 11, 1);
/*      */     
/*  772 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  777 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 12, 0);
/*      */     
/*  779 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  781 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 12, 1);
/*      */     
/*  783 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  788 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 15, 0);
/*      */     
/*  790 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  792 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 15, 1);
/*      */     
/*  794 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  799 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 16, 0);
/*      */     
/*  801 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  803 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 16, 1);
/*      */     
/*  805 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  810 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 29, 0);
/*      */     
/*  812 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  814 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 29, 1);
/*      */     
/*  816 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  821 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 19, 0);
/*      */     
/*  823 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  825 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 19, 1);
/*      */     
/*  827 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  832 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 20, 0);
/*      */     
/*  834 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  836 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 20, 1);
/*      */     
/*  838 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  843 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 21, 0);
/*      */     
/*  845 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  847 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 21, 1);
/*      */     
/*  849 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  854 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 22, 0);
/*      */     
/*  856 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  858 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 22, 1);
/*      */     
/*  860 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  865 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 18, 0);
/*      */     
/*  867 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  869 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 18, 1);
/*      */     
/*  871 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  876 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 23, 0);
/*      */     
/*  878 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  880 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 23, 1);
/*      */     
/*  882 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  887 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 24, 0);
/*      */     
/*  889 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  891 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 24, 1);
/*      */     
/*  893 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  898 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 25, 0);
/*      */     
/*  900 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  902 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 25, 1);
/*      */     
/*  904 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  909 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 26, 0);
/*      */     
/*  911 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  913 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 26, 1);
/*      */     
/*  915 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  920 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 27, 0);
/*      */     
/*  922 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  924 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 27, 1);
/*      */     
/*  926 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  931 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 28, 0);
/*      */     
/*  933 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  935 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 28, 1);
/*      */     
/*  937 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  942 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 14, 0);
/*      */     
/*  944 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  946 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 14, 1);
/*      */     
/*  948 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  953 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 1, -2, 2, 34, 0);
/*      */     
/*  955 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*  957 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 34, 1);
/*      */     
/*  959 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  964 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 36, -1);
/*      */     
/*  966 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  971 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 37, -1);
/*      */     
/*  973 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  978 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 38, -1);
/*      */     
/*  980 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  985 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 39, -1);
/*      */     
/*  987 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  992 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 40, -1);
/*      */     
/*  994 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  999 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 1, -2, 2, 41, -1);
/*      */     
/* 1001 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1009 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, -1, 1, 2, -2, 2, 11, 0);
/*      */     
/* 1011 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1013 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, -1, 1, 2, -2, 2, 11, 1);
/*      */     
/* 1015 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1020 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, -1, 1, 2, -2, 2, 12, 0);
/*      */     
/* 1022 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1024 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, -1, 1, 2, -2, 2, 12, 1);
/*      */     
/* 1026 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1031 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, -1, 1, 2, -2, 2, 15, 0);
/*      */     
/* 1033 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1035 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, -1, 1, 2, -2, 2, 15, 1);
/*      */     
/* 1037 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1042 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, -1, 1, 2, -2, 2, 16, 0);
/*      */     
/* 1044 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1046 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, -1, 1, 2, -2, 2, 16, 1);
/*      */     
/* 1048 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1053 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 29, 0);
/*      */     
/* 1055 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1057 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 29, 1);
/*      */     
/* 1059 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1064 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 19, 0);
/*      */     
/* 1066 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1068 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 19, 1);
/*      */     
/* 1070 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1075 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 20, 0);
/*      */     
/* 1077 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1079 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 20, 1);
/*      */     
/* 1081 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1086 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 21, 0);
/*      */     
/* 1088 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1090 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 21, 1);
/*      */     
/* 1092 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1097 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 22, 0);
/*      */     
/* 1099 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1101 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 22, 1);
/*      */     
/* 1103 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1108 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 18, 0);
/*      */     
/* 1110 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1112 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 18, 1);
/*      */     
/* 1114 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1119 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 23, 0);
/*      */     
/* 1121 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1123 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 23, 1);
/*      */     
/* 1125 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1130 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 24, 0);
/*      */     
/* 1132 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1134 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 24, 1);
/*      */     
/* 1136 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1141 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 25, 0);
/*      */     
/* 1143 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1145 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 25, 1);
/*      */     
/* 1147 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1152 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 26, 0);
/*      */     
/* 1154 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1156 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 26, 1);
/*      */     
/* 1158 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1163 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 27, 0);
/*      */     
/* 1165 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1167 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 27, 1);
/*      */     
/* 1169 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1174 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 28, 0);
/*      */     
/* 1176 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1178 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 28, 1);
/*      */     
/* 1180 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1185 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 14, 0);
/*      */     
/* 1187 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1189 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 14, 1);
/*      */     
/* 1191 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1196 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 2, -2, 2, 34, 0);
/*      */     
/* 1198 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/* 1200 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 34, 1);
/*      */     
/* 1202 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1207 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 36, -1);
/*      */     
/* 1209 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1214 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 37, -1);
/*      */     
/* 1216 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1221 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 38, -1);
/*      */     
/* 1223 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1228 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 39, -1);
/*      */     
/* 1230 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1235 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 40, -1);
/*      */     
/* 1237 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1242 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 2, -2, 2, 41, -1);
/*      */     
/* 1244 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", localDAReactionInfoWME);
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
/*      */   public void createExtraT2DAReactionInfoWMEs()
/*      */   {
/* 1257 */     System.out.println("### createExtraT2DAReactionInfoWMEs()");
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1263 */     DAReactionInfoWME localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 11, 0);
/*      */     
/* 1265 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1267 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 11, 1);
/*      */     
/* 1269 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1274 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 12, 0);
/*      */     
/* 1276 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1278 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 12, 1);
/*      */     
/* 1280 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1285 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 15, 0);
/*      */     
/* 1287 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1289 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 15, 1);
/*      */     
/* 1291 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1296 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 16, 0);
/*      */     
/* 1298 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1300 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 16, 1);
/*      */     
/* 1302 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1307 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 29, 0);
/*      */     
/* 1309 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1311 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 29, 1);
/*      */     
/* 1313 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1318 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 19, 0);
/*      */     
/* 1320 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1322 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 19, 1);
/*      */     
/* 1324 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1329 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 20, 0);
/*      */     
/* 1331 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1333 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 20, 1);
/*      */     
/* 1335 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1340 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 21, 0);
/*      */     
/* 1342 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1344 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 21, 1);
/*      */     
/* 1346 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1351 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 0, 0, 1, 3, -2, 2, 22, 0);
/*      */     
/* 1353 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
/*      */     
/* 1355 */     localDAReactionInfoWME = new DAReactionInfoWME(3, true, 1, 0, 1, 3, -2, 2, 22, 1);
/*      */     
/* 1357 */     this.storyMemory.addWME(localDAReactionInfoWME);createShadowFact("daReactionInfo", "CONTEXT_GLOBALMIXIN", localDAReactionInfoWME);
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
/*      */   private final void createPushTooFarReactionInfoWMEs()
/*      */   {
/* 1374 */     PushTooFarReactionInfoWME localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 0);
/*      */     
/* 1376 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1378 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 1);
/*      */     
/* 1380 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1388 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 2);
/*      */     
/* 1390 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1392 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 3);
/*      */     
/* 1394 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1396 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 4);
/*      */     
/* 1398 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1400 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 5);
/*      */     
/* 1402 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1404 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 6);
/*      */     
/* 1406 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1408 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 7);
/*      */     
/* 1410 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1412 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 8);
/*      */     
/* 1414 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1416 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 9);
/*      */     
/* 1418 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1420 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 10);
/*      */     
/* 1422 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1424 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 11);
/*      */     
/* 1426 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1428 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 12);
/*      */     
/* 1430 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1432 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 13);
/*      */     
/* 1434 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1436 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 13);
/*      */     
/* 1438 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1440 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 14);
/*      */     
/* 1442 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1444 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 14);
/*      */     
/* 1446 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1448 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 0, -1, 1, 15);
/*      */     
/* 1450 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */     
/* 1452 */     localPushTooFarReactionInfoWME = new PushTooFarReactionInfoWME(0, true, 1, -1, 1, 15);
/*      */     
/* 1454 */     this.storyMemory.addWME(localPushTooFarReactionInfoWME);createShadowFact("pushTooFarReactionInfo", localPushTooFarReactionInfoWME);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void createRxnCategoryLevelWMEs()
/*      */   {
/* 1465 */     RxnCategoryLevelWME localRxnCategoryLevelWME = new RxnCategoryLevelWME(0);
/* 1466 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1467 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1469 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(1);
/* 1470 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1471 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1473 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(2);
/* 1474 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1475 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1483 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(3);
/* 1484 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1485 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1487 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(4);
/* 1488 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1489 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1491 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(5);
/* 1492 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1493 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1495 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(6);
/* 1496 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1497 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1499 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(7);
/* 1500 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1501 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1503 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(8);
/* 1504 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1505 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1507 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(9);
/* 1508 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1509 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1511 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(10);
/* 1512 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1513 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1515 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(11);
/* 1516 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1517 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1519 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(12);
/* 1520 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1521 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1523 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(13);
/* 1524 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1525 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1527 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(14);
/* 1528 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1529 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */     
/* 1531 */     localRxnCategoryLevelWME = new RxnCategoryLevelWME(15);
/* 1532 */     this.storyMemory.addWME(localRxnCategoryLevelWME);
/* 1533 */     createShadowFact("rxnCategoryLevel", localRxnCategoryLevelWME);
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\nlu\reaction\ReactionDecider.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */