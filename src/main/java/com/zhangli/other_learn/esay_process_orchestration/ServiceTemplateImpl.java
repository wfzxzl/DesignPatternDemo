package com.zhangli.other_learn.esay_process_orchestration;

/**
 * @author zhangli
 * date 2022/9/21 22:36
 */

public class ServiceTemplateImpl implements ServiceTemplate<String, Context> {


    @Override
    public String invoke(Context context, AbstractActionCallBack<String, Context> action) {
        // 参数校验
        action.paramValidate(context);
        // 业务校验
        action.bizValidate(context);
        // 事务执行前置扩展点
        action.beforeProcess(context);
        // 事务执行
        action.process(context);
        // 事务执行后置扩展点
        action.afterProcess(context);
        // 数据装配
        return action.assemble(context);
    }
}
