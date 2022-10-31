package com.zhangli.create_pattern.singleton;

/**
 * 饿汉式单例模式
 *
 * @author zhangli
 * date 2022/8/21 下午9:27
 */

public class HungrySingleton {

    private final static HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static synchronized HungrySingleton getInstance() {
        return INSTANCE;
    }

}
