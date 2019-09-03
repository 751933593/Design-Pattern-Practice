package factory_method_pattern;

import factory_method_pattern.simple_factory_pattern.Culb;
import factory_method_pattern.simple_factory_pattern.Product;

/**
 * @program: Design-Pattern-Practice
 * @description: 灯泡工厂类
 * @author: liurunze
 * @create: 2019-07-23 17:52
 **/
public class ClubFactory implements MethodFactory {
    @Override
    public Product valueOf() {
        return new Culb();
    }
}
