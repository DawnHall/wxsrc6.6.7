package com.tencent.mm.memory;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends l
{
  private static int dvg = -1;
  
  /* Error */
  private static Bitmap a(java.io.InputStream paramInputStream, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: getstatic 24	com/tencent/mm/memory/h:dvb	Lcom/tencent/mm/memory/h;
    //   3: invokevirtual 28	com/tencent/mm/memory/h:bW	()Ljava/lang/Object;
    //   6: checkcast 30	java/nio/ByteBuffer
    //   9: astore 4
    //   11: aload_2
    //   12: astore 5
    //   14: aload_2
    //   15: ifnonnull +12 -> 27
    //   18: new 32	android/graphics/BitmapFactory$Options
    //   21: dup
    //   22: invokespecial 33	android/graphics/BitmapFactory$Options:<init>	()V
    //   25: astore 5
    //   27: aload 4
    //   29: ifnull +13 -> 42
    //   32: aload 5
    //   34: aload 4
    //   36: invokevirtual 37	java/nio/ByteBuffer:array	()[B
    //   39: putfield 41	android/graphics/BitmapFactory$Options:inTempStorage	[B
    //   42: aload 5
    //   44: iconst_1
    //   45: putfield 45	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   48: aload_0
    //   49: aconst_null
    //   50: aload 5
    //   52: iconst_0
    //   53: invokestatic 51	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;
    //   56: pop
    //   57: aload 5
    //   59: getfield 54	android/graphics/BitmapFactory$Options:outWidth	I
    //   62: iconst_m1
    //   63: if_icmpeq +12 -> 75
    //   66: aload 5
    //   68: getfield 57	android/graphics/BitmapFactory$Options:outHeight	I
    //   71: iconst_m1
    //   72: if_icmpne +49 -> 121
    //   75: new 59	java/lang/IllegalArgumentException
    //   78: dup
    //   79: ldc 61
    //   81: invokespecial 64	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   84: athrow
    //   85: astore_1
    //   86: aload 4
    //   88: astore_0
    //   89: ldc 66
    //   91: ldc 68
    //   93: iconst_1
    //   94: anewarray 70	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: aload_1
    //   100: invokevirtual 74	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   103: aastore
    //   104: invokestatic 80	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: aload_0
    //   108: ifnull +11 -> 119
    //   111: getstatic 24	com/tencent/mm/memory/h:dvb	Lcom/tencent/mm/memory/h;
    //   114: aload_0
    //   115: invokevirtual 84	com/tencent/mm/memory/h:j	(Ljava/lang/Object;)Z
    //   118: pop
    //   119: aconst_null
    //   120: areturn
    //   121: ldc 66
    //   123: ldc 86
    //   125: iconst_1
    //   126: anewarray 70	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload 5
    //   133: getfield 90	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   136: aastore
    //   137: invokestatic 93	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload 5
    //   142: iconst_1
    //   143: putfield 96	android/graphics/BitmapFactory$Options:inDither	Z
    //   146: aload 5
    //   148: iconst_1
    //   149: putfield 99	android/graphics/BitmapFactory$Options:inMutable	Z
    //   152: aload 5
    //   154: iconst_1
    //   155: putfield 102	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   158: aload 5
    //   160: iconst_1
    //   161: putfield 105	android/graphics/BitmapFactory$Options:inInputShareable	Z
    //   164: aload 5
    //   166: iconst_0
    //   167: putfield 45	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   170: aload 5
    //   172: invokestatic 111	com/tencent/mm/sdk/platformtools/c:c	(Landroid/graphics/BitmapFactory$Options;)V
    //   175: aload_0
    //   176: invokestatic 114	com/tencent/mm/memory/m:i	(Ljava/io/InputStream;)V
    //   179: aload_0
    //   180: aload_1
    //   181: aload 5
    //   183: aload_3
    //   184: invokestatic 117	com/tencent/mm/memory/m:b	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   187: astore_0
    //   188: aload 4
    //   190: ifnull +12 -> 202
    //   193: getstatic 24	com/tencent/mm/memory/h:dvb	Lcom/tencent/mm/memory/h;
    //   196: aload 4
    //   198: invokevirtual 84	com/tencent/mm/memory/h:j	(Ljava/lang/Object;)Z
    //   201: pop
    //   202: aload_0
    //   203: areturn
    //   204: astore_1
    //   205: aconst_null
    //   206: astore_0
    //   207: aload_0
    //   208: ifnull +11 -> 219
    //   211: getstatic 24	com/tencent/mm/memory/h:dvb	Lcom/tencent/mm/memory/h;
    //   214: aload_0
    //   215: invokevirtual 84	com/tencent/mm/memory/h:j	(Ljava/lang/Object;)Z
    //   218: pop
    //   219: aload_1
    //   220: athrow
    //   221: astore_1
    //   222: aload 4
    //   224: astore_0
    //   225: goto -18 -> 207
    //   228: astore_1
    //   229: goto -22 -> 207
    //   232: astore_1
    //   233: aconst_null
    //   234: astore_0
    //   235: goto -146 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	238	0	paramInputStream	java.io.InputStream
    //   0	238	1	paramRect	android.graphics.Rect
    //   0	238	2	paramOptions	android.graphics.BitmapFactory.Options
    //   0	238	3	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   9	214	4	localByteBuffer	java.nio.ByteBuffer
    //   12	170	5	localOptions	android.graphics.BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   18	27	85	java/lang/Exception
    //   32	42	85	java/lang/Exception
    //   42	75	85	java/lang/Exception
    //   75	85	85	java/lang/Exception
    //   121	188	85	java/lang/Exception
    //   0	11	204	finally
    //   18	27	221	finally
    //   32	42	221	finally
    //   42	75	221	finally
    //   75	85	221	finally
    //   121	188	221	finally
    //   89	107	228	finally
    //   0	11	232	java/lang/Exception
  }
  
  /* Error */
  private static Bitmap b(java.io.InputStream paramInputStream, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore 6
    //   3: aload_0
    //   4: ifnull +158 -> 162
    //   7: iload 6
    //   9: istore 5
    //   11: aload_0
    //   12: invokevirtual 123	java/io/InputStream:available	()I
    //   15: istore 4
    //   17: iload 4
    //   19: istore 5
    //   21: iload 4
    //   23: istore 6
    //   25: getstatic 129	com/tencent/mm/memory/g:dva	Lcom/tencent/mm/memory/g;
    //   28: iload 4
    //   30: invokestatic 135	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   33: invokevirtual 138	com/tencent/mm/memory/g:b	(Ljava/lang/Integer;)Ljava/lang/Object;
    //   36: checkcast 139	[B
    //   39: astore 9
    //   41: aload 9
    //   43: astore 7
    //   45: aload 9
    //   47: ifnonnull +13 -> 60
    //   50: aload 9
    //   52: astore 8
    //   54: iload 4
    //   56: newarray <illegal type>
    //   58: astore 7
    //   60: aload 7
    //   62: astore 8
    //   64: aload 7
    //   66: astore 9
    //   68: aload_0
    //   69: aload 7
    //   71: invokevirtual 143	java/io/InputStream:read	([B)I
    //   74: pop
    //   75: aload_1
    //   76: ifnonnull +63 -> 139
    //   79: aload 7
    //   81: astore 8
    //   83: aload 7
    //   85: astore 9
    //   87: aload 7
    //   89: iconst_0
    //   90: iload 4
    //   92: aload_2
    //   93: aload_3
    //   94: iconst_0
    //   95: iconst_0
    //   96: newarray <illegal type>
    //   98: invokestatic 147	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   101: astore_1
    //   102: aload 7
    //   104: astore 8
    //   106: aload 7
    //   108: astore 9
    //   110: aload_1
    //   111: invokestatic 151	com/tencent/mm/sdk/platformtools/MMBitmapFactory:pinBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   114: astore_1
    //   115: aload_0
    //   116: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   119: iload 4
    //   121: ifle +16 -> 137
    //   124: aload 7
    //   126: ifnull +11 -> 137
    //   129: getstatic 129	com/tencent/mm/memory/g:dva	Lcom/tencent/mm/memory/g;
    //   132: aload 7
    //   134: invokevirtual 160	com/tencent/mm/memory/g:F	([B)V
    //   137: aload_1
    //   138: areturn
    //   139: aload 7
    //   141: astore 8
    //   143: aload 7
    //   145: astore 9
    //   147: aload 7
    //   149: iconst_0
    //   150: iload 4
    //   152: aload_1
    //   153: aload_2
    //   154: aload_3
    //   155: invokestatic 164	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegion	([BIILandroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   158: astore_1
    //   159: goto -57 -> 102
    //   162: aload_0
    //   163: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   166: aconst_null
    //   167: areturn
    //   168: astore_2
    //   169: aconst_null
    //   170: astore_1
    //   171: iload 5
    //   173: istore 4
    //   175: ldc 66
    //   177: ldc -90
    //   179: iconst_1
    //   180: anewarray 70	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: aload_2
    //   186: invokevirtual 74	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   189: aastore
    //   190: invokestatic 80	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: aload_0
    //   194: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   197: iload 4
    //   199: ifle -33 -> 166
    //   202: aload_1
    //   203: ifnull -37 -> 166
    //   206: getstatic 129	com/tencent/mm/memory/g:dva	Lcom/tencent/mm/memory/g;
    //   209: aload_1
    //   210: invokevirtual 160	com/tencent/mm/memory/g:F	([B)V
    //   213: goto -47 -> 166
    //   216: astore_2
    //   217: aconst_null
    //   218: astore_1
    //   219: iload 6
    //   221: istore 4
    //   223: aload_0
    //   224: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   227: iload 4
    //   229: ifle +14 -> 243
    //   232: aload_1
    //   233: ifnull +10 -> 243
    //   236: getstatic 129	com/tencent/mm/memory/g:dva	Lcom/tencent/mm/memory/g;
    //   239: aload_1
    //   240: invokevirtual 160	com/tencent/mm/memory/g:F	([B)V
    //   243: aload_2
    //   244: athrow
    //   245: astore_2
    //   246: aload 8
    //   248: astore_1
    //   249: goto -26 -> 223
    //   252: astore_2
    //   253: goto -30 -> 223
    //   256: astore_2
    //   257: aload 9
    //   259: astore_1
    //   260: goto -85 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	paramInputStream	java.io.InputStream
    //   0	263	1	paramRect	android.graphics.Rect
    //   0	263	2	paramOptions	android.graphics.BitmapFactory.Options
    //   0	263	3	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   15	213	4	i	int
    //   9	163	5	j	int
    //   1	219	6	k	int
    //   43	105	7	localObject1	Object
    //   52	195	8	localObject2	Object
    //   39	219	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   11	17	168	java/lang/Exception
    //   25	41	168	java/lang/Exception
    //   11	17	216	finally
    //   25	41	216	finally
    //   54	60	245	finally
    //   68	75	245	finally
    //   87	102	245	finally
    //   110	115	245	finally
    //   147	159	245	finally
    //   175	193	252	finally
    //   54	60	256	java/lang/Exception
    //   68	75	256	java/lang/Exception
    //   87	102	256	java/lang/Exception
    //   110	115	256	java/lang/Exception
    //   147	159	256	java/lang/Exception
  }
  
  /* Error */
  public final Bitmap a(String paramString, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 173	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   4: astore 4
    //   6: aload 4
    //   8: astore_1
    //   9: aload 4
    //   11: aconst_null
    //   12: aload_2
    //   13: aload_3
    //   14: invokestatic 175	com/tencent/mm/memory/m:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   17: astore_2
    //   18: aload 4
    //   20: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   23: aload_2
    //   24: areturn
    //   25: astore_2
    //   26: aconst_null
    //   27: astore 4
    //   29: aload 4
    //   31: astore_1
    //   32: ldc 66
    //   34: ldc -79
    //   36: iconst_1
    //   37: anewarray 70	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_2
    //   43: invokevirtual 74	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   46: aastore
    //   47: invokestatic 80	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: aload 4
    //   52: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   55: aconst_null
    //   56: areturn
    //   57: astore_2
    //   58: aconst_null
    //   59: astore_1
    //   60: aload_1
    //   61: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   64: aload_2
    //   65: athrow
    //   66: astore_2
    //   67: goto -7 -> 60
    //   70: astore_2
    //   71: goto -42 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	m
    //   0	74	1	paramString	String
    //   0	74	2	paramOptions	android.graphics.BitmapFactory.Options
    //   0	74	3	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   4	47	4	localInputStream	java.io.InputStream
    // Exception table:
    //   from	to	target	type
    //   0	6	25	java/lang/Exception
    //   0	6	57	finally
    //   9	18	66	finally
    //   32	50	66	finally
    //   9	18	70	java/lang/Exception
  }
  
  /* Error */
  public final Bitmap a(String paramString, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 173	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   4: astore 5
    //   6: aload 5
    //   8: astore_1
    //   9: aload 5
    //   11: aload_2
    //   12: aload_3
    //   13: aload 4
    //   15: invokestatic 175	com/tencent/mm/memory/m:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   18: astore_2
    //   19: aload 5
    //   21: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   24: aload_2
    //   25: areturn
    //   26: astore_2
    //   27: aconst_null
    //   28: astore 5
    //   30: aload 5
    //   32: astore_1
    //   33: ldc 66
    //   35: ldc -79
    //   37: iconst_1
    //   38: anewarray 70	java/lang/Object
    //   41: dup
    //   42: iconst_0
    //   43: aload_2
    //   44: invokevirtual 74	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   47: aastore
    //   48: invokestatic 80	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: aload 5
    //   53: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   56: aconst_null
    //   57: areturn
    //   58: astore_2
    //   59: aconst_null
    //   60: astore_1
    //   61: aload_1
    //   62: invokestatic 156	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   65: aload_2
    //   66: athrow
    //   67: astore_2
    //   68: goto -7 -> 61
    //   71: astore_2
    //   72: goto -42 -> 30
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	m
    //   0	75	1	paramString	String
    //   0	75	2	paramRect	android.graphics.Rect
    //   0	75	3	paramOptions	android.graphics.BitmapFactory.Options
    //   0	75	4	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   4	48	5	localInputStream	java.io.InputStream
    // Exception table:
    //   from	to	target	type
    //   0	6	26	java/lang/Exception
    //   0	6	58	finally
    //   9	19	67	finally
    //   33	51	67	finally
    //   9	19	71	java/lang/Exception
  }
  
  public final void l(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {}
    try
    {
      if (!paramBitmap.isRecycled())
      {
        x.i("MicroMsg.PurgeableBitmapFactory", "bitmap recycle %s", new Object[] { paramBitmap.toString() });
        paramBitmap.recycle();
      }
      return;
    }
    catch (Exception paramBitmap)
    {
      x.e("MicroMsg.PurgeableBitmapFactory", "recycle error: %s", new Object[] { paramBitmap.getMessage() });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/memory/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */