package com.zhangli.structure_pattern.decorator;

/**
 * @author zhangli
 * date 2022/9/10 23:03
 */

public abstract class FastFood {

    private Float price;

    private String describe;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public FastFood() {
    }

    public FastFood(Float price, String describe) {
        this.price = price;
        this.describe = describe;
    }

    public abstract float cost();
}
