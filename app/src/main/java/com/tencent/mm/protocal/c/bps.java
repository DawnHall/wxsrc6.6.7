package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bps
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public LinkedList<bhz> hbG = new LinkedList();
  public String jSt;
  public long snO;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.snO);
      if (this.jSt != null) {
        paramVarArgs.g(2, this.jSt);
      }
      paramVarArgs.fT(3, this.hbF);
      paramVarArgs.d(4, 8, this.hbG);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.S(1, this.snO) + 0;
      paramInt = i;
      if (this.jSt != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jSt);
      }
      return paramInt + f.a.a.a.fQ(3, this.hbF) + f.a.a.a.c(4, 8, this.hbG);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.hbG.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bps localbps = (bps)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbps.snO = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localbps.jSt = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localbps.hbF = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhz();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localbps.hbG.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */