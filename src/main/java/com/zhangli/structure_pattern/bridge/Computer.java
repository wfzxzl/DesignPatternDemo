package com.zhangli.structure_pattern.bridge;

/**
 * @author zhangli
 * date 2022/8/26 下午10:19
 */

public abstract class Computer {

    protected final Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}
