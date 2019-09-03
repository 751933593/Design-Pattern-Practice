package interpreter_pattern;

import java.text.ParseException;

/**
 * @program: Design-Pattern-Practice
 * @description: 重复节点类
 * @author: liurunze
 * @create: 2019-08-26 16:46
 **/
public class RepeatNode extends NumberNode{

    private ContextListNode contextNodeList;

    private int repeatNum;

    @Override
    public void parse(Context context) throws ParseException {

        repeatNum = Integer.valueOf(context.getCurrent());
        context.skipCurrent();

        contextNodeList = new ContextListNode();
        contextNodeList.parse(context);

    }

    @Override
    public String toString() {

        return "(r"+repeatNum+" : "+contextNodeList.toString()+")";
    }
}
