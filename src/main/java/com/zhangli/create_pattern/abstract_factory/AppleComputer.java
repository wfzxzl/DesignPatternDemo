package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:54
 */

public class AppleComputer implements Computer {

    public void detail() {
        System.out.println("Apple computer is not good ! ø");
    }

    public void price() {
        System.out.println("Apple computer is so expensive !");
    }
}
