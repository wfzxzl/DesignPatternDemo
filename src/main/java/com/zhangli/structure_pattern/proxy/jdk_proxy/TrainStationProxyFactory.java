package com.zhangli.structure_pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理模式
 *
 * @author zhangli
 * date 2022/9/4 16:53
 */

public class TrainStationProxyFactory {

    /**
     * 代理的目标对象
     */
    private final TrainStation targetObject;

    TrainStationProxyFactory(TrainStation trainStation) {
        this.targetObject = trainStation;
    }


    public TrainStation getTrainStation() {
        // 获取代理对象
        /**
         * ClassLoader loader : 类加载器 ， 用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces : 代理类实现的接口的字节码对象
         * InvocationHandler h : 代理对象的调用处理程序
         */
        TrainStation proxyObject = (TrainStation) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                    * Object proxy : 代理对象，和proxyObject对象是同一个对象，在invoke方法中基本不用
                     * Method method : 对接口中的方法进行封装的method对象
                     * Object[] args : 调用方法的实际参数
                     * return ： 方法的返回值
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 代理中，对方法进行增强操作
                        System.out.printf("execute （%s）proxy object invoke%n", method.getName());
                        Object obj = method.invoke(targetObject, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }

    /**
     * 获取目标对象的买票接口的代理
     *
     * @return
     */
    public SellTickets getSellTicketProxyObject() {

        // 获取代理对象
        /**
         * ClassLoader loader : 类加载器 ， 用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces : 代理类实现的接口的字节码对象
         * InvocationHandler h : 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * Object proxy : 代理对象，和proxyObject对象是同一个对象，在invoke方法中基本不用
                     * Method method : 对接口中的方法进行封装的method对象
                     * Object[] args : 调用方法的实际参数
                     * return ： 方法的返回值
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 代理中，对方法进行增强操作
                        System.out.printf("execute （%s）proxy object invoke%n", method.getName());
                        Object obj = method.invoke(targetObject, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }

    /**
     * 获取目标对象的买食品接口的代理
     *
     * @return
     */
    public SellFood getSellFoodProxyObject() {

        // 获取代理对象
        SellFood proxyObject = (SellFood) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("execute （sell food ）proxy object invoke");
                        return null;
                    }
                }
        );
        return proxyObject;
    }

}
