package com.tencent.mm.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.x;

public final class k
{
  public static boolean bA(Context paramContext)
  {
    if (paramContext == null)
    {
      x.e("MicroMsg.WeChatAppStatus", "getFullExitStatus context == null");
      return false;
    }
    return paramContext.getSharedPreferences("system_config_prefs", 4).getBoolean("settings_fully_exit", true);
  }
  
  public static boolean bB(Context paramContext)
  {
    if (paramContext == null)
    {
      x.e("MicroMsg.WeChatAppStatus", "getShutDownWxStatus context == null");
      return false;
    }
    return paramContext.getSharedPreferences("system_config_prefs_showdown", 4).getBoolean("shut_down_weixin", false);
  }
  
  public static void j(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null)
    {
      x.e("MicroMsg.WeChatAppStatus", "editFullExitStatus context == null");
      return;
    }
    paramContext.getSharedPreferences("system_config_prefs", 4).edit().putBoolean("settings_fully_exit", paramBoolean).commit();
    x.i("MicroMsg.WeChatAppStatus", "editFullExitStatus to " + paramBoolean);
  }
  
  public static void k(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null)
    {
      x.e("MicroMsg.WeChatAppStatus", "editShutDownWxStatus context == null");
      return;
    }
    paramContext.getSharedPreferences("system_config_prefs_showdown", 4).edit().putBoolean("shut_down_weixin", paramBoolean).commit();
    x.i("MicroMsg.WeChatAppStatus", "editShutDownWxStatus to " + paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */