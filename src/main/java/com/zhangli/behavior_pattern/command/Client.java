package com.zhangli.behavior_pattern.command;

/**
 * 命令模式
 *
 * @author zhangli
 * date 2022/12/14 23:10
 */

public class Client {

    public static void main(String[] args) {
        // 创建消息
        Order order1 = new Order();
        order1.setTableNumber(1);
        order1.addFood("鸭头", 20);
        order1.addFood("鸡公煲", 1);


        Order order2 = new Order();
        order2.setTableNumber(2);
        order2.addFood("鸡头", 20);
        order2.addFood("鸭公煲", 1);

        // 创建接收者
        OrderHandlerA orderHandlerA = new OrderHandlerA();
        OrderHandlerB orderHandlerB = new OrderHandlerB();

        // 创建消息指令
        OrderCommand orderCommandA = new OrderCommand(order1,orderHandlerA);
        OrderCommand orderCommandB = new OrderCommand(order2,orderHandlerB);

        // 创建发送命令者
        Waitor waitor = new Waitor();
        waitor.addCommand(orderCommandA);
        waitor.addCommand(orderCommandB);
        // 发送命令
        waitor.executeCommand();
    }
}
