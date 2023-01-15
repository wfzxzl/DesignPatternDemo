package com.zhangli.structure_pattern.flyweight;

/**
 * @author zhangli
 * date 2022/12/26 21:29
 */

public class Client {


    public static void main(String[] args) {
        Box i = BoxFactory.getBoxByType("I");
        i.display("blue");
    }
}
