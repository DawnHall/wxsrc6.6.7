package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class axn
  extends bhp
{
  public int hwV;
  public String hwW;
  public String rhc;
  public bbc rhe;
  public String saE;
  public boolean saF;
  public boolean saG;
  
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
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      if (this.saE != null) {
        paramVarArgs.g(4, this.saE);
      }
      if (this.rhc != null) {
        paramVarArgs.g(7, this.rhc);
      }
      if (this.rhe != null)
      {
        paramVarArgs.fV(8, this.rhe.boi());
        this.rhe.a(paramVarArgs);
      }
      paramVarArgs.av(9, this.saF);
      paramVarArgs.av(10, this.saG);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label738;
      }
    }
    label738:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt;
      if (this.saE != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.saE);
      }
      paramInt = i;
      if (this.rhc != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rhc);
      }
      i = paramInt;
      if (this.rhe != null) {
        i = paramInt + f.a.a.a.fS(8, this.rhe.boi());
      }
      return i + (f.a.a.b.b.a.ec(9) + 1) + (f.a.a.b.b.a.ec(10) + 1);
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
        axn localaxn = (axn)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5: 
        case 6: 
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
            localaxn.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaxn.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localaxn.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaxn.saE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaxn.rhc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bbc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaxn.rhe = ((bbc)localObject1);
            paramInt += 1;
          }
        case 9: 
          localaxn.saF = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localaxn.saG = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/axn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */