package interpreter_pattern;

import java.io.*;
import java.text.ParseException;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-08-26 16:12
 **/
public class Test {

    public static void main(String[] args) {

        //String str = "start end";
        //String str = "start 4 end";
        String str = "start 4 r 2 3 4 r3 2 end end 5 end";
        //String str = "start 4 r 2 3 4 end 5";
        //String str = "start 4 r 2 3 4 end 5 11 1a end";
        Context context = new Context(str);
        ContextListNode contextListNode = new ContextListNode();
        try {
            contextListNode.parse(context);
            System.out.println(contextListNode);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
