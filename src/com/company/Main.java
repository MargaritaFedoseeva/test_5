package com.company;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Class<?> concreteClass = ConcreteClass.class;
        concreteClass=new ConcreteClass(5).getClass();
        try {
            concreteClass=Class.forName("com.company.ConcreteClass");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(concreteClass.getCanonicalName());
        Class<?> booleanClass=boolean.class;
        System.out.println(booleanClass.getCanonicalName());

        Class<?> cDouble=Double.TYPE;
        System.out.println(cDouble.getCanonicalName());

//        Class<?> cDoubleArray=new ConcreteClass(5).getClass();
//        try {
//            cDoubleArray=Class.forName("[D");
//        }catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(cDoubleArray.getCanonicalName());

        Class<?> twoDStringArray=String[][].class;
        System.out.println(twoDStringArray.getCanonicalName());

        try {
            Class<?> superClass=Class.forName("com.company.ConcreteClass").getSuperclass();

            System.out.println(Object.class.getSuperclass());
            System.out.println(String[][].class.getSuperclass());
            System.out.println(superClass);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<?>[] classes=concreteClass.getClasses();
        System.out.println(Arrays.toString(classes));

        try {
            Class<?>[] explicitClasses=Class.forName("com.company.ConcreteClass").getDeclaredClasses();
            System.out.println(Arrays.toString(explicitClasses));

            Class<?> innerClass=Class.forName("com.company.ConcreteClass$ConcreteClassDefaultClass");
            System.out.println(innerClass.getDeclaringClass().getCanonicalName());
            System.out.println(innerClass.getEnclosingClass().getCanonicalName());

            System.out.println(Class.forName("com.company.BaseInterfase").getPackage().getName());

            System.out.println(Modifier.toString(Class.forName("com.company.BaseInterfase").getModifiers()));
            System.out.println(Modifier.toString(concreteClass.getModifiers()));

            TypeVariable<?>[] typeParameters=Class.forName("java.util.HashMap").getTypeParameters();
            for(TypeVariable<?> t:typeParameters) {
                System.out.print(t.getName() + ",");
            }

            Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
            System.out.println(Arrays.toString(interfaces));

            System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));

            Method[] publicMethods = Class.forName("com.company.ConcreteClass").getMethods();
            System.out.println(Arrays.toString(publicMethods));

            Constructor<?>[] publicConstructors = Class.forName("com.company.ConcreteClass").getConstructors();
            System.out.println(Arrays.toString(publicConstructors));

            Field[] publicFields = Class.forName("com.company.ConcreteClass").getFields();
            System.out.println(Arrays.toString(publicFields));

            Field field = Class.forName("com.company.ConcreteClass").getField("interfaceInt");
            Class<?> fieldClass = field.getDeclaringClass();
            System.out.println(fieldClass.getCanonicalName());

            Field field1 = Class.forName("com.company.ConcreteClass").getField("publicInt");
            Class<?> fieldType = field1.getType();
            System.out.println(fieldType.getCanonicalName());

            Field field3 = Class.forName("com.company.ConcreteClass").getField("publicInt");
            ConcreteClass obj = new ConcreteClass(5);
            System.out.println(field3.get(obj));
            field3.setInt(obj, 10);
            System.out.println(field3.get(obj));




            Constructor<?> constructor = Class.forName("com.company.ConcreteClass").getConstructor(int.class);
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
            Object myObj = constructor.newInstance(10);
            Method myObjMethod = myObj.getClass().getMethod("method1", null);
            myObjMethod.invoke(myObj, null);
            Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
            System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));
            HashMap<String,String> myMap = (HashMap<String,String>)hashMapConstructor.newInstance(null);

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchFieldException|SecurityException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
