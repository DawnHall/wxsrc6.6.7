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

public final class aax
  extends c
{
  private final int height = 108;
  private final int width = 108;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 108;
      return 108;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 23.0F, 0.0F, 1.0F, 25.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-15683841);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(58.94128F, 18.34375F);
      ((Path)localObject2).lineTo(2.708721F, 11.0F);
      ((Path)localObject2).cubicTo(1.116907F, 11.0F, -0.175F, 12.316F, -0.175F, 13.938969F);
      ((Path)localObject2).lineTo(-0.175F, 47.71875F);
      ((Path)localObject2).cubicTo(-0.175F, 49.34172F, 1.116907F, 50.65625F, 2.708721F, 50.65625F);
      ((Path)localObject2).lineTo(58.94128F, 58.0F);
      ((Path)localObject2).cubicTo(60.533092F, 58.0F, 61.825F, 56.68547F, 61.825F, 55.0625F);
      ((Path)localObject2).lineTo(61.825F, 21.28125F);
      ((Path)localObject2).cubicTo(61.825F, 19.65975F, 60.533092F, 18.34375F, 58.94128F, 18.34375F);
      ((Path)localObject2).lineTo(58.94128F, 18.34375F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11742937);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(60.825F, 2.7197444F);
      ((Path)localObject1).cubicTo(60.697964F, 1.1690818F, 58.744793F, -0.117698714F, 57.168396F, 0.008567508F);
      ((Path)localObject1).lineTo(4.3879986F, 7.349033F);
      ((Path)localObject1).cubicTo(4.1931143F, 7.364639F, 4.0054483F, 7.400107F, 3.825F, 7.4497623F);
      ((Path)localObject1).lineTo(60.825F, 14.0F);
      ((Path)localObject1).lineTo(60.825F, 2.7197444F);
      ((Path)localObject1).lineTo(60.825F, 2.7197444F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */