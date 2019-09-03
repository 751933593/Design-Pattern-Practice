package bridge_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 实现层接口的实现类B
 * @author: liurunze
 * @create: 2019-07-01 13:29
 **/
public class ConcreteImplementorB implements Implementor{
    @Override
    public void operation() {
        System.out.println("这里实现了B操作");
    }
}
