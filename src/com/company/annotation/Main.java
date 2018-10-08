package com.company.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**/
        Cookies c = new Cookies();
        System.out.println(c.getClass().getAnnotation(ControlledObject.class).name());
        /**/
        System.out.println(Arrays.toString(c.getClass().getAnnotations()));
        /**/
        Annotation[] a = c.getClass().getAnnotations();
        for (Annotation aa : a) {
            if (aa.annotationType().getSimpleName().equalsIgnoreCase("ControlledObject")) {
                System.out.println(((ControlledObject) aa).name());
                System.out.println(((ControlledObject) aa).def());
            }
        }

        /**/
        Method[] m = c.getClass().getMethods();
        for (Method mm : m) {
            System.out.println(mm.getName() + ":" + mm.isAnnotationPresent(StartObject.class));
            System.out.println(mm.getName() + ":" + mm.isAnnotationPresent(StopObject.class));
        }
        System.out.println("------------------");
        m = c.getClass().getDeclaredMethods();
        for (Method mm : m) {
            System.out.println(mm.getName() + ":" + mm.isAnnotationPresent(StartObject.class));
            System.out.println(mm.getName() + ":" + mm.isAnnotationPresent(StopObject.class));
        }
        /**/
        System.out.println(c.getClass().getAnnotationsByType(ControlledObject.class));
    }
}
