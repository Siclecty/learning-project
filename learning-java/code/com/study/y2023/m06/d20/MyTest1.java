package com.learn.d11_annotation;

public @interface MyTest1 {
    String aa();
    boolean bb() default true;
    String[] cc();
}
