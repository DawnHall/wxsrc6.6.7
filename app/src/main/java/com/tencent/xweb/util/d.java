package com.tencent.xweb.util;

import android.os.Build.VERSION;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import org.xwalk.core.Log;

public final class d
{
  public static Object c(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object... paramVarArgs)
  {
    if (paramObject == null) {}
    do
    {
      for (;;)
      {
        return null;
        try
        {
          Object localObject = paramObject.getClass();
          if (Build.VERSION.SDK_INT > 10) {}
          for (paramArrayOfClass = ((Class)localObject).getMethod(paramString, paramArrayOfClass);; paramArrayOfClass = ((Class)localObject).getDeclaredMethod(paramString, paramArrayOfClass))
          {
            paramArrayOfClass.setAccessible(true);
            localObject = paramVarArgs;
            if (paramVarArgs.length == 0) {
              localObject = null;
            }
            return paramArrayOfClass.invoke(paramObject, (Object[])localObject);
          }
          if (paramString.equalsIgnoreCase("canLoadX5Core")) {}
        }
        catch (Throwable paramObject)
        {
          if ((((Throwable)paramObject).getCause() != null) && (((Throwable)paramObject).getCause().toString().contains("AuthenticationFail"))) {
            return new String("AuthenticationFail");
          }
        }
      }
    } while (paramString.equalsIgnoreCase("initTesRuntimeEnvironment"));
    paramString = new StringWriter();
    ((Throwable)paramObject).printStackTrace(new PrintWriter(paramString));
    Log.e("ReflectionUtils", "invokeInstance -- exceptions:" + paramString.toString());
    return null;
  }
  
  public static Object gx(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = Class.forName(paramString1).getMethod(paramString2, new Class[0]).invoke(null, new Object[0]);
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/xweb/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */