package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbv
  extends bhd
{
  public String jTu;
  public int rxG;
  public long rxH;
  public long see;
  public int sef;
  public String seg;
  public long seh;
  
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
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.T(3, this.rxH);
      if (this.jTu != null) {
        paramVarArgs.g(4, this.jTu);
      }
      paramVarArgs.T(5, this.see);
      paramVarArgs.fT(6, this.sef);
      if (this.seg != null) {
        paramVarArgs.g(7, this.seg);
      }
      paramVarArgs.T(8, this.seh);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label578;
      }
    }
    label578:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.S(3, this.rxH);
      paramInt = i;
      if (this.jTu != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jTu);
      }
      i = paramInt + f.a.a.a.S(5, this.see) + f.a.a.a.fQ(6, this.sef);
      paramInt = i;
      if (this.seg != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.seg);
      }
      return paramInt + f.a.a.a.S(8, this.seh);
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
        bbv localbbv = (bbv)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbbv.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbbv.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbbv.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbbv.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbbv.see = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localbbv.sef = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbbv.seg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbbv.seh = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */