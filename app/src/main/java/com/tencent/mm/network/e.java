package com.tencent.mm.network;

import com.tencent.mm.network.a.b;
import com.tencent.mm.protocal.x;
import java.util.List;

public abstract interface e
{
  public abstract boolean Lh();
  
  public abstract c Lr();
  
  public abstract i Ls();
  
  public abstract void Lt();
  
  public abstract void Lu();
  
  public abstract int a(r paramr, l paraml);
  
  public abstract int a(String paramString, boolean paramBoolean, List<String> paramList);
  
  public abstract void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean);
  
  public abstract void a(b paramb);
  
  public abstract void a(h paramh);
  
  public abstract void a(o paramo);
  
  public abstract void a(x paramx);
  
  public abstract void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4);
  
  public abstract void bC(boolean paramBoolean);
  
  public abstract void bD(boolean paramBoolean);
  
  public abstract void bE(boolean paramBoolean);
  
  public abstract void bF(boolean paramBoolean);
  
  public abstract void cancel(int paramInt);
  
  public abstract int getHostByName(String paramString, List<String> paramList);
  
  public abstract String[] getIPsString(boolean paramBoolean);
  
  public abstract String getIspId();
  
  public abstract String getNetworkServerIp();
  
  public abstract void keepSignalling();
  
  public abstract void kg(String paramString);
  
  public abstract void kh(String paramString);
  
  public abstract void reportFailIp(String paramString);
  
  public abstract void reset();
  
  public abstract void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt);
  
  public abstract void setSignallingStrategy(long paramLong1, long paramLong2);
  
  public abstract void stopSignalling();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/network/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */