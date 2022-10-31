package com.zhangli.other_learn.map_node_process_orchestration;

/**
 * @author zhangli
 * date 2022/9/21 22:58
 */


public enum FlowType {


    TEST("1", "测试");

    private String code;

    private String name;

    FlowType(String code, String name) {
        this.code = code;
        this.name = name;
    }

}
