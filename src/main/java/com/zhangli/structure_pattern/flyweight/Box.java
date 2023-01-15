package com.zhangli.structure_pattern.flyweight;

/**
 * 享元模式（俄罗斯方块 抽象类）
 *
 * @author zhangli
 * date 2022/12/26 21:24
 */

public abstract class Box {


    Box() {
    }


    public abstract String getBoxType();

    public void display(String color) {
        System.out.println("color : " + color + ", box type : " + this.getBoxType());
    }

}
