package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cdd
  extends bhp
{
  public int rjC;
  public String rjK;
  public int syR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.syR);
      paramVarArgs.fT(3, this.rjC);
      if (this.rjK != null) {
        paramVarArgs.g(4, this.rjK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.syR) + f.a.a.a.fQ(3, this.rjC);
      paramInt = i;
      if (this.rjK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rjK);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cdd localcdd = (cdd)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcdd.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcdd.syR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcdd.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcdd.rjK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/cdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */