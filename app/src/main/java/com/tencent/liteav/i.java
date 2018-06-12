package com.tencent.liteav;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

public class i
  implements j, com.tencent.liteav.screencapture.c
{
  private static final String a = i.class.getSimpleName();
  private k b;
  private com.tencent.liteav.screencapture.a c = null;
  private EGLContext d = null;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private final Queue<Runnable> j = new LinkedList();
  
  public i(Context paramContext, f paramf)
  {
    this.c = new com.tencent.liteav.screencapture.a(paramContext);
    this.c.a(this);
    boolean bool = paramf.a();
    this.e = paramf.h;
    if (bool)
    {
      k = 1280;
      this.f = k;
      if (!bool) {
        break label115;
      }
    }
    label115:
    for (int k = m;; k = 1280)
    {
      this.g = k;
      this.h = paramf.a;
      this.i = paramf.b;
      return;
      k = 720;
      break;
    }
  }
  
  private boolean a(Queue<Runnable> paramQueue)
  {
    try
    {
      if (paramQueue.isEmpty()) {
        return false;
      }
      Runnable localRunnable = (Runnable)paramQueue.poll();
      if (localRunnable == null) {
        return false;
      }
    }
    finally {}
    ((Runnable)localObject).run();
    return true;
  }
  
  public void a()
  {
    this.c.a(this.f, this.g, this.e);
    this.c.a(true);
  }
  
  public void a(float paramFloat) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    while (a(this.j)) {}
    if (paramInt1 == 0)
    {
      if (this.b != null)
      {
        com.tencent.liteav.basic.f.c localc = new com.tencent.liteav.basic.f.c();
        localc.d = paramInt3;
        localc.e = paramInt4;
        localc.f = this.h;
        localc.g = this.i;
        localc.a = paramInt2;
        localc.b = 0;
        localc.i = 0;
        localc.j = com.tencent.liteav.basic.util.a.a(localc.d, localc.e, this.h, this.i);
        this.b.b(localc);
      }
      return;
    }
    TXCLog.e(a, "onScreenCaptureFrame failed");
  }
  
  public void a(int paramInt, EGLContext paramEGLContext)
  {
    if (paramInt == 0)
    {
      this.d = paramEGLContext;
      return;
    }
    this.d = null;
    TXCLog.e(a, "Start screen capture failed");
  }
  
  public void a(com.tencent.liteav.basic.c.a parama)
  {
    if (this.c != null) {
      this.c.a(parama);
    }
  }
  
  public void a(com.tencent.liteav.basic.f.c paramc) {}
  
  public void a(k paramk)
  {
    this.b = paramk;
  }
  
  public void a(Object paramObject)
  {
    while (a(this.j)) {}
    if (this.b != null) {
      this.b.q();
    }
  }
  
  public void a(Runnable paramRunnable)
  {
    synchronized (this.j)
    {
      this.j.add(paramRunnable);
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.c.a(null);
    this.c.a(false);
  }
  
  public boolean a(int paramInt)
  {
    return false;
  }
  
  public void b()
  {
    this.c.a(false);
  }
  
  public void b(int paramInt) {}
  
  public void b(boolean paramBoolean) {}
  
  public void c(int paramInt) {}
  
  public void c(boolean paramBoolean) {}
  
  public boolean c()
  {
    return true;
  }
  
  public int d()
  {
    return 0;
  }
  
  public void d(int paramInt) {}
  
  public boolean d(boolean paramBoolean)
  {
    return false;
  }
  
  public EGLContext e()
  {
    return this.d;
  }
  
  public void e(boolean paramBoolean) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */