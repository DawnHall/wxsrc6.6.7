package com.tencent.mm.plugin.game.d;

public final class aa
  extends com.tencent.mm.bk.a
{
  public String jQo;
  public String jQp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQo != null) {
        paramVarArgs.g(1, this.jQo);
      }
      if (this.jQp != null) {
        paramVarArgs.g(2, this.jQp);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQo == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = f.a.a.b.b.a.h(1, this.jQo) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jQp != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jQp);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        aa localaa = (aa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaa.jQo = locala.vHC.readString();
          return 0;
        }
        localaa.jQp = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */