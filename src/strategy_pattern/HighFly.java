package strategy_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 可以高空飞行
 * @author: liurunze
 * @create: 2019-08-21 15:45
 **/
public class HighFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("可以高空飞行");
    }
}
