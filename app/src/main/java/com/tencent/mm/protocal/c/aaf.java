package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aaf
  extends bhd
{
  public LinkedList<ane> rFH = new LinkedList();
  public ang rFJ;
  public long rFK;
  
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
      paramVarArgs.d(2, 8, this.rFH);
      if (this.rFJ != null)
      {
        paramVarArgs.fV(4, this.rFJ.boi());
        this.rFJ.a(paramVarArgs);
      }
      paramVarArgs.T(5, this.rFK);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label594;
      }
    }
    label594:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.rFH);
      paramInt = i;
      if (this.rFJ != null) {
        paramInt = i + f.a.a.a.fS(4, this.rFJ.boi());
      }
      return paramInt + f.a.a.a.S(5, this.rFK);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rFH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        aaf localaaf = (aaf)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 3: 
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
            localaaf.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ane();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ane)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaaf.rFH.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ang();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ang)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaaf.rFJ = ((ang)localObject1);
            paramInt += 1;
          }
        }
        localaaf.rFK = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */