package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class fc
  extends c
{
  private final int height = 50;
  private final int width = 50;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 50;
      return 50;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -289.0F, 0.0F, 1.0F, -369.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 302.0F, 0.0F, 1.0F, 370.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 1.5F);
      ((Path)localObject3).cubicTo(0.0F, 0.6715728F, 0.6715728F, 0.0F, 1.5F, 0.0F);
      ((Path)localObject3).lineTo(2.5F, 0.0F);
      ((Path)localObject3).cubicTo(3.3284273F, 0.0F, 4.0F, 0.6715728F, 4.0F, 1.5F);
      ((Path)localObject3).lineTo(4.0F, 46.5F);
      ((Path)localObject3).cubicTo(4.0F, 47.328426F, 3.3284273F, 48.0F, 2.5F, 48.0F);
      ((Path)localObject3).lineTo(1.5F, 48.0F);
      ((Path)localObject3).cubicTo(0.6715728F, 48.0F, 0.0F, 47.328426F, 0.0F, 46.5F);
      ((Path)localObject3).lineTo(0.0F, 1.5F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(20.0F, 1.5F);
      ((Path)localObject2).cubicTo(20.0F, 0.6715728F, 20.671574F, 0.0F, 21.5F, 0.0F);
      ((Path)localObject2).lineTo(22.5F, 0.0F);
      ((Path)localObject2).cubicTo(23.328426F, 0.0F, 24.0F, 0.6715728F, 24.0F, 1.5F);
      ((Path)localObject2).lineTo(24.0F, 46.5F);
      ((Path)localObject2).cubicTo(24.0F, 47.328426F, 23.328426F, 48.0F, 22.5F, 48.0F);
      ((Path)localObject2).lineTo(21.5F, 48.0F);
      ((Path)localObject2).cubicTo(20.671574F, 48.0F, 20.0F, 47.328426F, 20.0F, 46.5F);
      ((Path)localObject2).lineTo(20.0F, 1.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */