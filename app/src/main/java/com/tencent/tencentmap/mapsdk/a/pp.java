package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.map.lib.util.StringUtil;

public class pp
{
  private static int a(NetworkInfo paramNetworkInfo)
  {
    int j = 6;
    int i;
    if ((paramNetworkInfo == null) || (!paramNetworkInfo.isAvailable())) {
      i = 0;
    }
    do
    {
      int k;
      do
      {
        return i;
        k = paramNetworkInfo.getType();
        if (k == 1) {
          return 5;
        }
        i = j;
      } while (k != 0);
      paramNetworkInfo = paramNetworkInfo.getExtraInfo();
      i = j;
    } while (StringUtil.isEmpty(paramNetworkInfo));
    if (paramNetworkInfo.equalsIgnoreCase("cmwap")) {
      return 1;
    }
    if (paramNetworkInfo.equalsIgnoreCase("3gwap")) {
      return 3;
    }
    if (paramNetworkInfo.equalsIgnoreCase("uniwap")) {
      return 2;
    }
    if (paramNetworkInfo.equalsIgnoreCase("ctwap")) {
      return 4;
    }
    return 3;
  }
  
  public static NetworkInfo a(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static int b(Context paramContext)
  {
    return a(a(paramContext));
  }
  
  public static String c(Context paramContext)
  {
    switch (b(paramContext))
    {
    default: 
      return "";
    case 5: 
      return "wifi";
    case 3: 
      return "3gwap";
    case 2: 
      return "uniwap";
    case 1: 
      return "cmwap";
    }
    return "ctwap";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */