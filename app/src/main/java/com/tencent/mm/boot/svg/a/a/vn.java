package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class vn
  extends c
{
  private final int height = 120;
  private final int width = 140;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 140;
      return 120;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      localPaint1 = c.a(localPaint2, paramVarArgs);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.ROUND);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(40246);
      localPaint1.setStrokeWidth(2.0F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 10.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(22.030169F, 30.0F);
      localPath.cubicTo(21.113115F, 70.0F, 41.103058F, 90.0F, 82.0F, 90.0F);
      localPath.cubicTo(79.92564F, 53.785316F, 59.935696F, 33.785316F, 22.030169F, 30.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 162.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(66.01508F, 48.0F);
      ((Path)localObject).cubicTo(65.55656F, 68.0F, 75.55153F, 78.0F, 96.0F, 78.0F);
      ((Path)localObject).cubicTo(94.96282F, 59.89266F, 84.96785F, 49.89266F, 66.01508F, 48.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/vn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */