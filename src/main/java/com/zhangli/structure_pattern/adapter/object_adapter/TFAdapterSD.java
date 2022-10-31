package com.zhangli.structure_pattern.adapter.object_adapter;

/**
 * 对象适配器 ， 因为类只能单继承，所以对象适配器不再固定去继承类，而是以传入对象的方式进行单独构造，这样就可以不占用单继承的坑位，方便扩展
 * TF 为被适配者  SD为目标
 * 即： computer只允许sd卡 但是现在只有tf卡，需要此适配器将tf卡变得能被computer读取
 * tf(data) -> sd(tfData) -> computer(sd)
 *
 * @author zhangli
 * date 2022/9/4 22:32
 */

public class TFAdapterSD implements SDCard {

    private final TFCard tfCard;

    TFAdapterSD(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSDCard() {
        System.out.println("use TFAdapterSD");
        return tfCard.readTFCard();
    }

    @Override
    public void writeSDCard(String msg) {
        System.out.println("use TFAdapterSD");
        tfCard.writeTFCard(msg);
    }
}
