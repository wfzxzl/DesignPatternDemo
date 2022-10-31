package com.zhangli.create_pattern.singleton;

/**
 * 单例模式，懒汉式
 *
 * @author zhangli
 * date 2022/8/21 下午9:20
 */

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
