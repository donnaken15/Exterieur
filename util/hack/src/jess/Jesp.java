/*      */ package jess;
/*      */ 
/*      */ import java.io.PrintWriter;
/*      */ import java.io.Reader;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Enumeration;
/*      */ import java.util.Hashtable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Jesp
/*      */ {
/*      */   private static final String JAVACALL = "call";
/*      */   private JessTokenStream m_jts;
/*      */   private Rete m_rete;
/*      */   
/*      */   public Jesp(Reader paramReader, Rete paramRete)
/*      */   {
/*   34 */     this.m_rete = paramRete;
/*   35 */     Tokenizer localTokenizer = paramRete.getInputWrapper(paramReader);
/*      */     
/*   37 */     if (localTokenizer == null) {
/*   38 */       localTokenizer = new Tokenizer(paramReader);
/*      */     }
/*      */     
/*   41 */     this.m_jts = new JessTokenStream(localTokenizer);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value parse(boolean paramBoolean)
/*      */     throws JessException
/*      */   {
/*   54 */     return parse(paramBoolean, this.m_rete.getGlobalContext());
/*      */   }
/*      */   
/*      */   public synchronized Value parse(boolean paramBoolean, Context paramContext)
/*      */     throws JessException
/*      */   {
/*   60 */     Value localValue1 = Funcall.TRUE;Value localValue2 = localValue1;
/*      */     
/*   62 */     if (paramBoolean) {
/*   63 */       this.m_rete.getOutStream().print("Jess> ");
/*   64 */       this.m_rete.getOutStream().flush();
/*      */     }
/*      */     
/*   67 */     while (!localValue1.equals(Funcall.EOF)) {
/*   68 */       localValue2 = localValue1;
/*   69 */       localValue1 = parseSexp(paramContext);
/*      */       
/*   71 */       if (paramBoolean) {
/*   72 */         if (!localValue1.equals(Funcall.NIL))
/*      */         {
/*   74 */           if (localValue1.type() == 512)
/*      */           {
/*   76 */             this.m_rete.getOutStream().print('(');
/*      */           }
/*   78 */           this.m_rete.getOutStream().print(localValue1);
/*      */           
/*   80 */           if (localValue1.type() == 512) {
/*   81 */             this.m_rete.getOutStream().print(')');
/*      */           }
/*   83 */           this.m_rete.getOutStream().println();
/*      */         }
/*   85 */         this.m_rete.getOutStream().print("Jess> ");
/*   86 */         this.m_rete.getOutStream().flush();
/*      */       }
/*      */     }
/*   89 */     return localValue2;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void clear()
/*      */   {
/*   97 */     this.m_jts.clear();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public Value loadFacts(Context paramContext)
/*      */     throws JessException
/*      */   {
/*  106 */     JessToken localJessToken = this.m_jts.nextToken();
/*      */     
/*  108 */     while (localJessToken.m_ttype != 0)
/*      */     {
/*  110 */       this.m_jts.pushBack(localJessToken);
/*  111 */       Fact localFact = parseFact();
/*  112 */       this.m_rete.assertFact(localFact, paramContext);
/*  113 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/*  116 */     return Funcall.TRUE;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final Value parseSexp(Context paramContext)
/*      */     throws JessException
/*      */   {
/*      */     try
/*      */     {
/*  129 */       JessToken localJessToken = this.m_jts.nextToken();
/*  130 */       switch (localJessToken.m_ttype) {
/*      */       case 1: case 2: case 4: 
/*      */       case 8: case 32: case 8192: 
/*  133 */         return localJessToken.tokenToValue(paramContext);
/*      */       case 40: 
/*  135 */         this.m_jts.pushBack(localJessToken);
/*  136 */         break;
/*      */       case 0: 
/*  138 */         if ("EOF".equals(localJessToken.m_sval))
/*  139 */           return Funcall.EOF;
/*      */         break; }
/*  141 */       throw new JessException("Jesp.parseSexp", "Expected a '(', constant, or global variable", localJessToken.toString());
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  146 */       String str = this.m_jts.head();
/*      */       
/*  148 */       if (str.equals("defrule")) {
/*  149 */         return parseDefrule(paramContext);
/*      */       }
/*  151 */       if (str.equals("defquery")) {
/*  152 */         return parseDefquery(paramContext);
/*      */       }
/*  154 */       if (str.equals("deffacts")) {
/*  155 */         return parseDeffacts();
/*      */       }
/*  157 */       if (str.equals("deftemplate")) {
/*  158 */         return parseDeftemplate(paramContext);
/*      */       }
/*  160 */       if (str.equals("deffunction")) {
/*  161 */         return parseDeffunction();
/*      */       }
/*  163 */       if (str.equals("defglobal")) {
/*  164 */         return parseDefglobal();
/*      */       }
/*  166 */       if (str.equals("defmodule")) {
/*  167 */         return parseDefmodule();
/*      */       }
/*  169 */       if (str.equals("EOF")) {
/*  170 */         return Funcall.EOF;
/*      */       }
/*      */       
/*  173 */       return parseAndExecuteFuncall(null, paramContext);
/*      */     }
/*      */     catch (JessException localJessException) {
/*  176 */       if ((localJessException instanceof ParseException)) {
/*  177 */         throw localJessException;
/*      */       }
/*  179 */       localJessException.setLineNumber(this.m_jts.lineno());
/*  180 */       localJessException.setProgramText(this.m_jts.toString());
/*  181 */       this.m_jts.clear();
/*  182 */       throw localJessException;
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
/*      */   private final Value parseDefmodule()
/*      */     throws JessException
/*      */   {
/*  200 */     if ((this.m_jts.nextToken().m_ttype != 40) || (!this.m_jts.nextToken().m_sval.equals("defmodule")))
/*      */     {
/*  202 */       parseError("parseDefmodule", "Expected (defmodule...");
/*      */     }
/*  204 */     JessToken localJessToken1 = this.m_jts.nextToken();
/*  205 */     if (localJessToken1.m_ttype != 1) {
/*  206 */       parseError("parseDefmodule", "Expected module name");
/*      */     }
/*  208 */     JessToken localJessToken2 = this.m_jts.nextToken();
/*      */     
/*  210 */     if (localJessToken2.m_ttype == 2) {
/*  211 */       this.m_rete.addDefmodule(localJessToken1.m_sval, localJessToken2.m_sval);
/*      */     }
/*  213 */     else if (localJessToken2.m_ttype == 41) {
/*  214 */       this.m_rete.addDefmodule(localJessToken1.m_sval);
/*      */     }
/*      */     else {
/*  217 */       parseError("parseDefmodule", "Expected ')'");
/*      */     }
/*      */     
/*  220 */     return Funcall.TRUE;
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
/*      */   private final Value parseDefglobal()
/*      */     throws JessException
/*      */   {
/*  237 */     if ((this.m_jts.nextToken().m_ttype != 40) || (!this.m_jts.nextToken().m_sval.equals("defglobal")))
/*      */     {
/*  239 */       parseError("parseDefglobal", "Expected (defglobal...");
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */     JessToken localJessToken1;
/*      */     
/*      */ 
/*  247 */     while ((localJessToken1 = this.m_jts.nextToken()).m_ttype != 41)
/*      */     {
/*      */ 
/*  250 */       if (localJessToken1.m_ttype != 8) {
/*  251 */         parseError("parseDefglobal", "Expected a variable name");
/*      */       }
/*      */       
/*  254 */       if ((localJessToken1.m_sval.charAt(0) != '*') || (localJessToken1.m_sval.charAt(localJessToken1.m_sval.length() - 1) != '*'))
/*      */       {
/*  256 */         parseError("parseDefglobal", "Defglobal names must start and end with an asterisk!");
/*      */       }
/*      */       
/*  259 */       if (this.m_jts.nextToken().m_ttype != 61) {
/*  260 */         parseError("parseDefglobal", "Expected =");
/*      */       }
/*  262 */       JessToken localJessToken2 = this.m_jts.nextToken();
/*      */       
/*  264 */       switch (localJessToken2.m_ttype)
/*      */       {
/*      */ 
/*      */       case 1: 
/*      */       case 2: 
/*      */       case 4: 
/*      */       case 8: 
/*      */       case 32: 
/*      */       case 40: 
/*      */       case 8192: 
/*  274 */         this.m_rete.addDefglobal(new Defglobal(localJessToken1.m_sval, tokenToValue(localJessToken2)));
/*      */         
/*  276 */         break;
/*      */       
/*      */       default: 
/*  279 */         parseError("parseDefglobal", "Bad value");
/*      */       }
/*      */       
/*      */     }
/*  283 */     return Funcall.TRUE;
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
/*      */   private final Funcall parseFuncall()
/*      */     throws JessException
/*      */   {
/*  303 */     Funcall localFuncall = null;
/*      */     
/*  305 */     if (this.m_jts.nextToken().m_ttype != 40) {
/*  306 */       parseError("parseFuncall", "Expected '('");
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*  311 */     JessToken localJessToken = this.m_jts.nextToken();
/*  312 */     Object localObject; switch (localJessToken.m_ttype)
/*      */     {
/*      */ 
/*      */     case 1: 
/*  316 */       localFuncall = new Funcall(localJessToken.m_sval, this.m_rete);
/*  317 */       break;
/*      */     
/*      */ 
/*      */     case 61: 
/*  321 */       localFuncall = new Funcall("=".intern(), this.m_rete);
/*  322 */       break;
/*      */     
/*      */ 
/*      */     case 8: 
/*  326 */       localFuncall = new Funcall("call", this.m_rete);
/*  327 */       localFuncall.add(new Variable(localJessToken.m_sval, 8));
/*  328 */       break;
/*      */     
/*      */ 
/*      */     case 40: 
/*  332 */       localFuncall = new Funcall("call", this.m_rete);
/*  333 */       this.m_jts.pushBack(localJessToken);
/*  334 */       localObject = parseFuncall();
/*  335 */       localFuncall.add(new FuncallValue((Funcall)localObject));
/*  336 */       break;
/*      */     
/*      */     default: 
/*  339 */       parseError("parseFuncall", "Bad functor");
/*      */     }
/*      */     
/*  342 */     String str = localFuncall.get(0).stringValue(null);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  347 */     localJessToken = this.m_jts.nextToken();
/*  348 */     while (localJessToken.m_ttype != 41)
/*      */     {
/*      */ 
/*  351 */       switch (localJessToken.m_ttype) {
/*      */       case 1: case 2: 
/*      */       case 4: 
/*      */       case 8: 
/*      */       case 32: 
/*      */       case 8192: 
/*  357 */         localFuncall.add(tokenToValue(localJessToken));
/*  358 */         break;
/*      */       
/*      */ 
/*      */       case 40: 
/*  362 */         this.m_jts.pushBack(localJessToken);
/*  363 */         if (str.equals("assert")) {
/*  364 */           localObject = parseFact();
/*  365 */           localFuncall.add(new FactIDValue((Fact)localObject));
/*      */ 
/*      */         }
/*  368 */         else if (((str.equals("modify")) || (str.equals("duplicate"))) && (localFuncall.size() > 1))
/*      */         {
/*      */ 
/*  371 */           localObject = parseValuePair();
/*  372 */           localFuncall.add(new Value((ValueVector)localObject, 512));
/*      */         }
/*      */         else
/*      */         {
/*  376 */           localObject = parseFuncall();
/*  377 */           localFuncall.add(new FuncallValue((Funcall)localObject)); }
/*  378 */         break;
/*      */       
/*      */ 
/*      */ 
/*      */       case 0: 
/*  383 */         parseError("parseFuncall", "Unexpected EOF");
/*  384 */         break;
/*      */       
/*      */       default: 
/*  387 */         localFuncall.add(new Value(String.valueOf((char)localJessToken.m_ttype), 2));
/*      */       }
/*      */       
/*      */       
/*  391 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/*  394 */     return localFuncall;
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
/*      */   private final ValueVector parseValuePair()
/*      */     throws JessException
/*      */   {
/*  408 */     ValueVector localValueVector = new ValueVector(2);
/*  409 */     JessToken localJessToken = null;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  415 */     if ((this.m_jts.nextToken().m_ttype != 40) || ((localJessToken = this.m_jts.nextToken()).m_ttype != 1))
/*      */     {
/*      */ 
/*  418 */       parseError("parseValuePair", "Expected '( <atom>'");
/*      */     }
/*      */     
/*  421 */     localValueVector.add(new Value(localJessToken.m_sval, 1));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     do
/*      */     {
/*  428 */       switch ((localJessToken = this.m_jts.nextToken()).m_ttype)
/*      */       {
/*      */       case 1: 
/*      */       case 2: 
/*      */       case 4: 
/*      */       case 8: 
/*      */       case 32: 
/*      */       case 40: 
/*      */       case 8192: 
/*  437 */         localValueVector.add(tokenToValue(localJessToken));
/*  438 */         break;
/*      */       
/*      */       case 41: 
/*      */         break;
/*      */       
/*      */       default: 
/*  444 */         parseError("parseValuePair", "Bad argument");
/*      */       }
/*      */       
/*  447 */     } while (localJessToken.m_ttype != 41);
/*      */     
/*  449 */     return localValueVector;
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
/*      */   private final Value parseDeffacts()
/*      */     throws JessException
/*      */   {
/*  470 */     if ((this.m_jts.nextToken().m_ttype != 40) || ((localJessToken = this.m_jts.nextToken()).m_ttype != 1) || (!localJessToken.m_sval.equals("deffacts")))
/*      */     {
/*      */ 
/*      */ 
/*  474 */       parseError("parseDeffacts", "Expected '( deffacts'");
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  481 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1)
/*  482 */       parseError("parseDeffacts", "Expected deffacts name");
/*  483 */     String str1 = localJessToken.m_sval;
/*      */     
/*  485 */     JessToken localJessToken = this.m_jts.nextToken();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  491 */     String str2 = "";
/*  492 */     if (localJessToken.m_ttype == 2)
/*      */     {
/*  494 */       str2 = localJessToken.m_sval;
/*  495 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/*  498 */     Deffacts localDeffacts = new Deffacts(str1, str2, this.m_rete);
/*  499 */     this.m_rete.setCurrentModule(localDeffacts.getModule());
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  505 */     while (localJessToken.m_ttype == 40)
/*      */     {
/*  507 */       this.m_jts.pushBack(localJessToken);
/*  508 */       Fact localFact = parseFact();
/*  509 */       localDeffacts.addFact(localFact);
/*  510 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  517 */     if (localJessToken.m_ttype != 41) {
/*  518 */       parseError("parseDeffacts", "Expected ')'");
/*      */     }
/*  520 */     this.m_rete.addDeffacts(localDeffacts);
/*  521 */     return Funcall.TRUE;
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
/*      */   Fact parseFact()
/*      */     throws JessException
/*      */   {
/*  541 */     String str2 = "__data";
/*      */     
/*      */ 
/*  544 */     JessToken localJessToken = null;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  550 */     if ((this.m_jts.nextToken().m_ttype != 40) || ((localJessToken = this.m_jts.nextToken()).m_ttype != 1))
/*      */     {
/*  552 */       parseError("parseFact", "Expected '( <atom>'");
/*      */     }
/*  554 */     String str1 = localJessToken.m_sval;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  566 */     int j = 0;
/*      */     
/*  568 */     Deftemplate localDeftemplate = this.m_rete.createDeftemplate(str1);
/*  569 */     if (localDeftemplate.getSlotIndex("__data") == 0) {
/*  570 */       j = 1;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*  575 */     Fact localFact = new Fact(str1, this.m_rete);
/*  576 */     localJessToken = this.m_jts.nextToken();
/*      */     
/*  578 */     while (localJessToken.m_ttype != 41)
/*      */     {
/*      */ 
/*  581 */       if (j == 0)
/*      */       {
/*      */ 
/*  584 */         if (localJessToken.m_ttype != 40) {
/*  585 */           parseError("parseFact", "Expected '('");
/*      */         }
/*      */         
/*  588 */         if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1)
/*  589 */           parseError("parseFact", "Bad slot name");
/*  590 */         str2 = localJessToken.m_sval;
/*  591 */         localJessToken = this.m_jts.nextToken();
/*      */       }
/*      */       
/*      */ 
/*  595 */       int k = localDeftemplate.getSlotIndex(str2);
/*  596 */       if (k == -1) {
/*  597 */         throw new JessException("Jesp.parseFact", "No such slot " + str2 + " in template", localDeftemplate.getName());
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  602 */       int i = localDeftemplate.getSlotType(k);
/*      */       Object localObject;
/*  604 */       switch (i)
/*      */       {
/*      */ 
/*      */ 
/*      */       case 16384: 
/*  609 */         switch (localJessToken.m_ttype)
/*      */         {
/*      */ 
/*      */         case 1: 
/*      */         case 2: 
/*      */         case 4: 
/*      */         case 8: 
/*      */         case 32: 
/*      */         case 8192: 
/*  618 */           localFact.setSlotValue(str2, tokenToValue(localJessToken)); break;
/*      */         
/*      */         case 61: 
/*  621 */           localJessToken = this.m_jts.nextToken();
/*  622 */           if (localJessToken.m_ttype != 40) {
/*  623 */             throw new JessException("Jesp.parseFact", "'=' cannot appear as an atom within a fact", "");
/*      */           }
/*      */         
/*      */ 
/*      */ 
/*      */         case 40: 
/*  629 */           this.m_jts.pushBack(localJessToken);
/*  630 */           localObject = parseFuncall();
/*  631 */           localFact.setSlotValue(str2, new FuncallValue((Funcall)localObject)); break;
/*      */         }
/*      */         
/*      */         
/*  635 */         parseError("parseFact", "Bad slot value");
/*      */         
/*      */ 
/*  638 */         if ((localJessToken = this.m_jts.nextToken()).m_ttype != 41)
/*  639 */           parseError("parseFact", "Expected ')'");
/*  640 */         break;
/*      */       
/*      */ 
/*      */ 
/*      */       case 32768: 
/*  645 */         localObject = new ValueVector();
/*      */         
/*  647 */         while (localJessToken.m_ttype != 41)
/*      */         {
/*  649 */           switch (localJessToken.m_ttype)
/*      */           {
/*      */ 
/*      */           case 1: 
/*      */           case 2: 
/*      */           case 4: 
/*      */           case 8: 
/*      */           case 32: 
/*      */           case 8192: 
/*  658 */             ((ValueVector)localObject).add(tokenToValue(localJessToken)); break;
/*      */           
/*      */           case 61: 
/*  661 */             localJessToken = this.m_jts.nextToken();
/*  662 */             if (localJessToken.m_ttype != 40) {
/*  663 */               throw new JessException("Jesp.parseFact", "'=' cannot appear as an atom within a fact", "");
/*      */             }
/*      */           
/*      */ 
/*      */ 
/*      */           case 40: 
/*  669 */             this.m_jts.pushBack(localJessToken);
/*  670 */             Funcall localFuncall = parseFuncall();
/*  671 */             ((ValueVector)localObject).add(new FuncallValue(localFuncall)); break;
/*      */           }
/*      */           
/*      */           
/*  675 */           parseError("parseFact", "Bad slot value");
/*      */           
/*      */ 
/*  678 */           localJessToken = this.m_jts.nextToken();
/*      */         }
/*      */         
/*  681 */         localFact.setSlotValue(str2, new Value((ValueVector)localObject, 512));
/*  682 */         break;
/*      */       
/*      */       default: 
/*  685 */         parseError("parseFact", "No such slot in deftemplate");
/*      */       }
/*      */       
/*  688 */       if (j == 0)
/*      */       {
/*      */ 
/*  691 */         localJessToken = this.m_jts.nextToken();
/*      */       } else {
/*      */         break;
/*      */       }
/*      */     }
/*      */     
/*  697 */     if (localJessToken.m_ttype != 41) {
/*  698 */       parseError("parseFact", "Expected ')'");
/*      */     }
/*  700 */     return localFact;
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
/*      */   private final Value parseDeftemplate(Context paramContext)
/*      */     throws JessException
/*      */   {
/*  724 */     if ((this.m_jts.nextToken().m_ttype != 40) || (!this.m_jts.nextToken().m_sval.equals("deftemplate")))
/*      */     {
/*  726 */       parseError("parseDeftemplate", "Expected (deftemplate...");
/*      */     }
/*      */     
/*      */ 
/*      */     JessToken localJessToken;
/*      */     
/*  732 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1) {
/*  733 */       parseError("parseDeftemplate", "Expected deftemplate name");
/*      */     }
/*  735 */     String str2 = localJessToken.m_sval;
/*  736 */     String str3 = "";
/*  737 */     String str4 = null;
/*      */     
/*  739 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype == 1)
/*      */     {
/*  741 */       if (localJessToken.m_sval.equals("extends"))
/*      */       {
/*  743 */         localJessToken = this.m_jts.nextToken();
/*  744 */         if (localJessToken.m_ttype == 1) {
/*  745 */           str4 = localJessToken.m_sval;
/*      */         } else {
/*  747 */           parseError("parseDeftemplate", "Expected deftemplate name to extend");
/*      */         }
/*      */       } else {
/*  750 */         parseError("parseDeftemplate", "Expected '(' or 'extends'"); }
/*  751 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  758 */     if (localJessToken.m_ttype == 2)
/*      */     {
/*  760 */       str3 = localJessToken.m_sval;
/*  761 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     Deftemplate localDeftemplate;
/*  764 */     if (str4 == null) {
/*  765 */       localDeftemplate = new Deftemplate(str2, str3, this.m_rete);
/*      */     } else {
/*  767 */       localDeftemplate = new Deftemplate(str2, str3, this.m_rete.findDeftemplate(str4), this.m_rete);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  776 */     while (localJessToken.m_ttype == 40)
/*      */     {
/*  778 */       if (((localJessToken = this.m_jts.nextToken()).m_ttype != 1) || ((!localJessToken.m_sval.equals("slot")) && (!localJessToken.m_sval.equals("multislot"))))
/*      */       {
/*  780 */         parseError("parseDeftemplate", "Bad slot type");
/*      */       }
/*  782 */       int i = localJessToken.m_sval.equals("slot") ? 16384 : 32768;
/*      */       
/*      */ 
/*  785 */       if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1)
/*  786 */         parseError("parseDeftemplate", "Bad slot name");
/*  787 */       str2 = localJessToken.m_sval;
/*      */       
/*      */ 
/*      */ 
/*  791 */       Object localObject = i == 16384 ? Funcall.NIL : Funcall.NILLIST;
/*      */       
/*      */ 
/*  794 */       String str1 = "ANY";
/*      */       
/*  796 */       localJessToken = this.m_jts.nextToken();
/*  797 */       while (localJessToken.m_ttype == 40)
/*      */       {
/*  799 */         if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1) {
/*  800 */           parseError("parseDeftemplate", "Slot qualifier must be atom");
/*      */         }
/*      */         
/*      */ 
/*  804 */         String str5 = localJessToken.m_sval;
/*      */         
/*  806 */         if ((str5.equalsIgnoreCase("default")) || (str5.equalsIgnoreCase("default-dynamic")))
/*      */         {
/*      */ 
/*  809 */           localJessToken = this.m_jts.nextToken();
/*  810 */           switch (localJessToken.m_ttype)
/*      */           {
/*      */ 
/*      */           case 1: 
/*      */           case 2: 
/*      */           case 4: 
/*      */           case 32: 
/*  817 */             localObject = tokenToValue(localJessToken); break;
/*      */           
/*      */           case 40: 
/*  820 */             if (str5.equalsIgnoreCase("default-dynamic"))
/*      */             {
/*  822 */               this.m_jts.pushBack(localJessToken);
/*  823 */               Funcall localFuncall = parseFuncall();
/*  824 */               localObject = new FuncallValue(localFuncall);
/*      */             }
/*      */             else {
/*  827 */               localObject = parseAndExecuteFuncall(localJessToken, paramContext);
/*      */             }
/*  829 */             break;
/*      */           
/*      */           default: 
/*  832 */             parseError("parseDeftemplate", "Illegal default slot value");
/*      */           }
/*      */           
/*      */         }
/*  836 */         else if (str5.equalsIgnoreCase("type"))
/*      */         {
/*  838 */           if (i == 32768) {
/*  839 */             parseError("parseDeftemplate", "'type' not allowed for multislots");
/*      */           }
/*      */           
/*      */ 
/*  843 */           localJessToken = this.m_jts.nextToken();
/*  844 */           str1 = localJessToken.m_sval;
/*      */         }
/*      */         else {
/*  847 */           parseError("parseDeftemplate", "Unimplemented slot qualifier");
/*      */         }
/*  849 */         if (this.m_jts.nextToken().m_ttype != 41) {
/*  850 */           parseError("parseDeftemplate", "Expected ')'");
/*      */         }
/*  852 */         localJessToken = this.m_jts.nextToken();
/*      */       }
/*  854 */       if (localJessToken.m_ttype != 41) {
/*  855 */         parseError("parseDeftemplate", "Expected ')'");
/*      */       }
/*  857 */       if (i == 16384) {
/*  858 */         localDeftemplate.addSlot(str2, (Value)localObject, str1);
/*      */       }
/*      */       else {
/*  861 */         if (((Value)localObject).type() != 512) {
/*  862 */           parseError("parseDeftemplate", "Default value for multislot " + str2 + " is not a multifield: " + localObject);
/*      */         }
/*  864 */         localDeftemplate.addMultiSlot(str2, (Value)localObject);
/*      */       }
/*      */       
/*  867 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*  869 */     if (localJessToken.m_ttype != 41) {
/*  870 */       parseError("parseDeftemplate", "Expected ')'");
/*      */     }
/*  872 */     this.m_rete.addDeftemplate(localDeftemplate);
/*  873 */     return Funcall.TRUE;
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
/*      */   private final Value parseDefrule(Context paramContext)
/*      */     throws JessException
/*      */   {
/*  888 */     Value localValue = doParseDefrule(paramContext);
/*  889 */     return localValue;
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
/*      */   private final synchronized Value doParseDefrule(Context paramContext)
/*      */     throws JessException
/*      */   {
/*  914 */     String[] arrayOfString = parseNameAndDocstring("defrule");
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  920 */     Hashtable localHashtable = new Hashtable();
/*  921 */     parseDeclarations(localHashtable);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  926 */     String str = RU.getModuleFromName(arrayOfString[0], this.m_rete);
/*  927 */     this.m_rete.setCurrentModule(str);
/*  928 */     LHSComponent localLHSComponent1 = parseLHS(str);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  933 */     JessToken localJessToken = this.m_jts.nextToken();
/*  934 */     if ((localJessToken.m_ttype != 61) || ((localJessToken = this.m_jts.nextToken()).m_ttype != 1) || (!localJessToken.m_sval.equals(">")))
/*      */     {
/*      */ 
/*  937 */       parseError("parseDefrule", "Expected '=>'");
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  943 */     ArrayList localArrayList = parseActions();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  948 */     expect(41, ")");
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  953 */     Defrule localDefrule = null;
/*  954 */     LHSComponent localLHSComponent2 = localLHSComponent1.canonicalize();
/*      */     
/*  956 */     if (!localLHSComponent2.getName().equals("or")) {
/*  957 */       throw new JessException("Jesp.parseDefrule", "Bogus assumption", "");
/*      */     }
/*  959 */     for (int i = 0; i < localLHSComponent2.getGroupSize(); i++) {
/*  960 */       LHSComponent localLHSComponent3 = localLHSComponent2.getLHSComponent(i);
/*  961 */       Group localGroup = new Group("and");
/*  962 */       localLHSComponent3.addToGroup(localGroup);
/*  963 */       localDefrule = addARule(localGroup, arrayOfString, i, localHashtable, localArrayList, localDefrule, paramContext);
/*      */     }
/*      */     
/*      */ 
/*  967 */     return Funcall.TRUE;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private final Defrule addARule(Group paramGroup, String[] paramArrayOfString, int paramInt, Hashtable paramHashtable, ArrayList paramArrayList, Defrule paramDefrule, Context paramContext)
/*      */     throws JessException
/*      */   {
/*  975 */     String str1 = paramArrayOfString[0];
/*  976 */     if (paramInt > 0)
/*  977 */       str1 = str1 + '&' + paramInt;
/*  978 */     Defrule localDefrule = new Defrule(str1, paramArrayOfString[1], this.m_rete);
/*      */     
/*      */ 
/*  981 */     for (Enumeration localEnumeration = paramHashtable.keys(); localEnumeration.hasMoreElements();) {
/*  982 */       Object localObject = localEnumeration.nextElement();
/*  983 */       ValueVector localValueVector = (ValueVector)paramHashtable.get(localObject);
/*  984 */       if (localObject.equals("salience")) {
/*  985 */         localDefrule.setSalience(localValueVector.get(1), this.m_rete);
/*      */       }
/*  987 */       else if (localObject.equals("node-index-hash")) {
/*  988 */         localDefrule.setNodeIndexHash(localValueVector.get(1).intValue(paramContext));
/*      */       }
/*  990 */       else if (localObject.equals("auto-focus")) {
/*  991 */         String str2 = localValueVector.get(1).atomValue(paramContext);
/*  992 */         localDefrule.setAutoFocus(str2.equals(Funcall.FALSE) ^ true);
/*      */       }
/*      */       else {
/*  995 */         parseError("parseDefrule", "Invalid declarand: " + localObject);
/*      */       }
/*      */     }
/*  998 */     paramGroup.addToLHS(localDefrule, this.m_rete);
/*      */     
/*      */ 
/* 1001 */     for (int i = 0; i < paramArrayList.size(); i++) {
/* 1002 */       localDefrule.addAction((Funcall)paramArrayList.get(i));
/*      */     }
/*      */     
/* 1005 */     if (paramDefrule != null)
/* 1006 */       paramDefrule.setNext(localDefrule);
/* 1007 */     this.m_rete.addDefrule(localDefrule);
/* 1008 */     return localDefrule;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final String[] parseNameAndDocstring(String paramString)
/*      */     throws JessException
/*      */   {
/* 1019 */     if ((this.m_jts.nextToken().m_ttype != 40) || (!this.m_jts.nextToken().m_sval.equals(paramString)))
/*      */     {
/* 1021 */       parseError("parseNameAndDocstring", "Expected " + paramString);
/*      */     }
/*      */     
/*      */ 
/*      */     JessToken localJessToken;
/*      */     
/* 1027 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1)
/* 1028 */       parseError("parseNameAndDocstring", "Expected defrule name");
/* 1029 */     String str1 = localJessToken.m_sval;
/*      */     
/* 1031 */     String str2 = "";
/* 1032 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype == 2) {
/* 1033 */       str2 = localJessToken.m_sval;
/*      */     } else {
/* 1035 */       this.m_jts.pushBack(localJessToken);
/*      */     }
/* 1037 */     return new String[] { str1, str2 };
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private final Hashtable parseDeclarations(Hashtable paramHashtable)
/*      */     throws JessException
/*      */   {
/* 1045 */     JessToken localJessToken1 = this.m_jts.nextToken();
/* 1046 */     JessToken localJessToken2 = this.m_jts.nextToken();
/*      */     
/* 1048 */     if ((localJessToken2.m_ttype == 1) && (localJessToken2.m_sval.equals("declare"))) {
/* 1049 */       while ((localJessToken2 = this.m_jts.nextToken()).m_ttype != 41) {
/* 1050 */         this.m_jts.pushBack(localJessToken2);
/* 1051 */         ValueVector localValueVector = parseValuePair();
/*      */         
/* 1053 */         String str = localValueVector.get(0).atomValue(null);
/* 1054 */         paramHashtable.put(str, localValueVector);
/*      */       }
/*      */     }
/*      */     else {
/* 1058 */       this.m_jts.pushBack(localJessToken2);
/* 1059 */       this.m_jts.pushBack(localJessToken1);
/*      */     }
/* 1061 */     return paramHashtable;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private final ArrayList parseActions()
/*      */     throws JessException
/*      */   {
/* 1071 */     JessToken localJessToken = this.m_jts.nextToken();
/* 1072 */     ArrayList localArrayList = new ArrayList();
/* 1073 */     while (localJessToken.m_ttype == 40) {
/* 1074 */       this.m_jts.pushBack(localJessToken);
/* 1075 */       Funcall localFuncall = parseFuncall();
/* 1076 */       localArrayList.add(localFuncall);
/* 1077 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/* 1079 */     this.m_jts.pushBack(localJessToken);
/* 1080 */     return localArrayList;
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
/*      */   private final LHSComponent parseLHS(String paramString)
/*      */     throws JessException
/*      */   {
/* 1098 */     Hashtable localHashtable = new Hashtable();
/* 1099 */     Group localGroup = new Group("and");
/*      */     
/*      */ 
/* 1102 */     JessToken localJessToken = this.m_jts.nextToken();
/* 1103 */     while ((localJessToken.m_ttype == 40) || (localJessToken.m_ttype == 8)) {
/* 1104 */       this.m_jts.pushBack(localJessToken);
/*      */       
/* 1106 */       LHSComponent localLHSComponent = parsePattern(localHashtable, paramString);
/* 1107 */       localGroup.add(localLHSComponent);
/* 1108 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/* 1110 */     this.m_jts.pushBack(localJessToken);
/* 1111 */     return localGroup;
/*      */   }
/*      */   
/*      */   private final JessToken expect(int paramInt, String paramString) throws JessException {
/* 1115 */     JessToken localJessToken = this.m_jts.nextToken();
/* 1116 */     if ((localJessToken.m_ttype != paramInt) || (!localJessToken.m_sval.equals(paramString)))
/*      */     {
/* 1118 */       parseError("parseLHS", "Expected '" + paramString + '\''); }
/* 1119 */     return localJessToken;
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
/*      */   LHSComponent parsePattern(Hashtable paramHashtable, String paramString)
/*      */     throws JessException
/*      */   {
/* 1140 */     String str2 = "__data";
/* 1141 */     String str3 = null;
/* 1142 */     JessToken localJessToken = this.m_jts.nextToken();
/*      */     
/* 1144 */     if (localJessToken.m_ttype == 8)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1150 */       str3 = localJessToken.m_sval;
/* 1151 */       expect(1, "<-");
/* 1152 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1160 */     if ((localJessToken.m_ttype != 40) || ((localJessToken = this.m_jts.nextToken()).m_ttype != 1))
/*      */     {
/* 1162 */       parseError("parsePattern", "Expected '( <atom>'");
/*      */     }
/* 1164 */     String str1 = localJessToken.m_sval;
/*      */     
/*      */ 
/*      */     Object localObject2;
/*      */     
/*      */ 
/* 1170 */     if (str1.equals("exists")) {
/* 1171 */       localObject1 = new Group("not");
/* 1172 */       while ((localJessToken = this.m_jts.nextToken()).m_ttype != 41) {
/* 1173 */         this.m_jts.pushBack(localJessToken);
/* 1174 */         ((Group)localObject1).add(parsePattern(paramHashtable, paramString));
/*      */       }
/* 1176 */       localObject2 = new Group("not");
/* 1177 */       ((Group)localObject2).add((LHSComponent)localObject1);
/* 1178 */       if (str3 != null)
/* 1179 */         ((Group)localObject2).setBoundName(str3);
/* 1180 */       return (LHSComponent)localObject2;
/*      */     }
/*      */     
/* 1183 */     if (str1.equals("unique")) {
/* 1184 */       localObject1 = parsePattern(paramHashtable, paramString);
/* 1185 */       if (this.m_jts.nextToken().m_ttype != 41)
/* 1186 */         parseError("parsePattern", "Expected ')'");
/* 1187 */       if (str3 != null)
/* 1188 */         ((LHSComponent)localObject1).setBoundName(str3);
/* 1189 */       return (LHSComponent)localObject1;
/*      */     }
/*      */     
/* 1192 */     if (Group.isGroupName(str1)) {
/* 1193 */       localObject1 = new Group(str1);
/* 1194 */       while ((localJessToken = this.m_jts.nextToken()).m_ttype != 41) {
/* 1195 */         this.m_jts.pushBack(localJessToken);
/* 1196 */         ((Group)localObject1).add(parsePattern(paramHashtable, paramString));
/*      */       }
/*      */       
/* 1199 */       if (str3 != null)
/* 1200 */         ((Group)localObject1).setBoundName(str3);
/* 1201 */       return (LHSComponent)localObject1;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1209 */     if (str1.equals("test"))
/*      */     {
/*      */ 
/* 1212 */       if (str3 != null) {
/* 1213 */         parseError("parsePattern", "Can't bind a 'test' CE to a variable");
/*      */       }
/*      */       
/* 1216 */       localObject1 = new Pattern(str1, this.m_rete);
/*      */       
/* 1218 */       localObject2 = parseFuncall();
/*      */       
/* 1220 */       ((Pattern)localObject1).addTest("__data", new Test1(0, -1, new FuncallValue((Funcall)localObject2)));
/*      */       
/*      */ 
/* 1223 */       if (this.m_jts.nextToken().m_ttype != 41) {
/* 1224 */         parseError("parsePattern", "Expected ')'");
/*      */       }
/* 1226 */       return (LHSComponent)localObject1;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1234 */     int i = 0;
/*      */     
/* 1236 */     Deftemplate localDeftemplate = this.m_rete.createDeftemplate(str1);
/* 1237 */     str1 = localDeftemplate.getName();
/* 1238 */     if (localDeftemplate.getSlotIndex("__data") == 0) {
/* 1239 */       i = 1;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1244 */     Object localObject1 = new Pattern(str1, this.m_rete);
/* 1245 */     localJessToken = this.m_jts.nextToken();
/* 1246 */     while ((i != 0) || (localJessToken.m_ttype == 40))
/*      */     {
/* 1248 */       if (i == 0) {
/* 1249 */         if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1)
/* 1250 */           parseError("parsePattern", "Bad slot name");
/* 1251 */         str2 = localJessToken.m_sval;
/* 1252 */         localJessToken = this.m_jts.nextToken();
/*      */       }
/*      */       
/* 1255 */       int j = localDeftemplate.getSlotIndex(str2);
/* 1256 */       if (j == -1) {
/* 1257 */         throw new JessException("Jesp.parsePattern", "No such slot " + str2 + " in template", localDeftemplate.getName());
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1262 */       if (localDeftemplate.getSlotType(j) == 32768) 0; int k = 1;
/*      */       
/* 1264 */       int m = k + -1;
/* 1265 */       int n = 1;
/* 1266 */       Test1 localTest11 = null;
/* 1267 */       while (localJessToken.m_ttype != 41)
/*      */       {
/*      */ 
/*      */ 
/* 1271 */         int i1 = 0;
/* 1272 */         if (localJessToken.m_ttype == 126) {
/* 1273 */           i1 = 1;
/* 1274 */           localJessToken = this.m_jts.nextToken();
/*      */         }
/*      */         Funcall localFuncall1;
/* 1277 */         switch (localJessToken.m_ttype)
/*      */         {
/*      */         case 8: 
/*      */         case 8192: 
/* 1281 */           Integer localInteger = (Integer)paramHashtable.get(localJessToken.m_sval);
/* 1282 */           if (localInteger == null) {
/* 1283 */             paramHashtable.put(localJessToken.m_sval, new Integer(localJessToken.m_ttype));
/*      */           } else {
/* 1285 */             localJessToken.m_ttype = localInteger.intValue();
/*      */           }
/* 1287 */           localTest11 = new Test1(i1, m, new Variable(localJessToken.m_sval, localJessToken.m_ttype));
/*      */           
/* 1289 */           break;
/*      */         
/*      */ 
/*      */         case 1: 
/* 1293 */           if (localJessToken.m_sval.equals(":")) {
/* 1294 */             localFuncall1 = parseFuncall();
/* 1295 */             localTest11 = new Test1(i1, m, new FuncallValue(localFuncall1));
/*      */           }
/* 1297 */           break;
/*      */         
/*      */ 
/*      */ 
/*      */         case 2: 
/*      */         case 4: 
/*      */         case 32: 
/* 1304 */           localTest11 = new Test1(i1, m, tokenToValue(localJessToken));
/*      */           
/* 1306 */           break;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         case 61: 
/* 1312 */           localFuncall1 = parseFuncall();
/*      */           
/*      */ 
/* 1315 */           Funcall localFuncall2 = new Funcall("eq*", this.m_rete);
/*      */           
/*      */ 
/* 1318 */           Object localObject3 = null;
/* 1319 */           int i2 = ((Pattern)localObject1).getDeftemplate().getSlotIndex(str2);
/*      */           
/* 1321 */           if (i2 == -1) {
/* 1322 */             throw new JessException("Jesp.parsePattern", "No such slot " + str2 + " in template", localDeftemplate.getName());
/*      */           }
/*      */           
/*      */ 
/*      */ 
/* 1327 */           if (((Pattern)localObject1).getNTests(i2) > 0) {
/* 1328 */             Test1 localTest12 = ((Pattern)localObject1).getTest(i2, 0);
/* 1329 */             if (localTest12.getTest() == 0) {
/* 1330 */               Value localValue = localTest12.getValue();
/* 1331 */               if ((localValue.type() == 8) && (localTest12.m_subIdx == m)) {
/* 1332 */                 localObject3 = localValue;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/* 1337 */           if (localObject3 == null) {
/* 1338 */             localObject3 = new Variable(RU.gensym("__jesp"), 8);
/* 1339 */             ((Pattern)localObject1).addTest(str2, new Test1(0, m, (Value)localObject3));
/*      */           }
/*      */           
/*      */ 
/* 1343 */           localFuncall2.add((Value)localObject3);
/* 1344 */           localFuncall2.add(new FuncallValue(localFuncall1));
/*      */           
/* 1346 */           localTest11 = new Test1(i1, m, new FuncallValue(localFuncall2));
/*      */           
/*      */ 
/* 1349 */           break;
/*      */         }
/*      */         
/* 1352 */         parseError("parsePattern", "Bad slot value");
/*      */         
/*      */ 
/* 1355 */         localJessToken = this.m_jts.nextToken();
/*      */         
/* 1357 */         localTest11.m_conjunction = n;
/*      */         
/* 1359 */         if (localJessToken.m_ttype == 38) {
/* 1360 */           localJessToken = this.m_jts.nextToken();
/*      */ 
/*      */         }
/* 1363 */         else if (localJessToken.m_ttype == 124) {
/* 1364 */           n = 2;
/* 1365 */           localJessToken = this.m_jts.nextToken();
/*      */ 
/*      */ 
/*      */         }
/* 1369 */         else if ((k == 0) && (localJessToken.m_ttype != 41)) {
/* 1370 */           parseError("parsePattern", str2 + " is not a multislot");
/*      */         } else {
/* 1372 */           m++;
/* 1373 */           n = 1;
/*      */         }
/*      */         
/* 1376 */         ((Pattern)localObject1).addTest(str2, localTest11);
/*      */       }
/*      */       
/* 1379 */       if (k != 0) {
/* 1380 */         ((Pattern)localObject1).setSlotLength(str2, m);
/*      */       }
/* 1382 */       if (i == 0) {
/* 1383 */         localJessToken = this.m_jts.nextToken();
/*      */       } else {
/*      */         break;
/*      */       }
/*      */     }
/*      */     
/* 1389 */     if (str3 != null) {
/* 1390 */       ((Pattern)localObject1).setBoundName(str3);
/*      */     }
/* 1392 */     return (LHSComponent)localObject1;
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
/*      */   private final synchronized Value parseDefquery(Context paramContext)
/*      */     throws JessException
/*      */   {
/* 1412 */     String[] arrayOfString = parseNameAndDocstring("defquery");
/*      */     
/*      */ 
/* 1415 */     Hashtable localHashtable = new Hashtable();
/* 1416 */     parseDeclarations(localHashtable);
/*      */     
/*      */ 
/* 1419 */     String str = RU.getModuleFromName(arrayOfString[0], this.m_rete);
/* 1420 */     this.m_rete.setCurrentModule(str);
/* 1421 */     LHSComponent localLHSComponent1 = parseLHS(str);
/*      */     
/*      */ 
/* 1424 */     JessToken localJessToken = this.m_jts.nextToken();
/* 1425 */     if (localJessToken.m_ttype != 41) {
/* 1426 */       parseError("parseDefquery", "Expected ')', got " + localJessToken.toString());
/*      */     }
/* 1428 */     Defquery localDefquery = null;
/* 1429 */     LHSComponent localLHSComponent2 = localLHSComponent1.canonicalize();
/*      */     
/* 1431 */     if (!localLHSComponent2.getName().equals("or")) {
/* 1432 */       throw new JessException("Jesp.parseDefquery", "Bogus assumption", "");
/*      */     }
/* 1434 */     for (int i = 0; i < localLHSComponent2.getGroupSize(); i++) {
/* 1435 */       LHSComponent localLHSComponent3 = localLHSComponent2.getLHSComponent(i);
/* 1436 */       Group localGroup = new Group("and");
/* 1437 */       localLHSComponent3.addToGroup(localGroup);
/* 1438 */       localDefquery = addAQuery(localGroup, arrayOfString, i, localHashtable, localDefquery, paramContext);
/*      */     }
/* 1440 */     return Funcall.TRUE;
/*      */   }
/*      */   
/*      */ 
/*      */   private final Defquery addAQuery(Group paramGroup, String[] paramArrayOfString, int paramInt, Hashtable paramHashtable, Defquery paramDefquery, Context paramContext)
/*      */     throws JessException
/*      */   {
/* 1447 */     String str = paramArrayOfString[0];
/* 1448 */     if (paramInt > 0) {
/* 1449 */       str = str + '&' + paramInt;
/*      */     }
/* 1451 */     Defquery localDefquery = new Defquery(str, paramArrayOfString[1], this.m_rete);
/*      */     
/* 1453 */     for (Enumeration localEnumeration = paramHashtable.keys(); localEnumeration.hasMoreElements();) {
/* 1454 */       Object localObject = localEnumeration.nextElement();
/* 1455 */       ValueVector localValueVector = (ValueVector)paramHashtable.get(localObject);
/* 1456 */       if (localObject.equals("variables")) {
/* 1457 */         for (int i = 1; i < localValueVector.size(); i++) {
/* 1458 */           localDefquery.addQueryVariable((Variable)localValueVector.get(i));
/*      */         }
/*      */         
/* 1461 */       } else if (localObject.equals("node-index-hash")) {
/* 1462 */         localDefquery.setNodeIndexHash(localValueVector.get(1).intValue(paramContext));
/*      */       }
/* 1464 */       else if (localObject.equals("max-background-rules")) {
/* 1465 */         localDefquery.setMaxBackgroundRules(localValueVector.get(1).intValue(paramContext));
/*      */       }
/*      */       else {
/* 1468 */         parseError("parseDefquery", "Invalid declarand: " + localObject);
/*      */       }
/*      */     }
/* 1471 */     paramGroup.addToLHS(localDefquery, this.m_rete);
/*      */     
/* 1473 */     if (paramDefquery != null)
/* 1474 */       paramDefquery.setNext(localDefquery);
/* 1475 */     this.m_rete.addDefrule(localDefquery);
/* 1476 */     return localDefquery;
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
/*      */   private final Value parseDeffunction()
/*      */     throws JessException
/*      */   {
/* 1499 */     if ((this.m_jts.nextToken().m_ttype != 40) || (!this.m_jts.nextToken().m_sval.equals("deffunction")))
/*      */     {
/* 1501 */       parseError("parseDeffunction", "Expected (deffunction...");
/*      */     }
/*      */     
/*      */ 
/*      */     JessToken localJessToken;
/*      */     
/*      */ 
/* 1508 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype != 1)
/* 1509 */       parseError("parseDeffunction", "Expected deffunction name");
/* 1510 */     String str1 = localJessToken.m_sval;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1516 */     String str2 = "";
/* 1517 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype == 2) {
/* 1518 */       str2 = localJessToken.m_sval;
/* 1519 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/* 1522 */     Deffunction localDeffunction = new Deffunction(str1, str2);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1528 */     if (localJessToken.m_ttype != 40) {
/* 1529 */       parseError("parseDeffunction", "Expected '('");
/*      */     }
/* 1531 */     while (((localJessToken = this.m_jts.nextToken()).m_ttype == 8) || (localJessToken.m_ttype == 8192))
/*      */     {
/* 1533 */       localDeffunction.addArgument(localJessToken.m_sval, localJessToken.m_ttype);
/*      */     }
/* 1535 */     if (localJessToken.m_ttype != 41) {
/* 1536 */       parseError("parseDeffunction", "Expected ')'");
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1543 */     if ((localJessToken = this.m_jts.nextToken()).m_ttype == 2) {
/* 1544 */       localDeffunction.setDocstring(localJessToken.m_sval);
/* 1545 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1552 */     while (localJessToken.m_ttype != 41) {
/* 1553 */       if (localJessToken.m_ttype == 40) {
/* 1554 */         this.m_jts.pushBack(localJessToken);
/* 1555 */         Funcall localFuncall = parseFuncall();
/* 1556 */         localDeffunction.addAction(localFuncall);
/*      */       }
/*      */       else {
/* 1559 */         switch (localJessToken.m_ttype)
/*      */         {
/*      */         case 1: 
/*      */         case 2: 
/*      */         case 4: 
/*      */         case 8: 
/*      */         case 32: 
/*      */         case 8192: 
/* 1567 */           localDeffunction.addValue(tokenToValue(localJessToken)); break;
/*      */         
/*      */         default: 
/* 1570 */           parseError("parseDeffunction", "Unexpected character");
/*      */         }
/*      */       }
/* 1573 */       localJessToken = this.m_jts.nextToken();
/*      */     }
/*      */     
/* 1576 */     this.m_rete.addUserfunction(localDeffunction);
/* 1577 */     return Funcall.TRUE;
/*      */   }
/*      */   
/*      */   Value parseAndExecuteFuncall(JessToken paramJessToken, Context paramContext) throws JessException {
/* 1581 */     if (paramJessToken != null)
/* 1582 */       this.m_jts.pushBack(paramJessToken);
/* 1583 */     Funcall localFuncall = parseFuncall();
/* 1584 */     return localFuncall.execute(paramContext);
/*      */   }
/*      */   
/*      */   private final Value tokenToValue(JessToken paramJessToken) throws JessException
/*      */   {
/* 1589 */     switch (paramJessToken.m_ttype) {
/*      */     case 1: case 2: 
/* 1591 */       return new Value(paramJessToken.m_sval, paramJessToken.m_ttype);
/*      */     
/*      */     case 8: 
/*      */     case 8192: 
/* 1595 */       return new Variable(paramJessToken.m_sval, paramJessToken.m_ttype);
/*      */     
/*      */     case 4: 
/*      */     case 32: 
/* 1599 */       return new Value(paramJessToken.m_nval, paramJessToken.m_ttype);
/*      */     
/*      */     case 40: 
/* 1602 */       this.m_jts.pushBack(paramJessToken);
/* 1603 */       Funcall localFuncall = parseFuncall();
/* 1604 */       return new FuncallValue(localFuncall);
/*      */     }
/*      */     
/* 1607 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */   private final void parseError(String paramString1, String paramString2)
/*      */     throws JessException
/*      */   {
/*      */     try
/*      */     {
/* 1616 */       ParseException localParseException = new ParseException("Jesp." + paramString1, paramString2);
/* 1617 */       localParseException.setLineNumber(this.m_jts.lineno());
/* 1618 */       localParseException.setProgramText(this.m_jts.toString());
/* 1619 */       throw localParseException;
/*      */     } finally {
/* 1621 */       this.m_jts.clear();
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Jesp.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */