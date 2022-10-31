package com.zhangli.structure_pattern.adapter.interface_adapter;

/**
 * @author zhangli
 * date 2022/9/4 22:29
 */

public class WestDataTFCard implements TFCard {


    @Override
    public String readTFCard() {
        return "west data tf card data msg : hello , this is west data tf card msg !";
    }

    @Override
    public void writeTFCard(String msg) {
        System.out.printf("west data tf card data write : %s%n", msg);

    }
}
