package com.zhangli.create_pattern.method_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:47
 */

public class Client {

    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        CarFactory hondaFactory = new HondaFactory();
        Car car = audiFactory.getCar();
        Car car1 = hondaFactory.getCar();
        car.showName();
        car1.showName();
    }


}
