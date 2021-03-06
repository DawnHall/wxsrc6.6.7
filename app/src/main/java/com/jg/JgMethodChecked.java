package com.jg;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
public @interface JgMethodChecked
{
  int author();
  
  String fComment();
  
  String lastDate();
  
  int level() default 1;
  
  int reviewer();
  
  EType[] vComment();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/jg/JgMethodChecked.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */