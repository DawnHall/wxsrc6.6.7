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

public final class vk
  extends c
{
  private final int height = 24;
  private final int width = 24;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 24;
      return 24;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      localCanvas.save();
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -175.0F, 0.0F, 1.0F, -368.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-11048043);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 339.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(179.0F, 40.0F);
      ((Path)localObject2).lineTo(179.0F, 30.0F);
      ((Path)localObject2).cubicTo(179.0F, 29.447716F, 179.44771F, 29.0F, 180.0F, 29.0F);
      ((Path)localObject2).cubicTo(180.55229F, 29.0F, 181.0F, 29.447716F, 181.0F, 30.0F);
      ((Path)localObject2).lineTo(181.0F, 40.0F);
      ((Path)localObject2).lineTo(191.0F, 40.0F);
      ((Path)localObject2).cubicTo(191.55229F, 40.0F, 192.0F, 40.447716F, 192.0F, 41.0F);
      ((Path)localObject2).cubicTo(192.0F, 41.552284F, 191.55229F, 42.0F, 191.0F, 42.0F);
      ((Path)localObject2).lineTo(181.0F, 42.0F);
      ((Path)localObject2).lineTo(181.0F, 52.0F);
      ((Path)localObject2).cubicTo(181.0F, 52.552284F, 180.55229F, 53.0F, 180.0F, 53.0F);
      ((Path)localObject2).cubicTo(179.44771F, 53.0F, 179.0F, 52.552284F, 179.0F, 52.0F);
      ((Path)localObject2).lineTo(179.0F, 42.0F);
      ((Path)localObject2).lineTo(169.0F, 42.0F);
      ((Path)localObject2).cubicTo(168.44771F, 42.0F, 168.0F, 41.552284F, 168.0F, 41.0F);
      ((Path)localObject2).cubicTo(168.0F, 40.447716F, 168.44771F, 40.0F, 169.0F, 40.0F);
      ((Path)localObject2).lineTo(179.0F, 40.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/vk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */