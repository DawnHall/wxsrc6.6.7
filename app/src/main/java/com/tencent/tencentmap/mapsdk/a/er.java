package com.tencent.tencentmap.mapsdk.a;

import android.text.TextUtils;

public final class er
{
  private static er a;
  private eq b;
  private es c = et.a();
  
  private er()
  {
    a(false);
  }
  
  public static er a()
  {
    try
    {
      if (a == null) {
        a = new er();
      }
      er localer = a;
      return localer;
    }
    finally {}
  }
  
  private void a(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        String str1 = fw.a();
        fx.a("AccessSchedulerStorageManager", "try updateCacheInfo...currentApn:" + str1);
        if ((TextUtils.isEmpty(str1)) || (str1.equals("unknown")))
        {
          fx.c("AccessSchedulerStorageManager", "updateCacheInfo failed... get current apn from ApnInfo:" + str1);
          return;
        }
        if ((this.b != null) && (this.b.b().equals(str1)) && (!paramBoolean)) {
          break label166;
        }
        this.b = this.c.a(str1);
        if (this.b != null)
        {
          fx.a("AccessSchedulerStorageManager", "cache succ for current apn:" + str1);
          continue;
        }
        fx.c("AccessSchedulerStorageManager", "cache failed for apn:" + str2);
      }
      finally {}
      continue;
      label166:
      fx.b("AccessSchedulerStorageManager", "same apn. no need update.");
    }
  }
  
  /* Error */
  public final eq.a a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: invokespecial 24	com/tencent/tencentmap/mapsdk/a/er:a	(Z)V
    //   7: aload_0
    //   8: getfield 75	com/tencent/tencentmap/mapsdk/a/er:b	Lcom/tencent/tencentmap/mapsdk/a/eq;
    //   11: ifnull +32 -> 43
    //   14: aload_0
    //   15: getfield 75	com/tencent/tencentmap/mapsdk/a/er:b	Lcom/tencent/tencentmap/mapsdk/a/eq;
    //   18: invokevirtual 79	com/tencent/tencentmap/mapsdk/a/eq:b	()Ljava/lang/String;
    //   21: invokestatic 34	com/tencent/tencentmap/mapsdk/a/fw:a	()Ljava/lang/String;
    //   24: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   27: ifeq +16 -> 43
    //   30: aload_0
    //   31: getfield 75	com/tencent/tencentmap/mapsdk/a/er:b	Lcom/tencent/tencentmap/mapsdk/a/eq;
    //   34: aload_1
    //   35: invokevirtual 95	com/tencent/tencentmap/mapsdk/a/eq:a	(Ljava/lang/String;)Lcom/tencent/tencentmap/mapsdk/a/eq$a;
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: areturn
    //   43: aconst_null
    //   44: astore_1
    //   45: goto -6 -> 39
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	er
    //   0	53	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   2	39	48	finally
  }
  
  /* Error */
  public final void a(eq parameq)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 36
    //   4: ldc 98
    //   6: invokestatic 92	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_1
    //   10: ifnonnull +13 -> 23
    //   13: ldc 36
    //   15: ldc 100
    //   17: invokestatic 73	com/tencent/tencentmap/mapsdk/a/fx:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: aload_1
    //   25: putfield 75	com/tencent/tencentmap/mapsdk/a/er:b	Lcom/tencent/tencentmap/mapsdk/a/eq;
    //   28: aload_0
    //   29: getfield 21	com/tencent/tencentmap/mapsdk/a/er:c	Lcom/tencent/tencentmap/mapsdk/a/es;
    //   32: aload_1
    //   33: invokeinterface 102 2 0
    //   38: goto -18 -> 20
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	er
    //   0	46	1	parameq	eq
    // Exception table:
    //   from	to	target	type
    //   2	9	41	finally
    //   13	20	41	finally
    //   23	38	41	finally
  }
  
  public final void a(String paramString, ep paramep)
  {
    String str = fw.a();
    if ((TextUtils.isEmpty(str)) || (str.equals("unknown")))
    {
      fx.c("AccessSchedulerStorageManager", "updateApnUserTime... failed with apnName:" + str);
      return;
    }
    this.c.a(str, paramString, paramep.c());
    a(true);
    fx.b("AccessSchedulerStorageManager", "updateApnUseTime... apnName:" + str);
  }
  
  /* Error */
  public final boolean a(java.util.Set paramSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 36
    //   4: ldc 117
    //   6: invokestatic 92	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_0
    //   10: iconst_0
    //   11: invokespecial 24	com/tencent/tencentmap/mapsdk/a/er:a	(Z)V
    //   14: aload_0
    //   15: getfield 75	com/tencent/tencentmap/mapsdk/a/er:b	Lcom/tencent/tencentmap/mapsdk/a/eq;
    //   18: ifnonnull +16 -> 34
    //   21: ldc 36
    //   23: ldc 119
    //   25: invokestatic 92	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: iconst_1
    //   29: istore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_2
    //   33: ireturn
    //   34: aload_0
    //   35: getfield 75	com/tencent/tencentmap/mapsdk/a/er:b	Lcom/tencent/tencentmap/mapsdk/a/eq;
    //   38: invokevirtual 122	com/tencent/tencentmap/mapsdk/a/eq:a	()Ljava/util/Map;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnonnull +15 -> 58
    //   46: ldc 36
    //   48: ldc 124
    //   50: invokestatic 92	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: iconst_1
    //   54: istore_2
    //   55: goto -25 -> 30
    //   58: aload_3
    //   59: invokeinterface 130 1 0
    //   64: aload_1
    //   65: invokeinterface 133 1 0
    //   70: if_icmpge +34 -> 104
    //   73: ldc 36
    //   75: new 38	java/lang/StringBuilder
    //   78: dup
    //   79: ldc -121
    //   81: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   84: aload_3
    //   85: invokeinterface 130 1 0
    //   90: invokevirtual 138	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   93: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: invokestatic 92	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: iconst_1
    //   100: istore_2
    //   101: goto -71 -> 30
    //   104: aload_1
    //   105: invokeinterface 142 1 0
    //   110: astore_1
    //   111: aload_1
    //   112: invokeinterface 148 1 0
    //   117: ifeq +72 -> 189
    //   120: aload_1
    //   121: invokeinterface 152 1 0
    //   126: checkcast 65	java/lang/String
    //   129: astore 4
    //   131: aload_3
    //   132: aload 4
    //   134: invokeinterface 156 2 0
    //   139: checkcast 158	com/tencent/tencentmap/mapsdk/a/eq$a
    //   142: astore 5
    //   144: aload 5
    //   146: ifnull +11 -> 157
    //   149: aload 5
    //   151: invokevirtual 161	com/tencent/tencentmap/mapsdk/a/eq$a:g	()Z
    //   154: ifeq -43 -> 111
    //   157: ldc 36
    //   159: new 38	java/lang/StringBuilder
    //   162: dup
    //   163: ldc -93
    //   165: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   168: aload 4
    //   170: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: ldc -91
    //   175: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: invokestatic 92	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   184: iconst_1
    //   185: istore_2
    //   186: goto -156 -> 30
    //   189: iconst_0
    //   190: istore_2
    //   191: goto -161 -> 30
    //   194: astore_1
    //   195: aload_0
    //   196: monitorexit
    //   197: aload_1
    //   198: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	this	er
    //   0	199	1	paramSet	java.util.Set
    //   29	162	2	bool	boolean
    //   41	91	3	localMap	java.util.Map
    //   129	40	4	str	String
    //   142	8	5	locala	eq.a
    // Exception table:
    //   from	to	target	type
    //   2	28	194	finally
    //   34	42	194	finally
    //   46	53	194	finally
    //   58	99	194	finally
    //   104	111	194	finally
    //   111	144	194	finally
    //   149	157	194	finally
    //   157	184	194	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */