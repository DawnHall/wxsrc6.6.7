package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ahs
  extends bhd
{
  public String cac;
  public String code;
  public String huU;
  public int scene;
  
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
      if (this.cac != null) {
        paramVarArgs.g(2, this.cac);
      }
      paramVarArgs.fT(3, this.scene);
      if (this.huU != null) {
        paramVarArgs.g(4, this.huU);
      }
      if (this.code != null) {
        paramVarArgs.g(5, this.code);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label477;
      }
    }
    label477:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.cac != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.cac);
      }
      i += f.a.a.a.fQ(3, this.scene);
      paramInt = i;
      if (this.huU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.huU);
      }
      i = paramInt;
      if (this.code != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.code);
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
        ahs localahs = (ahs)paramVarArgs[1];
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
            localahs.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localahs.cac = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localahs.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localahs.huU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localahs.code = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ahs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */