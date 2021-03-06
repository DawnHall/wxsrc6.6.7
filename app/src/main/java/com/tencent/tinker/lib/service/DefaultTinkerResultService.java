package com.tencent.tinker.lib.service;

import android.os.Process;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.lib.f.b;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;

public class DefaultTinkerResultService
  extends AbstractResultService
{
  public static void ab(File paramFile)
  {
    if (!SharePatchFileUtil.ah(paramFile)) {}
    Object localObject;
    do
    {
      return;
      com.tencent.tinker.lib.f.a.w("Tinker.DefaultTinkerResultService", "deleteRawPatchFile rawFile path: %s", new Object[] { paramFile.getPath() });
      localObject = paramFile.getName();
      if ((!((String)localObject).startsWith("patch-")) || (!((String)localObject).endsWith(".apk")))
      {
        SharePatchFileUtil.aj(paramFile);
        return;
      }
      localObject = paramFile.getParentFile();
      if (!((File)localObject).getName().startsWith("patch-"))
      {
        SharePatchFileUtil.aj(paramFile);
        return;
      }
    } while (((File)localObject).getParentFile().getName().equals("tinker"));
    SharePatchFileUtil.aj(paramFile);
  }
  
  public void a(a parama)
  {
    if (parama == null) {
      com.tencent.tinker.lib.f.a.e("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received null result!!!!", new Object[0]);
    }
    do
    {
      return;
      com.tencent.tinker.lib.f.a.i("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received a result:%s ", new Object[] { parama.toString() });
      b.hM(getApplicationContext());
    } while (!parama.bLW);
    ab(new File(parama.vso));
    if (b(parama))
    {
      Process.killProcess(Process.myPid());
      return;
    }
    com.tencent.tinker.lib.f.a.i("Tinker.DefaultTinkerResultService", "I have already install the newly patch version!", new Object[0]);
  }
  
  public final boolean b(a parama)
  {
    Object localObject = com.tencent.tinker.lib.e.a.hL(getApplicationContext());
    if (((com.tencent.tinker.lib.e.a)localObject).vsE)
    {
      localObject = ((com.tencent.tinker.lib.e.a)localObject).vsD;
      if (localObject != null)
      {
        localObject = ((d)localObject).vsI;
        if ((parama.vsp != null) && (parama.vsp.equals(localObject))) {
          return false;
        }
      }
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tinker/lib/service/DefaultTinkerResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */