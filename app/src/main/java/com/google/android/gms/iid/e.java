package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
{
  SharedPreferences aRv;
  Context context;
  
  public e(Context paramContext)
  {
    this(paramContext, "com.google.android.gms.appid");
  }
  
  private e(Context paramContext, String paramString)
  {
    this.context = paramContext;
    this.aRv = paramContext.getSharedPreferences(paramString, 4);
    paramString = paramString + "-no-backup";
    new android.support.v4.content.a();
    paramContext = this.context;
    if (Build.VERSION.SDK_INT >= 21) {
      paramContext = paramContext.getNoBackupFilesDir();
    }
    for (;;)
    {
      paramContext = new File(paramContext, paramString);
      if (!paramContext.exists()) {}
      try
      {
        if ((paramContext.createNewFile()) && (!isEmpty())) {
          InstanceIDListenerService.a(this.context, this);
        }
        return;
        paramContext = android.support.v4.content.a.h(new File(paramContext.getApplicationInfo().dataDir, "no_backup"));
      }
      catch (IOException paramContext)
      {
        while (!Log.isLoggable("InstanceID/Store", 3)) {}
        new StringBuilder("Error creating file in no backup dir: ").append(paramContext.getMessage());
      }
    }
  }
  
  private void a(SharedPreferences.Editor paramEditor, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramEditor.putString(paramString1 + "|S|" + paramString2, paramString3);
      return;
    }
    finally
    {
      paramEditor = finally;
      throw paramEditor;
    }
  }
  
  private static String d(String paramString1, String paramString2, String paramString3)
  {
    return paramString1 + "|T|" + paramString2 + "|" + paramString3;
  }
  
  private String get(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = this.aRv.getString(paramString1 + "|S|" + paramString2, null);
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      paramString1 = d(paramString1, paramString2, paramString3);
      paramString2 = this.aRv.edit();
      paramString2.putString(paramString1, paramString4);
      paramString2.putString("appVersion", paramString5);
      paramString2.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000L));
      paramString2.commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void bn(String paramString)
  {
    try
    {
      SharedPreferences.Editor localEditor = this.aRv.edit();
      Iterator localIterator = this.aRv.getAll().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith(paramString)) {
          localEditor.remove(str);
        }
      }
      localEditor.commit();
    }
    finally {}
  }
  
  public final void bo(String paramString)
  {
    bn(paramString + "|T|");
  }
  
  final KeyPair bp(String paramString)
  {
    Object localObject1 = get(paramString, "|P|");
    Object localObject2 = get(paramString, "|K|");
    if (localObject2 == null) {
      return null;
    }
    try
    {
      paramString = Base64.decode((String)localObject1, 8);
      localObject1 = Base64.decode((String)localObject2, 8);
      localObject2 = KeyFactory.getInstance("RSA");
      paramString = new KeyPair(((KeyFactory)localObject2).generatePublic(new X509EncodedKeySpec(paramString)), ((KeyFactory)localObject2).generatePrivate(new PKCS8EncodedKeySpec((byte[])localObject1)));
      return paramString;
    }
    catch (InvalidKeySpecException paramString)
    {
      new StringBuilder("Invalid key stored ").append(paramString);
      InstanceIDListenerService.a(this.context, this);
      return null;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      for (;;) {}
    }
  }
  
  final KeyPair c(String paramString, long paramLong)
  {
    try
    {
      KeyPair localKeyPair = b.pQ();
      SharedPreferences.Editor localEditor = this.aRv.edit();
      a(localEditor, paramString, "|P|", a.j(localKeyPair.getPublic().getEncoded()));
      a(localEditor, paramString, "|K|", a.j(localKeyPair.getPrivate().getEncoded()));
      a(localEditor, paramString, "cre", Long.toString(paramLong));
      localEditor.commit();
      return localKeyPair;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String e(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = d(paramString1, paramString2, paramString3);
      paramString1 = this.aRv.getString(paramString1, null);
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  final String get(String paramString)
  {
    try
    {
      paramString = this.aRv.getString(paramString, null);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  final boolean isEmpty()
  {
    return this.aRv.getAll().isEmpty();
  }
  
  public final void pS()
  {
    try
    {
      this.aRv.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/iid/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */