package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
  extends af<f>
{
  public Map<Integer, Double> aWm = new HashMap(4);
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.aWm.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put("metric" + localEntry.getKey(), localEntry.getValue());
    }
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */