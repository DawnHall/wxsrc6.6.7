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

public final class api
  extends c
{
  private final int height = 11;
  private final int width = 6;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 6;
      return 11;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.i(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.i(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject3).setColor(-855310);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -80.0F, 0.0F, 1.0F, -322.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 34.0F, 0.0F, 1.0F, 318.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, -1.0F, 0.0F, 98.0F, 0.0F, -1.0F, 19.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(52.0F, 14.3125F);
      ((Path)localObject1).lineTo(51.30351F, 15.0F);
      ((Path)localObject1).lineTo(46.16417F, 9.9270115F);
      ((Path)localObject1).cubicTo(45.928337F, 9.694224F, 45.92587F, 9.314333F, 46.158653F, 9.078502F);
      ((Path)localObject1).cubicTo(46.16048F, 9.076652F, 46.16232F, 9.074814F, 46.16417F, 9.0729885F);
      ((Path)localObject1).lineTo(51.30351F, 4.0F);
      ((Path)localObject1).lineTo(52.0F, 4.6875F);
      ((Path)localObject1).lineTo(47.124554F, 9.5F);
      ((Path)localObject1).lineTo(52.0F, 14.3125F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/api.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */