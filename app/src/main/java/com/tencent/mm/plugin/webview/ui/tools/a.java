package com.tencent.mm.plugin.webview.ui.tools;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final Map<String, Integer> jGa;
  private static final Map<Integer, Integer> pVj;
  private static final Map<Integer, Integer> pVk;
  private static final Map<Integer, Integer> pVl;
  
  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(-1), Integer.valueOf(5));
    localHashMap.put(Integer.valueOf(-2), Integer.valueOf(6));
    localHashMap.put(Integer.valueOf(-3), Integer.valueOf(7));
    localHashMap.put(Integer.valueOf(-4), Integer.valueOf(8));
    localHashMap.put(Integer.valueOf(-5), Integer.valueOf(9));
    localHashMap.put(Integer.valueOf(-6), Integer.valueOf(10));
    localHashMap.put(Integer.valueOf(-7), Integer.valueOf(11));
    localHashMap.put(Integer.valueOf(-8), Integer.valueOf(12));
    localHashMap.put(Integer.valueOf(-9), Integer.valueOf(13));
    localHashMap.put(Integer.valueOf(-10), Integer.valueOf(14));
    localHashMap.put(Integer.valueOf(-11), Integer.valueOf(15));
    localHashMap.put(Integer.valueOf(-12), Integer.valueOf(16));
    localHashMap.put(Integer.valueOf(-13), Integer.valueOf(17));
    localHashMap.put(Integer.valueOf(-14), Integer.valueOf(18));
    localHashMap.put(Integer.valueOf(-15), Integer.valueOf(19));
    pVj = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(-1), Integer.valueOf(4));
    localHashMap.put(Integer.valueOf(-2), Integer.valueOf(5));
    localHashMap.put(Integer.valueOf(-3), Integer.valueOf(6));
    localHashMap.put(Integer.valueOf(-4), Integer.valueOf(7));
    localHashMap.put(Integer.valueOf(-5), Integer.valueOf(8));
    localHashMap.put(Integer.valueOf(-6), Integer.valueOf(9));
    pVk = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), Integer.valueOf(0));
    localHashMap.put(Integer.valueOf(1), Integer.valueOf(1));
    localHashMap.put(Integer.valueOf(2), Integer.valueOf(2));
    pVl = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put("imagePreview", Integer.valueOf(2));
    localHashMap.put("profile", Integer.valueOf(3));
    localHashMap.put("addContact", Integer.valueOf(4));
    localHashMap.put("shareTimeline", Integer.valueOf(7));
    localHashMap.put("scanQRCode", Integer.valueOf(8));
    localHashMap.put("hideOptionMenu", Integer.valueOf(10));
    localHashMap.put("getBrandWCPayRequest", Integer.valueOf(11));
    localHashMap.put("editAddress", Integer.valueOf(12));
    localHashMap.put("getLatestAddress", Integer.valueOf(13));
    localHashMap.put("jumpWCMall", Integer.valueOf(14));
    localHashMap.put("geoLocation", Integer.valueOf(15));
    localHashMap.put("openProductView", Integer.valueOf(16));
    localHashMap.put("openProductViewWithPid", Integer.valueOf(16));
    localHashMap.put("openLocation", Integer.valueOf(17));
    localHashMap.put("hideMenuItems", Integer.valueOf(19));
    localHashMap.put("connectToFreeWifi", Integer.valueOf(20));
    localHashMap.put("startRecord", Integer.valueOf(21));
    localHashMap.put("chooseImage", Integer.valueOf(22));
    localHashMap.put("scanCover", Integer.valueOf(23));
    localHashMap.put("openGameWebView", Integer.valueOf(28));
    jGa = Collections.unmodifiableMap(localHashMap);
  }
  
  public static int AA(int paramInt)
  {
    Integer localInteger2 = (Integer)pVl.get(Integer.valueOf(paramInt));
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(-1);
    }
    return localInteger1.intValue();
  }
  
  public static int Ay(int paramInt)
  {
    Integer localInteger2 = (Integer)pVj.get(Integer.valueOf(paramInt));
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = (Integer)pVj.get(Integer.valueOf(-1));
    }
    return localInteger1.intValue();
  }
  
  public static int Az(int paramInt)
  {
    Integer localInteger2 = (Integer)pVk.get(Integer.valueOf(paramInt));
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = (Integer)pVk.get(Integer.valueOf(-1));
    }
    return localInteger1.intValue();
  }
  
  public static int QZ(String paramString)
  {
    Integer localInteger = (Integer)jGa.get(paramString);
    paramString = localInteger;
    if (localInteger == null) {
      paramString = Integer.valueOf(-1);
    }
    return paramString.intValue();
  }
  
  public static int fD(long paramLong)
  {
    if (paramLong < 0L) {
      return -1;
    }
    if (paramLong <= 2000L) {
      return 1;
    }
    if (paramLong <= 6000L) {
      return 2;
    }
    if (paramLong <= 12000L) {
      return 3;
    }
    if (paramLong <= 60000L) {
      return 4;
    }
    return 5;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */