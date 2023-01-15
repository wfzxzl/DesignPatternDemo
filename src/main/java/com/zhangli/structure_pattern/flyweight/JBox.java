package com.zhangli.structure_pattern.flyweight;

/**
 * @author zhangli
 * date 2022/12/26 21:27
 */

public class JBox extends Box {


    JBox() {
        super();
    }

    @Override
    public String getBoxType() {
        return "J";
    }
}
