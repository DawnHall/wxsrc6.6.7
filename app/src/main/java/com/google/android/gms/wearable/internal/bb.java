package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class bb
  implements Parcelable.Creator<ChannelImpl>
{
  static void a(ChannelImpl paramChannelImpl, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramChannelImpl.mVersionCode);
    b.a(paramParcel, 2, paramChannelImpl.bem);
    b.a(paramParcel, 3, paramChannelImpl.bdn);
    b.a(paramParcel, 4, paramChannelImpl.ben);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/wearable/internal/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */