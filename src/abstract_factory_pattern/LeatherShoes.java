package abstract_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 皮质鞋子
 * @author: liurunze
 * @create: 2019-07-24 13:33
 **/
public class LeatherShoes implements Shoes{


    @Override
    public void wear() {
        System.out.println("穿上皮质鞋子");
    }
}
