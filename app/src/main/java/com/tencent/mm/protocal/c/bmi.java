package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bmi
  extends bhd
{
  public float bSx;
  public float bUg;
  public int scene;
  public String skB;
  
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
      paramVarArgs.l(2, this.bUg);
      paramVarArgs.l(3, this.bSx);
      paramVarArgs.fT(4, this.scene);
      if (this.skB != null) {
        paramVarArgs.g(5, this.skB);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label437;
      }
    }
    label437:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 4) + (f.a.a.b.b.a.ec(3) + 4) + f.a.a.a.fQ(4, this.scene);
      paramInt = i;
      if (this.skB != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.skB);
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
        bmi localbmi = (bmi)paramVarArgs[1];
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
            localbmi.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbmi.bUg = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 3: 
          localbmi.bSx = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 4: 
          localbmi.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbmi.skB = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bmi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */