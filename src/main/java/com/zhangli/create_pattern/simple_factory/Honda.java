package com.zhangli.create_pattern.simple_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:33
 */

public class Honda implements Car {


    public void showName() {
        System.out.println("This is Honda!");
    }

    public void showDetail() {
        System.out.println("This is Honda detail message!");
    }

    public void showPrice() {
        System.out.println("This Honda is worth 10000000000$");
    }
}
