package com.tencent.mm.protocal.c;

public final class bxc
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String stI;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.stI != null) {
        paramVarArgs.g(2, this.stI);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.stI != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.stI);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bxc localbxc = (bxc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbxc.hbL = locala.vHC.readString();
          return 0;
        }
        localbxc.stI = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bxc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */