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

public final class tb
  extends c
{
  private final int height = 68;
  private final int width = 68;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 68;
      return 68;
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
      arrayOfFloat = c.a(arrayOfFloat, 1.1333333F, 0.0F, 0.0F, 0.0F, 1.1333333F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-16777216);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(24.0F, 6.0F);
      ((Path)localObject2).lineTo(24.0F, 13.582962F);
      ((Path)localObject2).cubicTo(24.0F, 16.068243F, 26.014719F, 18.082962F, 28.5F, 18.082962F);
      ((Path)localObject2).cubicTo(30.985281F, 18.082962F, 33.0F, 16.068243F, 33.0F, 13.582962F);
      ((Path)localObject2).lineTo(33.0F, 6.0F);
      ((Path)localObject2).cubicTo(36.54742F, 7.710701F, 39.0F, 11.381189F, 39.0F, 15.633177F);
      ((Path)localObject2).cubicTo(39.0F, 19.693186F, 36.763893F, 23.223017F, 33.473682F, 25.022778F);
      ((Path)localObject2).lineTo(33.473682F, 49.026318F);
      ((Path)localObject2).cubicTo(33.473682F, 51.773205F, 31.24689F, 54.0F, 28.5F, 54.0F);
      ((Path)localObject2).cubicTo(25.75311F, 54.0F, 23.526316F, 51.773205F, 23.526316F, 49.026318F);
      ((Path)localObject2).lineTo(23.526316F, 25.022778F);
      ((Path)localObject2).cubicTo(20.236107F, 23.223017F, 18.0F, 19.693186F, 18.0F, 15.633177F);
      ((Path)localObject2).cubicTo(18.0F, 11.381189F, 20.45258F, 7.710701F, 24.0F, 6.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */