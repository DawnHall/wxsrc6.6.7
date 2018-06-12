package com.tencent.mm.plugin.card.sharecard.model;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.mm.g.c.dq;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.b.e;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.protocal.c.bng;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.kz;
import com.tencent.mm.protocal.c.la;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;

public class ShareCardInfo
  extends dq
  implements Parcelable, com.tencent.mm.plugin.card.base.b
{
  public static final Parcelable.Creator<ShareCardInfo> CREATOR = new ShareCardInfo.1();
  protected static c.a dhO;
  public String huZ = "";
  public lf hvZ;
  public kx hwa;
  public bng hwb;
  public la hwc;
  public boolean hwd = true;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[19];
    locala.columns = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.sKA.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "card_id";
    locala.columns[1] = "card_tp_id";
    locala.sKA.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "from_username";
    locala.sKA.put("from_username", "TEXT");
    localStringBuilder.append(" from_username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "consumer";
    locala.sKA.put("consumer", "TEXT");
    localStringBuilder.append(" consumer TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "app_id";
    locala.sKA.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "status";
    locala.sKA.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "share_time";
    locala.sKA.put("share_time", "LONG");
    localStringBuilder.append(" share_time LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "local_updateTime";
    locala.sKA.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "updateTime";
    locala.sKA.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "begin_time";
    locala.sKA.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "end_time";
    locala.sKA.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "updateSeq";
    locala.sKA.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "block_mask";
    locala.sKA.put("block_mask", "LONG");
    localStringBuilder.append(" block_mask LONG");
    localStringBuilder.append(", ");
    locala.columns[13] = "dataInfoData";
    locala.sKA.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "cardTpInfoData";
    locala.sKA.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "shareInfoData";
    locala.sKA.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[16] = "shopInfoData";
    locala.sKA.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[17] = "categoryType";
    locala.sKA.put("categoryType", "INTEGER default '0' ");
    localStringBuilder.append(" categoryType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "itemIndex";
    locala.sKA.put("itemIndex", "INTEGER default '0' ");
    localStringBuilder.append(" itemIndex INTEGER default '0' ");
    locala.columns[19] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public ShareCardInfo() {}
  
  public ShareCardInfo(Parcel paramParcel)
  {
    this.field_card_id = paramParcel.readString();
    this.field_card_tp_id = paramParcel.readString();
    this.field_from_username = paramParcel.readString();
    this.field_status = paramParcel.readInt();
    this.field_share_time = paramParcel.readLong();
    this.field_local_updateTime = paramParcel.readLong();
    this.field_updateTime = paramParcel.readLong();
    this.field_updateSeq = paramParcel.readLong();
    this.field_block_mask = paramParcel.readLong();
    this.field_end_time = paramParcel.readLong();
    this.field_categoryType = paramParcel.readInt();
    this.field_itemIndex = paramParcel.readInt();
    int k = paramParcel.readInt();
    int i;
    if (k > 0)
    {
      this.field_dataInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_dataInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_cardTpInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_cardTpInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_shareInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_shareInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_shopInfoData = new byte[k];
      i = j;
      while (i < k)
      {
        this.field_shopInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final void a(kx paramkx)
  {
    this.hwa = paramkx;
    if (this.hwa != null) {}
    try
    {
      this.field_dataInfoData = paramkx.toByteArray();
      return;
    }
    catch (Exception paramkx)
    {
      x.e("MicroMsg.ShareCardInfo", "setDataInfo fail, ex = %s", new Object[] { paramkx.getMessage() });
      x.printErrStackTrace("MicroMsg.ShareCardInfo", paramkx, "", new Object[0]);
    }
  }
  
  public final void a(la paramla)
  {
    this.hwc = paramla;
    try
    {
      this.field_shopInfoData = paramla.toByteArray();
      return;
    }
    catch (Exception paramla)
    {
      x.e("MicroMsg.ShareCardInfo", "setShopInfo fail, ex = %s", new Object[] { paramla.getMessage() });
      x.printErrStackTrace("MicroMsg.ShareCardInfo", paramla, "", new Object[0]);
    }
  }
  
  public final boolean avR()
  {
    return (awm() != null) && (awm().rnX == 0);
  }
  
  public final boolean avS()
  {
    return (awm() != null) && (awm().rnX == 1);
  }
  
  public final boolean avT()
  {
    return (awm() != null) && (awm().huV == 10);
  }
  
  public final boolean avU()
  {
    return (awm() != null) && (awm().huV == 0);
  }
  
  public final boolean avV()
  {
    return (awm() != null) && (awm().huV == 20);
  }
  
  public final boolean avW()
  {
    return (awm() != null) && (awm().huV == 11);
  }
  
  public final boolean avX()
  {
    return (awm() != null) && (awm().huV == 30);
  }
  
  public final boolean avY()
  {
    return l.nI(awm().huV);
  }
  
  public final boolean avZ()
  {
    return (awm().rnN & 0x2) == 0;
  }
  
  public final boolean awa()
  {
    return (awm().rnN & 0x1) == 0;
  }
  
  public final boolean awb()
  {
    return (awm().rnQ & 1L) == 0L;
  }
  
  public final boolean awc()
  {
    return (awm().rnQ & 0x10) == 0L;
  }
  
  public final boolean awd()
  {
    return (awm().rnQ & 0x2) > 0L;
  }
  
  public final boolean awe()
  {
    return false;
  }
  
  public final boolean awf()
  {
    return (awm().rnQ & 0x4) > 0L;
  }
  
  public final boolean awg()
  {
    return (awm().rnQ & 0x8) > 0L;
  }
  
  public final boolean awh()
  {
    return (awm() != null) && (awm().roc == 1);
  }
  
  public final boolean awi()
  {
    return (this.hwa != null) && (this.hwa.status == 0);
  }
  
  public final boolean awj()
  {
    if (!awi()) {}
    do
    {
      return false;
      if (this.hvZ != null) {
        x.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.hvZ.rod);
      }
      x.i("MicroMsg.ShareCardInfo", "avail_num:" + this.hwa.rnb);
      if ((this.hvZ != null) && (this.hvZ.rod == 1)) {
        return true;
      }
      if (this.hwa.rnb > 0) {
        return true;
      }
    } while (((this.hvZ != null) && (this.hvZ.rod == 0)) || (this.hwa.rnb != 0));
    return false;
  }
  
  public final boolean awk()
  {
    if ((this.hvZ == null) || (this.hvZ.rnU == null) || (TextUtils.isEmpty(this.hvZ.rnU.text))) {}
    kz localkz;
    int i;
    int j;
    do
    {
      return false;
      localkz = this.hvZ.rnU;
      i = (int)(System.currentTimeMillis() / 1000L);
      j = localkz.mXw;
    } while ((localkz.mXw <= 0) || (j - i <= 0));
    return true;
  }
  
  public final boolean awl()
  {
    return (this.hvZ != null) && (this.hvZ.roh == 1);
  }
  
  public final lf awm()
  {
    if (this.hvZ != null) {
      return this.hvZ;
    }
    try
    {
      this.hvZ = ((lf)new lf().aG(this.field_cardTpInfoData));
      return this.hvZ;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ShareCardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
      x.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
    }
    return new lf();
  }
  
  public final kx awn()
  {
    if (this.hwa != null) {
      return this.hwa;
    }
    try
    {
      this.hwa = ((kx)new kx().aG(this.field_dataInfoData));
      return this.hwa;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ShareCardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
      x.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
    }
    return new kx();
  }
  
  public final bng awo()
  {
    if (this.hwb != null) {
      return this.hwb;
    }
    try
    {
      this.hwb = ((bng)new bng().aG(this.field_shareInfoData));
      return this.hwb;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ShareCardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
      x.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
    }
    return new bng();
  }
  
  public final la awp()
  {
    if (this.hwc != null) {
      return this.hwc;
    }
    try
    {
      this.hwc = ((la)new la().aG(this.field_shopInfoData));
      return this.hwc;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ShareCardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
      x.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final String awq()
  {
    return this.field_card_id;
  }
  
  public final String awr()
  {
    return this.field_card_tp_id;
  }
  
  public final String aws()
  {
    return this.field_from_username;
  }
  
  public final long awt()
  {
    return this.field_local_updateTime;
  }
  
  public final String awu()
  {
    return "";
  }
  
  public final int awv()
  {
    return this.field_categoryType;
  }
  
  public final String aww()
  {
    x.d("MicroMsg.ShareCardInfo", "encrypt_code:" + this.huZ);
    return this.huZ;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final long getEndTime()
  {
    return this.field_end_time;
  }
  
  public final boolean isAcceptable()
  {
    if (!awi()) {}
    do
    {
      return false;
      if (this.hvZ != null) {
        x.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.hvZ.rod);
      }
      x.i("MicroMsg.ShareCardInfo", "stock_num:" + this.hwa.rne + " limit_num:" + this.hwa.rnf);
      if ((this.hvZ != null) && (this.hvZ.rod == 1)) {
        return true;
      }
    } while (((this.hvZ != null) && (this.hvZ.rod == 0)) || (this.hwa.rne == 0L) || (this.hwa.rnf != 0));
    return false;
  }
  
  public final String nF(int paramInt)
  {
    if (paramInt == 10) {
      return (String)am.axn().getValue("key_share_card_local_city");
    }
    if (paramInt == 0)
    {
      if (com.tencent.mm.plugin.card.sharecard.a.b.axH()) {
        return ad.getResources().getString(a.g.card_share_card_category_type_other_city);
      }
      return "";
    }
    return "";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    paramParcel.writeString(this.field_card_id);
    paramParcel.writeString(this.field_card_tp_id);
    paramParcel.writeString(this.field_from_username);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeLong(this.field_share_time);
    paramParcel.writeLong(this.field_local_updateTime);
    paramParcel.writeLong(this.field_updateTime);
    paramParcel.writeLong(this.field_updateSeq);
    paramParcel.writeLong(this.field_block_mask);
    paramParcel.writeLong(this.field_end_time);
    paramParcel.writeInt(this.field_categoryType);
    paramParcel.writeInt(this.field_itemIndex);
    if (this.field_dataInfoData != null)
    {
      paramParcel.writeInt(this.field_dataInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_dataInfoData.length)
      {
        paramParcel.writeByte(this.field_dataInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_cardTpInfoData != null)
    {
      paramParcel.writeInt(this.field_cardTpInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_cardTpInfoData.length)
      {
        paramParcel.writeByte(this.field_cardTpInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_shareInfoData != null)
    {
      paramParcel.writeInt(this.field_shareInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_shareInfoData.length)
      {
        paramParcel.writeByte(this.field_shareInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_shopInfoData != null)
    {
      paramParcel.writeInt(this.field_shopInfoData.length);
      paramInt = i;
      while (paramInt < this.field_shopInfoData.length)
      {
        paramParcel.writeByte(this.field_shopInfoData[paramInt]);
        paramInt += 1;
      }
    }
  }
  
  public final void xa(String paramString)
  {
    this.field_from_username = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/ShareCardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */