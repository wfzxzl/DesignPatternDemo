package com.zhangli.create_pattern.singleton;

/**
 * @author zhangli
 * date 2022/9/3 22:47
 */


public enum EnumSingleton {


    INSTANCE{
        @Override
        public void hello() {
            System.out.println("this is INSTANCE enum singleton!");
        }
    };

    public void hello() {
        System.out.println("Hello world!");
    }


    public static void main(String[] args) {
        EnumSingleton.INSTANCE.hello();
    }
}
