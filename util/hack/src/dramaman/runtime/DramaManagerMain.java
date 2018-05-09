/*    */ package dramaman.runtime;
/*    */ 
/*    */ import facade.characters.wmedef.BeatRevelationsP2WME;
/*    */ import java.awt.Container;
/*    */ import java.io.PrintStream;
/*    */ import javax.swing.JFrame;
/*    */ import wm.WorkingMemory;
/*    */ 
/*    */ public class DramaManagerMain
/*    */ {
/*    */   public static void main(String[] paramArrayOfString)
/*    */   {
/* 13 */     if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
/* 14 */       System.out.println("usage: DramaManager.main(<package-name>)");
/*    */     } else {
/* 16 */       WorkingMemory localWorkingMemory = new WorkingMemory("BeatMemory");
/* 17 */       JFrame localJFrame = new JFrame("Beat Memory Debugger");
/* 18 */       localJFrame.getContentPane().add(localWorkingMemory.getWMDebugInterface());
/* 19 */       localJFrame.pack();
/* 20 */       localJFrame.show();
/*    */       
/*    */ 
/* 23 */       DramaManager localDramaManager = new DramaManager("facade.beats", true, true);
/* 24 */       BeatRevelationsP2WME localBeatRevelationsP2WME = new BeatRevelationsP2WME(-1, -1, -1, -1, -1, -1, -1, -1, -1, false, false);
/* 25 */       DramaManager.getDramaManager();DramaManager.addWME(localBeatRevelationsP2WME);
/* 26 */       localDramaManager.startManaging();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\DramaManagerMain.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */