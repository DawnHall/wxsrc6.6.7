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

public final class dr
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
      float[] arrayOfFloat = c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -1463.0F, 0.0F, 1.0F, -215.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 1463.0F, 0.0F, 1.0F, 215.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(8.0F);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(72.0F, 52.0F);
      ((Path)localObject2).lineTo(77.1435F, 52.0F);
      ((Path)localObject2).cubicTo(80.375984F, 52.0F, 81.20154F, 50.09575F, 78.983025F, 47.746735F);
      ((Path)localObject2).lineTo(53.01697F, 20.253265F);
      ((Path)localObject2).cubicTo(50.80398F, 17.910099F, 47.201538F, 17.904251F, 44.98303F, 20.253265F);
      ((Path)localObject2).lineTo(19.016973F, 47.746735F);
      ((Path)localObject2).cubicTo(16.803982F, 50.0899F, 17.622042F, 52.0F, 20.856497F, 52.0F);
      ((Path)localObject2).lineTo(26.0F, 52.0F);
      ((Path)localObject2).lineTo(26.0F, 74.07317F);
      ((Path)localObject2).cubicTo(26.0F, 75.69759F, 27.31177F, 77.0F, 28.92992F, 77.0F);
      ((Path)localObject2).lineTo(69.070076F, 77.0F);
      ((Path)localObject2).cubicTo(70.69741F, 77.0F, 72.0F, 75.68961F, 72.0F, 74.07317F);
      ((Path)localObject2).lineTo(72.0F, 52.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(54.0F, 63.0F);
      ((Path)localObject1).lineTo(54.0F, 74.0F);
      ((Path)localObject1).lineTo(45.0F, 74.0F);
      ((Path)localObject1).lineTo(45.0F, 63.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */