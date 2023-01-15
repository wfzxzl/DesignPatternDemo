package com.zhangli.behavior_pattern.command;

/**
 * @author zhangli
 * date 2022/12/14 22:58
 */

public class OrderHandlerA implements OrderHandler {

    @Override
    public void handle(Order order) {
        System.out.printf("handlerA: ------------ 开始处理%s桌订单 --------------%n", order.getTableNumber());

        order.getFoodMap().forEach((foodName, foodCount) -> {
            System.out.printf("handlerA: ------------ 完成%d份%s ---------%n",foodCount,foodName);
        });

    }
}
