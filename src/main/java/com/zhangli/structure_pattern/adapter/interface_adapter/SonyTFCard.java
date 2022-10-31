package com.zhangli.structure_pattern.adapter.interface_adapter;

/**
 * @author zhangli
 * date 2022/9/4 22:29
 */

public class SonyTFCard implements TFCard {


    @Override
    public String readTFCard() {
        return "sony tf card data msg : hello , this is sony tf card msg !";
    }

    @Override
    public void writeTFCard(String msg) {
        System.out.printf("sony tf card data write : %s%n", msg);

    }
}
