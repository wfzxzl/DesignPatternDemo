package com.zhangli.structure_pattern.facade;

/**
 * @author zhangli
 * date 2022/10/30 00:13
 */

public class SmartApplication {

    private Computer computer;
    private Light light;
    private TV tv;


    public SmartApplication() {
        this.computer = new Computer();
        this.light = new Light();
        this.tv = new TV();
    }


    public void onMessage(String message) {
        if (message.equals("打开")) {
            computer.on();
            light.on();
            tv.on();
        } else if (message.equals("关闭")) {
            computer.on();
            light.on();
            tv.on();
        }
    }


}
