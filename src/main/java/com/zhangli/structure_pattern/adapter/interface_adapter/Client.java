package com.zhangli.structure_pattern.adapter.interface_adapter;

/**
 * @author zhangli
 * date 2022/9/4 22:42
 */

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();

        TFAdapterSD sonyTfAdapterSD = new TFAdapterSD(new SonyTFCard());
        System.out.println(computer.readSD(sonyTfAdapterSD));
        computer.writeSD(sonyTfAdapterSD);

        TFAdapterSD westDataTfAdapterSD = new TFAdapterSD(new WestDataTFCard());
        System.out.println(computer.readSD(westDataTfAdapterSD));
        computer.writeSD(westDataTfAdapterSD);

        SDCard sdCard = new WestDataSDCard();
        System.out.println(computer.readSD(sdCard));
        computer.writeSD(sdCard );
    }
}
