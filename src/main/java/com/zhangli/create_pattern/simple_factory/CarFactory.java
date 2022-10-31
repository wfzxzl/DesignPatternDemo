package com.zhangli.create_pattern.simple_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:34
 */

public class CarFactory {

    public Car getCar(String carName) {
        if (carName.equals("Honda")) {
            return new Honda();
        }
        if (carName.equals("Audi")) {
            return new Audi();
        }
        return null;
    }

}
