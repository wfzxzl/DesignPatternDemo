package com.zhangli.behavior_pattern.responsibility;

/**
 * 责任链模式
 *
 * @author zhangli
 * date 2022/12/14 23:46
 */

public class Client {


    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("小明",40,"发烧");

        LowestHandler lowestHandler = new LowestHandler();
        MiddleHandler middleHandler = new MiddleHandler();
        HighestHandler highestHandler = new HighestHandler();

        lowestHandler.setNextHandler(middleHandler);
        middleHandler.setNextHandler(highestHandler);

        lowestHandler.submit(request);
    }
}
