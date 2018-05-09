/*     */ package TemplateCompiler;
/*     */ 
/*     */ import abl.runtime.RuntimeError;
/*     */ import dramaman.runtime.DramaManager;
/*     */ import dramaman.runtime.StoryStatusWME;
/*     */ import facade.characters.wmedef.AnaphoricReferenceWME;
/*     */ import facade.characters.wmedef.PlayerRecentlyTypedTextWME;
/*     */ import facade.characters.wmedef.PostBeatMixinInfoWME;
/*     */ import facade.characters.wmedef.UserTestWME;
/*     */ import facade.nativeinterface.NativeAnimationInterface;
/*     */ import facade.util.StringUtil;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.HashSet;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.zip.InflaterInputStream;
/*     */ import jess.Fact;
/*     */ import jess.JessException;
/*     */ import jess.Rete;
/*     */ import jess.Value;
/*     */ import jess.ValueVector;
/*     */ import wm.WorkingMemory;
/*     */ 
/*     */ public class NLUMain implements facade.util.BeatConstants, facade.util.FullExpressions
/*     */ {
/*     */   private final void jdMethod_this()
/*     */   {
/*  34 */     this.bWaitForGToStartDramaManager = false;
/*     */     
/*  36 */     this.bStartedTheDramaManager = false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  41 */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.NLUMain;").getComponentType().desiredAssertionStatus() ^ true; private boolean bStartedTheDramaManager; private boolean bWaitForGToStartDramaManager; private WorkingMemory graceMemory; private WorkingMemory tripMemory; private WorkingMemory playerMemory; private TimeOut to; private Hashtable templateNameToTemplates; private Hashtable beatNameToTemplateName; private Rete nluEngine; private static final Set activeContexts = new HashSet();
/*     */   
/*     */ 
/*     */ 
/*     */   static void processJessException(JessException paramJessException)
/*     */   {
/*  47 */     if (paramJessException.getCause() != null)
/*  48 */       System.out.println(paramJessException.getCause());
/*  49 */     System.out.println(paramJessException.getRoutine() + ' ' + paramJessException.getContext() + ' ' + paramJessException.getProgramText() + ' ' + paramJessException.getData() + ' ' + paramJessException.getLineNumber());
/*  50 */     throw new RuntimeException(paramJessException.getMessage());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private final synchronized void StartTheDramaManager()
/*     */   {
/*  58 */     System.out.println("Starting the drama manager...");
/*  59 */     LinkedList localLinkedList = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  60 */     if ((!$noassert) && (localLinkedList.size() != 1)) throw new AssertionError();
/*  61 */     ((StoryStatusWME)localLinkedList.get(0)).setDramaManagerEnabled(true);
/*  62 */     DramaManager.getDramaManager().initializeDramaManagerState();
/*  63 */     DramaManager.getDramaManager().startManaging();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private final synchronized void processPlayerText()
/*     */   {
/*  71 */     String str1 = NativeAnimationInterface.textSensor();
/*     */     LinkedList localLinkedList;
/*     */     PlayerRecentlyTypedTextWME localPlayerRecentlyTypedTextWME;
/*  74 */     if (str1.equals(" "))
/*     */     {
/*  76 */       localLinkedList = this.playerMemory.lookupWME("PlayerRecentlyTypedTextWME");
/*  77 */       if (localLinkedList.size() != 0) {
/*  78 */         localPlayerRecentlyTypedTextWME = (PlayerRecentlyTypedTextWME)localLinkedList.get(0);
/*  79 */         localPlayerRecentlyTypedTextWME.setB(true);
/*  80 */         localPlayerRecentlyTypedTextWME.setTimestamp(System.currentTimeMillis());
/*     */       }
/*     */     }
/*  83 */     else if (!str1.equals(""))
/*     */     {
/*     */ 
/*     */ 
/*  87 */       localLinkedList = this.playerMemory.lookupWME("PlayerRecentlyTypedTextWME");
/*  88 */       if (localLinkedList.size() != 0) {
/*  89 */         localPlayerRecentlyTypedTextWME = (PlayerRecentlyTypedTextWME)localLinkedList.get(0);
/*  90 */         localPlayerRecentlyTypedTextWME.setB(false);
/*     */       }
/*     */       
/*     */ 
/*  94 */       if ((this.bWaitForGToStartDramaManager) && (!this.bStartedTheDramaManager) && (str1.equals("g")))
/*     */       {
/*     */ 
/*  97 */         this.bStartedTheDramaManager = true;
/*  98 */         StartTheDramaManager();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 106 */       else if (str1.equals(":g:b:pl")) {
/* 107 */         this.graceMemory.addWME(new UserTestWME(2, 0, 0, 0));
/* 108 */       } else if (str1.equals(":g:b:sm")) {
/* 109 */         this.graceMemory.addWME(new UserTestWME(2, 1, 0, 0));
/* 110 */       } else if (str1.equals(":g:b:im")) {
/* 111 */         this.graceMemory.addWME(new UserTestWME(2, 2, 0, 0));
/* 112 */       } else if (str1.equals(":g:b:ho")) {
/* 113 */         this.graceMemory.addWME(new UserTestWME(2, 3, 0, 0));
/* 114 */       } else if (str1.equals(":g:b:sk")) {
/* 115 */         this.graceMemory.addWME(new UserTestWME(2, 4, 0, 0));
/* 116 */       } else if (str1.equals(":g:b:se")) {
/* 117 */         this.graceMemory.addWME(new UserTestWME(2, 5, 0, 0));
/* 118 */       } else if (str1.equals(":g:b:fr")) {
/* 119 */         this.graceMemory.addWME(new UserTestWME(2, 6, 0, 0));
/* 120 */       } else if (str1.equals(":g:b:su")) {
/* 121 */         this.graceMemory.addWME(new UserTestWME(2, 7, 0, 0));
/* 122 */       } else if (str1.equals(":g:b:sh")) {
/* 123 */         this.graceMemory.addWME(new UserTestWME(2, 8, 0, 0));
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 128 */       else if (str1.equals(":g:m:n:b")) {
/* 129 */         this.graceMemory.addWME(new UserTestWME(1, 0, 0, 0));
/* 130 */       } else if (str1.equals(":g:m:n:l")) {
/* 131 */         this.graceMemory.addWME(new UserTestWME(1, 0, 1, 0));
/* 132 */       } else if (str1.equals(":g:m:n:m")) {
/* 133 */         this.graceMemory.addWME(new UserTestWME(1, 0, 2, 0));
/* 134 */       } else if (str1.equals(":g:m:n:h")) {
/* 135 */         this.graceMemory.addWME(new UserTestWME(1, 0, 3, 0));
/*     */       }
/* 137 */       else if (str1.equals(":g:m:h:b")) {
/* 138 */         this.graceMemory.addWME(new UserTestWME(1, 1, 0, 0));
/* 139 */       } else if (str1.equals(":g:m:h:l")) {
/* 140 */         this.graceMemory.addWME(new UserTestWME(1, 1, 1, 0));
/* 141 */       } else if (str1.equals(":g:m:h:m")) {
/* 142 */         this.graceMemory.addWME(new UserTestWME(1, 1, 2, 0));
/* 143 */       } else if (str1.equals(":g:m:h:h")) {
/* 144 */         this.graceMemory.addWME(new UserTestWME(1, 1, 3, 0));
/*     */       }
/* 146 */       else if (str1.equals(":g:m:a:b")) {
/* 147 */         this.graceMemory.addWME(new UserTestWME(1, 2, 0, 0));
/* 148 */       } else if (str1.equals(":g:m:a:l")) {
/* 149 */         this.graceMemory.addWME(new UserTestWME(1, 2, 1, 0));
/* 150 */       } else if (str1.equals(":g:m:a:m")) {
/* 151 */         this.graceMemory.addWME(new UserTestWME(1, 2, 2, 0));
/* 152 */       } else if (str1.equals(":g:m:a:h")) {
/* 153 */         this.graceMemory.addWME(new UserTestWME(1, 2, 3, 0));
/*     */       }
/* 155 */       else if (str1.equals(":g:m:x:b")) {
/* 156 */         this.graceMemory.addWME(new UserTestWME(1, 3, 0, 0));
/* 157 */       } else if (str1.equals(":g:m:x:l")) {
/* 158 */         this.graceMemory.addWME(new UserTestWME(1, 3, 1, 0));
/* 159 */       } else if (str1.equals(":g:m:x:m")) {
/* 160 */         this.graceMemory.addWME(new UserTestWME(1, 3, 2, 0));
/* 161 */       } else if (str1.equals(":g:m:x:h")) {
/* 162 */         this.graceMemory.addWME(new UserTestWME(1, 3, 3, 0));
/*     */       }
/* 164 */       else if (str1.equals(":g:m:r:b")) {
/* 165 */         this.graceMemory.addWME(new UserTestWME(1, 4, 0, 0));
/* 166 */       } else if (str1.equals(":g:m:r:l")) {
/* 167 */         this.graceMemory.addWME(new UserTestWME(1, 4, 1, 0));
/* 168 */       } else if (str1.equals(":g:m:r:m")) {
/* 169 */         this.graceMemory.addWME(new UserTestWME(1, 4, 2, 0));
/* 170 */       } else if (str1.equals(":g:m:r:h")) {
/* 171 */         this.graceMemory.addWME(new UserTestWME(1, 4, 3, 0));
/*     */       }
/* 173 */       else if (str1.equals(":g:m:i:b")) {
/* 174 */         this.graceMemory.addWME(new UserTestWME(1, 5, 0, 0));
/* 175 */       } else if (str1.equals(":g:m:i:l")) {
/* 176 */         this.graceMemory.addWME(new UserTestWME(1, 5, 1, 0));
/* 177 */       } else if (str1.equals(":g:m:i:m")) {
/* 178 */         this.graceMemory.addWME(new UserTestWME(1, 5, 2, 0));
/* 179 */       } else if (str1.equals(":g:m:i:h")) {
/* 180 */         this.graceMemory.addWME(new UserTestWME(1, 5, 3, 0));
/*     */ 
/*     */ 
/*     */       }
/* 184 */       else if (str1.equals(":g:la:t:s:b")) {
/* 185 */         this.graceMemory.addWME(new UserTestWME(0, 0, 1, 0));
/* 186 */       } else if (str1.equals(":g:la:t:s:l")) {
/* 187 */         this.graceMemory.addWME(new UserTestWME(0, 0, 1, 1));
/* 188 */       } else if (str1.equals(":g:la:t:s:m")) {
/* 189 */         this.graceMemory.addWME(new UserTestWME(0, 0, 1, 2));
/* 190 */       } else if (str1.equals(":g:la:t:s:h")) {
/* 191 */         this.graceMemory.addWME(new UserTestWME(0, 0, 1, 3));
/* 192 */       } else if (str1.equals(":g:la:t:h:b")) {
/* 193 */         this.graceMemory.addWME(new UserTestWME(0, 0, 2, 0));
/* 194 */       } else if (str1.equals(":g:la:t:h:l")) {
/* 195 */         this.graceMemory.addWME(new UserTestWME(0, 0, 2, 1));
/* 196 */       } else if (str1.equals(":g:la:t:h:m")) {
/* 197 */         this.graceMemory.addWME(new UserTestWME(0, 0, 2, 2));
/* 198 */       } else if (str1.equals(":g:la:t:h:h")) {
/* 199 */         this.graceMemory.addWME(new UserTestWME(0, 0, 2, 3));
/* 200 */       } else if (str1.equals(":g:la:t:x:b")) {
/* 201 */         this.graceMemory.addWME(new UserTestWME(0, 0, 3, 0));
/* 202 */       } else if (str1.equals(":g:la:t:x:l")) {
/* 203 */         this.graceMemory.addWME(new UserTestWME(0, 0, 3, 1));
/* 204 */       } else if (str1.equals(":g:la:t:x:m")) {
/* 205 */         this.graceMemory.addWME(new UserTestWME(0, 0, 3, 2));
/* 206 */       } else if (str1.equals(":g:la:t:x:h")) {
/* 207 */         this.graceMemory.addWME(new UserTestWME(0, 0, 3, 3));
/* 208 */       } else if (str1.equals(":g:la:t:a:b")) {
/* 209 */         this.graceMemory.addWME(new UserTestWME(0, 0, 4, 0));
/* 210 */       } else if (str1.equals(":g:la:t:a:l")) {
/* 211 */         this.graceMemory.addWME(new UserTestWME(0, 0, 4, 1));
/* 212 */       } else if (str1.equals(":g:la:t:a:m")) {
/* 213 */         this.graceMemory.addWME(new UserTestWME(0, 0, 4, 2));
/* 214 */       } else if (str1.equals(":g:la:t:a:h")) {
/* 215 */         this.graceMemory.addWME(new UserTestWME(0, 0, 4, 3));
/* 216 */       } else if (str1.equals(":g:la:t:i:b")) {
/* 217 */         this.graceMemory.addWME(new UserTestWME(0, 0, 5, 0));
/* 218 */       } else if (str1.equals(":g:la:t:i:l")) {
/* 219 */         this.graceMemory.addWME(new UserTestWME(0, 0, 5, 1));
/* 220 */       } else if (str1.equals(":g:la:t:i:m")) {
/* 221 */         this.graceMemory.addWME(new UserTestWME(0, 0, 5, 2));
/* 222 */       } else if (str1.equals(":g:la:t:i:h")) {
/* 223 */         this.graceMemory.addWME(new UserTestWME(0, 0, 5, 3));
/*     */       }
/* 225 */       else if (str1.equals(":g:la:r:s:b")) {
/* 226 */         this.graceMemory.addWME(new UserTestWME(0, 1, 1, 0));
/* 227 */       } else if (str1.equals(":g:la:r:s:l")) {
/* 228 */         this.graceMemory.addWME(new UserTestWME(0, 1, 1, 1));
/* 229 */       } else if (str1.equals(":g:la:r:s:m")) {
/* 230 */         this.graceMemory.addWME(new UserTestWME(0, 1, 1, 2));
/* 231 */       } else if (str1.equals(":g:la:r:s:h")) {
/* 232 */         this.graceMemory.addWME(new UserTestWME(0, 1, 1, 3));
/* 233 */       } else if (str1.equals(":g:la:r:h:b")) {
/* 234 */         this.graceMemory.addWME(new UserTestWME(0, 1, 2, 0));
/* 235 */       } else if (str1.equals(":g:la:r:h:l")) {
/* 236 */         this.graceMemory.addWME(new UserTestWME(0, 1, 2, 1));
/* 237 */       } else if (str1.equals(":g:la:r:h:m")) {
/* 238 */         this.graceMemory.addWME(new UserTestWME(0, 1, 2, 2));
/* 239 */       } else if (str1.equals(":g:la:r:h:h")) {
/* 240 */         this.graceMemory.addWME(new UserTestWME(0, 1, 2, 3));
/* 241 */       } else if (str1.equals(":g:la:r:x:b")) {
/* 242 */         this.graceMemory.addWME(new UserTestWME(0, 1, 3, 0));
/* 243 */       } else if (str1.equals(":g:la:r:x:l")) {
/* 244 */         this.graceMemory.addWME(new UserTestWME(0, 1, 3, 1));
/* 245 */       } else if (str1.equals(":g:la:r:x:m")) {
/* 246 */         this.graceMemory.addWME(new UserTestWME(0, 1, 3, 2));
/* 247 */       } else if (str1.equals(":g:la:r:x:h")) {
/* 248 */         this.graceMemory.addWME(new UserTestWME(0, 1, 3, 3));
/* 249 */       } else if (str1.equals(":g:la:r:a:b")) {
/* 250 */         this.graceMemory.addWME(new UserTestWME(0, 1, 4, 0));
/* 251 */       } else if (str1.equals(":g:la:r:a:l")) {
/* 252 */         this.graceMemory.addWME(new UserTestWME(0, 1, 4, 1));
/* 253 */       } else if (str1.equals(":g:la:r:a:m")) {
/* 254 */         this.graceMemory.addWME(new UserTestWME(0, 1, 4, 2));
/* 255 */       } else if (str1.equals(":g:la:r:a:h")) {
/* 256 */         this.graceMemory.addWME(new UserTestWME(0, 1, 4, 3));
/* 257 */       } else if (str1.equals(":g:la:r:i:b")) {
/* 258 */         this.graceMemory.addWME(new UserTestWME(0, 1, 5, 0));
/* 259 */       } else if (str1.equals(":g:la:r:i:l")) {
/* 260 */         this.graceMemory.addWME(new UserTestWME(0, 1, 5, 1));
/* 261 */       } else if (str1.equals(":g:la:r:i:m")) {
/* 262 */         this.graceMemory.addWME(new UserTestWME(0, 1, 5, 2));
/* 263 */       } else if (str1.equals(":g:la:r:i:h")) {
/* 264 */         this.graceMemory.addWME(new UserTestWME(0, 1, 5, 3));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 272 */       else if (str1.equals(":t:b:pl")) {
/* 273 */         this.tripMemory.addWME(new UserTestWME(2, 0, 0, 0));
/* 274 */       } else if (str1.equals(":t:b:sm")) {
/* 275 */         this.tripMemory.addWME(new UserTestWME(2, 1, 0, 0));
/* 276 */       } else if (str1.equals(":t:b:im")) {
/* 277 */         this.tripMemory.addWME(new UserTestWME(2, 2, 0, 0));
/* 278 */       } else if (str1.equals(":t:b:ho")) {
/* 279 */         this.tripMemory.addWME(new UserTestWME(2, 3, 0, 0));
/* 280 */       } else if (str1.equals(":t:b:sk")) {
/* 281 */         this.tripMemory.addWME(new UserTestWME(2, 4, 0, 0));
/* 282 */       } else if (str1.equals(":t:b:se")) {
/* 283 */         this.tripMemory.addWME(new UserTestWME(2, 5, 0, 0));
/* 284 */       } else if (str1.equals(":t:b:fr")) {
/* 285 */         this.tripMemory.addWME(new UserTestWME(2, 6, 0, 0));
/* 286 */       } else if (str1.equals(":t:b:su")) {
/* 287 */         this.tripMemory.addWME(new UserTestWME(2, 7, 0, 0));
/* 288 */       } else if (str1.equals(":t:b:sh")) {
/* 289 */         this.tripMemory.addWME(new UserTestWME(2, 8, 0, 0));
/*     */ 
/*     */ 
/*     */       }
/* 293 */       else if (str1.equals(":t:m:n:b")) {
/* 294 */         this.tripMemory.addWME(new UserTestWME(1, 0, 0, 0));
/* 295 */       } else if (str1.equals(":t:m:n:l")) {
/* 296 */         this.tripMemory.addWME(new UserTestWME(1, 0, 1, 0));
/* 297 */       } else if (str1.equals(":t:m:n:m")) {
/* 298 */         this.tripMemory.addWME(new UserTestWME(1, 0, 2, 0));
/* 299 */       } else if (str1.equals(":t:m:n:h")) {
/* 300 */         this.tripMemory.addWME(new UserTestWME(1, 0, 3, 0));
/*     */       }
/* 302 */       else if (str1.equals(":t:m:h:b")) {
/* 303 */         this.tripMemory.addWME(new UserTestWME(1, 1, 0, 0));
/* 304 */       } else if (str1.equals(":t:m:h:l")) {
/* 305 */         this.tripMemory.addWME(new UserTestWME(1, 1, 1, 0));
/* 306 */       } else if (str1.equals(":t:m:h:m")) {
/* 307 */         this.tripMemory.addWME(new UserTestWME(1, 1, 2, 0));
/* 308 */       } else if (str1.equals(":t:m:h:h")) {
/* 309 */         this.tripMemory.addWME(new UserTestWME(1, 1, 3, 0));
/*     */       }
/* 311 */       else if (str1.equals(":t:m:a:b")) {
/* 312 */         this.tripMemory.addWME(new UserTestWME(1, 2, 0, 0));
/* 313 */       } else if (str1.equals(":t:m:a:l")) {
/* 314 */         this.tripMemory.addWME(new UserTestWME(1, 2, 1, 0));
/* 315 */       } else if (str1.equals(":t:m:a:m")) {
/* 316 */         this.tripMemory.addWME(new UserTestWME(1, 2, 2, 0));
/* 317 */       } else if (str1.equals(":t:m:a:h")) {
/* 318 */         this.tripMemory.addWME(new UserTestWME(1, 2, 3, 0));
/*     */       }
/* 320 */       else if (str1.equals(":t:m:x:b")) {
/* 321 */         this.tripMemory.addWME(new UserTestWME(1, 3, 0, 0));
/* 322 */       } else if (str1.equals(":t:m:x:l")) {
/* 323 */         this.tripMemory.addWME(new UserTestWME(1, 3, 1, 0));
/* 324 */       } else if (str1.equals(":t:m:x:m")) {
/* 325 */         this.tripMemory.addWME(new UserTestWME(1, 3, 2, 0));
/* 326 */       } else if (str1.equals(":t:m:x:h")) {
/* 327 */         this.tripMemory.addWME(new UserTestWME(1, 3, 3, 0));
/*     */       }
/* 329 */       else if (str1.equals(":t:m:r:b")) {
/* 330 */         this.tripMemory.addWME(new UserTestWME(1, 4, 0, 0));
/* 331 */       } else if (str1.equals(":t:m:r:l")) {
/* 332 */         this.tripMemory.addWME(new UserTestWME(1, 4, 1, 0));
/* 333 */       } else if (str1.equals(":t:m:r:m")) {
/* 334 */         this.tripMemory.addWME(new UserTestWME(1, 4, 2, 0));
/* 335 */       } else if (str1.equals(":t:m:r:h")) {
/* 336 */         this.tripMemory.addWME(new UserTestWME(1, 4, 3, 0));
/*     */       }
/* 338 */       else if (str1.equals(":t:m:i:b")) {
/* 339 */         this.tripMemory.addWME(new UserTestWME(1, 5, 0, 0));
/* 340 */       } else if (str1.equals(":t:m:i:l")) {
/* 341 */         this.tripMemory.addWME(new UserTestWME(1, 5, 1, 0));
/* 342 */       } else if (str1.equals(":t:m:i:m")) {
/* 343 */         this.tripMemory.addWME(new UserTestWME(1, 5, 2, 0));
/* 344 */       } else if (str1.equals(":t:m:i:h")) {
/* 345 */         this.tripMemory.addWME(new UserTestWME(1, 5, 3, 0));
/*     */ 
/*     */ 
/*     */       }
/* 349 */       else if (str1.equals(":t:la:t:s:b")) {
/* 350 */         this.tripMemory.addWME(new UserTestWME(0, 0, 1, 0));
/* 351 */       } else if (str1.equals(":t:la:t:s:l")) {
/* 352 */         this.tripMemory.addWME(new UserTestWME(0, 0, 1, 1));
/* 353 */       } else if (str1.equals(":t:la:t:s:m")) {
/* 354 */         this.tripMemory.addWME(new UserTestWME(0, 0, 1, 2));
/* 355 */       } else if (str1.equals(":t:la:t:s:h")) {
/* 356 */         this.tripMemory.addWME(new UserTestWME(0, 0, 1, 3));
/* 357 */       } else if (str1.equals(":t:la:t:h:b")) {
/* 358 */         this.tripMemory.addWME(new UserTestWME(0, 0, 2, 0));
/* 359 */       } else if (str1.equals(":t:la:t:h:l")) {
/* 360 */         this.tripMemory.addWME(new UserTestWME(0, 0, 2, 1));
/* 361 */       } else if (str1.equals(":t:la:t:h:m")) {
/* 362 */         this.tripMemory.addWME(new UserTestWME(0, 0, 2, 2));
/* 363 */       } else if (str1.equals(":t:la:t:h:h")) {
/* 364 */         this.tripMemory.addWME(new UserTestWME(0, 0, 2, 3));
/* 365 */       } else if (str1.equals(":t:la:t:x:b")) {
/* 366 */         this.tripMemory.addWME(new UserTestWME(0, 0, 3, 0));
/* 367 */       } else if (str1.equals(":t:la:t:x:l")) {
/* 368 */         this.tripMemory.addWME(new UserTestWME(0, 0, 3, 1));
/* 369 */       } else if (str1.equals(":t:la:t:x:m")) {
/* 370 */         this.tripMemory.addWME(new UserTestWME(0, 0, 3, 2));
/* 371 */       } else if (str1.equals(":t:la:t:x:h")) {
/* 372 */         this.tripMemory.addWME(new UserTestWME(0, 0, 3, 3));
/* 373 */       } else if (str1.equals(":t:la:t:a:b")) {
/* 374 */         this.tripMemory.addWME(new UserTestWME(0, 0, 4, 0));
/* 375 */       } else if (str1.equals(":t:la:t:a:l")) {
/* 376 */         this.tripMemory.addWME(new UserTestWME(0, 0, 4, 1));
/* 377 */       } else if (str1.equals(":t:la:t:a:m")) {
/* 378 */         this.tripMemory.addWME(new UserTestWME(0, 0, 4, 2));
/* 379 */       } else if (str1.equals(":t:la:t:a:h")) {
/* 380 */         this.tripMemory.addWME(new UserTestWME(0, 0, 4, 3));
/* 381 */       } else if (str1.equals(":t:la:t:i:b")) {
/* 382 */         this.tripMemory.addWME(new UserTestWME(0, 0, 5, 0));
/* 383 */       } else if (str1.equals(":t:la:t:i:l")) {
/* 384 */         this.tripMemory.addWME(new UserTestWME(0, 0, 5, 1));
/* 385 */       } else if (str1.equals(":t:la:t:i:m")) {
/* 386 */         this.tripMemory.addWME(new UserTestWME(0, 0, 5, 2));
/* 387 */       } else if (str1.equals(":t:la:t:i:h")) {
/* 388 */         this.tripMemory.addWME(new UserTestWME(0, 0, 5, 3));
/*     */       }
/* 390 */       else if (str1.equals(":t:la:r:s:b")) {
/* 391 */         this.tripMemory.addWME(new UserTestWME(0, 1, 1, 0));
/* 392 */       } else if (str1.equals(":t:la:r:s:l")) {
/* 393 */         this.tripMemory.addWME(new UserTestWME(0, 1, 1, 1));
/* 394 */       } else if (str1.equals(":t:la:r:s:m")) {
/* 395 */         this.tripMemory.addWME(new UserTestWME(0, 1, 1, 2));
/* 396 */       } else if (str1.equals(":t:la:r:s:h")) {
/* 397 */         this.tripMemory.addWME(new UserTestWME(0, 1, 1, 3));
/* 398 */       } else if (str1.equals(":t:la:r:h:b")) {
/* 399 */         this.tripMemory.addWME(new UserTestWME(0, 1, 2, 0));
/* 400 */       } else if (str1.equals(":t:la:r:h:l")) {
/* 401 */         this.tripMemory.addWME(new UserTestWME(0, 1, 2, 1));
/* 402 */       } else if (str1.equals(":t:la:r:h:m")) {
/* 403 */         this.tripMemory.addWME(new UserTestWME(0, 1, 2, 2));
/* 404 */       } else if (str1.equals(":t:la:r:h:h")) {
/* 405 */         this.tripMemory.addWME(new UserTestWME(0, 1, 2, 3));
/* 406 */       } else if (str1.equals(":t:la:r:x:b")) {
/* 407 */         this.tripMemory.addWME(new UserTestWME(0, 1, 3, 0));
/* 408 */       } else if (str1.equals(":t:la:r:x:l")) {
/* 409 */         this.tripMemory.addWME(new UserTestWME(0, 1, 3, 1));
/* 410 */       } else if (str1.equals(":t:la:r:x:m")) {
/* 411 */         this.tripMemory.addWME(new UserTestWME(0, 1, 3, 2));
/* 412 */       } else if (str1.equals(":t:la:r:x:h")) {
/* 413 */         this.tripMemory.addWME(new UserTestWME(0, 1, 3, 3));
/* 414 */       } else if (str1.equals(":t:la:r:a:b")) {
/* 415 */         this.tripMemory.addWME(new UserTestWME(0, 1, 4, 0));
/* 416 */       } else if (str1.equals(":t:la:r:a:l")) {
/* 417 */         this.tripMemory.addWME(new UserTestWME(0, 1, 4, 1));
/* 418 */       } else if (str1.equals(":t:la:r:a:m")) {
/* 419 */         this.tripMemory.addWME(new UserTestWME(0, 1, 4, 2));
/* 420 */       } else if (str1.equals(":t:la:r:a:h")) {
/* 421 */         this.tripMemory.addWME(new UserTestWME(0, 1, 4, 3));
/* 422 */       } else if (str1.equals(":t:la:r:i:b")) {
/* 423 */         this.tripMemory.addWME(new UserTestWME(0, 1, 5, 0));
/* 424 */       } else if (str1.equals(":t:la:r:i:l")) {
/* 425 */         this.tripMemory.addWME(new UserTestWME(0, 1, 5, 1));
/* 426 */       } else if (str1.equals(":t:la:r:i:m")) {
/* 427 */         this.tripMemory.addWME(new UserTestWME(0, 1, 5, 2));
/* 428 */       } else if (str1.equals(":t:la:r:i:h")) {
/* 429 */         this.tripMemory.addWME(new UserTestWME(0, 1, 5, 3));
/*     */       }
/* 431 */       else if ((str1.equals("q")) || (str1.equals("qabl")))
/*     */       {
/* 433 */         Runtime.getRuntime().exit(0);
/*     */ 
/*     */       }
/* 436 */       else if (!str1.startsWith(":"))
/*     */       {
/*     */ 
/* 439 */         StringUtil.println("");
/* 440 */         StringUtil.println("PLAYER");
/* 441 */         StringUtil.println(str1);
/* 442 */         StringUtil.println("");
/*     */         
/*     */ 
/* 445 */         localLinkedList = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 446 */         Object localObject; if (localLinkedList.size() != 0)
/*     */         {
/* 448 */           localObject = (StoryStatusWME)localLinkedList.get(0);
/* 449 */           ((StoryStatusWME)localObject).setNLPProcessingStarted(System.currentTimeMillis());
/* 450 */           System.out.println("## Starting NLP at " + System.currentTimeMillis());
/*     */         } else {
/* 452 */           System.out.println("## Error: processPlayerText() in NLUMain.java can't find StoryStatusWME");
/*     */         }
/*     */         
/*     */ 
/*     */         try
/*     */         {
/* 458 */           this.nluEngine.reset();
/*     */           
/*     */ 
/* 461 */           Preprocessor.Process(str1, this.nluEngine);
/*     */           
/*     */ 
/* 464 */           localObject = activeContexts.iterator();
/* 465 */           while (((Iterator)localObject).hasNext()) {
/* 466 */             String str2 = (String)((Iterator)localObject).next();
/* 467 */             this.nluEngine.executeCommand("(assert (activeContext " + str2 + "))");
/*     */           }
/*     */           
/* 470 */           this.nluEngine.run();
/*     */           
/*     */ 
/*     */ 
/* 474 */           this.nluEngine.halt();
/*     */         } catch (JessException localJessException1) {
/* 476 */           JessExceptionHelper.processJessException(localJessException1);
/*     */         }
/*     */         try {
/* 479 */           this.to.UttSweep(this.nluEngine);
/*     */         } catch (JessException localJessException2) {
/* 481 */           JessExceptionHelper.processJessException(localJessException2);
/*     */         }
/* 483 */       } } else if (str1.equals(""))
/*     */     {
/* 485 */       localLinkedList = this.playerMemory.lookupWME("PlayerRecentlyTypedTextWME");
/* 486 */       if (localLinkedList.size() != 0) {
/* 487 */         localPlayerRecentlyTypedTextWME = (PlayerRecentlyTypedTextWME)localLinkedList.get(0);
/* 488 */         if ((localPlayerRecentlyTypedTextWME.getB()) && (System.currentTimeMillis() - localPlayerRecentlyTypedTextWME.getTimestamp() > 5000L)) {
/* 489 */           localPlayerRecentlyTypedTextWME.setB(false);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public final void startNLU() {
/* 496 */     this.playerMemory = WorkingMemory.lookupRegisteredMemory("PlayerMemory");
/* 497 */     this.tripMemory = WorkingMemory.lookupRegisteredMemory("TripMemory");
/* 498 */     this.graceMemory = WorkingMemory.lookupRegisteredMemory("GraceMemory");
/*     */     
/*     */ 
/*     */ 
/* 502 */     if ((!this.bWaitForGToStartDramaManager) && (!this.bStartedTheDramaManager)) {
/* 503 */       this.bStartedTheDramaManager = true;
/* 504 */       StartTheDramaManager();
/*     */     }
/*     */     
/*     */     for (;;)
/*     */     {
/* 509 */       processPlayerText();
/*     */       try {
/* 511 */         Thread.currentThread();Thread.sleep(300L);
/*     */       }
/*     */       catch (InterruptedException localInterruptedException) {
/* 514 */         throw new RuntimeError("Sleep interrupted " + localInterruptedException);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static final synchronized void activateContext(String paramString)
/*     */   {
/* 521 */     activeContexts.add(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */   public static final synchronized void deactivateContext(String paramString)
/*     */   {
/* 527 */     activeContexts.remove(paramString);
/*     */   }
/*     */   
/*     */   public static final synchronized void deactivateAllContexts()
/*     */   {
/* 532 */     activeContexts.clear();
/*     */   }
/*     */   
/*     */   public static final synchronized void deactivateAllContextsExcept(String paramString)
/*     */   {
/* 537 */     Iterator localIterator = activeContexts.iterator();
/* 538 */     while (localIterator.hasNext()) {
/* 539 */       String str = (String)localIterator.next();
/* 540 */       if (!str.equals(paramString)) {
/* 541 */         activeContexts.remove(str);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static final synchronized boolean isContextActive(String paramString) {
/* 547 */     Iterator localIterator = activeContexts.iterator();
/* 548 */     while (localIterator.hasNext()) {
/* 549 */       String str = (String)localIterator.next();
/* 550 */       if (str.equals(paramString)) return true;
/*     */     }
/* 552 */     return false;
/*     */   }
/*     */   
/*     */   public void SwitchBeat(String paramString1, String paramString2)
/*     */     throws JessException
/*     */   {
/* 558 */     HashSet localHashSet1 = (HashSet)this.beatNameToTemplateName.get(paramString1);
/* 559 */     HashSet localHashSet2 = (HashSet)this.beatNameToTemplateName.get(paramString2);
/*     */     
/* 561 */     HashSet localHashSet3 = (HashSet)localHashSet1.clone();
/* 562 */     localHashSet3.removeAll(localHashSet2);
/* 563 */     HashSet localHashSet4 = (HashSet)localHashSet2.clone();
/* 564 */     localHashSet4.removeAll(localHashSet1);
/*     */     
/* 566 */     Iterator localIterator = localHashSet3.iterator();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 571 */     while (localIterator.hasNext())
/*     */     {
/* 573 */       str = (String)localIterator.next();
/* 574 */       Fact localFact = new Fact("RETRACT" + str, this.nluEngine);
/* 575 */       ValueVector localValueVector = new ValueVector();
/* 576 */       localFact.setSlotValue("__data", new Value(localValueVector, 512));
/* 577 */       this.nluEngine.assertFact(localFact);
/*     */     }
/*     */     
/* 580 */     this.nluEngine.run();
/*     */     
/*     */ 
/*     */ 
/* 584 */     localIterator = localHashSet4.iterator();
/*     */     
/* 586 */     String str = "";
/* 587 */     while (localIterator.hasNext()) {
/* 588 */       ((RefCountRete)this.nluEngine).executeCommands((String)this.templateNameToTemplates.get(localIterator.next()));
/*     */     }
/*     */     
/* 591 */     this.to.BeatSweep(this.nluEngine);
/*     */   }
/*     */   
/*     */ 
/*     */   public NLUMain(String paramString1, String paramString2, String paramString3, AnaphoricReferenceWME paramAnaphoricReferenceWME, PostBeatMixinInfoWME paramPostBeatMixinInfoWME)
/*     */   {
/* 597 */     this(paramString1, paramString2, paramString3);
/*     */     try
/*     */     {
/* 600 */       this.nluEngine.store("__factKey", "anaphoricRef");
/* 601 */       this.nluEngine.store("__wmeKey", paramAnaphoricReferenceWME);
/* 602 */       this.nluEngine.executeCommand("(shadowWME __factKey __wmeKey)");
/*     */       
/*     */ 
/* 605 */       this.nluEngine.store("__factKey", "postBeatMixinInfo");
/* 606 */       this.nluEngine.store("__wmeKey", paramPostBeatMixinInfoWME);
/* 607 */       this.nluEngine.executeCommand("(shadowWME __factKey __wmeKey)");
/* 608 */     } catch (JessException localJessException) { throw new RuntimeException(localJessException);
/*     */     } }
/*     */   
/* 611 */   public NLUMain(String paramString1, String paramString2, String paramString3) { jdMethod_this();
/*     */     
/*     */ 
/* 614 */     this.nluEngine = new RefCountRete();
/* 615 */     this.to = new TimeOut(this.nluEngine);
/* 616 */     this.nluEngine.addJessListener(new DebugListener());
/* 617 */     this.nluEngine.addJessListener(new FactListener(this.to));
/* 618 */     this.nluEngine.setEventMask(this.nluEngine.getEventMask() | 0x10 | 0x2 | 0x1000 | 0x4000);
/*     */     
/*     */     try
/*     */     {
/* 622 */       FileInputStream localFileInputStream = new FileInputStream(paramString1);
/* 623 */       localObject1 = new InflaterInputStream(localFileInputStream);
/* 624 */       localObject2 = new ObjectInputStream((InputStream)localObject1);
/*     */       
/* 626 */       System.out.println("Reading Templates...");
/* 627 */       this.templateNameToTemplates = ((Hashtable)((ObjectInputStream)localObject2).readObject());
/*     */       
/* 629 */       localFileInputStream.close();
/*     */       
/* 631 */       localFileInputStream = new FileInputStream(paramString2);
/* 632 */       localObject1 = new InflaterInputStream(localFileInputStream);
/* 633 */       localObject2 = new ObjectInputStream((InputStream)localObject1);
/*     */       
/* 635 */       System.out.println("Reading Mappings...");
/* 636 */       this.beatNameToTemplateName = ((Hashtable)((ObjectInputStream)localObject2).readObject());
/*     */       
/* 638 */       localFileInputStream.close();
/*     */ 
/*     */ 
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */ 
/* 645 */       throw new RuntimeError("NLU: While loading objects " + localException);
/*     */     }
/*     */     
/*     */ 
/* 649 */     HashSet localHashSet = (HashSet)this.beatNameToTemplateName.get(paramString3);
/* 650 */     Object localObject1 = (HashSet)this.templateNameToTemplates.get("_CONST");
/* 651 */     Object localObject2 = localHashSet.iterator();
/* 652 */     Iterator localIterator = ((HashSet)localObject1).iterator();
/*     */     try {
/* 654 */       Preprocessor.initializeReteEngine(this.nluEngine);
/* 655 */       System.out.println("Reading template rules...");
/* 656 */       int i = -1;
/* 657 */       String str; while (((Iterator)localObject2).hasNext()) {
/* 658 */         str = (String)this.templateNameToTemplates.get(((Iterator)localObject2).next());
/* 659 */         ((RefCountRete)this.nluEngine).executeCommands(str);
/* 660 */         i++; if (i % 10 == 0) System.out.print(i + ' ');
/*     */       }
/* 662 */       System.out.println(i + " done");
/* 663 */       System.out.println("Unique Rules: " + ((RefCountRete)this.nluEngine).getUniqueRules());
/* 664 */       System.out.println("Shared refs to unique rules: " + ((RefCountRete)this.nluEngine).getSharedRuleRefs());
/* 665 */       System.out.println("Redefined shared rules (because of salience): " + ((RefCountRete)this.nluEngine).getRedefinedRules());
/*     */       
/* 667 */       System.out.println("Loading Constants...");
/* 668 */       while (localIterator.hasNext()) {
/* 669 */         str = (String)localIterator.next();
/* 670 */         this.nluEngine.executeCommand(str);
/*     */       }
/*     */       
/* 673 */       System.out.println("NLU is started");
/*     */     } catch (JessException localJessException) {
/* 675 */       JessExceptionHelper.processJessException(localJessException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\NLUMain.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */