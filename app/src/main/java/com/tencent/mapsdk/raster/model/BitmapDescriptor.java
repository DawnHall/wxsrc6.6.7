package com.tencent.mapsdk.raster.model;

import android.graphics.Bitmap;

public final class BitmapDescriptor
  implements Cloneable
{
  int h = 0;
  Bitmap mBitmap;
  int w = 0;
  
  public BitmapDescriptor(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      this.w = paramBitmap.getWidth();
      this.h = paramBitmap.getHeight();
      this.mBitmap = paramBitmap;
    }
  }
  
  private BitmapDescriptor(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    this.w = paramInt1;
    this.h = paramInt2;
    this.mBitmap = paramBitmap;
  }
  
  public final BitmapDescriptor clone()
  {
    return new BitmapDescriptor(Bitmap.createBitmap(this.mBitmap), this.w, this.h);
  }
  
  public final Bitmap getBitmap()
  {
    return this.mBitmap;
  }
  
  public final int getHeight()
  {
    return this.h;
  }
  
  public final int getWidth()
  {
    return this.w;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mapsdk/raster/model/BitmapDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */