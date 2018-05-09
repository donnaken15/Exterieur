/*      */ package jess;
/*      */ 
/*      */ import java.applet.Applet;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.ObjectInputStream;
/*      */ import java.io.ObjectOutputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.io.PrintWriter;
/*      */ import java.io.Reader;
/*      */ import java.io.Serializable;
/*      */ import java.io.Writer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.TreeMap;
/*      */ import jess.awt.TextReader;
/*      */ import jess.factory.Factory;
/*      */ import jess.factory.FactoryImpl;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Rete
/*      */   implements Serializable, JessListener
/*      */ {
/*   38 */   private static Factory m_factory = new FactoryImpl();
/*      */   public static final int INSTALL = 0;
/*      */   public static final int ACTIVATE = 1;
/*      */   public static final int EVERY_TIME = 2;
/*      */   private static final String LIBRARY_NAME = "scriptlib.clp";
/*      */   private transient Object m_appObject;
/*      */   private Context m_globalContext;
/*      */   private transient Routers m_routers;
/*      */   private transient TextReader m_tis;
/*      */   private transient Jesp m_jesp;
/*      */   private transient JessEventSupport m_jes;
/*      */   private boolean m_resetGlobals;
/*      */   private List m_deffacts;
/*      */   private List m_defglobals;
/*      */   private Map m_functions;
/*      */   private FactList m_factList;
/*      */   private DefinstanceList m_definstanceList;
/*      */   private Map m_rules;
/*      */   private ReteCompiler m_compiler;
/*      */   private Map m_storage;
/*      */   private Agenda m_agenda;
/*      */   private Hashtable m_classImports;
/*      */   private ArrayList m_packageImports;
/*      */   private boolean[] m_watchInfo;
/*      */   static Class class$jess$Rete;
/*      */   
/*      */   private final void jdMethod_this()
/*      */   {
/*   24 */     this.m_globalContext = new Context(this);
/*   25 */     this.m_routers = new Routers();
/*   26 */     this.m_tis = new TextReader(true);
/*   27 */     this.m_jesp = new Jesp(this.m_tis, this);
/*   28 */     this.m_jes = new JessEventSupport(this);
/*   29 */     this.m_resetGlobals = true;
/*   30 */     this.m_deffacts = Collections.synchronizedList(new ArrayList());
/*   31 */     this.m_defglobals = Collections.synchronizedList(new ArrayList());
/*   32 */     this.m_functions = Collections.synchronizedMap(new HashMap(101));
/*   33 */     this.m_factList = new FactList();
/*   34 */     this.m_definstanceList = new DefinstanceList(this);
/*   35 */     this.m_rules = Collections.synchronizedMap(new TreeMap());
/*   36 */     this.m_compiler = new ReteCompiler();
/*   37 */     this.m_storage = Collections.synchronizedMap(new HashMap());
/*      */     
/*   39 */     this.m_agenda = new Agenda();
/*   40 */     this.m_classImports = new Hashtable();
/*   41 */     this.m_packageImports = new ArrayList();
/*   42 */     this.m_watchInfo = new boolean[5];
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Rete()
/*      */   {
/*   51 */     this(null);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public Rete(Applet paramApplet)
/*      */   {
/*   59 */     this(paramApplet);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Rete(Object paramObject)
/*      */   {
/*   71 */     jdMethod_this();
/*      */     
/*   73 */     this.m_appObject = paramObject;
/*      */     try
/*      */     {
/*   76 */       Deftemplate.addStandardTemplates(this);
/*      */     } catch (JessException localJessException) {
/*   78 */       throw new RuntimeException(localJessException.getMessage());
/*      */     }
/*      */     
/*   81 */     setEventMask(0);
/*      */     
/*   83 */     loadScriptlib();
/*      */     
/*      */ 
/*   86 */     this.m_packageImports.add("java.lang.");
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void addInputRouter(String paramString, Reader paramReader, boolean paramBoolean)
/*      */   {
/*   99 */     this.m_routers.addInputRouter(paramString, paramReader, paramBoolean);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void removeInputRouter(String paramString)
/*      */   {
/*  106 */     this.m_routers.removeInputRouter(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public Reader getInputRouter(String paramString)
/*      */   {
/*  114 */     return this.m_routers.getInputRouter(paramString);
/*      */   }
/*      */   
/*      */   Tokenizer getInputWrapper(Reader paramReader) {
/*  118 */     return this.m_routers.getInputWrapper(paramReader);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void addOutputRouter(String paramString, Writer paramWriter)
/*      */   {
/*  126 */     this.m_routers.addOutputRouter(paramString, paramWriter);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void removeOutputRouter(String paramString)
/*      */   {
/*  133 */     this.m_routers.removeOutputRouter(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean getInputMode(String paramString)
/*      */   {
/*  141 */     return this.m_routers.getInputMode(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public Writer getOutputRouter(String paramString)
/*      */   {
/*  149 */     return this.m_routers.getOutputRouter(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public PrintWriter getErrStream()
/*      */   {
/*  156 */     return this.m_routers.getErrStream();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public PrintWriter getOutStream()
/*      */   {
/*  163 */     return this.m_routers.getOutStream();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int doPreAssertionProcessing(Fact paramFact)
/*      */     throws JessException
/*      */   {
/*  172 */     return this.m_factList.doPreAssertionProcessing(paramFact);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public synchronized void clear()
/*      */     throws JessException
/*      */   {
/*  182 */     clearStorage();
/*  183 */     this.m_globalContext.clear();
/*      */     
/*  185 */     this.m_factList.clear();
/*  186 */     this.m_rules.clear();
/*  187 */     this.m_agenda.clear();
/*  188 */     this.m_definstanceList.clear();
/*      */     
/*  190 */     keepJavaUserFunctionsOnly();
/*  191 */     Deftemplate.addStandardTemplates(this);
/*      */     
/*  193 */     this.m_compiler = new ReteCompiler();
/*      */     
/*  195 */     this.m_deffacts.clear();
/*  196 */     this.m_defglobals.clear();
/*      */     
/*  198 */     broadcastEvent(2048, this);
/*  199 */     setEventMask(0);
/*      */     
/*  201 */     unwatchAll();
/*      */     
/*  203 */     loadScriptlib();
/*      */     
/*  205 */     System.gc();
/*      */   }
/*      */   
/*      */   private final void keepJavaUserFunctionsOnly() {
/*  209 */     ArrayList localArrayList = new ArrayList();
/*  210 */     for (Iterator localIterator = this.m_functions.keySet().iterator(); localIterator.hasNext();) {
/*  211 */       Userfunction localUserfunction = findUserfunction((String)localIterator.next());
/*  212 */       if (!(localUserfunction instanceof Deffunction)) {
/*  213 */         localArrayList.add(localUserfunction);
/*      */       }
/*      */     }
/*  216 */     this.m_functions = Collections.synchronizedMap(new HashMap());
/*  217 */     for (localIterator = localArrayList.iterator(); localIterator.hasNext();) {
/*  218 */       addUserfunction((Userfunction)localIterator.next());
/*      */     }
/*      */   }
/*      */   
/*      */   public void setPendingFact(Fact paramFact, boolean paramBoolean) {
/*  223 */     this.m_factList.setPendingFact(paramFact, paramBoolean);
/*      */   }
/*      */   
/*      */   void removeAllFacts() throws JessException {
/*  227 */     processToken(3, Fact.getClearFact());
/*  228 */     this.m_factList.clear();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void resetDeffacts()
/*      */     throws JessException
/*      */   {
/*  255 */     for (Iterator localIterator = this.m_deffacts.iterator(); localIterator.hasNext();)
/*  256 */       ((Deffacts)localIterator.next()).reset(this);
/*      */   }
/*      */   
/*      */   private final void resetDefglobals() throws JessException {
/*  260 */     if (getResetGlobals()) {
/*  261 */       for (Iterator localIterator = this.m_defglobals.iterator(); localIterator.hasNext();) {
/*  262 */         ((Defglobal)localIterator.next()).reset(this);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Fact assertString(String paramString)
/*      */     throws JessException
/*      */   {
/*  296 */     return assertString(paramString, getGlobalContext());
/*      */   }
/*      */   
/*      */   /**
/*      */    * @deprecated
/*      */    */
/*      */   public Fact jdMethod_assert(Fact paramFact) throws JessException {
/*  303 */     return assertFact(paramFact);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Fact assertFact(Fact paramFact)
/*      */     throws JessException
/*      */   {
/*  318 */     return assertFact(paramFact, getGlobalContext());
/*      */   }
/*      */   
/*      */   /**
/*      */    * @deprecated
/*      */    */
/*      */   public Fact jdMethod_assert(Fact paramFact, Context paramContext) throws JessException {
/*  325 */     return assertFact(paramFact, paramContext);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Fact modify(Fact paramFact, String paramString, Value paramValue)
/*      */     throws JessException
/*      */   {
/*  409 */     return this.m_factList.modify(paramFact, paramString, paramValue, this, getGlobalContext());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Fact modify(Fact paramFact, String paramString, Value paramValue, Context paramContext)
/*      */     throws JessException
/*      */   {
/*  423 */     return this.m_factList.modify(paramFact, paramString, paramValue, this, paramContext);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   Fact _modify(ValueVector paramValueVector, Context paramContext)
/*      */     throws JessException
/*      */   {
/*  433 */     return this.m_factList._modify(paramValueVector, paramContext, this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   Fact _duplicate(ValueVector paramValueVector, Context paramContext)
/*      */     throws JessException
/*      */   {
/*  442 */     return this.m_factList._duplicate(paramValueVector, paramContext, this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Fact findFactByID(int paramInt)
/*      */     throws JessException
/*      */   {
/*  454 */     return this.m_factList.findFactByID(paramInt);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Fact findFactByFact(Fact paramFact)
/*      */     throws JessException
/*      */   {
/*  465 */     return this.m_factList.findFactByFact(paramFact);
/*      */   }
/*      */   
/*      */   void removeLogicalSupportFrom(Token paramToken, Fact paramFact)
/*      */   {
/*  470 */     this.m_factList.removeLogicalSupportFrom(paramToken, paramFact);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void ppFacts(String paramString, Writer paramWriter)
/*      */     throws IOException
/*      */   {
/*  483 */     this.m_factList.ppFacts(resolveName(paramString), paramWriter);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void ppFacts(Writer paramWriter)
/*      */     throws IOException
/*      */   {
/*  491 */     this.m_factList.ppFacts(paramWriter);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Deffacts findDeffacts(String paramString)
/*      */   {
/*  507 */     paramString = resolveName(paramString);
/*  508 */     for (Iterator localIterator = listDeffacts(); localIterator.hasNext();) {
/*  509 */       Deffacts localDeffacts = (Deffacts)localIterator.next();
/*  510 */       if (localDeffacts.getName().equals(paramString))
/*  511 */         return localDeffacts;
/*      */     }
/*  513 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public Iterator listDeftemplates()
/*      */   {
/*  521 */     ArrayList localArrayList = new ArrayList();
/*  522 */     for (Iterator localIterator1 = this.m_agenda.listModules(); localIterator1.hasNext();) {
/*      */       try {
/*  524 */         Defmodule localDefmodule = this.m_agenda.getModule((String)localIterator1.next());
/*      */         
/*  526 */         Iterator localIterator2 = localDefmodule.listDeftemplates();
/*  527 */         while (localIterator2.hasNext()) {
/*  528 */           localArrayList.add(localIterator2.next());
/*      */         }
/*      */       }
/*      */       catch (JessException localJessException) {}
/*      */     }
/*  533 */     return localArrayList.iterator();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Iterator listFacts()
/*      */   {
/*  549 */     return this.m_factList.listFacts();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public Iterator listDefinstances()
/*      */   {
/*  557 */     return this.m_definstanceList.listDefinstances();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Iterator listDefclasses()
/*      */   {
/*  569 */     return this.m_definstanceList.listDefclasses();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public final HasLHS findDefrule(String paramString)
/*      */   {
/*  604 */     return (HasLHS)this.m_rules.get(resolveName(paramString));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public Class javaClassForDefclass(String paramString)
/*      */   {
/*      */     try
/*      */     {
/*  614 */       String str = this.m_definstanceList.jessNameToJavaName(paramString);
/*  615 */       if (str == null) {
/*  616 */         return null;
/*      */       }
/*  618 */       return findClass(str);
/*      */     } catch (ClassNotFoundException localClassNotFoundException) {}
/*  620 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Deftemplate findDeftemplate(String paramString)
/*      */     throws JessException
/*      */   {
/*  630 */     String str1 = resolveName(paramString);
/*  631 */     String str2 = str1.substring(0, str1.indexOf("::"));
/*  632 */     Deftemplate localDeftemplate = this.m_agenda.getModule(str2).getDeftemplate(paramString);
/*      */     
/*  634 */     if ((localDeftemplate == null) && (!str1.equals(paramString)))
/*      */     {
/*  636 */       localDeftemplate = this.m_agenda.getModule("MAIN").getDeftemplate(paramString);
/*      */     }
/*      */     
/*  639 */     return localDeftemplate;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   Deftemplate createDeftemplate(String paramString)
/*      */     throws JessException
/*      */   {
/*  651 */     Deftemplate localDeftemplate = findDeftemplate(paramString);
/*      */     
/*  653 */     if (localDeftemplate == null)
/*      */     {
/*  655 */       localDeftemplate = addDeftemplate(new Deftemplate(paramString, "(Implied)", this));
/*  656 */       localDeftemplate.addMultiSlot("__data", Funcall.NILLIST);
/*      */     }
/*      */     
/*      */ 
/*  660 */     return localDeftemplate;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Deftemplate addDeftemplate(Deftemplate paramDeftemplate)
/*      */     throws JessException
/*      */   {
/*  671 */     Defmodule localDefmodule = this.m_agenda.getModule(paramDeftemplate.getModule());
/*      */     
/*  673 */     return localDefmodule.addDeftemplate(paramDeftemplate, this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Deffacts addDeffacts(Deffacts paramDeffacts)
/*      */     throws JessException
/*      */   {
/*  683 */     broadcastEvent(8, paramDeffacts);
/*  684 */     this.m_deffacts.add(paramDeffacts);
/*  685 */     return paramDeffacts;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Defglobal addDefglobal(Defglobal paramDefglobal)
/*      */     throws JessException
/*      */   {
/*  696 */     broadcastEvent(256, paramDefglobal);
/*      */     
/*  698 */     paramDefglobal.reset(this);
/*  699 */     this.m_defglobals.add(paramDefglobal);
/*  700 */     return paramDefglobal;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Defglobal findDefglobal(String paramString)
/*      */   {
/*  709 */     for (Iterator localIterator = listDefglobals(); localIterator.hasNext();) {
/*  710 */       Defglobal localDefglobal = (Defglobal)localIterator.next();
/*  711 */       if (localDefglobal.getName().equals(paramString))
/*  712 */         return localDefglobal;
/*      */     }
/*  714 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Userfunction addUserfunction(Userfunction paramUserfunction)
/*      */   {
/*      */     try
/*      */     {
/*  725 */       broadcastEvent(512, paramUserfunction);
/*      */     } catch (JessException localJessException) {
/*  727 */       return null;
/*      */     }
/*      */     
/*      */     FunctionHolder localFunctionHolder;
/*  731 */     if ((localFunctionHolder = (FunctionHolder)this.m_functions.get(paramUserfunction.getName())) != null) {
/*  732 */       localFunctionHolder.setFunction(paramUserfunction);
/*      */     } else
/*  734 */       localFunctionHolder = new FunctionHolder(paramUserfunction);
/*  735 */     this.m_functions.put(paramUserfunction.getName(), localFunctionHolder);
/*  736 */     return paramUserfunction;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Userpackage addUserpackage(Userpackage paramUserpackage)
/*      */   {
/*      */     try
/*      */     {
/*  748 */       broadcastEvent(1024, paramUserpackage);
/*      */     } catch (JessException localJessException) {
/*  750 */       return null;
/*      */     }
/*      */     
/*  753 */     paramUserpackage.add(this);
/*  754 */     return paramUserpackage;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public final Userfunction findUserfunction(String paramString)
/*      */   {
/*  763 */     FunctionHolder localFunctionHolder = (FunctionHolder)this.m_functions.get(paramString);
/*  764 */     if (localFunctionHolder != null) {
/*  765 */       Userfunction localUserfunction = localFunctionHolder.getFunction();
/*  766 */       return localUserfunction;
/*      */     }
/*  768 */     return Funcall.getIntrinsic(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   final FunctionHolder findFunctionHolder(String paramString)
/*      */   {
/*  777 */     FunctionHolder localFunctionHolder = (FunctionHolder)this.m_functions.get(paramString);
/*  778 */     if (localFunctionHolder == null) {
/*  779 */       Userfunction localUserfunction = Funcall.getIntrinsic(paramString);
/*  780 */       if (localUserfunction != null)
/*  781 */         addUserfunction(localUserfunction);
/*  782 */       localFunctionHolder = (FunctionHolder)this.m_functions.get(paramString);
/*      */     }
/*  784 */     return localFunctionHolder;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void addDefmodule(String paramString)
/*      */     throws JessException
/*      */   {
/*  858 */     this.m_agenda.addDefmodule(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void addDefmodule(String paramString1, String paramString2)
/*      */     throws JessException
/*      */   {
/*  866 */     this.m_agenda.addDefmodule(paramString1, paramString2);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public String getCurrentModule()
/*      */   {
/*  873 */     return this.m_agenda.getCurrentModule();
/*      */   }
/*      */   
/*      */ 
/*      */   public String setCurrentModule(String paramString)
/*      */     throws JessException
/*      */   {
/*  880 */     return this.m_agenda.setCurrentModule(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */   public Iterator listModules()
/*      */     throws JessException
/*      */   {
/*  887 */     return this.m_agenda.listModules();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public String getFocus()
/*      */   {
/*  894 */     return this.m_agenda.getFocus();
/*      */   }
/*      */   
/*      */ 
/*      */   public void setFocus(String paramString)
/*      */     throws JessException
/*      */   {
/*  901 */     this.m_agenda.setFocus(paramString, this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public Iterator listFocusStack()
/*      */     throws JessException
/*      */   {
/*  909 */     return this.m_agenda.listFocusStack();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void clearFocusStack()
/*      */   {
/*  916 */     this.m_agenda.clearFocusStack();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public String popFocus(String paramString)
/*      */     throws JessException
/*      */   {
/*  925 */     return this.m_agenda.popFocus(this, paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void verifyModule(String paramString)
/*      */     throws JessException
/*      */   {
/*  933 */     this.m_agenda.verifyModule(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String resolveName(String paramString)
/*      */   {
/*  942 */     return this.m_agenda.resolveName(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   void addActivation(Activation paramActivation)
/*      */     throws JessException
/*      */   {
/*  987 */     broadcastEvent(4, paramActivation);
/*  988 */     this.m_agenda.addActivation(paramActivation, this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   void removeActivation(Activation paramActivation)
/*      */     throws JessException
/*      */   {
/*  996 */     broadcastEvent(-2147483644, paramActivation);
/*  997 */     paramActivation.setInactive();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Iterator listActivations()
/*      */   {
/* 1007 */     return this.m_agenda.listActivations();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Iterator listActivations(String paramString)
/*      */     throws JessException
/*      */   {
/* 1019 */     return this.m_agenda.listActivations(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Object getActivationSemaphore()
/*      */   {
/* 1031 */     return this.m_agenda.getActivationSemaphore();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void waitForActivations()
/*      */   {
/* 1041 */     this.m_agenda.waitForActivations();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String setStrategy(Strategy paramStrategy)
/*      */     throws JessException
/*      */   {
/* 1052 */     return this.m_agenda.setStrategy(paramStrategy, this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Strategy getStrategy()
/*      */   {
/* 1062 */     return this.m_agenda.getStrategy();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public final void setEvalSalience(int paramInt)
/*      */     throws JessException
/*      */   {
/* 1078 */     this.m_agenda.setEvalSalience(paramInt);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public final int getEvalSalience()
/*      */   {
/* 1087 */     return this.m_agenda.getEvalSalience();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int run()
/*      */     throws JessException
/*      */   {
/* 1096 */     broadcastEvent(8192, this);
/* 1097 */     return this.m_agenda.run(this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int run(int paramInt)
/*      */     throws JessException
/*      */   {
/* 1114 */     broadcastEvent(8192, this);
/* 1115 */     return this.m_agenda.run(paramInt, this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int runUntilHalt()
/*      */     throws JessException
/*      */   {
/* 1125 */     broadcastEvent(8192, this);
/* 1126 */     return this.m_agenda.runUntilHalt(this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void halt()
/*      */     throws JessException
/*      */   {
/* 1134 */     broadcastEvent(16384, this);
/* 1135 */     this.m_agenda.halt();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getThisRuleName()
/*      */   {
/* 1145 */     Activation localActivation = getThisActivation();
/* 1146 */     if (localActivation != null) {
/* 1147 */       return localActivation.getRule().getName();
/*      */     }
/* 1149 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Activation getThisActivation()
/*      */   {
/* 1159 */     return this.m_agenda.getThisActivation();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void addJessListener(JessListener paramJessListener)
/*      */   {
/* 1168 */     this.m_jes.addJessListener(paramJessListener);
/*      */   }
/*      */   
/*      */   public void removeJessListener(JessListener paramJessListener) {
/* 1172 */     this.m_jes.removeJessListener(paramJessListener);
/*      */   }
/*      */   
/*      */   public Iterator listJessListeners() {
/* 1176 */     return this.m_jes.listJessListeners();
/*      */   }
/*      */   
/*      */   public int getEventMask() {
/* 1180 */     return this.m_jes.getEventMask();
/*      */   }
/*      */   
/*      */   public void setEventMask(int paramInt) {
/* 1184 */     this.m_jes.setEventMask(paramInt);
/*      */   }
/*      */   
/*      */   final void broadcastEvent(int paramInt, Object paramObject) throws JessException {
/* 1188 */     this.m_jes.broadcastEvent(this, paramInt, paramObject);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private final void readObject(ObjectInputStream paramObjectInputStream)
/*      */     throws IOException, ClassNotFoundException
/*      */   {
/* 1197 */     paramObjectInputStream.defaultReadObject();
/* 1198 */     this.m_routers = new Routers();
/* 1199 */     this.m_tis = new TextReader(true);
/* 1200 */     this.m_jesp = new Jesp(this.m_tis, this);
/* 1201 */     this.m_jes = new JessEventSupport(this);
/* 1202 */     this.m_definstanceList.setEngine(this);
/* 1203 */     this.m_globalContext.setEngine(this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void bload(InputStream paramInputStream)
/*      */     throws IOException, ClassNotFoundException
/*      */   {
/* 1212 */     ObjectInputStream localObjectInputStream = new ObjectInputStream(paramInputStream);
/*      */     
/* 1214 */     this.m_globalContext = ((Context)localObjectInputStream.readObject());
/* 1215 */     this.m_globalContext.setEngine(this);
/* 1216 */     this.m_resetGlobals = localObjectInputStream.readBoolean();
/* 1217 */     this.m_deffacts = ((List)localObjectInputStream.readObject());
/* 1218 */     this.m_defglobals = ((List)localObjectInputStream.readObject());
/* 1219 */     this.m_functions = ((Map)localObjectInputStream.readObject());
/* 1220 */     this.m_factList = ((FactList)localObjectInputStream.readObject());
/* 1221 */     this.m_definstanceList = ((DefinstanceList)localObjectInputStream.readObject());
/* 1222 */     this.m_definstanceList.setEngine(this);
/* 1223 */     this.m_rules = ((Map)localObjectInputStream.readObject());
/* 1224 */     this.m_compiler = ((ReteCompiler)localObjectInputStream.readObject());
/* 1225 */     this.m_storage = ((Map)localObjectInputStream.readObject());
/* 1226 */     this.m_agenda = ((Agenda)localObjectInputStream.readObject());
/* 1227 */     this.m_classImports = ((Hashtable)localObjectInputStream.readObject());
/* 1228 */     this.m_packageImports = ((ArrayList)localObjectInputStream.readObject());
/* 1229 */     this.m_watchInfo = ((boolean[])localObjectInputStream.readObject());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void bsave(OutputStream paramOutputStream)
/*      */     throws IOException
/*      */   {
/* 1237 */     ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(paramOutputStream);
/*      */     
/* 1239 */     localObjectOutputStream.writeObject(this.m_globalContext);
/* 1240 */     localObjectOutputStream.writeBoolean(this.m_resetGlobals);
/* 1241 */     localObjectOutputStream.writeObject(this.m_deffacts);
/* 1242 */     localObjectOutputStream.writeObject(this.m_defglobals);
/* 1243 */     localObjectOutputStream.writeObject(this.m_functions);
/* 1244 */     localObjectOutputStream.writeObject(this.m_factList);
/* 1245 */     localObjectOutputStream.writeObject(this.m_definstanceList);
/* 1246 */     localObjectOutputStream.writeObject(this.m_rules);
/* 1247 */     localObjectOutputStream.writeObject(this.m_compiler);
/* 1248 */     localObjectOutputStream.writeObject(this.m_storage);
/* 1249 */     localObjectOutputStream.writeObject(this.m_agenda);
/* 1250 */     localObjectOutputStream.writeObject(this.m_classImports);
/* 1251 */     localObjectOutputStream.writeObject(this.m_packageImports);
/* 1252 */     localObjectOutputStream.writeObject(this.m_watchInfo);
/* 1253 */     localObjectOutputStream.flush();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value definstance(String paramString, Object paramObject, boolean paramBoolean)
/*      */     throws JessException
/*      */   {
/* 1270 */     return definstance(paramString, paramObject, paramBoolean, getGlobalContext());
/*      */   }
/*      */   
/*      */ 
/*      */   public Value definstance(String paramString, Object paramObject, boolean paramBoolean, Context paramContext)
/*      */     throws JessException
/*      */   {
/* 1277 */     broadcastEvent(32, paramObject);
/* 1278 */     return this.m_definstanceList.definstance(paramString, paramObject, paramBoolean, paramContext);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Fact undefinstance(Object paramObject)
/*      */     throws JessException
/*      */   {
/* 1290 */     Fact localFact = this.m_definstanceList.undefinstance(paramObject);
/* 1291 */     broadcastEvent(-2147483616, paramObject);
/* 1292 */     return localFact;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value updateObject(Object paramObject)
/*      */     throws JessException
/*      */   {
/* 1304 */     return this.m_definstanceList.updateObject(paramObject);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value defclass(String paramString1, String paramString2, String paramString3)
/*      */     throws JessException
/*      */   {
/* 1317 */     broadcastEvent(128, paramString1);
/* 1318 */     return this.m_definstanceList.defclass(paramString1, paramString2, paramString3);
/*      */   }
/*      */   
/*      */   FactList getFactList() {
/* 1322 */     return this.m_factList;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Applet getApplet()
/*      */   {
/* 1335 */     if ((this.m_appObject instanceof Applet)) {
/* 1336 */       return (Applet)this.m_appObject;
/*      */     }
/* 1338 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Class getAppObjectClass()
/*      */   {
/* 1347 */     if (this.m_appObject != null) {
/* 1348 */       return this.m_appObject.getClass();
/*      */     }
/* 1350 */     Class tmp18_15 = class$jess$Rete;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1350 */     if (tmp18_15 == null) tmp18_15; return class$jess$Rete = class$("[Ljess.Rete;", false);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setApplet(Applet paramApplet)
/*      */   {
/* 1360 */     this.m_appObject = paramApplet;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setAppObject(Object paramObject)
/*      */   {
/* 1370 */     this.m_appObject = paramObject;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public final Context getGlobalContext()
/*      */   {
/* 1378 */     return this.m_globalContext;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value executeCommand(String paramString)
/*      */     throws JessException
/*      */   {
/* 1388 */     return executeCommand(paramString, this.m_globalContext);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public final void setResetGlobals(boolean paramBoolean)
/*      */   {
/* 1414 */     this.m_resetGlobals = paramBoolean;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public final boolean getResetGlobals()
/*      */   {
/* 1423 */     return this.m_resetGlobals;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   final ReteCompiler getCompiler()
/*      */   {
/* 1434 */     return this.m_compiler;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value store(String paramString, Value paramValue)
/*      */   {
/* 1447 */     if (paramValue == null) {
/* 1448 */       return (Value)this.m_storage.remove(paramString);
/*      */     }
/* 1450 */     return (Value)this.m_storage.put(paramString, paramValue);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value store(String paramString, Object paramObject)
/*      */   {
/* 1464 */     if (paramObject == null) {
/* 1465 */       return (Value)this.m_storage.remove(paramString);
/*      */     }
/* 1467 */     return (Value)this.m_storage.put(paramString, new Value(paramObject));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value fetch(String paramString)
/*      */   {
/* 1478 */     return (Value)this.m_storage.get(paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void clearStorage()
/*      */   {
/* 1486 */     this.m_storage.clear();
/*      */   }
/*      */   
/*      */   int getTime()
/*      */   {
/* 1491 */     return this.m_factList.getTime();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static Factory getFactory()
/*      */   {
/* 1498 */     return m_factory;
/*      */   }
/*      */   
/*      */   public static void setFactory(Factory paramFactory) {
/* 1502 */     m_factory = paramFactory;
/*      */   }
/*      */   
/*      */   private final void loadScriptlib() {
/*      */     try {
/* 1507 */       new Batch().batch("scriptlib.clp", this);
/*      */     } catch (JessException localJessException) {
/* 1509 */       localJessException.printStackTrace();
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final Class classForName(String paramString)
/*      */     throws ClassNotFoundException
/*      */   {
/* 1520 */     ClassLoader localClassLoader1 = getAppObjectClass().getClassLoader(); Class 
/* 1521 */       tmp11_8 = class$jess$Rete;
/* 1521 */     if (tmp11_8 == null) tmp11_8; ClassLoader localClassLoader2 = (class$jess$Rete = class$("[Ljess.Rete;", false)).getClassLoader();
/*      */     
/* 1523 */     if (localClassLoader1 == null) {
/* 1524 */       return Class.forName(paramString);
/*      */     }
/*      */     try
/*      */     {
/* 1528 */       return Class.forName(paramString, true, localClassLoader1);
/*      */     }
/*      */     catch (ClassNotFoundException localClassNotFoundException) {
/* 1531 */       if (localClassLoader1 != localClassLoader2) {
/* 1532 */         return Class.forName(paramString);
/*      */       }
/* 1534 */       throw localClassNotFoundException;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public Class findClass(String paramString)
/*      */     throws ClassNotFoundException
/*      */   {
/* 1543 */     if (paramString.indexOf(".") == -1) {
/* 1544 */       String str = (String)this.m_classImports.get(paramString);
/* 1545 */       if (str != null) {
/* 1546 */         paramString = str;
/*      */       }
/*      */       else {
/* 1549 */         for (Iterator localIterator = this.m_packageImports.iterator(); localIterator.hasNext();) {
/* 1550 */           str = (String)localIterator.next() + paramString;
/*      */           try {
/* 1552 */             Class localClass = classForName(str);
/* 1553 */             this.m_classImports.put(paramString, str);
/* 1554 */             return localClass;
/*      */           }
/*      */           catch (ClassNotFoundException localClassNotFoundException) {}
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1561 */     return classForName(paramString);
/*      */   }
/*      */   
/*      */   public void importPackage(String paramString) {
/* 1565 */     this.m_packageImports.add(paramString);
/*      */   }
/*      */   
/*      */   public void importClass(String paramString) {
/* 1569 */     this.m_classImports.put(paramString.substring(paramString.lastIndexOf(".") + 1, paramString.length()), paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Iterator runQuery(String paramString, ValueVector paramValueVector)
/*      */     throws JessException
/*      */   {
/* 1580 */     Funcall localFuncall = new Funcall("run-query", this);
/* 1581 */     localFuncall.add(new Value(paramString, 2));
/* 1582 */     localFuncall.addAll(paramValueVector);
/*      */     
/* 1584 */     Context localContext = getGlobalContext();
/* 1585 */     Value localValue = localFuncall.execute(localContext);
/* 1586 */     return (Iterator)localValue.externalAddressValue(localContext);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void watch(int paramInt)
/*      */     throws JessException
/*      */   {
/* 1602 */     this.m_watchInfo[paramInt] = true;
/* 1603 */     int i = 0;
/* 1604 */     switch (paramInt) {
/*      */     case 1: 
/* 1606 */       i = 2;
/* 1607 */       break;
/*      */     
/*      */     case 0: 
/* 1610 */       i = 16;
/* 1611 */       break;
/*      */     
/*      */     case 2: 
/* 1614 */       i = 4;
/* 1615 */       break;
/*      */     
/*      */     case 3: 
/* 1618 */       i = 1;
/* 1619 */       break;
/*      */     
/*      */     case 4: 
/* 1622 */       i = 1048576;
/* 1623 */       break;
/*      */     
/*      */     default: 
/* 1626 */       throw new JessException("watch", "Bad argument ", paramInt);
/*      */     }
/* 1628 */     this.m_watchInfo[paramInt] = true;
/* 1629 */     i = getEventMask() | i | 0x800;
/* 1630 */     setEventMask(i);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void unwatch(int paramInt)
/*      */     throws JessException
/*      */   {
/* 1641 */     int i = 0;
/* 1642 */     switch (paramInt) {
/*      */     case 1: 
/* 1644 */       i = 2;
/* 1645 */       break;
/*      */     
/*      */     case 0: 
/* 1648 */       i = 16;
/* 1649 */       break;
/*      */     
/*      */     case 2: 
/* 1652 */       i = 4;
/* 1653 */       break;
/*      */     
/*      */     case 3: 
/* 1656 */       i = 1;
/* 1657 */       break;
/*      */     
/*      */     case 4: 
/* 1660 */       i = 1048576;
/* 1661 */       break;
/*      */     
/*      */     default: 
/* 1664 */       throw new JessException("unwatch", "Bad argument ", paramInt);
/*      */     }
/* 1666 */     this.m_watchInfo[paramInt] = false;
/* 1667 */     i = getEventMask() & (i ^ 0xFFFFFFFF);
/* 1668 */     setEventMask(i);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void watchAll()
/*      */   {
/* 1676 */     for (int i = 0; i < this.m_watchInfo.length; i++) {
/* 1677 */       this.m_watchInfo[i] = true;
/*      */     }
/* 1679 */     i = 1048599;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1684 */     i = getEventMask() | 0x800 | i;
/* 1685 */     setEventMask(i);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void unwatchAll()
/*      */   {
/* 1692 */     for (int i = 0; i < this.m_watchInfo.length; i++) {
/* 1693 */       this.m_watchInfo[i] = false;
/*      */     }
/* 1695 */     i = 1048599;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1700 */     i = getEventMask() & (i ^ 0xFFFFFFFF);
/* 1701 */     setEventMask(i);
/*      */   }
/*      */   
/*      */   boolean watchingAny() {
/* 1705 */     for (int i = 0; i < this.m_watchInfo.length; i++)
/* 1706 */       if (this.m_watchInfo[i] != 0)
/* 1707 */         return true;
/* 1708 */     return false;
/*      */   }
/*      */   
/*      */   boolean watching(int paramInt) {
/* 1712 */     return this.m_watchInfo[paramInt];
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void eventHappened(JessEvent paramJessEvent)
/*      */   {
/* 1721 */     if (!watchingAny())
/* 1722 */       return;
/* 1723 */     int i = paramJessEvent.getType();
/* 1724 */     if ((i & 0x80000000) != 0) 0; int j = 1;
/* 1725 */     if ((i & 0x40000000) != 0) 0; int k = 1;
/*      */     
/* 1727 */     PrintWriter localPrintWriter = getOutStream();
/*      */     Object localObject;
/* 1729 */     switch (i & 0x7FFFFFFF & 0xBFFFFFFF)
/*      */     {
/*      */ 
/*      */     case 16: 
/* 1733 */       if (watching(0)) {
/* 1734 */         localObject = (Fact)paramJessEvent.getObject();
/* 1735 */         localPrintWriter.print(k != 0 ? " <=> " : j != 0 ? " <== " : " ==> ");
/* 1736 */         localPrintWriter.print("f-");
/* 1737 */         localPrintWriter.print(((Fact)localObject).getFactId());
/* 1738 */         localPrintWriter.print(" ");
/* 1739 */         localPrintWriter.println(localObject);
/* 1740 */         localPrintWriter.flush();
/*      */       }
/* 1742 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 1048576: 
/* 1747 */       if (watching(4)) {
/* 1748 */         localPrintWriter.print(j != 0 ? " <== " : " ==> ");
/* 1749 */         localPrintWriter.print("Focus ");
/* 1750 */         localPrintWriter.println(paramJessEvent.getObject());
/* 1751 */         localPrintWriter.flush();
/*      */       }
/* 1753 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 2: 
/* 1758 */       if (watching(1))
/* 1759 */         ((Activation)paramJessEvent.getObject()).debugPrint(getOutStream());
/* 1760 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 4: 
/* 1765 */       if (watching(2)) {
/* 1766 */         localObject = (Activation)paramJessEvent.getObject();
/* 1767 */         localPrintWriter.print(j != 0 ? "<== " : "==> ");
/* 1768 */         localPrintWriter.print("Activation: ");
/* 1769 */         localPrintWriter.print(((Activation)localObject).getRule().getDisplayName());
/* 1770 */         localPrintWriter.print(" : ");
/* 1771 */         localPrintWriter.println(((Activation)localObject).getToken().factList());
/* 1772 */         localPrintWriter.flush();
/*      */       }
/* 1774 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 1: 
/* 1779 */       if ((watching(3)) && (j == 0)) {
/* 1780 */         localPrintWriter.println(((HasLHS)paramJessEvent.getObject()).getCompilationTrace());
/* 1781 */         localPrintWriter.flush();
/*      */       }
/* 1783 */       break;
/*      */     }
/*      */     
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public String toString()
/*      */   {
/* 1792 */     return "[Rete]";
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public ArrayList getSupportingTokens(Fact paramFact)
/*      */   {
/* 1814 */     return this.m_factList.getSupportingTokens(paramFact);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public ArrayList getSupportedFacts(Fact paramFact)
/*      */   {
/* 1826 */     return this.m_factList.getSupportedFacts(paramFact);
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public void reset()
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_1
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   10: dup
/*      */     //   11: astore_1
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: invokevirtual 255	jess/Rete:removeAllFacts	()V
/*      */     //   17: aload_0
/*      */     //   18: getfield 122	jess/Rete:m_globalContext	Ljess/Context;
/*      */     //   21: invokevirtual 258	jess/Context:removeNonGlobals	()V
/*      */     //   24: aload_0
/*      */     //   25: getfield 134	jess/Rete:m_agenda	Ljess/Agenda;
/*      */     //   28: aload_0
/*      */     //   29: invokevirtual 260	jess/Agenda:reset	(Ljess/Rete;)V
/*      */     //   32: aload_0
/*      */     //   33: invokestatic 263	jess/Fact:getInitialFact	()Ljess/Fact;
/*      */     //   36: aload_0
/*      */     //   37: invokevirtual 267	jess/Rete:getGlobalContext	()Ljess/Context;
/*      */     //   40: invokevirtual 271	jess/Rete:assertFact	(Ljess/Fact;Ljess/Context;)Ljess/Fact;
/*      */     //   43: pop
/*      */     //   44: aload_0
/*      */     //   45: invokespecial 274	jess/Rete:resetDefglobals	()V
/*      */     //   48: aload_0
/*      */     //   49: invokespecial 277	jess/Rete:resetDeffacts	()V
/*      */     //   52: aload_1
/*      */     //   53: monitorexit
/*      */     //   54: aload_0
/*      */     //   55: getfield 139	jess/Rete:m_definstanceList	Ljess/DefinstanceList;
/*      */     //   58: invokevirtual 279	jess/DefinstanceList:reset	()V
/*      */     //   61: aload_0
/*      */     //   62: sipush 4096
/*      */     //   65: aload_0
/*      */     //   66: invokevirtual 169	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*      */     //   69: return
/*      */     // Line number table:
/*      */     //   Java source line #240	-> byte code offset #0
/*      */     //   Java source line #241	-> byte code offset #13
/*      */     //   Java source line #242	-> byte code offset #17
/*      */     //   Java source line #243	-> byte code offset #24
/*      */     //   Java source line #244	-> byte code offset #32
/*      */     //   Java source line #245	-> byte code offset #44
/*      */     //   Java source line #246	-> byte code offset #48
/*      */     //   Java source line #248	-> byte code offset #54
/*      */     //   Java source line #249	-> byte code offset #61
/*      */     //   Java source line #252	-> byte code offset #69
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	70	0	this	Rete
/*      */     //   3	50	1	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	54	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Fact assertString(String paramString, Context paramContext)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_3
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   10: dup
/*      */     //   11: astore_3
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   17: invokevirtual 294	jess/awt/TextReader:clear	()V
/*      */     //   20: aload_0
/*      */     //   21: getfield 298	jess/Rete:m_jesp	Ljess/Jesp;
/*      */     //   24: invokevirtual 299	jess/Jesp:clear	()V
/*      */     //   27: aload_0
/*      */     //   28: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   31: new 302	java/lang/StringBuffer
/*      */     //   34: dup
/*      */     //   35: ldc_w 304
/*      */     //   38: invokespecial 307	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
/*      */     //   41: aload_1
/*      */     //   42: invokevirtual 311	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*      */     //   45: bipush 41
/*      */     //   47: invokevirtual 314	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
/*      */     //   50: invokevirtual 318	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*      */     //   53: invokevirtual 321	jess/awt/TextReader:appendText	(Ljava/lang/String;)V
/*      */     //   56: aload_0
/*      */     //   57: getfield 298	jess/Rete:m_jesp	Ljess/Jesp;
/*      */     //   60: aconst_null
/*      */     //   61: aload_2
/*      */     //   62: invokevirtual 325	jess/Jesp:parseAndExecuteFuncall	(Ljess/JessToken;Ljess/Context;)Ljess/Value;
/*      */     //   65: astore 6
/*      */     //   67: aload 6
/*      */     //   69: invokevirtual 329	jess/Value:type	()I
/*      */     //   72: bipush 16
/*      */     //   74: if_icmpne +12 -> 86
/*      */     //   77: aload 6
/*      */     //   79: aload_2
/*      */     //   80: invokevirtual 335	jess/Value:factValue	(Ljess/Context;)Ljess/Fact;
/*      */     //   83: aload_3
/*      */     //   84: monitorexit
/*      */     //   85: areturn
/*      */     //   86: aconst_null
/*      */     //   87: aload_3
/*      */     //   88: monitorexit
/*      */     //   89: areturn
/*      */     // Line number table:
/*      */     //   Java source line #276	-> byte code offset #0
/*      */     //   Java source line #277	-> byte code offset #13
/*      */     //   Java source line #278	-> byte code offset #20
/*      */     //   Java source line #279	-> byte code offset #27
/*      */     //   Java source line #280	-> byte code offset #56
/*      */     //   Java source line #281	-> byte code offset #67
/*      */     //   Java source line #282	-> byte code offset #77
/*      */     //   Java source line #284	-> byte code offset #86
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	90	0	this	Rete
/*      */     //   0	90	1	paramString	String
/*      */     //   0	90	2	paramContext	Context
/*      */     //   3	1	3	localObject1	Object
/*      */     //   11	77	3	Ljava/lang/Object;	Object
/*      */     //   65	13	6	localValue	Value
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	85	3	finally
/*      */     //   86	89	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Fact assertFact(Fact paramFact, Context paramContext)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_3
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   10: dup
/*      */     //   11: astore_3
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 111	jess/Rete:m_factList	Ljess/FactList;
/*      */     //   17: aload_1
/*      */     //   18: aload_0
/*      */     //   19: aload_2
/*      */     //   20: invokevirtual 346	jess/FactList:assertFact	(Ljess/Fact;Ljess/Rete;Ljess/Context;)Ljess/Fact;
/*      */     //   23: aload_3
/*      */     //   24: monitorexit
/*      */     //   25: areturn
/*      */     // Line number table:
/*      */     //   Java source line #339	-> byte code offset #0
/*      */     //   Java source line #340	-> byte code offset #13
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	26	0	this	Rete
/*      */     //   0	26	1	paramFact	Fact
/*      */     //   0	26	2	paramContext	Context
/*      */     //   3	21	3	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	25	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   Fact assertKeepID(Fact paramFact, Context paramContext)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_3
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   10: dup
/*      */     //   11: astore_3
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 111	jess/Rete:m_factList	Ljess/FactList;
/*      */     //   17: aload_1
/*      */     //   18: aload_0
/*      */     //   19: aload_2
/*      */     //   20: invokevirtual 349	jess/FactList:assertKeepID	(Ljess/Fact;Ljess/Rete;Ljess/Context;)Ljess/Fact;
/*      */     //   23: aload_3
/*      */     //   24: monitorexit
/*      */     //   25: areturn
/*      */     // Line number table:
/*      */     //   Java source line #345	-> byte code offset #0
/*      */     //   Java source line #346	-> byte code offset #13
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	26	0	this	Rete
/*      */     //   0	26	1	paramFact	Fact
/*      */     //   0	26	2	paramContext	Context
/*      */     //   3	21	3	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	25	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Fact retractString(String paramString)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_2
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   10: dup
/*      */     //   11: astore_2
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   17: invokevirtual 294	jess/awt/TextReader:clear	()V
/*      */     //   20: aload_0
/*      */     //   21: getfield 298	jess/Rete:m_jesp	Ljess/Jesp;
/*      */     //   24: invokevirtual 299	jess/Jesp:clear	()V
/*      */     //   27: aload_0
/*      */     //   28: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   31: aload_1
/*      */     //   32: invokevirtual 321	jess/awt/TextReader:appendText	(Ljava/lang/String;)V
/*      */     //   35: aload_0
/*      */     //   36: getfield 298	jess/Rete:m_jesp	Ljess/Jesp;
/*      */     //   39: invokevirtual 353	jess/Jesp:parseFact	()Ljess/Fact;
/*      */     //   42: astore 5
/*      */     //   44: aload_0
/*      */     //   45: aload 5
/*      */     //   47: invokevirtual 356	jess/Rete:retract	(Ljess/Fact;)Ljess/Fact;
/*      */     //   50: aload_2
/*      */     //   51: monitorexit
/*      */     //   52: areturn
/*      */     //   53: astore_2
/*      */     //   54: new 108	jess/JessException
/*      */     //   57: dup
/*      */     //   58: ldc_w 359
/*      */     //   61: aload_1
/*      */     //   62: aload_2
/*      */     //   63: invokespecial 363	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*      */     //   66: athrow
/*      */     // Line number table:
/*      */     //   Java source line #360	-> byte code offset #0
/*      */     //   Java source line #361	-> byte code offset #0
/*      */     //   Java source line #362	-> byte code offset #13
/*      */     //   Java source line #363	-> byte code offset #20
/*      */     //   Java source line #364	-> byte code offset #27
/*      */     //   Java source line #365	-> byte code offset #35
/*      */     //   Java source line #366	-> byte code offset #44
/*      */     //   Java source line #369	-> byte code offset #54
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	67	0	this	Rete
/*      */     //   0	67	1	paramString	String
/*      */     //   3	48	2	Ljava/lang/Object;	Object
/*      */     //   53	10	2	localException	Exception
/*      */     //   42	4	5	localFact	Fact
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	52	3	finally
/*      */     //   0	52	53	java/lang/Exception
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Fact retract(Fact paramFact)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: invokevirtual 366	jess/Fact:isShadow	()Z
/*      */     //   4: ifeq +21 -> 25
/*      */     //   7: aload_1
/*      */     //   8: ldc_w 367
/*      */     //   11: invokevirtual 372	jess/Fact:getSlotValue	(Ljava/lang/String;)Ljess/Value;
/*      */     //   14: aconst_null
/*      */     //   15: invokevirtual 376	jess/Value:externalAddressValue	(Ljess/Context;)Ljava/lang/Object;
/*      */     //   18: astore_2
/*      */     //   19: aload_0
/*      */     //   20: aload_2
/*      */     //   21: invokevirtual 380	jess/Rete:undefinstance	(Ljava/lang/Object;)Ljess/Fact;
/*      */     //   24: areturn
/*      */     //   25: goto +6 -> 31
/*      */     //   28: aload_2
/*      */     //   29: monitorexit
/*      */     //   30: athrow
/*      */     //   31: aload_0
/*      */     //   32: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   35: dup
/*      */     //   36: astore_2
/*      */     //   37: monitorenter
/*      */     //   38: aload_0
/*      */     //   39: getfield 111	jess/Rete:m_factList	Ljess/FactList;
/*      */     //   42: aload_1
/*      */     //   43: aload_0
/*      */     //   44: invokevirtual 383	jess/FactList:retract	(Ljess/Fact;Ljess/Rete;)Ljess/Fact;
/*      */     //   47: aload_2
/*      */     //   48: monitorexit
/*      */     //   49: areturn
/*      */     // Line number table:
/*      */     //   Java source line #382	-> byte code offset #0
/*      */     //   Java source line #383	-> byte code offset #7
/*      */     //   Java source line #385	-> byte code offset #19
/*      */     //   Java source line #387	-> byte code offset #25
/*      */     //   Java source line #388	-> byte code offset #38
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	50	0	this	Rete
/*      */     //   0	50	1	paramFact	Fact
/*      */     //   18	3	2	localObject1	Object
/*      */     //   28	20	2	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   28	30	28	finally
/*      */     //   38	49	28	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   Fact retractNoUndefinstance(Fact paramFact)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_2
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   10: dup
/*      */     //   11: astore_2
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 111	jess/Rete:m_factList	Ljess/FactList;
/*      */     //   17: aload_1
/*      */     //   18: aload_0
/*      */     //   19: invokevirtual 383	jess/FactList:retract	(Ljess/Fact;Ljess/Rete;)Ljess/Fact;
/*      */     //   22: aload_2
/*      */     //   23: monitorexit
/*      */     //   24: areturn
/*      */     // Line number table:
/*      */     //   Java source line #394	-> byte code offset #0
/*      */     //   Java source line #395	-> byte code offset #13
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	25	0	this	Rete
/*      */     //   0	25	1	paramFact	Fact
/*      */     //   3	20	2	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	24	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Iterator listDeffacts()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_1
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 160	jess/Rete:m_deffacts	Ljava/util/List;
/*      */     //   10: dup
/*      */     //   11: astore_1
/*      */     //   12: monitorenter
/*      */     //   13: new 185	java/util/ArrayList
/*      */     //   16: dup
/*      */     //   17: aload_0
/*      */     //   18: getfield 160	jess/Rete:m_deffacts	Ljava/util/List;
/*      */     //   21: invokespecial 425	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
/*      */     //   24: invokevirtual 231	java/util/ArrayList:iterator	()Ljava/util/Iterator;
/*      */     //   27: aload_1
/*      */     //   28: monitorexit
/*      */     //   29: areturn
/*      */     // Line number table:
/*      */     //   Java source line #498	-> byte code offset #0
/*      */     //   Java source line #499	-> byte code offset #13
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	30	0	this	Rete
/*      */     //   3	25	1	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	29	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Iterator listDefrules()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_1
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 129	jess/Rete:m_rules	Ljava/util/Map;
/*      */     //   10: dup
/*      */     //   11: astore_1
/*      */     //   12: monitorenter
/*      */     //   13: new 185	java/util/ArrayList
/*      */     //   16: dup
/*      */     //   17: aload_0
/*      */     //   18: getfield 129	jess/Rete:m_rules	Ljava/util/Map;
/*      */     //   21: invokeinterface 452 1 0
/*      */     //   26: invokespecial 425	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
/*      */     //   29: invokevirtual 231	java/util/ArrayList:iterator	()Ljava/util/Iterator;
/*      */     //   32: aload_1
/*      */     //   33: monitorexit
/*      */     //   34: areturn
/*      */     // Line number table:
/*      */     //   Java source line #540	-> byte code offset #0
/*      */     //   Java source line #541	-> byte code offset #13
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	35	0	this	Rete
/*      */     //   3	30	1	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	34	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Iterator listDefglobals()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_1
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 165	jess/Rete:m_defglobals	Ljava/util/List;
/*      */     //   10: dup
/*      */     //   11: astore_1
/*      */     //   12: monitorenter
/*      */     //   13: new 185	java/util/ArrayList
/*      */     //   16: dup
/*      */     //   17: aload_0
/*      */     //   18: getfield 165	jess/Rete:m_defglobals	Ljava/util/List;
/*      */     //   21: invokespecial 425	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
/*      */     //   24: invokevirtual 231	java/util/ArrayList:iterator	()Ljava/util/Iterator;
/*      */     //   27: aload_1
/*      */     //   28: monitorexit
/*      */     //   29: areturn
/*      */     // Line number table:
/*      */     //   Java source line #577	-> byte code offset #0
/*      */     //   Java source line #578	-> byte code offset #13
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	30	0	this	Rete
/*      */     //   3	25	1	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	29	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public Iterator listFunctions()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: new 185	java/util/ArrayList
/*      */     //   3: dup
/*      */     //   4: invokespecial 187	java/util/ArrayList:<init>	()V
/*      */     //   7: astore_1
/*      */     //   8: goto +6 -> 14
/*      */     //   11: aload_2
/*      */     //   12: monitorexit
/*      */     //   13: athrow
/*      */     //   14: aload_0
/*      */     //   15: getfield 189	jess/Rete:m_functions	Ljava/util/Map;
/*      */     //   18: dup
/*      */     //   19: astore_2
/*      */     //   20: monitorenter
/*      */     //   21: aload_0
/*      */     //   22: getfield 189	jess/Rete:m_functions	Ljava/util/Map;
/*      */     //   25: invokeinterface 193 1 0
/*      */     //   30: invokeinterface 197 1 0
/*      */     //   35: astore 5
/*      */     //   37: goto +22 -> 59
/*      */     //   40: aload_1
/*      */     //   41: aload_0
/*      */     //   42: aload 5
/*      */     //   44: invokeinterface 203 1 0
/*      */     //   49: checkcast 206	java/lang/String
/*      */     //   52: invokevirtual 211	jess/Rete:findUserfunction	(Ljava/lang/String;)Ljess/Userfunction;
/*      */     //   55: invokevirtual 217	java/util/ArrayList:add	(Ljava/lang/Object;)Z
/*      */     //   58: pop
/*      */     //   59: aload 5
/*      */     //   61: invokeinterface 221 1 0
/*      */     //   66: ifne -26 -> 40
/*      */     //   69: aload_2
/*      */     //   70: monitorexit
/*      */     //   71: aload_1
/*      */     //   72: invokevirtual 231	java/util/ArrayList:iterator	()Ljava/util/Iterator;
/*      */     //   75: areturn
/*      */     // Line number table:
/*      */     //   Java source line #589	-> byte code offset #0
/*      */     //   Java source line #590	-> byte code offset #8
/*      */     //   Java source line #591	-> byte code offset #21
/*      */     //   Java source line #591	-> byte code offset #21
/*      */     //   Java source line #592	-> byte code offset #40
/*      */     //   Java source line #591	-> byte code offset #59
/*      */     //   Java source line #595	-> byte code offset #71
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	76	0	this	Rete
/*      */     //   7	65	1	localArrayList	ArrayList
/*      */     //   11	59	2	Ljava/lang/Object;	Object
/*      */     //   35	25	5	localIterator	Iterator
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   11	13	11	finally
/*      */     //   21	71	11	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public final HasLHS addDefrule(HasLHS paramHasLHS)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_2
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   10: dup
/*      */     //   11: astore_2
/*      */     //   12: monitorenter
/*      */     //   13: aconst_null
/*      */     //   14: astore 5
/*      */     //   16: aload_0
/*      */     //   17: aload_1
/*      */     //   18: invokevirtual 568	jess/HasLHS:getName	()Ljava/lang/String;
/*      */     //   21: invokevirtual 571	jess/Rete:unDefrule	(Ljava/lang/String;)Ljess/Value;
/*      */     //   24: pop
/*      */     //   25: aload_0
/*      */     //   26: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   29: aload_1
/*      */     //   30: aload_0
/*      */     //   31: invokevirtual 575	jess/ReteCompiler:addRule	(Ljess/HasLHS;Ljess/Rete;)V
/*      */     //   34: goto +25 -> 59
/*      */     //   37: astore 6
/*      */     //   39: aload_1
/*      */     //   40: aload_0
/*      */     //   41: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   44: invokevirtual 581	jess/ReteCompiler:getRoot	()Ljess/Node;
/*      */     //   47: invokevirtual 585	jess/HasLHS:remove	(Ljess/Node;)V
/*      */     //   50: aload 6
/*      */     //   52: athrow
/*      */     //   53: astore 6
/*      */     //   55: aload 6
/*      */     //   57: astore 5
/*      */     //   59: aload_0
/*      */     //   60: getfield 129	jess/Rete:m_rules	Ljava/util/Map;
/*      */     //   63: aload_1
/*      */     //   64: invokevirtual 568	jess/HasLHS:getName	()Ljava/lang/String;
/*      */     //   67: aload_1
/*      */     //   68: invokeinterface 550 3 0
/*      */     //   73: pop
/*      */     //   74: aload_0
/*      */     //   75: iconst_1
/*      */     //   76: aload_1
/*      */     //   77: invokevirtual 169	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*      */     //   80: aload 5
/*      */     //   82: ifnull +6 -> 88
/*      */     //   85: aload 5
/*      */     //   87: athrow
/*      */     //   88: aload_1
/*      */     //   89: aload_2
/*      */     //   90: monitorexit
/*      */     //   91: areturn
/*      */     // Line number table:
/*      */     //   Java source line #794	-> byte code offset #0
/*      */     //   Java source line #795	-> byte code offset #13
/*      */     //   Java source line #796	-> byte code offset #16
/*      */     //   Java source line #797	-> byte code offset #25
/*      */     //   Java source line #798	-> byte code offset #25
/*      */     //   Java source line #801	-> byte code offset #39
/*      */     //   Java source line #802	-> byte code offset #50
/*      */     //   Java source line #805	-> byte code offset #55
/*      */     //   Java source line #807	-> byte code offset #59
/*      */     //   Java source line #809	-> byte code offset #74
/*      */     //   Java source line #811	-> byte code offset #80
/*      */     //   Java source line #812	-> byte code offset #85
/*      */     //   Java source line #814	-> byte code offset #88
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	92	0	this	Rete
/*      */     //   0	92	1	paramHasLHS	HasLHS
/*      */     //   3	87	2	Ljava/lang/Object;	Object
/*      */     //   14	72	5	localObject1	Object
/*      */     //   37	14	6	localRuleCompilerException	RuleCompilerException
/*      */     //   53	3	6	localJessException	JessException
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	91	3	finally
/*      */     //   25	34	37	jess/RuleCompilerException
/*      */     //   25	34	53	jess/JessException
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   public final Value unDefrule(String paramString)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_2
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   10: dup
/*      */     //   11: astore_2
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: aload_1
/*      */     //   15: invokevirtual 587	jess/Rete:findDefrule	(Ljava/lang/String;)Ljess/HasLHS;
/*      */     //   18: astore 5
/*      */     //   20: aload 5
/*      */     //   22: ifnull +124 -> 146
/*      */     //   25: aload 5
/*      */     //   27: aload_0
/*      */     //   28: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   31: invokevirtual 581	jess/ReteCompiler:getRoot	()Ljess/Node;
/*      */     //   34: invokevirtual 585	jess/HasLHS:remove	(Ljess/Node;)V
/*      */     //   37: aload_0
/*      */     //   38: getfield 129	jess/Rete:m_rules	Ljava/util/Map;
/*      */     //   41: aload_0
/*      */     //   42: aload_1
/*      */     //   43: invokevirtual 416	jess/Rete:resolveName	(Ljava/lang/String;)Ljava/lang/String;
/*      */     //   46: invokeinterface 589 2 0
/*      */     //   51: pop
/*      */     //   52: aload 5
/*      */     //   54: instanceof 590
/*      */     //   57: ifeq +53 -> 110
/*      */     //   60: aload_0
/*      */     //   61: getfield 134	jess/Rete:m_agenda	Ljess/Agenda;
/*      */     //   64: invokevirtual 594	jess/Agenda:listActivations	()Ljava/util/Iterator;
/*      */     //   67: astore 6
/*      */     //   69: goto +31 -> 100
/*      */     //   72: aload 6
/*      */     //   74: invokeinterface 203 1 0
/*      */     //   79: checkcast 595	jess/Activation
/*      */     //   82: astore 7
/*      */     //   84: aload 7
/*      */     //   86: invokevirtual 600	jess/Activation:getRule	()Ljess/Defrule;
/*      */     //   89: aload 5
/*      */     //   91: if_acmpne +9 -> 100
/*      */     //   94: aload_0
/*      */     //   95: aload 7
/*      */     //   97: invokevirtual 604	jess/Rete:removeActivation	(Ljess/Activation;)V
/*      */     //   100: aload 6
/*      */     //   102: invokeinterface 221 1 0
/*      */     //   107: ifne -35 -> 72
/*      */     //   110: aload 5
/*      */     //   112: invokevirtual 608	jess/HasLHS:getNext	()Ljess/HasLHS;
/*      */     //   115: ifnull +16 -> 131
/*      */     //   118: aload_0
/*      */     //   119: aload 5
/*      */     //   121: invokevirtual 608	jess/HasLHS:getNext	()Ljess/HasLHS;
/*      */     //   124: invokevirtual 568	jess/HasLHS:getName	()Ljava/lang/String;
/*      */     //   127: invokevirtual 571	jess/Rete:unDefrule	(Ljava/lang/String;)Ljess/Value;
/*      */     //   130: pop
/*      */     //   131: aload_0
/*      */     //   132: ldc_w 609
/*      */     //   135: aload 5
/*      */     //   137: invokevirtual 169	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*      */     //   140: getstatic 612	jess/Funcall:TRUE	Ljess/Value;
/*      */     //   143: aload_2
/*      */     //   144: monitorexit
/*      */     //   145: areturn
/*      */     //   146: aload_2
/*      */     //   147: monitorexit
/*      */     //   148: getstatic 615	jess/Funcall:FALSE	Ljess/Value;
/*      */     //   151: areturn
/*      */     // Line number table:
/*      */     //   Java source line #826	-> byte code offset #0
/*      */     //   Java source line #827	-> byte code offset #13
/*      */     //   Java source line #828	-> byte code offset #20
/*      */     //   Java source line #829	-> byte code offset #25
/*      */     //   Java source line #830	-> byte code offset #37
/*      */     //   Java source line #831	-> byte code offset #52
/*      */     //   Java source line #832	-> byte code offset #60
/*      */     //   Java source line #832	-> byte code offset #60
/*      */     //   Java source line #833	-> byte code offset #72
/*      */     //   Java source line #834	-> byte code offset #84
/*      */     //   Java source line #835	-> byte code offset #94
/*      */     //   Java source line #832	-> byte code offset #100
/*      */     //   Java source line #839	-> byte code offset #110
/*      */     //   Java source line #840	-> byte code offset #118
/*      */     //   Java source line #842	-> byte code offset #131
/*      */     //   Java source line #843	-> byte code offset #140
/*      */     //   Java source line #848	-> byte code offset #148
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	152	0	this	Rete
/*      */     //   0	152	1	paramString	String
/*      */     //   3	1	2	localObject1	Object
/*      */     //   11	136	2	Ljava/lang/Object;	Object
/*      */     //   18	118	5	localHasLHS	HasLHS
/*      */     //   67	34	6	localIterator	Iterator
/*      */     //   82	14	7	localActivation	Activation
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	145	3	finally
/*      */     //   146	148	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   Token processToken(int paramInt, Fact paramFact)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_3
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   10: dup
/*      */     //   11: astore_3
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 111	jess/Rete:m_factList	Ljess/FactList;
/*      */     //   17: aload_2
/*      */     //   18: invokevirtual 653	jess/FactList:assignTime	(Ljess/Fact;)V
/*      */     //   21: invokestatic 657	jess/Rete:getFactory	()Ljess/factory/Factory;
/*      */     //   24: aload_2
/*      */     //   25: iload_1
/*      */     //   26: invokeinterface 661 3 0
/*      */     //   31: astore 6
/*      */     //   33: aload_0
/*      */     //   34: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   37: invokevirtual 581	jess/ReteCompiler:getRoot	()Ljess/Node;
/*      */     //   40: aload 6
/*      */     //   42: aload_0
/*      */     //   43: invokevirtual 267	jess/Rete:getGlobalContext	()Ljess/Context;
/*      */     //   46: invokevirtual 666	jess/Context:push	()Ljess/Context;
/*      */     //   49: invokevirtual 670	jess/Node:callNodeRight	(Ljess/Token;Ljess/Context;)V
/*      */     //   52: aload 6
/*      */     //   54: aload_3
/*      */     //   55: monitorexit
/*      */     //   56: areturn
/*      */     // Line number table:
/*      */     //   Java source line #951	-> byte code offset #0
/*      */     //   Java source line #952	-> byte code offset #13
/*      */     //   Java source line #953	-> byte code offset #21
/*      */     //   Java source line #954	-> byte code offset #33
/*      */     //   Java source line #955	-> byte code offset #52
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	57	0	this	Rete
/*      */     //   0	57	1	paramInt	int
/*      */     //   0	57	2	paramFact	Fact
/*      */     //   3	52	3	Ljava/lang/Object;	Object
/*      */     //   31	22	6	localToken	Token
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	56	3	finally
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   void updateNodes(Hashtable paramHashtable)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: aconst_null
/*      */     //   1: astore_2
/*      */     //   2: aload_0
/*      */     //   3: getfield 111	jess/Rete:m_factList	Ljess/FactList;
/*      */     //   6: invokevirtual 455	jess/FactList:listFacts	()Ljava/util/Iterator;
/*      */     //   9: astore_3
/*      */     //   10: goto +98 -> 108
/*      */     //   13: aload_3
/*      */     //   14: invokeinterface 203 1 0
/*      */     //   19: checkcast 247	jess/Fact
/*      */     //   22: astore 4
/*      */     //   24: invokestatic 657	jess/Rete:getFactory	()Ljess/factory/Factory;
/*      */     //   27: aload 4
/*      */     //   29: iconst_2
/*      */     //   30: invokeinterface 661 3 0
/*      */     //   35: astore 5
/*      */     //   37: aload_1
/*      */     //   38: invokevirtual 678	java/util/Hashtable:elements	()Ljava/util/Enumeration;
/*      */     //   41: astore 6
/*      */     //   43: goto +55 -> 98
/*      */     //   46: goto +7 -> 53
/*      */     //   49: aload 7
/*      */     //   51: monitorexit
/*      */     //   52: athrow
/*      */     //   53: aload_0
/*      */     //   54: getfield 158	jess/Rete:m_compiler	Ljess/ReteCompiler;
/*      */     //   57: dup
/*      */     //   58: astore 7
/*      */     //   60: monitorenter
/*      */     //   61: aload 6
/*      */     //   63: invokeinterface 683 1 0
/*      */     //   68: checkcast 671	jess/Node
/*      */     //   71: astore 9
/*      */     //   73: aload 9
/*      */     //   75: aload 5
/*      */     //   77: aload_0
/*      */     //   78: invokevirtual 267	jess/Rete:getGlobalContext	()Ljess/Context;
/*      */     //   81: invokevirtual 666	jess/Context:push	()Ljess/Context;
/*      */     //   84: invokevirtual 670	jess/Node:callNodeRight	(Ljess/Token;Ljess/Context;)V
/*      */     //   87: goto +8 -> 95
/*      */     //   90: astore 10
/*      */     //   92: aload 10
/*      */     //   94: astore_2
/*      */     //   95: aload 7
/*      */     //   97: monitorexit
/*      */     //   98: aload 6
/*      */     //   100: invokeinterface 688 1 0
/*      */     //   105: ifne -59 -> 46
/*      */     //   108: aload_3
/*      */     //   109: invokeinterface 221 1 0
/*      */     //   114: ifne -101 -> 13
/*      */     //   117: aload_0
/*      */     //   118: getfield 111	jess/Rete:m_factList	Ljess/FactList;
/*      */     //   121: aload_0
/*      */     //   122: invokevirtual 691	jess/FactList:processPendingFacts	(Ljess/Rete;)V
/*      */     //   125: aload_2
/*      */     //   126: ifnull +5 -> 131
/*      */     //   129: aload_2
/*      */     //   130: athrow
/*      */     //   131: return
/*      */     // Line number table:
/*      */     //   Java source line #964	-> byte code offset #0
/*      */     //   Java source line #965	-> byte code offset #2
/*      */     //   Java source line #965	-> byte code offset #2
/*      */     //   Java source line #966	-> byte code offset #13
/*      */     //   Java source line #967	-> byte code offset #24
/*      */     //   Java source line #968	-> byte code offset #37
/*      */     //   Java source line #968	-> byte code offset #37
/*      */     //   Java source line #969	-> byte code offset #46
/*      */     //   Java source line #970	-> byte code offset #61
/*      */     //   Java source line #971	-> byte code offset #73
/*      */     //   Java source line #972	-> byte code offset #73
/*      */     //   Java source line #974	-> byte code offset #92
/*      */     //   Java source line #968	-> byte code offset #98
/*      */     //   Java source line #965	-> byte code offset #108
/*      */     //   Java source line #978	-> byte code offset #117
/*      */     //   Java source line #979	-> byte code offset #125
/*      */     //   Java source line #980	-> byte code offset #129
/*      */     //   Java source line #981	-> byte code offset #131
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	132	0	this	Rete
/*      */     //   0	132	1	paramHashtable	Hashtable
/*      */     //   1	129	2	localObject1	Object
/*      */     //   9	100	3	localIterator	Iterator
/*      */     //   22	6	4	localFact	Fact
/*      */     //   35	41	5	localToken	Token
/*      */     //   41	58	6	localEnumeration	java.util.Enumeration
/*      */     //   49	47	7	Ljava/lang/Object;	Object
/*      */     //   71	3	9	localNode	Node
/*      */     //   90	3	10	localJessException	JessException
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   49	52	49	finally
/*      */     //   61	98	49	finally
/*      */     //   73	87	90	jess/JessException
/*      */   }
/*      */   
/*      */   protected void aboutToFire(Activation paramActivation) {}
/*      */   
/*      */   protected void justFired(Activation paramActivation) {}
/*      */   
/*      */   /* Error */
/*      */   public Value executeCommand(String paramString, Context paramContext)
/*      */     throws JessException
/*      */   {
/*      */     // Byte code:
/*      */     //   0: goto +6 -> 6
/*      */     //   3: aload_3
/*      */     //   4: monitorexit
/*      */     //   5: athrow
/*      */     //   6: aload_0
/*      */     //   7: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   10: dup
/*      */     //   11: astore_3
/*      */     //   12: monitorenter
/*      */     //   13: aload_0
/*      */     //   14: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   17: invokevirtual 294	jess/awt/TextReader:clear	()V
/*      */     //   20: aload_0
/*      */     //   21: getfield 298	jess/Rete:m_jesp	Ljess/Jesp;
/*      */     //   24: invokevirtual 299	jess/Jesp:clear	()V
/*      */     //   27: aload_0
/*      */     //   28: getfield 293	jess/Rete:m_tis	Ljess/awt/TextReader;
/*      */     //   31: aload_1
/*      */     //   32: invokevirtual 321	jess/awt/TextReader:appendText	(Ljava/lang/String;)V
/*      */     //   35: aload_0
/*      */     //   36: getfield 298	jess/Rete:m_jesp	Ljess/Jesp;
/*      */     //   39: iconst_0
/*      */     //   40: aload_2
/*      */     //   41: invokevirtual 870	jess/Jesp:parse	(ZLjess/Context;)Ljess/Value;
/*      */     //   44: aload_3
/*      */     //   45: monitorexit
/*      */     //   46: areturn
/*      */     // Line number table:
/*      */     //   Java source line #1400	-> byte code offset #0
/*      */     //   Java source line #1401	-> byte code offset #13
/*      */     //   Java source line #1402	-> byte code offset #20
/*      */     //   Java source line #1403	-> byte code offset #27
/*      */     //   Java source line #1404	-> byte code offset #35
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	47	0	this	Rete
/*      */     //   0	47	1	paramString	String
/*      */     //   0	47	2	paramContext	Context
/*      */     //   3	42	3	Ljava/lang/Object;	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   3	5	3	finally
/*      */     //   13	46	3	finally
/*      */   }
/*      */   
/*      */   static Class class$(String paramString, boolean paramBoolean)
/*      */   {
/*      */     try
/*      */     {
/*      */       if (!paramBoolean) {}
/*      */       return Class.forName(paramString).getComponentType();
/*      */     }
/*      */     catch (ClassNotFoundException localClassNotFoundException)
/*      */     {
/*      */       throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Rete.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */