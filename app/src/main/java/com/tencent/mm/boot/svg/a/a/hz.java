package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class hz
  extends c
{
  private final int height = 96;
  private final int width = 96;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 96;
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.f(paramVarArgs);
      c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.i(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(88.0F, 74.0F);
      ((Path)localObject).lineTo(88.0F, 74.0F);
      ((Path)localObject).lineTo(56.0F, 15.0F);
      ((Path)localObject).lineTo(56.0F, 15.0F);
      ((Path)localObject).cubicTo(54.97F, 11.577649F, 51.78977F, 9.0F, 48.0F, 9.0F);
      ((Path)localObject).cubicTo(44.21023F, 9.0F, 41.029545F, 11.577649F, 40.0F, 15.0F);
      ((Path)localObject).lineTo(40.0F, 15.0F);
      ((Path)localObject).lineTo(8.0F, 74.0F);
      ((Path)localObject).lineTo(8.0F, 74.0F);
      ((Path)localObject).cubicTo(7.5070333F, 75.54358F, 7.0F, 77.10677F, 7.0F, 79.0F);
      ((Path)localObject).cubicTo(7.0F, 83.32397F, 10.671322F, 87.0F, 15.0F, 87.0F);
      ((Path)localObject).cubicTo(15.497933F, 87.0F, 15.791311F, 86.98221F, 16.0F, 87.0F);
      ((Path)localObject).lineTo(16.0F, 87.0F);
      ((Path)localObject).lineTo(48.0F, 87.0F);
      ((Path)localObject).lineTo(48.0F, 79.0F);
      ((Path)localObject).lineTo(44.0F, 79.0F);
      ((Path)localObject).lineTo(44.0F, 71.0F);
      ((Path)localObject).lineTo(48.0F, 71.0F);
      ((Path)localObject).lineTo(48.0F, 62.0F);
      ((Path)localObject).lineTo(44.0F, 62.0F);
      ((Path)localObject).lineTo(42.0F, 34.0F);
      ((Path)localObject).lineTo(48.0F, 34.0F);
      ((Path)localObject).lineTo(48.0F, 25.0F);
      ((Path)localObject).lineTo(48.0F, 25.0F);
      ((Path)localObject).lineTo(48.0F, 25.0F);
      ((Path)localObject).lineTo(48.0F, 34.0F);
      ((Path)localObject).lineTo(54.0F, 34.0F);
      ((Path)localObject).lineTo(52.0F, 62.0F);
      ((Path)localObject).lineTo(48.0F, 62.0F);
      ((Path)localObject).lineTo(48.0F, 71.0F);
      ((Path)localObject).lineTo(52.0F, 71.0F);
      ((Path)localObject).lineTo(52.0F, 79.0F);
      ((Path)localObject).lineTo(48.0F, 79.0F);
      ((Path)localObject).lineTo(48.0F, 87.0F);
      ((Path)localObject).lineTo(80.0F, 87.0F);
      ((Path)localObject).lineTo(80.0F, 87.0F);
      ((Path)localObject).cubicTo(80.20824F, 86.98221F, 80.50207F, 87.0F, 81.0F, 87.0F);
      ((Path)localObject).cubicTo(85.328674F, 87.0F, 89.0F, 83.32397F, 89.0F, 79.0F);
      ((Path)localObject).cubicTo(89.0F, 77.10677F, 88.49251F, 75.54358F, 88.0F, 74.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/hz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */