package strategy_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 可以低空飞行
 * @author: liurunze
 * @create: 2019-08-21 15:45
 **/
public class LowFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("可以低空飞行");
    }
}
