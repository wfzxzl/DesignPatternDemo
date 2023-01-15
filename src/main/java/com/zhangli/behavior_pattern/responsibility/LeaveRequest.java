package com.zhangli.behavior_pattern.responsibility;

/**
 * 被处理的消息体
 *
 * @author zhangli
 * date 2022/12/14 23:30
 */

public class LeaveRequest {

    private String name;

    private Integer day;

    private String content;

    public LeaveRequest(String name, Integer day, String content) {
        this.name = name;
        this.day = day;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
