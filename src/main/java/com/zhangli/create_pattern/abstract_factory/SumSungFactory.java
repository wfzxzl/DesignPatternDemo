package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午10:01
 */

public class SumSungFactory implements BrandFactory {

    public CellPhone productCellPhone() {
        return new SumSungCellPhone();
    }

    public Computer productComputer() {
        return new SumSungComputer();
    }
}
