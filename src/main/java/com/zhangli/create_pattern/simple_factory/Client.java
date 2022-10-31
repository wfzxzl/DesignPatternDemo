package com.zhangli.create_pattern.simple_factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangli
 * date 2022/8/21 下午9:34
 */

public class Client {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> cars = new ArrayList<Car>();
        cars.add(carFactory.getCar("Honda"));
        cars.add(carFactory.getCar("Audi"));
        for (Car car : cars) {
            car.showName();
            car.showDetail();
            car.showPrice();
        }


    }
}
