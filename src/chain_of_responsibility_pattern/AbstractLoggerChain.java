package chain_of_responsibility_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 抽象日志责任链
 * @author: liurunze
 * @create: 2019-07-01 16:00
 **/
public abstract class AbstractLoggerChain {

    public static final int CONSOLE = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    public int level;

    private AbstractLoggerChain next;

    public void setNext(AbstractLoggerChain next) {
        this.next = next;
    }

    public abstract void write(String message);

    public void logMessage(int level, String message){
        if (level >= this.level){
            write(message);
        }
        if (this.next != null){
            this.next.logMessage(level, message);
        }
    }
}
