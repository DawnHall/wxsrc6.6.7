package com.tencent.mm.pluginsdk.model;

import android.os.Bundle;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.plugin.fav.PluginFav;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.report.f;

public class d
  implements a
{
  public final void k(Bundle paramBundle)
  {
    int k = paramBundle.getInt("mm_rpt_fav_id", 0);
    int m = paramBundle.getInt("key_detail_fav_scene", 0);
    int n = paramBundle.getInt("key_detail_fav_sub_scene", 0);
    int i1 = paramBundle.getInt("key_detail_fav_index", 0);
    long l2 = paramBundle.getLong("key_activity_browse_time", -1L);
    int i;
    int i2;
    int i3;
    if (paramBundle.getBoolean("mm_scroll_bottom"))
    {
      i = 1;
      i2 = paramBundle.getInt("mm_send_friend_count", 0);
      i3 = paramBundle.getInt("mm_share_sns_count", 0);
      if (!paramBundle.getBoolean("mm_del_fav", false)) {
        break label246;
      }
    }
    int i4;
    String str1;
    String str2;
    com.tencent.mm.plugin.fav.a.g localg;
    label246:
    for (int j = 1;; j = 0)
    {
      i4 = paramBundle.getInt("mm_edit_fav_count", 0);
      str1 = paramBundle.getString("key_detail_fav_query", "");
      str2 = paramBundle.getString("key_detail_fav_sessionid", "");
      paramBundle = paramBundle.getString("key_detail_fav_tags", "");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavWebRptCallback", "FavWebRptCallback uiBrowseTime[%d] isScrollBottom[%b] sendToFriendCount[%d] shareSnsCount[%d]  isDelFav[%b] clickEditFavTagCount[%d] favId[%s]", new Object[] { Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(j), Integer.valueOf(i4), Integer.valueOf(k) });
      localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(k);
      if (localg != null) {
        break label251;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavWebRptCallback", "fav web rpt but favitem info is null favid[%d]", new Object[] { Integer.valueOf(k) });
      return;
      i = 0;
      break;
    }
    label251:
    if (localg.field_sourceCreateTime != 0L) {}
    for (long l1 = localg.field_sourceCreateTime / 1000L;; l1 = localg.field_updateTime / 1000L)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(m).append(",");
      localStringBuffer.append(i1).append(",");
      localStringBuffer.append(k).append(",");
      localStringBuffer.append(localg.field_type).append(",");
      localStringBuffer.append("0,");
      localStringBuffer.append(localg.field_sourceType).append(",");
      localStringBuffer.append(l1).append(",");
      localStringBuffer.append(l2).append(",");
      localStringBuffer.append("0,");
      localStringBuffer.append("0,");
      localStringBuffer.append("0,");
      localStringBuffer.append(i2).append(",");
      localStringBuffer.append(i3).append(",");
      localStringBuffer.append("0,");
      localStringBuffer.append(i4).append(",");
      localStringBuffer.append(j).append(",");
      localStringBuffer.append(i).append(",");
      localStringBuffer.append(n).append(",");
      localStringBuffer.append(str2).append(",");
      i = ((PluginFav)com.tencent.mm.kernel.g.n(PluginFav.class)).getFavItemInfoStorage().pL(k) + 1;
      localStringBuffer.append(i).append(",");
      localStringBuffer.append(str1).append(",");
      localStringBuffer.append(paramBundle);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavWebRptCallback", String.format("lxl, 15098, sid:%s, sourcepos:%s, query:%s, tag:%s", new Object[] { str2, Integer.valueOf(i), str1, paramBundle }));
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavWebRptCallback", "FavWebRptCallback rpt id[%d] [%s]", new Object[] { Integer.valueOf(15098), localStringBuffer.toString() });
      f.mDy.k(15098, localStringBuffer.toString());
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */