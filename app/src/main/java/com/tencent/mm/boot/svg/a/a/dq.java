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

public final class dq
  extends c
{
  private final int height = 120;
  private final int width = 120;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 120;
      return 120;
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
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -921.0F, 0.0F, 1.0F, -39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 921.0F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(855638016);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 60.0F);
      ((Path)localObject2).cubicTo(0.0F, 26.862915F, 26.862915F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 0.0F);
      ((Path)localObject2).cubicTo(93.137085F, 0.0F, 120.0F, 26.862915F, 120.0F, 60.0F);
      ((Path)localObject2).lineTo(120.0F, 60.0F);
      ((Path)localObject2).cubicTo(120.0F, 93.137085F, 93.137085F, 120.0F, 60.0F, 120.0F);
      ((Path)localObject2).lineTo(60.0F, 120.0F);
      ((Path)localObject2).cubicTo(26.862915F, 120.0F, 0.0F, 93.137085F, 0.0F, 60.0F);
      ((Path)localObject2).lineTo(0.0F, 60.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(40.5F, 60.75F);
      ((Path)localObject1).cubicTo(40.5F, 64.47735F, 37.47735F, 67.5F, 33.75F, 67.5F);
      ((Path)localObject1).cubicTo(30.02265F, 67.5F, 27.0F, 64.47735F, 27.0F, 60.75F);
      ((Path)localObject1).cubicTo(27.0F, 57.0213F, 30.02265F, 54.0F, 33.75F, 54.0F);
      ((Path)localObject1).cubicTo(37.47735F, 54.0F, 40.5F, 57.0213F, 40.5F, 60.75F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(59.25F, 49.5F);
      ((Path)localObject1).cubicTo(65.46225F, 49.5F, 70.5F, 54.5355F, 70.5F, 60.75F);
      ((Path)localObject1).cubicTo(70.5F, 66.96225F, 65.46225F, 72.0F, 59.25F, 72.0F);
      ((Path)localObject1).cubicTo(53.03775F, 72.0F, 48.0F, 66.96225F, 48.0F, 60.75F);
      ((Path)localObject1).cubicTo(48.0F, 54.5355F, 53.03775F, 49.5F, 59.25F, 49.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(93.0F, 60.75F);
      ((Path)localObject1).cubicTo(93.0F, 64.47735F, 89.97735F, 67.5F, 86.25F, 67.5F);
      ((Path)localObject1).cubicTo(82.52265F, 67.5F, 79.5F, 64.47735F, 79.5F, 60.75F);
      ((Path)localObject1).cubicTo(79.5F, 57.0213F, 82.52265F, 54.0F, 86.25F, 54.0F);
      ((Path)localObject1).cubicTo(89.97735F, 54.0F, 93.0F, 57.0213F, 93.0F, 60.75F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */