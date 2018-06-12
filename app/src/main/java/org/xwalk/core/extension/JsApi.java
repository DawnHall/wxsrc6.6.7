package org.xwalk.core.extension;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
public @interface JsApi
{
  boolean isEntryPoint() default false;
  
  boolean isEventList() default false;
  
  boolean isWritable() default false;
  
  boolean withPromise() default false;
  
  String wrapArgs() default "";
  
  String wrapReturns() default "";
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/org/xwalk/core/extension/JsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */