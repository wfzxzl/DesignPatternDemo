package com.zhangli.other_learn.map_node_process_orchestration;

/**
 * @author zhangli
 * date 2022/9/21 23:04
 */

public class FirstTestServiceNode extends ServiceNode<String, Context> {
    public FirstTestServiceNode(String serviceName) {
        super(serviceName);
    }

    private void firstHandle(Context context) {
        String s = context.get(String.class);
        context.put(s + "firstHandle");
    }

    private void secondHandle(Context context) {
        String s = context.get(String.class);
        context.put(s + "secondHandle");
    }

    private void thirdHandle(Context context) {
        String s = context.get(String.class);
        context.put(s + "thirdHandle");
    }

    private void fourthHandle(Context context) {
        String s = context.get(String.class);
        context.put(s + "fourthHandle");
    }


    @Override
    protected String doHandle(Context context) {
        this.firstHandle(context);
        this.secondHandle(context);
        this.thirdHandle(context);
        this.fourthHandle(context);
        return context.get(String.class);
    }
}
