package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:52
 */

public class AppleCellPhone implements CellPhone {

    public void on() {
        System.out.println("Apple cell phone on!");
    }

    public void close() {
        System.out.println("Apple cell phone close!");
    }

    public void sendMessage() {
        System.out.println("Apple cell phone send a message ! ");
    }
}
