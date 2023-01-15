package com.zhangli.structure_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例 + 工厂
 *
 * @author zhangli
 * date 2022/12/26 21:28
 */

public class BoxFactory {

    private final static Map<String, Box> BOX_MAP = new HashMap<>();


    static {
        BOX_MAP.put("I", new IBox());
        BOX_MAP.put("J", new JBox());
        BOX_MAP.put("L", new LBox());

    }

    public static Box getBoxByType(String type) {
        return BOX_MAP.get(type);
    }


}
