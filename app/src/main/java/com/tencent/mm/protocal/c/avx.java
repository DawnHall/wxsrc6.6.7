package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class avx
  extends bhd
{
  public String hbL;
  public String iwP;
  public bhy rYQ;
  public bhy rYR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rYQ == null) {
        throw new b("Not all required fields were included: CurrentSynckey");
      }
      if (this.rYR == null) {
        throw new b("Not all required fields were included: MaxSynckey");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      if (this.rYQ != null)
      {
        paramVarArgs.fV(3, this.rYQ.boi());
        this.rYQ.a(paramVarArgs);
      }
      if (this.rYR != null)
      {
        paramVarArgs.fV(4, this.rYR.boi());
        this.rYR.a(paramVarArgs);
      }
      if (this.iwP != null) {
        paramVarArgs.g(5, this.iwP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label745;
      }
    }
    label745:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = paramInt;
      if (this.rYQ != null) {
        i = paramInt + f.a.a.a.fS(3, this.rYQ.boi());
      }
      paramInt = i;
      if (this.rYR != null) {
        paramInt = i + f.a.a.a.fS(4, this.rYR.boi());
      }
      i = paramInt;
      if (this.iwP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.iwP);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rYQ == null) {
          throw new b("Not all required fields were included: CurrentSynckey");
        }
        if (this.rYR != null) {
          break;
        }
        throw new b("Not all required fields were included: MaxSynckey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        avx localavx = (avx)paramVarArgs[1];
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
            localavx.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localavx.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localavx.rYQ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localavx.rYR = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        localavx.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/avx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */