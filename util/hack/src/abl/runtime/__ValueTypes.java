/*    */ package abl.runtime;
/*    */ 
/*    */ public class __ValueTypes {
/*    */   public static class IntVar {
/*    */     public int i;
/*    */     
/*  7 */     public IntVar(int paramInt) { this.i = paramInt; }
/*  8 */     public IntVar(Integer paramInteger) { this.i = paramInteger.intValue(); }
/*    */     
/* 10 */     public String toString() { return Integer.toString(this.i); }
/*    */     
/*    */     public IntVar() {} }
/*    */   
/*    */   public static class LongVar { public long l;
/*    */     
/* 16 */     public LongVar(long paramLong) { this.l = paramLong; }
/* 17 */     public LongVar(Long paramLong) { this.l = paramLong.longValue(); }
/*    */     
/* 19 */     public String toString() { return Long.toString(this.l); }
/*    */     
/*    */     public LongVar() {} }
/*    */   
/*    */   public static class ShortVar { public short s;
/*    */     
/* 25 */     public ShortVar(short paramShort) { this.s = paramShort; }
/* 26 */     public ShortVar(Short paramShort) { this.s = paramShort.shortValue(); }
/*    */     
/* 28 */     public String toString() { return Short.toString(this.s); }
/*    */     
/*    */     public ShortVar() {} }
/*    */   
/*    */   public static class ByteVar { public byte b;
/*    */     
/* 34 */     public ByteVar(byte paramByte) { this.b = paramByte; }
/* 35 */     public ByteVar(Byte paramByte) { this.b = paramByte.byteValue(); }
/*    */     
/* 37 */     public String toString() { return Byte.toString(this.b); }
/*    */     
/*    */     public ByteVar() {} }
/*    */   
/*    */   public static class FloatVar { public float f;
/*    */     
/* 43 */     public FloatVar(float paramFloat) { this.f = paramFloat; }
/* 44 */     public FloatVar(Float paramFloat) { this.f = paramFloat.floatValue(); }
/*    */     
/* 46 */     public String toString() { return Float.toString(this.f); }
/*    */     
/*    */     public FloatVar() {} }
/*    */   
/*    */   public static class DoubleVar { public double d;
/*    */     
/* 52 */     public DoubleVar(double paramDouble) { this.d = paramDouble; }
/* 53 */     public DoubleVar(Double paramDouble) { this.d = paramDouble.doubleValue(); }
/*    */     
/* 55 */     public String toString() { return Double.toString(this.d); }
/*    */     
/*    */     public DoubleVar() {} }
/*    */   
/*    */   public static class BooleanVar { public boolean b;
/*    */     
/* 61 */     public BooleanVar(boolean paramBoolean) { this.b = paramBoolean; }
/* 62 */     public BooleanVar(Boolean paramBoolean) { this.b = paramBoolean.booleanValue(); }
/*    */     
/* 64 */     public String toString() { return new Boolean(this.b).toString(); }
/*    */     
/*    */     public BooleanVar() {} }
/*    */   
/*    */   public static class CharVar { public char c;
/*    */     
/* 70 */     public CharVar(char paramChar) { this.c = paramChar; }
/* 71 */     public CharVar(Character paramCharacter) { this.c = paramCharacter.charValue(); }
/*    */     
/* 73 */     public String toString() { return new Character(this.c).toString(); }
/*    */     
/*    */     public CharVar() {} }
/*    */   
/*    */   public static class ObjectVar { public ObjectVar() {}
/*    */     
/* 79 */     public ObjectVar(Object paramObject) { this.o = paramObject; }
/*    */     
/* 81 */     public String toString() { return this.o.toString(); }
/*    */     
/*    */     public Object o;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\__ValueTypes.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */