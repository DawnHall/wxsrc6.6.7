package com.tencent.mm.protocal.c;

public final class chk
  extends com.tencent.mm.bk.a
{
  public String sAz;
  public int sBm;
  public int sBn;
  public String sBo;
  public int sBp;
  public String srZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sBm);
      paramVarArgs.fT(2, this.sBn);
      if (this.srZ != null) {
        paramVarArgs.g(3, this.srZ);
      }
      if (this.sBo != null) {
        paramVarArgs.g(4, this.sBo);
      }
      if (this.sAz != null) {
        paramVarArgs.g(5, this.sAz);
      }
      paramVarArgs.fT(6, this.sBp);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.sBm) + 0 + f.a.a.a.fQ(2, this.sBn);
      paramInt = i;
      if (this.srZ != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.srZ);
      }
      i = paramInt;
      if (this.sBo != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.sBo);
      }
      paramInt = i;
      if (this.sAz != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sAz);
      }
      return paramInt + f.a.a.a.fQ(6, this.sBp);
    }
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
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      chk localchk = (chk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localchk.sBm = locala.vHC.rY();
        return 0;
      case 2: 
        localchk.sBn = locala.vHC.rY();
        return 0;
      case 3: 
        localchk.srZ = locala.vHC.readString();
        return 0;
      case 4: 
        localchk.sBo = locala.vHC.readString();
        return 0;
      case 5: 
        localchk.sAz = locala.vHC.readString();
        return 0;
      }
      localchk.sBp = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/chk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */