package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;

public class GridInScrollView
  extends GridView
{
  public GridInScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public GridInScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/GridInScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */