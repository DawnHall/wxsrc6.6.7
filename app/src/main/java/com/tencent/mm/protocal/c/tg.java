package com.tencent.mm.protocal.c;

public final class tg
  extends com.tencent.mm.bk.a
{
  public String jPG;
  public String jPe;
  public String rwC;
  public int rwD;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPe != null) {
        paramVarArgs.g(1, this.jPe);
      }
      if (this.jPG != null) {
        paramVarArgs.g(2, this.jPG);
      }
      if (this.rwC != null) {
        paramVarArgs.g(3, this.rwC);
      }
      paramVarArgs.fT(4, this.rwD);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPe == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.jPe) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPG);
      }
      i = paramInt;
      if (this.rwC != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwC);
      }
      return i + f.a.a.a.fQ(4, this.rwD);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        tg localtg = (tg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localtg.jPe = locala.vHC.readString();
          return 0;
        case 2: 
          localtg.jPG = locala.vHC.readString();
          return 0;
        case 3: 
          localtg.rwC = locala.vHC.readString();
          return 0;
        }
        localtg.rwD = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */