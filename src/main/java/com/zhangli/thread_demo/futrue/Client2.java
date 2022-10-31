package com.zhangli.thread_demo.futrue;

import java.lang.reflect.Constructor;

/**
 * @author zhangli
 * date 2022/10/17 21:32
 */

public class Client2 {


    public static void main(String[] args) throws Exception {

        Animal a = new Animal("s");
        Class<? extends Animal> aClass = a.getClass();
        Constructor<? extends Animal> constructor = aClass.getConstructor(String.class, String.class);
        Constructor<? extends Animal> constructor1 = aClass.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Animal animal = constructor.newInstance("suck", "you");
        Animal animal1 = constructor1.newInstance();
        System.out.println(animal);
//        Constructor<? extends Animal> constructor1 = aClass.getConstructor(String.class);
//        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
//        Constructor<?>[] constructors = aClass.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//
//            System.out.println(constructor.getName());
//
//
//        }
//        Animal animal = aClass.newInstance();
//        System.out.println(animal);


    }
}
