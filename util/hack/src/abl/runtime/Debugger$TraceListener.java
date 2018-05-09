/*     */ package abl.runtime;
/*     */ 
/*     */ import java.util.Hashtable;
/*     */ import java.util.List;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.SwingUtilities;
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
/*     */ class Debugger$TraceListener
/*     */   implements AblListener
/*     */ {
/*     */   static final String lineSep = "\n";
/*     */   final Hashtable timeTable;
/*     */   final Debugger this$0;
/*     */   
/*     */   Debugger$TraceListener(Debugger paramDebugger)
/*     */   {
/* 125 */     jdMethod_this();
/*     */   }
/*     */   
/* 128 */   private final void jdMethod_this() { this.timeTable = new Hashtable(); }
/*     */   
/*     */   private final String getNegotiationActionString(JointGoalNegotiatorDebug.JointGoalNegotiationInfo paramJointGoalNegotiationInfo)
/*     */   {
/* 132 */     switch (paramJointGoalNegotiationInfo.intention) {
/*     */     case 17: 
/* 134 */       return "entry";
/*     */     case 18: 
/* 136 */       return "refuse entry";
/*     */     case 19: 
/* 138 */       return "succeed";
/*     */     case 20: 
/* 140 */       return "fail";
/*     */     case 21: 
/* 142 */       return "remove";
/*     */     case 22: 
/* 144 */       return "suspend";
/*     */     case 23: 
/* 146 */       return "unsuspend";
/*     */     }
/* 148 */     return "unrecognized action";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public AblEvent computeElapsedTime(AblEvent paramAblEvent)
/*     */   {
/* 155 */     Object localObject1 = paramAblEvent.getSource();
/* 156 */     Long localLong = (Long)this.timeTable.get(localObject1);
/* 157 */     int i = paramAblEvent.getType();
/* 158 */     switch (paramAblEvent.getType()) {
/*     */     case 5: 
/*     */     case 7: 
/*     */     case 9: 
/* 162 */       this.timeTable.put(localObject1, new Long(System.currentTimeMillis()));
/* 163 */       break;
/*     */     case 3: 
/*     */     case 6: 
/*     */     case 8: 
/*     */     case 10: 
/* 168 */       if (localLong != null) {
/* 169 */         paramAblEvent.setElapsedTime(System.currentTimeMillis() - localLong.longValue());
/* 170 */         this.timeTable.remove(localObject1);
/*     */       }
/* 172 */       break;
/*     */     case 2: 
/* 174 */       this.timeTable.put(localObject1, new Long(System.currentTimeMillis()));
/* 175 */       Object localObject2 = paramAblEvent.getObject();
/* 176 */       if (localObject2 != null)
/* 177 */         localLong = (Long)this.timeTable.get(localObject2);
/* 178 */       if (localLong != null)
/* 179 */         paramAblEvent.setElapsedTime(System.currentTimeMillis() - localLong.longValue());
/*     */       break;
/*     */     }
/* 182 */     return paramAblEvent;
/*     */   }
/*     */   
/*     */ 
/*     */   public String formatBehaviorTrace(AblEvent paramAblEvent)
/*     */   {
/* 188 */     Object localObject1 = paramAblEvent.getObject();
/* 189 */     Object localObject2 = paramAblEvent.getSource();
/*     */     
/* 191 */     long l = paramAblEvent.getElapsedTime();
/*     */     String str1;
/* 193 */     switch (paramAblEvent.getType()) {
/*     */     case 1: 
/* 195 */       str1 = "precondition tested: " + localObject1;
/* 196 */       break;
/*     */     case 2: 
/* 198 */       str1 = "behavior chosen";
/* 199 */       break;
/*     */     case 3: 
/* 201 */       if (((Boolean)localObject1).booleanValue()) {
/* 202 */         str1 = "behavior succeeded";
/*     */       } else
/* 204 */         str1 = "behavior failed";
/* 205 */       break;
/*     */     case 4: 
/* 207 */       str1 = "context condition failed";
/* 208 */       break;
/*     */     case 5: 
/* 210 */       str1 = "execution";
/* 211 */       break;
/*     */     case 6: 
/* 213 */       if (((Boolean)localObject1).booleanValue()) {
/* 214 */         str1 = "succeeded";
/*     */       } else
/* 216 */         str1 = "act failed";
/* 217 */       break;
/*     */     case 7: 
/* 219 */       str1 = "execution";
/* 220 */       break;
/*     */     case 8: 
/* 222 */       if (((Boolean)localObject1).booleanValue()) {
/* 223 */         str1 = "succeeded";
/*     */       } else
/* 225 */         str1 = "failed";
/* 226 */       break;
/*     */     case 9: 
/* 228 */       str1 = "execution";
/* 229 */       break;
/*     */     case 10: 
/* 231 */       str1 = "succeeded";
/* 232 */       break;
/*     */     case 11: 
/* 234 */       str1 = "succeeded";
/* 235 */       break;
/*     */     case 12: 
/* 237 */       str1 = "execution";
/* 238 */       break;
/*     */     case 13: 
/* 240 */       str1 = "failed";
/* 241 */       break;
/*     */     case 14: 
/* 243 */       str1 = "execution";
/* 244 */       break;
/*     */     case 15: 
/* 246 */       str1 = "succeeded";
/* 247 */       break;
/*     */     case 18: 
/* 249 */       str1 = "success test succeeded";
/* 250 */       break;
/*     */     case 19: 
/* 252 */       str1 = "re-rooting subgoal at ABT root";
/* 253 */       break;
/*     */     case 20: 
/* 255 */       str1 = "initiating " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " negotiation";
/* 256 */       break;
/*     */     case 21: 
/* 258 */       str1 = "completing " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " negotiation";
/* 259 */       break;
/*     */     case 22: 
/* 261 */       str1 = "initiating " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " intention";
/* 262 */       break;
/*     */     case 23: 
/* 264 */       str1 = "committing to " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " intention";
/* 265 */       break;
/*     */     case 24: 
/* 267 */       str1 = "process " + getNegotiationActionString((JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1) + " intention";
/* 268 */       break;
/*     */     case 16: case 17: default: 
/* 270 */       str1 = "unrecognized action " + paramAblEvent.getType();
/*     */     }
/* 272 */     int i = paramAblEvent.getNestLevel();
/* 273 */     StringBuffer localStringBuffer = new StringBuffer(2 * i);
/* 274 */     for (int j = 0; j < i; j++) {
/* 275 */       localStringBuffer.append("  ");
/*     */     }
/* 277 */     String str2 = "";
/* 278 */     switch (paramAblEvent.getSourceType()) {
/*     */     case 1: 
/* 280 */       if ((paramAblEvent.getType() == 1) || (paramAblEvent.getType() == 2))
/*     */       {
/* 282 */         str2 = ((__BehaviorDesc)localObject2).uniqueName;
/*     */       } else
/* 284 */         str2 = ((__BehaviorDesc)localObject2).signature;
/* 285 */       break;
/*     */     case 3: 
/* 287 */       JointGoalNegotiatorDebug.JointGoalNegotiationInfo localJointGoalNegotiationInfo = (JointGoalNegotiatorDebug.JointGoalNegotiationInfo)localObject1;
/* 288 */       if (localJointGoalNegotiationInfo.g != null)
/* 289 */         str2 = localJointGoalNegotiationInfo.g.getSignature();
/* 290 */       if (localJointGoalNegotiationInfo.behavingEntity != null)
/* 291 */         str2 = str2 + " from " + localJointGoalNegotiationInfo.behavingEntity;
/* 292 */       break;
/*     */     case 2: 
/* 294 */       str2 = ((Step)localObject2).toString();
/* 295 */       break;
/*     */     default: 
/* 297 */       str2 = "unrecognized source " + paramAblEvent.getSourceType();
/*     */     }
/* 299 */     if (l != -1) {
/* 300 */       str1 = str1 + " elapsed time = " + l;
/*     */     }
/* 302 */     if (str2.equals("")) {
/* 303 */       return localStringBuffer + str1 + '\n';
/*     */     }
/* 305 */     return localStringBuffer + str2 + ": " + str1 + '\n';
/*     */   }
/*     */   
/*     */   public void eventHappened(AblEvent paramAblEvent)
/*     */   {
/* 310 */     if (this.this$0.traceToScreenChkBox.isSelected()) {
/* 311 */       SwingUtilities.invokeLater(new Debugger.TraceListener.1(this, paramAblEvent));
/*     */     }
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
/* 339 */     if (this.this$0.traceToBufferChkBox.isSelected()) {
/* 340 */       this.this$0.traceBuffer.add(computeElapsedTime(paramAblEvent));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\Debugger$TraceListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */