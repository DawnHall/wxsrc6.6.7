package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Set;

public abstract class MainProcessTask
  implements Parcelable
{
  private static final Set<Object> fEy = new HashSet();
  public String fEl = Process.myPid() + hashCode();
  Messenger fEz;
  
  public abstract void aai();
  
  public void aaj() {}
  
  public final void ahA()
  {
    fEy.add(this);
  }
  
  public final void ahB()
  {
    fEy.remove(this);
  }
  
  public final boolean ahH()
  {
    if (this.fEz == null) {
      return false;
    }
    Message localMessage = Message.obtain();
    localMessage.setData(AppBrandMainProcessService.a(this, false));
    try
    {
      this.fEz.send(localMessage);
      return true;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MainProcessTask", localException.getMessage());
    }
    return false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void g(Parcel paramParcel) {}
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/MainProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */