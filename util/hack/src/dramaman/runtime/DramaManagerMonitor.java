/*    */ package dramaman.runtime;
/*    */ 
/*    */ import java.awt.Container;
/*    */ import java.util.Hashtable;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JSplitPane;
/*    */ import wm.WorkingMemoryDebugger;
/*    */ 
/*    */ public class DramaManagerMonitor
/*    */   extends JFrame
/*    */ {
/*    */   protected BeatMonitor beatMonitor;
/*    */   protected WorkingMemoryDebugger storyMemoryMonitor;
/*    */   
/*    */   public DramaManagerMonitor()
/*    */   {
/* 17 */     setTitle("Drama Manager Monitor");
/*    */     
/*    */ 
/* 20 */     this.beatMonitor = new BeatMonitor();
/* 21 */     this.storyMemoryMonitor = new WorkingMemoryDebugger(DramaManager.getStoryMemory());
/*    */     
/*    */ 
/* 24 */     JSplitPane localJSplitPane = new JSplitPane(0, true, this.storyMemoryMonitor, this.beatMonitor);
/* 25 */     localJSplitPane.setOneTouchExpandable(true);
/* 26 */     localJSplitPane.setResizeWeight(0.5D);
/* 27 */     getContentPane().add(localJSplitPane);
/*    */     
/*    */ 
/* 30 */     pack();
/* 31 */     setVisible(true);
/* 32 */     localJSplitPane.setDividerLocation(0.3D);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 38 */   void succeedBeat(Beat paramBeat) { this.beatMonitor.succeedBeat(paramBeat); }
/*    */   
/* 40 */   void failBeat(Beat paramBeat) { this.beatMonitor.failBeat(paramBeat); }
/*    */   
/*    */   public void chooseBeat(Beat paramBeat)
/*    */   {
/* 44 */     this.beatMonitor.chooseBeat(paramBeat);
/*    */   }
/*    */   
/*    */   public void refreshSatisfiedBeats(Beat[] paramArrayOfBeat, Hashtable paramHashtable, int paramInt)
/*    */   {
/* 49 */     this.beatMonitor.refreshSatisfiedBeats(paramArrayOfBeat, paramHashtable, paramInt);
/*    */   }
/*    */   
/*    */   public void setStory(Beat[] paramArrayOfBeat, int paramInt, Hashtable paramHashtable)
/*    */   {
/* 54 */     this.beatMonitor.setStory(paramArrayOfBeat, paramInt, paramHashtable);
/*    */   }
/*    */   
/* 57 */   public void setCumulativeError(double paramDouble) { this.beatMonitor.setCumulativeError(paramDouble); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\DramaManagerMonitor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */