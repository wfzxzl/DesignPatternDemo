package com.zhangli.other_learn.map_node_process_orchestration;

/**
 * @author zhangli
 * date 2022/9/21 23:00
 */
public abstract class ServiceNode<T, C extends Context> {

    private final String serviceName;

    public String getServiceName() {
        return serviceName;
    }
    protected ServiceNode(String serviceName){
        this.serviceName = serviceName;
    }

    protected abstract T doHandle(C context);

}
