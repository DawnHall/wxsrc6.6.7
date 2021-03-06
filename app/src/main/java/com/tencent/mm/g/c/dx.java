package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dx
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjY = "snsId".hashCode();
  private static final int cjZ = "userName".hashCode();
  private static final int cka = "localFlag".hashCode();
  private static final int ckb = "createTime".hashCode();
  private static final int ckc = "head".hashCode();
  private static final int ckd = "localPrivate".hashCode();
  private static final int cke = "type".hashCode();
  private static final int ckf = "sourceType".hashCode();
  private static final int ckg = "likeFlag".hashCode();
  private static final int ckh = "pravited".hashCode();
  private static final int cki = "stringSeq".hashCode();
  private static final int ckj = "content".hashCode();
  private static final int ckk = "attrBuf".hashCode();
  private static final int ckl = "postBuf".hashCode();
  private static final int cks = "subType".hashCode();
  private boolean cjC = true;
  private boolean cjD = true;
  private boolean cjE = true;
  private boolean cjF = true;
  private boolean cjG = true;
  private boolean cjH = true;
  private boolean cjI = true;
  private boolean cjJ = true;
  private boolean cjK = true;
  private boolean cjL = true;
  private boolean cjM = true;
  private boolean cjN = true;
  private boolean cjO = true;
  private boolean cjP = true;
  private boolean cjW = true;
  public byte[] field_attrBuf;
  public byte[] field_content;
  public int field_createTime;
  public int field_head;
  public int field_likeFlag;
  public int field_localFlag;
  public int field_localPrivate;
  public byte[] field_postBuf;
  public int field_pravited;
  public long field_snsId;
  public int field_sourceType;
  public String field_stringSeq;
  public int field_subType;
  public int field_type;
  public String field_userName;
  
  public void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cjY != k) {
        break label60;
      }
      this.field_snsId = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cjZ == k) {
        this.field_userName = paramCursor.getString(i);
      } else if (cka == k) {
        this.field_localFlag = paramCursor.getInt(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getInt(i);
      } else if (ckc == k) {
        this.field_head = paramCursor.getInt(i);
      } else if (ckd == k) {
        this.field_localPrivate = paramCursor.getInt(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ckf == k) {
        this.field_sourceType = paramCursor.getInt(i);
      } else if (ckg == k) {
        this.field_likeFlag = paramCursor.getInt(i);
      } else if (ckh == k) {
        this.field_pravited = paramCursor.getInt(i);
      } else if (cki == k) {
        this.field_stringSeq = paramCursor.getString(i);
      } else if (ckj == k) {
        this.field_content = paramCursor.getBlob(i);
      } else if (ckk == k) {
        this.field_attrBuf = paramCursor.getBlob(i);
      } else if (ckl == k) {
        this.field_postBuf = paramCursor.getBlob(i);
      } else if (cks == k) {
        this.field_subType = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cjC) {
      localContentValues.put("snsId", Long.valueOf(this.field_snsId));
    }
    if (this.cjD) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.cjE) {
      localContentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Integer.valueOf(this.field_createTime));
    }
    if (this.cjG) {
      localContentValues.put("head", Integer.valueOf(this.field_head));
    }
    if (this.cjH) {
      localContentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cjJ) {
      localContentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
    }
    if (this.cjK) {
      localContentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
    }
    if (this.cjL) {
      localContentValues.put("pravited", Integer.valueOf(this.field_pravited));
    }
    if (this.cjM) {
      localContentValues.put("stringSeq", this.field_stringSeq);
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.cjO) {
      localContentValues.put("attrBuf", this.field_attrBuf);
    }
    if (this.cjP) {
      localContentValues.put("postBuf", this.field_postBuf);
    }
    if (this.cjW) {
      localContentValues.put("subType", Integer.valueOf(this.field_subType));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */