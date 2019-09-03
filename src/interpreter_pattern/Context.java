package interpreter_pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 被解释类
 * @author: liurunze
 * @create: 2019-08-26 17:59
 **/
public class Context {

    private String current;

    private Iterator<String> iterator;

    public Context(String context){

        String[] split = context.split(" ");
        List<String> strings = Arrays.asList(split);
        iterator = strings.iterator();

        next();
    }

    public String getCurrent() {
        return current;
    }

    public String next(){
        if (iterator.hasNext()){
            return current = iterator.next();
        }
        return current = null;
    }


    public void skipCurrent(){

        next();
    }
}
