package abstract_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 皮质工厂类
 * @author: liurunze
 * @create: 2019-07-24 13:30
 **/
public class CottonFactory implements AbstractFactory {
    @Override
    public Clothes createClothes() {
        return new CottonClothes();
    }

    @Override
    public Shoes createShoes() {
        return new CottonShoes();
    }
}
