package com.zhangli.structure_pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangli
 * date 2022/9/4 19:07
 */

public class ProxyFactory implements MethodInterceptor {

    /**
     * 获取代理对象
     *
     * @return
     */
    public TrainStation getProxyProject() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(this);
        return (TrainStation) enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("use");

        return o;
    }

}
