package com.citi;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)          
public @interface MyAnnotation {
    String value() default "Default message";
    int count() default 1;
}
