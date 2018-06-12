package com.tencent.smtt.sdk;

public final class URLUtil
{
  public static String composeSearchUrl(String paramString1, String paramString2, String paramString3)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().a(paramString1, paramString2, paramString3);
    }
    return android.webkit.URLUtil.composeSearchUrl(paramString1, paramString2, paramString3);
  }
  
  public static byte[] decode(byte[] paramArrayOfByte)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().a(paramArrayOfByte);
    }
    return android.webkit.URLUtil.decode(paramArrayOfByte);
  }
  
  public static final String guessFileName(String paramString1, String paramString2, String paramString3)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().b(paramString1, paramString2, paramString3);
    }
    return android.webkit.URLUtil.guessFileName(paramString1, paramString2, paramString3);
  }
  
  public static String guessUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().m(paramString);
    }
    return android.webkit.URLUtil.guessUrl(paramString);
  }
  
  public static boolean isAboutUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().q(paramString);
    }
    return android.webkit.URLUtil.isAboutUrl(paramString);
  }
  
  public static boolean isAssetUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().n(paramString);
    }
    return android.webkit.URLUtil.isAssetUrl(paramString);
  }
  
  public static boolean isContentUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().w(paramString);
    }
    return android.webkit.URLUtil.isContentUrl(paramString);
  }
  
  @Deprecated
  public static boolean isCookielessProxyUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().o(paramString);
    }
    return android.webkit.URLUtil.isCookielessProxyUrl(paramString);
  }
  
  public static boolean isDataUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().r(paramString);
    }
    return android.webkit.URLUtil.isDataUrl(paramString);
  }
  
  public static boolean isFileUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().p(paramString);
    }
    return android.webkit.URLUtil.isFileUrl(paramString);
  }
  
  public static boolean isHttpUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().t(paramString);
    }
    return android.webkit.URLUtil.isHttpUrl(paramString);
  }
  
  public static boolean isHttpsUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().u(paramString);
    }
    return android.webkit.URLUtil.isHttpsUrl(paramString);
  }
  
  public static boolean isJavaScriptUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().s(paramString);
    }
    return android.webkit.URLUtil.isJavaScriptUrl(paramString);
  }
  
  public static boolean isNetworkUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().v(paramString);
    }
    return android.webkit.URLUtil.isNetworkUrl(paramString);
  }
  
  public static boolean isValidUrl(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().x(paramString);
    }
    return android.webkit.URLUtil.isValidUrl(paramString);
  }
  
  public static String stripAnchor(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return localbv.c().y(paramString);
    }
    return android.webkit.URLUtil.stripAnchor(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/URLUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */