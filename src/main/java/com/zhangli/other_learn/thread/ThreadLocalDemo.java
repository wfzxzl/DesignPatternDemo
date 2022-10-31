package com.zhangli.other_learn.thread;

/**
 * @author zhangli
 * date 2022/10/20 22:26
 */

public class ThreadLocalDemo {


    private static final ThreadLocal<Integer> syncInteger = new ThreadLocal<>();


    public static void main(String[] args) {
        syncInteger.set(2);
    }
}
