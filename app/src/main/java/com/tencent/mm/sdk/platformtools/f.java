package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
public @interface f
{
  Class<? extends Activity>[] chx() default {};
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */