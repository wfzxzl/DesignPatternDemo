package com.zhangli.other_learn.esay_process_orchestration;

/**
 * 为了业务流程中调用，我们封装对外调用API，传入对应的上下文，回调函数即可
 *
 * @author zhangli
 * date 2022/9/20 23:23
 */

public interface ServiceTemplate<T extends String, C extends Context> {

    T invoke(C context, AbstractActionCallBack<T, C> action);

}
