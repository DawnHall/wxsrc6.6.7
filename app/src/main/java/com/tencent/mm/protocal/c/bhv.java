package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bhv
  extends bhp
{
  public String siF;
  public String siG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.siF != null) {
        paramVarArgs.g(2, this.siF);
      }
      if (this.siG != null) {
        paramVarArgs.g(3, this.siG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label415;
      }
    }
    label415:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.siF != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.siF);
      }
      i = paramInt;
      if (this.siG != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.siG);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bhv localbhv = (bhv)paramVarArgs[1];
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
            localbhv.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbhv.siF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbhv.siG = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */