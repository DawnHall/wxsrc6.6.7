package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bfb
  extends bhp
{
  public String iEL;
  public int sgH;
  public int sgI;
  public String sgJ;
  public bey sgt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sgt == null) {
        throw new b("Not all required fields were included: rcptinfolist");
      }
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.sgt != null)
      {
        paramVarArgs.fV(1, this.sgt.boi());
        this.sgt.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.sgH);
      if (this.six != null)
      {
        paramVarArgs.fV(3, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.iEL != null) {
        paramVarArgs.g(4, this.iEL);
      }
      paramVarArgs.fT(5, this.sgI);
      if (this.sgJ != null) {
        paramVarArgs.g(6, this.sgJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sgt == null) {
        break label678;
      }
    }
    label678:
    for (paramInt = f.a.a.a.fS(1, this.sgt.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sgH);
      paramInt = i;
      if (this.six != null) {
        paramInt = i + f.a.a.a.fS(3, this.six.boi());
      }
      i = paramInt;
      if (this.iEL != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.iEL);
      }
      i += f.a.a.a.fQ(5, this.sgI);
      paramInt = i;
      if (this.sgJ != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sgJ);
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
        if (this.sgt == null) {
          throw new b("Not all required fields were included: rcptinfolist");
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bfb localbfb = (bfb)paramVarArgs[1];
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
            localObject1 = new bey();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bey)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbfb.sgt = ((bey)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbfb.sgH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbfb.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 4: 
          localbfb.iEL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbfb.sgI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbfb.sgJ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */