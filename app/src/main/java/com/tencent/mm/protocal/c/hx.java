package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class hx
  extends bhd
{
  public String bHt;
  public int offset;
  public String riK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.riK == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.riK != null) {
        paramVarArgs.g(2, this.riK);
      }
      if (this.bHt != null) {
        paramVarArgs.g(3, this.bHt);
      }
      paramVarArgs.fT(4, this.offset);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label454;
      }
    }
    label454:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.riK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.riK);
      }
      i = paramInt;
      if (this.bHt != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bHt);
      }
      return i + f.a.a.a.fQ(4, this.offset);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.riK != null) {
          break;
        }
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        hx localhx = (hx)paramVarArgs[1];
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
            localhx.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localhx.riK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localhx.bHt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localhx.offset = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */