package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.ui.j;
import org.json.JSONObject;

public final class bc
  extends a
{
  public static final int CTRL_INDEX = 453;
  public static final String NAME = "setBackgroundColor";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    p localp = d(paraml);
    if (localp == null)
    {
      paraml.E(paramInt, "fail");
      return;
    }
    long l = j.vF(paramJSONObject.optString("backgroundColor", ""));
    if (l == -1L)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    localp.getContentView().post(new bc.1(this, localp, l));
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */