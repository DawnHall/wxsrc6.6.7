package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class ame
  extends com.tencent.mm.bk.a
{
  public int jRb;
  public b rgs;
  public b rgu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rgu != null) {
        paramVarArgs.b(1, this.rgu);
      }
      if (this.rgs != null) {
        paramVarArgs.b(2, this.rgs);
      }
      paramVarArgs.fT(3, this.jRb);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rgu == null) {
        break label263;
      }
    }
    label263:
    for (paramInt = f.a.a.a.a(1, this.rgu) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rgs != null) {
        i = paramInt + f.a.a.a.a(2, this.rgs);
      }
      return i + f.a.a.a.fQ(3, this.jRb);
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
        ame localame = (ame)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localame.rgu = locala.cJR();
          return 0;
        case 2: 
          localame.rgs = locala.cJR();
          return 0;
        }
        localame.jRb = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */