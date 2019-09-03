package flyweight_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 不共享享元实现类
 * @author: liurunze
 * @create: 2019-07-18 15:08
 **/
public class UnsharedConcreteFlyweight extends Flyweight{


    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operation(String extrinsic) {
        System.out.println("不共享的："+extrinsic);
    }
}
