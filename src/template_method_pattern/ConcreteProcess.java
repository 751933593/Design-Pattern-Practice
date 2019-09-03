package template_method_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 具体模板类
 * @author: liurunze
 * @create: 2019-08-22 16:03
 **/
public class ConcreteProcess extends Process {

    public ConcreteProcess(boolean sign){
        //这里子类需要实现父类的非默认构造器，且父类构造方法的参数顺序要注意
        super(sign);
    }
    @Override
    public void add(){
        System.out.println("执行加法");
    }

    @Override
    public void sub(){
        System.out.println("执行减法");
    }

    @Override
    public void multi(){
        System.out.println("执行乘法");
    }
}
