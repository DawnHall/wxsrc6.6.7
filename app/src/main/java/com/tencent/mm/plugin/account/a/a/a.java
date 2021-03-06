package com.tencent.mm.plugin.account.a.a;

import android.app.Activity;
import android.content.Context;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.m;
import java.util.LinkedList;

public abstract interface a
  extends d
{
  public abstract void clearFriendData();
  
  public abstract m getAddrUploadStg();
  
  public abstract j getFacebookFrdStg();
  
  public abstract j getFrdExtStg();
  
  public abstract LinkedList getFriendData();
  
  public abstract j getGoogleFriendStorage();
  
  public abstract j getInviteFriendOpenStg();
  
  public abstract String getPhoneNum(Context paramContext, String paramString);
  
  public abstract j getQQGroupStg();
  
  public abstract m getQQListStg();
  
  public abstract void removeSelfAccount(Context paramContext);
  
  public abstract void setFriendData(LinkedList paramLinkedList);
  
  public abstract void showAddrBookUploadConfirm(Activity paramActivity, Runnable paramRunnable, boolean paramBoolean, int paramInt);
  
  public abstract boolean syncAddrBook(b paramb);
  
  public abstract void syncAddrBookAndUpload();
  
  public abstract void syncUploadMContactStatus(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void updateAllContact();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */