package com.tencent.mm.protocal.c;

public final class cge
  extends com.tencent.mm.bk.a
{
  public String rKY;
  public String rKZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rKY != null) {
        paramVarArgs.g(1, this.rKY);
      }
      if (this.rKZ != null) {
        paramVarArgs.g(2, this.rKZ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rKY == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = f.a.a.b.b.a.h(1, this.rKY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rKZ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rKZ);
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
        cge localcge = (cge)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcge.rKY = locala.vHC.readString();
          return 0;
        }
        localcge.rKZ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */