package com.zhangli.structure_pattern.facade;

/**
 * 电灯类
 *
 * @author zhangli
 * date 2022/10/30 00:11
 */

public class Light {

    protected void on(){
        System.out.println("打开电灯！");
    }
    protected void off(){
        System.out.println("关闭电灯！");
    }


}
