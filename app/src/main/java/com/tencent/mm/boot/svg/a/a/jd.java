package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class jd
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
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Paint localPaint1 = c.i(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.i(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-8617594);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 9.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(73.0F, 34.00018F);
      ((Path)localObject2).lineTo(73.0F, 57.00018F);
      ((Path)localObject2).cubicTo(72.9F, 59.03468F, 71.0865F, 60.857323F, 69.0F, 61.00018F);
      ((Path)localObject2).lineTo(12.0F, 61.00018F);
      ((Path)localObject2).cubicTo(9.91305F, 60.857323F, 8.1F, 59.03468F, 8.0F, 57.00018F);
      ((Path)localObject2).lineTo(8.0F, 24.000181F);
      ((Path)localObject2).cubicTo(8.1F, 21.966133F, 9.91305F, 20.143038F, 12.0F, 20.000181F);
      ((Path)localObject2).lineTo(19.0F, 20.000181F);
      ((Path)localObject2).cubicTo(19.35F, 20.13399F, 21.7467F, 16.067085F, 29.0F, 12.00018F);
      ((Path)localObject2).lineTo(12.0F, 12.00018F);
      ((Path)localObject2).cubicTo(5.4396F, 12.00018F, 0.0F, 17.468561F, 0.0F, 24.000181F);
      ((Path)localObject2).lineTo(0.0F, 57.00018F);
      ((Path)localObject2).cubicTo(0.0F, 63.5318F, 5.4396F, 69.00018F, 12.0F, 69.00018F);
      ((Path)localObject2).lineTo(69.0F, 69.00018F);
      ((Path)localObject2).cubicTo(75.5604F, 69.00018F, 81.0F, 63.5318F, 81.0F, 57.00018F);
      ((Path)localObject2).lineTo(81.0F, 28.000181F);
      ((Path)localObject2).lineTo(73.0F, 34.00018F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(53.0F, 29.000181F);
      ((Path)localObject2).lineTo(53.0F, 41.00018F);
      ((Path)localObject2).lineTo(77.0F, 20.000181F);
      ((Path)localObject2).lineTo(53.0F, 1.8039216E-4F);
      ((Path)localObject2).lineTo(53.0F, 12.00018F);
      ((Path)localObject2).cubicTo(32.732662F, 12.273722F, 16.57688F, 28.172049F, 16.0F, 48.00018F);
      ((Path)localObject2).cubicTo(24.49405F, 36.795803F, 37.67185F, 29.378492F, 53.0F, 29.000181F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */