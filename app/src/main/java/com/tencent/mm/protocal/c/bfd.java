package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bfd
  extends bhp
{
  public int id;
  public bey sgt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sgt == null) {
        throw new b("Not all required fields were included: rcptinfolist");
      }
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      paramVarArgs.fT(1, this.id);
      if (this.sgt != null)
      {
        paramVarArgs.fV(2, this.sgt.boi());
        this.sgt.a(paramVarArgs);
      }
      if (this.six != null)
      {
        paramVarArgs.fV(3, this.six.boi());
        this.six.a(paramVarArgs);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.id) + 0;
      paramInt = i;
      if (this.sgt != null) {
        paramInt = i + f.a.a.a.fS(2, this.sgt.boi());
      }
      i = paramInt;
    } while (this.six == null);
    return paramInt + f.a.a.a.fS(3, this.six.boi());
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
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bfd localbfd = (bfd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbfd.id = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bey();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bey)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbfd.sgt = ((bey)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new fl();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
        localbfd.six = ((fl)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */