package template_method_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 抽象模板类
 * @author: liurunze
 * @create: 2019-08-22 16:02
 **/
public abstract class Process {

    public boolean sign;
    public Process(boolean sign){
        this.sign = sign;
    }
    /**
     * 这是模板方法，规定在sign为true的情况下，先执行add、再执行sub
     */
    public void calculate(){
        if (sign) {
            add();
            sub();
            multi();
        }
    }
    public abstract void add();
    public abstract void sub();
    //钩子方法，在父类中是空方法，具体内容可以在子类中重写实现，也可以不实现。形式灵活。
    public void multi(){

    }
}
