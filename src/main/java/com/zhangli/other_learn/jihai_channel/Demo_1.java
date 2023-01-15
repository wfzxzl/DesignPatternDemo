package com.zhangli.other_learn.jihai_channel;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author zhangli
 * date 2022/12/26 23:05
 */

public class Demo_1 {


    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {


    }


    private LinkedBlockingDeque<RequestPromise> queue = new LinkedBlockingDeque<>(9);

    public Resutl option(UserRequest request) {
        RequestPromise promise = new RequestPromise(request);
        boolean offer = queue.offer(promise);
        if (!offer) {
            return new Resutl(1, "系统繁忙");
        }
        synchronized (promise) {
            try {
                promise.wait(200);
            } catch (InterruptedException e) {
                return new Resutl(2, "系统中断");
            }
        }
        return promise.getResutl();
    }

}

class RequestPromise {
    private Resutl resutl;
    private UserRequest userRequest;

    public RequestPromise(UserRequest userRequest) {
        this.userRequest = userRequest;
    }

    public RequestPromise(Resutl resutl, UserRequest userRequest) {
        this.resutl = resutl;
        this.userRequest = userRequest;
    }

    public Resutl getResutl() {
        return resutl;
    }

    public void setResutl(Resutl resutl) {
        this.resutl = resutl;
    }

    public UserRequest getUserRequest() {
        return userRequest;
    }

    public void setUserRequest(UserRequest userRequest) {
        this.userRequest = userRequest;
    }
}

class Resutl {

    private Integer code;

    private String msg;

    public Resutl(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class UserRequest {
    private Long userId;

    private Long orderId;

    private Integer count;

    public UserRequest(Long userId, Long orderId, Integer count) {
        this.userId = userId;
        this.orderId = orderId;
        this.count = count;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
