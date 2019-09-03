package abstract_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description:
 * @author: liurunze
 * @create: 2019-07-24 13:37
 **/
public class Test {

    public static void main(String[] args) {

        AbstractFactory cottonFactory = new CottonFactory();
        AbstractFactory leatherFactory = new LeatherFactory();

        cottonFactory.createClothes().wear();

        cottonFactory.createShoes().wear();

        leatherFactory.createClothes().wear();

        leatherFactory.createShoes().wear();
    }
}
