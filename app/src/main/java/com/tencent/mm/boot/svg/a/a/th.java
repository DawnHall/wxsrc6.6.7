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

public final class th
  extends c
{
  private final int height = 120;
  private final int width = 120;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 120;
      return 120;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
      Object localObject4 = c.i(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.FILL);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject4).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      Object localObject5 = c.a((Paint)localObject4, paramVarArgs);
      ((Paint)localObject5).setColor(-1);
      localCanvas.save();
      localObject5 = c.a((Paint)localObject5, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(60.0F, 0.0F);
      localPath.lineTo(90.0F, 30.0F);
      localPath.lineTo(90.0F, 116.0F);
      localPath.cubicTo(90.0F, 118.20914F, 88.20914F, 120.0F, 86.0F, 120.0F);
      localPath.lineTo(4.0F, 120.0F);
      localPath.cubicTo(1.790861F, 120.0F, 2.705415E-16F, 118.20914F, 0.0F, 116.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.cubicTo(-2.705415E-16F, 1.790861F, 1.790861F, 4.0581224E-16F, 4.0F, 0.0F);
      localPath.lineTo(60.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject5);
      localCanvas.restore();
      localObject5 = c.a((Paint)localObject4, paramVarArgs);
      ((Paint)localObject5).setColor(201326592);
      localCanvas.save();
      localObject5 = c.a((Paint)localObject5, paramVarArgs);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(60.0F, 0.0F);
      localPath.lineTo(90.0F, 30.0F);
      localPath.lineTo(90.0F, 116.0F);
      localPath.cubicTo(90.0F, 118.20914F, 88.20914F, 120.0F, 86.0F, 120.0F);
      localPath.lineTo(4.0F, 120.0F);
      localPath.cubicTo(1.790861F, 120.0F, 2.705415E-16F, 118.20914F, 0.0F, 116.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.cubicTo(-2.705415E-16F, 1.790861F, 1.790861F, 4.0581224E-16F, 4.0F, 0.0F);
      localPath.lineTo(60.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject5);
      localCanvas.restore();
      localObject5 = c.a((Paint)localObject4, paramVarArgs);
      ((Paint)localObject5).setColor(-16777216);
      localObject4 = c.j(paramVarArgs);
      ((Path)localObject4).moveTo(90.0F, 30.0F);
      ((Path)localObject4).lineTo(64.0F, 30.0F);
      ((Path)localObject4).cubicTo(61.79086F, 30.0F, 60.0F, 28.209139F, 60.0F, 26.0F);
      ((Path)localObject4).lineTo(60.0F, 0.0F);
      ((Path)localObject4).lineTo(90.0F, 30.0F);
      ((Path)localObject4).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject5 = c.a((Paint)localObject5, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject5);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-8553091);
      localObject4 = c.a((float[])localObject3, 1.0F, 0.0F, 22.0F, 0.0F, 1.0F, 44.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).setStrokeWidth(2.2881355F);
      localObject4 = c.a((float[])localObject4, 0.70710677F, -0.70710677F, 22.135817F, 0.70710677F, 0.70710677F, -9.168955F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject5 = c.j(paramVarArgs);
      ((Path)localObject5).moveTo(14.207197F, 14.207197F);
      ((Path)localObject5).lineTo(7.4411693F, 36.830467F);
      ((Path)localObject5).lineTo(30.064438F, 30.064438F);
      ((Path)localObject5).lineTo(36.830467F, 7.4411693F);
      ((Path)localObject5).lineTo(14.207197F, 14.207197F);
      ((Path)localObject5).close();
      localCanvas.drawPath((Path)localObject5, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).setStrokeWidth(2.2881355F);
      localObject4 = c.a((float[])localObject4, 0.70710677F, -0.70710677F, 22.135817F, 0.70710677F, 0.70710677F, -9.168955F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(14.207197F, 14.207197F);
      ((Path)localObject1).lineTo(7.4411693F, 36.830467F);
      ((Path)localObject1).lineTo(30.064438F, 30.064438F);
      ((Path)localObject1).lineTo(36.830467F, 7.4411693F);
      ((Path)localObject1).lineTo(14.207197F, 14.207197F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setStrokeWidth(2.4F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(1.5254238F, 28.220339F);
      ((Path)localObject3).lineTo(21.624678F, 38.93592F);
      ((Path)localObject3).cubicTo(22.047419F, 39.172733F, 22.447042F, 39.172733F, 22.823547F, 38.93592F);
      ((Path)localObject3).cubicTo(23.200052F, 38.69911F, 29.506357F, 35.127247F, 41.742462F, 28.220339F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setStrokeWidth(2.4F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(2.0F, 34.0F);
      ((Path)localObject2).lineTo(22.099253F, 44.71558F);
      ((Path)localObject2).cubicTo(22.521996F, 44.952393F, 22.921618F, 44.952393F, 23.298124F, 44.71558F);
      ((Path)localObject2).cubicTo(23.67463F, 44.478767F, 29.980934F, 40.906906F, 42.217037F, 34.0F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */