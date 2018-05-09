/*     */ package abl.runtime;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.Rectangle;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.HashSet;
/*     */ import java.util.Hashtable;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Set;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JSplitPane;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.JViewport;
/*     */ import javax.swing.Scrollable;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.DefaultTreeCellRenderer;
/*     */ import javax.swing.tree.DefaultTreeModel;
/*     */ import javax.swing.tree.TreeNode;
/*     */ import javax.swing.tree.TreePath;
/*     */ import wm.WorkingMemoryDebugger;
/*     */ 
/*     */ 
/*     */ public class Debugger
/*     */ {
/*     */   private final void jdMethod_this()
/*     */   {
/*  51 */     this.bBreakDecisionCycle = true;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  56 */     this.decisionCycleCounterForDecisionsPerMillisecond = 0;
/*  57 */     this.decisionCycleCounterForConditionTime = 0;
/*  58 */     this.accumulatedContinuousConditionTime = 0L;
/*  59 */     this.startTime = System.currentTimeMillis();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  64 */     this.traceListener = new TraceListener();
/*  65 */     this.traceBuffer = new LinkedList();
/*  66 */     this.tracedBehaviors = new HashSet();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */     this.listenerSupport = new AblEventSupport(); }
/*  74 */   private static final boolean $noassert = Class.forName("[Labl.runtime.Debugger;").getComponentType().desiredAssertionStatus() ^ true; private final AblEventSupport listenerSupport; private JButton continueBtn; private JButton stepBtn; private JButton breakBtn; private JFrame debugFrame; protected Set tracedBehaviors; protected List traceBuffer; protected final TraceListener traceListener; protected JCheckBox traceToBufferChkBox; protected JCheckBox traceToScreenChkBox; private long startTime; private long accumulatedContinuousConditionTime; private int decisionCycleCounterForConditionTime; private int decisionCycleCounterForDecisionsPerMillisecond; private JCheckBox ABTUpdateTreeButton; private JLabel accumulatedConditionTimeLabel; private JLabel decisionsPerSecondLabel; private boolean bBreakDecisionCycle; protected JScrollPane traceView; protected JScrollBar traceViewScroller; protected JTextArea traceArea; private JTree ABTTree; private WorkingMemoryDebugger wmPanel; private BehavingEntity entity; private static final HashSet debuggedBehaviors = new HashSet();
/*     */   private static final int buttonPaneHeight = 90;
/*     */   private static final int preferredButtonPaneWidth = 500;
/*     */   private static final int minimumButtonPaneWidth = 200;
/*     */   private static final int preferredMainSplitPaneHeight = 600;
/*     */   private static final int minimumMainSplitPaneHeight = 300;
/*     */   private static final int preferredMainSplitPaneWidth = 500;
/*     */   private static final int minimumMainSplitPaneWidth = 200;
/*     */   private static final int preferredTopPaneHeight = 400;
/*     */   private static final int minimumTopPaneHeight = 200;
/*     */   private static final int preferredTopPaneWidth = 1000;
/*     */   private static final int minimumTopPaneWidth = 400;
/*     */   private static final int preferredViewHeight = 200;
/*     */   private static final int minimumViewHeight = 100;
/*     */   private static final int preferredViewWidth = 500;
/*     */   private static final int minimumViewWidth = 200;
/*     */   private static final String CONDITION_TIME_TEXT = "Continuous condition time/100 cycles";
/*     */   private static final String DECISION_CYCLE_TEXT = "Decisions per second";
/*     */   
/*     */   protected class ABTCellRenderer extends DefaultTreeCellRenderer {
/*  94 */     public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4) { super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
/*     */       
/*     */ 
/*     */ 
/*     */       try
/*     */       {
/* 100 */         DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)paramObject;
/* 101 */         Step localStep = (Step)localDefaultMutableTreeNode.getUserObject();
/* 102 */         if (localStep.isSuspended()) {
/* 103 */           setForeground(Color.red);
/* 104 */         } else if ((localStep.getStepType() == 1) && (((GoalStep)localStep).isJointGoal()) && (((JointGoalStep)localStep).getIsNegotiating()))
/*     */         {
/*     */ 
/* 107 */           setForeground(Color.blue);
/*     */         } else
/* 109 */           setForeground(Color.black);
/* 110 */         return this;
/*     */       }
/*     */       catch (ClassCastException localClassCastException)
/*     */       {
/* 114 */         setForeground(Color.black);
/* 115 */         return this;
/*     */       }
/*     */       catch (NullPointerException localNullPointerException)
/*     */       {
/* 119 */         setForeground(Color.black); }
/* 120 */       return this;
/*     */     }
/*     */     
/*     */     protected ABTCellRenderer() {} }
/*     */   
/* 125 */   class TraceListener implements AblListener { TraceListener() { jdMethod_this(); }
/*     */     
/*     */     private final void jdMethod_this() {
/* 128 */       this.timeTable = new Hashtable();
/*     */     }
/*     */     
/*     */     private final String getNegotiationActionString(JointGoalNegotiatorDebug.JointGoalNegotiationInfo paramJointGoalNegotiationInfo) {
/* 132 */       switch (paramJointGoalNegotiationInfo.intention) {
/*     */       case 17: 
/* 134 */         return "entry";
/*     */       case 18: 
/* 136 */         return "refuse entry";
/*     */       case 19: 
/* 138 */         return "succeed";
/*     */       case 20: 
/* 140 */         return "fail";
/*     */       case 21: 
/* 142 */         return "remove";
/*     */       case 22: 
/* 144 */         return "suspend";
/*     */       case 23: 
/* 146 */         return "unsuspend";
/*     */       }
/* 148 */       return "unrecognized action";
/*     */     }
/*     */     
/*     */     static final String lineSep = "\n";
/*     */     final Hashtable timeTable;
/*     */     public AblEvent computeElapsedTime(AblEvent paramAblEvent)
/*     */     {
/* 155 */       Object localObject1 = paramAblEvent.getSource();
/* 156 */       Long localLong = (Long)this.timeTable.get(localObject1);
/* 157 */       int i = paramAblEvent.getType();
/* 158 */       switch (paramAblEvent.getType()) {
/*     */       case 5: 
/*     */       case 7: 
/*     */       case 9: 
/* 162 */         this.timeTable.put(localObject1, new Long(System.currentTimeMillis()));
/* 163 */         break;
/*     */       case 3: 
/*     */       case 6: 
/*     */       case 8: 
/*     */       case 10: 
/* 168 */         if (localLong != null) {
/* 169 */           paramAblEvent.setElapsedTime(System.currentTimeMillis() - localLong.longValue());
/* 170 */           this.timeTable.remove(localObject1);
/*     */         }
/* 172 */         break;
/*     */       case 2: 
/* 174 */         this.timeTable.put(localObject1, new Long(System.currentTimeMillis()));
/* 175 */         Object localObject2 = paramAblEvent.getObject();
/* 176 */         if (localObject2 != null)
/* 177 */           localLong = (Long)this.timeTable.get(localObject2);
/* 178 */         if (localLong != null)
/* 179 */           paramAblEvent.setElapsedTime(System.currentTimeMillis() - localLong.longValue());
/*     */         break;
/*     */       }
/* 182 */       return paramAblEvent;
/*     */     }
/*     */     
/*     */ 
/*     */     public String formatBehaviorTrace(AblEvent paramAblEvent)
/*     */     {
/* 188 */       Object localObject1 = paramAblEvent.getObject();
/* 189 */       Object localObject2 = paramAblEvent.getSource();
/*     */       
/* 191 */       long l = paramAblEvent.getElapsedTime();
/*     */       String str1;
/* 193 */       switch (paramAblEvent.getType()) {
/*     */       case 1: 
/* 195 */         str1 = "precondition tested: " + localObject1;
/* 196 */         break;
/*     */       case 2: 
/* 198 */         str1 = "behavior chosen";
/* 199 */         break;
/*     */       case 3: 
/* 201 */         if (((Boolean)localObject1).booleanValue()) {
/* 202 */           str1 = "behavior succeeded";
/*     */         } else
/* 204 */           str1 = "behavior failed";
/* 205 */         break;
/*     */       case 4: 
/* 207 */         str1 = "context condition failed";
/* 208 */         break;
/*     */       case 5: 
/* 210 */         str1 = "execution";
/* 211 */         break;
/*     */       case 6: 
/* 213 */         if (((Boolean)localObject1).booleanValue()) {
/* 214 */           str1 = "succeeded";
/*     */         } else
/* 216 */           str1 = "act failed";
/* 217 */         break;
/*     */       case 7: 
/* 219 */         str1 = "execution";
/* 220 */         break;
/*     */       case 8: 
/* 222 */         if (((Boolean)localObject1).booleanValue()) {
/* 223 */           str1 = "succeeded";
/*     */         } else
/* 225 */           str1 = "failed";
/* 226 */         break;
/*     */       case 9: 
/* 228 */         str1 = "execution";
/* 229 */         break;
/*     */       case 10: 
/* 231 */         str1 = "succeeded";
/* 232 */         break;
/*     */       case 11: 
/* 234 */         str1 = "succeeded";
/* 235 */         break;
/*     */       case 12: 
/* 237 */         str1 = "execution";
/* 238 */         break;
/*     */       case 13: 
/* 240 */         str1 = "failed";
/* 241 */         break;
/*     */       case 14: 
/* 243 */         str1 = "execution";
/* 244 */         break;
/*     */       case 15: 
/* 246 */         str1 = "succeeded";
/* 247 */         break;
/*     */       case 18: 
/* 249 */         str1 = "success test succeeded";
/* 250 */         break;
/*     */       case 19: 
/* 252 */         str1 = "re-rooting subgoal at ABT root";
/* 253 */         break;
/*     */       case 20: 
/* 255 */         str1 = "initiating " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " negotiation";
/* 256 */         break;
/*     */       case 21: 
/* 258 */         str1 = "completing " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " negotiation";
/* 259 */         break;
/*     */       case 22: 
/* 261 */         str1 = "initiating " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " intention";
/* 262 */         break;
/*     */       case 23: 
/* 264 */         str1 = "committing to " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " intention";
/* 265 */         break;
/*     */       case 24: 
/* 267 */         str1 = "process " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " intention";
/* 268 */         break;
/*     */       case 16: case 17: default: 
/* 270 */         str1 = "unrecognized action " + paramAblEvent.getType();
/*     */       }
/* 272 */       int i = paramAblEvent.getNestLevel();
/* 273 */       StringBuffer localStringBuffer = new StringBuffer(2 * i);
/* 274 */       for (int j = 0; j < i; j++) {
/* 275 */         localStringBuffer.append("  ");
/*     */       }
/* 277 */       String str2 = "";
/* 278 */       switch (paramAblEvent.getSourceType()) {
/*     */       case 1: 
/* 280 */         if ((paramAblEvent.getType() == 1) || (paramAblEvent.getType() == 2))
/*     */         {
/* 282 */           str2 = ((__BehaviorDesc)localObject2).uniqueName;
/*     */         } else
/* 284 */           str2 = ((__BehaviorDesc)localObject2).signature;
/* 285 */         break;
/*     */       case 3: 
/* 287 */         JointGoalNegotiatorDebug.JointGoalNegotiationInfo localJointGoalNegotiationInfo = (JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1;
/* 288 */         if (localJointGoalNegotiationInfo.g != null)
/* 289 */           str2 = localJointGoalNegotiationInfo.g.getSignature();
/* 290 */         if (localJointGoalNegotiationInfo.behavingEntity != null)
/* 291 */           str2 = str2 + " from " + localJointGoalNegotiationInfo.behavingEntity;
/* 292 */         break;
/*     */       case 2: 
/* 294 */         str2 = ((Step)localObject2).toString();
/* 295 */         break;
/*     */       default: 
/* 297 */         str2 = "unrecognized source " + paramAblEvent.getSourceType();
/*     */       }
/* 299 */       if (l != -1) {
/* 300 */         str1 = str1 + " elapsed time = " + l;
/*     */       }
/* 302 */       if (str2.equals("")) {
/* 303 */         return localStringBuffer + str1 + '\n';
/*     */       }
/* 305 */       return localStringBuffer + str2 + ": " + str1 + '\n';
/*     */     }
/*     */     
/*     */     public void eventHappened(AblEvent paramAblEvent)
/*     */     {
/* 310 */       if (Debugger.this.traceToScreenChkBox.isSelected()) {
/* 311 */         SwingUtilities.invokeLater(new Debugger.TraceListener.1(this, paramAblEvent));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */       if (Debugger.this.traceToBufferChkBox.isSelected()) {
/* 340 */         Debugger.this.traceBuffer.add(computeElapsedTime(paramAblEvent));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   class StringIgnoreCaseComparator implements Comparator {
/*     */     public int compare(Object paramObject1, Object paramObject2) {
/* 347 */       return ((String)paramObject1).compareToIgnoreCase((String)paramObject2);
/*     */     }
/*     */     
/*     */     StringIgnoreCaseComparator() {}
/*     */   }
/*     */   
/*     */   class SelectTraceDialog extends JDialog {
/*     */     private final JPanel contentPane;
/*     */     private final JPanel checkBoxes;
/*     */     private final JScrollPane checkBoxesView;
/*     */     private final JPanel buttonContainer;
/*     */     private final JButton okBtn;
/*     */     private final JButton cancelBtn;
/*     */     private final JButton selectAllBtn;
/*     */     private final JButton clearAllBtn;
/*     */     final SelectTraceDialog me;
/*     */     
/*     */     class ScrollableJPanel extends JPanel implements Scrollable {
/* 365 */       public Dimension getPreferredScrollableViewportSize() { return getPreferredSize(); }
/*     */       
/*     */       public int getScrollableUnitIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
/* 368 */         return new JCheckBox("Sample").getPreferredSize().height;
/*     */       }
/*     */       
/*     */       public int getScrollableBlockIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
/* 372 */         JCheckBox localJCheckBox = new JCheckBox("Sample");
/* 373 */         if (paramInt1 == 1) {
/* 374 */           return paramRectangle.height - localJCheckBox.getPreferredSize().height;
/*     */         }
/* 376 */         return paramRectangle.width - localJCheckBox.getPreferredSize().height; }
/*     */       
/* 378 */       public boolean getScrollableTracksViewportWidth() { return false; }
/* 379 */       public boolean getScrollableTracksViewportHeight() { return false; }
/*     */       
/*     */       ScrollableJPanel() {}
/*     */     }
/*     */     
/* 384 */     SelectTraceDialog() { this.me = this;
/*     */       
/* 386 */       setTitle("Select behaviors to trace");
/*     */       
/*     */ 
/* 389 */       this.contentPane = new JPanel();
/* 390 */       setContentPane(this.contentPane);
/* 391 */       this.contentPane.setLayout(new BoxLayout(this.contentPane, 1));
/*     */       
/* 393 */       this.checkBoxes = new ScrollableJPanel();
/* 394 */       this.checkBoxes.setLayout(new BoxLayout(this.checkBoxes, 1));
/*     */       
/* 396 */       this.checkBoxesView = new JScrollPane(this.checkBoxes);
/* 397 */       this.checkBoxesView.getViewport().setScrollMode(2);
/*     */       
/* 399 */       this.buttonContainer = new JPanel();
/* 400 */       this.buttonContainer.setLayout(new BoxLayout(this.buttonContainer, 0));
/* 401 */       this.buttonContainer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*     */       
/*     */ 
/* 404 */       this.selectAllBtn = new JButton("Select All");
/* 405 */       this.clearAllBtn = new JButton("Clear All");
/* 406 */       this.okBtn = new JButton("OK");
/* 407 */       this.cancelBtn = new JButton("Cancel");
/*     */       
/*     */ 
/* 410 */       this.okBtn.addActionListener(new Debugger.SelectTraceDialog.1(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 434 */       this.cancelBtn.addActionListener(new Debugger.SelectTraceDialog.2(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */       this.selectAllBtn.addActionListener(new Debugger.SelectTraceDialog.3(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 450 */       this.clearAllBtn.addActionListener(new Debugger.SelectTraceDialog.4(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */       getContentPane().add(this.checkBoxesView);
/* 460 */       getContentPane().add(this.buttonContainer);
/* 461 */       this.buttonContainer.add(this.selectAllBtn);
/* 462 */       this.buttonContainer.add(this.clearAllBtn);
/* 463 */       this.buttonContainer.add(Box.createHorizontalStrut(30));
/* 464 */       this.buttonContainer.add(this.okBtn);
/* 465 */       this.buttonContainer.add(this.cancelBtn);
/*     */       
/*     */ 
/* 468 */       Dimension localDimension = this.buttonContainer.getMaximumSize();
/* 469 */       this.buttonContainer.setMaximumSize(new Dimension(localDimension.width, 30));
/*     */       
/*     */ 
/* 472 */       this.buttonContainer.setMinimumSize(new Dimension(200, 30));
/*     */       
/*     */ 
/*     */ 
/* 476 */       Set localSet = Debugger.this.entity.getRegisteredBehaviors();
/* 477 */       String[] arrayOfString = (String[])localSet.toArray(new String[localSet.size()]);
/*     */       
/*     */ 
/* 480 */       Arrays.sort(arrayOfString, new Debugger.StringIgnoreCaseComparator(Debugger.this));
/*     */       
/* 482 */       for (int i = 0; i < arrayOfString.length; i++) {
/* 483 */         boolean bool = Debugger.this.tracedBehaviors.contains(arrayOfString[i]);
/* 484 */         localObject = new JCheckBox(arrayOfString[i], bool);
/* 485 */         this.checkBoxes.add((Component)localObject);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 490 */       JCheckBox localJCheckBox = new JCheckBox();
/* 491 */       int j = localJCheckBox.getPreferredSize().height * arrayOfString.length;
/* 492 */       Object localObject = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getBounds().getSize();
/* 493 */       if (j > ((Dimension)localObject).height - 60) {
/* 494 */         this.checkBoxesView.setPreferredSize(new Dimension(this.checkBoxes.getPreferredSize().width, ((Dimension)localObject).height - 100));
/*     */       }
/* 496 */       setModal(true);
/* 497 */       pack();
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
/*     */   public Debugger(BehavingEntity paramBehavingEntity)
/*     */   {
/* 551 */     jdMethod_this();
/*     */     try {
/* 553 */       UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
/* 554 */     } catch (Exception localException) { throw new AblRuntimeError("Error setting the look and feel in the debugger");
/*     */     }
/* 556 */     this.wmPanel = paramBehavingEntity.getWMDebugger();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 562 */     this.ABTTree = new JTree(null);
/* 563 */     this.ABTTree.setRootVisible(true);
/* 564 */     this.ABTTree.setCellRenderer(new ABTCellRenderer());
/* 565 */     JPanel localJPanel1 = new JPanel();
/* 566 */     this.ABTUpdateTreeButton = new JCheckBox("Continuously update ABT");
/* 567 */     JScrollPane localJScrollPane = new JScrollPane(this.ABTTree);
/* 568 */     localJScrollPane.getViewport().setScrollMode(2);
/* 569 */     localJPanel1.setLayout(new BoxLayout(localJPanel1, 1));
/* 570 */     localJPanel1.add(this.ABTUpdateTreeButton);
/* 571 */     localJPanel1.add(localJScrollPane);
/* 572 */     localJPanel1.setBorder(BorderFactory.createTitledBorder("Active Behavior Tree"));
/*     */     
/*     */ 
/* 575 */     this.breakBtn = new JButton("Break");
/* 576 */     this.stepBtn = new JButton("Step");
/* 577 */     this.continueBtn = new JButton("Continue");
/*     */     
/*     */ 
/* 580 */     this.breakBtn.addActionListener(new Debugger.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 586 */     this.stepBtn.addActionListener(new Debugger.2(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 591 */     this.continueBtn.addActionListener(new Debugger.3(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 600 */     JSplitPane localJSplitPane1 = new JSplitPane(0, true, this.wmPanel, localJPanel1);
/* 601 */     localJSplitPane1.setOneTouchExpandable(true);
/* 602 */     this.wmPanel.setMinimumSize(new Dimension(200, 100));
/* 603 */     localJPanel1.setMinimumSize(new Dimension(200, 100));
/* 604 */     this.wmPanel.setPreferredSize(new Dimension(500, 200));
/* 605 */     localJPanel1.setPreferredSize(new Dimension(500, 200));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 614 */     this.traceArea = new JTextArea();
/* 615 */     this.traceArea.setEditable(false);
/* 616 */     this.traceView = new JScrollPane(this.traceArea);
/* 617 */     this.traceViewScroller = this.traceView.getVerticalScrollBar();
/* 618 */     this.traceView.getViewport().setScrollMode(2);
/*     */     
/*     */ 
/*     */ 
/* 622 */     this.traceArea.addMouseListener(new Debugger.4(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 629 */     JButton localJButton1 = new JButton("Select Trace");
/* 630 */     this.traceToScreenChkBox = new JCheckBox("Trace to screen");
/* 631 */     this.traceToBufferChkBox = new JCheckBox("Trace to buffer");
/* 632 */     JButton localJButton2 = new JButton("Clear Screen");
/* 633 */     JButton localJButton3 = new JButton("Clear Buffer");
/* 634 */     JButton localJButton4 = new JButton("Replay Buffer");
/*     */     
/* 636 */     localJButton1.addActionListener(new Debugger.5(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 641 */     localJButton2.addActionListener(new Debugger.6(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 647 */     localJButton3.addActionListener(new Debugger.7(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */     localJButton4.addActionListener(new Debugger.8(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 700 */     JPanel localJPanel2 = new JPanel();
/* 701 */     localJPanel2.setLayout(new BoxLayout(localJPanel2, 1));
/*     */     
/*     */ 
/* 704 */     JPanel localJPanel3 = new JPanel();
/* 705 */     localJPanel3.setLayout(new BoxLayout(localJPanel3, 1));
/* 706 */     localJPanel3.setMaximumSize(new Dimension(400, 120));
/* 707 */     localJPanel3.setAlignmentX(0.5F);
/*     */     
/* 709 */     JPanel localJPanel4 = new JPanel();
/* 710 */     localJPanel4.setLayout(new BoxLayout(localJPanel4, 0));
/* 711 */     localJPanel4.setAlignmentX(0.0F);
/*     */     
/* 713 */     JPanel localJPanel5 = new JPanel();
/* 714 */     localJPanel5.setLayout(new BoxLayout(localJPanel5, 0));
/* 715 */     localJPanel5.setAlignmentX(0.0F);
/*     */     
/* 717 */     localJPanel2.add(localJPanel3);
/* 718 */     localJPanel3.add(localJPanel4);
/* 719 */     localJPanel3.add(localJPanel5);
/*     */     
/*     */ 
/* 722 */     localJPanel4.add(localJButton1);
/* 723 */     localJPanel4.add(Box.createHorizontalStrut(10));
/* 724 */     localJPanel4.add(this.traceToScreenChkBox);
/* 725 */     localJPanel4.add(Box.createHorizontalStrut(10));
/* 726 */     localJPanel4.add(this.traceToBufferChkBox);
/* 727 */     localJPanel5.add(localJButton2);
/* 728 */     localJPanel5.add(Box.createHorizontalStrut(10));
/* 729 */     localJPanel5.add(localJButton3);
/* 730 */     localJPanel5.add(Box.createHorizontalStrut(10));
/* 731 */     localJPanel5.add(localJButton4);
/*     */     
/*     */ 
/* 734 */     localJPanel2.add(Box.createVerticalStrut(10));
/* 735 */     localJPanel2.add(this.traceView);
/* 736 */     localJPanel2.setBorder(BorderFactory.createTitledBorder("Behavior Trace"));
/*     */     
/*     */ 
/* 739 */     JSplitPane localJSplitPane2 = new JSplitPane(0, true, localJSplitPane1, localJPanel2);
/* 740 */     localJSplitPane2.setOneTouchExpandable(true);
/* 741 */     localJSplitPane1.setMinimumSize(new Dimension(400, 200));
/* 742 */     localJSplitPane1.setPreferredSize(new Dimension(1000, 400));
/* 743 */     localJSplitPane2.setMinimumSize(new Dimension(200, 300));
/* 744 */     localJSplitPane2.setPreferredSize(new Dimension(500, 600));
/* 745 */     localJSplitPane2.setAlignmentX(1.0F);
/*     */     
/*     */ 
/* 748 */     this.decisionsPerSecondLabel = new JLabel("Decisions per second");
/* 749 */     this.accumulatedConditionTimeLabel = new JLabel("Continuous condition time/100 cycles");
/*     */     
/* 751 */     JPanel localJPanel6 = new JPanel();
/* 752 */     Box localBox1 = new Box(1);
/* 753 */     Box localBox2 = new Box(0);
/* 754 */     localJPanel6.add(localBox1);
/* 755 */     localJPanel6.add(Box.createRigidArea(new Dimension(50, 0)));
/* 756 */     localJPanel6.add(localBox2);
/* 757 */     localBox1.add(this.decisionsPerSecondLabel);
/* 758 */     localBox1.add(this.accumulatedConditionTimeLabel);
/* 759 */     localBox2.add(this.breakBtn);
/* 760 */     localBox2.add(Box.createRigidArea(new Dimension(10, 0)));
/* 761 */     localBox2.add(this.stepBtn);
/* 762 */     localBox2.add(Box.createRigidArea(new Dimension(10, 0)));
/* 763 */     localBox2.add(this.continueBtn);
/* 764 */     localJPanel6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/* 765 */     localJPanel6.setAlignmentX(1.0F);
/* 766 */     localJPanel6.setMinimumSize(new Dimension(200, 90));
/* 767 */     localJPanel6.setPreferredSize(new Dimension(500, 90));
/*     */     
/* 769 */     this.entity = paramBehavingEntity;
/* 770 */     String str1 = paramBehavingEntity.getClass().getName();
/* 771 */     String str2 = str1.substring(str1.lastIndexOf('.') + 1);
/* 772 */     this.debugFrame = new JFrame(str2 + " Debugger");
/* 773 */     this.debugFrame.getContentPane().setLayout(new BoxLayout(this.debugFrame.getContentPane(), 1));
/* 774 */     this.debugFrame.getContentPane().add(localJSplitPane2);
/* 775 */     this.debugFrame.getContentPane().add(localJPanel6);
/* 776 */     this.debugFrame.getRootPane().setDefaultButton(this.continueBtn);
/* 777 */     this.debugFrame.pack();
/* 778 */     this.debugFrame.setVisible(true);
/*     */     
/*     */ 
/*     */ 
/* 782 */     this.listenerSupport.addAblListener(this.traceListener);
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
/*     */   public boolean getBreakDecisionCycle()
/*     */   {
/* 797 */     return this.bBreakDecisionCycle;
/*     */   }
/*     */   
/*     */   protected void setTreeModel(JTree paramJTree, DefaultTreeModel paramDefaultTreeModel) {
/* 801 */     paramJTree.setModel(paramDefaultTreeModel);
/* 802 */     LinkedList localLinkedList = getAllLeafPaths((TreeNode)paramDefaultTreeModel.getRoot(), paramDefaultTreeModel);
/* 803 */     ListIterator localListIterator = localLinkedList.listIterator();
/* 804 */     while (localListIterator.hasNext())
/* 805 */       paramJTree.makeVisible((TreePath)localListIterator.next());
/*     */   }
/*     */   
/*     */   public void setABTTreeModel(DefaultTreeModel paramDefaultTreeModel) {
/* 809 */     setTreeModel(this.ABTTree, paramDefaultTreeModel);
/*     */   }
/*     */   
/* 812 */   protected void clearABTTreeModel() { this.ABTTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("ABT not available"))); }
/*     */   
/* 814 */   public boolean updateABT() { return this.ABTUpdateTreeButton.isSelected(); }
/*     */   
/*     */   protected LinkedList getAllLeafPaths(TreeNode paramTreeNode, DefaultTreeModel paramDefaultTreeModel) {
/* 817 */     LinkedList localLinkedList = new LinkedList();
/* 818 */     int i = paramTreeNode.getChildCount();
/* 819 */     if (i == 0)
/*     */     {
/* 821 */       localLinkedList.add(new TreePath(paramDefaultTreeModel.getPathToRoot(paramTreeNode)));
/* 822 */       return localLinkedList;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 827 */     for (int j = 0; j < i; j++)
/* 828 */       localLinkedList.addAll(getAllLeafPaths(paramTreeNode.getChildAt(j), paramDefaultTreeModel));
/* 829 */     return localLinkedList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized void debug(long paramLong)
/*     */   {
/* 837 */     if ((!$noassert) && (paramLong < 0L)) { throw new AssertionError();
/*     */     }
/* 839 */     if (this.bBreakDecisionCycle) {
/* 840 */       System.out.println(BehavingEntity.getBehavingEntity().getBehavingEntityShortName() + ": hit breakpoint");
/* 841 */       this.decisionCycleCounterForDecisionsPerMillisecond = 0;
/* 842 */       this.wmPanel.update();
/* 843 */       setABTTreeModel(this.entity.getABTTreeModel());
/* 844 */       BehavingEntity.getBehavingEntity().printNegotiationThreads();
/* 845 */       BehavingEntity.getBehavingEntity().printLeafSteps();
/* 846 */       BehavingEntity.getBehavingEntity().printAtomicSteps();
/*     */       try {
/* 848 */         wait();
/* 849 */       } catch (Exception localException) { throw new AblRuntimeError("Unexpected interruption in Debugger.debug()");
/*     */       }
/*     */       
/*     */     }
/*     */     else
/*     */     {
/* 855 */       if (updateABT())
/* 856 */         setABTTreeModel(this.entity.getABTTreeModel());
/* 857 */       long l = System.currentTimeMillis();
/* 858 */       if (l - this.startTime >= 1000L)
/*     */       {
/* 860 */         float f = this.decisionCycleCounterForDecisionsPerMillisecond / (float)(l - this.startTime);
/*     */         
/* 862 */         this.decisionsPerSecondLabel.setText("Decisions per second " + Math.round(f * 1000.0F));
/* 863 */         this.decisionCycleCounterForDecisionsPerMillisecond = 0;
/* 864 */         this.startTime = System.currentTimeMillis();
/*     */       }
/*     */       else {
/* 867 */         this.decisionCycleCounterForDecisionsPerMillisecond += 1;
/*     */       }
/* 869 */       this.accumulatedContinuousConditionTime += paramLong;
/* 870 */       if (this.decisionCycleCounterForConditionTime == 100) {
/* 871 */         this.accumulatedConditionTimeLabel.setText("Continuous condition time/100 cycles " + this.accumulatedContinuousConditionTime);
/* 872 */         this.decisionCycleCounterForConditionTime = 0;
/* 873 */         this.accumulatedContinuousConditionTime = 0L;
/*     */       }
/*     */       else {
/* 876 */         this.decisionCycleCounterForConditionTime += 1;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public synchronized void setTraceToBuffer(boolean paramBoolean)
/*     */   {
/* 884 */     this.traceToBufferChkBox.setSelected(paramBoolean);
/*     */   }
/*     */   
/*     */   public synchronized void setTraceToScreen(boolean paramBoolean) {
/* 888 */     this.traceToScreenChkBox.setSelected(paramBoolean);
/*     */   }
/*     */   
/*     */   public synchronized void releaseDecisionThread() {
/* 892 */     notify();
/*     */   }
/*     */   
/*     */ 
/*     */   public void breakNextDecisionCycle()
/*     */   {
/* 898 */     this.bBreakDecisionCycle = true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 903 */   public void addABLListener(AblListener paramAblListener) { this.listenerSupport.addAblListener(paramAblListener); }
/* 904 */   public void removeABLListener(AblListener paramAblListener) { this.listenerSupport.removeAblListener(paramAblListener); }
/*     */   
/*     */   void traceAblExecutionEvent(int paramInt1, Step paramStep, Object paramObject, int paramInt2, int paramInt3)
/*     */   {
/* 908 */     if (debuggedBehaviors.contains(new Integer(paramInt3))) {
/* 909 */       this.listenerSupport.fireAblEvent(paramInt1, paramStep, paramObject, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   void traceAblExecutionEvent(int paramInt1, __BehaviorDesc param__BehaviorDesc, Object paramObject, int paramInt2, int paramInt3) {
/* 914 */     if (debuggedBehaviors.contains(new Integer(paramInt3)))
/* 915 */       this.listenerSupport.fireAblEvent(paramInt1, param__BehaviorDesc, paramObject, paramInt2);
/*     */   }
/*     */   
/* 918 */   void traceBehavior(int paramInt) { debuggedBehaviors.add(new Integer(paramInt)); }
/* 919 */   void untraceBehavior(int paramInt) { debuggedBehaviors.remove(new Integer(paramInt)); }
/*     */   
/*     */   public synchronized void breakSenseCycle() {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\Debugger.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */