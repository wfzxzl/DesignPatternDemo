package com.zhangli.behavior_pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单信息（命令模式的消息载体）
 *
 * @author zhangli
 * date 2022/12/14 22:54
 */

public class Order {

    // 桌号
    private Integer tableNumber;
    // 订单详情
    private Map<String, Integer> foodMap = new HashMap<>();


    // 添加订单信息
    public void addFood(String foodName, Integer foodCount) {
        if (foodName != null && foodName.length() > 0 && foodCount > 0) {
            foodMap.put(foodName, foodCount);
        }
    }

    public Integer getTableNumber() {
        return this.tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Map<String, Integer> getFoodMap() {
        return this.foodMap;
    }

}
