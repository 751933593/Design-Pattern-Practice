package chain_of_responsibility_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 输出console,debug,error级别的日志
 * @author: liurunze
 * @create: 2019-07-01 16:00
 **/
public class ErrorLogger extends AbstractLoggerChain{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("ErrorLogger: " + message);
    }
}
