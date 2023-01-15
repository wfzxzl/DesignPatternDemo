package com.zhangli.behavior_pattern.responsibility;

/**
 * 处理链基本类
 *
 * @author zhangli
 * date 2022/12/14 23:31
 */

public abstract class Handler {

    // 请假处理开始时间
    protected Integer dayStart;
    // 请假处理结束时间
    protected Integer dayEnd;
    // 下一级处理链
    protected Handler nextHandler;

    public Handler(Integer dayStart, Integer dayEnd) {
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    // 处理逻辑
    public abstract void handleRequest(LeaveRequest request);
    // 进行当前handler的处理逻辑，并且发向下一级handler
    public void submit(LeaveRequest request) {
        this.handleRequest(request);
        if (nextHandler != null && request.getDay() > dayEnd) {
            nextHandler.submit(request);
        } else {
            System.out.println("处理结束！");
        }
    }

}
