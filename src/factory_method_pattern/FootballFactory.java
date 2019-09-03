package factory_method_pattern;

import factory_method_pattern.simple_factory_pattern.Football;
import factory_method_pattern.simple_factory_pattern.Product;

/**
 * @program: Design-Pattern-Practice
 * @description: 足球工厂类
 * @author: liurunze
 * @create: 2019-07-23 17:53
 **/
public class FootballFactory implements MethodFactory{


    @Override
    public Product valueOf() {
        return new Football();
    }
}
