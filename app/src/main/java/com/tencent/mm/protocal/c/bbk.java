package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbk
  extends bhd
{
  public int rtK;
  public int sdC;
  public int sdD;
  public fe sdE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.sdC);
      paramVarArgs.fT(3, this.sdD);
      if (this.sdE != null)
      {
        paramVarArgs.fV(4, this.sdE.boi());
        this.sdE.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rtK);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label531;
      }
    }
    label531:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sdC) + f.a.a.a.fQ(3, this.sdD);
      paramInt = i;
      if (this.sdE != null) {
        paramInt = i + f.a.a.a.fS(4, this.sdE.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.rtK);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bbk localbbk = (bbk)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbbk.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbbk.sdC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbbk.sdD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fe();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fe)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbbk.sdE = ((fe)localObject1);
            paramInt += 1;
          }
        }
        localbbk.rtK = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */