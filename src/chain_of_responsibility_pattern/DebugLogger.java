package chain_of_responsibility_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 只输出console,debug级别的日志
 * @author: liurunze
 * @create: 2019-07-01 16:00
 **/
public class DebugLogger extends AbstractLoggerChain{

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("DebugLogger: " + message);
    }
}
