package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class l
  implements Parcelable.Creator<GetCloudSyncOptInOutDoneResponse>
{
  static void a(GetCloudSyncOptInOutDoneResponse paramGetCloudSyncOptInOutDoneResponse, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGetCloudSyncOptInOutDoneResponse.versionCode);
    b.c(paramParcel, 2, paramGetCloudSyncOptInOutDoneResponse.statusCode);
    b.a(paramParcel, 3, paramGetCloudSyncOptInOutDoneResponse.bew);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */