package com.tencent.mm.plugin.expt.c;

import com.tencent.mm.g.c.ba;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends ba
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "exptKey";
    locala.sKA.put("exptKey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" exptKey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "exptKey";
    locala.columns[1] = "exptId";
    locala.sKA.put("exptId", "INTEGER");
    localStringBuilder.append(" exptId INTEGER");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/expt/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */