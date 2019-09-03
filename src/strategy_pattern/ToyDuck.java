package strategy_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 不能飞的玩具鸭子
 * @author: liurunze
 * @create: 2019-08-21 15:47
 **/
public class ToyDuck extends Duck {


    public ToyDuck() {

        super(new CantFly());
    }

    @Override
    public void display() {
        System.out.println("我只一只玩具鸭子");
    }
}
