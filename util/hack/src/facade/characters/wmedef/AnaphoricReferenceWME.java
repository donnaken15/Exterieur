/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import facade.util.PrintUtilities;
/*     */ import javax.swing.JComboBox;
/*     */ import jess.Value;
/*     */ import wm.WMEFieldEditor;
/*     */ 
/*     */ public class AnaphoricReferenceWME extends wm.WME implements facade.util.DAType, facade.util.SpriteID
/*     */ {
/*     */   private static final int YOU = 0;
/*     */   private static final int HE = 1;
/*     */   private static final int SHE = 2;
/*     */   private static final int IT = 3;
/*     */   private static final int THIS = 4;
/*     */   private int youRef;
/*     */   private int youRefDefault;
/*     */   private int youRefTimeout;
/*     */   private int youRefNoOverride;
/*     */   private int youRefDefaultNoOverride;
/*     */   private boolean youRefOverrideByVisibleChar;
/*     */   private Value youRefJV;
/*     */   private Value youRefNoOverrideJV;
/*     */   private Thread youThread;
/*     */   private int heRef;
/*     */   private int heRefDefault;
/*     */   private int heRefTimeout;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  30 */     this.youThread = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  36 */     this.heThread = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  42 */     this.sheThread = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  48 */     this.itThread = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  54 */     this.thisThread = null;
/*     */   }
/*     */   
/*     */ 
/*     */   private final void checkCharacterRef(int paramInt)
/*     */   {
/*  60 */     if ((paramInt < -1) || (paramInt > 2)) {
/*  61 */       throw new RuntimeException("Attempt to set out-of-range character reference in AnaphoricReferenceWME " + paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void checkObjectRef(int paramInt)
/*     */   {
/*  67 */     if (((paramInt < 58) || (paramInt > 61)) && ((paramInt < 71) || (paramInt > 79)) && ((paramInt < 80) || (paramInt > 99)) && (paramInt != -1))
/*     */     {
/*     */ 
/*     */ 
/*  71 */       throw new RuntimeException("Attempt to set out-of-range object reference in AnaphoricReferenceWME " + PrintUtilities.daParam1_EnumToString(paramInt));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public AnaphoricReferenceWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  80 */     jdMethod_this();
/*  81 */     checkCharacterRef(paramInt1);
/*  82 */     checkCharacterRef(paramInt2);
/*  83 */     checkCharacterRef(paramInt4);
/*  84 */     checkCharacterRef(paramInt5);
/*  85 */     checkCharacterRef(paramInt7);
/*  86 */     checkCharacterRef(paramInt8);
/*  87 */     checkObjectRef(paramInt10);
/*  88 */     checkObjectRef(paramInt11);
/*  89 */     checkObjectRef(paramInt13);
/*  90 */     checkObjectRef(paramInt14);
/*     */     
/*  92 */     setYouRef(paramInt1);
/*  93 */     this.youRefDefault = paramInt2;
/*  94 */     this.youRefTimeout = paramInt3;
/*  95 */     this.youRefNoOverride = -1;
/*  96 */     this.youRefOverrideByVisibleChar = false;
/*  97 */     this.youRefDefaultNoOverride = -1;
/*     */     
/*  99 */     setHeRef(paramInt4);
/* 100 */     this.heRefDefault = paramInt5;
/* 101 */     this.heRefTimeout = paramInt6;
/*     */     
/* 103 */     setSheRef(paramInt7);
/* 104 */     this.sheRefDefault = paramInt8;
/* 105 */     this.sheRefTimeout = paramInt9;
/*     */     
/* 107 */     setItRef(paramInt10);
/* 108 */     this.itRefDefault = paramInt11;
/* 109 */     this.itRefTimeout = paramInt12;
/*     */     
/* 111 */     setThisRef(paramInt13);
/* 112 */     this.thisRefDefault = paramInt14;
/* 113 */     this.thisRefTimeout = paramInt15;
/*     */   }
/*     */   
/*     */   public AnaphoricReferenceWME()
/*     */   {
/* 118 */     jdMethod_this();
/* 119 */     setYouRef(-1);
/* 120 */     this.youRefDefault = -1;
/* 121 */     this.youRefNoOverride = -1;
/* 122 */     this.youRefDefaultNoOverride = -1;
/* 123 */     this.youRefTimeout = 30;
/*     */     
/* 125 */     setHeRef(1);
/* 126 */     this.heRefDefault = 1;
/* 127 */     this.heRefTimeout = 30;
/*     */     
/* 129 */     setSheRef(0);
/* 130 */     this.sheRefDefault = 0;
/* 131 */     this.sheRefTimeout = 30;
/*     */     
/* 133 */     setItRef(-1);
/* 134 */     this.itRefDefault = -1;
/* 135 */     this.itRefTimeout = 15;
/*     */     
/* 137 */     setThisRef(-1);
/* 138 */     this.thisRefDefault = -1;
/* 139 */     this.thisRefTimeout = 9999;
/*     */   }
/*     */   
/*     */ 
/*     */   class ReferenceDecayThread
/*     */     extends Thread
/*     */   {
/*     */     private int refType;
/*     */     
/*     */     private static final boolean $noassert = Class.forName("[Lfacade.characters.wmedef.AnaphoricReferenceWME;").getComponentType().desiredAssertionStatus() ^ true;
/*     */     
/*     */     ReferenceDecayThread(int paramInt)
/*     */     {
/* 152 */       this.refType = paramInt;
/*     */     }
/*     */     
/*     */     public void run() {
/*     */       long l;
/* 157 */       switch (this.refType) {
/*     */       case 0: 
/* 159 */         if ((!$noassert) && (AnaphoricReferenceWME.this.youRefTimeout <= 0)) throw new AssertionError();
/* 160 */         l = AnaphoricReferenceWME.this.getYouRefTimeout() * 1000;
/* 161 */         break;
/*     */       case 1: 
/* 163 */         if ((!$noassert) && (AnaphoricReferenceWME.this.heRefTimeout <= 0)) throw new AssertionError();
/* 164 */         l = AnaphoricReferenceWME.this.getHeRefTimeout() * 1000;
/* 165 */         break;
/*     */       case 2: 
/* 167 */         if ((!$noassert) && (AnaphoricReferenceWME.this.sheRefTimeout <= 0)) throw new AssertionError();
/* 168 */         l = AnaphoricReferenceWME.this.getSheRefTimeout() * 1000;
/* 169 */         break;
/*     */       case 3: 
/* 171 */         if ((!$noassert) && (AnaphoricReferenceWME.this.itRefTimeout <= 0)) throw new AssertionError();
/* 172 */         l = AnaphoricReferenceWME.this.getItRefTimeout() * 1000;
/* 173 */         break;
/*     */       case 4: 
/* 175 */         if ((!$noassert) && (AnaphoricReferenceWME.this.thisRefTimeout <= 0)) throw new AssertionError();
/* 176 */         l = AnaphoricReferenceWME.this.getThisRefTimeout() * 1000;
/* 177 */         break;
/*     */       default: 
/* 179 */         throw new Error("Unexpected anaphoric reference type " + this.refType);
/*     */       }
/*     */       try {
/* 182 */         sleep(l);
/* 183 */         switch (this.refType) {
/*     */         case 0: 
/* 185 */           AnaphoricReferenceWME.this.setYouRef(AnaphoricReferenceWME.this.getYouRefDefault());
/* 186 */           break;
/*     */         case 1: 
/* 188 */           AnaphoricReferenceWME.this.setHeRef(AnaphoricReferenceWME.this.getHeRefDefault());
/* 189 */           break;
/*     */         case 2: 
/* 191 */           AnaphoricReferenceWME.this.setSheRef(AnaphoricReferenceWME.this.getSheRefDefault());
/* 192 */           break;
/*     */         case 3: 
/* 194 */           facade.util.StringUtil.println("$$$$$ ItRef decayed to default: " + AnaphoricReferenceWME.this.getItRefDefault());
/* 195 */           AnaphoricReferenceWME.this.setItRef(AnaphoricReferenceWME.this.getItRefDefault());
/* 196 */           break;
/*     */         case 4: 
/* 198 */           AnaphoricReferenceWME.this.setThisRef(AnaphoricReferenceWME.this.getThisRefDefault());
/* 199 */           break;
/*     */         default: 
/* 201 */           throw new Error("Unexpected anaphoric reference type " + this.refType);
/*     */         }
/*     */       }
/*     */       catch (InterruptedException localInterruptedException) {}
/*     */     }
/*     */   }
/*     */   
/*     */   private class CharIDEditor extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     CharIDEditor(int paramInt)
/*     */     {
/* 212 */       super();
/* 213 */       setEditable(false);
/* 214 */       setSelectedItem(PrintUtilities.spriteID_EnumToString(paramInt));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 220 */       return Integer.toString(PrintUtilities.spriteID_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 226 */       setSelectedItem(PrintUtilities.spriteID_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/* 231 */   public WMEFieldEditor _getYouRefEditor() { return new CharIDEditor(getYouRef()); }
/* 232 */   public WMEFieldEditor _getYouRefDefaultEditor() { return new CharIDEditor(getYouRefDefault()); }
/* 233 */   public WMEFieldEditor _getHeRefEditor() { return new CharIDEditor(getHeRef()); }
/* 234 */   public WMEFieldEditor _getHeRefDefaultEditor() { return new CharIDEditor(getHeRefDefault()); }
/* 235 */   public WMEFieldEditor _getSheRefEditor() { return new CharIDEditor(getSheRef()); }
/* 236 */   public WMEFieldEditor _getSheRefDefaultEditor() { return new CharIDEditor(getSheRefDefault()); }
/*     */   
/*     */   private class DAObjectEditor
/*     */     extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     DAObjectEditor(int paramInt)
/*     */     {
/* 243 */       super();
/* 244 */       setEditable(false);
/* 245 */       setSelectedItem(PrintUtilities.daParam1_EnumToString(paramInt));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 251 */       return Integer.toString(PrintUtilities.daParam1_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 257 */       setSelectedItem(PrintUtilities.daParam1_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/* 262 */   public WMEFieldEditor _getItRefEditor() { return new DAObjectEditor(getItRef()); }
/* 263 */   public WMEFieldEditor _getItRefDefaultEditor() { return new DAObjectEditor(getItRefDefault()); }
/*     */   
/* 265 */   public WMEFieldEditor _getThisRefEditor() { return new DAObjectEditor(getThisRef()); }
/* 266 */   public WMEFieldEditor _getThisRefDefaultEditor() { return new DAObjectEditor(getThisRefDefault()); }
/*     */   
/*     */ 
/* 269 */   public synchronized String formatYouRef() { return PrintUtilities.spriteID_EnumToString(getYouRef()); }
/* 270 */   public synchronized String formatYouRefDefault() { return PrintUtilities.spriteID_EnumToString(getYouRefDefault()); }
/* 271 */   public synchronized String formatYouRefNoOverride() { return PrintUtilities.spriteID_EnumToString(getYouRefNoOverride()); }
/* 272 */   public synchronized String formatYouRefDefaultNoOverride() { return PrintUtilities.spriteID_EnumToString(getYouRefDefaultNoOverride()); }
/* 273 */   public synchronized String formatHeRef() { return PrintUtilities.spriteID_EnumToString(getHeRef()); }
/* 274 */   public synchronized String formatHeRefDefault() { return PrintUtilities.spriteID_EnumToString(getHeRefDefault()); }
/* 275 */   public synchronized String formatSheRef() { return PrintUtilities.spriteID_EnumToString(getSheRef()); }
/* 276 */   public synchronized String formatSheRefDefault() { return PrintUtilities.spriteID_EnumToString(getSheRefDefault()); }
/* 277 */   public synchronized String formatItRef() { return PrintUtilities.daParam1_EnumToString(getItRef()); }
/* 278 */   public synchronized String formatItRefDefault() { return PrintUtilities.daParam1_EnumToString(getItRefDefault()); }
/* 279 */   public synchronized String formatThisRef() { return PrintUtilities.daParam1_EnumToString(getThisRef()); }
/* 280 */   public synchronized String formatThisRefDefault() { return PrintUtilities.daParam1_EnumToString(getThisRefDefault()); }
/*     */   
/*     */   private final void resetYouDecayThread()
/*     */   {
/* 284 */     if (getYouRef() != getYouRefDefault()) {
/* 285 */       if (this.youThread != null)
/*     */       {
/* 287 */         this.youThread.interrupt();
/* 288 */         this.youThread = null;
/*     */       }
/* 290 */       if (this.youRefTimeout > 0) {
/* 291 */         this.youThread = new ReferenceDecayThread(0);
/* 292 */         this.youThread.start();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 297 */   public final synchronized int getYouRef() { return this.youRef; }
/*     */   
/*     */ 
/*     */   private Value heRefJV;
/*     */   
/*     */   private Thread heThread;
/*     */   
/*     */   private int sheRef;
/*     */   
/*     */   private int sheRefDefault;
/*     */   
/*     */   private int sheRefTimeout;
/*     */   
/*     */   private Value sheRefJV;
/*     */   private Thread sheThread;
/*     */   private int itRef;
/*     */   private int itRefDefault;
/*     */   private int itRefTimeout;
/*     */   private Value itRefJV;
/*     */   private Thread itThread;
/*     */   private int thisRef;
/*     */   private int thisRefDefault;
/*     */   private int thisRefTimeout;
/*     */   private Value thisRefJV;
/*     */   private Thread thisThread;
/*     */   public final synchronized Value getYouRefJV()
/*     */   {
/* 324 */     return this.youRefJV;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getYouRefDefault()
/*     */   {
/* 335 */     return this.youRefDefault;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getYouRefNoOverride()
/*     */   {
/* 347 */     return this.youRefNoOverride;
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
/*     */   public final synchronized int getYouRefDefaultNoOverride()
/*     */   {
/* 365 */     return this.youRefDefaultNoOverride;
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
/*     */   public final synchronized void saveYouRefToNoOverride()
/*     */   {
/* 383 */     setYouRefNoOverride(getYouRef());
/* 384 */     setYouRefDefaultNoOverride(getYouRefDefault());
/* 385 */     this.youRefOverrideByVisibleChar = true;
/*     */   }
/*     */   
/*     */ 
/*     */   public final synchronized void restoreYouRefFromNoOverride()
/*     */   {
/* 391 */     setYouRef(getYouRefNoOverride());
/* 392 */     setYouRefDefault(getYouRefDefaultNoOverride());
/* 393 */     setYouRefNoOverride(-1);
/* 394 */     setYouRefDefaultNoOverride(-1);
/* 395 */     this.youRefOverrideByVisibleChar = false;
/*     */   }
/*     */   
/* 398 */   public final synchronized Value getYouRefNoOverrideJV() { return this.youRefNoOverrideJV; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getYouRefTimeout()
/*     */   {
/* 409 */     return this.youRefTimeout;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized boolean getYouRefOverrideByVisibleChar()
/*     */   {
/* 421 */     return this.youRefOverrideByVisibleChar;
/*     */   }
/*     */   
/*     */   public final synchronized void setYouRefOverrideByVisibleChar(boolean paramBoolean)
/*     */   {
/* 426 */     this.youRefOverrideByVisibleChar = paramBoolean;
/*     */   }
/*     */   
/*     */   private final void resetHeDecayThread()
/*     */   {
/* 431 */     if (getHeRef() != getHeRefDefault()) {
/* 432 */       if (this.heThread != null)
/*     */       {
/* 434 */         this.heThread.interrupt();
/* 435 */         this.heThread = null;
/*     */       }
/* 437 */       if (this.heRefTimeout > 0) {
/* 438 */         this.heThread = new ReferenceDecayThread(1);
/* 439 */         this.heThread.start();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 444 */   public final synchronized int getHeRef() { return this.heRef; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized Value getHeRefJV()
/*     */   {
/* 460 */     return this.heRefJV;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getHeRefDefault()
/*     */   {
/* 471 */     return this.heRefDefault;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getHeRefTimeout()
/*     */   {
/* 483 */     return this.heRefTimeout;
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
/*     */   private final void resetSheDecayThread()
/*     */   {
/* 498 */     if (getSheRef() != getSheRefDefault()) {
/* 499 */       if (this.sheThread != null)
/*     */       {
/* 501 */         this.sheThread.interrupt();
/* 502 */         this.sheThread = null;
/*     */       }
/* 504 */       if (this.sheRefTimeout > 0) {
/* 505 */         this.sheThread = new ReferenceDecayThread(2);
/* 506 */         this.sheThread.start();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 511 */   public final synchronized int getSheRef() { return this.sheRef; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized Value getSheRefJV()
/*     */   {
/* 527 */     return this.sheRefJV;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getSheRefDefault()
/*     */   {
/* 538 */     return this.sheRefDefault;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getSheRefTimeout()
/*     */   {
/* 550 */     return this.sheRefTimeout;
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
/*     */   private final void resetItDecayThread(boolean paramBoolean)
/*     */   {
/* 565 */     if ((getItRef() != getItRefDefault()) || (paramBoolean)) {
/* 566 */       if (this.itThread != null)
/*     */       {
/* 568 */         this.itThread.interrupt();
/* 569 */         this.itThread = null;
/*     */       }
/* 571 */       if (this.itRefTimeout > 0) {
/* 572 */         this.itThread = new ReferenceDecayThread(3);
/* 573 */         this.itThread.start();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final void resetThisDecayThread()
/*     */   {
/* 580 */     if (getThisRef() != getThisRefDefault()) {
/* 581 */       if (this.thisThread != null)
/*     */       {
/* 583 */         this.thisThread.interrupt();
/* 584 */         this.thisThread = null;
/*     */       }
/* 586 */       if (this.thisRefTimeout > 0) {
/* 587 */         this.thisThread = new ReferenceDecayThread(4);
/* 588 */         this.thisThread.start();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 593 */   public final synchronized int getItRef() { return this.itRef; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized Value getItRefJV()
/*     */   {
/* 609 */     return this.itRefJV;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getItRefDefault()
/*     */   {
/* 620 */     return this.itRefDefault;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getItRefTimeout()
/*     */   {
/* 632 */     return this.itRefTimeout;
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
/*     */   public final synchronized int getThisRef()
/*     */   {
/* 645 */     return this.thisRef;
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
/*     */   public final synchronized Value getThisRefJV()
/*     */   {
/* 661 */     return this.thisRefJV;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getThisRefDefault()
/*     */   {
/* 672 */     return this.thisRefDefault;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final synchronized int getThisRefTimeout()
/*     */   {
/* 684 */     return this.thisRefTimeout;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setYouRef(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 177	facade/characters/wmedef/AnaphoricReferenceWME:youRef	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: iload_1
/*     */     //   21: iconst_m1
/*     */     //   22: if_icmpeq +11 -> 33
/*     */     //   25: aload_0
/*     */     //   26: iload_1
/*     */     //   27: putfield 177	facade/characters/wmedef/AnaphoricReferenceWME:youRef	I
/*     */     //   30: goto +41 -> 71
/*     */     //   33: aload_0
/*     */     //   34: getfield 177	facade/characters/wmedef/AnaphoricReferenceWME:youRef	I
/*     */     //   37: ifeq +29 -> 66
/*     */     //   40: aload_0
/*     */     //   41: getfield 177	facade/characters/wmedef/AnaphoricReferenceWME:youRef	I
/*     */     //   44: iconst_1
/*     */     //   45: if_icmpeq +21 -> 66
/*     */     //   48: ldc -75
/*     */     //   50: invokestatic 185	facade/util/StringUtil:println	(Ljava/lang/String;)V
/*     */     //   53: aload_0
/*     */     //   54: iconst_1
/*     */     //   55: putfield 177	facade/characters/wmedef/AnaphoricReferenceWME:youRef	I
/*     */     //   58: aload_0
/*     */     //   59: getfield 177	facade/characters/wmedef/AnaphoricReferenceWME:youRef	I
/*     */     //   62: istore_2
/*     */     //   63: goto +8 -> 71
/*     */     //   66: ldc -68
/*     */     //   68: invokestatic 185	facade/util/StringUtil:println	(Ljava/lang/String;)V
/*     */     //   71: aload_0
/*     */     //   72: invokespecial 191	facade/characters/wmedef/AnaphoricReferenceWME:resetYouDecayThread	()V
/*     */     //   75: aload_3
/*     */     //   76: monitorexit
/*     */     //   77: aload_0
/*     */     //   78: new 192	jess/Value
/*     */     //   81: dup
/*     */     //   82: aload_0
/*     */     //   83: getfield 177	facade/characters/wmedef/AnaphoricReferenceWME:youRef	I
/*     */     //   86: invokestatic 141	facade/util/PrintUtilities:spriteID_EnumToString	(I)Ljava/lang/String;
/*     */     //   89: iconst_1
/*     */     //   90: invokespecial 196	jess/Value:<init>	(Ljava/lang/String;I)V
/*     */     //   93: invokespecial 200	facade/characters/wmedef/AnaphoricReferenceWME:setYouRefJV	(Ljess/Value;)V
/*     */     //   96: goto +15 -> 111
/*     */     //   99: astore 5
/*     */     //   101: new 57	java/lang/RuntimeException
/*     */     //   104: dup
/*     */     //   105: aload 5
/*     */     //   107: invokespecial 205	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
/*     */     //   110: athrow
/*     */     //   111: aload_0
/*     */     //   112: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   115: ldc -46
/*     */     //   117: iload_2
/*     */     //   118: iload_1
/*     */     //   119: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   122: return
/*     */     // Line number table:
/*     */     //   Java source line #301	-> byte code offset #0
/*     */     //   Java source line #302	-> byte code offset #0
/*     */     //   Java source line #303	-> byte code offset #10
/*     */     //   Java source line #304	-> byte code offset #15
/*     */     //   Java source line #307	-> byte code offset #20
/*     */     //   Java source line #308	-> byte code offset #25
/*     */     //   Java source line #309	-> byte code offset #33
/*     */     //   Java source line #310	-> byte code offset #48
/*     */     //   Java source line #311	-> byte code offset #53
/*     */     //   Java source line #312	-> byte code offset #58
/*     */     //   Java source line #314	-> byte code offset #66
/*     */     //   Java source line #316	-> byte code offset #71
/*     */     //   Java source line #318	-> byte code offset #77
/*     */     //   Java source line #319	-> byte code offset #77
/*     */     //   Java source line #320	-> byte code offset #101
/*     */     //   Java source line #321	-> byte code offset #111
/*     */     //   Java source line #322	-> byte code offset #122
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	123	0	this	AnaphoricReferenceWME
/*     */     //   0	123	1	paramInt	int
/*     */     //   14	104	2	i	int
/*     */     //   3	73	3	Ljava/lang/Object;	Object
/*     */     //   99	7	5	localJessException	jess.JessException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	77	3	finally
/*     */     //   77	96	99	jess/JessException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final void setYouRefJV(Value paramValue)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 220	facade/characters/wmedef/AnaphoricReferenceWME:youRefJV	Ljess/Value;
/*     */     //   14: astore_2
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: putfield 220	facade/characters/wmedef/AnaphoricReferenceWME:youRefJV	Ljess/Value;
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc -35
/*     */     //   28: aload_2
/*     */     //   29: aload_1
/*     */     //   30: invokevirtual 224	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #327	-> byte code offset #0
/*     */     //   Java source line #328	-> byte code offset #0
/*     */     //   Java source line #329	-> byte code offset #10
/*     */     //   Java source line #330	-> byte code offset #15
/*     */     //   Java source line #332	-> byte code offset #22
/*     */     //   Java source line #333	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	AnaphoricReferenceWME
/*     */     //   0	34	1	paramValue	Value
/*     */     //   14	15	2	localValue	Value
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setYouRefDefault(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 226	facade/characters/wmedef/AnaphoricReferenceWME:youRefDefault	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 226	facade/characters/wmedef/AnaphoricReferenceWME:youRefDefault	I
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   31: ldc -28
/*     */     //   33: iload_2
/*     */     //   34: iload_1
/*     */     //   35: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   38: return
/*     */     // Line number table:
/*     */     //   Java source line #338	-> byte code offset #0
/*     */     //   Java source line #339	-> byte code offset #0
/*     */     //   Java source line #340	-> byte code offset #10
/*     */     //   Java source line #341	-> byte code offset #15
/*     */     //   Java source line #342	-> byte code offset #20
/*     */     //   Java source line #344	-> byte code offset #27
/*     */     //   Java source line #345	-> byte code offset #38
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	this	AnaphoricReferenceWME
/*     */     //   0	39	1	paramInt	int
/*     */     //   14	20	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setYouRefNoOverride(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 230	facade/characters/wmedef/AnaphoricReferenceWME:youRefNoOverride	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 230	facade/characters/wmedef/AnaphoricReferenceWME:youRefNoOverride	I
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: new 192	jess/Value
/*     */     //   31: dup
/*     */     //   32: aload_0
/*     */     //   33: getfield 230	facade/characters/wmedef/AnaphoricReferenceWME:youRefNoOverride	I
/*     */     //   36: invokestatic 141	facade/util/PrintUtilities:spriteID_EnumToString	(I)Ljava/lang/String;
/*     */     //   39: iconst_1
/*     */     //   40: invokespecial 196	jess/Value:<init>	(Ljava/lang/String;I)V
/*     */     //   43: invokespecial 234	facade/characters/wmedef/AnaphoricReferenceWME:setYouRefNoOverrideJV	(Ljess/Value;)V
/*     */     //   46: goto +15 -> 61
/*     */     //   49: astore 5
/*     */     //   51: new 57	java/lang/RuntimeException
/*     */     //   54: dup
/*     */     //   55: aload 5
/*     */     //   57: invokespecial 205	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
/*     */     //   60: athrow
/*     */     //   61: aload_0
/*     */     //   62: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   65: ldc -21
/*     */     //   67: iload_2
/*     */     //   68: iload_1
/*     */     //   69: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   72: return
/*     */     // Line number table:
/*     */     //   Java source line #353	-> byte code offset #0
/*     */     //   Java source line #354	-> byte code offset #0
/*     */     //   Java source line #355	-> byte code offset #10
/*     */     //   Java source line #356	-> byte code offset #15
/*     */     //   Java source line #357	-> byte code offset #20
/*     */     //   Java source line #359	-> byte code offset #27
/*     */     //   Java source line #360	-> byte code offset #27
/*     */     //   Java source line #361	-> byte code offset #51
/*     */     //   Java source line #362	-> byte code offset #61
/*     */     //   Java source line #363	-> byte code offset #72
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	73	0	this	AnaphoricReferenceWME
/*     */     //   0	73	1	paramInt	int
/*     */     //   14	54	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     //   49	7	5	localJessException	jess.JessException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */     //   27	46	49	jess/JessException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setYouRefDefaultNoOverride(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 237	facade/characters/wmedef/AnaphoricReferenceWME:youRefDefaultNoOverride	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 237	facade/characters/wmedef/AnaphoricReferenceWME:youRefDefaultNoOverride	I
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   31: ldc -17
/*     */     //   33: iload_2
/*     */     //   34: iload_1
/*     */     //   35: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   38: return
/*     */     // Line number table:
/*     */     //   Java source line #368	-> byte code offset #0
/*     */     //   Java source line #369	-> byte code offset #0
/*     */     //   Java source line #370	-> byte code offset #10
/*     */     //   Java source line #371	-> byte code offset #15
/*     */     //   Java source line #372	-> byte code offset #20
/*     */     //   Java source line #374	-> byte code offset #27
/*     */     //   Java source line #375	-> byte code offset #38
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	this	AnaphoricReferenceWME
/*     */     //   0	39	1	paramInt	int
/*     */     //   14	20	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final synchronized void setYouRefNoOverrideJV(Value paramValue)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 254	facade/characters/wmedef/AnaphoricReferenceWME:youRefNoOverrideJV	Ljess/Value;
/*     */     //   14: astore_2
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: putfield 254	facade/characters/wmedef/AnaphoricReferenceWME:youRefNoOverrideJV	Ljess/Value;
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc -1
/*     */     //   28: aload_2
/*     */     //   29: aload_1
/*     */     //   30: invokevirtual 224	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #401	-> byte code offset #0
/*     */     //   Java source line #402	-> byte code offset #0
/*     */     //   Java source line #403	-> byte code offset #10
/*     */     //   Java source line #404	-> byte code offset #15
/*     */     //   Java source line #406	-> byte code offset #22
/*     */     //   Java source line #407	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	AnaphoricReferenceWME
/*     */     //   0	34	1	paramValue	Value
/*     */     //   14	15	2	localValue	Value
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setYouRefTimeout(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 169	facade/characters/wmedef/AnaphoricReferenceWME:youRefTimeout	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 169	facade/characters/wmedef/AnaphoricReferenceWME:youRefTimeout	I
/*     */     //   20: aload_0
/*     */     //   21: invokespecial 191	facade/characters/wmedef/AnaphoricReferenceWME:resetYouDecayThread	()V
/*     */     //   24: aload_3
/*     */     //   25: monitorexit
/*     */     //   26: aload_0
/*     */     //   27: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   30: ldc_w 258
/*     */     //   33: iload_2
/*     */     //   34: iload_1
/*     */     //   35: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   38: return
/*     */     // Line number table:
/*     */     //   Java source line #412	-> byte code offset #0
/*     */     //   Java source line #413	-> byte code offset #0
/*     */     //   Java source line #414	-> byte code offset #10
/*     */     //   Java source line #415	-> byte code offset #15
/*     */     //   Java source line #416	-> byte code offset #20
/*     */     //   Java source line #418	-> byte code offset #26
/*     */     //   Java source line #419	-> byte code offset #38
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	this	AnaphoricReferenceWME
/*     */     //   0	39	1	paramInt	int
/*     */     //   14	20	2	i	int
/*     */     //   3	22	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	26	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setHeRef(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 269	facade/characters/wmedef/AnaphoricReferenceWME:heRef	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 269	facade/characters/wmedef/AnaphoricReferenceWME:heRef	I
/*     */     //   25: aload_0
/*     */     //   26: invokespecial 272	facade/characters/wmedef/AnaphoricReferenceWME:resetHeDecayThread	()V
/*     */     //   29: aload_3
/*     */     //   30: monitorexit
/*     */     //   31: aload_0
/*     */     //   32: new 192	jess/Value
/*     */     //   35: dup
/*     */     //   36: aload_0
/*     */     //   37: getfield 269	facade/characters/wmedef/AnaphoricReferenceWME:heRef	I
/*     */     //   40: invokestatic 141	facade/util/PrintUtilities:spriteID_EnumToString	(I)Ljava/lang/String;
/*     */     //   43: iconst_1
/*     */     //   44: invokespecial 196	jess/Value:<init>	(Ljava/lang/String;I)V
/*     */     //   47: invokevirtual 275	facade/characters/wmedef/AnaphoricReferenceWME:setHeRefJV	(Ljess/Value;)V
/*     */     //   50: goto +15 -> 65
/*     */     //   53: astore 5
/*     */     //   55: new 57	java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: aload 5
/*     */     //   61: invokespecial 205	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
/*     */     //   64: athrow
/*     */     //   65: aload_0
/*     */     //   66: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   69: ldc_w 276
/*     */     //   72: iload_2
/*     */     //   73: iload_1
/*     */     //   74: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   77: return
/*     */     // Line number table:
/*     */     //   Java source line #447	-> byte code offset #0
/*     */     //   Java source line #448	-> byte code offset #0
/*     */     //   Java source line #449	-> byte code offset #10
/*     */     //   Java source line #450	-> byte code offset #15
/*     */     //   Java source line #451	-> byte code offset #20
/*     */     //   Java source line #452	-> byte code offset #25
/*     */     //   Java source line #454	-> byte code offset #31
/*     */     //   Java source line #455	-> byte code offset #31
/*     */     //   Java source line #456	-> byte code offset #55
/*     */     //   Java source line #457	-> byte code offset #65
/*     */     //   Java source line #458	-> byte code offset #77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	78	0	this	AnaphoricReferenceWME
/*     */     //   0	78	1	paramInt	int
/*     */     //   14	59	2	i	int
/*     */     //   3	27	3	Ljava/lang/Object;	Object
/*     */     //   53	7	5	localJessException	jess.JessException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	31	3	finally
/*     */     //   31	50	53	jess/JessException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setHeRefJV(Value paramValue)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 279	facade/characters/wmedef/AnaphoricReferenceWME:heRefJV	Ljess/Value;
/*     */     //   14: astore_2
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: putfield 279	facade/characters/wmedef/AnaphoricReferenceWME:heRefJV	Ljess/Value;
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc_w 280
/*     */     //   29: aload_2
/*     */     //   30: aload_1
/*     */     //   31: invokevirtual 224	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line #463	-> byte code offset #0
/*     */     //   Java source line #464	-> byte code offset #0
/*     */     //   Java source line #465	-> byte code offset #10
/*     */     //   Java source line #466	-> byte code offset #15
/*     */     //   Java source line #468	-> byte code offset #22
/*     */     //   Java source line #469	-> byte code offset #34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	this	AnaphoricReferenceWME
/*     */     //   0	35	1	paramValue	Value
/*     */     //   14	16	2	localValue	Value
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setHeRefDefault(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 282	facade/characters/wmedef/AnaphoricReferenceWME:heRefDefault	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 282	facade/characters/wmedef/AnaphoricReferenceWME:heRefDefault	I
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   31: ldc_w 284
/*     */     //   34: iload_2
/*     */     //   35: iload_1
/*     */     //   36: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   39: return
/*     */     // Line number table:
/*     */     //   Java source line #474	-> byte code offset #0
/*     */     //   Java source line #475	-> byte code offset #0
/*     */     //   Java source line #476	-> byte code offset #10
/*     */     //   Java source line #477	-> byte code offset #15
/*     */     //   Java source line #478	-> byte code offset #20
/*     */     //   Java source line #480	-> byte code offset #27
/*     */     //   Java source line #481	-> byte code offset #39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	40	0	this	AnaphoricReferenceWME
/*     */     //   0	40	1	paramInt	int
/*     */     //   14	21	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setHeRefTimeout(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 267	facade/characters/wmedef/AnaphoricReferenceWME:heRefTimeout	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 267	facade/characters/wmedef/AnaphoricReferenceWME:heRefTimeout	I
/*     */     //   20: aload_0
/*     */     //   21: invokespecial 272	facade/characters/wmedef/AnaphoricReferenceWME:resetHeDecayThread	()V
/*     */     //   24: aload_3
/*     */     //   25: monitorexit
/*     */     //   26: aload_0
/*     */     //   27: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   30: ldc_w 287
/*     */     //   33: iload_2
/*     */     //   34: iload_1
/*     */     //   35: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   38: return
/*     */     // Line number table:
/*     */     //   Java source line #486	-> byte code offset #0
/*     */     //   Java source line #487	-> byte code offset #0
/*     */     //   Java source line #488	-> byte code offset #10
/*     */     //   Java source line #489	-> byte code offset #15
/*     */     //   Java source line #490	-> byte code offset #20
/*     */     //   Java source line #492	-> byte code offset #26
/*     */     //   Java source line #493	-> byte code offset #38
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	this	AnaphoricReferenceWME
/*     */     //   0	39	1	paramInt	int
/*     */     //   14	20	2	i	int
/*     */     //   3	22	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	26	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setSheRef(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 294	facade/characters/wmedef/AnaphoricReferenceWME:sheRef	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 294	facade/characters/wmedef/AnaphoricReferenceWME:sheRef	I
/*     */     //   25: aload_0
/*     */     //   26: invokespecial 297	facade/characters/wmedef/AnaphoricReferenceWME:resetSheDecayThread	()V
/*     */     //   29: aload_3
/*     */     //   30: monitorexit
/*     */     //   31: aload_0
/*     */     //   32: new 192	jess/Value
/*     */     //   35: dup
/*     */     //   36: aload_0
/*     */     //   37: getfield 294	facade/characters/wmedef/AnaphoricReferenceWME:sheRef	I
/*     */     //   40: invokestatic 141	facade/util/PrintUtilities:spriteID_EnumToString	(I)Ljava/lang/String;
/*     */     //   43: iconst_1
/*     */     //   44: invokespecial 196	jess/Value:<init>	(Ljava/lang/String;I)V
/*     */     //   47: invokevirtual 300	facade/characters/wmedef/AnaphoricReferenceWME:setSheRefJV	(Ljess/Value;)V
/*     */     //   50: goto +15 -> 65
/*     */     //   53: astore 5
/*     */     //   55: new 57	java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: aload 5
/*     */     //   61: invokespecial 205	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
/*     */     //   64: athrow
/*     */     //   65: aload_0
/*     */     //   66: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   69: ldc_w 301
/*     */     //   72: iload_2
/*     */     //   73: iload_1
/*     */     //   74: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   77: return
/*     */     // Line number table:
/*     */     //   Java source line #514	-> byte code offset #0
/*     */     //   Java source line #515	-> byte code offset #0
/*     */     //   Java source line #516	-> byte code offset #10
/*     */     //   Java source line #517	-> byte code offset #15
/*     */     //   Java source line #518	-> byte code offset #20
/*     */     //   Java source line #519	-> byte code offset #25
/*     */     //   Java source line #521	-> byte code offset #31
/*     */     //   Java source line #522	-> byte code offset #31
/*     */     //   Java source line #523	-> byte code offset #55
/*     */     //   Java source line #524	-> byte code offset #65
/*     */     //   Java source line #525	-> byte code offset #77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	78	0	this	AnaphoricReferenceWME
/*     */     //   0	78	1	paramInt	int
/*     */     //   14	59	2	i	int
/*     */     //   3	27	3	Ljava/lang/Object;	Object
/*     */     //   53	7	5	localJessException	jess.JessException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	31	3	finally
/*     */     //   31	50	53	jess/JessException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setSheRefJV(Value paramValue)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 304	facade/characters/wmedef/AnaphoricReferenceWME:sheRefJV	Ljess/Value;
/*     */     //   14: astore_2
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: putfield 304	facade/characters/wmedef/AnaphoricReferenceWME:sheRefJV	Ljess/Value;
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc_w 305
/*     */     //   29: aload_2
/*     */     //   30: aload_1
/*     */     //   31: invokevirtual 224	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line #530	-> byte code offset #0
/*     */     //   Java source line #531	-> byte code offset #0
/*     */     //   Java source line #532	-> byte code offset #10
/*     */     //   Java source line #533	-> byte code offset #15
/*     */     //   Java source line #535	-> byte code offset #22
/*     */     //   Java source line #536	-> byte code offset #34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	this	AnaphoricReferenceWME
/*     */     //   0	35	1	paramValue	Value
/*     */     //   14	16	2	localValue	Value
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setSheRefDefault(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 307	facade/characters/wmedef/AnaphoricReferenceWME:sheRefDefault	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 180	facade/characters/wmedef/AnaphoricReferenceWME:checkCharacterRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 307	facade/characters/wmedef/AnaphoricReferenceWME:sheRefDefault	I
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   31: ldc_w 309
/*     */     //   34: iload_2
/*     */     //   35: iload_1
/*     */     //   36: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   39: return
/*     */     // Line number table:
/*     */     //   Java source line #541	-> byte code offset #0
/*     */     //   Java source line #542	-> byte code offset #0
/*     */     //   Java source line #543	-> byte code offset #10
/*     */     //   Java source line #544	-> byte code offset #15
/*     */     //   Java source line #545	-> byte code offset #20
/*     */     //   Java source line #547	-> byte code offset #27
/*     */     //   Java source line #548	-> byte code offset #39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	40	0	this	AnaphoricReferenceWME
/*     */     //   0	40	1	paramInt	int
/*     */     //   14	21	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setSheRefTimeout(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 292	facade/characters/wmedef/AnaphoricReferenceWME:sheRefTimeout	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 292	facade/characters/wmedef/AnaphoricReferenceWME:sheRefTimeout	I
/*     */     //   20: aload_0
/*     */     //   21: invokespecial 297	facade/characters/wmedef/AnaphoricReferenceWME:resetSheDecayThread	()V
/*     */     //   24: aload_3
/*     */     //   25: monitorexit
/*     */     //   26: aload_0
/*     */     //   27: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   30: ldc_w 312
/*     */     //   33: iload_2
/*     */     //   34: iload_1
/*     */     //   35: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   38: return
/*     */     // Line number table:
/*     */     //   Java source line #553	-> byte code offset #0
/*     */     //   Java source line #554	-> byte code offset #0
/*     */     //   Java source line #555	-> byte code offset #10
/*     */     //   Java source line #556	-> byte code offset #15
/*     */     //   Java source line #557	-> byte code offset #20
/*     */     //   Java source line #559	-> byte code offset #26
/*     */     //   Java source line #560	-> byte code offset #38
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	this	AnaphoricReferenceWME
/*     */     //   0	39	1	paramInt	int
/*     */     //   14	20	2	i	int
/*     */     //   3	22	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	26	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setItRef(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 324	facade/characters/wmedef/AnaphoricReferenceWME:itRef	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 327	facade/characters/wmedef/AnaphoricReferenceWME:checkObjectRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 324	facade/characters/wmedef/AnaphoricReferenceWME:itRef	I
/*     */     //   25: aload_0
/*     */     //   26: iconst_0
/*     */     //   27: invokespecial 329	facade/characters/wmedef/AnaphoricReferenceWME:resetItDecayThread	(Z)V
/*     */     //   30: aload_3
/*     */     //   31: monitorexit
/*     */     //   32: aload_0
/*     */     //   33: new 192	jess/Value
/*     */     //   36: dup
/*     */     //   37: aload_0
/*     */     //   38: getfield 324	facade/characters/wmedef/AnaphoricReferenceWME:itRef	I
/*     */     //   41: invokestatic 82	facade/util/PrintUtilities:daParam1_EnumToString	(I)Ljava/lang/String;
/*     */     //   44: iconst_1
/*     */     //   45: invokespecial 196	jess/Value:<init>	(Ljava/lang/String;I)V
/*     */     //   48: invokevirtual 332	facade/characters/wmedef/AnaphoricReferenceWME:setItRefJV	(Ljess/Value;)V
/*     */     //   51: goto +15 -> 66
/*     */     //   54: astore 5
/*     */     //   56: new 57	java/lang/RuntimeException
/*     */     //   59: dup
/*     */     //   60: aload 5
/*     */     //   62: invokespecial 205	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
/*     */     //   65: athrow
/*     */     //   66: aload_0
/*     */     //   67: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   70: ldc_w 333
/*     */     //   73: iload_2
/*     */     //   74: iload_1
/*     */     //   75: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   78: return
/*     */     // Line number table:
/*     */     //   Java source line #596	-> byte code offset #0
/*     */     //   Java source line #597	-> byte code offset #0
/*     */     //   Java source line #598	-> byte code offset #10
/*     */     //   Java source line #599	-> byte code offset #15
/*     */     //   Java source line #600	-> byte code offset #20
/*     */     //   Java source line #601	-> byte code offset #25
/*     */     //   Java source line #603	-> byte code offset #32
/*     */     //   Java source line #604	-> byte code offset #32
/*     */     //   Java source line #605	-> byte code offset #56
/*     */     //   Java source line #606	-> byte code offset #66
/*     */     //   Java source line #607	-> byte code offset #78
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	79	0	this	AnaphoricReferenceWME
/*     */     //   0	79	1	paramInt	int
/*     */     //   14	60	2	i	int
/*     */     //   3	28	3	Ljava/lang/Object;	Object
/*     */     //   54	7	5	localJessException	jess.JessException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	32	3	finally
/*     */     //   32	51	54	jess/JessException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setItRefJV(Value paramValue)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 336	facade/characters/wmedef/AnaphoricReferenceWME:itRefJV	Ljess/Value;
/*     */     //   14: astore_2
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: putfield 336	facade/characters/wmedef/AnaphoricReferenceWME:itRefJV	Ljess/Value;
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc_w 337
/*     */     //   29: aload_2
/*     */     //   30: aload_1
/*     */     //   31: invokevirtual 224	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line #612	-> byte code offset #0
/*     */     //   Java source line #613	-> byte code offset #0
/*     */     //   Java source line #614	-> byte code offset #10
/*     */     //   Java source line #615	-> byte code offset #15
/*     */     //   Java source line #617	-> byte code offset #22
/*     */     //   Java source line #618	-> byte code offset #34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	this	AnaphoricReferenceWME
/*     */     //   0	35	1	paramValue	Value
/*     */     //   14	16	2	localValue	Value
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setItRefDefault(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 339	facade/characters/wmedef/AnaphoricReferenceWME:itRefDefault	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 327	facade/characters/wmedef/AnaphoricReferenceWME:checkObjectRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 339	facade/characters/wmedef/AnaphoricReferenceWME:itRefDefault	I
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   31: ldc_w 341
/*     */     //   34: iload_2
/*     */     //   35: iload_1
/*     */     //   36: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   39: return
/*     */     // Line number table:
/*     */     //   Java source line #623	-> byte code offset #0
/*     */     //   Java source line #624	-> byte code offset #0
/*     */     //   Java source line #625	-> byte code offset #10
/*     */     //   Java source line #626	-> byte code offset #15
/*     */     //   Java source line #627	-> byte code offset #20
/*     */     //   Java source line #629	-> byte code offset #27
/*     */     //   Java source line #630	-> byte code offset #39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	40	0	this	AnaphoricReferenceWME
/*     */     //   0	40	1	paramInt	int
/*     */     //   14	21	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setItRefTimeout(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 317	facade/characters/wmedef/AnaphoricReferenceWME:itRefTimeout	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 317	facade/characters/wmedef/AnaphoricReferenceWME:itRefTimeout	I
/*     */     //   20: aload_0
/*     */     //   21: iconst_1
/*     */     //   22: invokespecial 329	facade/characters/wmedef/AnaphoricReferenceWME:resetItDecayThread	(Z)V
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   31: ldc_w 344
/*     */     //   34: iload_2
/*     */     //   35: iload_1
/*     */     //   36: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   39: return
/*     */     // Line number table:
/*     */     //   Java source line #635	-> byte code offset #0
/*     */     //   Java source line #636	-> byte code offset #0
/*     */     //   Java source line #637	-> byte code offset #10
/*     */     //   Java source line #638	-> byte code offset #15
/*     */     //   Java source line #639	-> byte code offset #20
/*     */     //   Java source line #641	-> byte code offset #27
/*     */     //   Java source line #642	-> byte code offset #39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	40	0	this	AnaphoricReferenceWME
/*     */     //   0	40	1	paramInt	int
/*     */     //   14	21	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setThisRef(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 346	facade/characters/wmedef/AnaphoricReferenceWME:thisRef	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 327	facade/characters/wmedef/AnaphoricReferenceWME:checkObjectRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 346	facade/characters/wmedef/AnaphoricReferenceWME:thisRef	I
/*     */     //   25: aload_0
/*     */     //   26: invokespecial 349	facade/characters/wmedef/AnaphoricReferenceWME:resetThisDecayThread	()V
/*     */     //   29: aload_3
/*     */     //   30: monitorexit
/*     */     //   31: aload_0
/*     */     //   32: new 192	jess/Value
/*     */     //   35: dup
/*     */     //   36: aload_0
/*     */     //   37: getfield 346	facade/characters/wmedef/AnaphoricReferenceWME:thisRef	I
/*     */     //   40: invokestatic 82	facade/util/PrintUtilities:daParam1_EnumToString	(I)Ljava/lang/String;
/*     */     //   43: iconst_1
/*     */     //   44: invokespecial 196	jess/Value:<init>	(Ljava/lang/String;I)V
/*     */     //   47: invokevirtual 352	facade/characters/wmedef/AnaphoricReferenceWME:setThisRefJV	(Ljess/Value;)V
/*     */     //   50: goto +15 -> 65
/*     */     //   53: astore 5
/*     */     //   55: new 57	java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: aload 5
/*     */     //   61: invokespecial 205	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
/*     */     //   64: athrow
/*     */     //   65: aload_0
/*     */     //   66: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   69: ldc_w 353
/*     */     //   72: iload_2
/*     */     //   73: iload_1
/*     */     //   74: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   77: return
/*     */     // Line number table:
/*     */     //   Java source line #648	-> byte code offset #0
/*     */     //   Java source line #649	-> byte code offset #0
/*     */     //   Java source line #650	-> byte code offset #10
/*     */     //   Java source line #651	-> byte code offset #15
/*     */     //   Java source line #652	-> byte code offset #20
/*     */     //   Java source line #653	-> byte code offset #25
/*     */     //   Java source line #655	-> byte code offset #31
/*     */     //   Java source line #656	-> byte code offset #31
/*     */     //   Java source line #657	-> byte code offset #55
/*     */     //   Java source line #658	-> byte code offset #65
/*     */     //   Java source line #659	-> byte code offset #77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	78	0	this	AnaphoricReferenceWME
/*     */     //   0	78	1	paramInt	int
/*     */     //   14	59	2	i	int
/*     */     //   3	27	3	Ljava/lang/Object;	Object
/*     */     //   53	7	5	localJessException	jess.JessException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	31	3	finally
/*     */     //   31	50	53	jess/JessException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setThisRefJV(Value paramValue)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 356	facade/characters/wmedef/AnaphoricReferenceWME:thisRefJV	Ljess/Value;
/*     */     //   14: astore_2
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: putfield 356	facade/characters/wmedef/AnaphoricReferenceWME:thisRefJV	Ljess/Value;
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc_w 357
/*     */     //   29: aload_2
/*     */     //   30: aload_1
/*     */     //   31: invokevirtual 224	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line #664	-> byte code offset #0
/*     */     //   Java source line #665	-> byte code offset #0
/*     */     //   Java source line #666	-> byte code offset #10
/*     */     //   Java source line #667	-> byte code offset #15
/*     */     //   Java source line #669	-> byte code offset #22
/*     */     //   Java source line #670	-> byte code offset #34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	this	AnaphoricReferenceWME
/*     */     //   0	35	1	paramValue	Value
/*     */     //   14	16	2	localValue	Value
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setThisRefDefault(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 359	facade/characters/wmedef/AnaphoricReferenceWME:thisRefDefault	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: invokespecial 327	facade/characters/wmedef/AnaphoricReferenceWME:checkObjectRef	(I)V
/*     */     //   20: aload_0
/*     */     //   21: iload_1
/*     */     //   22: putfield 359	facade/characters/wmedef/AnaphoricReferenceWME:thisRefDefault	I
/*     */     //   25: aload_3
/*     */     //   26: monitorexit
/*     */     //   27: aload_0
/*     */     //   28: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   31: ldc_w 361
/*     */     //   34: iload_2
/*     */     //   35: iload_1
/*     */     //   36: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   39: return
/*     */     // Line number table:
/*     */     //   Java source line #675	-> byte code offset #0
/*     */     //   Java source line #676	-> byte code offset #0
/*     */     //   Java source line #677	-> byte code offset #10
/*     */     //   Java source line #678	-> byte code offset #15
/*     */     //   Java source line #679	-> byte code offset #20
/*     */     //   Java source line #681	-> byte code offset #27
/*     */     //   Java source line #682	-> byte code offset #39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	40	0	this	AnaphoricReferenceWME
/*     */     //   0	40	1	paramInt	int
/*     */     //   14	21	2	i	int
/*     */     //   3	23	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	27	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void setThisRefTimeout(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 322	facade/characters/wmedef/AnaphoricReferenceWME:thisRefTimeout	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 322	facade/characters/wmedef/AnaphoricReferenceWME:thisRefTimeout	I
/*     */     //   20: aload_0
/*     */     //   21: invokespecial 349	facade/characters/wmedef/AnaphoricReferenceWME:resetThisDecayThread	()V
/*     */     //   24: aload_3
/*     */     //   25: monitorexit
/*     */     //   26: aload_0
/*     */     //   27: getfield 209	facade/characters/wmedef/AnaphoricReferenceWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   30: ldc_w 364
/*     */     //   33: iload_2
/*     */     //   34: iload_1
/*     */     //   35: invokevirtual 214	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   38: return
/*     */     // Line number table:
/*     */     //   Java source line #687	-> byte code offset #0
/*     */     //   Java source line #688	-> byte code offset #0
/*     */     //   Java source line #689	-> byte code offset #10
/*     */     //   Java source line #690	-> byte code offset #15
/*     */     //   Java source line #691	-> byte code offset #20
/*     */     //   Java source line #693	-> byte code offset #26
/*     */     //   Java source line #694	-> byte code offset #38
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	this	AnaphoricReferenceWME
/*     */     //   0	39	1	paramInt	int
/*     */     //   14	20	2	i	int
/*     */     //   3	22	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	26	3	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AnaphoricReferenceWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */