package com.tencent.mm.plugin.wallet_payu.a;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.wallet_core.ui.h;
import com.tencent.mm.plugin.wallet_core.ui.h.a;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class c
{
  public static void a(Context paramContext, TextView paramTextView)
  {
    if ((paramContext != null) && (paramTextView != null)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      h localh1 = new h(paramContext);
      localh1.pvm = new h.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          x.i("MicroMsg.PayUUtil", "hy: user clicked the span");
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://www.payu.co.za/wechat/terms-and-conditions/");
          paramAnonymousView.putExtra("showShare", false);
          d.b(this.val$context, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        }
      };
      h localh2 = new h(paramContext);
      localh2.pvm = new c.2(paramContext);
      paramContext = paramContext.getText(a.i.wallet_payu_start_introduction).toString();
      SpannableString localSpannableString = new SpannableString(paramContext);
      localSpannableString.setSpan(localh1, 94, 115, 33);
      localSpannableString.setSpan(localh2, paramContext.length() - 3, paramContext.length(), 33);
      paramTextView.setText(localSpannableString);
      paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */