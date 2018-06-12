package org.xwalk.core;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class ClientCertRequestHandler
  implements ClientCertRequest
{
  private Object bridge;
  private ReflectMethod cancelMethod = new ReflectMethod(null, "cancel", new Class[0]);
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod getHostMethod = new ReflectMethod(null, "getHost", new Class[0]);
  private ReflectMethod getKeyTypesMethod = new ReflectMethod(null, "getKeyTypes", new Class[0]);
  private ReflectMethod getPortMethod = new ReflectMethod(null, "getPort", new Class[0]);
  private ReflectMethod getPrincipalsMethod = new ReflectMethod(null, "getPrincipals", new Class[0]);
  private ReflectMethod ignoreMethod = new ReflectMethod(null, "ignore", new Class[0]);
  private ReflectMethod postWrapperMethod;
  private ReflectMethod proceedPrivateKeyListMethod = new ReflectMethod(null, "proceed", new Class[0]);
  
  public ClientCertRequestHandler(Object paramObject)
  {
    this.bridge = paramObject;
    reflectionInit();
  }
  
  public void cancel()
  {
    try
    {
      this.cancelMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
  }
  
  protected Object getBridge()
  {
    return this.bridge;
  }
  
  public String getHost()
  {
    try
    {
      String str = (String)this.getHostMethod.invoke(new Object[0]);
      return str;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return null;
  }
  
  public String[] getKeyTypes()
  {
    try
    {
      String[] arrayOfString = (String[])this.getKeyTypesMethod.invoke(new Object[0]);
      return arrayOfString;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return null;
  }
  
  public int getPort()
  {
    try
    {
      int i = ((Integer)this.getPortMethod.invoke(new Object[0])).intValue();
      return i;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return 0;
  }
  
  public Principal[] getPrincipals()
  {
    try
    {
      Principal[] arrayOfPrincipal = (Principal[])this.getPrincipalsMethod.invoke(new Object[0]);
      return arrayOfPrincipal;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return null;
  }
  
  public void ignore()
  {
    try
    {
      this.ignoreMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
  }
  
  public void proceed(PrivateKey paramPrivateKey, List<X509Certificate> paramList)
  {
    try
    {
      this.proceedPrivateKeyListMethod.invoke(new Object[] { paramPrivateKey, paramList });
      return;
    }
    catch (UnsupportedOperationException paramPrivateKey)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(paramPrivateKey);
    }
  }
  
  void reflectionInit()
  {
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      return;
    }
    this.proceedPrivateKeyListMethod.init(this.bridge, null, "proceedSuper", new Class[] { PrivateKey.class, List.class });
    this.ignoreMethod.init(this.bridge, null, "ignoreSuper", new Class[0]);
    this.cancelMethod.init(this.bridge, null, "cancelSuper", new Class[0]);
    this.getHostMethod.init(this.bridge, null, "getHostSuper", new Class[0]);
    this.getPortMethod.init(this.bridge, null, "getPortSuper", new Class[0]);
    this.getKeyTypesMethod.init(this.bridge, null, "getKeyTypesSuper", new Class[0]);
    this.getPrincipalsMethod.init(this.bridge, null, "getPrincipalsSuper", new Class[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/org/xwalk/core/ClientCertRequestHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */