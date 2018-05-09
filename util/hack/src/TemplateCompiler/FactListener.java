/*     */ package TemplateCompiler;
/*     */ 
/*     */ import abl.runtime.RuntimeError;
/*     */ import java.io.PrintStream;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Vector;
/*     */ import jess.Context;
/*     */ import jess.Deftemplate;
/*     */ import jess.Fact;
/*     */ import jess.JessEvent;
/*     */ import jess.JessException;
/*     */ import jess.Value;
/*     */ import jess.ValueVector;
/*     */ import wm.WME;
/*     */ import wm.WorkingMemory;
/*     */ 
/*     */ public class FactListener implements jess.JessListener
/*     */ {
/*  20 */   private static Vector WMElist = new Vector();
/*     */   private Context c;
/*     */   private Hashtable listofnames;
/*     */   private Hashtable constants;
/*     */   private long time;
/*     */   private TimeOut to;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  18 */     this.listofnames = new Hashtable();
/*  19 */     this.constants = new Hashtable();
/*     */     
/*  21 */     this.time = 0L;
/*     */   }
/*     */   
/*  24 */   public FactListener(TimeOut paramTimeOut) { jdMethod_this();
/*  25 */     this.to = paramTimeOut;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final WME chooseWME(String paramString, Vector paramVector, long paramLong)
/*     */   {
/*     */     Class localClass1;
/*     */     
/*     */     try
/*     */     {
/*  36 */       localClass1 = Class.forName("facade.characters.wmedef." + paramString);
/*  37 */     } catch (ClassNotFoundException localClassNotFoundException) { throw new RuntimeError(localClassNotFoundException.getMessage());
/*     */     }
/*  39 */     paramVector.addElement(new Long(paramLong));
/*  40 */     Object[] arrayOfObject = paramVector.toArray();
/*     */     
/*     */ 
/*  43 */     Class[] arrayOfClass = new Class[arrayOfObject.length];
/*     */     
/*  45 */     for (int i = 0; i < arrayOfObject.length; i++) {
/*  46 */       Class localClass2 = arrayOfObject[i].getClass();
/*  47 */       if (localClass2.getName().equals("java.lang.Integer")) {
/*  48 */         arrayOfClass[i] = Integer.TYPE;
/*  49 */       } else if (localClass2.getName().equals("java.lang.Float")) {
/*  50 */         arrayOfClass[i] = Float.TYPE;
/*  51 */       } else if (localClass2.getName().equals("java.lang.Long")) {
/*  52 */         arrayOfClass[i] = Long.TYPE;
/*  53 */       } else if (localClass2.getName().equals("java.lang.Byte")) {
/*  54 */         arrayOfClass[i] = Byte.TYPE;
/*  55 */       } else if (localClass2.getName().equals("java.lang.Double")) {
/*  56 */         arrayOfClass[i] = Double.TYPE;
/*  57 */       } else if (localClass2.getName().equals("java.lang.Short"))
/*  58 */         arrayOfClass[i] = Short.TYPE; else {
/*  59 */         arrayOfClass[i] = localClass2;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     Constructor localConstructor;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       localConstructor = localClass1.getDeclaredConstructor(arrayOfClass);
/*     */     } catch (Exception localException) {
/*  73 */       throw new RuntimeError("Could not find constructor. " + localException.getMessage());
/*     */     }
/*     */     
/*  76 */     WME localWME = null;
/*     */     
/*     */     try
/*     */     {
/*  80 */       localWME = (WME)localConstructor.newInstance(arrayOfObject);
/*     */     } catch (Throwable localThrowable) {
/*  82 */       throw new RuntimeError("could not construct WME " + localThrowable.getMessage());
/*     */     }
/*  84 */     return localWME;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final WME generateWME(Fact paramFact, long paramLong, String paramString, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  92 */     Vector localVector = new Vector();
/*  93 */     ValueVector localValueVector = paramFact.get(0).listValue(paramContext);
/*  94 */     int i = localValueVector.size();
/*     */     
/*  96 */     for (int j = 0; j < i; j++)
/*     */     {
/*  98 */       Value localValue = localValueVector.get(j);
/*     */       
/*     */ 
/* 101 */       switch (localValue.type()) {
/*     */       case 16: 
/* 103 */         Fact localFact = localValue.factValue(paramContext);
/* 104 */         System.out.println("we got a fact");
/* 105 */         String str = (String)this.listofnames.get(localFact.getDeftemplate().getBaseName());
/* 106 */         if (str == null) { throw new RuntimeException("Could not find a nested fact");
/*     */         }
/* 108 */         WME localWME = generateWME(localFact, paramLong, str, paramContext);
/* 109 */         localVector.addElement(localWME);
/* 110 */         break;
/*     */       
/*     */ 
/*     */ 
/*     */       case 4: 
/* 115 */         localVector.addElement(new Integer(localValue.intValue(paramContext)));
/* 116 */         break;
/*     */       
/*     */ 
/*     */ 
/*     */       case 1: 
/* 121 */         Integer localInteger = (Integer)this.constants.get(localValue.atomValue(paramContext));
/*     */         
/* 123 */         if (localInteger == null) throw new RuntimeException("Constant " + localValue.atomValue(paramContext) + " not defined");
/* 124 */         localVector.addElement(localInteger);
/*     */         
/* 126 */         break;
/*     */       case 2: case 3: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: default: 
/* 128 */         throw new RuntimeException("Invalid type in DisAct");
/*     */       }
/*     */       
/*     */     }
/*     */     
/*     */ 
/* 134 */     return chooseWME(paramString, localVector, paramLong);
/*     */   }
/*     */   
/*     */ 
/*     */   public void eventHappened(JessEvent paramJessEvent)
/*     */     throws JessException
/*     */   {
/* 141 */     int i = paramJessEvent.getType();
/* 142 */     if (i == 16)
/*     */     {
/* 144 */       Fact localFact = (Fact)paramJessEvent.getObject();
/* 145 */       String str = localFact.getDeftemplate().getBaseName();
/*     */       
/* 147 */       this.c = ((jess.Rete)paramJessEvent.getSource()).getGlobalContext();
/*     */       
/* 149 */       if (NLUdebugger.observe) { NLUdebugger.addmessage(str, System.currentTimeMillis());
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       Object localObject1;
/*     */       
/*     */ 
/*     */ 
/* 159 */       if (str.equals("DefMap"))
/*     */       {
/* 161 */         localObject1 = localFact.get(0).listValue(this.c);
/* 162 */         this.listofnames.put(((ValueVector)localObject1).get(0).toString(), ((ValueVector)localObject1).get(1).toString()); } else { Object localObject2;
/*     */         int j;
/* 164 */         if (str.equals("_timeout")) {
/* 165 */           localObject1 = localFact.get(0).listValue(this.c);
/* 166 */           localObject2 = ((ValueVector)localObject1).get(0).atomValue(this.c);
/* 167 */           j = ((ValueVector)localObject1).get(1).intValue(this.c);
/* 168 */           int k = ((ValueVector)localObject1).get(2).intValue(this.c);
/* 169 */           this.to.addnew((String)localObject2, j, k);
/*     */         }
/* 171 */         else if (str.equals("DefConst"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */           localObject1 = localFact.get(0).listValue(this.c);
/* 180 */           localObject2 = ((ValueVector)localObject1).get(0).atomValue(this.c);
/* 181 */           j = ((ValueVector)localObject1).get(1).intValue(this.c);
/* 182 */           this.constants.put(localObject2, new Integer(j));
/*     */ 
/*     */         }
/* 185 */         else if (this.listofnames.containsKey(str))
/*     */         {
/* 187 */           localObject1 = (String)this.listofnames.get(str);
/* 188 */           if (this.time == 0L) { this.time = System.currentTimeMillis();
/*     */           }
/* 190 */           System.out.println(this.time + ' ' + (String)localObject1);
/*     */           
/* 192 */           localObject2 = generateWME(localFact, this.time, (String)localObject1, this.c);
/* 193 */           WMElist.addElement(localObject2);
/*     */         }
/*     */         
/*     */       }
/*     */     }
/* 198 */     else if (i == 16384)
/*     */     {
/*     */ 
/* 201 */       System.out.println("Adding " + WMElist.size() + " DAWMEs to Trip's memory");
/* 202 */       WorkingMemory.lookupRegisteredMemory("TripMemory").addWMEs(WMElist);
/* 203 */       WMElist.removeAllElements();
/* 204 */       this.time = 0L;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\FactListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */