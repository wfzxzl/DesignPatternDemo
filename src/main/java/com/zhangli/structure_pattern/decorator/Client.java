package com.zhangli.structure_pattern.decorator;

/**
 * @author zhangli
 * date 2022/9/11 07:29
 */

public class Client {


    public static void main(String[] args) {
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDescribe() + "          " + fastFood.cost() + "$");


        System.out.println("-------------------------");
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDescribe() + "          " + fastFood.cost() + "$");

    }


}
