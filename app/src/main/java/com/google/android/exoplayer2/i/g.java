package com.google.android.exoplayer2.i;

import android.text.TextUtils;

public final class g
{
  public static boolean at(String paramString)
  {
    return "audio".equals(ay(paramString));
  }
  
  public static boolean au(String paramString)
  {
    return "video".equals(ay(paramString));
  }
  
  public static boolean av(String paramString)
  {
    return "text".equals(ay(paramString));
  }
  
  public static String aw(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return null;
      paramString = paramString.trim();
      if ((paramString.startsWith("avc1")) || (paramString.startsWith("avc3"))) {
        return "video/avc";
      }
      if ((paramString.startsWith("hev1")) || (paramString.startsWith("hvc1"))) {
        return "video/hevc";
      }
      if ((paramString.startsWith("vp9")) || (paramString.startsWith("vp09"))) {
        return "video/x-vnd.on2.vp9";
      }
      if ((paramString.startsWith("vp8")) || (paramString.startsWith("vp08"))) {
        return "video/x-vnd.on2.vp8";
      }
      if (paramString.startsWith("mp4a")) {
        return "audio/mp4a-latm";
      }
      if ((paramString.startsWith("ac-3")) || (paramString.startsWith("dac3"))) {
        return "audio/ac3";
      }
      if ((paramString.startsWith("ec-3")) || (paramString.startsWith("dec3"))) {
        return "audio/eac3";
      }
      if ((paramString.startsWith("dtsc")) || (paramString.startsWith("dtse"))) {
        return "audio/vnd.dts";
      }
      if ((paramString.startsWith("dtsh")) || (paramString.startsWith("dtsl"))) {
        return "audio/vnd.dts.hd";
      }
      if (paramString.startsWith("opus")) {
        return "audio/opus";
      }
    } while (!paramString.startsWith("vorbis"));
    return "audio/vorbis";
  }
  
  public static int ax(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return -1;
      if (at(paramString)) {
        return 1;
      }
      if (au(paramString)) {
        return 2;
      }
      if ((av(paramString)) || ("application/cea-608".equals(paramString)) || ("application/cea-708".equals(paramString)) || ("application/x-mp4-cea-608".equals(paramString)) || ("application/x-subrip".equals(paramString)) || ("application/ttml+xml".equals(paramString)) || ("application/x-quicktime-tx3g".equals(paramString)) || ("application/x-mp4-vtt".equals(paramString)) || ("application/x-rawcc".equals(paramString)) || ("application/vobsub".equals(paramString)) || ("application/pgs".equals(paramString)) || ("application/dvbsubs".equals(paramString))) {
        return 3;
      }
    } while ((!"application/id3".equals(paramString)) && (!"application/x-emsg".equals(paramString)) && (!"application/x-scte35".equals(paramString)) && (!"application/x-camera-motion".equals(paramString)));
    return 4;
  }
  
  private static String ay(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf('/');
    if (i == -1) {
      throw new IllegalArgumentException("Invalid mime type: " + paramString);
    }
    return paramString.substring(0, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */