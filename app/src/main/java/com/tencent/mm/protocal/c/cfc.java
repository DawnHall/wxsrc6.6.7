package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cfc
  extends com.tencent.mm.bk.a
{
  public String szH;
  public String szI;
  public String szJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szH == null) {
        throw new b("Not all required fields were included: Plugin");
      }
      if (this.szI == null) {
        throw new b("Not all required fields were included: ActivityPath");
      }
      if (this.szH != null) {
        paramVarArgs.g(1, this.szH);
      }
      if (this.szI != null) {
        paramVarArgs.g(2, this.szI);
      }
      if (this.szJ != null) {
        paramVarArgs.g(3, this.szJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.szH == null) {
        break label357;
      }
    }
    label357:
    for (int i = f.a.a.b.b.a.h(1, this.szH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.szI != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.szI);
      }
      i = paramInt;
      if (this.szJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.szJ);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.szH == null) {
          throw new b("Not all required fields were included: Plugin");
        }
        if (this.szI != null) {
          break;
        }
        throw new b("Not all required fields were included: ActivityPath");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cfc localcfc = (cfc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcfc.szH = locala.vHC.readString();
          return 0;
        case 2: 
          localcfc.szI = locala.vHC.readString();
          return 0;
        }
        localcfc.szJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */