package com.tencent.mm.platformtools;

public final class h
{
  public static String oI(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString.trim()))) {
      return paramString;
    }
    paramString = paramString.toCharArray();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    int j = paramString.length;
    while (i < j)
    {
      String str = SpellMap.g(paramString[i]);
      if (str != null) {
        localStringBuffer.append(str);
      }
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static String oJ(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString.trim()))) {
      return paramString;
    }
    paramString = paramString.toCharArray();
    StringBuffer localStringBuffer = new StringBuffer();
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      if (!Character.isSpace(paramString[i]))
      {
        String str = SpellMap.g(paramString[i]);
        if ((str != null) && (str.length() > 0)) {
          localStringBuffer.append(str.charAt(0));
        }
      }
      i += 1;
    }
    return localStringBuffer.toString().toUpperCase();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/platformtools/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */