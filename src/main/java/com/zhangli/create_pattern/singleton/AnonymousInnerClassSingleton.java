package com.zhangli.create_pattern.singleton;

/**
 * 匿名内部类的单例模式
 *
 * @author zhangli
 * date 2022/9/3 22:39
 */

public class AnonymousInnerClassSingleton {

    /**
     * 构造器私有化
     */
    private AnonymousInnerClassSingleton() {

    }

    // 本类的单例对象
    private static AnonymousInnerClassSingleton INSTANCE;

    private static class InnerClass {
        private final static AnonymousInnerClassSingleton INSTANCE = new AnonymousInnerClassSingleton();
    }

    public synchronized AnonymousInnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }


}
