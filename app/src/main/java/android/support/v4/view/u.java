package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class u
{
  private final DataSetObservable uY = new DataSetObservable();
  private DataSetObserver uZ;
  
  final void a(DataSetObserver paramDataSetObserver)
  {
    try
    {
      this.uZ = paramDataSetObserver;
      return;
    }
    finally {}
  }
  
  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }
  
  public abstract boolean a(View paramView, Object paramObject);
  
  public float ak(int paramInt)
  {
    return 1.0F;
  }
  
  public Object b(ViewGroup paramViewGroup, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }
  
  public void bo() {}
  
  public Parcelable bp()
  {
    return null;
  }
  
  public CharSequence cb()
  {
    return null;
  }
  
  public void e(Object paramObject) {}
  
  public abstract int getCount();
  
  public int k(Object paramObject)
  {
    return -1;
  }
  
  public void notifyDataSetChanged()
  {
    try
    {
      if (this.uZ != null) {
        this.uZ.onChanged();
      }
      this.uY.notifyChanged();
      return;
    }
    finally {}
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.uY.registerObserver(paramDataSetObserver);
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.uY.unregisterObserver(paramDataSetObserver);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/android/support/v4/view/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */