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

public final class aef
  extends c
{
  private final int height = 42;
  private final int width = 33;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 33;
      return 42;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      localPaint1.setColor(49500);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 6.123234E-17F, -1.0F, 37.0F, 1.0F, 6.123234E-17F, 4.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(-4.0F, 13.0F);
      ((Path)localObject).lineTo(6.0F, 13.0F);
      ((Path)localObject).lineTo(17.0F, 5.0F);
      ((Path)localObject).lineTo(20.0F, 5.0F);
      ((Path)localObject).lineTo(20.0F, 36.0F);
      ((Path)localObject).lineTo(17.0F, 36.0F);
      ((Path)localObject).lineTo(6.0F, 28.0F);
      ((Path)localObject).lineTo(-4.0F, 28.0F);
      ((Path)localObject).lineTo(-4.0F, 13.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 19.0F);
      ((Path)localObject).lineTo(37.0F, 19.0F);
      ((Path)localObject).lineTo(37.0F, 22.0F);
      ((Path)localObject).lineTo(27.0F, 22.0F);
      ((Path)localObject).lineTo(27.0F, 19.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 12.0F);
      ((Path)localObject).lineTo(37.0F, 8.0F);
      ((Path)localObject).lineTo(37.0F, 11.0F);
      ((Path)localObject).lineTo(27.0F, 15.0F);
      ((Path)localObject).lineTo(27.0F, 12.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(37.0F, 29.0F);
      ((Path)localObject).lineTo(27.0F, 25.0F);
      ((Path)localObject).lineTo(27.0F, 28.0F);
      ((Path)localObject).lineTo(37.0F, 32.0F);
      ((Path)localObject).lineTo(37.0F, 29.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */