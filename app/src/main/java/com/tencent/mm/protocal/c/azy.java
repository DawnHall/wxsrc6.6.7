package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class azy
  extends com.tencent.mm.bk.a
{
  public LinkedList<azx> scH = new LinkedList();
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      paramVarArgs.d(2, 8, this.scH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label312;
      }
    }
    label312:
    for (paramInt = f.a.a.b.b.a.h(1, this.title) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 8, this.scH);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.scH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        azy localazy = (azy)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localazy.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localazy.scH.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/azy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */