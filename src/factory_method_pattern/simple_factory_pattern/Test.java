package factory_method_pattern.simple_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-07-23 17:24
 **/
public class Test {

    /**
     * 简单工厂模式又称静态工厂模式，用来创建各种各样的对象。
     * 当我们新增一个产品时，只需要在工厂中新增一个createXXX()方法即可。
     * @param args
     */
    public static void main(String[] args) {

        //获得灯泡对象
        Product culb = SimpleFactory.createCulb();
        culb.display();

        //获得灯泡对象
        Product football = SimpleFactory.createFootball();
        football.display();

        //获得灯泡对象
        Product tube = SimpleFactory.createTube();
        tube.display();
    }
}
