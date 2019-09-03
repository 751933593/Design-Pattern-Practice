package strategy_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 白色羽毛的鸭子
 * @author: liurunze
 * @create: 2019-08-21 15:47
 **/
public class WhiteDuck extends Duck {


    public WhiteDuck() {
        super(new LowFly());
    }

    @Override
    public void display() {
        System.out.println("我只一只白色羽毛的鸭子");
    }
}
