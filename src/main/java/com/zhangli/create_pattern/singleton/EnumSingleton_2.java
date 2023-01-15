package com.zhangli.create_pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangli
 * date 2022/12/24 21:02
 */

public enum EnumSingleton_2 {


    TEST_MAP {
        @Override
        public Map<String, String> getMap() {
            return super.getMap();
        }

        @Override
        public void setTestMap() {
            this.map = new ConcurrentHashMap<>();
            this.map.put("key", "value");
        }

        @Override
        public String getValue(String key) {
            return super.getValue(key);
        }
    };

    EnumSingleton_2(){
        this.setTestMap();
    }


    public Map<String, String> map;

    public Map<String, String> getMap() {
        return this.map;
    }

    public abstract void setTestMap();

    public String getValue(String key) {
        return this.map.get(key);
    }


    public static void main(String[] args) {
        System.out.println(EnumSingleton_2.TEST_MAP.getValue("key"));
    }

}
