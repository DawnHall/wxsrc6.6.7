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

public final class mp
  extends c
{
  private final int height = 60;
  private final int width = 60;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 60;
      return 60;
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
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(60.0F, 0.0F);
      ((Path)localObject).lineTo(60.0F, 60.0F);
      ((Path)localObject).lineTo(0.0F, 60.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(9.0F, 14.380721F);
      localPath.cubicTo(9.0F, 11.409031F, 11.404006F, 9.0F, 14.380721F, 9.0F);
      localPath.lineTo(46.619278F, 9.0F);
      localPath.cubicTo(49.59097F, 9.0F, 52.0F, 11.404006F, 52.0F, 14.380721F);
      localPath.lineTo(52.0F, 46.619278F);
      localPath.cubicTo(52.0F, 49.59097F, 49.595993F, 52.0F, 46.619278F, 52.0F);
      localPath.lineTo(14.380721F, 52.0F);
      localPath.cubicTo(11.409031F, 52.0F, 9.0F, 49.595993F, 9.0F, 46.619278F);
      localPath.lineTo(9.0F, 14.380721F);
      localPath.lineTo(9.0F, 14.380721F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-964550);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(6.0F, 12.006387F);
      ((Path)localObject).cubicTo(6.0F, 8.689151F, 8.683541F, 6.0F, 12.006387F, 6.0F);
      ((Path)localObject).lineTo(47.993614F, 6.0F);
      ((Path)localObject).cubicTo(51.31085F, 6.0F, 54.0F, 8.683541F, 54.0F, 12.006387F);
      ((Path)localObject).lineTo(54.0F, 47.993614F);
      ((Path)localObject).cubicTo(54.0F, 51.31085F, 51.31646F, 54.0F, 47.993614F, 54.0F);
      ((Path)localObject).lineTo(12.006387F, 54.0F);
      ((Path)localObject).cubicTo(8.689151F, 54.0F, 6.0F, 51.31646F, 6.0F, 47.993614F);
      ((Path)localObject).lineTo(6.0F, 12.006387F);
      ((Path)localObject).lineTo(6.0F, 12.006387F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 32.576923F);
      ((Path)localObject).lineTo(16.2F, 28.538462F);
      ((Path)localObject).lineTo(25.0F, 36.923077F);
      ((Path)localObject).lineTo(43.8F, 19.0F);
      ((Path)localObject).lineTo(48.0F, 23.038462F);
      ((Path)localObject).lineTo(25.0F, 45.0F);
      ((Path)localObject).lineTo(12.0F, 32.576923F);
      ((Path)localObject).lineTo(12.0F, 32.576923F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/mp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */