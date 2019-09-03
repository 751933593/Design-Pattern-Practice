package strategy_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 抽象鸭子类
 * @author: liurunze
 * @create: 2019-08-21 15:41
 **/
public abstract class Duck {

    private FlyStrategy flyStrategy;

    public Duck(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly(){
        flyStrategy.fly();
    }

    public abstract void display();

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }
}
