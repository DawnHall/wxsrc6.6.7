package android.support.v4.app;

import android.os.Bundle;

final class ak
{
  static Bundle[] b(aj.a[] paramArrayOfa)
  {
    if (paramArrayOfa == null) {
      return null;
    }
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfa.length];
    int i = 0;
    while (i < paramArrayOfa.length)
    {
      aj.a locala = paramArrayOfa[i];
      Bundle localBundle = new Bundle();
      localBundle.putString("resultKey", locala.getResultKey());
      localBundle.putCharSequence("label", locala.getLabel());
      localBundle.putCharSequenceArray("choices", locala.getChoices());
      localBundle.putBoolean("allowFreeFormInput", locala.getAllowFreeFormInput());
      localBundle.putBundle("extras", locala.getExtras());
      arrayOfBundle[i] = localBundle;
      i += 1;
    }
    return arrayOfBundle;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/android/support/v4/app/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */