package com.tencent.tinker.loader.hotplug.handler;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.tinker.loader.hotplug.IncrementComponentManager;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PMSInterceptHandler
  implements ServiceBinderInterceptor.BinderInvocationHandler
{
  private static Object c(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Class[] arrayOfClass = paramMethod.getExceptionTypes();
    for (;;)
    {
      int i;
      try
      {
        paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
        if (paramObject == null) {
          break label141;
        }
        return paramObject;
      }
      catch (InvocationTargetException paramObject)
      {
        paramMethod = ((InvocationTargetException)paramObject).getTargetException();
        if ((arrayOfClass == null) || (arrayOfClass.length <= 0)) {
          continue;
        }
        if (paramMethod == null) {
          continue;
        }
        paramObject = paramMethod;
        throw ((Throwable)paramObject);
        continue;
        return null;
      }
      catch (Throwable paramObject)
      {
        return null;
      }
      if (i < paramArrayOfObject.length)
      {
        if ((paramArrayOfObject[i] instanceof ComponentName))
        {
          new StringBuilder("locate componentName field of ").append(paramMethod.getName()).append(" done at idx: ").append(i);
          paramObject = (ComponentName)paramArrayOfObject[i];
          if (paramObject != null) {
            return IncrementComponentManager.acS(((ComponentName)paramObject).getClassName());
          }
          new StringBuilder("failed to locate componentName field of ").append(paramMethod.getName()).append(", notice any crashes or mistakes after resolve works.");
          return null;
        }
      }
      else
      {
        paramObject = null;
        continue;
        label141:
        i = 0;
        continue;
      }
      i += 1;
    }
  }
  
  private static Object d(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Class[] arrayOfClass = paramMethod.getExceptionTypes();
    for (;;)
    {
      int i;
      try
      {
        paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
        if (paramObject == null) {
          break label138;
        }
        return paramObject;
      }
      catch (InvocationTargetException paramObject)
      {
        paramMethod = ((InvocationTargetException)paramObject).getTargetException();
        if ((arrayOfClass == null) || (arrayOfClass.length <= 0)) {
          continue;
        }
        if (paramMethod == null) {
          continue;
        }
        paramObject = paramMethod;
        throw ((Throwable)paramObject);
        continue;
        return null;
      }
      catch (Throwable paramObject)
      {
        return null;
      }
      if (i < paramArrayOfObject.length)
      {
        if ((paramArrayOfObject[i] instanceof Intent))
        {
          new StringBuilder("locate intent field of ").append(paramMethod.getName()).append(" done at idx: ").append(i);
          paramObject = (Intent)paramArrayOfObject[i];
          if (paramObject != null) {
            return IncrementComponentManager.aC((Intent)paramObject);
          }
          new StringBuilder("failed to locate intent field of ").append(paramMethod.getName()).append(", notice any crashes or mistakes after resolve works.");
          return null;
        }
      }
      else
      {
        paramObject = null;
        continue;
        label138:
        i = 0;
        continue;
      }
      i += 1;
    }
  }
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = paramMethod.getName();
    if ("getActivityInfo".equals(str)) {
      return c(paramObject, paramMethod, paramArrayOfObject);
    }
    if ("resolveIntent".equals(str)) {
      return d(paramObject, paramMethod, paramArrayOfObject);
    }
    return paramMethod.invoke(paramObject, paramArrayOfObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/hotplug/handler/PMSInterceptHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */