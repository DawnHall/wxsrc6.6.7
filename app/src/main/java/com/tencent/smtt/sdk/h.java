package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

final class h
  extends Thread
{
  h(Context paramContext, String paramString, ValueCallback paramValueCallback) {}
  
  public final void run()
  {
    bv localbv = bv.a();
    localbv.a(this.a, null);
    boolean bool = false;
    if (localbv.b()) {
      bool = localbv.c().a(this.a, this.b);
    }
    new Handler(Looper.getMainLooper()).post(new i(this, bool));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/smtt/sdk/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */