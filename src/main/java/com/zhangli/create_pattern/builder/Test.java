package com.zhangli.create_pattern.builder;

/**
 * @author zhangli
 * date 2022/8/25 下午10:08
 */

public class Test {

    public static void main(String[] args) {
        Builder builder = new FirstBuilder();
        builder.buildA("A->F");
        Product product = builder.getProduct();
        System.out.println(product.toString());
    }
}
