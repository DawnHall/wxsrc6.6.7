package com.d.a.a;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

final class g
{
  protected static byte[] r(byte[] paramArrayOfByte)
  {
    Object localObject4 = null;
    Object localObject3 = null;
    Object localObject1 = localObject3;
    Object localObject2 = localObject4;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
      localObject1 = localObject3;
      localObject2 = localObject4;
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localObject1 = localObject3;
      localObject2 = localObject4;
      localGZIPOutputStream.write(paramArrayOfByte);
      localObject1 = localObject3;
      localObject2 = localObject4;
      localGZIPOutputStream.close();
      localObject1 = localObject3;
      localObject2 = localObject4;
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      localObject1 = paramArrayOfByte;
      localObject2 = paramArrayOfByte;
      localByteArrayOutputStream.close();
      return paramArrayOfByte;
    }
    catch (Error paramArrayOfByte)
    {
      return (byte[])localObject1;
    }
    catch (Exception paramArrayOfByte) {}
    return (byte[])localObject2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/d/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */