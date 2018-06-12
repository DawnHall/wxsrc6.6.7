package com.tencent.d.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;

public final class c
{
  static void as(Context paramContext, int paramInt)
  {
    com.tencent.d.a.c.c.i("Soter.SoterAntiBruteForceStrategy", "soter: setting to time: " + paramInt, new Object[0]);
    if (paramInt < 0)
    {
      com.tencent.d.a.c.c.w("Soter.SoterAntiBruteForceStrategy", "soter: illegal fail time", new Object[0]);
      return;
    }
    if (paramContext == null)
    {
      com.tencent.d.a.c.c.e("Soter.SoterAntiBruteForceStrategy", "soter: context is null", new Object[0]);
      return;
    }
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    paramContext.putInt("key_fail_times", paramInt);
    paramContext.apply();
  }
  
  public static boolean cFG()
  {
    return Build.VERSION.SDK_INT >= 23;
  }
  
  static int hF(Context paramContext)
  {
    paramContext = Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(paramContext).getInt("key_fail_times", 0));
    com.tencent.d.a.c.c.i("Soter.SoterAntiBruteForceStrategy", "soter: current retry time: " + paramContext, new Object[0]);
    return paramContext.intValue();
  }
  
  static void hG(Context paramContext)
  {
    as(paramContext, 6);
    q(paramContext, System.currentTimeMillis());
  }
  
  static void hH(Context paramContext)
  {
    q(paramContext, -1L);
    as(paramContext, 0);
  }
  
  public static boolean hI(Context paramContext)
  {
    boolean bool = false;
    long l = System.currentTimeMillis();
    paramContext = Long.valueOf(PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("key_last_freeze_time", -1L));
    com.tencent.d.a.c.c.i("Soter.SoterAntiBruteForceStrategy", "soter: current last freeze time: " + paramContext, new Object[0]);
    int i = (int)((l - paramContext.longValue()) / 1000L);
    com.tencent.d.a.c.c.i("Soter.SoterAntiBruteForceStrategy", "soter: tween sec after last freeze: " + i, new Object[0]);
    if (i > 30)
    {
      com.tencent.d.a.c.c.d("Soter.SoterAntiBruteForceStrategy", "soter: after last freeze", new Object[0]);
      bool = true;
    }
    return bool;
  }
  
  public static boolean hJ(Context paramContext)
  {
    boolean bool = false;
    if (hF(paramContext) < 5)
    {
      com.tencent.d.a.c.c.i("Soter.SoterAntiBruteForceStrategy", "soter: fail time available", new Object[0]);
      bool = true;
    }
    return bool;
  }
  
  private static void q(Context paramContext, long paramLong)
  {
    com.tencent.d.a.c.c.i("Soter.SoterAntiBruteForceStrategy", "soter: setting last freeze time: " + paramLong, new Object[0]);
    if (paramLong < -1L)
    {
      com.tencent.d.a.c.c.w("Soter.SoterAntiBruteForceStrategy", "soter: illegal setLastFreezeTime", new Object[0]);
      return;
    }
    if (paramContext == null)
    {
      com.tencent.d.a.c.c.e("Soter.SoterAntiBruteForceStrategy", "soter: context is null", new Object[0]);
      return;
    }
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    paramContext.putLong("key_last_freeze_time", paramLong);
    paramContext.apply();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/d/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */