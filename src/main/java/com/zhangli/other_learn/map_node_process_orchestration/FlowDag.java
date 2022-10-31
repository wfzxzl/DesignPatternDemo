package com.zhangli.other_learn.map_node_process_orchestration;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author zhangli
 * date 2022/9/21 22:58
 */

public class FlowDag implements Serializable {


    public final static Map<FlowType, LinkedList<ServiceNode<?, Context>>> flowMap =
            new HashMap<>();

    static {
        LinkedList<ServiceNode<?, Context>> testLinkedList = new LinkedList();
        testLinkedList.add(new FirstTestServiceNode("FirstTestName"));
        testLinkedList.add(new FirstTestServiceNode("SecondTestName"));
        flowMap.putIfAbsent(FlowType.TEST, testLinkedList);
    }

}
