package com.tencent.qqpinyin.voicerecoapi;

public class TRVADNative
{
  public native int mfeClose();
  
  public native int mfeDetect();
  
  public native int mfeEnableNoiseDetection(boolean paramBoolean);
  
  public native int mfeExit();
  
  public native int mfeGetCallbackData(byte[] paramArrayOfByte, int paramInt);
  
  public native int mfeGetEndFrame();
  
  public native int mfeGetParam(int paramInt);
  
  public native int mfeGetStartFrame();
  
  public native int mfeInit(int paramInt1, int paramInt2);
  
  public native int mfeOpen();
  
  public native int mfeSendData(short[] paramArrayOfShort, int paramInt);
  
  public native void mfeSetLogLevel(int paramInt);
  
  public native int mfeSetParam(int paramInt1, int paramInt2);
  
  public native int mfeStart();
  
  public native int mfeStop();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/qqpinyin/voicerecoapi/TRVADNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */