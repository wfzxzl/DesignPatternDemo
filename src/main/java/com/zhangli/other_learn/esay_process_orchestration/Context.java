package com.zhangli.other_learn.esay_process_orchestration;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 流程编排demo上下文
 *
 * @author zhangli
 * date 2022/9/20 22:55
 */
public class Context implements Serializable {

    /**
     * 上下文
     */
    private final Map<Class<?>, Object> CONTEXT = new ConcurrentHashMap<>();

    /**
     * 获取对象
     *
     * @param clazz 类
     * @param <T>   范型类
     * @return 范型类对象
     */
    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> clazz) {
        return (T) CONTEXT.get(clazz);
    }

    /**
     * 放入对象
     *
     * @param obj
     */
    public void put(Object obj) {
        if (obj == null) {
            return;
        }
        CONTEXT.put(obj.getClass(), obj);
    }


}
