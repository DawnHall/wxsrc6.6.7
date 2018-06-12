package org.xwalk.core;

import java.util.ArrayList;

public class XWalkNavigationHistory
{
  private Object bridge;
  private ReflectMethod canGoBackMethod = new ReflectMethod(null, "canGoBack", new Class[0]);
  private ReflectMethod canGoForwardMethod = new ReflectMethod(null, "canGoForward", new Class[0]);
  private ReflectMethod clearMethod = new ReflectMethod(null, "clear", new Class[0]);
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod enumDirectionClassValueOfMethod = new ReflectMethod();
  private ReflectMethod getCurrentIndexMethod = new ReflectMethod(null, "getCurrentIndex", new Class[0]);
  private ReflectMethod getCurrentItemMethod = new ReflectMethod(null, "getCurrentItem", new Class[0]);
  private ReflectMethod getItemAtintMethod = new ReflectMethod(null, "getItemAt", new Class[0]);
  private ReflectMethod hasItemAtintMethod = new ReflectMethod(null, "hasItemAt", new Class[0]);
  private ReflectMethod navigateDirectionInternalintMethod = new ReflectMethod(null, "navigate", new Class[0]);
  private ReflectMethod postWrapperMethod;
  private ReflectMethod sizeMethod = new ReflectMethod(null, "size", new Class[0]);
  
  public XWalkNavigationHistory(Object paramObject)
  {
    this.bridge = paramObject;
    reflectionInit();
  }
  
  private Object ConvertDirection(Direction paramDirection)
  {
    return this.enumDirectionClassValueOfMethod.invoke(new Object[] { paramDirection.toString() });
  }
  
  public boolean canGoBack()
  {
    try
    {
      boolean bool = ((Boolean)this.canGoBackMethod.invoke(new Object[0])).booleanValue();
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return false;
  }
  
  public boolean canGoForward()
  {
    try
    {
      boolean bool = ((Boolean)this.canGoForwardMethod.invoke(new Object[0])).booleanValue();
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return false;
  }
  
  public void clear()
  {
    try
    {
      this.clearMethod.invoke(new Object[0]);
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
  
  public int getCurrentIndex()
  {
    try
    {
      int i = ((Integer)this.getCurrentIndexMethod.invoke(new Object[0])).intValue();
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
  
  public XWalkNavigationItem getCurrentItem()
  {
    try
    {
      XWalkNavigationItem localXWalkNavigationItem = (XWalkNavigationItem)this.coreWrapper.getWrapperObject(this.getCurrentItemMethod.invoke(new Object[0]));
      return localXWalkNavigationItem;
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
  
  public XWalkNavigationItem getItemAt(int paramInt)
  {
    try
    {
      XWalkNavigationItem localXWalkNavigationItem = (XWalkNavigationItem)this.coreWrapper.getWrapperObject(this.getItemAtintMethod.invoke(new Object[] { Integer.valueOf(paramInt) }));
      return localXWalkNavigationItem;
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
  
  public boolean hasItemAt(int paramInt)
  {
    try
    {
      boolean bool = ((Boolean)this.hasItemAtintMethod.invoke(new Object[] { Integer.valueOf(paramInt) })).booleanValue();
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return false;
  }
  
  public void navigate(Direction paramDirection, int paramInt)
  {
    try
    {
      this.navigateDirectionInternalintMethod.invoke(new Object[] { ConvertDirection(paramDirection), Integer.valueOf(paramInt) });
      return;
    }
    catch (UnsupportedOperationException paramDirection)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(paramDirection);
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
    this.enumDirectionClassValueOfMethod.init(null, this.coreWrapper.getBridgeClass("XWalkNavigationHistoryInternal$DirectionInternal"), "valueOf", new Class[] { String.class });
    this.sizeMethod.init(this.bridge, null, "sizeSuper", new Class[0]);
    this.hasItemAtintMethod.init(this.bridge, null, "hasItemAtSuper", new Class[] { Integer.TYPE });
    this.getItemAtintMethod.init(this.bridge, null, "getItemAtSuper", new Class[] { Integer.TYPE });
    this.getCurrentItemMethod.init(this.bridge, null, "getCurrentItemSuper", new Class[0]);
    this.canGoBackMethod.init(this.bridge, null, "canGoBackSuper", new Class[0]);
    this.canGoForwardMethod.init(this.bridge, null, "canGoForwardSuper", new Class[0]);
    this.navigateDirectionInternalintMethod.init(this.bridge, null, "navigateSuper", new Class[] { this.coreWrapper.getBridgeClass("XWalkNavigationHistoryInternal$DirectionInternal"), Integer.TYPE });
    this.getCurrentIndexMethod.init(this.bridge, null, "getCurrentIndexSuper", new Class[0]);
    this.clearMethod.init(this.bridge, null, "clearSuper", new Class[0]);
  }
  
  public int size()
  {
    try
    {
      int i = ((Integer)this.sizeMethod.invoke(new Object[0])).intValue();
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
  
  public static enum Direction
  {
    BACKWARD,  FORWARD;
    
    private Direction() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/org/xwalk/core/XWalkNavigationHistory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */