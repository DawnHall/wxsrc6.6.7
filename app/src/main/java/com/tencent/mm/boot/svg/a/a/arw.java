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

public final class arw
  extends c
{
  private final int height = 144;
  private final int width = 144;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 144;
      return 144;
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
      localPaint.setColor(-1);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(72.0F, 130.8F);
      localPath.cubicTo(104.47434F, 130.8F, 130.8F, 104.47434F, 130.8F, 72.0F);
      localPath.cubicTo(130.8F, 39.525658F, 104.47434F, 13.2F, 72.0F, 13.2F);
      localPath.cubicTo(39.525658F, 13.2F, 13.2F, 39.525658F, 13.2F, 72.0F);
      localPath.cubicTo(13.2F, 104.47434F, 39.525658F, 130.8F, 72.0F, 130.8F);
      localPath.close();
      localPath.moveTo(72.0F, 138.0F);
      localPath.cubicTo(35.549206F, 138.0F, 6.0F, 108.45079F, 6.0F, 72.0F);
      localPath.cubicTo(6.0F, 35.549206F, 35.549206F, 6.0F, 72.0F, 6.0F);
      localPath.cubicTo(108.45079F, 6.0F, 138.0F, 35.549206F, 138.0F, 72.0F);
      localPath.cubicTo(138.0F, 108.45079F, 108.45079F, 138.0F, 72.0F, 138.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(72.0F, 106.8F);
      ((Path)localObject).cubicTo(91.21951F, 106.8F, 106.8F, 91.21951F, 106.8F, 72.0F);
      ((Path)localObject).cubicTo(106.8F, 52.78049F, 91.21951F, 37.2F, 72.0F, 37.2F);
      ((Path)localObject).cubicTo(52.78049F, 37.2F, 37.2F, 52.78049F, 37.2F, 72.0F);
      ((Path)localObject).cubicTo(37.2F, 91.21951F, 52.78049F, 106.8F, 72.0F, 106.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(72.0F, 114.0F);
      ((Path)localObject).cubicTo(48.80404F, 114.0F, 30.0F, 95.19596F, 30.0F, 72.0F);
      ((Path)localObject).cubicTo(30.0F, 48.80404F, 48.80404F, 30.0F, 72.0F, 30.0F);
      ((Path)localObject).cubicTo(95.19596F, 30.0F, 114.0F, 48.80404F, 114.0F, 72.0F);
      ((Path)localObject).cubicTo(114.0F, 95.19596F, 95.19596F, 114.0F, 72.0F, 114.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/arw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */