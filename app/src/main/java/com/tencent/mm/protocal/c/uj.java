package com.tencent.mm.protocal.c;

public final class uj
  extends com.tencent.mm.bk.a
{
  public int priority;
  public int rvu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rvu);
      paramVarArgs.fT(2, this.priority);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rvu) + 0 + f.a.a.a.fQ(2, this.priority);
    }
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
      uj localuj = (uj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localuj.rvu = locala.vHC.rY();
        return 0;
      }
      localuj.priority = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */