package interpreter_pattern;

import java.text.ParseException;

/**
 * @program: Design-Pattern-Practice
 * @description: 数字节点类
 * @author: liurunze
 * @create: 2019-08-26 16:46
 **/
public class ContextNode implements Interpreter{

    private Interpreter interpreter;

    @Override
    public void parse(Context context) throws ParseException {

        if (ContextListNode.REPEAT.equals(context.getCurrent())){
            interpreter = new RepeatNode();
            context.skipCurrent();
        }else {
            interpreter = new NumberNode();
        }
        interpreter.parse(context);
    }

    @Override
    public String toString() {
        return interpreter.toString();
    }
}
