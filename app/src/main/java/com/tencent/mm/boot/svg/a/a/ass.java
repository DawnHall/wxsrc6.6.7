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

public final class ass
  extends c
{
  private final int height = 279;
  private final int width = 279;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 279;
      return 279;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -401.0F, 0.0F, 1.0F, -470.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 390.0F, 0.0F, 1.0F, 470.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-2245500);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(279.0F, 141.22223F);
      ((Path)localObject2).cubicTo(279.0F, 62.454666F, 216.54533F, 0.0F, 137.77777F, 0.0F);
      ((Path)localObject2).cubicTo(62.454666F, 0.0F, 0.0F, 62.454666F, 0.0F, 141.22223F);
      ((Path)localObject2).cubicTo(0.0F, 216.54533F, 62.454666F, 279.0F, 137.77777F, 279.0F);
      ((Path)localObject2).cubicTo(216.54533F, 279.0F, 279.0F, 216.54533F, 279.0F, 141.22223F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(69.47473F, 146.5967F);
      ((Path)localObject1).lineTo(75.88924F, 137.86859F);
      ((Path)localObject1).cubicTo(76.37983F, 137.20105F, 77.31869F, 137.0576F, 77.98622F, 137.5482F);
      ((Path)localObject1).cubicTo(77.99435F, 137.55417F, 78.0024F, 137.56023F, 78.01041F, 137.56635F);
      ((Path)localObject1).lineTo(115.591606F, 166.3702F);
      ((Path)localObject1).cubicTo(116.14801F, 166.79663F, 116.92558F, 166.78082F, 117.464195F, 166.33212F);
      ((Path)localObject1).lineTo(208.74998F, 90.283676F);
      ((Path)localObject1).cubicTo(209.34323F, 89.78945F, 210.21474F, 89.826324F, 210.76411F, 90.36889F);
      ((Path)localObject1).lineTo(216.78378F, 96.313896F);
      ((Path)localObject1).cubicTo(217.37321F, 96.89602F, 217.37914F, 97.84574F, 216.79703F, 98.43517F);
      ((Path)localObject1).cubicTo(216.79202F, 98.44024F, 216.78699F, 98.44527F, 216.78192F, 98.45026F);
      ((Path)localObject1).lineTo(117.6191F, 196.04128F);
      ((Path)localObject1).cubicTo(117.028656F, 196.62236F, 116.07894F, 196.61478F, 115.49785F, 196.02432F);
      ((Path)localObject1).cubicTo(115.49463F, 196.02106F, 115.491425F, 196.01776F, 115.488235F, 196.01447F);
      ((Path)localObject1).lineTo(69.6047F, 148.52728F);
      ((Path)localObject1).cubicTo(69.09662F, 148.00145F, 69.04172F, 147.18588F, 69.47473F, 146.5967F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */