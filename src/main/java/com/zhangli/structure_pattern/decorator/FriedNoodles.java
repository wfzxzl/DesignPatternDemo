package com.zhangli.structure_pattern.decorator;

/**
 * @author zhangli
 * date 2022/9/10 23:13
 */

public class FriedNoodles extends FastFood {

    public FriedNoodles(Float price, String describe) {
        super(11f, "炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
