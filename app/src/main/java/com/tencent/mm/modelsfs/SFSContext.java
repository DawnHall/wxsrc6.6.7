package com.tencent.mm.modelsfs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SFSContext
{
  public long mNativePtr;
  
  private SFSContext(Builder paramBuilder)
  {
    Iterator localIterator = paramBuilder.mConf.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject instanceof Integer)) {
        nativeSetIntConf(i, ((Integer)localObject).intValue());
      } else if ((localObject instanceof String)) {
        nativeSetStringConf(i, (String)localObject);
      } else if ((localObject instanceof int[])) {
        nativeSetIntArrayConf(i, (int[])localObject);
      }
    }
    long l = nativeInit(paramBuilder.mName);
    if (l == 0L) {
      throw new RuntimeException(nativeErrorMessage());
    }
    this.mNativePtr = l;
  }
  
  static native int nativeClear(long paramLong);
  
  static native String nativeErrorMessage();
  
  static native boolean nativeExists(long paramLong, String paramString);
  
  private static native long nativeInit(String paramString);
  
  private static native int nativeList(long paramLong, String paramString, List<FileEntry> paramList);
  
  private static native long nativeOpenRead(long paramLong, String paramString);
  
  private static native long nativeOpenWrite(long paramLong, String paramString);
  
  private static native void nativeRelease(long paramLong);
  
  private static native void nativeSetIntArrayConf(int paramInt, int[] paramArrayOfInt);
  
  private static native void nativeSetIntConf(int paramInt1, int paramInt2);
  
  private static native void nativeSetStringConf(int paramInt, String paramString);
  
  private static native FileEntry nativeStat(long paramLong, String paramString);
  
  static native Statistics nativeStatistics(long paramLong);
  
  private static native boolean nativeUnlink(long paramLong, String paramString);
  
  public final OutputStream aw(String paramString1, String paramString2)
  {
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    long l = nativeOpenWrite(this.mNativePtr, paramString1);
    if (l == 0L) {
      throw new IOException(paramString1 + ": " + nativeErrorMessage());
    }
    if (!TextUtils.isEmpty(paramString2)) {
      return new e(l, paramString2);
    }
    return new SFSOutputStream(l);
  }
  
  protected void finalize()
  {
    if (this.mNativePtr != 0L) {
      release();
    }
    super.finalize();
  }
  
  public final boolean jy(String paramString)
  {
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    String str = paramString;
    if (f.mP(paramString))
    {
      f.mR(paramString);
      str = f.mQ(paramString);
    }
    return nativeUnlink(this.mNativePtr, str);
  }
  
  public final List<FileEntry> mT(String paramString)
  {
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    ArrayList localArrayList = new ArrayList();
    if (nativeList(this.mNativePtr, paramString, localArrayList) != 0) {
      throw new IOException(nativeErrorMessage());
    }
    return localArrayList;
  }
  
  public final FileEntry mU(String paramString)
  {
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    String str = paramString;
    if (f.mP(paramString))
    {
      f.mR(paramString);
      str = f.mQ(paramString);
    }
    return nativeStat(this.mNativePtr, str);
  }
  
  public final InputStream openRead(String paramString)
  {
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    long l1;
    if (f.mP(paramString))
    {
      l1 = f.mR(paramString);
      paramString = f.mQ(paramString);
    }
    for (;;)
    {
      long l2 = nativeOpenRead(this.mNativePtr, paramString);
      if (l2 == 0L) {
        throw new FileNotFoundException(paramString + ": " + nativeErrorMessage());
      }
      if (l1 != 0L) {
        return new d(l2, l1);
      }
      return new SFSInputStream(l2);
      l1 = 0L;
    }
  }
  
  public final void release()
  {
    nativeRelease(this.mNativePtr);
    this.mNativePtr = 0L;
  }
  
  public static class Builder
    implements Parcelable
  {
    public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator()
    {
      public final SFSContext.Builder createFromParcel(Parcel paramAnonymousParcel)
      {
        return new SFSContext.Builder(paramAnonymousParcel, null);
      }
      
      public final SFSContext.Builder[] newArray(int paramAnonymousInt)
      {
        return new SFSContext.Builder[paramAnonymousInt];
      }
    };
    HashMap<Integer, Object> mConf;
    String mName;
    
    public Builder()
    {
      this.mName = null;
      this.mConf = new HashMap();
    }
    
    private Builder(Parcel paramParcel)
    {
      this.mName = paramParcel.readString();
      this.mConf = new HashMap();
      paramParcel = paramParcel.readArray(Builder.class.getClassLoader());
      if (paramParcel != null)
      {
        int i = 0;
        while (i < paramParcel.length)
        {
          if (paramParcel[i] != null) {
            this.mConf.put(Integer.valueOf(i), paramParcel[i]);
          }
          i += 1;
        }
      }
    }
    
    public SFSContext create()
    {
      return new SFSContext(this, (byte)0);
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public Builder setBlockFileMaxSize(int paramInt)
    {
      this.mConf.put(Integer.valueOf(4), Integer.valueOf(paramInt));
      return this;
    }
    
    public Builder setBlockFilePrefix(String paramString)
    {
      this.mConf.put(Integer.valueOf(2), paramString);
      return this;
    }
    
    public Builder setBlockSizeArray(int[] paramArrayOfInt)
    {
      this.mConf.put(Integer.valueOf(5), paramArrayOfInt);
      return this;
    }
    
    public Builder setConnectionPool(int paramInt)
    {
      this.mConf.put(Integer.valueOf(7), Integer.valueOf(paramInt));
      return this;
    }
    
    public Builder setDBDirectory(String paramString)
    {
      String str = paramString;
      if (paramString.endsWith("/")) {
        str = paramString.substring(0, paramString.length() - 1);
      }
      this.mConf.put(Integer.valueOf(1), str + "/%s.index");
      return this;
    }
    
    public Builder setIOMode(int paramInt)
    {
      this.mConf.put(Integer.valueOf(9), Integer.valueOf(paramInt));
      return this;
    }
    
    public Builder setIndexDBPath(String paramString)
    {
      this.mConf.put(Integer.valueOf(1), paramString);
      return this;
    }
    
    public Builder setMaxConcurrentIO(int paramInt)
    {
      this.mConf.put(Integer.valueOf(10), Integer.valueOf(paramInt));
      return this;
    }
    
    public Builder setName(String paramString)
    {
      this.mName = paramString;
      return this;
    }
    
    public Builder setOverflowPrefix(String paramString)
    {
      this.mConf.put(Integer.valueOf(3), paramString);
      return this;
    }
    
    public Builder setStoragePath(String paramString)
    {
      String str = paramString;
      if (paramString.endsWith("/")) {
        str = paramString.substring(0, paramString.length() - 1);
      }
      this.mConf.put(Integer.valueOf(2), str + "/%s.block");
      this.mConf.put(Integer.valueOf(3), str + "/%s/");
      return this;
    }
    
    public Builder setSyncMode(int paramInt)
    {
      this.mConf.put(Integer.valueOf(11), Integer.valueOf(paramInt));
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.mName);
      Object[] arrayOfObject = new Object[12];
      Iterator localIterator = this.mConf.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramInt = ((Integer)localEntry.getKey()).intValue();
        if ((paramInt < 12) && (paramInt >= 0)) {
          arrayOfObject[paramInt] = localEntry.getValue();
        }
      }
      paramParcel.writeArray(arrayOfObject);
    }
  }
  
  public static class FileEntry
  {
    public String name;
    public long size;
    public long timestamp;
  }
  
  public static class Statistics
    implements Serializable
  {
    private static final long serialVersionUID = 1L;
    public BlockFile[] blockFiles;
    public long blockSizeEmpty;
    public long blockSizeUsed;
    public BlockType[] blockTypes;
    public long overflowActualSize;
    public long totalActualSize;
    
    public String toString()
    {
      int k = 0;
      StringBuilder localStringBuilder = new StringBuilder(4096);
      localStringBuilder.append("Total:\n\tActualSize: ").append(this.totalActualSize).append('\n').append("\tUsedBlockSize: ").append(this.blockSizeUsed).append('\n').append("\tEmptyBlockSize: ").append(this.blockSizeEmpty).append('\n').append("\tOverflowSize: ").append(this.overflowActualSize).append('\n');
      int i = 0;
      int j;
      Object localObject;
      for (;;)
      {
        j = k;
        if (i >= this.blockTypes.length) {
          break;
        }
        localObject = this.blockTypes[i];
        localStringBuilder.append("BlockType: ").append(((BlockType)localObject).blockSize).append('\n').append("\tUsedCount: ").append(((BlockType)localObject).usedCount).append('\n').append("\tEmptyCount: ").append(((BlockType)localObject).emptyCount).append('\n').append("\tActualSize: ").append(((BlockType)localObject).actualSize).append('\n');
        i += 1;
      }
      while (j < this.blockFiles.length)
      {
        localObject = this.blockFiles[j];
        localStringBuilder.append("BlockFile: ").append(j).append('\n').append("\tFileSize: ").append(((BlockFile)localObject).fileSize).append('\n').append("\tUsedBlockCount: ").append(((BlockFile)localObject).blockCount).append('\n').append("\tEmptyBlockCount: ").append(((BlockFile)localObject).emptyCount).append('\n').append("\tTimestamp: ").append(((BlockFile)localObject).timestamp).append('\n').append("\tDeleted: ").append(((BlockFile)localObject).deleted).append('\n');
        j += 1;
      }
      return localStringBuilder.toString();
    }
    
    public static class BlockFile
      implements Serializable
    {
      private static final long serialVersionUID = 1L;
      public int blockCount;
      public boolean deleted;
      public int emptyCount;
      public long fileSize;
      public long timestamp;
    }
    
    public static class BlockType
      implements Serializable
    {
      private static final long serialVersionUID = 1L;
      public long actualSize;
      public int blockSize;
      public int emptyCount;
      public int usedCount;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/SFSContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */