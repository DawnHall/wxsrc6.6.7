package com.tencent.mm.protocal.c;

public final class chh
  extends com.tencent.mm.bk.a
{
  public int rQO;
  public String rQV;
  public String sBk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rQV != null) {
        paramVarArgs.g(1, this.rQV);
      }
      paramVarArgs.fT(2, this.rQO);
      if (this.sBk != null) {
        paramVarArgs.g(3, this.sBk);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rQV == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = f.a.a.b.b.a.h(1, this.rQV) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rQO);
      paramInt = i;
      if (this.sBk != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.sBk);
      }
      return paramInt;
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
        chh localchh = (chh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localchh.rQV = locala.vHC.readString();
          return 0;
        case 2: 
          localchh.rQO = locala.vHC.rY();
          return 0;
        }
        localchh.sBk = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/chh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */