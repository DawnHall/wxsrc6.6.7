package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class bxi
  extends com.tencent.mm.bk.a
{
  public int stM;
  public b stN;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.stM);
      if (this.stN != null) {
        paramVarArgs.b(2, this.stN);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.stM) + 0;
      paramInt = i;
    } while (this.stN == null);
    return i + f.a.a.a.a(2, this.stN);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      bxi localbxi = (bxi)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbxi.stM = locala.vHC.rY();
        return 0;
      }
      localbxi.stN = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */