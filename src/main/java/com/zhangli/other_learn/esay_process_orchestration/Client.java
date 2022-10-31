package com.zhangli.other_learn.esay_process_orchestration;

/**
 * @author zhangli
 * date 2022/9/21 22:48
 */

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.put(10);
        ServiceTemplateImpl im = new ServiceTemplateImpl();
        im.invoke(context, new TestActionCallBack());


    }
}
