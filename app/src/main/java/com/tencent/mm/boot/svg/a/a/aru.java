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

public final class aru
  extends c
{
  private final int height = 48;
  private final int width = 48;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 48;
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(16.966213F, 24.12567F);
      ((Path)localObject).lineTo(18.380426F, 25.539883F);
      ((Path)localObject).lineTo(15.993941F, 27.926369F);
      ((Path)localObject).cubicTo(14.794056F, 29.126255F, 14.782134F, 31.04559F, 15.949747F, 32.213203F);
      ((Path)localObject).cubicTo(17.117361F, 33.380817F, 19.036695F, 33.368896F, 20.236582F, 32.16901F);
      ((Path)localObject).lineTo(25.009554F, 27.396038F);
      ((Path)localObject).cubicTo(26.20944F, 26.196152F, 26.221361F, 24.276817F, 25.053747F, 23.109203F);
      ((Path)localObject).lineTo(26.46796F, 21.69499F);
      ((Path)localObject).cubicTo(28.420582F, 23.647612F, 28.400795F, 26.833223F, 26.423767F, 28.810251F);
      ((Path)localObject).lineTo(21.650795F, 33.58322F);
      ((Path)localObject).cubicTo(19.673767F, 35.560253F, 16.488155F, 35.58004F, 14.535534F, 33.62742F);
      ((Path)localObject).cubicTo(12.582912F, 31.674795F, 12.602699F, 28.489183F, 14.579728F, 26.512156F);
      ((Path)localObject).lineTo(16.966213F, 24.12567F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(33.58322F, 21.650795F);
      ((Path)localObject).lineTo(31.196737F, 24.037281F);
      ((Path)localObject).lineTo(29.782524F, 22.623068F);
      ((Path)localObject).lineTo(32.16901F, 20.236582F);
      ((Path)localObject).cubicTo(33.368896F, 19.036695F, 33.380817F, 17.117361F, 32.213203F, 15.949747F);
      ((Path)localObject).cubicTo(31.04559F, 14.782134F, 29.126255F, 14.794056F, 27.926369F, 15.993941F);
      ((Path)localObject).lineTo(23.153399F, 20.766912F);
      ((Path)localObject).cubicTo(21.953512F, 21.966799F, 21.94159F, 23.886133F, 23.109203F, 25.053747F);
      ((Path)localObject).lineTo(21.69499F, 26.46796F);
      ((Path)localObject).cubicTo(19.742369F, 24.515339F, 19.762156F, 21.329727F, 21.739183F, 19.3527F);
      ((Path)localObject).lineTo(26.512156F, 14.579728F);
      ((Path)localObject).cubicTo(28.489183F, 12.602699F, 31.674795F, 12.582912F, 33.62742F, 14.535534F);
      ((Path)localObject).cubicTo(35.58004F, 16.488155F, 35.560253F, 19.673767F, 33.58322F, 21.650795F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */