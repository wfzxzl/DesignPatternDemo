package com.zhangli.behavior_pattern.command;

/**
 * 订单命令类（消息载体和接受者/处理者聚合），处理者对消息载体进行处理
 *
 * @author zhangli
 * date 2022/12/14 23:00
 */

public class OrderCommand implements Command {

    private Order order;

    private OrderHandler orderHandler;

    public OrderCommand(Order order, OrderHandler orderHandler) {
        this.order = order;
        this.orderHandler = orderHandler;
    }

    @Override
    public void execute() {
        orderHandler.handle(this.order);
    }
}
