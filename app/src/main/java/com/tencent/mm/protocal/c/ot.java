package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ot
  extends bhp
{
  public int iwS;
  public String iwT;
  public String qUU;
  public azw rsE;
  public btk rsY;
  public String token;
  
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
      paramVarArgs.fT(2, this.iwS);
      if (this.iwT != null) {
        paramVarArgs.g(3, this.iwT);
      }
      if (this.token != null) {
        paramVarArgs.g(4, this.token);
      }
      if (this.rsE != null)
      {
        paramVarArgs.fV(5, this.rsE.boi());
        this.rsE.a(paramVarArgs);
      }
      if (this.qUU != null) {
        paramVarArgs.g(6, this.qUU);
      }
      if (this.rsY != null)
      {
        paramVarArgs.fV(7, this.rsY.boi());
        this.rsY.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label807;
      }
    }
    label807:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.iwS);
      paramInt = i;
      if (this.iwT != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.iwT);
      }
      i = paramInt;
      if (this.token != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.token);
      }
      paramInt = i;
      if (this.rsE != null) {
        paramInt = i + f.a.a.a.fS(5, this.rsE.boi());
      }
      i = paramInt;
      if (this.qUU != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.qUU);
      }
      paramInt = i;
      if (this.rsY != null) {
        paramInt = i + f.a.a.a.fS(7, this.rsY.boi());
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
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ot localot = (ot)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localot.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localot.iwS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localot.iwT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localot.token = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new azw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((azw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localot.rsE = ((azw)localObject1);
            paramInt += 1;
          }
        case 6: 
          localot.qUU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((btk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localot.rsY = ((btk)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */