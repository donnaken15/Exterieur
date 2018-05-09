/*    */ package TemplateCompiler;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.StringUtil;
/*    */ import jess.Activation;
/*    */ import jess.Context;
/*    */ import jess.Defrule;
/*    */ import jess.Deftemplate;
/*    */ import jess.Fact;
/*    */ import jess.JessEvent;
/*    */ import jess.JessException;
/*    */ import jess.JessListener;
/*    */ 
/*    */ public class DebugListener implements JessListener
/*    */ {
/*    */   private Context c;
/*    */   private final boolean useEventLog;
/*    */   
/*    */   public DebugListener()
/*    */   {
/* 21 */     this.useEventLog = true;
/*    */   }
/*    */   
/*    */   public DebugListener(boolean paramBoolean) {
/* 25 */     this.useEventLog = paramBoolean;
/*    */   }
/*    */   
/*    */   private final boolean compilerGeneratedFact(String paramString)
/*    */   {
/* 30 */     if ((paramString.equals("splat")) || (paramString.equals("initial-fact")) || (paramString.startsWith("po-")) || (paramString.startsWith("occurs-single")) || (paramString.startsWith("optoc")) || (paramString.startsWith("occurs-or")) || (paramString.startsWith("notoccurs-single")) || (paramString.startsWith("to-")) || (paramString.equals("DefConst")) || (paramString.equals("anaphoricRef")) || (paramString.equals("postBeatMixinInfo")))
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 41 */       return true;
/*    */     }
/* 43 */     return false;
/*    */   }
/*    */   
/*    */   public void eventHappened(JessEvent paramJessEvent) throws JessException {
/* 47 */     int i = paramJessEvent.getType();
/* 48 */     Object localObject; String str1; if ((i & 0x10) != 0) {
/* 49 */       localObject = (Fact)paramJessEvent.getObject();
/* 50 */       str1 = ((Fact)localObject).getDeftemplate().getBaseName();
/*    */       
/*    */ 
/* 53 */       if (!compilerGeneratedFact(str1))
/*    */       {
/* 55 */         String str2 = ((Fact)localObject).toString().substring(7);
/* 56 */         if ((i & 0x80000000) == 0)
/*    */         {
/* 58 */           StringUtil.println("==> (" + str2);
/* 59 */           if (this.useEventLog) {
/* 60 */             NativeAnimationInterface.addEventInfoToLog("==> (" + str2);
/*    */           }
/* 62 */         } else if ((i & 0x80000000) != 0)
/*    */         {
/* 64 */           StringUtil.println("<== (" + str2);
/* 65 */           if (this.useEventLog) {
/* 66 */             NativeAnimationInterface.addEventInfoToLog("<== (" + str2);
/*    */           }
/*    */         }
/*    */       }
/* 70 */     } else if (i == 2) {
/* 71 */       localObject = (Activation)paramJessEvent.getObject();
/* 72 */       str1 = ((Activation)localObject).getRule().getName().substring(6);
/*    */       
/* 74 */       if ((!str1.startsWith("andtest")) && (!str1.startsWith("occurssingletest")) && (!str1.startsWith("ortest")) && (!str1.startsWith("opttest")) && (!str1.startsWith("occursortest")))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 80 */         StringUtil.println("FIRE " + str1);
/* 81 */         if (this.useEventLog) {
/* 82 */           NativeAnimationInterface.addEventInfoToLog("FIRE " + str1);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\DebugListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */