package com.tencent.tinker.lib.a;

import android.app.Application;
import android.os.Build.VERSION;
import com.tencent.tinker.lib.e.b;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static void a(ClassLoader paramClassLoader, File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists()))
    {
      com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "installNativeLibraryPath, folder %s is illegal", new Object[] { paramFile });
      return;
    }
    if (((Build.VERSION.SDK_INT == 25) && (Build.VERSION.PREVIEW_SDK_INT != 0)) || (Build.VERSION.SDK_INT > 25)) {}
    label365:
    for (;;)
    {
      try
      {
        Object localObject4 = ShareReflectUtil.b(paramClassLoader, "pathList").get(paramClassLoader);
        Object localObject1 = (List)ShareReflectUtil.b(localObject4, "nativeLibraryDirectories").get(localObject4);
        if (localObject1 != null) {
          break label365;
        }
        localObject1 = new ArrayList(2);
        Object localObject2 = ((List)localObject1).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          if (!paramFile.equals((File)((Iterator)localObject2).next())) {
            continue;
          }
          ((Iterator)localObject2).remove();
        }
        ((List)localObject1).add(0, paramFile);
        Object localObject3 = (List)ShareReflectUtil.b(localObject4, "systemNativeLibraryDirectories").get(localObject4);
        localObject2 = localObject3;
        if (localObject3 == null) {
          localObject2 = new ArrayList(2);
        }
        localObject3 = new ArrayList(((List)localObject1).size() + ((List)localObject2).size() + 1);
        ((List)localObject3).addAll((Collection)localObject1);
        ((List)localObject3).addAll((Collection)localObject2);
        localObject1 = (Object[])ShareReflectUtil.b(localObject4, "makePathElements", new Class[] { List.class }).invoke(localObject4, new Object[] { localObject3 });
        ShareReflectUtil.b(localObject4, "nativeLibraryPathElements").set(localObject4, localObject1);
        return;
      }
      catch (Throwable localThrowable1)
      {
        com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), localThrowable1.getMessage() });
        b.c(paramClassLoader, paramFile);
        return;
      }
      if (Build.VERSION.SDK_INT >= 23) {
        try
        {
          b.c(paramClassLoader, paramFile);
          return;
        }
        catch (Throwable localThrowable2)
        {
          com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), localThrowable2.getMessage() });
          a.b(paramClassLoader, paramFile);
          return;
        }
      }
      if (Build.VERSION.SDK_INT >= 14)
      {
        a.b(paramClassLoader, paramFile);
        return;
      }
      c.d(paramClassLoader, paramFile);
      return;
    }
  }
  
  public static boolean a(ApplicationLike paramApplicationLike, String paramString)
  {
    Object localObject = b.e(paramApplicationLike);
    if (ShareTinkerInternals.oW((String)localObject))
    {
      com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "failed to get current patch version.", new Object[0]);
      return false;
    }
    File localFile = SharePatchFileUtil.hV(paramApplicationLike.getApplication());
    if (localFile == null)
    {
      com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "failed to get current patch directory.", new Object[0]);
      return false;
    }
    localObject = new File(localFile.getAbsolutePath() + "/" + SharePatchFileUtil.acV((String)localObject));
    paramString = new File(((File)localObject).getAbsolutePath() + "/lib/lib/" + paramString);
    if (!paramString.exists())
    {
      com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "tinker lib path [%s] is not exists.", new Object[] { paramString });
      return false;
    }
    paramApplicationLike = paramApplicationLike.getApplication().getClassLoader();
    if (paramApplicationLike == null)
    {
      com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "classloader is null", new Object[0]);
      return false;
    }
    com.tencent.tinker.lib.f.a.i("Tinker.LoadLibrary", "before hack classloader:" + paramApplicationLike.toString(), new Object[0]);
    try
    {
      localObject = a.class.getDeclaredMethod("a", new Class[] { ClassLoader.class, File.class });
      ((Method)localObject).setAccessible(true);
      ((Method)localObject).invoke(null, new Object[] { paramApplicationLike, paramString });
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.tinker.lib.f.a.e("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + paramString + ", thr: " + localThrowable, new Object[0]);
      return false;
    }
    finally
    {
      com.tencent.tinker.lib.f.a.i("Tinker.LoadLibrary", "after hack classloader:" + paramApplicationLike.toString(), new Object[0]);
    }
  }
  
  private static final class a {}
  
  private static final class b {}
  
  private static final class c
  {
    static void d(ClassLoader paramClassLoader, File paramFile)
    {
      paramFile = paramFile.getPath();
      Field localField = ShareReflectUtil.b(paramClassLoader, "libPath");
      Object localObject1 = ((String)localField.get(paramClassLoader)).split(":");
      Object localObject2 = new StringBuilder(paramFile);
      int j = localObject1.length;
      int i = 0;
      while (i < j)
      {
        Object localObject3 = localObject1[i];
        if ((localObject3 != null) && (!paramFile.equals(localObject3))) {
          ((StringBuilder)localObject2).append(':').append((String)localObject3);
        }
        i += 1;
      }
      localField.set(paramClassLoader, ((StringBuilder)localObject2).toString());
      localField = ShareReflectUtil.b(paramClassLoader, "libraryPathElements");
      localObject1 = (List)localField.get(paramClassLoader);
      localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext()) {
        if (paramFile.equals((String)((Iterator)localObject2).next())) {
          ((Iterator)localObject2).remove();
        }
      }
      ((List)localObject1).add(0, paramFile);
      localField.set(paramClassLoader, localObject1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/lib/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */