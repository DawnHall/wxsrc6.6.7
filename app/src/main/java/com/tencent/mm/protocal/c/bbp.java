package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbp
  extends bhd
{
  public String jTB;
  public int lOM;
  public String rem;
  public String sdK;
  public String sdL;
  public int sdM;
  
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
      if (this.rem != null) {
        paramVarArgs.g(2, this.rem);
      }
      if (this.sdK != null) {
        paramVarArgs.g(3, this.sdK);
      }
      if (this.sdL != null) {
        paramVarArgs.g(4, this.sdL);
      }
      paramVarArgs.fT(5, this.lOM);
      if (this.jTB != null) {
        paramVarArgs.g(7, this.jTB);
      }
      paramVarArgs.fT(8, this.sdM);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label575;
      }
    }
    label575:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rem != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rem);
      }
      i = paramInt;
      if (this.sdK != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sdK);
      }
      paramInt = i;
      if (this.sdL != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sdL);
      }
      i = paramInt + f.a.a.a.fQ(5, this.lOM);
      paramInt = i;
      if (this.jTB != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.jTB);
      }
      return paramInt + f.a.a.a.fQ(8, this.sdM);
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
        bbp localbbp = (bbp)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 6: 
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
            localbbp.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbbp.rem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbbp.sdK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbbp.sdL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbbp.lOM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbbp.jTB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbbp.sdM = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */