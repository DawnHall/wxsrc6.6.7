package com.tencent.mm.plugin.location;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public class Plugin
  implements c
{
  public n createApplication()
  {
    return new a();
  }
  
  public ar createSubCore()
  {
    return new l();
  }
  
  public b getContactWidgetFactory()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/location/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */