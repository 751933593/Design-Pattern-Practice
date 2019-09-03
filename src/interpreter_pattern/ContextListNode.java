package interpreter_pattern;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 内容节点类
 * @author: liurunze
 * @create: 2019-08-26 16:44
 **/
public class ContextListNode implements Interpreter{

    private List<ContextNode> contextNodeList = new ArrayList<>();

    public static final String START = "start";

    public static final String END = "end";

    public static final String REPEAT = "r";

    @Override
    public void parse(Context context) throws ParseException {

        while (true){
            if (context.getCurrent()==null){
                throw new ParseException("数据格式不正确！",0);
            }
            if (START.equals(context.getCurrent())){
                context.skipCurrent();
                continue;
            }
            if (END.equals(context.getCurrent())){
                break;
            }
            ContextNode contextNode = new ContextNode();
            contextNode.parse(context);
            contextNodeList.add(contextNode);
            context.next();
        }

    }

    @Override
    public String toString() {
        return contextNodeList.toString();
    }
}
