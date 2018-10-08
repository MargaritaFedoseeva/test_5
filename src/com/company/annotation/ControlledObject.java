package com.company.annotation;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)//для описания типов
public @interface ControlledObject {
    String name();
}
