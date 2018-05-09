/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Vector;
/*     */ import jd.ClassDescriptor;
/*     */ import jd.MethodDescriptor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ASTBeatTopLevel
/*     */   extends BeatParseNode
/*     */   implements MacroDefinitions
/*     */ {
/*  20 */   private static final String[] importPackages = { "dramaman.runtime.*", "wm.WME", "java.util.*", "scope.*" };
/*     */   private static ASTBeatTopLevel beatTopLevel;
/*     */   String beatPackage;
/*     */   private LinkedList userImportPackages;
/*     */   private LinkedList userImportClasses;
/*     */   private LinkedList userConstantDeclarations;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  17 */     this.beatPackage = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  23 */     this.userImportPackages = new LinkedList();
/*     */     
/*     */ 
/*  26 */     this.userImportClasses = new LinkedList();
/*     */     
/*     */ 
/*  29 */     this.userConstantDeclarations = new LinkedList();
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
/*     */   public ASTBeatTopLevel(int paramInt)
/*     */   {
/*  54 */     super(paramInt);jdMethod_this();
/*  55 */     beatTopLevel = this;
/*     */   }
/*     */   
/*     */   public ASTBeatTopLevel(BeatParser paramBeatParser, int paramInt) {
/*  59 */     super(paramBeatParser, paramInt);jdMethod_this();
/*  60 */     beatTopLevel = this;
/*     */   }
/*     */   
/*     */   public void addUserImport(String paramString)
/*     */   {
/*  65 */     if (paramString.endsWith("*"))
/*     */     {
/*     */ 
/*     */ 
/*  69 */       this.userImportPackages.add(paramString.substring(0, paramString.length() - 2));
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/*  74 */       this.userImportClasses.add(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void addUserImports(ClassDescriptor paramClassDescriptor)
/*     */   {
/*  81 */     ListIterator localListIterator1 = this.userImportPackages.listIterator();
/*  82 */     while (localListIterator1.hasNext()) {
/*  83 */       paramClassDescriptor.addPackageImport((String)localListIterator1.next() + ".*");
/*     */     }
/*     */     
/*  86 */     ListIterator localListIterator2 = this.userImportClasses.listIterator();
/*  87 */     while (localListIterator2.hasNext()) {
/*  88 */       paramClassDescriptor.addPackageImport((String)localListIterator2.next());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public Iterator getUserImportPackages()
/*     */   {
/*  95 */     return this.userImportPackages.listIterator();
/*     */   }
/*     */   
/*     */   public Iterator getUserImportClasses()
/*     */   {
/* 100 */     return this.userImportClasses.listIterator();
/*     */   }
/*     */   
/*     */   public void addUserConstants(String paramString)
/*     */   {
/* 105 */     this.userConstantDeclarations.add(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */   public void addUserConstantDeclarations(ClassDescriptor paramClassDescriptor)
/*     */   {
/* 111 */     ListIterator localListIterator = this.userConstantDeclarations.listIterator();
/* 112 */     while (localListIterator.hasNext()) {
/* 113 */       paramClassDescriptor.addInterface((String)localListIterator.next());
/*     */     }
/*     */   }
/*     */   
/*     */   public Field getDeclaredConstant(String paramString) throws CompileException {
/* 118 */     ListIterator localListIterator = this.userConstantDeclarations.listIterator();
/*     */     
/*     */     break label193;
/*     */     for (;;)
/*     */     {
/* 123 */       String str = (String)localListIterator.next();
/*     */       try {
/* 125 */         Class localClass = Class.forName(str);
/* 126 */         if (!Modifier.isInterface(localClass.getModifiers()))
/* 127 */           throw new CompileException("Expected " + str + " to be an interface declaring constants.");
/*     */         try {
/* 129 */           Field localField = localClass.getDeclaredField(paramString);
/* 130 */           if (!Modifier.isFinal(localField.getModifiers()))
/* 131 */             throw new CompileException("Expected " + paramString + " in interface " + str + " to be final.");
/* 132 */           return localField;
/*     */         } catch (SecurityException localSecurityException) {
/* 134 */           throw new CompileException("Security exception accessing " + paramString + " in interface " + str);
/*     */         }
/*     */         catch (NoSuchFieldException localNoSuchFieldException) {}
/* 122 */         if (localListIterator.hasNext()) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       catch (ClassNotFoundException localClassNotFoundException)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         throw new CompileException("Unable to find interface " + str);
/*     */       }
/*     */     }
/*     */     label193:
/* 143 */     return null;
/*     */   }
/*     */   
/*     */   public static ASTBeatTopLevel getBeatTopLevel()
/*     */   {
/* 148 */     return beatTopLevel;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   BeatScopeMaintainer getEnclosingScope()
/*     */   {
/* 206 */     return null;
/*     */   }
/*     */   
/*     */   public void compileToJava()
/*     */     throws CompileException
/*     */   {
/* 212 */     ClassDescriptor localClassDescriptor1 = new ClassDescriptor();
/* 213 */     ClassDescriptor localClassDescriptor2 = new ClassDescriptor();
/* 214 */     ClassDescriptor localClassDescriptor3 = new ClassDescriptor();
/*     */     
/*     */ 
/* 217 */     localClassDescriptor1.className = "BeatTests";
/* 218 */     localClassDescriptor1.packageName = this.beatPackage;
/* 219 */     localClassDescriptor1.addClassModifier("public");
/* 220 */     localClassDescriptor2.className = "BeatFactories";
/* 221 */     localClassDescriptor2.packageName = this.beatPackage;
/* 222 */     localClassDescriptor2.addClassModifier("public");
/* 223 */     localClassDescriptor3.className = "BeatActions";
/* 224 */     localClassDescriptor3.packageName = this.beatPackage;
/* 225 */     localClassDescriptor3.addClassModifier("public");
/*     */     
/*     */ 
/* 228 */     for (int i = 0; i < importPackages.length; i++)
/* 229 */       localClassDescriptor1.addPackageImport(importPackages[i]);
/* 230 */     addUserImports(localClassDescriptor1);
/* 231 */     addUserConstantDeclarations(localClassDescriptor1);
/*     */     
/* 233 */     for (i = 0; i < importPackages.length; i++)
/* 234 */       localClassDescriptor2.addPackageImport(importPackages[i]);
/* 235 */     addUserImports(localClassDescriptor2);
/* 236 */     addUserConstantDeclarations(localClassDescriptor2);
/*     */     
/* 238 */     for (i = 0; i < importPackages.length; i++)
/* 239 */       localClassDescriptor3.addPackageImport(importPackages[i]);
/* 240 */     addUserImports(localClassDescriptor3);
/* 241 */     addUserConstantDeclarations(localClassDescriptor3);
/*     */     
/* 243 */     Vector localVector1 = new Vector();
/* 244 */     Vector localVector2 = new Vector();
/* 245 */     Vector localVector3 = new Vector();
/*     */     
/* 247 */     for (int j = 0; j < jjtGetNumChildren(); j++)
/*     */     {
/*     */ 
/* 250 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(j);
/* 251 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id].equals("BeatDefinition"))
/*     */       {
/* 253 */         localObject1 = ((ASTBeatDefinition)localBeatParseNode).compileFactory();
/* 254 */         localVector2.add(localObject1);
/*     */         
/* 256 */         localObject2 = ((ASTBeatDefinition)localBeatParseNode).compileTestsToJava();
/* 257 */         localVector1.addAll((Collection)localObject2);
/*     */         
/* 259 */         Vector localVector4 = ((ASTBeatDefinition)localBeatParseNode).compileActionsToJava();
/* 260 */         localVector3.addAll(localVector4);
/*     */       }
/*     */     }
/* 263 */     Iterator localIterator = localVector1.iterator();
/* 264 */     while (localIterator.hasNext()) {
/* 265 */       localClassDescriptor1.addMethod((MethodDescriptor)localIterator.next());
/*     */     }
/* 267 */     Object localObject1 = localVector2.iterator();
/* 268 */     while (((Iterator)localObject1).hasNext()) {
/* 269 */       localClassDescriptor2.addMethod((MethodDescriptor)((Iterator)localObject1).next());
/*     */     }
/* 271 */     Object localObject2 = localVector3.iterator();
/* 272 */     while (((Iterator)localObject2).hasNext()) {
/* 273 */       localClassDescriptor3.addMethod((MethodDescriptor)((Iterator)localObject2).next());
/*     */     }
/* 275 */     localClassDescriptor1.writeToFile(Beat.objectDirectory);
/*     */     
/* 277 */     localClassDescriptor2.writeToFile(Beat.objectDirectory);
/*     */     
/* 279 */     localClassDescriptor3.writeToFile(Beat.objectDirectory);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTBeatTopLevel.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */