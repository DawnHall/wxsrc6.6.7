package com.tencent.rtmp;

import android.os.Bundle;

public abstract interface ITXLivePushListener
{
  public abstract void onNetStatus(Bundle paramBundle);
  
  public abstract void onPushEvent(int paramInt, Bundle paramBundle);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/rtmp/ITXLivePushListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */