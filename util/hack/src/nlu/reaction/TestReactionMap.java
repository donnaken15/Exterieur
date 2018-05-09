/*     */ package nlu.reaction;
/*     */ 
/*     */ import dramaman.runtime.DramaManagerConstants;
/*     */ import dramaman.runtime.StoryStatusWME;
/*     */ import dramaman.runtime.TensionStoryValueWME;
/*     */ import facade.characters.wmedef.BeatAAp1WME;
/*     */ import facade.characters.wmedef.BeatStatusWME;
/*     */ import facade.characters.wmedef.PatternCountWME;
/*     */ import facade.characters.wmedef.TopicReferenceCountWME;
/*     */ import facade.util.BeatID;
/*     */ import facade.util.DAType;
/*     */ import facade.util.ReactionID;
/*     */ import facade.util.SpriteID;
/*     */ import java.awt.Container;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JSplitPane;
/*     */ import jess.ConsolePanel;
/*     */ import jess.JessException;
/*     */ import jess.Main;
/*     */ import jess.Rete;
/*     */ import wm.WME;
/*     */ import wm.WorkingMemory;
/*     */ import wm.WorkingMemoryDebugger;
/*     */ 
/*     */ public class TestReactionMap
/*     */   extends JFrame implements ReactionID, DAType, DramaManagerConstants, SpriteID, BeatID
/*     */ {
/*     */   private WorkingMemory memory;
/*     */   private WorkingMemoryDebugger memoryDebugger;
/*     */   private Rete engine;
/*     */   
/*     */   public TestReactionMap()
/*     */   {
/*  34 */     this.memory = new WorkingMemory();
/*  35 */     this.memoryDebugger = new WorkingMemoryDebugger(this.memory);
/*     */   }
/*     */   
/*     */   private final void createShadowFact(String paramString, WME paramWME)
/*     */   {
/*  40 */     this.engine.store("__factKey", paramString);
/*  41 */     this.engine.store("__wmeKey", paramWME);
/*     */     try {
/*  43 */       this.engine.executeCommand("(shadowWME __factKey __wmeKey)");
/*  44 */     } catch (JessException localJessException) { throw new Error(localJessException.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   private final void initializeDiscourseManager() {
/*     */     try {
/*  50 */       this.engine.executeCommand("(batch nlu/reaction/load.jess)");
/*  51 */       this.engine.executeCommand("(set-current-module CONTEXT_GLOBALMIXIN)");
/*  52 */     } catch (JessException localJessException1) { throw new Error(localJessException1.getMessage());
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       this.engine.executeCommand("(set-current-module MAIN)");
/*  67 */     } catch (JessException localJessException2) { throw new Error(localJessException2.getMessage());
/*     */     }
/*  69 */     BeatStatusWME localBeatStatusWME = new BeatStatusWME(0, false, false);
/*  70 */     this.memory.addWME(localBeatStatusWME);
/*  71 */     createShadowFact("beatStatus", localBeatStatusWME);
/*     */     
/*     */ 
/*  74 */     TopicReferenceCountWME localTopicReferenceCountWME = new TopicReferenceCountWME(59);
/*  75 */     this.memory.addWME(localTopicReferenceCountWME);
/*  76 */     localTopicReferenceCountWME.setCount(0);
/*  77 */     createShadowFact("topicReferenceCount", localTopicReferenceCountWME);
/*     */     
/*  79 */     localTopicReferenceCountWME = new TopicReferenceCountWME(60);
/*  80 */     this.memory.addWME(localTopicReferenceCountWME);
/*  81 */     localTopicReferenceCountWME.setCount(0);
/*  82 */     createShadowFact("topicReferenceCount", localTopicReferenceCountWME);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */     localTopicReferenceCountWME = new TopicReferenceCountWME(61);
/*  92 */     this.memory.addWME(localTopicReferenceCountWME);
/*  93 */     localTopicReferenceCountWME.setCount(0);
/*  94 */     createShadowFact("topicReferenceCount", localTopicReferenceCountWME);
/*     */     
/*     */ 
/*     */ 
/*  98 */     StoryStatusWME localStoryStatusWME = new StoryStatusWME();
/*  99 */     this.memory.addWME(localStoryStatusWME);
/* 100 */     localStoryStatusWME.setAffinity(-1);
/* 101 */     localStoryStatusWME.setCurrentBeat(16);
/* 102 */     createShadowFact("storyStatus", localStoryStatusWME);
/*     */     
/*     */ 
/* 105 */     TensionStoryValueWME localTensionStoryValueWME = new TensionStoryValueWME(1.0F);
/* 106 */     this.memory.addWME(localTensionStoryValueWME);
/* 107 */     createShadowFact("tension", localTensionStoryValueWME);
/*     */     
/*     */ 
/* 110 */     PatternCountWME localPatternCountWME = new PatternCountWME(0);
/* 111 */     this.memory.addWME(localPatternCountWME);
/* 112 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 114 */     localPatternCountWME = new PatternCountWME(1);
/* 115 */     this.memory.addWME(localPatternCountWME);
/* 116 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 118 */     localPatternCountWME = new PatternCountWME(2);
/* 119 */     this.memory.addWME(localPatternCountWME);
/* 120 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 122 */     localPatternCountWME = new PatternCountWME(3);
/* 123 */     localPatternCountWME.setCount(5);
/* 124 */     this.memory.addWME(localPatternCountWME);
/* 125 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 127 */     localPatternCountWME = new PatternCountWME(4);
/* 128 */     this.memory.addWME(localPatternCountWME);
/* 129 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 131 */     localPatternCountWME = new PatternCountWME(5);
/* 132 */     this.memory.addWME(localPatternCountWME);
/* 133 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 135 */     localPatternCountWME = new PatternCountWME(6);
/* 136 */     this.memory.addWME(localPatternCountWME);
/* 137 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 139 */     localPatternCountWME = new PatternCountWME(7);
/* 140 */     this.memory.addWME(localPatternCountWME);
/* 141 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/* 143 */     localPatternCountWME = new PatternCountWME(8);
/* 144 */     this.memory.addWME(localPatternCountWME);
/* 145 */     createShadowFact("patternCount", localPatternCountWME);
/*     */     
/*     */ 
/*     */ 
/* 149 */     BeatAAp1WME localBeatAAp1WME = new BeatAAp1WME();
/* 150 */     localBeatAAp1WME.setSubtopic(88);
/* 151 */     createShadowFact("beatAAp1Status", localBeatAAp1WME);
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
/*     */   public void initialize()
/*     */   {
/* 165 */     this.engine = new Rete();
/* 166 */     ConsolePanel localConsolePanel = new ConsolePanel(this.engine);
/*     */     
/* 168 */     JSplitPane localJSplitPane = new JSplitPane(0, true, this.memoryDebugger, localConsolePanel);
/* 169 */     localJSplitPane.setOneTouchExpandable(true);
/* 170 */     getContentPane().add(localJSplitPane);
/* 171 */     pack();
/* 172 */     setVisible(true);
/* 173 */     Main localMain = new Main();
/* 174 */     localMain.initialize(new String[0], this.engine);
/* 175 */     localConsolePanel.setFocus();
/*     */     
/* 177 */     addWindowListener(new TestReactionMap.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 182 */     initializeDiscourseManager();
/*     */     for (;;)
/*     */     {
/* 185 */       localMain.execute(true);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString)
/*     */   {
/* 191 */     TestReactionMap localTestReactionMap = new TestReactionMap();
/* 192 */     localTestReactionMap.initialize();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\nlu\reaction\TestReactionMap.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */