/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.Button;
/*    */ import java.awt.Container;
/*    */ import java.awt.Dialog;
/*    */ import java.awt.Frame;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.awt.Label;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.TextArea;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AboutDialog
/*    */   extends Dialog
/*    */ {
/* 18 */   protected static final String[] LABEL_TEXT = { "A graphical interface to the WordNet online lexical database.", "", "This Java version by Oliver Steele.", "", "The GUI is loosely based on the interface to the Tcl/Tk version by David Slomin." };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public AboutDialog(Frame paramFrame)
/*    */   {
/* 27 */     super(paramFrame, true);
/* 28 */     setVisible(false);
/* 29 */     setTitle("About");
/*    */     
/* 31 */     setSize(300, 200);
/*    */     
/* 33 */     setLayout(new GridBagLayout());
/* 34 */     GridBagConstraints localGridBagConstraints = new GridBagConstraints();
/* 35 */     localGridBagConstraints.gridx = 0;
/*    */     
/* 37 */     Label localLabel = new Label("WordNet Browser");
/* 38 */     add(localLabel, localGridBagConstraints);
/* 39 */     TextArea localTextArea = makeTextArea(LABEL_TEXT);
/* 40 */     add(localTextArea, localGridBagConstraints);
/* 41 */     Button localButton = new Button("OK");
/* 42 */     add(localButton, localGridBagConstraints);
/*    */     
/* 44 */     localButton.addActionListener(new AboutDialog.1(this));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 51 */     Rectangle localRectangle1 = getParent().bounds();
/* 52 */     Rectangle localRectangle2 = bounds();
/* 53 */     move(localRectangle1.x + (localRectangle1.width - localRectangle2.width) / 2, localRectangle1.y + (localRectangle1.height - localRectangle2.height) / 2);
/*    */     
/* 55 */     invalidate();
/* 56 */     setVisible(true);
/*    */   }
/*    */   
/*    */   protected TextArea makeTextArea(String[] paramArrayOfString) {
/* 60 */     int i = 0;
/* 61 */     for (int j = 0; j < paramArrayOfString.length; j++) {
/* 62 */       i = Math.max(i, paramArrayOfString[j].length());
/*    */     }
/* 64 */     TextArea localTextArea = new TextArea("", paramArrayOfString.length, i, 3);
/* 65 */     localTextArea.setEditable(false);
/* 66 */     for (int k = 0; k < paramArrayOfString.length; k++) {
/* 67 */       if (k > 0) localTextArea.append("\n");
/* 68 */       localTextArea.append(paramArrayOfString[k]);
/*    */     }
/* 70 */     return localTextArea;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\AboutDialog.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */