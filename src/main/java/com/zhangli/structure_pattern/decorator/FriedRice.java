package com.zhangli.structure_pattern.decorator;

/**
 * @author zhangli
 * date 2022/9/10 23:12
 */

public class FriedRice extends FastFood {

    public FriedRice() {
        super(10f, "炒饭");
    }

    public FriedRice(Float price, String describe) {
        super(10f, "炒饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
