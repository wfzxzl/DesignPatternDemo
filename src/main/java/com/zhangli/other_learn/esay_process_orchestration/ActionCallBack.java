package com.zhangli.other_learn.esay_process_orchestration;

/**
 * 事务执行模版，定义组件之间api，为了通用，这里讲上下文注射到回调模版的泛型参数中
 *
 * @author zhangli
 * date 2022/9/20 23:16
 */

public interface ActionCallBack<T extends String, C extends Context> {

    void paramValidate(C context);

    void bizValidate(C context);

    void beforeProcess(C context);

    void process(C context);

    void afterProcess(C context);

    T assemble(C context);

}
