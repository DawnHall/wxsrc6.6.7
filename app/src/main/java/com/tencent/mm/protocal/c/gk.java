package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class gk
  extends com.tencent.mm.bk.a
{
  public String hbP;
  public int rfn;
  public String rgL;
  public String rgQ;
  public aue rgR;
  public alx rgS;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rfn);
      if (this.rgQ != null) {
        paramVarArgs.g(2, this.rgQ);
      }
      if (this.rgR != null)
      {
        paramVarArgs.fV(3, this.rgR.boi());
        this.rgR.a(paramVarArgs);
      }
      if (this.rgL != null) {
        paramVarArgs.g(4, this.rgL);
      }
      if (this.hbP != null) {
        paramVarArgs.g(5, this.hbP);
      }
      if (this.rgS != null)
      {
        paramVarArgs.fV(6, this.rgS.boi());
        this.rgS.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.rfn) + 0;
      paramInt = i;
      if (this.rgQ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rgQ);
      }
      i = paramInt;
      if (this.rgR != null) {
        i = paramInt + f.a.a.a.fS(3, this.rgR.boi());
      }
      paramInt = i;
      if (this.rgL != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rgL);
      }
      i = paramInt;
      if (this.hbP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbP);
      }
      paramInt = i;
    } while (this.rgS == null);
    return i + f.a.a.a.fS(6, this.rgS.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      gk localgk = (gk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localgk.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localgk.rgQ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aue();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aue)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localgk.rgR = ((aue)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localgk.rgL = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        localgk.hbP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new alx();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((alx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localgk.rgS = ((alx)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */