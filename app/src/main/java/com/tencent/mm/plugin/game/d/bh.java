package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.fl;
import f.a.a.b;
import java.util.LinkedList;

public final class bh
  extends bhp
{
  public p jRU;
  public as jRV;
  
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
      if (this.jRU != null)
      {
        paramVarArgs.fV(2, this.jRU.boi());
        this.jRU.a(paramVarArgs);
      }
      if (this.jRV != null)
      {
        paramVarArgs.fV(3, this.jRV.boi());
        this.jRV.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label599;
      }
    }
    label599:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jRU != null) {
        paramInt = i + f.a.a.a.fS(2, this.jRU.boi());
      }
      i = paramInt;
      if (this.jRV != null) {
        i = paramInt + f.a.a.a.fS(3, this.jRV.boi());
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
        bh localbh = (bh)paramVarArgs[1];
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
            localbh.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new p();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((p)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbh.jRU = ((p)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new as();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((as)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbh.jRV = ((as)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */