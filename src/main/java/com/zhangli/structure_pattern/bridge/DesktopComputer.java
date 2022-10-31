package com.zhangli.structure_pattern.bridge;

/**
 * @author zhangli
 * date 2022/8/26 下午10:25
 */

public class DesktopComputer extends Computer {


    public DesktopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}
