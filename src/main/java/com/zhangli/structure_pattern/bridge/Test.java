package com.zhangli.structure_pattern.bridge;

/**
 * @author zhangli
 * date 2022/8/26 下午10:26
 */

public class Test {


    public static void main(String[] args) {

        Computer computer = new DesktopComputer(new BrandApple());
        computer.info();


    }
}
