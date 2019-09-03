package chain_of_responsibility_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 调用者（测试类）
 * @author: liurunze
 * @create: 2019-07-01 16:23
 **/
public class Client {

    /**
     * 要求：输入一个console级别的日志，只有ConsoleLogger可以打印;
     *      输入一个debug级别的日志，只有ConsoleLogger和DebugLogger可以打印;
     *      输入一个error级别的日志，ConsoleLogger、DebugLogger和ErrorLogger都可以打印;
     * @param args
     */
    public static void main(String[] args) {

        //创建一个责任链
        AbstractLoggerChain consoleLogger = new ConsoleLogger(1);
        AbstractLoggerChain debugLogger = new DebugLogger(2);
        AbstractLoggerChain errorLogger = new ErrorLogger(3);

        consoleLogger.setNext(debugLogger);
        debugLogger.setNext(errorLogger);

        //输入一个console级别的日志
        consoleLogger.logMessage(1,"这是一个console级别的日志");

        System.out.println("------------------- 分割线 ----------------------");

        //输入一个debug级别的日志
        consoleLogger.logMessage(2,"这是一个debug级别的日志");

        System.out.println("------------------- 分割线 ----------------------");


        //输入一个error级别的日志
        consoleLogger.logMessage(3,"这是一个error级别的日志");

    }
}
