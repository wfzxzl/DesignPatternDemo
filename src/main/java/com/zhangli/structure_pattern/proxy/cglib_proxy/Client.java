package com.zhangli.structure_pattern.proxy.cglib_proxy;

import java.lang.reflect.Field;

/**
 * @author zhangli
 * date 2022/9/4 19:15
 */

public class Client {

//    public static void main(String[] args) {
//        ProxyFactory factory = new ProxyFactory();
//        TrainStation proxyProject = factory.getProxyProject();
//        proxyProject.sell();
//    }


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<String> stringClass = String.class;
        Field field = stringClass.getDeclaredField("value");
        field.setAccessible(true);
        System.out.println(field.get("ABCD"));


    }

}
