package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class testAnnotation {
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Retention(RetentionPolicy.RUNTIME)
  public @interface myAnnotation {
    String name();

    int age() default 19;

    String[] address();
  }

  @myAnnotation(
      name = "xx",
      address = {"xx", "sf"})
  public void test() {}
}
