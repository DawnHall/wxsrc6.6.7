package com.tencent.mm.compatible.util;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exif
{
  public static final int PARSE_EXIF_ERROR_CORRUPT = 1985;
  public static final int PARSE_EXIF_ERROR_NO_EXIF = 1983;
  public static final int PARSE_EXIF_ERROR_NO_JPEG = 1982;
  public static final int PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN = 1984;
  public static final int PARSE_EXIF_SUCCESS = 0;
  private static final String TAG = "MicroMsg.Exif";
  public double altitude = 0.0D;
  public short bitsPerSample;
  public String copyright;
  public String dateTime;
  public String dateTimeDigitized;
  public String dateTimeOriginal;
  public double exposureBiasValue;
  public double exposureTime;
  public double fNumber;
  public int fileSource;
  public byte flash;
  public double focalLength;
  public short focalLengthIn35mm;
  public String imageDescription;
  public int imageHeight;
  public int imageWidth;
  public short isoSpeedRatings;
  public double latitude = -1.0D;
  public double longitude = -1.0D;
  public String make;
  public short meteringMode;
  public String model;
  public short orientation;
  public int sceneType;
  public double shutterSpeedValue;
  public String software;
  public String subSecTimeOriginal;
  public double subjectDistance;
  public String yCbCrSubSampling;
  
  public static Exif fromFile(String paramString)
  {
    Exif localExif = new Exif();
    try
    {
      int i = localExif.parseFromFile(paramString);
      x.i("MicroMsg.Exif", "parse EXIF, result: " + i);
      return localExif;
    }
    catch (IOException paramString)
    {
      x.w("MicroMsg.Exif", "parse EXIF failed: " + paramString.getMessage());
    }
    return localExif;
  }
  
  public static Exif fromStream(InputStream paramInputStream)
  {
    Exif localExif = new Exif();
    try
    {
      int i = localExif.parseFromStream(paramInputStream);
      x.i("MicroMsg.Exif", "parse EXIF, result: " + i);
      return localExif;
    }
    catch (IOException paramInputStream)
    {
      x.w("MicroMsg.Exif", "parse EXIF failed: " + paramInputStream.getMessage());
    }
    return localExif;
  }
  
  private native int nativeParse(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  private native int nativeParseFile(String paramString);
  
  public a getLocation()
  {
    if ((this.latitude < 0.0D) || (this.longitude < 0.0D)) {
      return null;
    }
    return new a(this.latitude, this.longitude, this.altitude);
  }
  
  public int getOrientationInDegree()
  {
    switch (this.orientation)
    {
    case 4: 
    case 5: 
    case 7: 
    default: 
      return 0;
    case 6: 
      return 90;
    case 3: 
      return 180;
    }
    return 270;
  }
  
  public long getUxtimeDatatimeOriginal()
  {
    try
    {
      if (this.dateTimeOriginal == null) {
        return 0L;
      }
      long l = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").parse(this.dateTimeOriginal).getTime() / 1000L;
      return l;
    }
    catch (ParseException localParseException)
    {
      x.printErrStackTrace("MicroMsg.Exif", localParseException, "", new Object[0]);
    }
    return 0L;
  }
  
  public int parseFrom(byte[] paramArrayOfByte)
  {
    return nativeParse(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int parseFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return nativeParse(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public int parseFromFile(String paramString)
  {
    int i;
    if (new File(paramString).exists())
    {
      i = nativeParseFile(paramString);
      x.i("MicroMsg.Exif", "parse EXIF from file on real fs, result: %d, path: %s", new Object[] { Integer.valueOf(i), paramString });
    }
    for (;;)
    {
      return i;
      str = null;
      try
      {
        paramString = FileOp.openRead(paramString);
        str = paramString;
        int j = parseFromStream(paramString);
        i = j;
        if (paramString == null) {
          continue;
        }
        try
        {
          paramString.close();
          return j;
        }
        catch (IOException paramString)
        {
          return j;
        }
        try
        {
          str.close();
          throw paramString;
        }
        catch (IOException localIOException)
        {
          for (;;) {}
        }
      }
      finally
      {
        if (str == null) {}
      }
    }
  }
  
  public int parseFromStream(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[65536];
    int i = paramInputStream.read(arrayOfByte);
    if (i <= 0) {
      return 1982;
    }
    i = nativeParse(arrayOfByte, 0, i);
    x.i("MicroMsg.Exif", "parse EXIF from Stream, ret = " + i);
    return i;
  }
  
  public static final class a
  {
    public double altitude;
    public double latitude;
    public double longitude;
    
    public a(double paramDouble1, double paramDouble2, double paramDouble3)
    {
      this.latitude = paramDouble1;
      this.longitude = paramDouble2;
      this.altitude = paramDouble3;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/Exif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */