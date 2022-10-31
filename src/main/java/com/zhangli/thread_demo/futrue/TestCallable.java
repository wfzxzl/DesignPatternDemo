package com.zhangli.thread_demo.futrue;

import java.util.concurrent.Callable;

/**
 * 测试Callable
 *
 * @author zhangli
 * date 2022/10/2 22:11
 */
public class TestCallable implements Callable<String> {


    @Override
    public String call() throws Exception {

        Thread.currentThread().sleep(10 * 1000);


        return "done";
    }
}
