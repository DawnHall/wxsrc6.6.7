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

public final class qy
  extends c
{
  private final int height = 27;
  private final int width = 27;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 27;
      return 27;
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
      ((Paint)localObject).setColor(-772816);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(27.0F, 13.666667F);
      localPath.cubicTo(27.0F, 6.044F, 20.956F, 0.0F, 13.333333F, 0.0F);
      localPath.cubicTo(6.044F, 0.0F, 0.0F, 6.044F, 0.0F, 13.666667F);
      localPath.cubicTo(0.0F, 20.956F, 6.044F, 27.0F, 13.333333F, 27.0F);
      localPath.cubicTo(20.956F, 27.0F, 27.0F, 20.956F, 27.0F, 13.666667F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(13.5F, 6.0F);
      ((Path)localObject).cubicTo(14.334203F, 6.0F, 14.962531F, 6.674437F, 14.916311F, 7.5063977F);
      ((Path)localObject).lineTo(14.5F, 15.0F);
      ((Path)localObject).lineTo(12.5F, 15.0F);
      ((Path)localObject).lineTo(12.083689F, 7.5063977F);
      ((Path)localObject).cubicTo(12.037581F, 6.6764627F, 12.671573F, 6.0F, 13.5F, 6.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(13.5F, 20.0F);
      ((Path)localObject).cubicTo(12.671573F, 20.0F, 12.0F, 19.328426F, 12.0F, 18.5F);
      ((Path)localObject).cubicTo(12.0F, 17.671574F, 12.671573F, 17.0F, 13.5F, 17.0F);
      ((Path)localObject).cubicTo(14.328427F, 17.0F, 15.0F, 17.671574F, 15.0F, 18.5F);
      ((Path)localObject).cubicTo(15.0F, 19.328426F, 14.328427F, 20.0F, 13.5F, 20.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/qy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */