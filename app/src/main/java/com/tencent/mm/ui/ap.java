package com.tencent.mm.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

public final class ap
{
  private static float density = -1.0F;
  private static SparseIntArray sCy = new SparseIntArray();
  private static float scale = 0.0F;
  
  public static int ae(Context paramContext, int paramInt)
  {
    int i = 0;
    if (paramContext == null) {
      ao.v("get dimension pixel size, resId %d, but context is null" + paramInt, new Object[0]);
    }
    int j;
    do
    {
      return i;
      j = sCy.get(paramInt, 0);
      i = j;
    } while (j != 0);
    i = paramContext.getResources().getDimensionPixelSize(paramInt);
    sCy.put(paramInt, i);
    return i;
  }
  
  public static float fe(Context paramContext)
  {
    if (scale == 0.0F) {
      if (paramContext != null) {
        break label20;
      }
    }
    label20:
    for (scale = 1.0F;; scale = paramContext.getSharedPreferences("com.tencent.mm_preferences", 0).getFloat("text_size_scale_key", 1.0F)) {
      return scale;
    }
  }
  
  public static int fromDPToPix(Context paramContext, int paramInt)
  {
    return Math.round(getDensity(paramContext) * paramInt);
  }
  
  public static float getDensity(Context paramContext)
  {
    if ((paramContext != null) && (density < 0.0F)) {
      density = paramContext.getResources().getDisplayMetrics().density;
    }
    return density;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */