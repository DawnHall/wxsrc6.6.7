package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class km
  extends c
{
  private final int height = 48;
  private final int width = 66;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 66;
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-15683841);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.1875F, 2.88F);
      localPath.cubicTo(0.1875F, 1.2894199F, 1.4769199F, 0.0F, 3.0675F, 0.0F);
      localPath.lineTo(62.9325F, 0.0F);
      localPath.cubicTo(64.52308F, 0.0F, 65.8125F, 1.2894199F, 65.8125F, 2.88F);
      localPath.lineTo(65.8125F, 45.12F);
      localPath.cubicTo(65.8125F, 46.71058F, 64.52308F, 48.0F, 62.9325F, 48.0F);
      localPath.lineTo(3.0675F, 48.0F);
      localPath.cubicTo(1.4769199F, 48.0F, 0.1875F, 46.71058F, 0.1875F, 45.12F);
      localPath.lineTo(0.1875F, 2.88F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(14.4375F, 9.081081F);
      localPath.cubicTo(17.854763F, 9.081081F, 20.625F, 11.69477F, 20.625F, 14.918919F);
      localPath.cubicTo(20.625F, 18.143068F, 17.854763F, 20.756756F, 14.4375F, 20.756756F);
      localPath.cubicTo(11.020238F, 20.756756F, 8.25F, 18.143068F, 8.25F, 14.918919F);
      localPath.cubicTo(8.25F, 11.69477F, 11.020238F, 9.081081F, 14.4375F, 9.081081F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(8.25F, 29.837837F);
      ((Path)localObject).lineTo(55.0F, 29.837837F);
      ((Path)localObject).lineTo(55.0F, 36.705883F);
      ((Path)localObject).lineTo(8.25F, 36.705883F);
      ((Path)localObject).lineTo(8.25F, 29.837837F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/km.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */