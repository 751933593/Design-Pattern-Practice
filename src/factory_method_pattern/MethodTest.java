package factory_method_pattern;

import factory_method_pattern.simple_factory_pattern.Product;

/**
 * @program: Design-Pattern-Practice
 * @description: 工厂方法模式测试类
 * @author: liurunze
 * @create: 2019-07-23 17:55
 **/
public class MethodTest {

    public static void main(String[] args) {

        MethodFactory clubFactory = new ClubFactory();
        Product club = clubFactory.valueOf();

        MethodFactory footballFactory = new FootballFactory();
        Product football = footballFactory.valueOf();

        MethodFactory tubeFactory = new TubeFactory();
        Product tube = tubeFactory.valueOf();
    }
}
