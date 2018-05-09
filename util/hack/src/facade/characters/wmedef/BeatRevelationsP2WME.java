/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import facade.util.PrintUtilities;
/*     */ import javax.swing.JComboBox;
/*     */ import wm.TimeStampedWME;
/*     */ import wm.WMEFieldEditor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BeatRevelationsP2WME
/*     */   extends TimeStampedWME
/*     */ {
/*     */   private int rev1Who;
/*     */   private int rev1Topic;
/*     */   private int rev1CharFocus;
/*     */   private int rev2Who;
/*     */   private int rev2Topic;
/*     */   private int rev2CharFocus;
/*     */   private int rev3Who;
/*     */   private int rev3Topic;
/*     */   private int rev3CharFocus;
/*     */   private boolean bChallenged;
/*     */   private boolean bChallengedALot;
/*     */   private int litanyA1;
/*     */   private int litanyA2;
/*     */   private int litanyA3;
/*     */   private int litanyB1;
/*     */   private int litanyB2;
/*     */   private int litanyB3;
/*     */   private int litanyC1;
/*     */   private int litanyC2;
/*     */   private int litanyC3;
/*     */   private int litanyD;
/*     */   private int litanyE_CrisisCorrect;
/*     */   private int litanyE_CrisisIncorrect;
/*     */   private int litanyF;
/*     */   private int endingPrimarySpeaker;
/*     */   private int endingNonPrimarySpeaker;
/*     */   private int endingSRNotGTR_RelatSpeaker;
/*     */   
/*     */   public BeatRevelationsP2WME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/*  46 */     this.rev1Who = paramInt1;
/*  47 */     this.rev1Topic = paramInt2;
/*  48 */     this.rev1CharFocus = paramInt3;
/*  49 */     this.rev2Who = paramInt4;
/*  50 */     this.rev2Topic = paramInt5;
/*  51 */     this.rev2CharFocus = paramInt6;
/*  52 */     this.rev3Who = paramInt7;
/*  53 */     this.rev3Topic = paramInt8;
/*  54 */     this.rev3CharFocus = paramInt9;
/*  55 */     this.bChallenged = paramBoolean1;
/*  56 */     this.bChallengedALot = paramBoolean2;
/*     */     
/*  58 */     this.litanyA1 = -1;
/*  59 */     this.litanyA2 = -1;
/*  60 */     this.litanyA3 = -1;
/*  61 */     this.litanyB1 = -1;
/*  62 */     this.litanyB2 = -1;
/*  63 */     this.litanyB3 = -1;
/*  64 */     this.litanyC1 = -1;
/*  65 */     this.litanyC2 = -1;
/*  66 */     this.litanyC3 = -1;
/*  67 */     this.litanyD = -1;
/*  68 */     this.litanyE_CrisisCorrect = -1;
/*  69 */     this.litanyE_CrisisIncorrect = -1;
/*  70 */     this.litanyF = -1;
/*     */     
/*  72 */     this.endingPrimarySpeaker = -1;
/*  73 */     this.endingNonPrimarySpeaker = -1;
/*  74 */     this.endingSRNotGTR_RelatSpeaker = -1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  79 */   public synchronized int getRev1Who() { return this.rev1Who; }
/*  80 */   public synchronized int getRev1Topic() { return this.rev1Topic; }
/*  81 */   public synchronized int getRev1CharFocus() { return this.rev1CharFocus; }
/*  82 */   public synchronized int getRev2Who() { return this.rev2Who; }
/*  83 */   public synchronized int getRev2Topic() { return this.rev2Topic; }
/*  84 */   public synchronized int getRev2CharFocus() { return this.rev2CharFocus; }
/*  85 */   public synchronized int getRev3Who() { return this.rev3Who; }
/*  86 */   public synchronized int getRev3Topic() { return this.rev3Topic; }
/*  87 */   public synchronized int getRev3CharFocus() { return this.rev3CharFocus; }
/*  88 */   public synchronized boolean getBChallenged() { return this.bChallenged; }
/*  89 */   public synchronized boolean getBChallengedALot() { return this.bChallengedALot; }
/*  90 */   public synchronized int getLitanyA1() { return this.litanyA1; }
/*  91 */   public synchronized int getLitanyA2() { return this.litanyA2; }
/*  92 */   public synchronized int getLitanyA3() { return this.litanyA3; }
/*  93 */   public synchronized int getLitanyB1() { return this.litanyB1; }
/*  94 */   public synchronized int getLitanyB2() { return this.litanyB2; }
/*  95 */   public synchronized int getLitanyB3() { return this.litanyB3; }
/*  96 */   public synchronized int getLitanyC1() { return this.litanyC1; }
/*  97 */   public synchronized int getLitanyC2() { return this.litanyC2; }
/*  98 */   public synchronized int getLitanyC3() { return this.litanyC3; }
/*  99 */   public synchronized int getLitanyD() { return this.litanyD; }
/* 100 */   public synchronized int getLitanyE_CrisisCorrect() { return this.litanyE_CrisisCorrect; }
/* 101 */   public synchronized int getLitanyE_CrisisIncorrect() { return this.litanyE_CrisisIncorrect; }
/* 102 */   public synchronized int getLitanyF() { return this.litanyF; }
/* 103 */   public synchronized int getEndingPrimarySpeaker() { return this.endingPrimarySpeaker; }
/* 104 */   public synchronized int getEndingNonPrimarySpeaker() { return this.endingNonPrimarySpeaker; }
/* 105 */   public synchronized int getEndingSRNotGTR_RelatSpeaker() { return this.endingSRNotGTR_RelatSpeaker; }
/*     */   
/* 107 */   public synchronized void setRev1Who(int paramInt) { this.rev1Who = paramInt; }
/* 108 */   public synchronized void setRev1Topic(int paramInt) { this.rev1Topic = paramInt; }
/* 109 */   public synchronized void setRev1CharFocus(int paramInt) { this.rev1CharFocus = paramInt; }
/* 110 */   public synchronized void setRev2Who(int paramInt) { this.rev2Who = paramInt; }
/* 111 */   public synchronized void setRev2Topic(int paramInt) { this.rev2Topic = paramInt; }
/* 112 */   public synchronized void setRev2CharFocus(int paramInt) { this.rev2CharFocus = paramInt; }
/* 113 */   public synchronized void setRev3Who(int paramInt) { this.rev3Who = paramInt; }
/* 114 */   public synchronized void setRev3Topic(int paramInt) { this.rev3Topic = paramInt; }
/* 115 */   public synchronized void setRev3CharFocus(int paramInt) { this.rev3CharFocus = paramInt; }
/* 116 */   public synchronized void setBChallenged(boolean paramBoolean) { this.bChallenged = paramBoolean; }
/* 117 */   public synchronized void setBChallengedALot(boolean paramBoolean) { this.bChallengedALot = paramBoolean; }
/* 118 */   public synchronized void setLitanyA1(int paramInt) { this.litanyA1 = paramInt; }
/* 119 */   public synchronized void setLitanyA2(int paramInt) { this.litanyA2 = paramInt; }
/* 120 */   public synchronized void setLitanyA3(int paramInt) { this.litanyA3 = paramInt; }
/* 121 */   public synchronized void setLitanyB1(int paramInt) { this.litanyB1 = paramInt; }
/* 122 */   public synchronized void setLitanyB2(int paramInt) { this.litanyB2 = paramInt; }
/* 123 */   public synchronized void setLitanyB3(int paramInt) { this.litanyB3 = paramInt; }
/* 124 */   public synchronized void setLitanyC1(int paramInt) { this.litanyC1 = paramInt; }
/* 125 */   public synchronized void setLitanyC2(int paramInt) { this.litanyC2 = paramInt; }
/* 126 */   public synchronized void setLitanyC3(int paramInt) { this.litanyC3 = paramInt; }
/* 127 */   public synchronized void setLitanyD(int paramInt) { this.litanyD = paramInt; }
/* 128 */   public synchronized void setLitanyE_CrisisCorrect(int paramInt) { this.litanyE_CrisisCorrect = paramInt; }
/* 129 */   public synchronized void setLitanyE_CrisisIncorrect(int paramInt) { this.litanyE_CrisisIncorrect = paramInt; }
/* 130 */   public synchronized void setLitanyF(int paramInt) { this.litanyF = paramInt; }
/* 131 */   public synchronized void setEndingPrimarySpeaker(int paramInt) { this.endingPrimarySpeaker = paramInt; }
/* 132 */   public synchronized void setEndingNonPrimarySpeaker(int paramInt) { this.endingNonPrimarySpeaker = paramInt; }
/* 133 */   public synchronized void setEndingSRNotGTR_RelatSpeaker(int paramInt) { this.endingSRNotGTR_RelatSpeaker = paramInt; }
/*     */   
/*     */ 
/* 136 */   public synchronized String formatRev1CharFocus() { return PrintUtilities.therapyGameCharFocus_EnumToString(getRev1CharFocus()); }
/* 137 */   public synchronized String formatRev2CharFocus() { return PrintUtilities.therapyGameCharFocus_EnumToString(getRev2CharFocus()); }
/* 138 */   public synchronized String formatRev3CharFocus() { return PrintUtilities.therapyGameCharFocus_EnumToString(getRev3CharFocus()); }
/*     */   
/*     */   private class CharFocusEditor extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     int revNum;
/*     */     private static final boolean $noassert = Class.forName("[Lfacade.characters.wmedef.BeatRevelationsP2WME;").getComponentType().desiredAssertionStatus() ^ true;
/*     */     
/*     */     private final int getCharFocus()
/*     */     {
/* 147 */       switch (this.revNum) {
/* 148 */       case 1:  return BeatRevelationsP2WME.this.getRev1CharFocus();
/* 149 */       case 2:  return BeatRevelationsP2WME.this.getRev2CharFocus();
/* 150 */       case 3:  return BeatRevelationsP2WME.this.getRev3CharFocus(); }
/* 151 */       throw new Error("Unexpected revNum");
/*     */     }
/*     */     
/*     */ 
/*     */     CharFocusEditor(int paramInt)
/*     */     {
/* 157 */       super();
/* 158 */       if ((!$noassert) && ((paramInt < 1) || (paramInt > 3))) throw new AssertionError();
/* 159 */       this.revNum = paramInt;
/* 160 */       setEditable(false);
/* 161 */       setSelectedItem(PrintUtilities.therapyGameCharFocus_EnumToString(getCharFocus()));
/*     */     }
/*     */     
/*     */     public String getFieldValue() {
/* 165 */       return Integer.toString(PrintUtilities.therapyGameCharFocus_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/* 168 */     public void setFieldValue(String paramString) { setSelectedItem(PrintUtilities.therapyGameCharFocus_EnumToString(Integer.parseInt(paramString))); }
/*     */   }
/*     */   
/* 171 */   public WMEFieldEditor _getRev1CharFocusEditor() { return new CharFocusEditor(1); }
/* 172 */   public WMEFieldEditor _getRev2CharFocusEditor() { return new CharFocusEditor(2); }
/* 173 */   public WMEFieldEditor _getRev3CharFocusEditor() { return new CharFocusEditor(3); }
/*     */   
/*     */   public BeatRevelationsP2WME() {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatRevelationsP2WME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */