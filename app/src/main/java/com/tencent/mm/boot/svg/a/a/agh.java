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

public final class agh
  extends c
{
  private final int height = 44;
  private final int width = 54;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 54;
      return 44;
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
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(0.5F, 0.5F);
      ((Path)localObject2).lineTo(46.5F, 0.5F);
      ((Path)localObject2).lineTo(46.5F, 36.5F);
      ((Path)localObject2).lineTo(0.5F, 36.5F);
      ((Path)localObject2).lineTo(0.5F, 0.5F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(42.5F, 2.5F);
      ((Path)localObject2).lineTo(42.5F, 32.5F);
      ((Path)localObject2).lineTo(3.5F, 32.5F);
      ((Path)localObject2).lineTo(3.5F, 2.5F);
      ((Path)localObject2).lineTo(42.5F, 2.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(51.0F, 42.5F);
      ((Path)localObject2).lineTo(52.5F, 42.5F);
      ((Path)localObject2).lineTo(52.5F, 7.5F);
      ((Path)localObject2).lineTo(49.5F, 7.5F);
      ((Path)localObject2).lineTo(49.5F, 39.5F);
      ((Path)localObject2).lineTo(5.5F, 39.5F);
      ((Path)localObject2).lineTo(5.5F, 42.5F);
      ((Path)localObject2).lineTo(51.0F, 42.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(36.170597F, 14.009804F);
      ((Path)localObject1).lineTo(28.390347F, 19.793558F);
      ((Path)localObject1).lineTo(15.891026F, 9.5F);
      ((Path)localObject1).lineTo(0.5576923F, 22.578432F);
      ((Path)localObject1).lineTo(0.5576923F, 32.5F);
      ((Path)localObject1).lineTo(46.557693F, 32.5F);
      ((Path)localObject1).lineTo(46.557693F, 22.578432F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/agh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */