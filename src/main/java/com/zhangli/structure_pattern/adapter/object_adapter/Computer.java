package com.zhangli.structure_pattern.adapter.object_adapter;

import java.util.Optional;

/**
 * @author zhangli
 * date 2022/9/4 22:19
 */

public class Computer {

    // 从SDCard中读取数据
    public String readSD(SDCard sdCard) {
        SDCard sd = Optional.ofNullable(sdCard).orElseThrow(() -> new RuntimeException("read sd card error"));
        return sd.readSDCard();
    }

    public void writeSD(SDCard sdCard){
        SDCard sd = Optional.ofNullable(sdCard).orElseThrow(() -> new RuntimeException("write sd card error"));
        sd.writeSDCard("hello");
    }


}
