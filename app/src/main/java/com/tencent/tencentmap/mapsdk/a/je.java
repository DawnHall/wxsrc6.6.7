package com.tencent.tencentmap.mapsdk.a;

import android.opengl.GLU;
import android.opengl.Matrix;
import com.tencent.map.lib.gl.model.c;
import com.tencent.map.lib.gl.model.d;

public class je
{
  private static final String[] a = { "北", "东北", "东", "东南", "南", "西南", "西", "西北" };
  
  private static d a(float[] paramArrayOfFloat)
  {
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    float f5 = paramArrayOfFloat[4];
    float f6 = paramArrayOfFloat[5];
    float f7 = paramArrayOfFloat[6];
    float f8 = paramArrayOfFloat[7];
    float f9 = paramArrayOfFloat[8];
    paramArrayOfFloat = new float[3];
    float[] arrayOfFloat1 = new float[3];
    float[] arrayOfFloat2 = new float[3];
    arrayOfFloat1[0] = (f4 - f1);
    arrayOfFloat1[1] = (f5 - f2);
    arrayOfFloat1[2] = (f6 - f3);
    arrayOfFloat2[0] = (f7 - f1);
    arrayOfFloat2[1] = (f8 - f2);
    arrayOfFloat2[2] = (f9 - f3);
    paramArrayOfFloat[0] = (arrayOfFloat1[1] * arrayOfFloat2[2] - arrayOfFloat1[2] * arrayOfFloat2[1]);
    paramArrayOfFloat[1] = (arrayOfFloat1[2] * arrayOfFloat2[0] - arrayOfFloat1[0] * arrayOfFloat2[2]);
    paramArrayOfFloat[2] = (arrayOfFloat1[0] * arrayOfFloat2[1] - arrayOfFloat1[1] * arrayOfFloat2[0]);
    return new d(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2]);
  }
  
  public static boolean a(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int[] paramArrayOfInt)
  {
    d locald = a(paramArrayOfFloat1);
    float[] arrayOfFloat2 = new float[16];
    Matrix.setIdentityM(arrayOfFloat2, 0);
    float[] arrayOfFloat1 = a(paramFloat1, paramFloat2, 0.0F, arrayOfFloat2, paramArrayOfFloat2, paramArrayOfInt);
    paramArrayOfFloat2 = a(paramFloat1, paramFloat2, 1.0F, arrayOfFloat2, paramArrayOfFloat2, paramArrayOfInt);
    int i = 0;
    while (i < 3)
    {
      arrayOfFloat1[i] /= arrayOfFloat1[3];
      paramArrayOfFloat2[i] /= paramArrayOfFloat2[3];
      i += 1;
    }
    paramArrayOfFloat2 = new d(paramArrayOfFloat2[0] - arrayOfFloat1[0], paramArrayOfFloat2[1] - arrayOfFloat1[1], paramArrayOfFloat2[2] - arrayOfFloat1[2]);
    paramArrayOfInt = locald.a();
    paramFloat1 = paramArrayOfFloat1[0];
    paramFloat2 = paramArrayOfFloat1[1];
    float f1 = paramArrayOfFloat1[2];
    paramArrayOfFloat2 = paramArrayOfFloat2.a();
    float f2 = arrayOfFloat1[0];
    float f3 = arrayOfFloat1[1];
    float f4 = arrayOfFloat1[2];
    paramArrayOfFloat2 = a(paramArrayOfInt, new float[] { paramFloat1, paramFloat2, f1 }, paramArrayOfFloat2, new float[] { f2, f3, f4 });
    if (paramArrayOfFloat2 == null) {
      return false;
    }
    return a(paramArrayOfFloat2, paramArrayOfFloat1);
  }
  
  private static boolean a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    return new c(paramArrayOfFloat2).a(paramArrayOfFloat1);
  }
  
  public static float[] a(float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int[] paramArrayOfInt)
  {
    float[] arrayOfFloat = new float[4];
    if (GLU.gluUnProject(paramFloat1, paramArrayOfInt[3] - paramFloat2, paramFloat3, paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, paramArrayOfInt, 0, arrayOfFloat, 0) != 1) {
      throw new RuntimeException("unProject fail");
    }
    return arrayOfFloat;
  }
  
  public static float[] a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float[] paramArrayOfFloat4)
  {
    float f7 = paramArrayOfFloat1[0];
    float f8 = paramArrayOfFloat1[1];
    float f9 = paramArrayOfFloat1[2];
    float f10 = paramArrayOfFloat2[0];
    float f11 = paramArrayOfFloat2[1];
    float f12 = paramArrayOfFloat2[2];
    float f1 = paramArrayOfFloat3[0];
    float f2 = paramArrayOfFloat3[1];
    float f3 = paramArrayOfFloat3[2];
    float f4 = paramArrayOfFloat4[0];
    float f5 = paramArrayOfFloat4[1];
    float f6 = paramArrayOfFloat4[2];
    float f13 = f1 * f7 + f2 * f8 + f3 * f9;
    if (f13 == 0.0F) {
      return null;
    }
    f7 = (f7 * (f10 - f4) + f8 * (f11 - f5) + (f12 - f6) * f9) / f13;
    return new float[] { f1 * f7 + f4, f2 * f7 + f5, f7 * f3 + f6 };
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/je.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */