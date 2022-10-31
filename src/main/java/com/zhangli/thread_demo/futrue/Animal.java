package com.zhangli.thread_demo.futrue;

/**
 * @author zhangli
 * date 2022/10/17 21:32
 */

public class Animal {


    private String name;

    private String height;


    Animal(String name) {
        this.name = name;
    }

    private Animal() {
    }

    public Animal(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
