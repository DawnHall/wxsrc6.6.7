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

public final class tr
  extends c
{
  private final int height = 48;
  private final int width = 52;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 52;
      return 48;
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
      localPaint.setColor(58033);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(14.181818F, 0.0F);
      ((Path)localObject).cubicTo(7.043382F, 0.0F, 2.0274723E-7F, 6.794741F, 0.0F, 19.047619F);
      ((Path)localObject).cubicTo(-2.0274723E-7F, 30.949684F, 12.336814F, 43.475533F, 26.0F, 48.0F);
      ((Path)localObject).cubicTo(40.098804F, 43.475533F, 52.0F, 30.618835F, 52.0F, 19.047619F);
      ((Path)localObject).cubicTo(52.0F, 6.463891F, 45.245247F, 1.657497E-7F, 37.81818F, 0.0F);
      ((Path)localObject).cubicTo(31.004267F, -1.4875212E-7F, 28.267746F, 2.4507387F, 26.0F, 4.7619047F);
      ((Path)localObject).cubicTo(23.75256F, 2.4507387F, 20.412228F, 0.0F, 14.181818F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(15.702877F, 6.3492064F);
      ((Path)localObject).cubicTo(11.534709F, 6.3492064F, 6.3030305F, 10.766748F, 6.3030305F, 18.896448F);
      ((Path)localObject).cubicTo(6.3030305F, 27.026146F, 14.82103F, 37.12266F, 26.0F, 40.857143F);
      ((Path)localObject).cubicTo(37.535385F, 37.12266F, 45.696968F, 25.122057F, 45.696968F, 18.896448F);
      ((Path)localObject).cubicTo(45.696968F, 12.670838F, 41.74611F, 6.3492064F, 35.669422F, 6.3492064F);
      ((Path)localObject).cubicTo(30.0944F, 6.3492064F, 27.220886F, 12.0678F, 26.0F, 14.285714F);
      ((Path)localObject).cubicTo(24.840904F, 12.0678F, 19.871044F, 6.3492064F, 15.702877F, 6.3492064F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */