package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午10:00
 */

public class AppleFactory implements BrandFactory {

    public CellPhone productCellPhone() {
        return new AppleCellPhone();
    }

    public Computer productComputer() {
        return new AppleComputer();
    }
}
