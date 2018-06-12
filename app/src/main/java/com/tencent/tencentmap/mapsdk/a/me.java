package com.tencent.tencentmap.mapsdk.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class me
{
  protected String a = "GBK";
  private ByteBuffer b;
  private mh c;
  
  public me()
  {
    this(128);
  }
  
  public me(int paramInt)
  {
    this.b = ByteBuffer.allocate(paramInt);
  }
  
  private void a(Object[] paramArrayOfObject, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    a(paramArrayOfObject.length, 0);
    int i = paramArrayOfObject.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramArrayOfObject[paramInt], 0);
      paramInt += 1;
    }
  }
  
  public int a(String paramString)
  {
    this.a = paramString;
    return 0;
  }
  
  public ByteBuffer a()
  {
    return this.b;
  }
  
  public void a(byte paramByte, int paramInt)
  {
    byte b1;
    if (paramInt < 15)
    {
      b1 = (byte)(paramInt << 4 | paramByte);
      this.b.put(b1);
      return;
    }
    if (paramInt < 256)
    {
      b1 = (byte)(paramByte | 0xF0);
      this.b.put(b1);
      this.b.put((byte)paramInt);
      return;
    }
    throw new mc("tag is too large: " + paramInt);
  }
  
  public void a(double paramDouble, int paramInt)
  {
    a(10);
    a((byte)5, paramInt);
    this.b.putDouble(paramDouble);
  }
  
  public void a(float paramFloat, int paramInt)
  {
    a(6);
    a((byte)4, paramInt);
    this.b.putFloat(paramFloat);
  }
  
  public void a(int paramInt)
  {
    int i;
    if (this.b.remaining() < paramInt) {
      i = (this.b.capacity() + paramInt) * 2;
    }
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
      localByteBuffer.put(this.b.array(), 0, this.b.position());
      this.b = localByteBuffer;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      if (this.c != null) {
        this.c.a(localIllegalArgumentException, this.b, paramInt, i);
      }
      throw localIllegalArgumentException;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    a(6);
    if ((paramInt1 >= 32768) && (paramInt1 <= 32767))
    {
      a((short)paramInt1, paramInt2);
      return;
    }
    a((byte)2, paramInt2);
    this.b.putInt(paramInt1);
  }
  
  public void a(long paramLong, int paramInt)
  {
    a(10);
    if ((paramLong >= -2147483648L) && (paramLong <= 2147483647L))
    {
      a((int)paramLong, paramInt);
      return;
    }
    a((byte)3, paramInt);
    this.b.putLong(paramLong);
  }
  
  public void a(mf parammf, int paramInt)
  {
    a(2);
    a((byte)10, paramInt);
    parammf.writeTo(this);
    a(2);
    a((byte)11, 0);
  }
  
  public void a(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof Byte))
    {
      b(((Byte)paramObject).byteValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      a(((Boolean)paramObject).booleanValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Short))
    {
      a(((Short)paramObject).shortValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      a(((Integer)paramObject).intValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Long))
    {
      a(((Long)paramObject).longValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Float))
    {
      a(((Float)paramObject).floatValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Double))
    {
      a(((Double)paramObject).doubleValue(), paramInt);
      return;
    }
    if ((paramObject instanceof String))
    {
      a((String)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof Map))
    {
      a((Map)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof List))
    {
      a((List)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof mf))
    {
      a((mf)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      a((byte[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof boolean[]))
    {
      a((boolean[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof short[]))
    {
      a((short[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof int[]))
    {
      a((int[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof long[]))
    {
      a((long[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof float[]))
    {
      a((float[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof double[]))
    {
      a((double[])paramObject, paramInt);
      return;
    }
    if (paramObject.getClass().isArray())
    {
      a((Object[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof Collection))
    {
      a((Collection)paramObject, paramInt);
      return;
    }
    throw new mc("write object error: unsupport type. " + paramObject.getClass());
  }
  
  public void a(String paramString, int paramInt)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes(this.a);
      paramString = arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        paramString = paramString.getBytes();
      }
      a((byte)6, paramInt);
      this.b.put((byte)paramString.length);
      this.b.put(paramString);
    }
    a(paramString.length + 10);
    if (paramString.length > 255)
    {
      a((byte)7, paramInt);
      this.b.putInt(paramString.length);
      this.b.put(paramString);
      return;
    }
  }
  
  public <T> void a(Collection<T> paramCollection, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    if (paramCollection == null) {}
    for (paramInt = 0;; paramInt = paramCollection.size())
    {
      a(paramInt, 0);
      if (paramCollection == null) {
        break;
      }
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        a(paramCollection.next(), 0);
      }
    }
  }
  
  public <K, V> void a(Map<K, V> paramMap, int paramInt)
  {
    a(8);
    a((byte)8, paramInt);
    if (paramMap == null) {}
    for (paramInt = 0;; paramInt = paramMap.size())
    {
      a(paramInt, 0);
      if (paramMap == null) {
        break;
      }
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        a(localEntry.getKey(), 0);
        a(localEntry.getValue(), 1);
      }
    }
  }
  
  public void a(short paramShort, int paramInt)
  {
    a(4);
    if ((paramShort >= -128) && (paramShort <= 127))
    {
      b((byte)paramShort, paramInt);
      return;
    }
    a((byte)1, paramInt);
    this.b.putShort(paramShort);
  }
  
  public void a(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      b((byte)i, paramInt);
      return;
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    a(paramArrayOfByte.length + 8);
    a((byte)13, paramInt);
    a((byte)0, 0);
    a(paramArrayOfByte.length, 0);
    this.b.put(paramArrayOfByte);
  }
  
  public void a(double[] paramArrayOfDouble, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    a(paramArrayOfDouble.length, 0);
    int i = paramArrayOfDouble.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramArrayOfDouble[paramInt], 0);
      paramInt += 1;
    }
  }
  
  public void a(float[] paramArrayOfFloat, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    a(paramArrayOfFloat.length, 0);
    int i = paramArrayOfFloat.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramArrayOfFloat[paramInt], 0);
      paramInt += 1;
    }
  }
  
  public void a(int[] paramArrayOfInt, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    a(paramArrayOfInt.length, 0);
    int i = paramArrayOfInt.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramArrayOfInt[paramInt], 0);
      paramInt += 1;
    }
  }
  
  public void a(long[] paramArrayOfLong, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    a(paramArrayOfLong.length, 0);
    int i = paramArrayOfLong.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramArrayOfLong[paramInt], 0);
      paramInt += 1;
    }
  }
  
  public void a(short[] paramArrayOfShort, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    a(paramArrayOfShort.length, 0);
    int i = paramArrayOfShort.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramArrayOfShort[paramInt], 0);
      paramInt += 1;
    }
  }
  
  public void a(boolean[] paramArrayOfBoolean, int paramInt)
  {
    a(8);
    a((byte)9, paramInt);
    a(paramArrayOfBoolean.length, 0);
    int i = paramArrayOfBoolean.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramArrayOfBoolean[paramInt], 0);
      paramInt += 1;
    }
  }
  
  public void b(byte paramByte, int paramInt)
  {
    a(3);
    if (paramByte == 0)
    {
      a((byte)12, paramInt);
      return;
    }
    a((byte)0, paramInt);
    this.b.put(paramByte);
  }
  
  public byte[] b()
  {
    byte[] arrayOfByte = new byte[this.b.position()];
    System.arraycopy(this.b.array(), 0, arrayOfByte, 0, this.b.position());
    return arrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */