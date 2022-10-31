package com.zhangli.other_learn.esay_process_orchestration;

/**
 * @author zhangli
 * date 2022/9/21 22:49
 */

public class TestActionCallBack extends AbstractActionCallBack<String, Context> {

    @Override
    public void paramValidate(Context context) {
        System.out.println("paramValidate");
    }

    @Override
    public void bizValidate(Context context) {
        System.out.println("bizValidate");
    }

    @Override
    public void process(Context context) {
        System.out.println("process");
    }

    @Override
    public String assemble(Context context) {
        System.out.println("assemble");
        return "showTime";
    }
}
