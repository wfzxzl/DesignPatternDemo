package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:50
 */

public class SumSungCellPhone implements CellPhone {

    public void on() {
        System.out.println("SumSung Cell phone on ! ");
    }

    public void close() {
        System.out.println("SumSung Cell phone close ! ");
    }

    public void sendMessage() {
        System.out.println("SumSung Cell phone send a message ! ");
    }
}
