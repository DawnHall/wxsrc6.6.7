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

public final class lp
  extends c
{
  private final int height = 42;
  private final int width = 42;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 42;
      return 42;
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(3.1751997F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(1.5875999F, 2.1751997F);
      ((Path)localObject2).cubicTo(1.5875999F, 1.2983925F, 2.2983925F, 0.5875999F, 3.1751997F, 0.5875999F);
      ((Path)localObject2).lineTo(38.8248F, 0.5875999F);
      ((Path)localObject2).cubicTo(39.701607F, 0.5875999F, 40.4124F, 1.2983925F, 40.4124F, 2.1751997F);
      ((Path)localObject2).lineTo(40.4124F, 27.8248F);
      ((Path)localObject2).cubicTo(40.4124F, 28.701607F, 39.701607F, 29.412401F, 38.8248F, 29.412401F);
      ((Path)localObject2).lineTo(3.1751997F, 29.412401F);
      ((Path)localObject2).cubicTo(2.2983925F, 29.412401F, 1.5875999F, 28.701607F, 1.5875999F, 27.8248F);
      ((Path)localObject2).lineTo(1.5875999F, 2.1751997F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-5066062);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(31.32F, 14.56F);
      ((Path)localObject1).lineTo(26.1F, 19.735F);
      ((Path)localObject1).lineTo(28.188F, 23.875F);
      ((Path)localObject1).lineTo(13.572F, 10.42F);
      ((Path)localObject1).lineTo(0.0F, 22.84F);
      ((Path)localObject1).lineTo(0.0F, 29.05F);
      ((Path)localObject1).lineTo(40.716F, 29.05F);
      ((Path)localObject1).lineTo(40.716F, 22.84F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/lp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */