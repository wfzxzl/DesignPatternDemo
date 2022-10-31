package com.zhangli.create_pattern.abstract_factory;

/**
 * @author zhangli
 * date 2022/8/21 下午9:59
 */

public interface BrandFactory {

    CellPhone productCellPhone();

    Computer productComputer();

}
