package com.zhangli.behavior_pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员（命令发起者）
 *
 * @author zhangli
 * date 2022/12/14 23:08
 */

public class Waitor {

    // 命令列表
    List<Command> commandList = new ArrayList<>();


    public void addCommand(Command command) {
        if (command != null) {
            commandList.add(command);
        }
    }

    public void executeCommand() {
        System.out.println("-----------开始执行命令！");
        commandList.forEach(Command::execute);
    }
}
