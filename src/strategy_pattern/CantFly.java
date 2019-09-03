package strategy_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 不能飞行
 * @author: liurunze
 * @create: 2019-08-21 15:45
 **/
public class CantFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("不能飞行");
    }
}
