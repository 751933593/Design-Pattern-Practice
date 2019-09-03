package chain_of_responsibility_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 只输出console级别的日志
 * @author: liurunze
 * @create: 2019-07-01 16:00
 **/
public class ConsoleLogger extends AbstractLoggerChain{

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("ConsoleLogger: " + message);
    }
}
