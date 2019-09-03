package factory_method_pattern;

import factory_method_pattern.simple_factory_pattern.Product;
import factory_method_pattern.simple_factory_pattern.Tube;

/**
 * @program: Design-Pattern-Practice
 * @description: 二极管工厂类
 * @author: liurunze
 * @create: 2019-07-23 17:53
 **/
public class TubeFactory implements MethodFactory {
    @Override
    public Product valueOf() {
        return new Tube();
    }
}
