package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;

public final class q
{
  /* Error */
  public static byte[] r(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 14	java/util/zip/Deflater
    //   3: dup
    //   4: invokespecial 18	java/util/zip/Deflater:<init>	()V
    //   7: astore 4
    //   9: aload 4
    //   11: invokevirtual 21	java/util/zip/Deflater:reset	()V
    //   14: aload 4
    //   16: aload_0
    //   17: invokevirtual 25	java/util/zip/Deflater:setInput	([B)V
    //   20: aload 4
    //   22: invokevirtual 28	java/util/zip/Deflater:finish	()V
    //   25: new 30	java/io/ByteArrayOutputStream
    //   28: dup
    //   29: aload_0
    //   30: arraylength
    //   31: invokespecial 33	java/io/ByteArrayOutputStream:<init>	(I)V
    //   34: astore_2
    //   35: aload_2
    //   36: astore_1
    //   37: sipush 1024
    //   40: newarray <illegal type>
    //   42: astore_3
    //   43: aload_2
    //   44: astore_1
    //   45: aload 4
    //   47: invokevirtual 37	java/util/zip/Deflater:finished	()Z
    //   50: ifne +54 -> 104
    //   53: aload_2
    //   54: astore_1
    //   55: aload_2
    //   56: aload_3
    //   57: iconst_0
    //   58: aload 4
    //   60: aload_3
    //   61: invokevirtual 41	java/util/zip/Deflater:deflate	([B)I
    //   64: invokevirtual 45	java/io/ByteArrayOutputStream:write	([BII)V
    //   67: goto -24 -> 43
    //   70: astore_3
    //   71: aload_2
    //   72: astore_1
    //   73: ldc 47
    //   75: aload_3
    //   76: ldc 49
    //   78: iconst_0
    //   79: anewarray 4	java/lang/Object
    //   82: invokestatic 55	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: aload_0
    //   86: astore_1
    //   87: aload_2
    //   88: ifnull +9 -> 97
    //   91: aload_2
    //   92: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   95: aload_0
    //   96: astore_1
    //   97: aload 4
    //   99: invokevirtual 61	java/util/zip/Deflater:end	()V
    //   102: aload_1
    //   103: areturn
    //   104: aload_2
    //   105: astore_1
    //   106: aload_2
    //   107: invokevirtual 65	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   110: astore_3
    //   111: aload_3
    //   112: astore_1
    //   113: aload_2
    //   114: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   117: goto -20 -> 97
    //   120: astore_0
    //   121: ldc 47
    //   123: aload_0
    //   124: ldc 49
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 55	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: goto -36 -> 97
    //   136: astore_1
    //   137: ldc 47
    //   139: aload_1
    //   140: ldc 49
    //   142: iconst_0
    //   143: anewarray 4	java/lang/Object
    //   146: invokestatic 55	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_0
    //   150: astore_1
    //   151: goto -54 -> 97
    //   154: astore_1
    //   155: aconst_null
    //   156: astore_1
    //   157: new 10	java/lang/OutOfMemoryError
    //   160: dup
    //   161: new 67	java/lang/StringBuilder
    //   164: dup
    //   165: ldc 69
    //   167: invokespecial 72	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   170: aload_0
    //   171: arraylength
    //   172: invokevirtual 76	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   175: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokespecial 81	java/lang/OutOfMemoryError:<init>	(Ljava/lang/String;)V
    //   181: athrow
    //   182: astore_0
    //   183: aload_1
    //   184: ifnull +7 -> 191
    //   187: aload_1
    //   188: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   191: aload_0
    //   192: athrow
    //   193: astore_1
    //   194: ldc 47
    //   196: aload_1
    //   197: ldc 49
    //   199: iconst_0
    //   200: anewarray 4	java/lang/Object
    //   203: invokestatic 55	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: goto -15 -> 191
    //   209: astore_0
    //   210: aconst_null
    //   211: astore_1
    //   212: goto -29 -> 183
    //   215: astore_1
    //   216: aload_2
    //   217: astore_1
    //   218: goto -61 -> 157
    //   221: astore_3
    //   222: aconst_null
    //   223: astore_2
    //   224: goto -153 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	paramArrayOfByte	byte[]
    //   36	77	1	localObject1	Object
    //   136	4	1	localIOException1	IOException
    //   150	1	1	arrayOfByte1	byte[]
    //   154	1	1	localOutOfMemoryError1	OutOfMemoryError
    //   156	32	1	localObject2	Object
    //   193	4	1	localIOException2	IOException
    //   211	1	1	localObject3	Object
    //   215	1	1	localOutOfMemoryError2	OutOfMemoryError
    //   217	1	1	localByteArrayOutputStream1	ByteArrayOutputStream
    //   34	190	2	localByteArrayOutputStream2	ByteArrayOutputStream
    //   42	19	3	arrayOfByte2	byte[]
    //   70	6	3	localException1	Exception
    //   110	2	3	arrayOfByte3	byte[]
    //   221	1	3	localException2	Exception
    //   7	91	4	localDeflater	java.util.zip.Deflater
    // Exception table:
    //   from	to	target	type
    //   37	43	70	java/lang/Exception
    //   45	53	70	java/lang/Exception
    //   55	67	70	java/lang/Exception
    //   106	111	70	java/lang/Exception
    //   113	117	120	java/io/IOException
    //   91	95	136	java/io/IOException
    //   25	35	154	java/lang/OutOfMemoryError
    //   37	43	182	finally
    //   45	53	182	finally
    //   55	67	182	finally
    //   73	85	182	finally
    //   106	111	182	finally
    //   157	182	182	finally
    //   187	191	193	java/io/IOException
    //   25	35	209	finally
    //   37	43	215	java/lang/OutOfMemoryError
    //   45	53	215	java/lang/OutOfMemoryError
    //   55	67	215	java/lang/OutOfMemoryError
    //   106	111	215	java/lang/OutOfMemoryError
    //   25	35	221	java/lang/Exception
  }
  
  public static byte[] x(byte[] paramArrayOfByte)
  {
    Inflater localInflater = new Inflater();
    localInflater.reset();
    localInflater.setInput(paramArrayOfByte);
    Object localObject = null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      while (!localInflater.finished()) {
        localByteArrayOutputStream.write(arrayOfByte, 0, localInflater.inflate(arrayOfByte));
      }
      return paramArrayOfByte;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Zlib", localException, "exception when loop read byte", new Object[0]);
      try
      {
        localByteArrayOutputStream.close();
        for (;;)
        {
          localInflater.end();
          if (localException == null) {
            break;
          }
          throw new Exception(localException);
          arrayOfByte = localByteArrayOutputStream.toByteArray();
          paramArrayOfByte = arrayOfByte;
          try
          {
            localByteArrayOutputStream.close();
          }
          catch (IOException localIOException2)
          {
            x.printErrStackTrace("MicroMsg.Zlib", localIOException2, "", new Object[0]);
          }
        }
      }
      catch (IOException localIOException3)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.Zlib", localIOException3, "", new Object[0]);
        }
      }
    }
    finally
    {
      try
      {
        localByteArrayOutputStream.close();
        throw paramArrayOfByte;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.Zlib", localIOException1, "", new Object[0]);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */