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

public final class arb
  extends c
{
  private final int height = 240;
  private final int width = 240;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 240;
      return 240;
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
      ((Paint)localObject).setColor(-407039);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(120.0F, 0.0F);
      localPath.cubicTo(186.27417F, 0.0F, 240.0F, 53.72583F, 240.0F, 120.0F);
      localPath.cubicTo(240.0F, 186.27417F, 186.27417F, 240.0F, 120.0F, 240.0F);
      localPath.cubicTo(53.72583F, 240.0F, 0.0F, 186.27417F, 0.0F, 120.0F);
      localPath.cubicTo(0.0F, 53.72583F, 53.72583F, 0.0F, 120.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(120.0F, 21.0F);
      localPath.cubicTo(174.6762F, 21.0F, 219.0F, 65.32381F, 219.0F, 120.0F);
      localPath.cubicTo(219.0F, 174.6762F, 174.6762F, 219.0F, 120.0F, 219.0F);
      localPath.cubicTo(65.32381F, 219.0F, 21.0F, 174.6762F, 21.0F, 120.0F);
      localPath.cubicTo(21.0F, 65.32381F, 65.32381F, 21.0F, 120.0F, 21.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 102, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject, paramVarArgs));
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-407039);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(125.57143F, 108.0F);
      ((Path)localObject).lineTo(142.28572F, 72.0F);
      ((Path)localObject).lineTo(159.0F, 72.0F);
      ((Path)localObject).lineTo(142.28572F, 108.0F);
      ((Path)localObject).lineTo(159.0F, 108.0F);
      ((Path)localObject).lineTo(159.0F, 123.0F);
      ((Path)localObject).lineTo(126.0F, 123.0F);
      ((Path)localObject).lineTo(126.0F, 135.0F);
      ((Path)localObject).lineTo(159.0F, 135.0F);
      ((Path)localObject).lineTo(159.0F, 150.0F);
      ((Path)localObject).lineTo(126.0F, 150.0F);
      ((Path)localObject).lineTo(126.0F, 171.0F);
      ((Path)localObject).lineTo(114.0F, 171.0F);
      ((Path)localObject).lineTo(114.0F, 150.0F);
      ((Path)localObject).lineTo(81.0F, 150.0F);
      ((Path)localObject).lineTo(81.0F, 135.0F);
      ((Path)localObject).lineTo(114.0F, 135.0F);
      ((Path)localObject).lineTo(114.0F, 123.0F);
      ((Path)localObject).lineTo(81.0F, 123.0F);
      ((Path)localObject).lineTo(81.0F, 108.0F);
      ((Path)localObject).lineTo(97.71429F, 108.0F);
      ((Path)localObject).lineTo(81.0F, 72.0F);
      ((Path)localObject).lineTo(97.71429F, 72.0F);
      ((Path)localObject).lineTo(114.42857F, 108.0F);
      ((Path)localObject).lineTo(125.57143F, 108.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/arb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */