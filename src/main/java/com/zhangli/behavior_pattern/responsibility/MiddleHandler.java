package com.zhangli.behavior_pattern.responsibility;

/**
 * @author zhangli
 * date 2022/12/14 23:36
 */

public class MiddleHandler extends Handler {


    public MiddleHandler() {
        super(3, 7);
    }


    @Override
    public void handleRequest(LeaveRequest request) {
        System.out.println("中级处理者开始处理：" + "name:" + request.getName() + "day:" + request.getDay() + "content:" + request.getContent());
        System.out.println("同意");
    }
}
