package bridge_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 抽象层的实现类
 * @author: liurunze
 * @create: 2019-07-01 13:26
 **/
public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        super.getImplementor().operation();
    }
}
