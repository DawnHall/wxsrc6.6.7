package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aoj
  extends bhp
{
  public String jQb;
  public String rhq;
  public String rsw;
  public String rsx;
  public String rsy;
  public String rsz;
  
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
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.rsw != null) {
        paramVarArgs.g(3, this.rsw);
      }
      if (this.rhq != null) {
        paramVarArgs.g(4, this.rhq);
      }
      if (this.rsx != null) {
        paramVarArgs.g(5, this.rsx);
      }
      if (this.rsy != null) {
        paramVarArgs.g(6, this.rsy);
      }
      if (this.rsz != null) {
        paramVarArgs.g(7, this.rsz);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label639;
      }
    }
    label639:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.rsw != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rsw);
      }
      paramInt = i;
      if (this.rhq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rhq);
      }
      i = paramInt;
      if (this.rsx != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rsx);
      }
      paramInt = i;
      if (this.rsy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rsy);
      }
      i = paramInt;
      if (this.rsz != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rsz);
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
        aoj localaoj = (aoj)paramVarArgs[1];
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
            localaoj.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaoj.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaoj.rsw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaoj.rhq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaoj.rsx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaoj.rsy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaoj.rsz = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/aoj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */