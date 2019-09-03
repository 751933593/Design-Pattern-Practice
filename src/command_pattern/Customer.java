package command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 命令发送者Invoker
 * @author: liurunze
 * @create: 2019-08-23 16:49
 **/
public class Customer {

    private Command command;

    private List<Command> history = new ArrayList<>(); //这个发送者所执行过的命令集合

    //设置命令
    public void setCommand(Command command){
        this.command = command;
    }

    //执行命令
    public void execute(){
        command.execute();
        history.add(command);
        command = null;
    }

    //重新执行命令集合
    public void redo(){
        for (Command command1 : history) {
            command1.execute();
        }
    }

    //清空历史记录
    public void undo(){
        history.clear();
    }
}
