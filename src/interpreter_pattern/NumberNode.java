package interpreter_pattern;

import com.sun.deploy.util.StringUtils;

import java.text.ParseException;

/**
 * @program: Design-Pattern-Practice
 * @description: 数字节点类
 * @author: liurunze
 * @create: 2019-08-26 16:46
 **/
public class NumberNode implements Interpreter{

    private String number;

    @Override
    public void parse(Context context) throws ParseException {

        number = context.getCurrent();
        if (!number.matches("[0-9]+")){
            System.out.println(number+"不是有效数字！");
        }
    }

    @Override
    public String toString() {
        return number;
    }
}
