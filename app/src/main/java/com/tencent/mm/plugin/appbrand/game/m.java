package com.tencent.mm.plugin.appbrand.game;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.sdk.platformtools.ad;

public enum m
{
  private boolean fAx;
  private int heightPixels;
  private int widthPixels;
  
  private m() {}
  
  @Deprecated
  public static void e(Point paramPoint)
  {
    Object localObject = ad.getContext();
    if (localObject == null) {}
    do
    {
      return;
      localObject = (WindowManager)((Context)localObject).getSystemService("window");
    } while ((localObject == null) || (((WindowManager)localObject).getDefaultDisplay() == null));
    ((WindowManager)localObject).getDefaultDisplay().getRealSize(paramPoint);
  }
  
  public final void bJ(int paramInt1, int paramInt2)
  {
    try
    {
      this.widthPixels = paramInt1;
      this.heightPixels = paramInt2;
      this.fAx = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void d(Point paramPoint)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 80	com/tencent/mm/plugin/appbrand/game/m:fAx	Z
    //   6: ifne +24 -> 30
    //   9: ldc 83
    //   11: new 85	java/lang/IllegalStateException
    //   14: dup
    //   15: invokespecial 87	java/lang/IllegalStateException:<init>	()V
    //   18: ldc 89
    //   20: iconst_0
    //   21: anewarray 91	java/lang/Object
    //   24: invokestatic 97	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_1
    //   31: aload_0
    //   32: getfield 76	com/tencent/mm/plugin/appbrand/game/m:widthPixels	I
    //   35: putfield 102	android/graphics/Point:x	I
    //   38: aload_1
    //   39: aload_0
    //   40: getfield 78	com/tencent/mm/plugin/appbrand/game/m:heightPixels	I
    //   43: putfield 105	android/graphics/Point:y	I
    //   46: goto -19 -> 27
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	m
    //   0	54	1	paramPoint	Point
    // Exception table:
    //   from	to	target	type
    //   2	27	49	finally
    //   30	46	49	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */