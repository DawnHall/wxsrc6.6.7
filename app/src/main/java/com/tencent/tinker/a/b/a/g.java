package com.tencent.tinker.a.b.a;

import java.io.EOFException;

public final class g
  extends a
{
  final short[] vqb;
  
  public g(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {
      throw new NullPointerException("array == null");
    }
    this.vqb = paramArrayOfShort;
  }
  
  public final int read()
  {
    try
    {
      int i = this.vqb[this.vpT];
      cGR();
      return i & 0xFFFF;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new EOFException();
    }
  }
  
  public final int readInt()
  {
    return read() | read() << 16;
  }
  
  public final long readLong()
  {
    return read() | read() << 16 | read() << 32 | read() << 48;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tinker/a/b/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */