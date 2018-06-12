package com.tencent.rtmp;

import com.tencent.liteav.basic.log.TXCLog;

public class TXLog
{
  public static void d(String paramString1, String paramString2)
  {
    wrietLogMessage(1, paramString1, paramString2);
  }
  
  public static void e(String paramString1, String paramString2)
  {
    wrietLogMessage(4, paramString1, paramString2);
  }
  
  public static void i(String paramString1, String paramString2)
  {
    wrietLogMessage(2, paramString1, paramString2);
  }
  
  public static void w(String paramString1, String paramString2)
  {
    wrietLogMessage(3, paramString1, paramString2);
  }
  
  private static void wrietLogMessage(int paramInt, String paramString1, String paramString2)
  {
    TXCLog.log(paramInt, paramString1, "thread ID:" + Thread.currentThread().getId() + "|line:-1|" + paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/rtmp/TXLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */