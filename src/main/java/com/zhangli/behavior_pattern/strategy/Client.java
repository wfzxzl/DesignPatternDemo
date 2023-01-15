package com.zhangli.behavior_pattern.strategy;

/**
 * 策略模式
 *
 * @author zhangli
 * date 2022/12/14 22:24
 */

public class Client {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new Strategy1());
        context.contextShow();
    }
}
