package bridge_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 实现层接口的实现类A
 * @author: liurunze
 * @create: 2019-07-01 13:29
 **/
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operation() {
        System.out.println("这里实现了A操作");
    }
}
