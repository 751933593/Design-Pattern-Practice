package factory_method_pattern.simple_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 简单工厂类， 目前用来生成足球，二极管，灯泡这三个对象
 * @author: liurunze
 * @create: 2019-07-23 17:20
 **/
public class SimpleFactory {

    public static Product createCulb(){
        return new Culb();
    }

    public static Product createFootball(){
        return new Football();
    }

    public static Product createTube(){
        return new Tube();
    }
}
