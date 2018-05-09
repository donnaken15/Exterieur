/*     */ package wordnet.browser;
/*     */ 
/*     */ import java.awt.Frame;
/*     */ import java.awt.Menu;
/*     */ import java.awt.MenuBar;
/*     */ import java.awt.MenuItem;
/*     */ import java.awt.MenuShortcut;
/*     */ import java.io.PrintStream;
/*     */ import java.rmi.RMISecurityManager;
/*     */ import java.rmi.registry.LocateRegistry;
/*     */ import wordnet.wn.DictionaryDatabase;
/*     */ import wordnet.wn.FileBackedDictionary;
/*     */ import wordnet.wn.RemoteFileManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Browser
/*     */   extends Frame
/*     */ {
/*     */   protected MenuBar mainMenuBar;
/*     */   protected Menu fileMenu;
/*     */   protected MenuItem miSearch;
/*     */   protected MenuItem miExit;
/*     */   protected Menu editMenu;
/*     */   protected MenuItem miCut;
/*     */   protected MenuItem miCopy;
/*     */   protected MenuItem miPaste;
/*     */   protected Menu helpMenu;
/*     */   protected MenuItem miAbout;
/*     */   protected Frame searchWindow;
/*     */   
/*     */   public Browser(DictionaryDatabase paramDictionaryDatabase)
/*     */   {
/*  53 */     super("WordNet Browser");
/*  54 */     setVisible(false);
/*  55 */     setLocation(50, 50);
/*  56 */     setSize(500, 400);
/*     */     
/*  58 */     BrowserPanel localBrowserPanel = new BrowserPanel(paramDictionaryDatabase);
/*  59 */     add(localBrowserPanel);
/*     */     
/*  61 */     this.mainMenuBar = new MenuBar();
/*  62 */     this.fileMenu = new Menu("File");
/*  63 */     this.miSearch = new MenuItem("Substring Search");
/*  64 */     this.fileMenu.add(this.miSearch);
/*  65 */     this.fileMenu.addSeparator();
/*  66 */     this.miExit = new MenuItem("Exit");
/*  67 */     this.fileMenu.add(this.miExit);
/*     */     
/*  69 */     this.mainMenuBar.add(this.fileMenu);
/*  70 */     this.editMenu = new Menu("Edit");
/*  71 */     this.miCut = new MenuItem("Cut");
/*  72 */     this.miCut.setShortcut(new MenuShortcut(88, false));
/*  73 */     this.editMenu.add(this.miCut);
/*  74 */     this.miCopy = new MenuItem("Copy");
/*  75 */     this.miCopy.setShortcut(new MenuShortcut(67, false));
/*  76 */     this.editMenu.add(this.miCopy);
/*  77 */     this.miPaste = new MenuItem("Paste");
/*  78 */     this.miPaste.setShortcut(new MenuShortcut(86, false));
/*  79 */     this.editMenu.add(this.miPaste);
/*  80 */     this.mainMenuBar.add(this.editMenu);
/*  81 */     this.helpMenu = new Menu("Help");
/*  82 */     this.mainMenuBar.setHelpMenu(this.helpMenu);
/*  83 */     this.miAbout = new MenuItem("About..");
/*  84 */     this.helpMenu.add(this.miAbout);
/*  85 */     this.mainMenuBar.add(this.helpMenu);
/*  86 */     setMenuBar(this.mainMenuBar);
/*     */     
/*  88 */     addWindowListener(new Browser.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */     Browser.2 local2 = new Browser.2(this, localBrowserPanel);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */     this.miSearch.addActionListener(local2);
/* 113 */     this.miAbout.addActionListener(local2);
/* 114 */     this.miExit.addActionListener(local2);
/*     */     
/*     */ 
/* 117 */     setVisible(true);
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString)
/*     */   {
/* 122 */     String str1 = null;
/* 123 */     String str2 = null;
/* 124 */     int i = 0;
/*     */     
/*     */ 
/* 127 */     for (int j = 0; j < paramArrayOfString.length; j++) {
/* 128 */       if (paramArrayOfString[j].equals("-hostname")) {
/* 129 */         str2 = paramArrayOfString[(++j)];
/* 130 */       } else if (paramArrayOfString[j].equals("-server")) {
/* 131 */         i = 1;
/* 132 */       } else { if ((paramArrayOfString[j].startsWith("-")) || (str1 != null)) {
/* 133 */           displayUsageError();
/* 134 */           return;
/*     */         }
/* 136 */         str1 = paramArrayOfString[j];
/*     */       }
/*     */     }
/* 139 */     if ((str2 != null) && (i != 0)) {
/* 140 */       displayUsageError();
/* 141 */       return;
/*     */     }
/*     */     
/*     */ 
/* 145 */     if (i != 0)
/*     */     {
/*     */ 
/*     */       try
/*     */       {
/*     */ 
/* 151 */         System.setSecurityManager(new RMISecurityManager());
/* 152 */         LocateRegistry.createRegistry(1099);
/*     */       } catch (Exception localException1) {}
/*     */       try {
/* 155 */         if (str1 != null) {
/* 156 */           new RemoteFileManager(str1).bind();
/*     */         } else {
/* 158 */           new RemoteFileManager().bind();
/*     */         }
/*     */       } catch (Exception localException2) {
/* 161 */         throw new RuntimeException(localException2.toString());
/*     */       }
/*     */       
/* 164 */       str2 = "127.0.0.1"; }
/*     */     FileBackedDictionary localFileBackedDictionary;
/* 166 */     if (str2 != null) {
/*     */       try {
/* 168 */         localFileBackedDictionary = new FileBackedDictionary(RemoteFileManager.lookup(str2));
/*     */       } catch (Exception localException3) {
/* 170 */         throw new RuntimeException(localException3.toString());
/*     */       }
/* 172 */     } else if (str1 != null) {
/* 173 */       localFileBackedDictionary = new FileBackedDictionary(str1);
/*     */     } else {
/* 175 */       localFileBackedDictionary = new FileBackedDictionary();
/*     */     }
/* 177 */     new Browser(localFileBackedDictionary).setVisible(true);
/*     */   }
/*     */   
/*     */   protected static void displayUsageError() {
/* 181 */     System.err.println("usage: Browser [-hostname | -server] [searchDir]");
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\Browser.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */