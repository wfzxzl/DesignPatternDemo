package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午10:02
 */

public class Client {

    public static void main(String[] args) {
        BrandFactory appleFactory = new AppleFactory();
        BrandFactory sumSungFactory = new SumSungFactory();
        CellPhone cellPhone = appleFactory.productCellPhone();
        Computer computer = appleFactory.productComputer();
        cellPhone.on();
        computer.detail();
        Computer computer1 = sumSungFactory.productComputer();
        CellPhone cellPhone1 = sumSungFactory.productCellPhone();
        cellPhone1.on();
        computer1.detail();
    }
}
