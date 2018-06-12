package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaText
  extends WWMediaMessage.WWMediaObject
{
  public String text;
  
  public WWMediaText() {}
  
  public WWMediaText(String paramString)
  {
    this.text = paramString;
  }
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while ((this.text == null) || (this.text.length() == 0) || (this.text.length() > 10240)) {
      return false;
    }
    return true;
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("_wwtextobject_text", this.text);
    super.toBundle(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wework/api/model/WWMediaText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */