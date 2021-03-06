package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.tencent.mm.plugin.game.f.b;

public class GameRoundImageView
  extends AppCompatImageView
{
  private static final PorterDuffXfermode kbG = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
  private Bitmap bitmap;
  private RectF kbE;
  private Bitmap kbF;
  private Rect rect;
  
  public GameRoundImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setColor(-1);
    if (this.rect == null) {
      this.rect = new Rect(0, 0, getWidth(), getHeight());
    }
    if (this.kbE == null) {
      this.kbE = new RectF(this.rect);
    }
    if ((this.bitmap != null) && (this.kbF != null))
    {
      int i = paramCanvas.saveLayer(0.0F, 0.0F, getWidth(), getHeight(), null, 31);
      paramCanvas.drawBitmap(this.kbF, this.rect, this.rect, localPaint);
      localPaint.setXfermode(kbG);
      paramCanvas.drawBitmap(this.bitmap, null, this.rect, localPaint);
      paramCanvas.restoreToCount(i);
      localPaint.setXfermode(null);
    }
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(1.0F);
    localPaint.setColor(getResources().getColor(f.b.game_image_stroke_color));
    paramCanvas.drawRoundRect(this.kbE, 18.0F, 18.0F, localPaint);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.kbE = new RectF(0.0F, 0.0F, paramInt1, paramInt2);
    this.rect = new Rect(0, 0, paramInt1, paramInt2);
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(1);
    localPaint.setColor(-1);
    localCanvas.drawRoundRect(this.kbE, 18.0F, 18.0F, localPaint);
    this.kbF = localBitmap;
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.bitmap = paramBitmap;
    super.setImageBitmap(paramBitmap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameRoundImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */