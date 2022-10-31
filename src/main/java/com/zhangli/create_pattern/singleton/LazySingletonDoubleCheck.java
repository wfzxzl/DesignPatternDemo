package com.zhangli.create_pattern.singleton;

/**
 * @author zhangli
 * date 2022/8/21 下午9:29
 */

public class LazySingletonDoubleCheck {

    private static LazySingletonDoubleCheck instance;

    private LazySingletonDoubleCheck() {
    }

    private static synchronized LazySingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                instance = new LazySingletonDoubleCheck();
            }
        }
        return instance;
    }

}
