/*     */ package dramaman.runtime;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
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
/*     */ class BeatMonitor$ActiveBeatPane
/*     */   extends JPanel
/*     */ {
/*     */   JLabel currentBeat;
/*     */   JButton succeedBeatButton;
/*     */   JButton failBeatButton;
/*     */   final BeatMonitor this$0;
/*     */   
/*     */   public BeatMonitor$ActiveBeatPane(BeatMonitor paramBeatMonitor)
/*     */   {
/* 223 */     setLayout(new BoxLayout(this, 1));
/* 224 */     setBorder(BorderFactory.createTitledBorder("Current Beat"));
/*     */     
/* 226 */     this.currentBeat = new JLabel("                           ");
/* 227 */     this.currentBeat.setForeground(Color.black);
/* 228 */     this.currentBeat.setAlignmentX(0.5F);
/* 229 */     add(this.currentBeat);
/* 230 */     add(Box.createVerticalStrut(15));
/*     */     
/* 232 */     this.succeedBeatButton = new JButton("Succeed beat");
/* 233 */     this.succeedBeatButton.setDefaultCapable(true);
/* 234 */     this.succeedBeatButton.setAlignmentX(0.5F);
/*     */     
/* 236 */     add(this.succeedBeatButton);
/*     */     
/* 238 */     add(Box.createVerticalStrut(5));
/*     */     
/* 240 */     this.failBeatButton = new JButton("Fail beat");
/* 241 */     this.failBeatButton.setAlignmentX(0.5F);
/* 242 */     add(this.failBeatButton);
/*     */     
/*     */ 
/* 245 */     this.succeedBeatButton.addActionListener(new BeatMonitor.ActiveBeatPane.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */     this.failBeatButton.addActionListener(new BeatMonitor.ActiveBeatPane.2(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */     clear();
/*     */   }
/*     */   
/*     */   public void clear()
/*     */   {
/* 267 */     this.currentBeat.setText("                           ");
/* 268 */     this.succeedBeatButton.setEnabled(false);
/* 269 */     this.failBeatButton.setEnabled(false);
/*     */   }
/*     */   
/*     */   public void setCurrentBeat(Beat paramBeat, float paramFloat)
/*     */   {
/* 274 */     this.currentBeat.setText(paramBeat.getBeatName() + "   " + paramFloat);
/* 275 */     this.succeedBeatButton.setEnabled(true);
/* 276 */     this.failBeatButton.setEnabled(true);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatMonitor$ActiveBeatPane.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */