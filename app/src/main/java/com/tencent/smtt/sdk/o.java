package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class o
{
  static boolean a = false;
  private static o c = null;
  private static int f = 0;
  private static int g = 0;
  private static int h = 3;
  private static String j = null;
  private bi b = null;
  private boolean d = false;
  private boolean e = false;
  private File i = null;
  
  public static o a(boolean paramBoolean)
  {
    if ((c == null) && (paramBoolean)) {}
    try
    {
      if (c == null) {
        c = new o();
      }
      return c;
    }
    finally {}
  }
  
  static void a(int paramInt)
  {
    f = paramInt;
  }
  
  private void b(int paramInt)
  {
    Properties localProperties = new Properties();
    localProperties.setProperty(j, String.valueOf(paramInt));
    try
    {
      localProperties.store(new FileOutputStream(new File(this.i, "count.prop")), null);
      return;
    }
    catch (IOException localIOException) {}catch (FileNotFoundException localFileNotFoundException) {}
  }
  
  public static int d()
  {
    return f;
  }
  
  /* Error */
  private int i()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 70	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: getfield 46	com/tencent/smtt/sdk/o:i	Ljava/io/File;
    //   10: ldc 72
    //   12: invokespecial 75	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual 89	java/io/File:exists	()Z
    //   20: ifne +5 -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: new 91	java/io/BufferedInputStream
    //   28: dup
    //   29: new 93	java/io/FileInputStream
    //   32: dup
    //   33: aload_2
    //   34: invokespecial 94	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: invokespecial 97	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   40: astore_2
    //   41: new 55	java/util/Properties
    //   44: dup
    //   45: invokespecial 56	java/util/Properties:<init>	()V
    //   48: astore_3
    //   49: aload_3
    //   50: aload_2
    //   51: invokevirtual 100	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   54: aload_3
    //   55: getstatic 34	com/tencent/smtt/sdk/o:j	Ljava/lang/String;
    //   58: ldc 102
    //   60: invokevirtual 106	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   63: invokestatic 111	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   66: invokevirtual 114	java/lang/Integer:intValue	()I
    //   69: istore_1
    //   70: aload_2
    //   71: invokevirtual 117	java/io/BufferedInputStream:close	()V
    //   74: iload_1
    //   75: ireturn
    //   76: astore_2
    //   77: iload_1
    //   78: ireturn
    //   79: astore_2
    //   80: aconst_null
    //   81: astore_2
    //   82: aload_2
    //   83: ifnull +41 -> 124
    //   86: aload_2
    //   87: invokevirtual 117	java/io/BufferedInputStream:close	()V
    //   90: iconst_0
    //   91: ireturn
    //   92: astore_2
    //   93: iconst_0
    //   94: ireturn
    //   95: astore_2
    //   96: aload_3
    //   97: ifnull +7 -> 104
    //   100: aload_3
    //   101: invokevirtual 117	java/io/BufferedInputStream:close	()V
    //   104: aload_2
    //   105: athrow
    //   106: astore_3
    //   107: goto -3 -> 104
    //   110: astore 4
    //   112: aload_2
    //   113: astore_3
    //   114: aload 4
    //   116: astore_2
    //   117: goto -21 -> 96
    //   120: astore_3
    //   121: goto -39 -> 82
    //   124: iconst_0
    //   125: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	o
    //   69	9	1	k	int
    //   15	56	2	localObject1	Object
    //   76	1	2	localIOException1	IOException
    //   79	1	2	localException1	Exception
    //   81	6	2	localObject2	Object
    //   92	1	2	localIOException2	IOException
    //   95	18	2	localObject3	Object
    //   116	1	2	localObject4	Object
    //   1	100	3	localProperties	Properties
    //   106	1	3	localIOException3	IOException
    //   113	1	3	localObject5	Object
    //   120	1	3	localException2	Exception
    //   110	5	4	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   70	74	76	java/io/IOException
    //   2	23	79	java/lang/Exception
    //   25	41	79	java/lang/Exception
    //   86	90	92	java/io/IOException
    //   2	23	95	finally
    //   25	41	95	finally
    //   100	104	106	java/io/IOException
    //   41	70	110	finally
    //   41	70	120	java/lang/Exception
  }
  
  public bi a()
  {
    if (this.d) {
      return this.b;
    }
    return null;
  }
  
  public void a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, am paramam)
  {
    boolean bool2;
    label265:
    label285:
    Object localObject3;
    label452:
    label473:
    label488:
    Object localObject4;
    for (;;)
    {
      try
      {
        TbsLog.addLog(999, null, new Object[0]);
        TbsLog.initIfNeed(paramContext);
        TbsLog.i("SDKEngine", "init -- context: " + paramContext + ", isPreIniting: " + paramBoolean2);
        g += 1;
        if (paramam != null)
        {
          if (g == 1)
          {
            bool1 = true;
            paramam.b = bool1;
          }
        }
        else
        {
          TbsCoreLoadStat.getInstance().a();
          if (paramam != null) {
            paramam.a("tbs_rename_task", (byte)1);
          }
          localObject1 = an.a();
          if (g != 1) {
            continue;
          }
          bool1 = true;
          ((an)localObject1).b(paramContext, bool1);
          an.a().k(paramContext);
          if (paramam != null) {
            paramam.a("tbs_rename_task", (byte)2);
          }
          TbsShareManager.forceToLoadX5ForThirdApp(paramContext, true);
          if (paramam != null) {
            paramam.a("can_load_x5", (byte)1);
          }
          bool2 = QbSdk.a(paramContext, paramBoolean1, paramBoolean2);
          if (paramam != null) {
            paramam.a("can_load_x5", (byte)2);
          }
          if (Build.VERSION.SDK_INT < 7) {
            continue;
          }
          paramBoolean2 = true;
          break label761;
          bool1 = paramBoolean1;
          if (paramBoolean1)
          {
            long l = System.currentTimeMillis();
            bool1 = an.a().c(paramContext, d());
            TbsLog.i("SDKEngine", "isTbsCoreLegal: " + bool1 + "; cost: " + (System.currentTimeMillis() - l));
          }
          if (!bool1) {
            break label653;
          }
          paramBoolean1 = this.d;
          if (!paramBoolean1) {
            continue;
          }
          return;
        }
        boolean bool1 = false;
        continue;
        bool1 = false;
        continue;
        paramBoolean2 = false;
        break label761;
        paramBoolean1 = false;
        continue;
        try
        {
          if (!TbsShareManager.isThirdPartyApp(paramContext)) {
            break;
          }
          TbsLog.addLog(995, null, new Object[0]);
          if (paramam != null) {
            paramam.a("read_core_info", (byte)1);
          }
          paramBoolean1 = TbsShareManager.j(paramContext);
          if (paramam != null) {
            paramam.a("read_core_info", (byte)2);
          }
          if (!paramBoolean1) {
            break label473;
          }
          localObject3 = new File(TbsShareManager.c(paramContext));
          localObject2 = an.a().q(paramContext);
          localObject1 = TbsShareManager.e(paramContext);
          if (localObject2 != null) {
            break label775;
          }
          this.d = false;
          QbSdk.a(paramContext, "SDKEngine::useSystemWebView by error_tbs_core_dexopt_dir null!");
        }
        catch (Throwable paramam)
        {
          TbsLog.e("SDKEngine", "useSystemWebView by exception: " + paramam);
          TbsCoreLoadStat.getInstance().a(paramContext, 327, paramam);
          this.d = false;
          QbSdk.a(paramContext, "SDKEngine::useSystemWebView by exception: " + paramam);
        }
        this.i = an.s(paramContext);
        this.e = true;
        continue;
        this.d = false;
      }
      finally {}
      QbSdk.a(paramContext, "SDKEngine::useSystemWebView by error_host_unavailable");
      continue;
      localObject4 = QbSdk.getDexLoaderFileList(paramContext, (Context)localObject1, ((File)localObject3).getAbsolutePath());
      if (TbsShareManager.getHostCorePathAppDefined() == null) {
        break label643;
      }
      localObject2 = TbsShareManager.getHostCorePathAppDefined();
      label512:
      TbsLog.i("SDKEngine", "SDKEngine init optDir is " + (String)localObject2);
      this.b = new bi(paramContext, (Context)localObject1, ((File)localObject3).getAbsolutePath(), (String)localObject2, (String[])localObject4, QbSdk.d, paramam);
      this.d = true;
    }
    TbsLog.addLog(996, null, new Object[0]);
    Object localObject2 = an.a().q(paramContext);
    label612:
    int k;
    if (f != 25436)
    {
      if (f != 25437) {
        break label784;
      }
      break label778;
      if (k == 0) {
        break label790;
      }
    }
    label643:
    label653:
    label761:
    label775:
    label778:
    label784:
    label790:
    for (Object localObject1 = paramContext.getApplicationContext();; localObject1 = paramContext)
    {
      if (localObject2 == null)
      {
        this.d = false;
        QbSdk.a(paramContext, "SDKEngine::useSystemWebView by tbs_core_share_dir null!");
        break label265;
        localObject2 = ((File)localObject2).getAbsolutePath();
        break label512;
        paramam = "can_load_x5=" + bool2 + "; is_compatible=" + paramBoolean2;
        TbsLog.e("SDKEngine", "SDKEngine.init canLoadTbs=false; failure: " + paramam);
        if ((QbSdk.a) && (this.d)) {
          break label452;
        }
        this.d = false;
        TbsCoreLoadStat.getInstance().a(paramContext, 405, new Throwable(paramam));
        break label452;
      }
      localObject4 = localObject2;
      localObject3 = localObject2;
      localObject2 = localObject4;
      break label488;
      if ((!bool2) || (!paramBoolean2)) {
        break label285;
      }
      paramBoolean1 = true;
      break;
      break label488;
      k = 1;
      break label612;
      k = 0;
      break label612;
    }
  }
  
  void a(String paramString)
  {
    j = paramString;
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  boolean b(boolean paramBoolean)
  {
    a = paramBoolean;
    return paramBoolean;
  }
  
  bi c()
  {
    return this.b;
  }
  
  public String e()
  {
    if ((this.b == null) || (QbSdk.a)) {
      return "system webview get nothing...";
    }
    return this.b.a();
  }
  
  boolean f()
  {
    int k;
    if (a)
    {
      if (j == null) {
        return false;
      }
      k = i();
      if (k != 0) {
        break label32;
      }
      b(1);
    }
    for (;;)
    {
      return a;
      label32:
      if (k + 1 > h) {
        break;
      }
      b(k + 1);
    }
  }
  
  boolean g()
  {
    return this.e;
  }
  
  public boolean h()
  {
    return QbSdk.useSoftWare();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */