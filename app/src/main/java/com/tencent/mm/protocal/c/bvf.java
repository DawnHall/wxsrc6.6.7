package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bvf
  extends bhd
{
  public int otY;
  public bhy rhB;
  public String srU;
  public String srV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.srU != null) {
        paramVarArgs.g(2, this.srU);
      }
      if (this.srV != null) {
        paramVarArgs.g(3, this.srV);
      }
      paramVarArgs.fT(4, this.otY);
      if (this.rhB != null)
      {
        paramVarArgs.fV(5, this.rhB.boi());
        this.rhB.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label567;
      }
    }
    label567:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.srU != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.srU);
      }
      i = paramInt;
      if (this.srV != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.srV);
      }
      i += f.a.a.a.fQ(4, this.otY);
      paramInt = i;
      if (this.rhB != null) {
        paramInt = i + f.a.a.a.fS(5, this.rhB.boi());
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bvf localbvf = (bvf)paramVarArgs[1];
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
            localbvf.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbvf.srU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbvf.srV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbvf.otY = ((f.a.a.a.a)localObject1).vHC.rY();
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
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbvf.rhB = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */