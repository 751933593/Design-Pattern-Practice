package abstract_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 皮质衣服
 * @author: liurunze
 * @create: 2019-07-24 13:33
 **/
public class LeatherClothes implements Clothes{


    @Override
    public void wear() {
        System.out.println("穿上皮质上衣");
    }
}
