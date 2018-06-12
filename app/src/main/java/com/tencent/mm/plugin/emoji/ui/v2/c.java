package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.emoji.a.h;
import com.tencent.mm.sdk.platformtools.x;

public class c
  extends a
{
  public final com.tencent.mm.plugin.emoji.a.a.a aFf()
  {
    return new h(getContext());
  }
  
  public final int aFm()
  {
    return 9;
  }
  
  public final boolean aGk()
  {
    return false;
  }
  
  protected int getLayoutId()
  {
    return R.i.emoji_store_v2_person_fm;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onAttach");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreate");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreateView");
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
  }
  
  public void onDetach()
  {
    super.onDetach();
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
  }
  
  public void onPause()
  {
    super.onPause();
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onPause");
  }
  
  public void onResume()
  {
    super.onResume();
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
    if (this.ioS != null) {
      this.ioS.aGm();
    }
  }
  
  public void onStart()
  {
    super.onStart();
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStart");
  }
  
  public void onStop()
  {
    super.onStop();
    x.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStop");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */