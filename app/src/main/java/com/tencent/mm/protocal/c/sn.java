package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class sn
  extends bhp
{
  public String hbL;
  public String jQb;
  public int rdV;
  public int rdW;
  public int rdX;
  public bhy rtW;
  public String rvP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.rvP != null) {
        paramVarArgs.g(3, this.rvP);
      }
      if (this.hbL != null) {
        paramVarArgs.g(4, this.hbL);
      }
      paramVarArgs.fT(5, this.rdV);
      paramVarArgs.fT(6, this.rdW);
      paramVarArgs.fT(7, this.rdX);
      if (this.rtW != null)
      {
        paramVarArgs.fV(8, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label772;
      }
    }
    label772:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.rvP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rvP);
      }
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hbL);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rdV) + f.a.a.a.fQ(6, this.rdW) + f.a.a.a.fQ(7, this.rdX);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(8, this.rtW.boi());
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
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        sn localsn = (sn)paramVarArgs[1];
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
            localsn.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localsn.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localsn.rvP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localsn.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localsn.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localsn.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localsn.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localsn.rtW = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/sn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */