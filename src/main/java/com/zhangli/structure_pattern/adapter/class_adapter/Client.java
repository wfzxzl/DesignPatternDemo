package com.zhangli.structure_pattern.adapter.class_adapter;

/**
 * @author zhangli
 * date 2022/9/4 22:35
 */

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        SonyTFAdapterSD sonyTfAdapterSD = new SonyTFAdapterSD();
        System.out.println(computer.readSD(sonyTfAdapterSD));
        computer.writeSD(sonyTfAdapterSD);
    }

}
