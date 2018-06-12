package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class d
{
  static String aRi = null;
  static int aRj = 0;
  static int aRk = 0;
  static int aRl = 0;
  PendingIntent aQC;
  Messenger aQG;
  Map<String, Object> aRm = new HashMap();
  Messenger aRn;
  MessengerCompat aRo;
  long aRp;
  long aRq;
  int aRr;
  int aRs;
  long aRt;
  Context context;
  
  public d(Context paramContext)
  {
    this.context = paramContext;
  }
  
  /* Error */
  private static String a(java.security.KeyPair paramKeyPair, String... paramVarArgs)
  {
    // Byte code:
    //   0: ldc 58
    //   2: aload_1
    //   3: invokestatic 64	android/text/TextUtils:join	(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //   6: ldc 66
    //   8: invokevirtual 72	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   11: astore_1
    //   12: aload_0
    //   13: invokevirtual 78	java/security/KeyPair:getPrivate	()Ljava/security/PrivateKey;
    //   16: astore_2
    //   17: aload_2
    //   18: instanceof 80
    //   21: ifeq +29 -> 50
    //   24: ldc 82
    //   26: astore_0
    //   27: aload_0
    //   28: invokestatic 88	java/security/Signature:getInstance	(Ljava/lang/String;)Ljava/security/Signature;
    //   31: astore_0
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual 92	java/security/Signature:initSign	(Ljava/security/PrivateKey;)V
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual 96	java/security/Signature:update	([B)V
    //   42: aload_0
    //   43: invokevirtual 100	java/security/Signature:sign	()[B
    //   46: invokestatic 106	com/google/android/gms/iid/a:j	([B)Ljava/lang/String;
    //   49: areturn
    //   50: ldc 108
    //   52: astore_0
    //   53: goto -26 -> 27
    //   56: astore_0
    //   57: aconst_null
    //   58: areturn
    //   59: astore_0
    //   60: aconst_null
    //   61: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	paramKeyPair	java.security.KeyPair
    //   0	62	1	paramVarArgs	String[]
    //   16	18	2	localPrivateKey	java.security.PrivateKey
    // Exception table:
    //   from	to	target	type
    //   12	24	56	java/security/GeneralSecurityException
    //   27	50	56	java/security/GeneralSecurityException
    //   0	12	59	java/io/UnsupportedEncodingException
  }
  
  private void aj(Object paramObject)
  {
    synchronized (getClass())
    {
      Iterator localIterator = this.aRm.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = this.aRm.get(str);
        this.aRm.put(str, paramObject);
        k(localObject, paramObject);
      }
    }
  }
  
  public static String aq(Context paramContext)
  {
    if (aRi != null) {
      return aRi;
    }
    aRj = Process.myUid();
    paramContext = paramContext.getPackageManager();
    Object localObject1 = paramContext.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (ResolveInfo)((Iterator)localObject1).next();
      if (paramContext.checkPermission("com.google.android.c2dm.permission.RECEIVE", ((ResolveInfo)localObject2).serviceInfo.packageName) == 0) {
        try
        {
          ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo(((ResolveInfo)localObject2).serviceInfo.packageName, 0);
          new StringBuilder("Found ").append(localApplicationInfo.uid);
          aRk = localApplicationInfo.uid;
          localObject2 = ((ResolveInfo)localObject2).serviceInfo.packageName;
          aRi = (String)localObject2;
          return (String)localObject2;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2) {}
      } else {
        new StringBuilder("Possible malicious package ").append(localNameNotFoundException2.serviceInfo.packageName).append(" declares com.google.android.c2dm.intent.REGISTER without permission");
      }
    }
    try
    {
      localObject1 = paramContext.getApplicationInfo("com.google.android.gms", 0);
      aRi = ((ApplicationInfo)localObject1).packageName;
      aRk = ((ApplicationInfo)localObject1).uid;
      localObject1 = aRi;
      return (String)localObject1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException1)
    {
      try
      {
        paramContext = paramContext.getApplicationInfo("com.google.android.gsf", 0);
        aRi = paramContext.packageName;
        aRk = paramContext.uid;
        paramContext = aRi;
        return paramContext;
      }
      catch (PackageManager.NameNotFoundException paramContext) {}
    }
    return null;
  }
  
  private void f(Intent paramIntent)
  {
    try
    {
      if (this.aQC == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.aQC = PendingIntent.getBroadcast(this.context, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.aQC);
      return;
    }
    finally {}
  }
  
  static String g(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    String str2 = paramIntent.getStringExtra("registration_id");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramIntent.getStringExtra("unregistered");
    }
    paramIntent.getLongExtra("Retry-After", 0L);
    if (str1 == null)
    {
      str1 = paramIntent.getStringExtra("error");
      if (str1 != null) {
        throw new IOException(str1);
      }
      new StringBuilder("Unexpected response from GCM ").append(paramIntent.getExtras());
      new Throwable();
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    return str1;
  }
  
  private void j(String paramString, Object paramObject)
  {
    synchronized (getClass())
    {
      Object localObject = this.aRm.get(paramString);
      this.aRm.put(paramString, paramObject);
      k(localObject, paramObject);
      return;
    }
  }
  
  private static void k(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 instanceof ConditionVariable)) {
      ((ConditionVariable)paramObject1).open();
    }
    Message localMessage;
    if ((paramObject1 instanceof Messenger))
    {
      paramObject1 = (Messenger)paramObject1;
      localMessage = Message.obtain();
      localMessage.obj = paramObject2;
    }
    try
    {
      ((Messenger)paramObject1).send(localMessage);
      return;
    }
    catch (RemoteException paramObject1)
    {
      new StringBuilder("Failed to send response ").append(paramObject1);
    }
  }
  
  public static String pR()
  {
    try
    {
      int i = aRl;
      aRl = i + 1;
      String str = Integer.toString(i);
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  final Intent a(android.os.Bundle arg1, java.security.KeyPair paramKeyPair)
  {
    // Byte code:
    //   0: new 290	android/os/ConditionVariable
    //   3: dup
    //   4: invokespecial 321	android/os/ConditionVariable:<init>	()V
    //   7: astore 7
    //   9: invokestatic 323	com/google/android/gms/iid/d:pR	()Ljava/lang/String;
    //   12: astore 6
    //   14: aload_0
    //   15: invokevirtual 114	java/lang/Object:getClass	()Ljava/lang/Class;
    //   18: astore 8
    //   20: aload 8
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 48	com/google/android/gms/iid/d:aRm	Ljava/util/Map;
    //   27: aload 6
    //   29: aload 7
    //   31: invokeinterface 144 3 0
    //   36: pop
    //   37: aload 8
    //   39: monitorexit
    //   40: invokestatic 329	android/os/SystemClock:elapsedRealtime	()J
    //   43: lstore_3
    //   44: aload_0
    //   45: getfield 331	com/google/android/gms/iid/d:aRt	J
    //   48: lconst_0
    //   49: lcmp
    //   50: ifeq +62 -> 112
    //   53: lload_3
    //   54: aload_0
    //   55: getfield 331	com/google/android/gms/iid/d:aRt	J
    //   58: lcmp
    //   59: ifgt +53 -> 112
    //   62: new 203	java/lang/StringBuilder
    //   65: dup
    //   66: ldc_w 333
    //   69: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_0
    //   73: getfield 331	com/google/android/gms/iid/d:aRt	J
    //   76: lload_3
    //   77: lsub
    //   78: invokevirtual 336	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   81: ldc_w 338
    //   84: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_0
    //   88: getfield 340	com/google/android/gms/iid/d:aRs	I
    //   91: invokevirtual 215	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: new 254	java/io/IOException
    //   98: dup
    //   99: ldc_w 342
    //   102: invokespecial 257	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   105: athrow
    //   106: astore_1
    //   107: aload 8
    //   109: monitorexit
    //   110: aload_1
    //   111: athrow
    //   112: aload_0
    //   113: getfield 344	com/google/android/gms/iid/d:aQG	Landroid/os/Messenger;
    //   116: ifnonnull +33 -> 149
    //   119: aload_0
    //   120: getfield 50	com/google/android/gms/iid/d:context	Landroid/content/Context;
    //   123: invokestatic 346	com/google/android/gms/iid/d:aq	(Landroid/content/Context;)Ljava/lang/String;
    //   126: pop
    //   127: aload_0
    //   128: new 295	android/os/Messenger
    //   131: dup
    //   132: new 348	com/google/android/gms/iid/d$1
    //   135: dup
    //   136: aload_0
    //   137: invokestatic 354	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   140: invokespecial 357	com/google/android/gms/iid/d$1:<init>	(Lcom/google/android/gms/iid/d;Landroid/os/Looper;)V
    //   143: invokespecial 360	android/os/Messenger:<init>	(Landroid/os/Handler;)V
    //   146: putfield 344	com/google/android/gms/iid/d:aQG	Landroid/os/Messenger;
    //   149: getstatic 32	com/google/android/gms/iid/d:aRi	Ljava/lang/String;
    //   152: ifnonnull +14 -> 166
    //   155: new 254	java/io/IOException
    //   158: dup
    //   159: ldc_w 362
    //   162: invokespecial 257	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   165: athrow
    //   166: aload_0
    //   167: invokestatic 329	android/os/SystemClock:elapsedRealtime	()J
    //   170: putfield 364	com/google/android/gms/iid/d:aRp	J
    //   173: new 166	android/content/Intent
    //   176: dup
    //   177: ldc -88
    //   179: invokespecial 171	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   182: astore 8
    //   184: aload 8
    //   186: getstatic 32	com/google/android/gms/iid/d:aRi	Ljava/lang/String;
    //   189: invokevirtual 238	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   192: pop
    //   193: aload_1
    //   194: ldc_w 366
    //   197: aload_0
    //   198: getfield 50	com/google/android/gms/iid/d:context	Landroid/content/Context;
    //   201: invokestatic 372	com/google/android/gms/gcm/a:am	(Landroid/content/Context;)I
    //   204: invokestatic 319	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   207: invokevirtual 378	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: aload_1
    //   211: ldc_w 380
    //   214: getstatic 385	android/os/Build$VERSION:SDK_INT	I
    //   217: invokestatic 319	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   220: invokevirtual 378	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   223: aload_1
    //   224: ldc_w 387
    //   227: aload_0
    //   228: getfield 50	com/google/android/gms/iid/d:context	Landroid/content/Context;
    //   231: invokestatic 390	com/google/android/gms/iid/a:an	(Landroid/content/Context;)I
    //   234: invokestatic 319	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   237: invokevirtual 378	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: aload_1
    //   241: ldc_w 392
    //   244: ldc_w 394
    //   247: invokevirtual 378	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: aload_1
    //   251: ldc_w 396
    //   254: aload_2
    //   255: invokestatic 399	com/google/android/gms/iid/a:a	(Ljava/security/KeyPair;)Ljava/lang/String;
    //   258: invokevirtual 378	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload_2
    //   262: invokevirtual 403	java/security/KeyPair:getPublic	()Ljava/security/PublicKey;
    //   265: invokeinterface 408 1 0
    //   270: invokestatic 106	com/google/android/gms/iid/a:j	([B)Ljava/lang/String;
    //   273: astore 9
    //   275: aload_1
    //   276: ldc_w 410
    //   279: aload 9
    //   281: invokevirtual 378	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   284: aload_1
    //   285: ldc_w 412
    //   288: aload_2
    //   289: iconst_2
    //   290: anewarray 68	java/lang/String
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: getfield 50	com/google/android/gms/iid/d:context	Landroid/content/Context;
    //   299: invokevirtual 415	android/content/Context:getPackageName	()Ljava/lang/String;
    //   302: aastore
    //   303: dup
    //   304: iconst_1
    //   305: aload 9
    //   307: aastore
    //   308: invokestatic 417	com/google/android/gms/iid/d:a	(Ljava/security/KeyPair;[Ljava/lang/String;)Ljava/lang/String;
    //   311: invokevirtual 378	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   314: aload 8
    //   316: aload_1
    //   317: invokevirtual 421	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   320: pop
    //   321: aload_0
    //   322: aload 8
    //   324: invokespecial 423	com/google/android/gms/iid/d:f	(Landroid/content/Intent;)V
    //   327: aload_0
    //   328: invokestatic 329	android/os/SystemClock:elapsedRealtime	()J
    //   331: putfield 364	com/google/android/gms/iid/d:aRp	J
    //   334: aload 8
    //   336: ldc_w 425
    //   339: new 203	java/lang/StringBuilder
    //   342: dup
    //   343: ldc_w 427
    //   346: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   349: aload 6
    //   351: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: ldc_w 429
    //   357: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: invokevirtual 431	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   363: invokevirtual 434	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   366: pop
    //   367: aload 8
    //   369: ldc_w 436
    //   372: new 203	java/lang/StringBuilder
    //   375: dup
    //   376: ldc_w 427
    //   379: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   382: aload 6
    //   384: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: ldc_w 429
    //   390: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: invokevirtual 431	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   396: invokevirtual 434	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   399: pop
    //   400: ldc -29
    //   402: getstatic 32	com/google/android/gms/iid/d:aRi	Ljava/lang/String;
    //   405: invokevirtual 440	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   408: istore 5
    //   410: aload 8
    //   412: ldc_w 442
    //   415: invokevirtual 263	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   418: astore_1
    //   419: aload_1
    //   420: ifnull +12 -> 432
    //   423: ldc_w 394
    //   426: aload_1
    //   427: invokevirtual 440	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   430: istore 5
    //   432: ldc_w 444
    //   435: iconst_3
    //   436: invokestatic 450	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   439: ifeq +22 -> 461
    //   442: new 203	java/lang/StringBuilder
    //   445: dup
    //   446: ldc_w 452
    //   449: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   452: aload 8
    //   454: invokevirtual 279	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   457: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: aload_0
    //   462: getfield 454	com/google/android/gms/iid/d:aRn	Landroid/os/Messenger;
    //   465: ifnull +87 -> 552
    //   468: aload 8
    //   470: ldc_w 456
    //   473: aload_0
    //   474: getfield 344	com/google/android/gms/iid/d:aQG	Landroid/os/Messenger;
    //   477: invokevirtual 250	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   480: pop
    //   481: invokestatic 301	android/os/Message:obtain	()Landroid/os/Message;
    //   484: astore_1
    //   485: aload_1
    //   486: aload 8
    //   488: putfield 305	android/os/Message:obj	Ljava/lang/Object;
    //   491: aload_0
    //   492: getfield 454	com/google/android/gms/iid/d:aRn	Landroid/os/Messenger;
    //   495: aload_1
    //   496: invokevirtual 309	android/os/Messenger:send	(Landroid/os/Message;)V
    //   499: aload 7
    //   501: ldc2_w 457
    //   504: invokevirtual 462	android/os/ConditionVariable:block	(J)Z
    //   507: pop
    //   508: aload_0
    //   509: invokevirtual 114	java/lang/Object:getClass	()Ljava/lang/Class;
    //   512: astore_1
    //   513: aload_1
    //   514: monitorenter
    //   515: aload_0
    //   516: getfield 48	com/google/android/gms/iid/d:aRm	Ljava/util/Map;
    //   519: aload 6
    //   521: invokeinterface 465 2 0
    //   526: astore_2
    //   527: aload_2
    //   528: instanceof 166
    //   531: ifeq +171 -> 702
    //   534: aload_2
    //   535: checkcast 166	android/content/Intent
    //   538: astore_2
    //   539: aload_1
    //   540: monitorexit
    //   541: aload_2
    //   542: areturn
    //   543: astore_1
    //   544: ldc_w 444
    //   547: iconst_3
    //   548: invokestatic 450	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   551: pop
    //   552: iload 5
    //   554: ifeq +48 -> 602
    //   557: new 166	android/content/Intent
    //   560: dup
    //   561: ldc_w 467
    //   564: invokespecial 171	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   567: astore_1
    //   568: aload_1
    //   569: aload_0
    //   570: getfield 50	com/google/android/gms/iid/d:context	Landroid/content/Context;
    //   573: invokevirtual 415	android/content/Context:getPackageName	()Ljava/lang/String;
    //   576: invokevirtual 238	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   579: pop
    //   580: aload_1
    //   581: ldc_w 469
    //   584: aload 8
    //   586: invokevirtual 250	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   589: pop
    //   590: aload_0
    //   591: getfield 50	com/google/android/gms/iid/d:context	Landroid/content/Context;
    //   594: aload_1
    //   595: invokevirtual 473	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   598: pop
    //   599: goto -100 -> 499
    //   602: aload 8
    //   604: ldc_w 456
    //   607: aload_0
    //   608: getfield 344	com/google/android/gms/iid/d:aQG	Landroid/os/Messenger;
    //   611: invokevirtual 250	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   614: pop
    //   615: aload 8
    //   617: ldc_w 475
    //   620: ldc_w 394
    //   623: invokevirtual 434	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   626: pop
    //   627: aload_0
    //   628: getfield 477	com/google/android/gms/iid/d:aRo	Lcom/google/android/gms/iid/MessengerCompat;
    //   631: ifnull +45 -> 676
    //   634: invokestatic 301	android/os/Message:obtain	()Landroid/os/Message;
    //   637: astore_1
    //   638: aload_1
    //   639: aload 8
    //   641: putfield 305	android/os/Message:obj	Ljava/lang/Object;
    //   644: aload_0
    //   645: getfield 477	com/google/android/gms/iid/d:aRo	Lcom/google/android/gms/iid/MessengerCompat;
    //   648: astore_2
    //   649: aload_2
    //   650: getfield 482	com/google/android/gms/iid/MessengerCompat:aRf	Landroid/os/Messenger;
    //   653: ifnull +36 -> 689
    //   656: aload_2
    //   657: getfield 482	com/google/android/gms/iid/MessengerCompat:aRf	Landroid/os/Messenger;
    //   660: aload_1
    //   661: invokevirtual 309	android/os/Messenger:send	(Landroid/os/Message;)V
    //   664: goto -165 -> 499
    //   667: astore_1
    //   668: ldc_w 444
    //   671: iconst_3
    //   672: invokestatic 450	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   675: pop
    //   676: aload_0
    //   677: getfield 50	com/google/android/gms/iid/d:context	Landroid/content/Context;
    //   680: aload 8
    //   682: invokevirtual 473	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   685: pop
    //   686: goto -187 -> 499
    //   689: aload_2
    //   690: getfield 486	com/google/android/gms/iid/MessengerCompat:aRg	Lcom/google/android/gms/iid/c;
    //   693: aload_1
    //   694: invokeinterface 489 2 0
    //   699: goto -200 -> 499
    //   702: aload_2
    //   703: instanceof 68
    //   706: ifeq +20 -> 726
    //   709: new 254	java/io/IOException
    //   712: dup
    //   713: aload_2
    //   714: checkcast 68	java/lang/String
    //   717: invokespecial 257	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   720: athrow
    //   721: astore_2
    //   722: aload_1
    //   723: monitorexit
    //   724: aload_2
    //   725: athrow
    //   726: new 203	java/lang/StringBuilder
    //   729: dup
    //   730: ldc_w 491
    //   733: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   736: aload_2
    //   737: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   740: pop
    //   741: new 254	java/io/IOException
    //   744: dup
    //   745: ldc_w 493
    //   748: invokespecial 257	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   751: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	752	0	this	d
    //   0	752	2	paramKeyPair	java.security.KeyPair
    //   43	34	3	l	long
    //   408	145	5	bool	boolean
    //   12	508	6	str1	String
    //   7	493	7	localConditionVariable	ConditionVariable
    //   18	663	8	localObject	Object
    //   273	33	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   23	40	106	finally
    //   107	110	106	finally
    //   491	499	543	android/os/RemoteException
    //   644	664	667	android/os/RemoteException
    //   689	699	667	android/os/RemoteException
    //   515	541	721	finally
    //   702	721	721	finally
    //   722	724	721	finally
    //   726	752	721	finally
  }
  
  final void h(Intent paramIntent)
  {
    if (paramIntent == null) {
      Log.isLoggable("InstanceID/Rpc", 3);
    }
    do
    {
      return;
      localObject1 = paramIntent.getAction();
      if (("com.google.android.c2dm.intent.REGISTRATION".equals(localObject1)) || ("com.google.android.gms.iid.InstanceID".equals(localObject1))) {
        break;
      }
    } while (!Log.isLoggable("InstanceID/Rpc", 3));
    new StringBuilder("Unexpected response ").append(paramIntent.getAction());
    return;
    Object localObject1 = paramIntent.getStringExtra("registration_id");
    if (localObject1 == null) {
      localObject1 = paramIntent.getStringExtra("unregistered");
    }
    for (;;)
    {
      Object localObject3;
      if (localObject1 == null)
      {
        String str = paramIntent.getStringExtra("error");
        if (str == null)
        {
          new StringBuilder("Unexpected response, no error or registration id ").append(paramIntent.getExtras());
          return;
        }
        Log.isLoggable("InstanceID/Rpc", 3);
        localObject2 = null;
        localObject3 = null;
        localObject1 = str;
        if (str.startsWith("|"))
        {
          localObject1 = str.split("\\|");
          "ID".equals(localObject1[1]);
          if (localObject1.length > 2)
          {
            localObject3 = localObject1[2];
            str = localObject1[3];
            localObject2 = localObject3;
            localObject1 = str;
            if (str.startsWith(":"))
            {
              localObject1 = str.substring(1);
              localObject2 = localObject3;
            }
            paramIntent.putExtra("error", (String)localObject1);
          }
        }
        else
        {
          if (localObject2 != null) {
            break label328;
          }
          aj(localObject1);
        }
        for (;;)
        {
          long l = paramIntent.getLongExtra("Retry-After", 0L);
          if (l <= 0L) {
            break label339;
          }
          this.aRq = SystemClock.elapsedRealtime();
          this.aRs = ((int)l * 1000);
          this.aRt = (SystemClock.elapsedRealtime() + this.aRs);
          new StringBuilder("Explicit request from server to backoff: ").append(this.aRs);
          return;
          localObject1 = "UNKNOWN";
          localObject2 = localObject3;
          break;
          label328:
          j((String)localObject2, localObject1);
        }
        label339:
        if (((!"SERVICE_NOT_AVAILABLE".equals(localObject1)) && (!"AUTHENTICATION_FAILED".equals(localObject1))) || (!"com.google.android.gsf".equals(aRi))) {
          break;
        }
        this.aRr += 1;
        if (this.aRr < 3) {
          break;
        }
        if (this.aRr == 3) {
          this.aRs = (new Random().nextInt(1000) + 1000);
        }
        this.aRs *= 2;
        this.aRt = (SystemClock.elapsedRealtime() + this.aRs);
        new StringBuilder("Backoff due to ").append((String)localObject1).append(" for ").append(this.aRs);
        return;
      }
      this.aRp = SystemClock.elapsedRealtime();
      this.aRt = 0L;
      this.aRr = 0;
      this.aRs = 0;
      if (Log.isLoggable("InstanceID/Rpc", 3)) {
        new StringBuilder("AppIDResponse: ").append((String)localObject1).append(" ").append(paramIntent.getExtras());
      }
      Object localObject2 = null;
      if (((String)localObject1).startsWith("|"))
      {
        localObject1 = ((String)localObject1).split("\\|");
        "ID".equals(localObject1[1]);
        localObject2 = localObject1[2];
        if (localObject1.length > 4)
        {
          if (!"SYNC".equals(localObject1[3])) {
            break label655;
          }
          InstanceIDListenerService.ap(this.context);
        }
      }
      label655:
      while (!"RST".equals(localObject1[3]))
      {
        localObject3 = localObject1[(localObject1.length - 1)];
        localObject1 = localObject3;
        if (((String)localObject3).startsWith(":")) {
          localObject1 = ((String)localObject3).substring(1);
        }
        paramIntent.putExtra("registration_id", (String)localObject1);
        if (localObject2 != null) {
          break;
        }
        aj(paramIntent);
        return;
      }
      localObject1 = this.context;
      a.ao(this.context);
      InstanceIDListenerService.a((Context)localObject1, a.pN());
      paramIntent.removeExtra("registration_id");
      j((String)localObject2, paramIntent);
      return;
      j((String)localObject2, paramIntent);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/iid/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */