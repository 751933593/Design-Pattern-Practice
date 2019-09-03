package interpreter_pattern;

import java.text.ParseException;

/**
 * @program: Design-Pattern-Practice
 * @description: 解释器
 * @author: liurunze
 * @create: 2019-08-26 16:32
 **/
public interface Interpreter {

    /**
     * 解析字符串 context
     * @param context
     * @throws ParseException
     */
    void parse(Context context) throws ParseException;
}
