package com.tencent.tinker.lib.c;

public class b
{
  public static int Ii(int paramInt)
  {
    if (paramInt == 3) {
      return -3;
    }
    if (paramInt == 5) {
      return -4;
    }
    if (paramInt == 6) {
      return -8;
    }
    return 0;
  }
  
  /* Error */
  public static boolean a(java.util.zip.ZipFile paramZipFile, java.util.zip.ZipEntry paramZipEntry, java.io.File paramFile, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: iconst_0
    //   4: istore 5
    //   6: iload 5
    //   8: iconst_2
    //   9: if_icmpge +235 -> 244
    //   12: iload 7
    //   14: ifne +230 -> 244
    //   17: ldc 11
    //   19: new 13	java/lang/StringBuilder
    //   22: dup
    //   23: ldc 15
    //   25: invokespecial 19	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload_2
    //   29: invokevirtual 25	java/io/File:getPath	()Ljava/lang/String;
    //   32: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 32	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: iconst_0
    //   39: anewarray 4	java/lang/Object
    //   42: invokestatic 38	com/tencent/tinker/lib/f/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: new 40	java/io/BufferedInputStream
    //   48: dup
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual 46	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   54: invokespecial 49	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   57: astore 8
    //   59: new 51	java/io/BufferedOutputStream
    //   62: dup
    //   63: new 53	java/io/FileOutputStream
    //   66: dup
    //   67: aload_2
    //   68: invokespecial 56	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   71: invokespecial 59	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   74: astore 9
    //   76: sipush 16384
    //   79: newarray <illegal type>
    //   81: astore 10
    //   83: aload 8
    //   85: aload 10
    //   87: invokevirtual 65	java/io/InputStream:read	([B)I
    //   90: istore 6
    //   92: iload 6
    //   94: ifle +33 -> 127
    //   97: aload 9
    //   99: aload 10
    //   101: iconst_0
    //   102: iload 6
    //   104: invokevirtual 71	java/io/OutputStream:write	([BII)V
    //   107: goto -24 -> 83
    //   110: astore_0
    //   111: aload 9
    //   113: astore_1
    //   114: aload 8
    //   116: astore_2
    //   117: aload_1
    //   118: invokestatic 77	com/tencent/tinker/c/b/a:ar	(Ljava/lang/Object;)V
    //   121: aload_2
    //   122: invokestatic 77	com/tencent/tinker/c/b/a:ar	(Ljava/lang/Object;)V
    //   125: aload_0
    //   126: athrow
    //   127: aload 9
    //   129: invokestatic 77	com/tencent/tinker/c/b/a:ar	(Ljava/lang/Object;)V
    //   132: aload 8
    //   134: invokestatic 77	com/tencent/tinker/c/b/a:ar	(Ljava/lang/Object;)V
    //   137: aload_3
    //   138: ifnull +100 -> 238
    //   141: iload 4
    //   143: ifeq +85 -> 228
    //   146: aload_2
    //   147: aload_3
    //   148: invokestatic 83	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:g	(Ljava/io/File;Ljava/lang/String;)Z
    //   151: istore 7
    //   153: ldc 11
    //   155: ldc 85
    //   157: iconst_1
    //   158: anewarray 4	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: iload 7
    //   165: invokestatic 91	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   168: aastore
    //   169: invokestatic 38	com/tencent/tinker/lib/f/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: iload 7
    //   174: ifne +45 -> 219
    //   177: aload_2
    //   178: invokevirtual 95	java/io/File:delete	()Z
    //   181: ifeq +10 -> 191
    //   184: aload_2
    //   185: invokevirtual 98	java/io/File:exists	()Z
    //   188: ifeq +31 -> 219
    //   191: ldc 11
    //   193: new 13	java/lang/StringBuilder
    //   196: dup
    //   197: ldc 100
    //   199: invokespecial 19	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: aload_2
    //   203: invokevirtual 25	java/io/File:getPath	()Ljava/lang/String;
    //   206: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 32	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: iconst_0
    //   213: anewarray 4	java/lang/Object
    //   216: invokestatic 103	com/tencent/tinker/lib/f/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: iload 5
    //   221: iconst_1
    //   222: iadd
    //   223: istore 5
    //   225: goto -219 -> 6
    //   228: aload_2
    //   229: aload_3
    //   230: invokestatic 106	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:f	(Ljava/io/File;Ljava/lang/String;)Z
    //   233: istore 7
    //   235: goto -82 -> 153
    //   238: iconst_1
    //   239: istore 7
    //   241: goto -88 -> 153
    //   244: iload 7
    //   246: ireturn
    //   247: astore_0
    //   248: aconst_null
    //   249: astore_1
    //   250: aconst_null
    //   251: astore_2
    //   252: goto -135 -> 117
    //   255: astore_0
    //   256: aconst_null
    //   257: astore_1
    //   258: aload 8
    //   260: astore_2
    //   261: goto -144 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	paramZipFile	java.util.zip.ZipFile
    //   0	264	1	paramZipEntry	java.util.zip.ZipEntry
    //   0	264	2	paramFile	java.io.File
    //   0	264	3	paramString	String
    //   0	264	4	paramBoolean	boolean
    //   4	220	5	i	int
    //   90	13	6	j	int
    //   1	244	7	bool	boolean
    //   57	202	8	localBufferedInputStream	java.io.BufferedInputStream
    //   74	54	9	localBufferedOutputStream	java.io.BufferedOutputStream
    //   81	19	10	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   76	83	110	finally
    //   83	92	110	finally
    //   97	107	110	finally
    //   45	59	247	finally
    //   59	76	255	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tinker/lib/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */