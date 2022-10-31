package com.zhangli.structure_pattern.adapter.object_adapter;

/**
 * @author zhangli
 * date 2022/9/4 22:26
 */

public class WestDataSDCard implements SDCard {
    @Override
    public String readSDCard() {
        return "west data sd card data msg : hello , this is west data sd card msg !";
    }

    @Override
    public void writeSDCard(String msg) {
        System.out.printf("west data sd card data write : %s%n", msg);
    }
}
