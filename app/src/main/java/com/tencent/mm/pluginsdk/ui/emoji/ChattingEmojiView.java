package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class ChattingEmojiView
  extends MMEmojiView
{
  public ChattingEmojiView(Context paramContext)
  {
    super(paramContext);
    setIsMaxSizeLimit(true);
  }
  
  public ChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setIsMaxSizeLimit(true);
  }
  
  public ChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setIsMaxSizeLimit(true);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/emoji/ChattingEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */