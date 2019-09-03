package bridge_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 调用者（测试类）
 * @author: liurunze
 * @create: 2019-07-01 13:39
 **/
public class client {

    public static void main(String[] args) {

        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
