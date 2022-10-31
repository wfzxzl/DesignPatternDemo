package com.zhangli.create_pattern.builder;

/**
 * @author zhangli
 * date 2022/8/25 下午9:59
 */

public abstract class Builder {

    abstract Builder buildA(String msg);

    abstract Builder buildB(String msg);

    abstract Builder buildC(String msg);

    abstract Builder buildD(String msg);

    abstract Product getProduct();

}
