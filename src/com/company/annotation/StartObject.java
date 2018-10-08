package com.company.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)// данная анотация будет использоваться во время работы программы
@Target(value = {ElementType.METHOD})// для описания методов
public @interface StartObject {

}
