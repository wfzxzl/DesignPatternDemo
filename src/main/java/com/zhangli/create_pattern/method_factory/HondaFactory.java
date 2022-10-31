package com.zhangli.create_pattern.method_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:46
 */

public class HondaFactory implements CarFactory {

    public Car getCar() {
        return new Honda();
    }
}
