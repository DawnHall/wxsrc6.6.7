package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bsy
  extends com.tencent.mm.bk.a
{
  public String aAL;
  public String value;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.aAL == null) {
        throw new b("Not all required fields were included: key");
      }
      if (this.value == null) {
        throw new b("Not all required fields were included: value");
      }
      if (this.aAL != null) {
        paramVarArgs.g(1, this.aAL);
      }
      if (this.value != null) {
        paramVarArgs.g(2, this.value);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.aAL == null) {
        break label302;
      }
    }
    label302:
    for (paramInt = f.a.a.b.b.a.h(1, this.aAL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.value != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.value);
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
        if (this.aAL == null) {
          throw new b("Not all required fields were included: key");
        }
        if (this.value != null) {
          break;
        }
        throw new b("Not all required fields were included: value");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bsy localbsy = (bsy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbsy.aAL = locala.vHC.readString();
          return 0;
        }
        localbsy.value = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bsy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */