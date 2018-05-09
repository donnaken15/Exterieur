/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import facade.util.StringUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class AnaphoricReferenceWME$ReferenceDecayThread
/*     */   extends Thread
/*     */ {
/*     */   private int refType;
/*     */   final AnaphoricReferenceWME this$0;
/*     */   private static final boolean $noassert = Class.forName("[Lfacade.characters.wmedef.AnaphoricReferenceWME;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   AnaphoricReferenceWME$ReferenceDecayThread(AnaphoricReferenceWME paramAnaphoricReferenceWME, int paramInt)
/*     */   {
/* 152 */     this.refType = paramInt;
/*     */   }
/*     */   
/*     */   public void run() {
/*     */     long l;
/* 157 */     switch (this.refType) {
/*     */     case 0: 
/* 159 */       if ((!$noassert) && (AnaphoricReferenceWME.access$0(this.this$0) <= 0)) throw new AssertionError();
/* 160 */       l = this.this$0.getYouRefTimeout() * 1000;
/* 161 */       break;
/*     */     case 1: 
/* 163 */       if ((!$noassert) && (AnaphoricReferenceWME.access$1(this.this$0) <= 0)) throw new AssertionError();
/* 164 */       l = this.this$0.getHeRefTimeout() * 1000;
/* 165 */       break;
/*     */     case 2: 
/* 167 */       if ((!$noassert) && (AnaphoricReferenceWME.access$2(this.this$0) <= 0)) throw new AssertionError();
/* 168 */       l = this.this$0.getSheRefTimeout() * 1000;
/* 169 */       break;
/*     */     case 3: 
/* 171 */       if ((!$noassert) && (AnaphoricReferenceWME.access$3(this.this$0) <= 0)) throw new AssertionError();
/* 172 */       l = this.this$0.getItRefTimeout() * 1000;
/* 173 */       break;
/*     */     case 4: 
/* 175 */       if ((!$noassert) && (AnaphoricReferenceWME.access$4(this.this$0) <= 0)) throw new AssertionError();
/* 176 */       l = this.this$0.getThisRefTimeout() * 1000;
/* 177 */       break;
/*     */     default: 
/* 179 */       throw new Error("Unexpected anaphoric reference type " + this.refType);
/*     */     }
/*     */     try {
/* 182 */       sleep(l);
/* 183 */       switch (this.refType) {
/*     */       case 0: 
/* 185 */         this.this$0.setYouRef(this.this$0.getYouRefDefault());
/* 186 */         break;
/*     */       case 1: 
/* 188 */         this.this$0.setHeRef(this.this$0.getHeRefDefault());
/* 189 */         break;
/*     */       case 2: 
/* 191 */         this.this$0.setSheRef(this.this$0.getSheRefDefault());
/* 192 */         break;
/*     */       case 3: 
/* 194 */         StringUtil.println("$$$$$ ItRef decayed to default: " + this.this$0.getItRefDefault());
/* 195 */         this.this$0.setItRef(this.this$0.getItRefDefault());
/* 196 */         break;
/*     */       case 4: 
/* 198 */         this.this$0.setThisRef(this.this$0.getThisRefDefault());
/* 199 */         break;
/*     */       default: 
/* 201 */         throw new Error("Unexpected anaphoric reference type " + this.refType);
/*     */       }
/*     */     }
/*     */     catch (InterruptedException localInterruptedException) {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\AnaphoricReferenceWME$ReferenceDecayThread.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */