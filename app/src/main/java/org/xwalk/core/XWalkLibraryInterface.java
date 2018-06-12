package org.xwalk.core;

abstract interface XWalkLibraryInterface
{
  public static final int STATUS_APK_MISMATCH = 9;
  public static final int STATUS_APK_VERSION_INVAILD = 10;
  public static final int STATUS_ARCHITECTURE_MISMATCH = 6;
  public static final int STATUS_INCOMPLETE_LIBRARY = 5;
  public static final int STATUS_MATCH = 1;
  public static final int STATUS_NEWER_VERSION = 4;
  public static final int STATUS_NOT_FOUND = 2;
  public static final int STATUS_OLDER_VERSION = 3;
  public static final int STATUS_PENDING = 0;
  public static final int STATUS_RUNTIME_MISMATCH = 8;
  public static final int STATUS_SIGNATURE_CHECK_ERROR = 7;
  public static final String XWALK_CORE64_IA_PACKAGE = "org.xwalk.core64.ia";
  public static final String XWALK_CORE64_PACKAGE = "org.xwalk.core64";
  public static final String XWALK_CORE_IA_PACKAGE = "org.xwalk.core.ia";
  public static final String XWALK_CORE_PACKAGE = "org.xwalk.core";
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/org/xwalk/core/XWalkLibraryInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */