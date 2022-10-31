package com.zhangli.other_learn.map_node_process_orchestration;

import java.util.LinkedList;

/**
 * @author zhangli
 * date 2022/9/21 23:24
 */

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.put("suck");

        String result = "";
        LinkedList<ServiceNode<?, Context>> serviceNodes = FlowDag.flowMap.get(FlowType.TEST);

        for (ServiceNode<?, Context> serviceNode : serviceNodes) {
          result = (String)serviceNode.doHandle(context);
        }
        System.out.println(result);
    }
}
