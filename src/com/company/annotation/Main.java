package com.company.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Cookies c=new Cookies();
        System.out.println(c.getClass().getAnnotation(ControlledObject.class).name());
        System.out.println(Arrays.toString(c.getClass().getAnnotations()));
        Annotation[]a=c.getClass().getAnnotations();
        for (Annotation aa:a) {
       if( aa.annotationType().getSimpleName().equalsIgnoreCase("ControlledObject")){
                System.out.println(((ControlledObject)aa).name());
                System.out.println(((ControlledObject)aa).def());
            }
        }
        System.out.println(c.getClass().getAnnotationsByType(ControlledObject.class));
    }
}
