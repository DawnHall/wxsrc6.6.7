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

public final class bd
  extends c
{
  private final int height = 24;
  private final int width = 24;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 24;
      return 24;
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
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(20.3F, 19.8F);
      ((Path)localObject).lineTo(20.3F, 19.315464F);
      ((Path)localObject).cubicTo(20.3F, 19.08606F, 20.064678F, 18.71002F, 19.85981F, 18.610086F);
      ((Path)localObject).lineTo(14.199456F, 15.84904F);
      ((Path)localObject).cubicTo(12.672874F, 15.104393F, 12.295573F, 13.302913F, 13.389337F, 12.006369F);
      ((Path)localObject).lineTo(13.750869F, 11.577808F);
      ((Path)localObject).cubicTo(14.302195F, 10.924269F, 14.8F, 9.564391F, 14.8F, 8.710186F);
      ((Path)localObject).lineTo(14.8F, 7.0002074F);
      ((Path)localObject).cubicTo(14.8F, 5.454914F, 13.545589F, 4.2F, 12.0F, 4.2F);
      ((Path)localObject).cubicTo(10.456308F, 4.2F, 9.2F, 5.4552026F, 9.2F, 6.9995804F);
      ((Path)localObject).lineTo(9.2F, 8.7092905F);
      ((Path)localObject).cubicTo(9.2F, 9.565664F, 9.695746F, 10.920484F, 10.249079F, 11.576312F);
      ((Path)localObject).lineTo(10.610611F, 12.004812F);
      ((Path)localObject).cubicTo(11.706636F, 13.30386F, 11.325214F, 15.10365F, 9.800719F, 15.847587F);
      ((Path)localObject).lineTo(4.140366F, 18.609777F);
      ((Path)localObject).cubicTo(3.9370172F, 18.70901F, 3.7F, 19.088676F, 3.7F, 19.315464F);
      ((Path)localObject).lineTo(3.7F, 19.8F);
      ((Path)localObject).lineTo(20.3F, 19.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(2.5F, 20.0F);
      ((Path)localObject).lineTo(2.5F, 19.315464F);
      ((Path)localObject).cubicTo(2.5F, 18.630375F, 2.9981508F, 17.831907F, 3.6140976F, 17.531332F);
      ((Path)localObject).lineTo(9.27445F, 14.769143F);
      ((Path)localObject).cubicTo(10.095377F, 14.36854F, 10.286259F, 13.481262F, 9.693445F, 12.778639F);
      ((Path)localObject).lineTo(9.331913F, 12.350138F);
      ((Path)localObject).cubicTo(8.596317F, 11.478285F, 8.0F, 9.849497F, 8.0F, 8.7092905F);
      ((Path)localObject).lineTo(8.0F, 6.9995804F);
      ((Path)localObject).cubicTo(8.0F, 4.7906733F, 9.795356F, 3.0F, 12.0F, 3.0F);
      ((Path)localObject).cubicTo(14.209139F, 3.0F, 16.0F, 4.79298F, 16.0F, 7.0002074F);
      ((Path)localObject).lineTo(16.0F, 8.710186F);
      ((Path)localObject).cubicTo(16.0F, 9.849296F, 15.400932F, 11.482861F, 14.668087F, 12.351573F);
      ((Path)localObject).lineTo(14.306555F, 12.780132F);
      ((Path)localObject).cubicTo(13.717032F, 13.4789505F, 13.901188F, 14.368398F, 14.725549F, 14.770511F);
      ((Path)localObject).lineTo(20.385902F, 17.531557F);
      ((Path)localObject).cubicTo(21.001202F, 17.831692F, 21.5F, 18.62517F, 21.5F, 19.315464F);
      ((Path)localObject).lineTo(21.5F, 20.0F);
      ((Path)localObject).cubicTo(21.5F, 20.552284F, 21.052284F, 21.0F, 20.5F, 21.0F);
      ((Path)localObject).lineTo(3.5F, 21.0F);
      ((Path)localObject).cubicTo(2.9477153F, 21.0F, 2.5F, 20.552284F, 2.5F, 20.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */