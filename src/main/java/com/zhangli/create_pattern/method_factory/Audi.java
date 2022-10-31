package com.zhangli.create_pattern.method_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:32
 */

public class Audi implements Car {


    public void showName() {
        System.out.println("This is Audi!");
    }

    public void showDetail() {
        System.out.println("This is Audi detail message!");
    }

    public void showPrice() {
        System.out.println("This Audi is worth 10000000000$");
    }
}
