package com.zhangli.structure_pattern.facade;

/**
 * 用于测试门面模式
 *
 * @author zhangli
 * date 2022/10/30 00:11
 */

public class Client {

    public static void main(String[] args) {
        SmartApplication app = new SmartApplication();

        app.onMessage("打开");



    }
}
