package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ow
  extends bhd
{
  public String jTu;
  public String jTv;
  public int otY;
  public int rci;
  public long rcq;
  public int rdV;
  public String rsZ;
  public byo rta;
  
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
      if (this.rsZ != null) {
        paramVarArgs.g(2, this.rsZ);
      }
      paramVarArgs.fT(3, this.rdV);
      paramVarArgs.fT(4, this.rci);
      if (this.rta != null)
      {
        paramVarArgs.fV(5, this.rta.boi());
        this.rta.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.rcq);
      paramVarArgs.fT(7, this.otY);
      if (this.jTv != null) {
        paramVarArgs.g(8, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(9, this.jTu);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label743;
      }
    }
    label743:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rsZ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rsZ);
      }
      i = i + f.a.a.a.fQ(3, this.rdV) + f.a.a.a.fQ(4, this.rci);
      paramInt = i;
      if (this.rta != null) {
        paramInt = i + f.a.a.a.fS(5, this.rta.boi());
      }
      i = paramInt + f.a.a.a.S(6, this.rcq) + f.a.a.a.fQ(7, this.otY);
      paramInt = i;
      if (this.jTv != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.jTv);
      }
      i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.jTu);
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ow localow = (ow)paramVarArgs[1];
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
            localow.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localow.rsZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localow.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localow.rci = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byo();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localow.rta = ((byo)localObject1);
            paramInt += 1;
          }
        case 6: 
          localow.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 7: 
          localow.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localow.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localow.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */