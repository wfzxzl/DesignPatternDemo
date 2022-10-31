package com.zhangli.structure_pattern.proxy.jdk_proxy;

/**
 * @author zhangli
 * date 2022/9/4 16:46
 */

public class ChengduTrainStation implements TrainStation {

    public void sellTickets() {
        System.out.println("Chengdu Train Station sell a Ticket 100$!");
    }

    public void printTickets() {
        System.out.println("show tickets");
    }

    public void sellFood() {
        System.out.println("Chengdu Train Station sell a food 500$!");
    }
}
