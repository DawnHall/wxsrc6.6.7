package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class ar
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public LinkedList<w> jPz = new LinkedList();
  public String jQG;
  public String jQZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.jPz);
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.jQG != null) {
        paramVarArgs.g(3, this.jQG);
      }
      if (this.jQZ != null) {
        paramVarArgs.g(4, this.jQZ);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.c(1, 8, this.jPz) + 0;
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.jQG != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jQG);
      }
      paramInt = i;
    } while (this.jQZ == null);
    return i + f.a.a.b.b.a.h(4, this.jQZ);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jPz.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ar localar = (ar)paramVarArgs[1];
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
          localObject1 = new w();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((w)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localar.jPz.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localar.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localar.jQG = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localar.jQZ = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */