package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.EmailSignInConfig;
import com.google.android.gms.auth.api.signin.FacebookSignInConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;

public final class SignInConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new a();
  String aJA;
  final String aJv;
  String aJw;
  EmailSignInConfig aJx;
  GoogleSignInConfig aJy;
  FacebookSignInConfig aJz;
  final int versionCode;
  
  SignInConfiguration(int paramInt, String paramString1, String paramString2, EmailSignInConfig paramEmailSignInConfig, GoogleSignInConfig paramGoogleSignInConfig, FacebookSignInConfig paramFacebookSignInConfig, String paramString3)
  {
    this.versionCode = paramInt;
    this.aJv = w.bg(paramString1);
    this.aJw = paramString2;
    this.aJx = paramEmailSignInConfig;
    this.aJy = paramGoogleSignInConfig;
    this.aJz = paramFacebookSignInConfig;
    this.aJA = paramString3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */