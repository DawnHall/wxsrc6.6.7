package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;

public final class j
{
  private static final int qCu = i.b.qCq.bWA;
  private static final int qCv = i.b.qCs.bWA;
  private static final int qCw = i.b.qCr.bWA;
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, String paramString)
  {
    int j = qCv;
    if (paramBoolean) {}
    for (int i = 0;; i = 1)
    {
      a(paramInt1, paramInt2, "", paramInt3, j, i, a.qCy - 1, 1, 1, 1, paramString);
      return;
    }
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString)
  {
    int n = qCw;
    int i;
    int i1;
    int j;
    label25:
    int k;
    if (paramBoolean1)
    {
      i = 0;
      i1 = a.qCy;
      if (!paramBoolean3) {
        break label72;
      }
      j = 0;
      if (!paramBoolean2) {
        break label78;
      }
      k = 0;
      label33:
      if (!paramBoolean4) {
        break label84;
      }
    }
    label72:
    label78:
    label84:
    for (int m = 0;; m = 1)
    {
      a(paramInt1, paramInt2, "", paramInt3, n, i, i1 - 1, j, k, m, paramString);
      return;
      i = 1;
      break;
      j = 1;
      break label25;
      k = 1;
      break label33;
    }
  }
  
  private static void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, String paramString2)
  {
    h.mEJ.h(11906, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), Integer.valueOf(paramInt9) });
    if ((!bi.oW(paramString2)) && (!paramString2.equals("0"))) {
      h.mEJ.h(11907, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), Integer.valueOf(paramInt9), paramString2 });
    }
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2)
  {
    int m = qCu;
    int i;
    int j;
    if (paramBoolean2)
    {
      i = 0;
      if (!paramBoolean3) {
        break label58;
      }
      j = 0;
      label21:
      if (!paramBoolean1) {
        break label64;
      }
    }
    label58:
    label64:
    for (int k = 0;; k = 1)
    {
      a(paramInt1, paramInt2, paramString1, paramInt3, m, i, paramInt4 - 1, j, 1, k, paramString2);
      return;
      i = 1;
      break;
      j = 1;
      break label21;
    }
  }
  
  public static void fN(long paramLong)
  {
    n(paramLong, 2L);
  }
  
  public static void n(long paramLong1, long paramLong2)
  {
    if ((paramLong1 > 0L) && (197L != paramLong1)) {
      h.mEJ.a(paramLong1, paramLong2, 1L, false);
    }
    h.mEJ.a(197L, paramLong2, 1L, false);
  }
  
  public static enum a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */