package com.zhangli.create_pattern.prototype;

import java.util.Date;

/**
 * @author zhangli
 * date 2022/8/25 下午10:46
 */

public class Test {


    public static void main(String[] args) throws Exception {

        Date date = new Date();
        Source s1 = new Source("source1", date);
        Source s2 = (Source) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        date.setTime(22222222);
        System.out.println(s1);
        System.out.println(s2);

    }
}
