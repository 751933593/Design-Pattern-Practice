package strategy_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-08-21 15:54
 **/
public class Test {

    public static void main(String[] args) {

        System.out.println("====创建一个白色鸭子：====");
        Duck whiteDuck = new WhiteDuck();
        whiteDuck.display();
        whiteDuck.fly();

        System.out.println("====创建一个玩具鸭子：====");
        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        System.out.println("给白色鸭子装上一个翅膀：");
        toyDuck.setFlyStrategy(new HighFly());
        toyDuck.fly();

        List list = new ArrayList<>();
        //list.sort();
        Collections.sort(list);

    }
}
