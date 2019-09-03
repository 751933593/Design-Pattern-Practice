package template_method_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-08-22 16:03
 **/
public class Test {

    public static void main(String[] args){
        Process process = new ConcreteProcess(true);
        process.calculate();
    }
}
