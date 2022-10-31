package com.zhangli.create_pattern.builder;

/**
 * @author zhangli
 * date 2022/8/25 下午10:03
 */

public class FirstBuilder extends Builder {

    private final Product product;

    public FirstBuilder() {
        this.product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        this.product.setA(msg);
        return this;
    }

    @Override
    Builder buildB(String msg) {
        this.product.setB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        this.product.setC(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        this.product.setD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}
