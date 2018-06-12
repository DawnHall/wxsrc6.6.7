package com.qq.taf.jce.dynamic;

public final class MapField
  extends JceField
{
  private JceField[] keys;
  private JceField[] values;
  
  MapField(JceField[] paramArrayOfJceField1, JceField[] paramArrayOfJceField2, int paramInt)
  {
    super(paramInt);
    this.keys = paramArrayOfJceField1;
    this.values = paramArrayOfJceField2;
  }
  
  public final JceField getKey(int paramInt)
  {
    return this.keys[paramInt];
  }
  
  public final JceField[] getKeys()
  {
    return this.keys;
  }
  
  public final JceField getValue(int paramInt)
  {
    return this.values[paramInt];
  }
  
  public final JceField[] getValues()
  {
    return this.values;
  }
  
  public final void setKey(int paramInt, JceField paramJceField)
  {
    this.keys[paramInt] = paramJceField;
  }
  
  public final void setValue(int paramInt, JceField paramJceField)
  {
    this.values[paramInt] = paramJceField;
  }
  
  public final int size()
  {
    return this.keys.length;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/qq/taf/jce/dynamic/MapField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */