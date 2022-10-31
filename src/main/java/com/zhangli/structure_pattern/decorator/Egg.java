package com.zhangli.structure_pattern.decorator;

/**
 * @author zhangli
 * date 2022/9/10 23:19
 */

public class Egg extends Garnish {


    private static final Float EGG_PRICE = 1f;

    private static final String DESCRIBE = "鸡蛋";

    public Egg(FastFood fastFood) {
        super(fastFood, EGG_PRICE, DESCRIBE);
    }

    @Override
    public float cost() {
        return this.getPrice() + super.getFastFood().getPrice();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + super.getFastFood().getDescribe();
    }
}
