package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

final class ai
{
  static RemoteInput[] a(aj.a[] paramArrayOfa)
  {
    if (paramArrayOfa == null) {
      return null;
    }
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfa.length];
    int i = 0;
    while (i < paramArrayOfa.length)
    {
      aj.a locala = paramArrayOfa[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(locala.getResultKey()).setLabel(locala.getLabel()).setChoices(locala.getChoices()).setAllowFreeFormInput(locala.getAllowFreeFormInput()).addExtras(locala.getExtras()).build();
      i += 1;
    }
    return arrayOfRemoteInput;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/android/support/v4/app/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */