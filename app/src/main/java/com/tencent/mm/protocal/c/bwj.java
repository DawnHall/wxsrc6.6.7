package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bwj
  extends bhp
{
  public int lOH;
  public int rci;
  public bhz rcj;
  public bhz rck;
  public long rcq;
  public int rdV;
  public int rdW;
  public int rdX;
  public String rmC;
  public String rmy;
  public bhz ssC;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ssC == null) {
        throw new b("Not all required fields were included: ClientImgId");
      }
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rci);
      if (this.ssC != null)
      {
        paramVarArgs.fV(3, this.ssC.boi());
        this.ssC.a(paramVarArgs);
      }
      if (this.rcj != null)
      {
        paramVarArgs.fV(4, this.rcj.boi());
        this.rcj.a(paramVarArgs);
      }
      if (this.rck != null)
      {
        paramVarArgs.fV(5, this.rck.boi());
        this.rck.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.rdV);
      paramVarArgs.fT(7, this.rdW);
      paramVarArgs.fT(8, this.rdX);
      paramVarArgs.fT(9, this.lOH);
      paramVarArgs.T(10, this.rcq);
      if (this.rmy != null) {
        paramVarArgs.g(11, this.rmy);
      }
      if (this.rmC != null) {
        paramVarArgs.g(12, this.rmC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1200;
      }
    }
    label1200:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rci);
      paramInt = i;
      if (this.ssC != null) {
        paramInt = i + f.a.a.a.fS(3, this.ssC.boi());
      }
      i = paramInt;
      if (this.rcj != null) {
        i = paramInt + f.a.a.a.fS(4, this.rcj.boi());
      }
      paramInt = i;
      if (this.rck != null) {
        paramInt = i + f.a.a.a.fS(5, this.rck.boi());
      }
      i = paramInt + f.a.a.a.fQ(6, this.rdV) + f.a.a.a.fQ(7, this.rdW) + f.a.a.a.fQ(8, this.rdX) + f.a.a.a.fQ(9, this.lOH) + f.a.a.a.S(10, this.rcq);
      paramInt = i;
      if (this.rmy != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rmy);
      }
      i = paramInt;
      if (this.rmC != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rmC);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.ssC == null) {
          throw new b("Not all required fields were included: ClientImgId");
        }
        if (this.rcj == null) {
          throw new b("Not all required fields were included: FromUserName");
        }
        if (this.rck != null) {
          break;
        }
        throw new b("Not all required fields were included: ToUserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwj localbwj = (bwj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbwj.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbwj.rci = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbwj.ssC = ((bhz)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbwj.rcj = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbwj.rck = ((bhz)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbwj.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbwj.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbwj.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbwj.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbwj.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 11: 
          localbwj.rmy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbwj.rmC = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bwj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */