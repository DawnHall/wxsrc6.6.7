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

public final class hx
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
      ((Path)localObject).moveTo(48.0F, 80.0F);
      ((Path)localObject).lineTo(44.0F, 76.0F);
      ((Path)localObject).lineTo(48.0F, 64.0F);
      ((Path)localObject).lineTo(52.0F, 76.0F);
      ((Path)localObject).lineTo(48.0F, 80.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(78.666664F, 72.46489F);
      ((Path)localObject).lineTo(78.666664F, 72.44444F);
      ((Path)localObject).lineTo(58.234665F, 65.333336F);
      ((Path)localObject).lineTo(58.666668F, 65.333336F);
      ((Path)localObject).cubicTo(58.666668F, 65.333336F, 56.0F, 64.88355F, 56.0F, 62.666668F);
      ((Path)localObject).lineTo(56.0F, 64.55556F);
      ((Path)localObject).lineTo(56.0F, 64.55556F);
      ((Path)localObject).lineTo(56.0F, 61.333332F);
      ((Path)localObject).cubicTo(56.0F, 59.977333F, 57.333332F, 58.666668F, 57.333332F, 58.666668F);
      ((Path)localObject).lineTo(57.319557F, 58.666668F);
      ((Path)localObject).cubicTo(63.177776F, 54.190224F, 67.138664F, 45.516445F, 67.13022F, 35.05378F);
      ((Path)localObject).cubicTo(67.11867F, 21.260445F, 58.55467F, 12.0F, 48.0F, 12.0F);
      ((Path)localObject).cubicTo(37.44533F, 12.0F, 28.896444F, 21.260445F, 28.908F, 35.05378F);
      ((Path)localObject).cubicTo(28.916445F, 45.514668F, 32.88978F, 54.189335F, 38.753777F, 58.666668F);
      ((Path)localObject).lineTo(38.666668F, 58.666668F);
      ((Path)localObject).cubicTo(38.666668F, 58.666668F, 40.0F, 59.977333F, 40.0F, 61.333332F);
      ((Path)localObject).lineTo(40.0F, 62.666668F);
      ((Path)localObject).cubicTo(40.0F, 64.88355F, 37.333332F, 65.333336F, 37.333332F, 65.333336F);
      ((Path)localObject).lineTo(37.765335F, 65.333336F);
      ((Path)localObject).lineTo(17.333334F, 72.44444F);
      ((Path)localObject).lineTo(17.333334F, 72.46489F);
      ((Path)localObject).cubicTo(14.228F, 73.564445F, 12.0F, 76.51822F, 12.0F, 80.0F);
      ((Path)localObject).lineTo(12.0F, 84.0F);
      ((Path)localObject).lineTo(84.0F, 84.0F);
      ((Path)localObject).lineTo(84.0F, 80.0F);
      ((Path)localObject).cubicTo(84.0F, 76.51822F, 81.77155F, 73.564445F, 78.666664F, 72.46489F);
      ((Path)localObject).lineTo(78.666664F, 72.46489F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */