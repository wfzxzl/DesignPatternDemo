package com.zhangli.other_learn.esay_process_orchestration;

/**
 * 考虑到某些业务无序扩展点交互，为此，将接口抽象出来
 *
 * @author zhangli
 * date 2022/9/20 23:18
 */

public abstract class AbstractActionCallBack<T extends String, C extends Context> implements ActionCallBack<T, C> {

    @Override
    public void beforeProcess(C context) {

    }

    @Override
    public void afterProcess(C context) {

    }
}
