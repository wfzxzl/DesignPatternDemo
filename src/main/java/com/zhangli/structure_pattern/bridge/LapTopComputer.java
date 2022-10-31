package com.zhangli.structure_pattern.bridge;

/**
 * @author zhangli
 * date 2022/8/26 下午10:25
 */

public class LapTopComputer extends Computer {


    public LapTopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
