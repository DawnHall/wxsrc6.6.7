package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class km
  extends bhd
{
  public String reo;
  public int rmJ;
  public int rmK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.reo == null) {
        throw new b("Not all required fields were included: ReqKey");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rmJ);
      paramVarArgs.fT(3, this.rmK);
      if (this.reo != null) {
        paramVarArgs.g(4, this.reo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label438;
      }
    }
    label438:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rmJ) + f.a.a.a.fQ(3, this.rmK);
      paramInt = i;
      if (this.reo != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.reo);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.reo != null) {
          break;
        }
        throw new b("Not all required fields were included: ReqKey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        km localkm = (km)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localkm.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localkm.rmJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localkm.rmK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localkm.reo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/km.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */