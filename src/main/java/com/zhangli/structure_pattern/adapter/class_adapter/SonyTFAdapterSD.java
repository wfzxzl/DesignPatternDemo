package com.zhangli.structure_pattern.adapter.class_adapter;

/**
 * 类适配器 ， 违背了合成复用原则，
 * TF 为被适配者  SD为目标
 * 即： computer只允许sd卡 但是现在只有tf卡，需要此适配器将tf卡变得能被computer读取
 * tf(data) -> sd(tfData) -> computer(sd)
 *
 * @author zhangli
 * date 2022/9/4 22:32
 */

public class SonyTFAdapterSD extends SonyTFCard implements SDCard {

    @Override
    public String readSDCard() {
        System.out.println("use TFAdapterSD");
        return super.readTFCard();
    }

    @Override
    public void writeSDCard(String msg) {
        System.out.println("use TFAdapterSD");
        super.writeTFCard(msg);

    }
}
