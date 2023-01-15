package com.zhangli.behavior_pattern.strategy;

/**
 * 策略上下文
 *
 * @author zhangli
 * date 2022/12/14 22:22
 */

public class StrategyContext {


    // 聚合策略
    private final Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextShow(){
        strategy.show();
    }

}
