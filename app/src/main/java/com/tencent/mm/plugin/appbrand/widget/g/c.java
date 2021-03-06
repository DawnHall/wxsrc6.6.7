package com.tencent.mm.plugin.appbrand.widget.g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

public final class c
  extends ReplacementSpan
{
  private final int backgroundColor;
  private final float duz;
  private final int paddingLeft;
  private final int paddingRight;
  private final int radius;
  private final String text;
  private final int textColor;
  
  public c(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.duz = paramInt3;
    this.text = paramString;
    this.textColor = -1;
    this.backgroundColor = paramInt4;
    this.radius = paramInt5;
    this.paddingLeft = paramInt1;
    this.paddingRight = paramInt2;
  }
  
  public final int b(Paint paramPaint)
  {
    Paint localPaint = paramPaint;
    if (paramPaint == null) {
      localPaint = new Paint();
    }
    localPaint.setTextSize(this.duz);
    return (int)localPaint.measureText(this.text) + this.paddingLeft + this.paddingRight + this.radius * 2;
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    paramPaint.setTextSize(this.duz);
    paramPaint.setAntiAlias(true);
    paramCharSequence = new RectF();
    paramCharSequence.left = ((int)paramFloat + this.paddingLeft);
    Paint.FontMetricsInt localFontMetricsInt = paramPaint.getFontMetricsInt();
    paramInt1 = Math.max(0, (paramInt5 - paramInt3 - localFontMetricsInt.descent + localFontMetricsInt.top) / 2 - this.radius);
    paramCharSequence.top = (paramInt3 + paramInt1);
    paramCharSequence.bottom = (paramInt5 - paramInt1);
    paramCharSequence.right = (paramCharSequence.left + (int)paramPaint.measureText(this.text) + this.radius * 2);
    paramPaint.setColor(this.backgroundColor);
    paramCanvas.drawRoundRect(paramCharSequence, this.radius, this.radius, paramPaint);
    paramPaint.setColor(this.textColor);
    paramCanvas.drawText(this.text, paramCharSequence.left + this.radius, paramCharSequence.top + this.radius - localFontMetricsInt.top, paramPaint);
  }
  
  public final int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    return b(paramPaint);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */