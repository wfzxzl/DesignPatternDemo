package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:55
 */

public class SumSungComputer implements Computer {

    public void detail() {
        System.out.println("SumSung computer is good ! ");
    }

    public void price() {
        System.out.println("SumSung computer is not expensive! ");
    }
}
