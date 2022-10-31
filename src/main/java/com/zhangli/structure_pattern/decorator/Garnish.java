package com.zhangli.structure_pattern.decorator;

/**
 * @author zhangli
 * date 2022/9/10 23:14
 */

public abstract class Garnish extends FastFood {

    // 声明快餐类对象

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, Float price, String describe) {
        super(price, describe);
        this.fastFood = fastFood;
    }
}
